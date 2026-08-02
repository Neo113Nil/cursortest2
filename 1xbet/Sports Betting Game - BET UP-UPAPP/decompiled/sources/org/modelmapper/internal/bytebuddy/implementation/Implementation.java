package org.modelmapper.internal.bytebuddy.implementation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter;
import org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.RandomString;

/* loaded from: classes4.dex */
public interface Implementation extends InstrumentedType.Prepareable {

    public interface Composable extends Implementation {
        Composable andThen(Composable composable);

        Implementation andThen(Implementation implementation);
    }

    ByteCodeAppender appender(Target target);

    public interface SpecialMethodInvocation extends StackManipulation {
        MethodDescription getMethodDescription();

        TypeDescription getTypeDescription();

        public enum Illegal implements SpecialMethodInvocation {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Context context) {
                throw new IllegalStateException("Cannot implement an undefined method");
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public MethodDescription getMethodDescription() {
                throw new IllegalStateException("An illegal special method invocation must not be applied");
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public TypeDescription getTypeDescription() {
                throw new IllegalStateException("An illegal special method invocation must not be applied");
            }
        }

        public static abstract class AbstractBase implements SpecialMethodInvocation {
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return true;
            }

            public int hashCode() {
                return (getMethodDescription().asSignatureToken().hashCode() * 31) + getTypeDescription().hashCode();
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SpecialMethodInvocation)) {
                    return false;
                }
                SpecialMethodInvocation specialMethodInvocation = (SpecialMethodInvocation) obj;
                return getMethodDescription().asSignatureToken().equals(specialMethodInvocation.getMethodDescription().asSignatureToken()) && getTypeDescription().equals(specialMethodInvocation.getTypeDescription());
            }
        }

        public static class Simple extends AbstractBase {
            private final MethodDescription methodDescription;
            private final StackManipulation stackManipulation;
            private final TypeDescription typeDescription;

            protected Simple(MethodDescription methodDescription, TypeDescription typeDescription, StackManipulation stackManipulation) {
                this.methodDescription = methodDescription;
                this.typeDescription = typeDescription;
                this.stackManipulation = stackManipulation;
            }

            public static SpecialMethodInvocation of(MethodDescription methodDescription, TypeDescription typeDescription) {
                StackManipulation special = MethodInvocation.invoke(methodDescription).special(typeDescription);
                return special.isValid() ? new Simple(methodDescription, typeDescription, special) : Illegal.INSTANCE;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public MethodDescription getMethodDescription() {
                return this.methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public TypeDescription getTypeDescription() {
                return this.typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Context context) {
                return this.stackManipulation.apply(methodVisitor, context);
            }
        }
    }

    public interface Target {

        public interface Factory {
            Target make(TypeDescription typeDescription, MethodGraph.Linked linked, ClassFileVersion classFileVersion);
        }

        TypeDescription getInstrumentedType();

        TypeDefinition getOriginType();

        SpecialMethodInvocation invokeDefault(MethodDescription.SignatureToken signatureToken);

        SpecialMethodInvocation invokeDefault(MethodDescription.SignatureToken signatureToken, TypeDescription typeDescription);

        SpecialMethodInvocation invokeDominant(MethodDescription.SignatureToken signatureToken);

        SpecialMethodInvocation invokeSuper(MethodDescription.SignatureToken signatureToken);

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class AbstractBase implements Target {
            protected final DefaultMethodInvocation defaultMethodInvocation;
            protected final TypeDescription instrumentedType;
            protected final MethodGraph.Linked methodGraph;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                AbstractBase abstractBase = (AbstractBase) obj;
                return this.instrumentedType.equals(abstractBase.instrumentedType) && this.methodGraph.equals(abstractBase.methodGraph) && this.defaultMethodInvocation.equals(abstractBase.defaultMethodInvocation);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + this.methodGraph.hashCode()) * 31) + this.defaultMethodInvocation.hashCode();
            }

            protected AbstractBase(TypeDescription typeDescription, MethodGraph.Linked linked, DefaultMethodInvocation defaultMethodInvocation) {
                this.instrumentedType = typeDescription;
                this.methodGraph = linked;
                this.defaultMethodInvocation = defaultMethodInvocation;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target
            public TypeDescription getInstrumentedType() {
                return this.instrumentedType;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target
            public SpecialMethodInvocation invokeDefault(MethodDescription.SignatureToken signatureToken) {
                SpecialMethodInvocation specialMethodInvocation = SpecialMethodInvocation.Illegal.INSTANCE;
                Iterator it = this.instrumentedType.getInterfaces().asErasures().iterator();
                while (it.hasNext()) {
                    SpecialMethodInvocation invokeDefault = invokeDefault(signatureToken, (TypeDescription) it.next());
                    if (invokeDefault.isValid()) {
                        if (specialMethodInvocation.isValid()) {
                            return SpecialMethodInvocation.Illegal.INSTANCE;
                        }
                        specialMethodInvocation = invokeDefault;
                    }
                }
                return specialMethodInvocation;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target
            public SpecialMethodInvocation invokeDefault(MethodDescription.SignatureToken signatureToken, TypeDescription typeDescription) {
                return this.defaultMethodInvocation.apply(this.methodGraph.getInterfaceGraph(typeDescription).locate(signatureToken), typeDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target
            public SpecialMethodInvocation invokeDominant(MethodDescription.SignatureToken signatureToken) {
                SpecialMethodInvocation invokeSuper = invokeSuper(signatureToken);
                return invokeSuper.isValid() ? invokeSuper : invokeDefault(signatureToken);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public enum DefaultMethodInvocation {
                ENABLED { // from class: org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.1
                    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation
                    protected SpecialMethodInvocation apply(MethodGraph.Node node, TypeDescription typeDescription) {
                        return node.getSort().isUnique() ? SpecialMethodInvocation.Simple.of(node.getRepresentative(), typeDescription) : SpecialMethodInvocation.Illegal.INSTANCE;
                    }
                },
                DISABLED { // from class: org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.2
                    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation
                    protected SpecialMethodInvocation apply(MethodGraph.Node node, TypeDescription typeDescription) {
                        return SpecialMethodInvocation.Illegal.INSTANCE;
                    }
                };

                protected abstract SpecialMethodInvocation apply(MethodGraph.Node node, TypeDescription typeDescription);

                public static DefaultMethodInvocation of(ClassFileVersion classFileVersion) {
                    return classFileVersion.isAtLeast(ClassFileVersion.JAVA_V8) ? ENABLED : DISABLED;
                }
            }
        }
    }

    public interface Context extends MethodAccessorFactory {

        public interface Factory {
            ExtractableView make(TypeDescription typeDescription, AuxiliaryType.NamingStrategy namingStrategy, TypeInitializer typeInitializer, ClassFileVersion classFileVersion, ClassFileVersion classFileVersion2);
        }

        FieldDescription.InDefinedShape cache(StackManipulation stackManipulation, TypeDescription typeDescription);

        ClassFileVersion getClassFileVersion();

        TypeDescription getInstrumentedType();

        TypeDescription register(AuxiliaryType auxiliaryType);

        public interface ExtractableView extends Context {
            void drain(TypeInitializer.Drain drain, ClassVisitor classVisitor, AnnotationValueFilter.Factory factory);

            List<DynamicType> getAuxiliaryTypes();

            boolean isEnabled();

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class AbstractBase implements ExtractableView {
                protected final ClassFileVersion classFileVersion;
                protected final TypeDescription instrumentedType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AbstractBase abstractBase = (AbstractBase) obj;
                    return this.instrumentedType.equals(abstractBase.instrumentedType) && this.classFileVersion.equals(abstractBase.classFileVersion);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + this.classFileVersion.hashCode();
                }

                protected AbstractBase(TypeDescription typeDescription, ClassFileVersion classFileVersion) {
                    this.instrumentedType = typeDescription;
                    this.classFileVersion = classFileVersion;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context
                public TypeDescription getInstrumentedType() {
                    return this.instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context
                public ClassFileVersion getClassFileVersion() {
                    return this.classFileVersion;
                }
            }
        }

        public static class Disabled extends ExtractableView.AbstractBase {
            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.ExtractableView
            public boolean isEnabled() {
                return false;
            }

            protected Disabled(TypeDescription typeDescription, ClassFileVersion classFileVersion) {
                super(typeDescription, classFileVersion);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.ExtractableView
            public List<DynamicType> getAuxiliaryTypes() {
                return Collections.emptyList();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.ExtractableView
            public void drain(TypeInitializer.Drain drain, ClassVisitor classVisitor, AnnotationValueFilter.Factory factory) {
                drain.apply(classVisitor, TypeInitializer.None.INSTANCE, this);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context
            public TypeDescription register(AuxiliaryType auxiliaryType) {
                throw new IllegalStateException("Registration of auxiliary types was disabled: " + auxiliaryType);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory
            public MethodDescription.InDefinedShape registerAccessorFor(SpecialMethodInvocation specialMethodInvocation, MethodAccessorFactory.AccessType accessType) {
                throw new IllegalStateException("Registration of method accessors was disabled: " + specialMethodInvocation.getMethodDescription());
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory
            public MethodDescription.InDefinedShape registerGetterFor(FieldDescription fieldDescription, MethodAccessorFactory.AccessType accessType) {
                throw new IllegalStateException("Registration of field accessor was disabled: " + fieldDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory
            public MethodDescription.InDefinedShape registerSetterFor(FieldDescription fieldDescription, MethodAccessorFactory.AccessType accessType) {
                throw new IllegalStateException("Registration of field accessor was disabled: " + fieldDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context
            public FieldDescription.InDefinedShape cache(StackManipulation stackManipulation, TypeDescription typeDescription) {
                throw new IllegalStateException("Field values caching was disabled: " + typeDescription);
            }

            public enum Factory implements Factory {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Factory
                public ExtractableView make(TypeDescription typeDescription, AuxiliaryType.NamingStrategy namingStrategy, TypeInitializer typeInitializer, ClassFileVersion classFileVersion, ClassFileVersion classFileVersion2) {
                    if (typeInitializer.isDefined()) {
                        throw new IllegalStateException("Cannot define type initializer which was explicitly disabled: " + typeInitializer);
                    }
                    return new Disabled(typeDescription, classFileVersion);
                }
            }
        }

        public static class Default extends ExtractableView.AbstractBase {
            public static final String ACCESSOR_METHOD_SUFFIX = "accessor";
            public static final String FIELD_CACHE_PREFIX = "cachedValue";
            private final ClassFileVersion auxiliaryClassFileVersion;
            private final AuxiliaryType.NamingStrategy auxiliaryTypeNamingStrategy;
            private final Map<AuxiliaryType, DynamicType> auxiliaryTypes;
            private boolean fieldCacheCanAppendEntries;
            private final Map<SpecialMethodInvocation, DelegationRecord> registeredAccessorMethods;
            private final Map<FieldCacheEntry, FieldDescription.InDefinedShape> registeredFieldCacheEntries;
            private final Set<FieldDescription.InDefinedShape> registeredFieldCacheFields;
            private final Map<FieldDescription, DelegationRecord> registeredGetters;
            private final Map<FieldDescription, DelegationRecord> registeredSetters;
            private final String suffix;
            private final TypeInitializer typeInitializer;

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.ExtractableView
            public boolean isEnabled() {
                return true;
            }

            protected Default(TypeDescription typeDescription, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, TypeInitializer typeInitializer, ClassFileVersion classFileVersion2) {
                super(typeDescription, classFileVersion);
                this.auxiliaryTypeNamingStrategy = namingStrategy;
                this.typeInitializer = typeInitializer;
                this.auxiliaryClassFileVersion = classFileVersion2;
                this.registeredAccessorMethods = new HashMap();
                this.registeredGetters = new HashMap();
                this.registeredSetters = new HashMap();
                this.auxiliaryTypes = new HashMap();
                this.registeredFieldCacheEntries = new HashMap();
                this.registeredFieldCacheFields = new HashSet();
                this.suffix = RandomString.make();
                this.fieldCacheCanAppendEntries = true;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory
            public MethodDescription.InDefinedShape registerAccessorFor(SpecialMethodInvocation specialMethodInvocation, MethodAccessorFactory.AccessType accessType) {
                DelegationRecord with;
                DelegationRecord delegationRecord = this.registeredAccessorMethods.get(specialMethodInvocation);
                if (delegationRecord == null) {
                    with = new AccessorMethodDelegation(this.instrumentedType, this.suffix, accessType, specialMethodInvocation);
                } else {
                    with = delegationRecord.with(accessType);
                }
                this.registeredAccessorMethods.put(specialMethodInvocation, with);
                return with.getMethod();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory
            public MethodDescription.InDefinedShape registerGetterFor(FieldDescription fieldDescription, MethodAccessorFactory.AccessType accessType) {
                DelegationRecord with;
                DelegationRecord delegationRecord = this.registeredGetters.get(fieldDescription);
                if (delegationRecord == null) {
                    with = new FieldGetterDelegation(this.instrumentedType, this.suffix, accessType, fieldDescription);
                } else {
                    with = delegationRecord.with(accessType);
                }
                this.registeredGetters.put(fieldDescription, with);
                return with.getMethod();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory
            public MethodDescription.InDefinedShape registerSetterFor(FieldDescription fieldDescription, MethodAccessorFactory.AccessType accessType) {
                DelegationRecord with;
                DelegationRecord delegationRecord = this.registeredSetters.get(fieldDescription);
                if (delegationRecord == null) {
                    with = new FieldSetterDelegation(this.instrumentedType, this.suffix, accessType, fieldDescription);
                } else {
                    with = delegationRecord.with(accessType);
                }
                this.registeredSetters.put(fieldDescription, with);
                return with.getMethod();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context
            public TypeDescription register(AuxiliaryType auxiliaryType) {
                DynamicType dynamicType = this.auxiliaryTypes.get(auxiliaryType);
                if (dynamicType == null) {
                    dynamicType = auxiliaryType.make(this.auxiliaryTypeNamingStrategy.name(this.instrumentedType), this.auxiliaryClassFileVersion, this);
                    this.auxiliaryTypes.put(auxiliaryType, dynamicType);
                }
                return dynamicType.getTypeDescription();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.ExtractableView
            public List<DynamicType> getAuxiliaryTypes() {
                return new ArrayList(this.auxiliaryTypes.values());
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context
            public FieldDescription.InDefinedShape cache(StackManipulation stackManipulation, TypeDescription typeDescription) {
                FieldCacheEntry fieldCacheEntry = new FieldCacheEntry(stackManipulation, typeDescription);
                FieldDescription.InDefinedShape inDefinedShape = this.registeredFieldCacheEntries.get(fieldCacheEntry);
                if (inDefinedShape != null) {
                    return inDefinedShape;
                }
                if (!this.fieldCacheCanAppendEntries) {
                    throw new IllegalStateException("Cached values cannot be registered after defining the type initializer for " + this.instrumentedType);
                }
                int hashCode = stackManipulation.hashCode();
                while (true) {
                    int i = hashCode + 1;
                    CacheValueField cacheValueField = new CacheValueField(this.instrumentedType, typeDescription.asGenericType(), this.suffix, hashCode);
                    if (this.registeredFieldCacheFields.add(cacheValueField)) {
                        this.registeredFieldCacheEntries.put(fieldCacheEntry, cacheValueField);
                        return cacheValueField;
                    }
                    hashCode = i;
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.ExtractableView
            public void drain(TypeInitializer.Drain drain, ClassVisitor classVisitor, AnnotationValueFilter.Factory factory) {
                this.fieldCacheCanAppendEntries = false;
                TypeInitializer typeInitializer = this.typeInitializer;
                for (Map.Entry<FieldCacheEntry, FieldDescription.InDefinedShape> entry : this.registeredFieldCacheEntries.entrySet()) {
                    FieldVisitor visitField = classVisitor.visitField(entry.getValue().getModifiers(), entry.getValue().getInternalName(), entry.getValue().getDescriptor(), entry.getValue().getGenericSignature(), FieldDescription.NO_DEFAULT_VALUE);
                    if (visitField != null) {
                        visitField.visitEnd();
                        typeInitializer = typeInitializer.expandWith(entry.getKey().storeIn(entry.getValue()));
                    }
                }
                drain.apply(classVisitor, typeInitializer, this);
                Iterator<DelegationRecord> it = this.registeredAccessorMethods.values().iterator();
                while (it.hasNext()) {
                    it.next().apply(classVisitor, this, factory);
                }
                Iterator<DelegationRecord> it2 = this.registeredGetters.values().iterator();
                while (it2.hasNext()) {
                    it2.next().apply(classVisitor, this, factory);
                }
                Iterator<DelegationRecord> it3 = this.registeredSetters.values().iterator();
                while (it3.hasNext()) {
                    it3.next().apply(classVisitor, this, factory);
                }
            }

            protected static class CacheValueField extends FieldDescription.InDefinedShape.AbstractBase {
                private final TypeDescription.Generic fieldType;
                private final TypeDescription instrumentedType;
                private final String name;

                protected CacheValueField(TypeDescription typeDescription, TypeDescription.Generic generic, String str, int i) {
                    this.instrumentedType = typeDescription;
                    this.fieldType = generic;
                    this.name = "cachedValue$" + str + "$" + RandomString.hashOf(i);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.field.FieldDescription
                public TypeDescription.Generic getType() {
                    return this.fieldType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                public TypeDescription getDeclaringType() {
                    return this.instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                    return (this.instrumentedType.isInterface() ? 1 : 2) | 4120;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getName() {
                    return this.name;
                }
            }

            protected static class FieldCacheEntry implements StackManipulation {
                private final TypeDescription fieldType;
                private final StackManipulation fieldValue;

                protected FieldCacheEntry(StackManipulation stackManipulation, TypeDescription typeDescription) {
                    this.fieldValue = stackManipulation;
                    this.fieldType = typeDescription;
                }

                protected ByteCodeAppender storeIn(FieldDescription fieldDescription) {
                    return new ByteCodeAppender.Simple(this, FieldAccess.forField(fieldDescription).write());
                }

                protected TypeDescription getFieldType() {
                    return this.fieldType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
                public boolean isValid() {
                    return this.fieldValue.isValid();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
                public StackManipulation.Size apply(MethodVisitor methodVisitor, Context context) {
                    return this.fieldValue.apply(methodVisitor, context);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    FieldCacheEntry fieldCacheEntry = (FieldCacheEntry) obj;
                    return this.fieldValue.equals(fieldCacheEntry.fieldValue) && this.fieldType.equals(fieldCacheEntry.fieldType);
                }

                public int hashCode() {
                    return (this.fieldValue.hashCode() * 31) + this.fieldType.hashCode();
                }
            }

            protected static abstract class AbstractPropertyAccessorMethod extends MethodDescription.InDefinedShape.AbstractBase {
                protected abstract int getBaseModifiers();

                protected AbstractPropertyAccessorMethod() {
                }

                @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                    return getBaseModifiers() | 4096 | (getDeclaringType().isInterface() ? 1 : 16);
                }
            }

            protected static class AccessorMethod extends AbstractPropertyAccessorMethod {
                private final TypeDescription instrumentedType;
                private final MethodDescription methodDescription;
                private final String name;

                protected AccessorMethod(TypeDescription typeDescription, MethodDescription methodDescription, String str) {
                    this.instrumentedType = typeDescription;
                    this.methodDescription = methodDescription;
                    this.name = methodDescription.getInternalName() + "$accessor$" + str;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeDescription.Generic getReturnType() {
                    return this.methodDescription.getReturnType().asRawType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
                public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                    return new ParameterList.Explicit.ForTypes(this, this.methodDescription.getParameters().asTypeList().asRawTypes());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeList.Generic getExceptionTypes() {
                    return this.methodDescription.getExceptionTypes().asRawTypes();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public AnnotationValue<?, ?> getDefaultValue() {
                    return AnnotationValue.UNDEFINED;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
                public TypeList.Generic getTypeVariables() {
                    return new TypeList.Generic.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                public TypeDescription getDeclaringType() {
                    return this.instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.AbstractPropertyAccessorMethod
                public int getBaseModifiers() {
                    return this.methodDescription.isStatic() ? 8 : 0;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getInternalName() {
                    return this.name;
                }
            }

            protected static class FieldGetter extends AbstractPropertyAccessorMethod {
                private final FieldDescription fieldDescription;
                private final TypeDescription instrumentedType;
                private final String name;

                protected FieldGetter(TypeDescription typeDescription, FieldDescription fieldDescription, String str) {
                    this.instrumentedType = typeDescription;
                    this.fieldDescription = fieldDescription;
                    this.name = fieldDescription.getName() + "$accessor$" + str;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeDescription.Generic getReturnType() {
                    return this.fieldDescription.getType().asRawType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
                public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                    return new ParameterList.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeList.Generic getExceptionTypes() {
                    return new TypeList.Generic.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public AnnotationValue<?, ?> getDefaultValue() {
                    return AnnotationValue.UNDEFINED;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
                public TypeList.Generic getTypeVariables() {
                    return new TypeList.Generic.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                public TypeDescription getDeclaringType() {
                    return this.instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.AbstractPropertyAccessorMethod
                protected int getBaseModifiers() {
                    return this.fieldDescription.isStatic() ? 8 : 0;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getInternalName() {
                    return this.name;
                }
            }

            protected static class FieldSetter extends AbstractPropertyAccessorMethod {
                private final FieldDescription fieldDescription;
                private final TypeDescription instrumentedType;
                private final String name;

                protected FieldSetter(TypeDescription typeDescription, FieldDescription fieldDescription, String str) {
                    this.instrumentedType = typeDescription;
                    this.fieldDescription = fieldDescription;
                    this.name = fieldDescription.getName() + "$accessor$" + str;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeDescription.Generic getReturnType() {
                    return TypeDescription.Generic.VOID;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
                public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                    return new ParameterList.Explicit.ForTypes(this, (List<? extends TypeDefinition>) Collections.singletonList(this.fieldDescription.getType().asRawType()));
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeList.Generic getExceptionTypes() {
                    return new TypeList.Generic.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public AnnotationValue<?, ?> getDefaultValue() {
                    return AnnotationValue.UNDEFINED;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
                public TypeList.Generic getTypeVariables() {
                    return new TypeList.Generic.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                public TypeDescription getDeclaringType() {
                    return this.instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.AbstractPropertyAccessorMethod
                protected int getBaseModifiers() {
                    return this.fieldDescription.isStatic() ? 8 : 0;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getInternalName() {
                    return this.name;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static abstract class DelegationRecord extends TypeWriter.MethodPool.Record.ForDefinedMethod implements ByteCodeAppender {
                protected final MethodDescription.InDefinedShape methodDescription;
                protected final Visibility visibility;

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyAttributes(MethodVisitor methodVisitor, AnnotationValueFilter.Factory factory) {
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyHead(MethodVisitor methodVisitor) {
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    DelegationRecord delegationRecord = (DelegationRecord) obj;
                    return this.methodDescription.equals(delegationRecord.methodDescription) && this.visibility.equals(delegationRecord.visibility);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode()) * 31) + this.visibility.hashCode();
                }

                protected abstract DelegationRecord with(MethodAccessorFactory.AccessType accessType);

                protected DelegationRecord(MethodDescription.InDefinedShape inDefinedShape, Visibility visibility) {
                    this.methodDescription = inDefinedShape;
                    this.visibility = visibility;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public MethodDescription.InDefinedShape getMethod() {
                    return this.methodDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public TypeWriter.MethodPool.Record.Sort getSort() {
                    return TypeWriter.MethodPool.Record.Sort.IMPLEMENTED;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public Visibility getVisibility() {
                    return this.visibility;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyBody(MethodVisitor methodVisitor, Context context, AnnotationValueFilter.Factory factory) {
                    methodVisitor.visitCode();
                    ByteCodeAppender.Size applyCode = applyCode(methodVisitor, context);
                    methodVisitor.visitMaxs(applyCode.getOperandStackSize(), applyCode.getLocalVariableSize());
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public ByteCodeAppender.Size applyCode(MethodVisitor methodVisitor, Context context) {
                    return apply(methodVisitor, context, getMethod());
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public TypeWriter.MethodPool.Record prepend(ByteCodeAppender byteCodeAppender) {
                    throw new UnsupportedOperationException("Cannot prepend code to a delegation for " + this.methodDescription);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class AccessorMethodDelegation extends DelegationRecord {
                private final StackManipulation accessorMethodInvocation;

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.accessorMethodInvocation.equals(((AccessorMethodDelegation) obj).accessorMethodInvocation);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public int hashCode() {
                    return (super.hashCode() * 31) + this.accessorMethodInvocation.hashCode();
                }

                protected AccessorMethodDelegation(TypeDescription typeDescription, String str, MethodAccessorFactory.AccessType accessType, SpecialMethodInvocation specialMethodInvocation) {
                    this(new AccessorMethod(typeDescription, specialMethodInvocation.getMethodDescription(), str), accessType.getVisibility(), specialMethodInvocation);
                }

                private AccessorMethodDelegation(MethodDescription.InDefinedShape inDefinedShape, Visibility visibility, StackManipulation stackManipulation) {
                    super(inDefinedShape, visibility);
                    this.accessorMethodInvocation = stackManipulation;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                protected DelegationRecord with(MethodAccessorFactory.AccessType accessType) {
                    return new AccessorMethodDelegation(this.methodDescription, this.visibility.expandTo(accessType.getVisibility()), this.accessorMethodInvocation);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Context context, MethodDescription methodDescription) {
                    return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.allArgumentsOf(methodDescription).prependThisReference(), this.accessorMethodInvocation, MethodReturn.of(methodDescription.getReturnType())).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class FieldGetterDelegation extends DelegationRecord {
                private final FieldDescription fieldDescription;

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((FieldGetterDelegation) obj).fieldDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public int hashCode() {
                    return (super.hashCode() * 31) + this.fieldDescription.hashCode();
                }

                protected FieldGetterDelegation(TypeDescription typeDescription, String str, MethodAccessorFactory.AccessType accessType, FieldDescription fieldDescription) {
                    this(new FieldGetter(typeDescription, fieldDescription, str), accessType.getVisibility(), fieldDescription);
                }

                private FieldGetterDelegation(MethodDescription.InDefinedShape inDefinedShape, Visibility visibility, FieldDescription fieldDescription) {
                    super(inDefinedShape, visibility);
                    this.fieldDescription = fieldDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                protected DelegationRecord with(MethodAccessorFactory.AccessType accessType) {
                    return new FieldGetterDelegation(this.methodDescription, this.visibility.expandTo(accessType.getVisibility()), this.fieldDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Context context, MethodDescription methodDescription) {
                    StackManipulation[] stackManipulationArr = new StackManipulation[3];
                    stackManipulationArr[0] = this.fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                    stackManipulationArr[1] = FieldAccess.forField(this.fieldDescription).read();
                    stackManipulationArr[2] = MethodReturn.of(this.fieldDescription.getType());
                    return new ByteCodeAppender.Size(new StackManipulation.Compound(stackManipulationArr).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class FieldSetterDelegation extends DelegationRecord {
                private final FieldDescription fieldDescription;

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((FieldSetterDelegation) obj).fieldDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public int hashCode() {
                    return (super.hashCode() * 31) + this.fieldDescription.hashCode();
                }

                protected FieldSetterDelegation(TypeDescription typeDescription, String str, MethodAccessorFactory.AccessType accessType, FieldDescription fieldDescription) {
                    this(new FieldSetter(typeDescription, fieldDescription, str), accessType.getVisibility(), fieldDescription);
                }

                private FieldSetterDelegation(MethodDescription.InDefinedShape inDefinedShape, Visibility visibility, FieldDescription fieldDescription) {
                    super(inDefinedShape, visibility);
                    this.fieldDescription = fieldDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                protected DelegationRecord with(MethodAccessorFactory.AccessType accessType) {
                    return new FieldSetterDelegation(this.methodDescription, this.visibility.expandTo(accessType.getVisibility()), this.fieldDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Context context, MethodDescription methodDescription) {
                    return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.allArgumentsOf(methodDescription).prependThisReference(), FieldAccess.forField(this.fieldDescription).write(), MethodReturn.VOID).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                }
            }

            public enum Factory implements Factory {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Context.Factory
                public ExtractableView make(TypeDescription typeDescription, AuxiliaryType.NamingStrategy namingStrategy, TypeInitializer typeInitializer, ClassFileVersion classFileVersion, ClassFileVersion classFileVersion2) {
                    return new Default(typeDescription, classFileVersion, namingStrategy, typeInitializer, classFileVersion2);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements Implementation {
        private final List<Implementation> implementations;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.implementations.equals(((Compound) obj).implementations);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.implementations.hashCode();
        }

        public Compound(Implementation... implementationArr) {
            this((List<? extends Implementation>) Arrays.asList(implementationArr));
        }

        public Compound(List<? extends Implementation> list) {
            this.implementations = new ArrayList();
            for (Implementation implementation : list) {
                if (!(implementation instanceof Composable)) {
                    if (implementation instanceof Compound) {
                        this.implementations.addAll(((Compound) implementation).implementations);
                    } else {
                        this.implementations.add(implementation);
                    }
                } else {
                    Composable composable = (Composable) implementation;
                    this.implementations.addAll(composable.implementations);
                    this.implementations.add(composable.composable);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            Iterator<Implementation> it = this.implementations.iterator();
            while (it.hasNext()) {
                instrumentedType = it.next().prepare(instrumentedType);
            }
            return instrumentedType;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Target target) {
            ByteCodeAppender[] byteCodeAppenderArr = new ByteCodeAppender[this.implementations.size()];
            Iterator<Implementation> it = this.implementations.iterator();
            int i = 0;
            while (it.hasNext()) {
                byteCodeAppenderArr[i] = it.next().appender(target);
                i++;
            }
            return new ByteCodeAppender.Compound(byteCodeAppenderArr);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Composable implements Composable {
            private final Composable composable;
            private final List<Implementation> implementations;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Composable composable = (Composable) obj;
                return this.composable.equals(composable.composable) && this.implementations.equals(composable.implementations);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.composable.hashCode()) * 31) + this.implementations.hashCode();
            }

            public Composable(Implementation implementation, Composable composable) {
                this((List<? extends Implementation>) Collections.singletonList(implementation), composable);
            }

            public Composable(List<? extends Implementation> list, Composable composable) {
                this.implementations = new ArrayList();
                for (Implementation implementation : list) {
                    if (implementation instanceof Composable) {
                        Composable composable2 = (Composable) implementation;
                        this.implementations.addAll(composable2.implementations);
                        this.implementations.add(composable2.composable);
                    } else if (implementation instanceof Compound) {
                        this.implementations.addAll(((Compound) implementation).implementations);
                    } else {
                        this.implementations.add(implementation);
                    }
                }
                if (composable instanceof Composable) {
                    Composable composable3 = (Composable) composable;
                    this.implementations.addAll(composable3.implementations);
                    this.composable = composable3.composable;
                    return;
                }
                this.composable = composable;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                Iterator<Implementation> it = this.implementations.iterator();
                while (it.hasNext()) {
                    instrumentedType = it.next().prepare(instrumentedType);
                }
                return this.composable.prepare(instrumentedType);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
            public ByteCodeAppender appender(Target target) {
                ByteCodeAppender[] byteCodeAppenderArr = new ByteCodeAppender[this.implementations.size() + 1];
                Iterator<Implementation> it = this.implementations.iterator();
                int i = 0;
                while (it.hasNext()) {
                    byteCodeAppenderArr[i] = it.next().appender(target);
                    i++;
                }
                byteCodeAppenderArr[i] = this.composable.appender(target);
                return new ByteCodeAppender.Compound(byteCodeAppenderArr);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
            public Implementation andThen(Implementation implementation) {
                return new Compound((List<? extends Implementation>) CompoundList.of(this.implementations, this.composable.andThen(implementation)));
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
            public Composable andThen(Composable composable) {
                return new Composable(this.implementations, this.composable.andThen(composable));
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements Implementation {
        private final ByteCodeAppender byteCodeAppender;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.byteCodeAppender.equals(((Simple) obj).byteCodeAppender);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.byteCodeAppender.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        public Simple(ByteCodeAppender... byteCodeAppenderArr) {
            this.byteCodeAppender = new ByteCodeAppender.Compound(byteCodeAppenderArr);
        }

        public Simple(StackManipulation... stackManipulationArr) {
            this.byteCodeAppender = new ByteCodeAppender.Simple(stackManipulationArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Target target) {
            return this.byteCodeAppender;
        }
    }
}
