package org.modelmapper.internal.bytebuddy.dynamic.scaffold;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.ClassReader;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.ClassWriter;
import org.modelmapper.internal.asm.ConstantDynamic;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.Handle;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.asm.TypePath;
import org.modelmapper.internal.asm.commons.ClassRemapper;
import org.modelmapper.internal.asm.commons.Remapper;
import org.modelmapper.internal.asm.commons.SimpleRemapper;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationRetention;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter;
import org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender;
import org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender;
import org.modelmapper.internal.bytebuddy.implementation.attribute.TypeAttributeAppender;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DefaultValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;
import org.modelmapper.internal.bytebuddy.utility.privilege.GetSystemPropertyAction;
import org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor;

/* loaded from: classes4.dex */
public interface TypeWriter<T> {
    public static final String DUMP_PROPERTY = "org.modelmapper.internal.bytebuddy.dump";

    DynamicType.Unloaded<T> make(TypeResolutionStrategy.Resolved resolved);

    public interface FieldPool {
        Record target(FieldDescription fieldDescription);

        public interface Record {
            void apply(ClassVisitor classVisitor, AnnotationValueFilter.Factory factory);

            void apply(FieldVisitor fieldVisitor, AnnotationValueFilter.Factory factory);

            FieldDescription getField();

            FieldAttributeAppender getFieldAppender();

            boolean isImplicit();

            Object resolveDefault(Object obj);

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForImplicitField implements Record {
                private final FieldDescription fieldDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((ForImplicitField) obj).fieldDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public boolean isImplicit() {
                    return true;
                }

                public ForImplicitField(FieldDescription fieldDescription) {
                    this.fieldDescription = fieldDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public FieldDescription getField() {
                    return this.fieldDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public FieldAttributeAppender getFieldAppender() {
                    throw new IllegalStateException("An implicit field record does not expose a field appender: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public Object resolveDefault(Object obj) {
                    throw new IllegalStateException("An implicit field record does not expose a default value: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public void apply(ClassVisitor classVisitor, AnnotationValueFilter.Factory factory) {
                    FieldVisitor visitField = classVisitor.visitField(this.fieldDescription.getActualModifiers(), this.fieldDescription.getInternalName(), this.fieldDescription.getDescriptor(), this.fieldDescription.getGenericSignature(), FieldDescription.NO_DEFAULT_VALUE);
                    if (visitField != null) {
                        FieldAttributeAppender.ForInstrumentedField forInstrumentedField = FieldAttributeAppender.ForInstrumentedField.INSTANCE;
                        FieldDescription fieldDescription = this.fieldDescription;
                        forInstrumentedField.apply(visitField, fieldDescription, factory.on(fieldDescription));
                        visitField.visitEnd();
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public void apply(FieldVisitor fieldVisitor, AnnotationValueFilter.Factory factory) {
                    throw new IllegalStateException("An implicit field record is not intended for partial application: " + this);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForExplicitField implements Record {
                private final FieldAttributeAppender attributeAppender;
                private final Object defaultValue;
                private final FieldDescription fieldDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForExplicitField forExplicitField = (ForExplicitField) obj;
                    return this.attributeAppender.equals(forExplicitField.attributeAppender) && this.defaultValue.equals(forExplicitField.defaultValue) && this.fieldDescription.equals(forExplicitField.fieldDescription);
                }

                public int hashCode() {
                    return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.attributeAppender.hashCode()) * 31) + this.defaultValue.hashCode()) * 31) + this.fieldDescription.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public boolean isImplicit() {
                    return false;
                }

                public ForExplicitField(FieldAttributeAppender fieldAttributeAppender, Object obj, FieldDescription fieldDescription) {
                    this.attributeAppender = fieldAttributeAppender;
                    this.defaultValue = obj;
                    this.fieldDescription = fieldDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public FieldDescription getField() {
                    return this.fieldDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public FieldAttributeAppender getFieldAppender() {
                    return this.attributeAppender;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public Object resolveDefault(Object obj) {
                    Object obj2 = this.defaultValue;
                    return obj2 == null ? obj : obj2;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public void apply(ClassVisitor classVisitor, AnnotationValueFilter.Factory factory) {
                    FieldVisitor visitField = classVisitor.visitField(this.fieldDescription.getActualModifiers(), this.fieldDescription.getInternalName(), this.fieldDescription.getDescriptor(), this.fieldDescription.getGenericSignature(), resolveDefault(FieldDescription.NO_DEFAULT_VALUE));
                    if (visitField != null) {
                        FieldAttributeAppender fieldAttributeAppender = this.attributeAppender;
                        FieldDescription fieldDescription = this.fieldDescription;
                        fieldAttributeAppender.apply(visitField, fieldDescription, factory.on(fieldDescription));
                        visitField.visitEnd();
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public void apply(FieldVisitor fieldVisitor, AnnotationValueFilter.Factory factory) {
                    FieldAttributeAppender fieldAttributeAppender = this.attributeAppender;
                    FieldDescription fieldDescription = this.fieldDescription;
                    fieldAttributeAppender.apply(fieldVisitor, fieldDescription, factory.on(fieldDescription));
                }
            }
        }

        public enum Disabled implements FieldPool {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public Record target(FieldDescription fieldDescription) {
                throw new IllegalStateException("Cannot look up field from disabld pool");
            }
        }
    }

    public interface MethodPool {
        Record target(MethodDescription methodDescription);

        public interface Record {
            void apply(ClassVisitor classVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory);

            void applyAttributes(MethodVisitor methodVisitor, AnnotationValueFilter.Factory factory);

            void applyBody(MethodVisitor methodVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory);

            ByteCodeAppender.Size applyCode(MethodVisitor methodVisitor, Implementation.Context context);

            void applyHead(MethodVisitor methodVisitor);

            MethodDescription getMethod();

            Sort getSort();

            Visibility getVisibility();

            Record prepend(ByteCodeAppender byteCodeAppender);

            public enum Sort {
                SKIPPED(false, false),
                DEFINED(true, false),
                IMPLEMENTED(true, true);

                private final boolean define;
                private final boolean implement;

                Sort(boolean z, boolean z2) {
                    this.define = z;
                    this.implement = z2;
                }

                public boolean isDefined() {
                    return this.define;
                }

                public boolean isImplemented() {
                    return this.implement;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForNonImplementedMethod implements Record {
                private final MethodDescription methodDescription;

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void apply(ClassVisitor classVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory) {
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyAttributes(MethodVisitor methodVisitor, AnnotationValueFilter.Factory factory) {
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((ForNonImplementedMethod) obj).methodDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode();
                }

                public ForNonImplementedMethod(MethodDescription methodDescription) {
                    this.methodDescription = methodDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyBody(MethodVisitor methodVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory) {
                    throw new IllegalStateException("Cannot apply body for non-implemented method on " + this.methodDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public ByteCodeAppender.Size applyCode(MethodVisitor methodVisitor, Implementation.Context context) {
                    throw new IllegalStateException("Cannot apply code for non-implemented method on " + this.methodDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyHead(MethodVisitor methodVisitor) {
                    throw new IllegalStateException("Cannot apply head for non-implemented method on " + this.methodDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public MethodDescription getMethod() {
                    return this.methodDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public Visibility getVisibility() {
                    return this.methodDescription.getVisibility();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public Sort getSort() {
                    return Sort.SKIPPED;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public Record prepend(ByteCodeAppender byteCodeAppender) {
                    return new ForDefinedMethod.WithBody(this.methodDescription, new ByteCodeAppender.Compound(byteCodeAppender, new ByteCodeAppender.Simple(DefaultValue.of(this.methodDescription.getReturnType()), MethodReturn.of(this.methodDescription.getReturnType()))));
                }
            }

            public static abstract class ForDefinedMethod implements Record {
                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void apply(ClassVisitor classVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory) {
                    MethodVisitor visitMethod = classVisitor.visitMethod(getMethod().getActualModifiers(getSort().isImplemented(), getVisibility()), getMethod().getInternalName(), getMethod().getDescriptor(), getMethod().getGenericSignature(), getMethod().getExceptionTypes().asErasures().toInternalNames());
                    if (visitMethod != null) {
                        ParameterList<?> parameters = getMethod().getParameters();
                        if (parameters.hasExplicitMetaData()) {
                            Iterator it = parameters.iterator();
                            while (it.hasNext()) {
                                ParameterDescription parameterDescription = (ParameterDescription) it.next();
                                visitMethod.visitParameter(parameterDescription.getName(), parameterDescription.getModifiers());
                            }
                        }
                        applyHead(visitMethod);
                        applyBody(visitMethod, context, factory);
                        visitMethod.visitEnd();
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class WithBody extends ForDefinedMethod {
                    private final ByteCodeAppender byteCodeAppender;
                    private final MethodAttributeAppender methodAttributeAppender;
                    private final MethodDescription methodDescription;
                    private final Visibility visibility;

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
                        WithBody withBody = (WithBody) obj;
                        return this.methodDescription.equals(withBody.methodDescription) && this.byteCodeAppender.equals(withBody.byteCodeAppender) && this.methodAttributeAppender.equals(withBody.methodAttributeAppender) && this.visibility.equals(withBody.visibility);
                    }

                    public int hashCode() {
                        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode()) * 31) + this.byteCodeAppender.hashCode()) * 31) + this.methodAttributeAppender.hashCode()) * 31) + this.visibility.hashCode();
                    }

                    public WithBody(MethodDescription methodDescription, ByteCodeAppender byteCodeAppender) {
                        this(methodDescription, byteCodeAppender, MethodAttributeAppender.NoOp.INSTANCE, methodDescription.getVisibility());
                    }

                    public WithBody(MethodDescription methodDescription, ByteCodeAppender byteCodeAppender, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                        this.methodDescription = methodDescription;
                        this.byteCodeAppender = byteCodeAppender;
                        this.methodAttributeAppender = methodAttributeAppender;
                        this.visibility = visibility;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public MethodDescription getMethod() {
                        return this.methodDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Sort getSort() {
                        return Sort.IMPLEMENTED;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Visibility getVisibility() {
                        return this.visibility;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyBody(MethodVisitor methodVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory) {
                        applyAttributes(methodVisitor, factory);
                        methodVisitor.visitCode();
                        ByteCodeAppender.Size applyCode = applyCode(methodVisitor, context);
                        methodVisitor.visitMaxs(applyCode.getOperandStackSize(), applyCode.getLocalVariableSize());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyAttributes(MethodVisitor methodVisitor, AnnotationValueFilter.Factory factory) {
                        MethodAttributeAppender methodAttributeAppender = this.methodAttributeAppender;
                        MethodDescription methodDescription = this.methodDescription;
                        methodAttributeAppender.apply(methodVisitor, methodDescription, factory.on(methodDescription));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public ByteCodeAppender.Size applyCode(MethodVisitor methodVisitor, Implementation.Context context) {
                        return this.byteCodeAppender.apply(methodVisitor, context, this.methodDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Record prepend(ByteCodeAppender byteCodeAppender) {
                        return new WithBody(this.methodDescription, new ByteCodeAppender.Compound(byteCodeAppender, this.byteCodeAppender), this.methodAttributeAppender, this.visibility);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class WithoutBody extends ForDefinedMethod {
                    private final MethodAttributeAppender methodAttributeAppender;
                    private final MethodDescription methodDescription;
                    private final Visibility visibility;

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
                        WithoutBody withoutBody = (WithoutBody) obj;
                        return this.methodDescription.equals(withoutBody.methodDescription) && this.methodAttributeAppender.equals(withoutBody.methodAttributeAppender) && this.visibility.equals(withoutBody.visibility);
                    }

                    public int hashCode() {
                        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode()) * 31) + this.methodAttributeAppender.hashCode()) * 31) + this.visibility.hashCode();
                    }

                    public WithoutBody(MethodDescription methodDescription, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                        this.methodDescription = methodDescription;
                        this.methodAttributeAppender = methodAttributeAppender;
                        this.visibility = visibility;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public MethodDescription getMethod() {
                        return this.methodDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Sort getSort() {
                        return Sort.DEFINED;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Visibility getVisibility() {
                        return this.visibility;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyBody(MethodVisitor methodVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory) {
                        applyAttributes(methodVisitor, factory);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyAttributes(MethodVisitor methodVisitor, AnnotationValueFilter.Factory factory) {
                        MethodAttributeAppender methodAttributeAppender = this.methodAttributeAppender;
                        MethodDescription methodDescription = this.methodDescription;
                        methodAttributeAppender.apply(methodVisitor, methodDescription, factory.on(methodDescription));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public ByteCodeAppender.Size applyCode(MethodVisitor methodVisitor, Implementation.Context context) {
                        throw new IllegalStateException("Cannot apply code for abstract method on " + this.methodDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Record prepend(ByteCodeAppender byteCodeAppender) {
                        throw new IllegalStateException("Cannot prepend code for abstract method on " + this.methodDescription);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class WithAnnotationDefaultValue extends ForDefinedMethod {
                    private final AnnotationValue<?, ?> annotationValue;
                    private final MethodAttributeAppender methodAttributeAppender;
                    private final MethodDescription methodDescription;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        WithAnnotationDefaultValue withAnnotationDefaultValue = (WithAnnotationDefaultValue) obj;
                        return this.methodDescription.equals(withAnnotationDefaultValue.methodDescription) && this.annotationValue.equals(withAnnotationDefaultValue.annotationValue) && this.methodAttributeAppender.equals(withAnnotationDefaultValue.methodAttributeAppender);
                    }

                    public int hashCode() {
                        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode()) * 31) + this.annotationValue.hashCode()) * 31) + this.methodAttributeAppender.hashCode();
                    }

                    public WithAnnotationDefaultValue(MethodDescription methodDescription, AnnotationValue<?, ?> annotationValue, MethodAttributeAppender methodAttributeAppender) {
                        this.methodDescription = methodDescription;
                        this.annotationValue = annotationValue;
                        this.methodAttributeAppender = methodAttributeAppender;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public MethodDescription getMethod() {
                        return this.methodDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Sort getSort() {
                        return Sort.DEFINED;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Visibility getVisibility() {
                        return this.methodDescription.getVisibility();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyHead(MethodVisitor methodVisitor) {
                        if (!this.methodDescription.isDefaultValue(this.annotationValue)) {
                            throw new IllegalStateException("Cannot set " + this.annotationValue + " as default for " + this.methodDescription);
                        }
                        AnnotationVisitor visitAnnotationDefault = methodVisitor.visitAnnotationDefault();
                        AnnotationAppender.Default.apply(visitAnnotationDefault, this.methodDescription.getReturnType().asErasure(), AnnotationAppender.NO_NAME, this.annotationValue.resolve());
                        visitAnnotationDefault.visitEnd();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyBody(MethodVisitor methodVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory) {
                        MethodAttributeAppender methodAttributeAppender = this.methodAttributeAppender;
                        MethodDescription methodDescription = this.methodDescription;
                        methodAttributeAppender.apply(methodVisitor, methodDescription, factory.on(methodDescription));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyAttributes(MethodVisitor methodVisitor, AnnotationValueFilter.Factory factory) {
                        throw new IllegalStateException("Cannot apply attributes for default value on " + this.methodDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public ByteCodeAppender.Size applyCode(MethodVisitor methodVisitor, Implementation.Context context) {
                        throw new IllegalStateException("Cannot apply code for default value on " + this.methodDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Record prepend(ByteCodeAppender byteCodeAppender) {
                        throw new IllegalStateException("Cannot prepend code for default value on " + this.methodDescription);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class OfVisibilityBridge extends ForDefinedMethod implements ByteCodeAppender {
                    private final MethodAttributeAppender attributeAppender;
                    private final MethodDescription bridgeTarget;
                    private final TypeDescription bridgeType;
                    private final MethodDescription visibilityBridge;

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
                        OfVisibilityBridge ofVisibilityBridge = (OfVisibilityBridge) obj;
                        return this.visibilityBridge.equals(ofVisibilityBridge.visibilityBridge) && this.bridgeTarget.equals(ofVisibilityBridge.bridgeTarget) && this.bridgeType.equals(ofVisibilityBridge.bridgeType) && this.attributeAppender.equals(ofVisibilityBridge.attributeAppender);
                    }

                    public int hashCode() {
                        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.visibilityBridge.hashCode()) * 31) + this.bridgeTarget.hashCode()) * 31) + this.bridgeType.hashCode()) * 31) + this.attributeAppender.hashCode();
                    }

                    protected OfVisibilityBridge(MethodDescription methodDescription, MethodDescription methodDescription2, TypeDescription typeDescription, MethodAttributeAppender methodAttributeAppender) {
                        this.visibilityBridge = methodDescription;
                        this.bridgeTarget = methodDescription2;
                        this.bridgeType = typeDescription;
                        this.attributeAppender = methodAttributeAppender;
                    }

                    public static Record of(TypeDescription typeDescription, MethodDescription methodDescription, MethodAttributeAppender methodAttributeAppender) {
                        TypeDefinition typeDefinition = null;
                        if (methodDescription.isDefaultMethod()) {
                            TypeDescription asErasure = methodDescription.getDeclaringType().asErasure();
                            for (TypeDefinition typeDefinition2 : typeDescription.getInterfaces().asErasures().filter(ElementMatchers.isSubTypeOf(asErasure))) {
                                if (typeDefinition == null || asErasure.isAssignableTo(typeDefinition.asErasure())) {
                                    typeDefinition = typeDefinition2;
                                }
                            }
                        }
                        if (typeDefinition == null) {
                            typeDefinition = typeDescription.getSuperClass();
                        }
                        return new OfVisibilityBridge(new VisibilityBridge(typeDescription, methodDescription), methodDescription, typeDefinition.asErasure(), methodAttributeAppender);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public MethodDescription getMethod() {
                        return this.visibilityBridge;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Sort getSort() {
                        return Sort.IMPLEMENTED;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Visibility getVisibility() {
                        return this.bridgeTarget.getVisibility();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public Record prepend(ByteCodeAppender byteCodeAppender) {
                        return new WithBody(this.visibilityBridge, new ByteCodeAppender.Compound(this, byteCodeAppender), this.attributeAppender, this.bridgeTarget.getVisibility());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyBody(MethodVisitor methodVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory) {
                        applyAttributes(methodVisitor, factory);
                        methodVisitor.visitCode();
                        ByteCodeAppender.Size applyCode = applyCode(methodVisitor, context);
                        methodVisitor.visitMaxs(applyCode.getOperandStackSize(), applyCode.getLocalVariableSize());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyAttributes(MethodVisitor methodVisitor, AnnotationValueFilter.Factory factory) {
                        MethodAttributeAppender methodAttributeAppender = this.attributeAppender;
                        MethodDescription methodDescription = this.visibilityBridge;
                        methodAttributeAppender.apply(methodVisitor, methodDescription, factory.on(methodDescription));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public ByteCodeAppender.Size applyCode(MethodVisitor methodVisitor, Implementation.Context context) {
                        return apply(methodVisitor, context, this.visibilityBridge);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        return new ByteCodeAppender.Simple(MethodVariableAccess.allArgumentsOf(methodDescription).prependThisReference(), MethodInvocation.invoke(this.bridgeTarget).special(this.bridgeType), MethodReturn.of(methodDescription.getReturnType())).apply(methodVisitor, context, methodDescription);
                    }

                    protected static class VisibilityBridge extends MethodDescription.InDefinedShape.AbstractBase {
                        private final MethodDescription bridgeTarget;
                        private final TypeDescription instrumentedType;

                        protected VisibilityBridge(TypeDescription typeDescription, MethodDescription methodDescription) {
                            this.instrumentedType = typeDescription;
                            this.bridgeTarget = methodDescription;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                        public TypeDescription getDeclaringType() {
                            return this.instrumentedType;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
                        public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                            return new ParameterList.Explicit.ForTypes(this, this.bridgeTarget.getParameters().asTypeList().asRawTypes());
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                        public TypeDescription.Generic getReturnType() {
                            return this.bridgeTarget.getReturnType().asRawType();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                        public TypeList.Generic getExceptionTypes() {
                            return this.bridgeTarget.getExceptionTypes().asRawTypes();
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
                            return this.bridgeTarget.getDeclaredAnnotations();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                        public int getModifiers() {
                            return (this.bridgeTarget.getModifiers() | 4160) & (-257);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                        public String getInternalName() {
                            return this.bridgeTarget.getName();
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class AccessBridgeWrapper implements Record {
                private final MethodAttributeAppender attributeAppender;
                private final MethodDescription bridgeTarget;
                private final Set<MethodDescription.TypeToken> bridgeTypes;
                private final Record delegate;
                private final TypeDescription instrumentedType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AccessBridgeWrapper accessBridgeWrapper = (AccessBridgeWrapper) obj;
                    return this.delegate.equals(accessBridgeWrapper.delegate) && this.instrumentedType.equals(accessBridgeWrapper.instrumentedType) && this.bridgeTarget.equals(accessBridgeWrapper.bridgeTarget) && this.bridgeTypes.equals(accessBridgeWrapper.bridgeTypes) && this.attributeAppender.equals(accessBridgeWrapper.attributeAppender);
                }

                public int hashCode() {
                    return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.delegate.hashCode()) * 31) + this.instrumentedType.hashCode()) * 31) + this.bridgeTarget.hashCode()) * 31) + this.bridgeTypes.hashCode()) * 31) + this.attributeAppender.hashCode();
                }

                protected AccessBridgeWrapper(Record record, TypeDescription typeDescription, MethodDescription methodDescription, Set<MethodDescription.TypeToken> set, MethodAttributeAppender methodAttributeAppender) {
                    this.delegate = record;
                    this.instrumentedType = typeDescription;
                    this.bridgeTarget = methodDescription;
                    this.bridgeTypes = set;
                    this.attributeAppender = methodAttributeAppender;
                }

                public static Record of(Record record, TypeDescription typeDescription, MethodDescription methodDescription, Set<MethodDescription.TypeToken> set, MethodAttributeAppender methodAttributeAppender) {
                    HashSet hashSet = new HashSet();
                    for (MethodDescription.TypeToken typeToken : set) {
                        if (methodDescription.isBridgeCompatible(typeToken)) {
                            hashSet.add(typeToken);
                        }
                    }
                    return !hashSet.isEmpty() ? (!typeDescription.isInterface() || record.getSort().isImplemented()) ? new AccessBridgeWrapper(record, typeDescription, methodDescription, hashSet, methodAttributeAppender) : record : record;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public Sort getSort() {
                    return this.delegate.getSort();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public MethodDescription getMethod() {
                    return this.bridgeTarget;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public Visibility getVisibility() {
                    return this.delegate.getVisibility();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public Record prepend(ByteCodeAppender byteCodeAppender) {
                    return new AccessBridgeWrapper(this.delegate.prepend(byteCodeAppender), this.instrumentedType, this.bridgeTarget, this.bridgeTypes, this.attributeAppender);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void apply(ClassVisitor classVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory) {
                    this.delegate.apply(classVisitor, context, factory);
                    Iterator<MethodDescription.TypeToken> it = this.bridgeTypes.iterator();
                    while (it.hasNext()) {
                        AccessorBridge accessorBridge = new AccessorBridge(this.bridgeTarget, it.next(), this.instrumentedType);
                        BridgeTarget bridgeTarget = new BridgeTarget(this.bridgeTarget, this.instrumentedType);
                        MethodVisitor visitMethod = classVisitor.visitMethod(accessorBridge.getActualModifiers(true, getVisibility()), accessorBridge.getInternalName(), accessorBridge.getDescriptor(), MethodDescription.NON_GENERIC_SIGNATURE, accessorBridge.getExceptionTypes().asErasures().toInternalNames());
                        if (visitMethod != null) {
                            this.attributeAppender.apply(visitMethod, accessorBridge, factory.on(this.instrumentedType));
                            visitMethod.visitCode();
                            StackManipulation[] stackManipulationArr = new StackManipulation[4];
                            stackManipulationArr[0] = MethodVariableAccess.allArgumentsOf(accessorBridge).asBridgeOf(bridgeTarget).prependThisReference();
                            stackManipulationArr[1] = MethodInvocation.invoke((MethodDescription.InDefinedShape) bridgeTarget).virtual(this.instrumentedType);
                            stackManipulationArr[2] = bridgeTarget.getReturnType().asErasure().isAssignableTo(accessorBridge.getReturnType().asErasure()) ? StackManipulation.Trivial.INSTANCE : TypeCasting.to(accessorBridge.getReturnType().asErasure());
                            stackManipulationArr[3] = MethodReturn.of(accessorBridge.getReturnType());
                            ByteCodeAppender.Size apply = new ByteCodeAppender.Simple(stackManipulationArr).apply(visitMethod, context, accessorBridge);
                            visitMethod.visitMaxs(apply.getOperandStackSize(), apply.getLocalVariableSize());
                            visitMethod.visitEnd();
                        }
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyHead(MethodVisitor methodVisitor) {
                    this.delegate.applyHead(methodVisitor);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyBody(MethodVisitor methodVisitor, Implementation.Context context, AnnotationValueFilter.Factory factory) {
                    this.delegate.applyBody(methodVisitor, context, factory);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyAttributes(MethodVisitor methodVisitor, AnnotationValueFilter.Factory factory) {
                    this.delegate.applyAttributes(methodVisitor, factory);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public ByteCodeAppender.Size applyCode(MethodVisitor methodVisitor, Implementation.Context context) {
                    return this.delegate.applyCode(methodVisitor, context);
                }

                protected static class AccessorBridge extends MethodDescription.InDefinedShape.AbstractBase {
                    private final MethodDescription bridgeTarget;
                    private final MethodDescription.TypeToken bridgeType;
                    private final TypeDescription instrumentedType;

                    protected AccessorBridge(MethodDescription methodDescription, MethodDescription.TypeToken typeToken, TypeDescription typeDescription) {
                        this.bridgeTarget = methodDescription;
                        this.bridgeType = typeToken;
                        this.instrumentedType = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                    public TypeDescription getDeclaringType() {
                        return this.instrumentedType;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
                    public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                        return new ParameterList.Explicit.ForTypes(this, this.bridgeType.getParameterTypes());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                    public TypeDescription.Generic getReturnType() {
                        return this.bridgeType.getReturnType().asGenericType();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                    public TypeList.Generic getExceptionTypes() {
                        return this.bridgeTarget.getExceptionTypes().accept(TypeDescription.Generic.Visitor.TypeErasing.INSTANCE);
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

                    @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                    public int getModifiers() {
                        return (this.bridgeTarget.getModifiers() | 4160) & (-1281);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                    public String getInternalName() {
                        return this.bridgeTarget.getInternalName();
                    }
                }

                protected static class BridgeTarget extends MethodDescription.InDefinedShape.AbstractBase {
                    private final MethodDescription bridgeTarget;
                    private final TypeDescription instrumentedType;

                    protected BridgeTarget(MethodDescription methodDescription, TypeDescription typeDescription) {
                        this.bridgeTarget = methodDescription;
                        this.instrumentedType = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                    public TypeDescription getDeclaringType() {
                        return this.instrumentedType;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
                    public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                        return new ParameterList.ForTokens(this, this.bridgeTarget.getParameters().asTokenList(ElementMatchers.is(this.instrumentedType)));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                    public TypeDescription.Generic getReturnType() {
                        return this.bridgeTarget.getReturnType();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                    public TypeList.Generic getExceptionTypes() {
                        return this.bridgeTarget.getExceptionTypes();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                    public AnnotationValue<?, ?> getDefaultValue() {
                        return this.bridgeTarget.getDefaultValue();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
                    public TypeList.Generic getTypeVariables() {
                        return this.bridgeTarget.getTypeVariables();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                    public AnnotationList getDeclaredAnnotations() {
                        return this.bridgeTarget.getDeclaredAnnotations();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                    public int getModifiers() {
                        return this.bridgeTarget.getModifiers();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                    public String getInternalName() {
                        return this.bridgeTarget.getInternalName();
                    }
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class Default<S> implements TypeWriter<S> {
        protected static final String DUMP_FOLDER;
        private static final String NO_REFERENCE = null;
        protected final AnnotationRetention annotationRetention;
        protected final AnnotationValueFilter.Factory annotationValueFilterFactory;
        protected final AsmVisitorWrapper asmVisitorWrapper;
        protected final AuxiliaryType.NamingStrategy auxiliaryTypeNamingStrategy;
        protected final List<? extends DynamicType> auxiliaryTypes;
        protected final ClassFileVersion classFileVersion;
        protected final ClassWriterStrategy classWriterStrategy;
        protected final FieldPool fieldPool;
        protected final FieldList<FieldDescription.InDefinedShape> fields;
        protected final Implementation.Context.Factory implementationContextFactory;
        protected final MethodList<?> instrumentedMethods;
        protected final TypeDescription instrumentedType;
        protected final LoadedTypeInitializer loadedTypeInitializer;
        protected final MethodList<?> methods;
        protected final TypeAttributeAppender typeAttributeAppender;
        protected final TypeInitializer typeInitializer;
        protected final TypePool typePool;
        protected final TypeValidation typeValidation;

        protected abstract Default<S>.UnresolvedType create(TypeInitializer typeInitializer);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Default r5 = (Default) obj;
            return this.instrumentedType.equals(r5.instrumentedType) && this.classFileVersion.equals(r5.classFileVersion) && this.fieldPool.equals(r5.fieldPool) && this.auxiliaryTypes.equals(r5.auxiliaryTypes) && this.fields.equals(r5.fields) && this.methods.equals(r5.methods) && this.instrumentedMethods.equals(r5.instrumentedMethods) && this.loadedTypeInitializer.equals(r5.loadedTypeInitializer) && this.typeInitializer.equals(r5.typeInitializer) && this.typeAttributeAppender.equals(r5.typeAttributeAppender) && this.asmVisitorWrapper.equals(r5.asmVisitorWrapper) && this.annotationValueFilterFactory.equals(r5.annotationValueFilterFactory) && this.annotationRetention.equals(r5.annotationRetention) && this.auxiliaryTypeNamingStrategy.equals(r5.auxiliaryTypeNamingStrategy) && this.implementationContextFactory.equals(r5.implementationContextFactory) && this.typeValidation.equals(r5.typeValidation) && this.classWriterStrategy.equals(r5.classWriterStrategy) && this.typePool.equals(r5.typePool);
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + this.classFileVersion.hashCode()) * 31) + this.fieldPool.hashCode()) * 31) + this.auxiliaryTypes.hashCode()) * 31) + this.fields.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.instrumentedMethods.hashCode()) * 31) + this.loadedTypeInitializer.hashCode()) * 31) + this.typeInitializer.hashCode()) * 31) + this.typeAttributeAppender.hashCode()) * 31) + this.asmVisitorWrapper.hashCode()) * 31) + this.annotationValueFilterFactory.hashCode()) * 31) + this.annotationRetention.hashCode()) * 31) + this.auxiliaryTypeNamingStrategy.hashCode()) * 31) + this.implementationContextFactory.hashCode()) * 31) + this.typeValidation.hashCode()) * 31) + this.classWriterStrategy.hashCode()) * 31) + this.typePool.hashCode();
        }

        static {
            String str;
            try {
                str = (String) AccessController.doPrivileged(new GetSystemPropertyAction(TypeWriter.DUMP_PROPERTY));
            } catch (RuntimeException unused) {
                str = null;
            }
            DUMP_FOLDER = str;
        }

        protected Default(TypeDescription typeDescription, ClassFileVersion classFileVersion, FieldPool fieldPool, List<? extends DynamicType> list, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, MethodList<?> methodList2, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, AuxiliaryType.NamingStrategy namingStrategy, Implementation.Context.Factory factory2, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool) {
            this.instrumentedType = typeDescription;
            this.classFileVersion = classFileVersion;
            this.fieldPool = fieldPool;
            this.auxiliaryTypes = list;
            this.fields = fieldList;
            this.methods = methodList;
            this.instrumentedMethods = methodList2;
            this.loadedTypeInitializer = loadedTypeInitializer;
            this.typeInitializer = typeInitializer;
            this.typeAttributeAppender = typeAttributeAppender;
            this.asmVisitorWrapper = asmVisitorWrapper;
            this.auxiliaryTypeNamingStrategy = namingStrategy;
            this.annotationValueFilterFactory = factory;
            this.annotationRetention = annotationRetention;
            this.implementationContextFactory = factory2;
            this.typeValidation = typeValidation;
            this.classWriterStrategy = classWriterStrategy;
            this.typePool = typePool;
        }

        public static <U> TypeWriter<U> forCreation(MethodRegistry.Compiled compiled, List<? extends DynamicType> list, FieldPool fieldPool, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, AuxiliaryType.NamingStrategy namingStrategy, Implementation.Context.Factory factory2, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool) {
            return new ForCreation(compiled.getInstrumentedType(), classFileVersion, fieldPool, compiled, list, compiled.getInstrumentedType().getDeclaredFields(), compiled.getMethods(), compiled.getInstrumentedMethods(), compiled.getLoadedTypeInitializer(), compiled.getTypeInitializer(), typeAttributeAppender, asmVisitorWrapper, factory, annotationRetention, namingStrategy, factory2, typeValidation, classWriterStrategy, typePool);
        }

        public static <U> TypeWriter<U> forRedefinition(MethodRegistry.Prepared prepared, List<? extends DynamicType> list, FieldPool fieldPool, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, AuxiliaryType.NamingStrategy namingStrategy, Implementation.Context.Factory factory2, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
            return new ForInlining.WithFullProcessing(prepared.getInstrumentedType(), classFileVersion, fieldPool, list, prepared.getInstrumentedType().getDeclaredFields(), prepared.getMethods(), prepared.getInstrumentedMethods(), prepared.getLoadedTypeInitializer(), prepared.getTypeInitializer(), typeAttributeAppender, asmVisitorWrapper, factory, annotationRetention, namingStrategy, factory2, typeValidation, classWriterStrategy, typePool, typeDescription, classFileLocator, prepared, SubclassImplementationTarget.Factory.LEVEL_TYPE, MethodRebaseResolver.Disabled.INSTANCE);
        }

        public static <U> TypeWriter<U> forRebasing(MethodRegistry.Prepared prepared, List<? extends DynamicType> list, FieldPool fieldPool, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, AuxiliaryType.NamingStrategy namingStrategy, Implementation.Context.Factory factory2, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool, TypeDescription typeDescription, ClassFileLocator classFileLocator, MethodRebaseResolver methodRebaseResolver) {
            return new ForInlining.WithFullProcessing(prepared.getInstrumentedType(), classFileVersion, fieldPool, CompoundList.of((List) list, (List) methodRebaseResolver.getAuxiliaryTypes()), prepared.getInstrumentedType().getDeclaredFields(), prepared.getMethods(), prepared.getInstrumentedMethods(), prepared.getLoadedTypeInitializer(), prepared.getTypeInitializer(), typeAttributeAppender, asmVisitorWrapper, factory, annotationRetention, namingStrategy, factory2, typeValidation, classWriterStrategy, typePool, typeDescription, classFileLocator, prepared, new RebaseImplementationTarget.Factory(methodRebaseResolver), methodRebaseResolver);
        }

        public static <U> TypeWriter<U> forDecoration(TypeDescription typeDescription, ClassFileVersion classFileVersion, List<? extends DynamicType> list, List<? extends MethodDescription> list2, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, AuxiliaryType.NamingStrategy namingStrategy, Implementation.Context.Factory factory2, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool, ClassFileLocator classFileLocator) {
            return new ForInlining.WithDecorationOnly(typeDescription, classFileVersion, list, new MethodList.Explicit(list2), typeAttributeAppender, asmVisitorWrapper, factory, annotationRetention, namingStrategy, factory2, typeValidation, classWriterStrategy, typePool, classFileLocator);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter
        public DynamicType.Unloaded<S> make(TypeResolutionStrategy.Resolved resolved) {
            Default<S>.UnresolvedType create = create(resolved.injectedInto(this.typeInitializer));
            ClassDumpAction.dump(DUMP_FOLDER, this.instrumentedType, false, create.getBinaryRepresentation());
            return create.toDynamicType(resolved);
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class UnresolvedType {
            private final List<? extends DynamicType> auxiliaryTypes;
            private final byte[] binaryRepresentation;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                UnresolvedType unresolvedType = (UnresolvedType) obj;
                return Arrays.equals(this.binaryRepresentation, unresolvedType.binaryRepresentation) && this.auxiliaryTypes.equals(unresolvedType.auxiliaryTypes) && Default.this.equals(Default.this);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.binaryRepresentation)) * 31) + this.auxiliaryTypes.hashCode()) * 31) + Default.this.hashCode();
            }

            protected UnresolvedType(byte[] bArr, List<? extends DynamicType> list) {
                this.binaryRepresentation = bArr;
                this.auxiliaryTypes = list;
            }

            protected DynamicType.Unloaded<S> toDynamicType(TypeResolutionStrategy.Resolved resolved) {
                return new DynamicType.Default.Unloaded(Default.this.instrumentedType, this.binaryRepresentation, Default.this.loadedTypeInitializer, CompoundList.of((List) Default.this.auxiliaryTypes, (List) this.auxiliaryTypes), resolved);
            }

            protected byte[] getBinaryRepresentation() {
                return this.binaryRepresentation;
            }
        }

        protected static class ValidatingClassVisitor extends ClassVisitor {
            private static final FieldVisitor IGNORE_FIELD = null;
            private static final MethodVisitor IGNORE_METHOD = null;
            private static final String NO_PARAMETERS = "()";
            private static final String RETURNS_VOID = "V";
            private static final String STRING_DESCRIPTOR = "Ljava/lang/String;";
            private Constraint constraint;

            protected ValidatingClassVisitor(ClassVisitor classVisitor) {
                super(OpenedClassReader.ASM_API, classVisitor);
            }

            protected static ClassVisitor of(ClassVisitor classVisitor, TypeValidation typeValidation) {
                return typeValidation.isEnabled() ? new ValidatingClassVisitor(classVisitor) : classVisitor;
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
                ClassFileVersion ofMinorMajor = ClassFileVersion.ofMinorMajor(i);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Constraint.ForClassFileVersion(ofMinorMajor));
                if (str.endsWith("/package-info")) {
                    arrayList.add(Constraint.ForPackageType.INSTANCE);
                } else if ((i2 & 8192) != 0) {
                    if (!ofMinorMajor.isAtLeast(ClassFileVersion.JAVA_V5)) {
                        throw new IllegalStateException("Cannot define an annotation type for class file version " + ofMinorMajor);
                    }
                    arrayList.add(ofMinorMajor.isAtLeast(ClassFileVersion.JAVA_V8) ? Constraint.ForAnnotation.JAVA_8 : Constraint.ForAnnotation.CLASSIC);
                } else if ((i2 & 512) != 0) {
                    arrayList.add(ofMinorMajor.isAtLeast(ClassFileVersion.JAVA_V8) ? Constraint.ForInterface.JAVA_8 : Constraint.ForInterface.CLASSIC);
                } else if ((i2 & 1024) != 0) {
                    arrayList.add(Constraint.ForClass.ABSTRACT);
                } else {
                    arrayList.add(Constraint.ForClass.MANIFEST);
                }
                Constraint.Compound compound = new Constraint.Compound(arrayList);
                this.constraint = compound;
                compound.assertType(i2, strArr != null, str2 != null);
                super.visit(i, i2, str, str2, str3, strArr);
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public AnnotationVisitor visitAnnotation(String str, boolean z) {
                this.constraint.assertAnnotation();
                return super.visitAnnotation(str, z);
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                this.constraint.assertTypeAnnotation();
                return super.visitTypeAnnotation(i, typePath, str, z);
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public void visitNestHostExperimental(String str) {
                this.constraint.assertNestMate();
                super.visitNestHostExperimental(str);
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public void visitNestMemberExperimental(String str) {
                this.constraint.assertNestMate();
                super.visitNestMemberExperimental(str);
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
                Class cls;
                int i2;
                int i3;
                if (obj != null) {
                    char charAt = str2.charAt(0);
                    if (charAt != 'F') {
                        if (charAt != 'S' && charAt != 'Z' && charAt != 'I') {
                            if (charAt == 'J') {
                                cls = Long.class;
                            } else {
                                switch (charAt) {
                                    case 'B':
                                    case 'C':
                                        break;
                                    case 'D':
                                        cls = Double.class;
                                        break;
                                    default:
                                        if (!str2.equals(STRING_DESCRIPTOR)) {
                                            throw new IllegalStateException("Cannot define a default value for type of field " + str);
                                        }
                                        cls = String.class;
                                        break;
                                }
                            }
                        }
                        cls = Integer.class;
                    } else {
                        cls = Float.class;
                    }
                    if (!cls.isInstance(obj)) {
                        throw new IllegalStateException("Field " + str + " defines an incompatible default value " + obj);
                    }
                    if (cls == Integer.class) {
                        char charAt2 = str2.charAt(0);
                        if (charAt2 != 'B') {
                            if (charAt2 == 'C') {
                                i3 = 65535;
                            } else if (charAt2 == 'S') {
                                i2 = -32768;
                                i3 = 32767;
                            } else if (charAt2 != 'Z') {
                                i2 = Integer.MIN_VALUE;
                                i3 = Integer.MAX_VALUE;
                            } else {
                                i3 = 1;
                            }
                            i2 = 0;
                        } else {
                            i2 = -128;
                            i3 = 127;
                        }
                        int intValue = ((Integer) obj).intValue();
                        if (intValue < i2 || intValue > i3) {
                            throw new IllegalStateException("Field " + str + " defines an incompatible default value " + obj);
                        }
                    }
                }
                this.constraint.assertField(str, (i & 1) != 0, (i & 8) != 0, (i & 16) != 0, str3 != null);
                FieldVisitor visitField = super.visitField(i, str, str2, str3, obj);
                return visitField == null ? IGNORE_FIELD : new ValidatingFieldVisitor(visitField);
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
                this.constraint.assertMethod(str, (i & 1024) != 0, (i & 1) != 0, (i & 2) != 0, (i & 8) != 0, (str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME) || str.equals(MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME) || (i & 10) != 0) ? false : true, str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME), !str2.startsWith(NO_PARAMETERS) || str2.endsWith("V"), str3 != null);
                MethodVisitor visitMethod = super.visitMethod(i, str, str2, str3, strArr);
                return visitMethod == null ? IGNORE_METHOD : new ValidatingMethodVisitor(visitMethod, str);
            }

            protected interface Constraint {
                void assertAnnotation();

                void assertDefaultMethodCall();

                void assertDefaultValue(String str);

                void assertDynamicValueInConstantPool();

                void assertField(String str, boolean z, boolean z2, boolean z3, boolean z4);

                void assertHandleInConstantPool();

                void assertInvokeDynamic();

                void assertMethod(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8);

                void assertMethodTypeInConstantPool();

                void assertNestMate();

                void assertSubRoutine();

                void assertType(int i, boolean z, boolean z2);

                void assertTypeAnnotation();

                void assertTypeInConstantPool();

                public enum ForClass implements Constraint {
                    MANIFEST(true),
                    ABSTRACT(false);

                    private final boolean manifestType;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(String str, boolean z, boolean z2, boolean z3, boolean z4) {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int i, boolean z, boolean z2) {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                    }

                    ForClass(boolean z) {
                        this.manifestType = z;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
                        if (z && this.manifestType) {
                            throw new IllegalStateException("Cannot define abstract method '" + str + "' for non-abstract class");
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(String str) {
                        throw new IllegalStateException("Cannot define default value for '" + str + "' for non-annotation type");
                    }
                }

                public enum ForPackageType implements Constraint {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(String str) {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(String str, boolean z, boolean z2, boolean z3, boolean z4) {
                        throw new IllegalStateException("Cannot define a field for a package description type");
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
                        throw new IllegalStateException("Cannot define a method for a package description type");
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int i, boolean z, boolean z2) {
                        if (i != 5632) {
                            throw new IllegalStateException("A package description type must define 5632 as modifier");
                        }
                        if (z) {
                            throw new IllegalStateException("Cannot implement interface for package type");
                        }
                    }
                }

                public enum ForInterface implements Constraint {
                    CLASSIC(true),
                    JAVA_8(false);

                    private final boolean classic;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int i, boolean z, boolean z2) {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                    }

                    ForInterface(boolean z) {
                        this.classic = z;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(String str, boolean z, boolean z2, boolean z3, boolean z4) {
                        if (!z2 || !z || !z3) {
                            throw new IllegalStateException("Cannot only define public, static, final field '" + str + "' for interface type");
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
                        if (str.equals(MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME)) {
                            return;
                        }
                        if (z6) {
                            throw new IllegalStateException("Cannot define constructor for interface type");
                        }
                        boolean z9 = this.classic;
                        if (z9 && !z2) {
                            throw new IllegalStateException("Cannot define non-public method '" + str + "' for interface type");
                        }
                        if (z9 && !z5) {
                            throw new IllegalStateException("Cannot define non-virtual method '" + str + "' for a pre-Java 8 interface type");
                        }
                        if (z9 && !z) {
                            throw new IllegalStateException("Cannot define default method '" + str + "' for pre-Java 8 interface type");
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(String str) {
                        throw new IllegalStateException("Cannot define default value for '" + str + "' for non-annotation type");
                    }
                }

                public enum ForAnnotation implements Constraint {
                    CLASSIC(true),
                    JAVA_8(false);

                    private final boolean classic;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(String str) {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                    }

                    ForAnnotation(boolean z) {
                        this.classic = z;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(String str, boolean z, boolean z2, boolean z3, boolean z4) {
                        if (!z2 || !z || !z3) {
                            throw new IllegalStateException("Cannot only define public, static, final field '" + str + "' for interface type");
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
                        if (str.equals(MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME)) {
                            return;
                        }
                        if (z6) {
                            throw new IllegalStateException("Cannot define constructor for interface type");
                        }
                        if (this.classic && !z5) {
                            throw new IllegalStateException("Cannot define non-virtual method '" + str + "' for a pre-Java 8 annotation type");
                        }
                        if (!z4 && z7) {
                            throw new IllegalStateException("Cannot define method '" + str + "' with the given signature as an annotation type method");
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int i, boolean z, boolean z2) {
                        if ((i & 512) == 0) {
                            throw new IllegalStateException("Cannot define annotation type without interface modifier");
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForClassFileVersion implements Constraint {
                    private final ClassFileVersion classFileVersion;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(String str) {
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.classFileVersion.equals(((ForClassFileVersion) obj).classFileVersion);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classFileVersion.hashCode();
                    }

                    protected ForClassFileVersion(ClassFileVersion classFileVersion) {
                        this.classFileVersion = classFileVersion;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int i, boolean z, boolean z2) {
                        if ((i & 8192) != 0 && !this.classFileVersion.isAtLeast(ClassFileVersion.JAVA_V5)) {
                            throw new IllegalStateException("Cannot define annotation type for class file version " + this.classFileVersion);
                        }
                        if (z2 && !this.classFileVersion.isAtLeast(ClassFileVersion.JAVA_V5)) {
                            throw new IllegalStateException("Cannot define a generic type for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(String str, boolean z, boolean z2, boolean z3, boolean z4) {
                        if (z4 && !this.classFileVersion.isAtLeast(ClassFileVersion.JAVA_V5)) {
                            throw new IllegalStateException("Cannot define generic field '" + str + "' for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
                        if (z8 && !this.classFileVersion.isAtLeast(ClassFileVersion.JAVA_V5)) {
                            throw new IllegalStateException("Cannot define generic method '" + str + "' for class file version " + this.classFileVersion);
                        }
                        if (!z5 && z) {
                            throw new IllegalStateException("Cannot define static or non-virtual method '" + str + "' to be abstract");
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                        if (this.classFileVersion.isLessThan(ClassFileVersion.JAVA_V5)) {
                            throw new IllegalStateException("Cannot write annotations for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                        if (this.classFileVersion.isLessThan(ClassFileVersion.JAVA_V5)) {
                            throw new IllegalStateException("Cannot write type annotations for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                        if (this.classFileVersion.isLessThan(ClassFileVersion.JAVA_V8)) {
                            throw new IllegalStateException("Cannot invoke default method for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                        if (this.classFileVersion.isLessThan(ClassFileVersion.JAVA_V5)) {
                            throw new IllegalStateException("Cannot write type to constant pool for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                        if (this.classFileVersion.isLessThan(ClassFileVersion.JAVA_V7)) {
                            throw new IllegalStateException("Cannot write method type to constant pool for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                        if (this.classFileVersion.isLessThan(ClassFileVersion.JAVA_V7)) {
                            throw new IllegalStateException("Cannot write method handle to constant pool for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                        if (this.classFileVersion.isLessThan(ClassFileVersion.JAVA_V7)) {
                            throw new IllegalStateException("Cannot write invoke dynamic instruction for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                        if (this.classFileVersion.isGreaterThan(ClassFileVersion.JAVA_V5)) {
                            throw new IllegalStateException("Cannot write subroutine for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                        if (this.classFileVersion.isLessThan(ClassFileVersion.JAVA_V11)) {
                            throw new IllegalStateException("Cannot write dynamic constant for class file version " + this.classFileVersion);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                        if (this.classFileVersion.isLessThan(ClassFileVersion.JAVA_V11)) {
                            throw new IllegalStateException("Cannot define nest mate for class file version " + this.classFileVersion);
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Compound implements Constraint {
                    private final List<Constraint> constraints = new ArrayList();

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.constraints.equals(((Compound) obj).constraints);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.constraints.hashCode();
                    }

                    public Compound(List<? extends Constraint> list) {
                        for (Constraint constraint : list) {
                            if (constraint instanceof Compound) {
                                this.constraints.addAll(((Compound) constraint).constraints);
                            } else {
                                this.constraints.add(constraint);
                            }
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int i, boolean z, boolean z2) {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertType(i, z, z2);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(String str, boolean z, boolean z2, boolean z3, boolean z4) {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertField(str, z, z2, z3, z4);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertMethod(str, z, z2, z3, z4, z5, z6, z7, z8);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(String str) {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertDefaultValue(str);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertDefaultMethodCall();
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertAnnotation();
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertTypeAnnotation();
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertTypeInConstantPool();
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertMethodTypeInConstantPool();
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertHandleInConstantPool();
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertInvokeDynamic();
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertSubRoutine();
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertDynamicValueInConstantPool();
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                        Iterator<Constraint> it = this.constraints.iterator();
                        while (it.hasNext()) {
                            it.next().assertNestMate();
                        }
                    }
                }
            }

            protected class ValidatingFieldVisitor extends FieldVisitor {
                protected ValidatingFieldVisitor(FieldVisitor fieldVisitor) {
                    super(OpenedClassReader.ASM_API, fieldVisitor);
                }

                @Override // org.modelmapper.internal.asm.FieldVisitor
                public AnnotationVisitor visitAnnotation(String str, boolean z) {
                    ValidatingClassVisitor.this.constraint.assertAnnotation();
                    return super.visitAnnotation(str, z);
                }
            }

            protected class ValidatingMethodVisitor extends MethodVisitor {
                private final String name;

                protected ValidatingMethodVisitor(MethodVisitor methodVisitor, String str) {
                    super(OpenedClassReader.ASM_API, methodVisitor);
                    this.name = str;
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitAnnotation(String str, boolean z) {
                    ValidatingClassVisitor.this.constraint.assertAnnotation();
                    return super.visitAnnotation(str, z);
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitAnnotationDefault() {
                    ValidatingClassVisitor.this.constraint.assertDefaultValue(this.name);
                    return super.visitAnnotationDefault();
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitLdcInsn(Object obj) {
                    if (obj instanceof Type) {
                        switch (((Type) obj).getSort()) {
                            case 9:
                            case 10:
                                ValidatingClassVisitor.this.constraint.assertTypeInConstantPool();
                                break;
                            case 11:
                                ValidatingClassVisitor.this.constraint.assertMethodTypeInConstantPool();
                                break;
                        }
                    } else if (obj instanceof Handle) {
                        ValidatingClassVisitor.this.constraint.assertHandleInConstantPool();
                    } else if (obj instanceof ConstantDynamic) {
                        ValidatingClassVisitor.this.constraint.assertDynamicValueInConstantPool();
                    }
                    super.visitLdcInsn(obj);
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
                    if (z && i == 183) {
                        ValidatingClassVisitor.this.constraint.assertDefaultMethodCall();
                    }
                    super.visitMethodInsn(i, str, str2, str3, z);
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object[] objArr) {
                    ValidatingClassVisitor.this.constraint.assertInvokeDynamic();
                    for (Object obj : objArr) {
                        if (obj instanceof ConstantDynamic) {
                            ValidatingClassVisitor.this.constraint.assertDynamicValueInConstantPool();
                        }
                    }
                    super.visitInvokeDynamicInsn(str, str2, handle, objArr);
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitJumpInsn(int i, Label label) {
                    if (i == 168) {
                        ValidatingClassVisitor.this.constraint.assertSubRoutine();
                    }
                    super.visitJumpInsn(i, label);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForInlining<U> extends Default<U> {
            private static final AnnotationVisitor IGNORE_ANNOTATION = null;
            private static final FieldVisitor IGNORE_FIELD = null;
            private static final MethodVisitor IGNORE_METHOD = null;
            protected final ClassFileLocator classFileLocator;
            protected final TypeDescription originalType;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public boolean equals(Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForInlining forInlining = (ForInlining) obj;
                return this.originalType.equals(forInlining.originalType) && this.classFileLocator.equals(forInlining.classFileLocator);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public int hashCode() {
                return (((super.hashCode() * 31) + this.originalType.hashCode()) * 31) + this.classFileLocator.hashCode();
            }

            protected abstract ClassVisitor writeTo(ClassVisitor classVisitor, TypeInitializer typeInitializer, ContextRegistry contextRegistry, int i, int i2);

            protected ForInlining(TypeDescription typeDescription, ClassFileVersion classFileVersion, FieldPool fieldPool, List<? extends DynamicType> list, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, MethodList<?> methodList2, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, AuxiliaryType.NamingStrategy namingStrategy, Implementation.Context.Factory factory2, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool, TypeDescription typeDescription2, ClassFileLocator classFileLocator) {
                super(typeDescription, classFileVersion, fieldPool, list, fieldList, methodList, methodList2, loadedTypeInitializer, typeInitializer, typeAttributeAppender, asmVisitorWrapper, factory, annotationRetention, namingStrategy, factory2, typeValidation, classWriterStrategy, typePool);
                this.originalType = typeDescription2;
                this.classFileLocator = classFileLocator;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default
            protected Default<U>.UnresolvedType create(TypeInitializer typeInitializer) {
                try {
                    int mergeWriter = this.asmVisitorWrapper.mergeWriter(0);
                    int mergeReader = this.asmVisitorWrapper.mergeReader(0);
                    byte[] resolve = this.classFileLocator.locate(this.originalType.getName()).resolve();
                    ClassDumpAction.dump(DUMP_FOLDER, this.instrumentedType, true, resolve);
                    ClassReader of = OpenedClassReader.of(resolve);
                    ClassWriter resolve2 = this.classWriterStrategy.resolve(mergeWriter, this.typePool, of);
                    ContextRegistry contextRegistry = new ContextRegistry();
                    of.accept(writeTo(ValidatingClassVisitor.of(resolve2, this.typeValidation), typeInitializer, contextRegistry, mergeWriter, mergeReader), mergeReader);
                    return new UnresolvedType(resolve2.toByteArray(), contextRegistry.getAuxiliaryTypes());
                } catch (IOException e) {
                    throw new RuntimeException("The class file could not be written", e);
                }
            }

            protected static class ContextRegistry {
                private Implementation.Context.ExtractableView implementationContext;

                protected ContextRegistry() {
                }

                public void setImplementationContext(Implementation.Context.ExtractableView extractableView) {
                    this.implementationContext = extractableView;
                }

                public List<DynamicType> getAuxiliaryTypes() {
                    return this.implementationContext.getAuxiliaryTypes();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class WithFullProcessing<V> extends ForInlining<V> {
                private final Implementation.Target.Factory implementationTargetFactory;
                private final MethodRebaseResolver methodRebaseResolver;
                private final MethodRegistry.Prepared methodRegistry;

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining, org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    WithFullProcessing withFullProcessing = (WithFullProcessing) obj;
                    return this.methodRegistry.equals(withFullProcessing.methodRegistry) && this.implementationTargetFactory.equals(withFullProcessing.implementationTargetFactory) && this.methodRebaseResolver.equals(withFullProcessing.methodRebaseResolver);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining, org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default
                public int hashCode() {
                    return (((((super.hashCode() * 31) + this.methodRegistry.hashCode()) * 31) + this.implementationTargetFactory.hashCode()) * 31) + this.methodRebaseResolver.hashCode();
                }

                protected WithFullProcessing(TypeDescription typeDescription, ClassFileVersion classFileVersion, FieldPool fieldPool, List<? extends DynamicType> list, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, MethodList<?> methodList2, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, AuxiliaryType.NamingStrategy namingStrategy, Implementation.Context.Factory factory2, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool, TypeDescription typeDescription2, ClassFileLocator classFileLocator, MethodRegistry.Prepared prepared, Implementation.Target.Factory factory3, MethodRebaseResolver methodRebaseResolver) {
                    super(typeDescription, classFileVersion, fieldPool, list, fieldList, methodList, methodList2, loadedTypeInitializer, typeInitializer, typeAttributeAppender, asmVisitorWrapper, factory, annotationRetention, namingStrategy, factory2, typeValidation, classWriterStrategy, typePool, typeDescription2, classFileLocator);
                    this.methodRegistry = prepared;
                    this.implementationTargetFactory = factory3;
                    this.methodRebaseResolver = methodRebaseResolver;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining
                protected ClassVisitor writeTo(ClassVisitor classVisitor, TypeInitializer typeInitializer, ContextRegistry contextRegistry, int i, int i2) {
                    RedefinitionClassVisitor redefinitionClassVisitor = new RedefinitionClassVisitor(classVisitor, typeInitializer, contextRegistry, i, i2);
                    return this.originalType.getName().equals(this.instrumentedType.getName()) ? redefinitionClassVisitor : new OpenedClassRemapper(redefinitionClassVisitor, new SimpleRemapper(this.originalType.getInternalName(), this.instrumentedType.getInternalName()));
                }

                protected static class OpenedClassRemapper extends ClassRemapper {
                    protected OpenedClassRemapper(ClassVisitor classVisitor, Remapper remapper) {
                        super(OpenedClassReader.ASM_API, classVisitor, remapper);
                    }
                }

                protected interface InitializationHandler {
                    void complete(ClassVisitor classVisitor, Implementation.Context.ExtractableView extractableView);

                    public static class Creating extends TypeInitializer.Drain.Default implements InitializationHandler {
                        protected Creating(TypeDescription typeDescription, MethodPool methodPool, AnnotationValueFilter.Factory factory) {
                            super(typeDescription, methodPool, factory);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler
                        public void complete(ClassVisitor classVisitor, Implementation.Context.ExtractableView extractableView) {
                            extractableView.drain(this, classVisitor, this.annotationValueFilterFactory);
                        }
                    }

                    public static abstract class Appending extends MethodVisitor implements InitializationHandler, TypeInitializer.Drain {
                        protected final AnnotationValueFilter.Factory annotationValueFilterFactory;
                        protected final FrameWriter frameWriter;
                        protected final TypeDescription instrumentedType;
                        protected int localVariableLength;
                        protected final MethodPool.Record record;
                        protected int stackSize;

                        protected abstract void onComplete(Implementation.Context context);

                        protected abstract void onEnd();

                        protected abstract void onStart();

                        protected Appending(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.Factory factory, boolean z, boolean z2) {
                            super(OpenedClassReader.ASM_API, methodVisitor);
                            this.instrumentedType = typeDescription;
                            this.record = record;
                            this.annotationValueFilterFactory = factory;
                            if (!z) {
                                this.frameWriter = FrameWriter.NoOp.INSTANCE;
                            } else if (z2) {
                                this.frameWriter = FrameWriter.Expanding.INSTANCE;
                            } else {
                                this.frameWriter = new FrameWriter.Active();
                            }
                        }

                        protected static InitializationHandler of(boolean z, MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool methodPool, AnnotationValueFilter.Factory factory, boolean z2, boolean z3) {
                            if (z) {
                                return withDrain(methodVisitor, typeDescription, methodPool, factory, z2, z3);
                            }
                            return withoutDrain(methodVisitor, typeDescription, methodPool, factory, z2, z3);
                        }

                        private static WithDrain withDrain(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool methodPool, AnnotationValueFilter.Factory factory, boolean z, boolean z2) {
                            MethodPool.Record target = methodPool.target(new MethodDescription.Latent.TypeInitializer(typeDescription));
                            return target.getSort().isImplemented() ? new WithDrain.WithActiveRecord(methodVisitor, typeDescription, target, factory, z, z2) : new WithDrain.WithoutActiveRecord(methodVisitor, typeDescription, target, factory, z, z2);
                        }

                        private static WithoutDrain withoutDrain(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool methodPool, AnnotationValueFilter.Factory factory, boolean z, boolean z2) {
                            MethodPool.Record target = methodPool.target(new MethodDescription.Latent.TypeInitializer(typeDescription));
                            return target.getSort().isImplemented() ? new WithoutDrain.WithActiveRecord(methodVisitor, typeDescription, target, factory, z, z2) : new WithoutDrain.WithoutActiveRecord(methodVisitor, typeDescription, target, factory);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitCode() {
                            this.record.applyAttributes(this.mv, this.annotationValueFilterFactory);
                            super.visitCode();
                            onStart();
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
                            super.visitFrame(i, i2, objArr, i3, objArr2);
                            this.frameWriter.onFrame(i, i2);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitMaxs(int i, int i2) {
                            this.stackSize = i;
                            this.localVariableLength = i2;
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitEnd() {
                            onEnd();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer.Drain
                        public void apply(ClassVisitor classVisitor, TypeInitializer typeInitializer, Implementation.Context context) {
                            ByteCodeAppender.Size apply = typeInitializer.apply(this.mv, context, new MethodDescription.Latent.TypeInitializer(this.instrumentedType));
                            this.stackSize = Math.max(this.stackSize, apply.getOperandStackSize());
                            this.localVariableLength = Math.max(this.localVariableLength, apply.getLocalVariableSize());
                            onComplete(context);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler
                        public void complete(ClassVisitor classVisitor, Implementation.Context.ExtractableView extractableView) {
                            extractableView.drain(this, classVisitor, this.annotationValueFilterFactory);
                            this.mv.visitMaxs(this.stackSize, this.localVariableLength);
                            this.mv.visitEnd();
                        }

                        protected interface FrameWriter {
                            public static final Object[] EMPTY = new Object[0];

                            public enum NoOp implements FrameWriter {
                                INSTANCE;

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void emitFrame(MethodVisitor methodVisitor) {
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void onFrame(int i, int i2) {
                                }
                            }

                            void emitFrame(MethodVisitor methodVisitor);

                            void onFrame(int i, int i2);

                            public enum Expanding implements FrameWriter {
                                INSTANCE;

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void onFrame(int i, int i2) {
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void emitFrame(MethodVisitor methodVisitor) {
                                    methodVisitor.visitFrame(-1, EMPTY.length, EMPTY, EMPTY.length, EMPTY);
                                }
                            }

                            public static class Active implements FrameWriter {
                                private int currentLocalVariableLength;

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void onFrame(int i, int i2) {
                                    if (i == -1 || i == 0) {
                                        this.currentLocalVariableLength = i2;
                                        return;
                                    }
                                    if (i == 1) {
                                        this.currentLocalVariableLength += i2;
                                    } else if (i == 2) {
                                        this.currentLocalVariableLength -= i2;
                                    } else if (i != 3 && i != 4) {
                                        throw new IllegalStateException("Unexpected frame type: " + i);
                                    }
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void emitFrame(MethodVisitor methodVisitor) {
                                    int i = this.currentLocalVariableLength;
                                    if (i == 0) {
                                        methodVisitor.visitFrame(3, EMPTY.length, EMPTY, EMPTY.length, EMPTY);
                                    } else if (i > 3) {
                                        methodVisitor.visitFrame(0, EMPTY.length, EMPTY, EMPTY.length, EMPTY);
                                    } else {
                                        methodVisitor.visitFrame(2, i, EMPTY, EMPTY.length, EMPTY);
                                    }
                                    this.currentLocalVariableLength = 0;
                                }
                            }
                        }

                        protected static abstract class WithoutDrain extends Appending {
                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            protected void onEnd() {
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            protected void onStart() {
                            }

                            protected WithoutDrain(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.Factory factory, boolean z, boolean z2) {
                                super(methodVisitor, typeDescription, record, factory, z, z2);
                            }

                            protected static class WithoutActiveRecord extends WithoutDrain {
                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                                protected void onComplete(Implementation.Context context) {
                                }

                                protected WithoutActiveRecord(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.Factory factory) {
                                    super(methodVisitor, typeDescription, record, factory, false, false);
                                }
                            }

                            protected static class WithActiveRecord extends WithoutDrain {
                                private final Label label;

                                protected WithActiveRecord(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.Factory factory, boolean z, boolean z2) {
                                    super(methodVisitor, typeDescription, record, factory, z, z2);
                                    this.label = new Label();
                                }

                                @Override // org.modelmapper.internal.asm.MethodVisitor
                                public void visitInsn(int i) {
                                    if (i == 177) {
                                        this.mv.visitJumpInsn(Opcodes.GOTO, this.label);
                                    } else {
                                        super.visitInsn(i);
                                    }
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                                protected void onComplete(Implementation.Context context) {
                                    this.mv.visitLabel(this.label);
                                    this.frameWriter.emitFrame(this.mv);
                                    ByteCodeAppender.Size applyCode = this.record.applyCode(this.mv, context);
                                    this.stackSize = Math.max(this.stackSize, applyCode.getOperandStackSize());
                                    this.localVariableLength = Math.max(this.localVariableLength, applyCode.getLocalVariableSize());
                                }
                            }
                        }

                        protected static abstract class WithDrain extends Appending {
                            protected final Label appended;
                            protected final Label original;

                            protected abstract void afterComplete(Implementation.Context context);

                            protected WithDrain(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.Factory factory, boolean z, boolean z2) {
                                super(methodVisitor, typeDescription, record, factory, z, z2);
                                this.appended = new Label();
                                this.original = new Label();
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            protected void onStart() {
                                this.mv.visitJumpInsn(Opcodes.GOTO, this.appended);
                                this.mv.visitLabel(this.original);
                                this.frameWriter.emitFrame(this.mv);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            protected void onEnd() {
                                this.mv.visitLabel(this.appended);
                                this.frameWriter.emitFrame(this.mv);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            protected void onComplete(Implementation.Context context) {
                                this.mv.visitJumpInsn(Opcodes.GOTO, this.original);
                                afterComplete(context);
                            }

                            protected static class WithoutActiveRecord extends WithDrain {
                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithDrain
                                protected void afterComplete(Implementation.Context context) {
                                }

                                protected WithoutActiveRecord(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.Factory factory, boolean z, boolean z2) {
                                    super(methodVisitor, typeDescription, record, factory, z, z2);
                                }
                            }

                            protected static class WithActiveRecord extends WithDrain {
                                private final Label label;

                                protected WithActiveRecord(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.Factory factory, boolean z, boolean z2) {
                                    super(methodVisitor, typeDescription, record, factory, z, z2);
                                    this.label = new Label();
                                }

                                @Override // org.modelmapper.internal.asm.MethodVisitor
                                public void visitInsn(int i) {
                                    if (i == 177) {
                                        this.mv.visitJumpInsn(Opcodes.GOTO, this.label);
                                    } else {
                                        super.visitInsn(i);
                                    }
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithDrain
                                protected void afterComplete(Implementation.Context context) {
                                    this.mv.visitLabel(this.label);
                                    this.frameWriter.emitFrame(this.mv);
                                    ByteCodeAppender.Size applyCode = this.record.applyCode(this.mv, context);
                                    this.stackSize = Math.max(this.stackSize, applyCode.getOperandStackSize());
                                    this.localVariableLength = Math.max(this.localVariableLength, applyCode.getLocalVariableSize());
                                }
                            }
                        }
                    }
                }

                protected class RedefinitionClassVisitor extends MetadataAwareClassVisitor {
                    private final ContextRegistry contextRegistry;
                    private final LinkedHashMap<String, FieldDescription> declarableFields;
                    private final LinkedHashMap<String, MethodDescription> declarableMethods;
                    private final LinkedHashMap<String, TypeDescription> declaredTypes;
                    private Implementation.Context.ExtractableView implementationContext;
                    private InitializationHandler initializationHandler;
                    private MethodPool methodPool;
                    private final Set<String> nestMembers;
                    private final int readerFlags;
                    private boolean retainDeprecationModifiers;
                    private final TypeInitializer typeInitializer;
                    private final int writerFlags;

                    protected RedefinitionClassVisitor(ClassVisitor classVisitor, TypeInitializer typeInitializer, ContextRegistry contextRegistry, int i, int i2) {
                        super(OpenedClassReader.ASM_API, classVisitor);
                        this.typeInitializer = typeInitializer;
                        this.contextRegistry = contextRegistry;
                        this.writerFlags = i;
                        this.readerFlags = i2;
                        this.declarableFields = new LinkedHashMap<>();
                        for (FieldDescription fieldDescription : WithFullProcessing.this.fields) {
                            this.declarableFields.put(fieldDescription.getInternalName() + fieldDescription.getDescriptor(), fieldDescription);
                        }
                        this.declarableMethods = new LinkedHashMap<>();
                        Iterator it = WithFullProcessing.this.instrumentedMethods.iterator();
                        while (it.hasNext()) {
                            MethodDescription methodDescription = (MethodDescription) it.next();
                            this.declarableMethods.put(methodDescription.getInternalName() + methodDescription.getDescriptor(), methodDescription);
                        }
                        if (WithFullProcessing.this.instrumentedType.isNestHost()) {
                            this.nestMembers = new LinkedHashSet();
                            Iterator it2 = WithFullProcessing.this.instrumentedType.getNestMembers().filter(ElementMatchers.not(ElementMatchers.is(WithFullProcessing.this.instrumentedType))).iterator();
                            while (it2.hasNext()) {
                                this.nestMembers.add(((TypeDescription) it2.next()).getInternalName());
                            }
                        } else {
                            this.nestMembers = Collections.emptySet();
                        }
                        this.declaredTypes = new LinkedHashMap<>();
                        for (TypeDescription typeDescription : WithFullProcessing.this.instrumentedType.getDeclaredTypes()) {
                            this.declaredTypes.put(typeDescription.getInternalName(), typeDescription);
                        }
                    }

                    @Override // org.modelmapper.internal.asm.ClassVisitor
                    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
                        String internalName;
                        ClassFileVersion ofMinorMajor = ClassFileVersion.ofMinorMajor(i);
                        this.methodPool = WithFullProcessing.this.methodRegistry.compile(WithFullProcessing.this.implementationTargetFactory, ofMinorMajor);
                        this.initializationHandler = new InitializationHandler.Creating(WithFullProcessing.this.instrumentedType, this.methodPool, WithFullProcessing.this.annotationValueFilterFactory);
                        this.implementationContext = WithFullProcessing.this.implementationContextFactory.make(WithFullProcessing.this.instrumentedType, WithFullProcessing.this.auxiliaryTypeNamingStrategy, this.typeInitializer, ofMinorMajor, WithFullProcessing.this.classFileVersion);
                        this.retainDeprecationModifiers = ofMinorMajor.isLessThan(ClassFileVersion.JAVA_V5);
                        this.contextRegistry.setImplementationContext(this.implementationContext);
                        this.cv = WithFullProcessing.this.asmVisitorWrapper.wrap(WithFullProcessing.this.instrumentedType, this.cv, this.implementationContext, WithFullProcessing.this.typePool, WithFullProcessing.this.fields, WithFullProcessing.this.methods, this.writerFlags, this.readerFlags);
                        ClassVisitor classVisitor = this.cv;
                        int i3 = 0;
                        int actualModifiers = WithFullProcessing.this.instrumentedType.getActualModifiers(((i2 & 32) == 0 || WithFullProcessing.this.instrumentedType.isInterface()) ? false : true) | resolveDeprecationModifiers(i2);
                        if ((i2 & 16) != 0 && WithFullProcessing.this.instrumentedType.isAnonymousType()) {
                            i3 = 16;
                        }
                        int i4 = actualModifiers | i3;
                        String internalName2 = WithFullProcessing.this.instrumentedType.getInternalName();
                        if (!TypeDescription.AbstractBase.RAW_TYPES) {
                            str2 = WithFullProcessing.this.instrumentedType.getGenericSignature();
                        }
                        String str4 = str2;
                        if (WithFullProcessing.this.instrumentedType.getSuperClass() == null) {
                            internalName = WithFullProcessing.this.instrumentedType.isInterface() ? TypeDescription.OBJECT.getInternalName() : Default.NO_REFERENCE;
                        } else {
                            internalName = WithFullProcessing.this.instrumentedType.getSuperClass().asErasure().getInternalName();
                        }
                        classVisitor.visit(i, i4, internalName2, str4, internalName, WithFullProcessing.this.instrumentedType.getInterfaces().asErasures().toInternalNames());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onVisitNestHost(String str) {
                        onNestHost();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onNestHost() {
                        if (WithFullProcessing.this.instrumentedType.isNestHost()) {
                            return;
                        }
                        this.cv.visitNestHostExperimental(WithFullProcessing.this.instrumentedType.getNestHost().getInternalName());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onVisitOuterClass(String str, String str2, String str3) {
                        try {
                            onOuterType();
                        } catch (Throwable unused) {
                            this.cv.visitOuterClass(str, str2, str3);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onOuterType() {
                        MethodDescription.InDefinedShape enclosingMethod = WithFullProcessing.this.instrumentedType.getEnclosingMethod();
                        if (enclosingMethod != null) {
                            this.cv.visitOuterClass(enclosingMethod.getDeclaringType().getInternalName(), enclosingMethod.getInternalName(), enclosingMethod.getDescriptor());
                        } else if (WithFullProcessing.this.instrumentedType.isLocalType() || WithFullProcessing.this.instrumentedType.isAnonymousType()) {
                            this.cv.visitOuterClass(WithFullProcessing.this.instrumentedType.getEnclosingType().getInternalName(), Default.NO_REFERENCE, Default.NO_REFERENCE);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onAfterAttributes() {
                        WithFullProcessing.this.typeAttributeAppender.apply(this.cv, WithFullProcessing.this.instrumentedType, WithFullProcessing.this.annotationValueFilterFactory.on(WithFullProcessing.this.instrumentedType));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected AnnotationVisitor onVisitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                        if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                            return ForInlining.IGNORE_ANNOTATION;
                        }
                        return this.cv.visitTypeAnnotation(i, typePath, str, z);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected AnnotationVisitor onVisitAnnotation(String str, boolean z) {
                        if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                            return ForInlining.IGNORE_ANNOTATION;
                        }
                        return this.cv.visitAnnotation(str, z);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected FieldVisitor onVisitField(int i, String str, String str2, String str3, Object obj) {
                        FieldDescription remove = this.declarableFields.remove(str + str2);
                        if (remove != null) {
                            FieldPool.Record target = WithFullProcessing.this.fieldPool.target(remove);
                            if (!target.isImplicit()) {
                                return redefine(target, obj, i, str3);
                            }
                        }
                        return this.cv.visitField(i, str, str2, str3, obj);
                    }

                    protected FieldVisitor redefine(FieldPool.Record record, Object obj, int i, String str) {
                        FieldDescription field = record.getField();
                        ClassVisitor classVisitor = this.cv;
                        int actualModifiers = field.getActualModifiers() | resolveDeprecationModifiers(i);
                        String internalName = field.getInternalName();
                        String descriptor = field.getDescriptor();
                        if (!TypeDescription.AbstractBase.RAW_TYPES) {
                            str = field.getGenericSignature();
                        }
                        FieldVisitor visitField = classVisitor.visitField(actualModifiers, internalName, descriptor, str, record.resolveDefault(obj));
                        return visitField == null ? ForInlining.IGNORE_FIELD : new AttributeObtainingFieldVisitor(visitField, record);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected MethodVisitor onVisitMethod(int i, String str, String str2, String str3, String[] strArr) {
                        String str4;
                        boolean z = true;
                        if (str.equals(MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME)) {
                            MethodVisitor visitMethod = this.cv.visitMethod(i, str, str2, str3, strArr);
                            if (visitMethod == null) {
                                return ForInlining.IGNORE_METHOD;
                            }
                            InitializationHandler of = InitializationHandler.Appending.of(this.implementationContext.isEnabled(), visitMethod, WithFullProcessing.this.instrumentedType, this.methodPool, WithFullProcessing.this.annotationValueFilterFactory, (this.writerFlags & 2) == 0 && this.implementationContext.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V6), (this.readerFlags & 8) != 0);
                            this.initializationHandler = of;
                            return (MethodVisitor) of;
                        }
                        MethodDescription remove = this.declarableMethods.remove(str + str2);
                        if (remove == null) {
                            return this.cv.visitMethod(i, str, str2, str3, strArr);
                        }
                        if ((i & 1024) != 0) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                            z = false;
                        }
                        return redefine(remove, z, i, str4);
                    }

                    protected MethodVisitor redefine(MethodDescription methodDescription, boolean z, int i, String str) {
                        MethodPool.Record target = this.methodPool.target(methodDescription);
                        if (!target.getSort().isDefined()) {
                            ClassVisitor classVisitor = this.cv;
                            int actualModifiers = methodDescription.getActualModifiers() | resolveDeprecationModifiers(i);
                            String internalName = methodDescription.getInternalName();
                            String descriptor = methodDescription.getDescriptor();
                            if (!TypeDescription.AbstractBase.RAW_TYPES) {
                                str = methodDescription.getGenericSignature();
                            }
                            return classVisitor.visitMethod(actualModifiers, internalName, descriptor, str, methodDescription.getExceptionTypes().asErasures().toInternalNames());
                        }
                        MethodDescription method = target.getMethod();
                        MethodVisitor visitMethod = this.cv.visitMethod(ModifierContributor.Resolver.of(Collections.singleton(target.getVisibility())).resolve(method.getActualModifiers(target.getSort().isImplemented())) | resolveDeprecationModifiers(i), method.getInternalName(), method.getDescriptor(), TypeDescription.AbstractBase.RAW_TYPES ? str : method.getGenericSignature(), method.getExceptionTypes().asErasures().toInternalNames());
                        if (visitMethod == null) {
                            return ForInlining.IGNORE_METHOD;
                        }
                        if (z) {
                            return new AttributeObtainingMethodVisitor(visitMethod, target);
                        }
                        if (methodDescription.isNative()) {
                            MethodRebaseResolver.Resolution resolve = WithFullProcessing.this.methodRebaseResolver.resolve(method.asDefined());
                            if (resolve.isRebased()) {
                                int actualModifiers2 = resolve.getResolvedMethod().getActualModifiers() | resolveDeprecationModifiers(i);
                                String internalName2 = resolve.getResolvedMethod().getInternalName();
                                String descriptor2 = resolve.getResolvedMethod().getDescriptor();
                                if (!TypeDescription.AbstractBase.RAW_TYPES) {
                                    str = method.getGenericSignature();
                                }
                                MethodVisitor visitMethod2 = super.visitMethod(actualModifiers2, internalName2, descriptor2, str, resolve.getResolvedMethod().getExceptionTypes().asErasures().toInternalNames());
                                if (visitMethod2 != null) {
                                    visitMethod2.visitEnd();
                                }
                            }
                            return new AttributeObtainingMethodVisitor(visitMethod, target);
                        }
                        return new CodePreservingMethodVisitor(visitMethod, target, WithFullProcessing.this.methodRebaseResolver.resolve(method.asDefined()));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onVisitInnerClass(String str, String str2, String str3, int i) {
                        String internalName;
                        String simpleName;
                        if (str.equals(WithFullProcessing.this.instrumentedType.getInternalName())) {
                            return;
                        }
                        TypeDescription remove = this.declaredTypes.remove(str);
                        if (remove == null) {
                            this.cv.visitInnerClass(str, str2, str3, i);
                            return;
                        }
                        ClassVisitor classVisitor = this.cv;
                        if (!remove.isMemberType() && (str2 == null || str3 != null || !remove.isAnonymousType())) {
                            internalName = Default.NO_REFERENCE;
                        } else {
                            internalName = WithFullProcessing.this.instrumentedType.getInternalName();
                        }
                        if (remove.isAnonymousType()) {
                            simpleName = Default.NO_REFERENCE;
                        } else {
                            simpleName = remove.getSimpleName();
                        }
                        classVisitor.visitInnerClass(str, internalName, simpleName, remove.getModifiers());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onVisitNestMember(String str) {
                        if (WithFullProcessing.this.instrumentedType.isNestHost() && this.nestMembers.remove(str)) {
                            this.cv.visitNestMemberExperimental(str);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onVisitEnd() {
                        String str;
                        String simpleName;
                        Iterator<FieldDescription> it = this.declarableFields.values().iterator();
                        while (it.hasNext()) {
                            WithFullProcessing.this.fieldPool.target(it.next()).apply(this.cv, WithFullProcessing.this.annotationValueFilterFactory);
                        }
                        Iterator<MethodDescription> it2 = this.declarableMethods.values().iterator();
                        while (it2.hasNext()) {
                            this.methodPool.target(it2.next()).apply(this.cv, this.implementationContext, WithFullProcessing.this.annotationValueFilterFactory);
                        }
                        this.initializationHandler.complete(this.cv, this.implementationContext);
                        TypeDescription declaringType = WithFullProcessing.this.instrumentedType.getDeclaringType();
                        if (declaringType != null) {
                            this.cv.visitInnerClass(WithFullProcessing.this.instrumentedType.getInternalName(), declaringType.getInternalName(), WithFullProcessing.this.instrumentedType.getSimpleName(), WithFullProcessing.this.instrumentedType.getModifiers());
                        } else if (WithFullProcessing.this.instrumentedType.isLocalType()) {
                            this.cv.visitInnerClass(WithFullProcessing.this.instrumentedType.getInternalName(), Default.NO_REFERENCE, WithFullProcessing.this.instrumentedType.getSimpleName(), WithFullProcessing.this.instrumentedType.getModifiers());
                        } else if (WithFullProcessing.this.instrumentedType.isAnonymousType()) {
                            this.cv.visitInnerClass(WithFullProcessing.this.instrumentedType.getInternalName(), Default.NO_REFERENCE, Default.NO_REFERENCE, WithFullProcessing.this.instrumentedType.getModifiers());
                        }
                        for (TypeDescription typeDescription : this.declaredTypes.values()) {
                            ClassVisitor classVisitor = this.cv;
                            String internalName = typeDescription.getInternalName();
                            if (!typeDescription.isMemberType()) {
                                str = Default.NO_REFERENCE;
                            } else {
                                str = WithFullProcessing.this.instrumentedType.getInternalName();
                            }
                            if (typeDescription.isAnonymousType()) {
                                simpleName = Default.NO_REFERENCE;
                            } else {
                                simpleName = typeDescription.getSimpleName();
                            }
                            classVisitor.visitInnerClass(internalName, str, simpleName, typeDescription.getModifiers());
                        }
                        this.cv.visitEnd();
                    }

                    private int resolveDeprecationModifiers(int i) {
                        return (!this.retainDeprecationModifiers || (i & 131072) == 0) ? 0 : 131072;
                    }

                    protected class AttributeObtainingFieldVisitor extends FieldVisitor {
                        private final FieldPool.Record record;

                        protected AttributeObtainingFieldVisitor(FieldVisitor fieldVisitor, FieldPool.Record record) {
                            super(OpenedClassReader.ASM_API, fieldVisitor);
                            this.record = record;
                        }

                        @Override // org.modelmapper.internal.asm.FieldVisitor
                        public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                            if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                                return ForInlining.IGNORE_ANNOTATION;
                            }
                            return super.visitTypeAnnotation(i, typePath, str, z);
                        }

                        @Override // org.modelmapper.internal.asm.FieldVisitor
                        public AnnotationVisitor visitAnnotation(String str, boolean z) {
                            if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                                return ForInlining.IGNORE_ANNOTATION;
                            }
                            return super.visitAnnotation(str, z);
                        }

                        @Override // org.modelmapper.internal.asm.FieldVisitor
                        public void visitEnd() {
                            this.record.apply(this.fv, WithFullProcessing.this.annotationValueFilterFactory);
                            super.visitEnd();
                        }
                    }

                    protected class CodePreservingMethodVisitor extends MethodVisitor {
                        private final MethodVisitor actualMethodVisitor;
                        private final MethodPool.Record record;
                        private final MethodRebaseResolver.Resolution resolution;

                        protected CodePreservingMethodVisitor(MethodVisitor methodVisitor, MethodPool.Record record, MethodRebaseResolver.Resolution resolution) {
                            super(OpenedClassReader.ASM_API, methodVisitor);
                            this.actualMethodVisitor = methodVisitor;
                            this.record = record;
                            this.resolution = resolution;
                            record.applyHead(methodVisitor);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitAnnotationDefault() {
                            return ForInlining.IGNORE_ANNOTATION;
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                            if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                                return ForInlining.IGNORE_ANNOTATION;
                            }
                            return super.visitTypeAnnotation(i, typePath, str, z);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitAnnotation(String str, boolean z) {
                            if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                                return ForInlining.IGNORE_ANNOTATION;
                            }
                            return super.visitAnnotation(str, z);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitAnnotableParameterCount(int i, boolean z) {
                            if (WithFullProcessing.this.annotationRetention.isEnabled()) {
                                super.visitAnnotableParameterCount(i, z);
                            }
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
                            if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                                return ForInlining.IGNORE_ANNOTATION;
                            }
                            return super.visitParameterAnnotation(i, str, z);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitCode() {
                            MethodVisitor methodVisitor;
                            this.record.applyBody(this.actualMethodVisitor, RedefinitionClassVisitor.this.implementationContext, WithFullProcessing.this.annotationValueFilterFactory);
                            this.actualMethodVisitor.visitEnd();
                            if (!this.resolution.isRebased()) {
                                methodVisitor = ForInlining.IGNORE_METHOD;
                            } else {
                                methodVisitor = RedefinitionClassVisitor.this.cv.visitMethod(this.resolution.getResolvedMethod().getActualModifiers(), this.resolution.getResolvedMethod().getInternalName(), this.resolution.getResolvedMethod().getDescriptor(), this.resolution.getResolvedMethod().getGenericSignature(), this.resolution.getResolvedMethod().getExceptionTypes().asErasures().toInternalNames());
                            }
                            this.mv = methodVisitor;
                            super.visitCode();
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitMaxs(int i, int i2) {
                            super.visitMaxs(i, Math.max(i2, this.resolution.getResolvedMethod().getStackSize()));
                        }
                    }

                    protected class AttributeObtainingMethodVisitor extends MethodVisitor {
                        private final MethodVisitor actualMethodVisitor;
                        private final MethodPool.Record record;

                        protected AttributeObtainingMethodVisitor(MethodVisitor methodVisitor, MethodPool.Record record) {
                            super(OpenedClassReader.ASM_API, methodVisitor);
                            this.actualMethodVisitor = methodVisitor;
                            this.record = record;
                            record.applyHead(methodVisitor);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitAnnotationDefault() {
                            return ForInlining.IGNORE_ANNOTATION;
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                            if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                                return ForInlining.IGNORE_ANNOTATION;
                            }
                            return super.visitTypeAnnotation(i, typePath, str, z);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitAnnotation(String str, boolean z) {
                            if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                                return ForInlining.IGNORE_ANNOTATION;
                            }
                            return super.visitAnnotation(str, z);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitAnnotableParameterCount(int i, boolean z) {
                            if (WithFullProcessing.this.annotationRetention.isEnabled()) {
                                super.visitAnnotableParameterCount(i, z);
                            }
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
                            if (!WithFullProcessing.this.annotationRetention.isEnabled()) {
                                return ForInlining.IGNORE_ANNOTATION;
                            }
                            return super.visitParameterAnnotation(i, str, z);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitCode() {
                            this.mv = ForInlining.IGNORE_METHOD;
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitEnd() {
                            this.record.applyBody(this.actualMethodVisitor, RedefinitionClassVisitor.this.implementationContext, WithFullProcessing.this.annotationValueFilterFactory);
                            this.actualMethodVisitor.visitEnd();
                        }
                    }
                }
            }

            protected static class WithDecorationOnly<V> extends ForInlining<V> {
                protected WithDecorationOnly(TypeDescription typeDescription, ClassFileVersion classFileVersion, List<? extends DynamicType> list, MethodList<?> methodList, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, AuxiliaryType.NamingStrategy namingStrategy, Implementation.Context.Factory factory2, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool, ClassFileLocator classFileLocator) {
                    super(typeDescription, classFileVersion, FieldPool.Disabled.INSTANCE, list, new LazyFieldList(typeDescription), methodList, new MethodList.Empty(), LoadedTypeInitializer.NoOp.INSTANCE, TypeInitializer.None.INSTANCE, typeAttributeAppender, asmVisitorWrapper, factory, annotationRetention, namingStrategy, factory2, typeValidation, classWriterStrategy, typePool, typeDescription, classFileLocator);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining
                protected ClassVisitor writeTo(ClassVisitor classVisitor, TypeInitializer typeInitializer, ContextRegistry contextRegistry, int i, int i2) {
                    if (typeInitializer.isDefined()) {
                        throw new UnsupportedOperationException("Cannot apply a type initializer for a decoration");
                    }
                    return new DecorationClassVisitor(classVisitor, contextRegistry, i, i2);
                }

                protected static class LazyFieldList extends FieldList.AbstractBase<FieldDescription.InDefinedShape> {
                    private final TypeDescription instrumentedType;

                    protected LazyFieldList(TypeDescription typeDescription) {
                        this.instrumentedType = typeDescription;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public FieldDescription.InDefinedShape get(int i) {
                        return (FieldDescription.InDefinedShape) this.instrumentedType.getDeclaredFields().get(i);
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return this.instrumentedType.getDeclaredFields().size();
                    }
                }

                protected class DecorationClassVisitor extends MetadataAwareClassVisitor implements TypeInitializer.Drain {
                    private final ContextRegistry contextRegistry;
                    private Implementation.Context.ExtractableView implementationContext;
                    private final int readerFlags;
                    private final int writerFlags;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer.Drain
                    public void apply(ClassVisitor classVisitor, TypeInitializer typeInitializer, Implementation.Context context) {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onNestHost() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onOuterType() {
                    }

                    protected DecorationClassVisitor(ClassVisitor classVisitor, ContextRegistry contextRegistry, int i, int i2) {
                        super(OpenedClassReader.ASM_API, classVisitor);
                        this.contextRegistry = contextRegistry;
                        this.writerFlags = i;
                        this.readerFlags = i2;
                    }

                    @Override // org.modelmapper.internal.asm.ClassVisitor
                    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
                        Implementation.Context.ExtractableView make = WithDecorationOnly.this.implementationContextFactory.make(WithDecorationOnly.this.instrumentedType, WithDecorationOnly.this.auxiliaryTypeNamingStrategy, WithDecorationOnly.this.typeInitializer, ClassFileVersion.ofMinorMajor(i), WithDecorationOnly.this.classFileVersion);
                        this.implementationContext = make;
                        this.contextRegistry.setImplementationContext(make);
                        this.cv = WithDecorationOnly.this.asmVisitorWrapper.wrap(WithDecorationOnly.this.instrumentedType, this.cv, this.implementationContext, WithDecorationOnly.this.typePool, WithDecorationOnly.this.fields, WithDecorationOnly.this.methods, this.writerFlags, this.readerFlags);
                        this.cv.visit(i, i2, str, str2, str3, strArr);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected AnnotationVisitor onVisitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                        if (!WithDecorationOnly.this.annotationRetention.isEnabled()) {
                            return ForInlining.IGNORE_ANNOTATION;
                        }
                        return this.cv.visitTypeAnnotation(i, typePath, str, z);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected AnnotationVisitor onVisitAnnotation(String str, boolean z) {
                        if (!WithDecorationOnly.this.annotationRetention.isEnabled()) {
                            return ForInlining.IGNORE_ANNOTATION;
                        }
                        return this.cv.visitAnnotation(str, z);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onAfterAttributes() {
                        WithDecorationOnly.this.typeAttributeAppender.apply(this.cv, WithDecorationOnly.this.instrumentedType, WithDecorationOnly.this.annotationValueFilterFactory.on(WithDecorationOnly.this.instrumentedType));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    protected void onVisitEnd() {
                        this.implementationContext.drain(this, this.cv, WithDecorationOnly.this.annotationValueFilterFactory);
                        this.cv.visitEnd();
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForCreation<U> extends Default<U> {
            private final MethodPool methodPool;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public boolean equals(Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.methodPool.equals(((ForCreation) obj).methodPool);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public int hashCode() {
                return (super.hashCode() * 31) + this.methodPool.hashCode();
            }

            protected ForCreation(TypeDescription typeDescription, ClassFileVersion classFileVersion, FieldPool fieldPool, MethodPool methodPool, List<? extends DynamicType> list, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, MethodList<?> methodList2, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, AuxiliaryType.NamingStrategy namingStrategy, Implementation.Context.Factory factory2, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool) {
                super(typeDescription, classFileVersion, fieldPool, list, fieldList, methodList, methodList2, loadedTypeInitializer, typeInitializer, typeAttributeAppender, asmVisitorWrapper, factory, annotationRetention, namingStrategy, factory2, typeValidation, classWriterStrategy, typePool);
                this.methodPool = methodPool;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.Default
            protected Default<U>.UnresolvedType create(TypeInitializer typeInitializer) {
                String str;
                String simpleName;
                int mergeWriter = this.asmVisitorWrapper.mergeWriter(0);
                ClassWriter resolve = this.classWriterStrategy.resolve(mergeWriter, this.typePool);
                Implementation.Context.ExtractableView make = this.implementationContextFactory.make(this.instrumentedType, this.auxiliaryTypeNamingStrategy, typeInitializer, this.classFileVersion, this.classFileVersion);
                ClassVisitor wrap = this.asmVisitorWrapper.wrap(this.instrumentedType, ValidatingClassVisitor.of(resolve, this.typeValidation), make, this.typePool, this.fields, this.methods, mergeWriter, this.asmVisitorWrapper.mergeReader(0));
                wrap.visit(this.classFileVersion.getMinorMajorVersion(), this.instrumentedType.getActualModifiers(!this.instrumentedType.isInterface()), this.instrumentedType.getInternalName(), this.instrumentedType.getGenericSignature(), (this.instrumentedType.getSuperClass() == null ? TypeDescription.OBJECT : this.instrumentedType.getSuperClass().asErasure()).getInternalName(), this.instrumentedType.getInterfaces().asErasures().toInternalNames());
                if (!this.instrumentedType.isNestHost()) {
                    wrap.visitNestHostExperimental(this.instrumentedType.getNestHost().getInternalName());
                }
                MethodDescription.InDefinedShape enclosingMethod = this.instrumentedType.getEnclosingMethod();
                if (enclosingMethod != null) {
                    wrap.visitOuterClass(enclosingMethod.getDeclaringType().getInternalName(), enclosingMethod.getInternalName(), enclosingMethod.getDescriptor());
                } else if (this.instrumentedType.isLocalType() || this.instrumentedType.isAnonymousType()) {
                    wrap.visitOuterClass(this.instrumentedType.getEnclosingType().getInternalName(), Default.NO_REFERENCE, Default.NO_REFERENCE);
                }
                this.typeAttributeAppender.apply(wrap, this.instrumentedType, this.annotationValueFilterFactory.on(this.instrumentedType));
                Iterator it = this.fields.iterator();
                while (it.hasNext()) {
                    this.fieldPool.target((FieldDescription) it.next()).apply(wrap, this.annotationValueFilterFactory);
                }
                Iterator it2 = this.instrumentedMethods.iterator();
                while (it2.hasNext()) {
                    this.methodPool.target((MethodDescription) it2.next()).apply(wrap, make, this.annotationValueFilterFactory);
                }
                make.drain(new TypeInitializer.Drain.Default(this.instrumentedType, this.methodPool, this.annotationValueFilterFactory), wrap, this.annotationValueFilterFactory);
                if (this.instrumentedType.isNestHost()) {
                    Iterator it3 = this.instrumentedType.getNestMembers().filter(ElementMatchers.not(ElementMatchers.is(this.instrumentedType))).iterator();
                    while (it3.hasNext()) {
                        wrap.visitNestMemberExperimental(((TypeDescription) it3.next()).getInternalName());
                    }
                }
                TypeDescription declaringType = this.instrumentedType.getDeclaringType();
                if (declaringType != null) {
                    wrap.visitInnerClass(this.instrumentedType.getInternalName(), declaringType.getInternalName(), this.instrumentedType.getSimpleName(), this.instrumentedType.getModifiers());
                } else if (this.instrumentedType.isLocalType()) {
                    wrap.visitInnerClass(this.instrumentedType.getInternalName(), Default.NO_REFERENCE, this.instrumentedType.getSimpleName(), this.instrumentedType.getModifiers());
                } else if (this.instrumentedType.isAnonymousType()) {
                    wrap.visitInnerClass(this.instrumentedType.getInternalName(), Default.NO_REFERENCE, Default.NO_REFERENCE, this.instrumentedType.getModifiers());
                }
                for (TypeDescription typeDescription : this.instrumentedType.getDeclaredTypes()) {
                    String internalName = typeDescription.getInternalName();
                    if (!typeDescription.isMemberType()) {
                        str = Default.NO_REFERENCE;
                    } else {
                        str = this.instrumentedType.getInternalName();
                    }
                    if (typeDescription.isAnonymousType()) {
                        simpleName = Default.NO_REFERENCE;
                    } else {
                        simpleName = typeDescription.getSimpleName();
                    }
                    wrap.visitInnerClass(internalName, str, simpleName, typeDescription.getModifiers());
                }
                wrap.visitEnd();
                return new UnresolvedType(resolve.toByteArray(), make.getAuxiliaryTypes());
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class ClassDumpAction implements PrivilegedExceptionAction<Void> {
            private static final Void NOTHING = null;
            private final byte[] binaryRepresentation;
            private final TypeDescription instrumentedType;
            private final boolean original;
            private final String target;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ClassDumpAction classDumpAction = (ClassDumpAction) obj;
                return this.target.equals(classDumpAction.target) && this.instrumentedType.equals(classDumpAction.instrumentedType) && this.original == classDumpAction.original && Arrays.equals(this.binaryRepresentation, classDumpAction.binaryRepresentation);
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.instrumentedType.hashCode()) * 31) + (this.original ? 1 : 0)) * 31) + Arrays.hashCode(this.binaryRepresentation);
            }

            protected ClassDumpAction(String str, TypeDescription typeDescription, boolean z, byte[] bArr) {
                this.target = str;
                this.instrumentedType = typeDescription;
                this.original = z;
                this.binaryRepresentation = bArr;
            }

            protected static void dump(String str, TypeDescription typeDescription, boolean z, byte[] bArr) {
                if (str != null) {
                    try {
                        AccessController.doPrivileged(new ClassDumpAction(str, typeDescription, z, bArr));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override // java.security.PrivilegedExceptionAction
            public Void run() throws Exception {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.target, this.instrumentedType.getName() + (this.original ? "-original." : ".") + System.currentTimeMillis()));
                try {
                    fileOutputStream.write(this.binaryRepresentation);
                    return NOTHING;
                } finally {
                    fileOutputStream.close();
                }
            }
        }
    }
}
