package org.modelmapper.internal.bytebuddy;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.NamingStrategy;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.EnumerationState;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.modifier.Ownership;
import org.modelmapper.internal.bytebuddy.description.modifier.TypeManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.PackageDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.TargetType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.RebaseDynamicTypeBuilder;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.RedefinitionDynamicTypeBuilder;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.MethodCall;
import org.modelmapper.internal.bytebuddy.implementation.SuperMethodCall;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationRetention;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.TypeCreation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.matcher.LatentMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class ByteBuddy {
    private static final String BYTE_BUDDY_DEFAULT_PREFIX = "ByteBuddy";
    private static final String BYTE_BUDDY_DEFAULT_SUFFIX = "auxiliary";
    protected final AnnotationRetention annotationRetention;
    protected final AnnotationValueFilter.Factory annotationValueFilterFactory;
    protected final AuxiliaryType.NamingStrategy auxiliaryTypeNamingStrategy;
    protected final ClassFileVersion classFileVersion;
    protected final ClassWriterStrategy classWriterStrategy;
    protected final LatentMatcher<? super MethodDescription> ignoredMethods;
    protected final Implementation.Context.Factory implementationContextFactory;
    protected final InstrumentedType.Factory instrumentedTypeFactory;
    protected final MethodGraph.Compiler methodGraphCompiler;
    protected final NamingStrategy namingStrategy;
    protected final TypeValidation typeValidation;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuddy byteBuddy = (ByteBuddy) obj;
        return this.classFileVersion.equals(byteBuddy.classFileVersion) && this.namingStrategy.equals(byteBuddy.namingStrategy) && this.auxiliaryTypeNamingStrategy.equals(byteBuddy.auxiliaryTypeNamingStrategy) && this.annotationValueFilterFactory.equals(byteBuddy.annotationValueFilterFactory) && this.annotationRetention.equals(byteBuddy.annotationRetention) && this.implementationContextFactory.equals(byteBuddy.implementationContextFactory) && this.methodGraphCompiler.equals(byteBuddy.methodGraphCompiler) && this.instrumentedTypeFactory.equals(byteBuddy.instrumentedTypeFactory) && this.ignoredMethods.equals(byteBuddy.ignoredMethods) && this.typeValidation.equals(byteBuddy.typeValidation) && this.classWriterStrategy.equals(byteBuddy.classWriterStrategy);
    }

    public int hashCode() {
        return ((((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classFileVersion.hashCode()) * 31) + this.namingStrategy.hashCode()) * 31) + this.auxiliaryTypeNamingStrategy.hashCode()) * 31) + this.annotationValueFilterFactory.hashCode()) * 31) + this.annotationRetention.hashCode()) * 31) + this.implementationContextFactory.hashCode()) * 31) + this.methodGraphCompiler.hashCode()) * 31) + this.instrumentedTypeFactory.hashCode()) * 31) + this.ignoredMethods.hashCode()) * 31) + this.typeValidation.hashCode()) * 31) + this.classWriterStrategy.hashCode();
    }

    public ByteBuddy() {
        this(ClassFileVersion.ofThisVm(ClassFileVersion.JAVA_V6));
    }

    public ByteBuddy(ClassFileVersion classFileVersion) {
        this(classFileVersion, new NamingStrategy.SuffixingRandom(BYTE_BUDDY_DEFAULT_PREFIX), new AuxiliaryType.NamingStrategy.SuffixingRandom(BYTE_BUDDY_DEFAULT_SUFFIX), AnnotationValueFilter.Default.APPEND_DEFAULTS, AnnotationRetention.ENABLED, Implementation.Context.Default.Factory.INSTANCE, MethodGraph.Compiler.DEFAULT, InstrumentedType.Factory.Default.MODIFIABLE, TypeValidation.ENABLED, ClassWriterStrategy.Default.CONSTANT_POOL_RETAINING, new LatentMatcher.Resolved(ElementMatchers.isSynthetic().or(ElementMatchers.isDefaultFinalizer())));
    }

    protected ByteBuddy(ClassFileVersion classFileVersion, NamingStrategy namingStrategy, AuxiliaryType.NamingStrategy namingStrategy2, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, InstrumentedType.Factory factory3, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher) {
        this.classFileVersion = classFileVersion;
        this.namingStrategy = namingStrategy;
        this.auxiliaryTypeNamingStrategy = namingStrategy2;
        this.annotationValueFilterFactory = factory;
        this.annotationRetention = annotationRetention;
        this.implementationContextFactory = factory2;
        this.methodGraphCompiler = compiler;
        this.instrumentedTypeFactory = factory3;
        this.typeValidation = typeValidation;
        this.classWriterStrategy = classWriterStrategy;
        this.ignoredMethods = latentMatcher;
    }

    public <T> DynamicType.Builder<T> subclass(Class<T> cls) {
        return (DynamicType.Builder<T>) subclass(TypeDescription.ForLoadedType.of(cls));
    }

    public <T> DynamicType.Builder<T> subclass(Class<T> cls, ConstructorStrategy constructorStrategy) {
        return (DynamicType.Builder<T>) subclass(TypeDescription.ForLoadedType.of(cls), constructorStrategy);
    }

    public DynamicType.Builder<?> subclass(Type type) {
        return subclass(TypeDefinition.Sort.describe(type));
    }

    public DynamicType.Builder<?> subclass(Type type, ConstructorStrategy constructorStrategy) {
        return subclass(TypeDefinition.Sort.describe(type), constructorStrategy);
    }

    public DynamicType.Builder<?> subclass(TypeDefinition typeDefinition) {
        return subclass(typeDefinition, ConstructorStrategy.Default.IMITATE_SUPER_CLASS_OPENING);
    }

    public DynamicType.Builder<?> subclass(TypeDefinition typeDefinition, ConstructorStrategy constructorStrategy) {
        TypeDescription.Generic asGenericType;
        TypeList.Generic empty;
        if (typeDefinition.isPrimitive() || typeDefinition.isArray() || typeDefinition.isFinal()) {
            throw new IllegalArgumentException("Cannot subclass primitive, array or final types: " + typeDefinition);
        }
        if (typeDefinition.isInterface()) {
            asGenericType = TypeDescription.Generic.OBJECT;
            empty = new TypeList.Generic.Explicit(typeDefinition);
        } else {
            asGenericType = typeDefinition.asGenericType();
            empty = new TypeList.Generic.Empty();
        }
        return new SubclassDynamicTypeBuilder(this.instrumentedTypeFactory.subclass(this.namingStrategy.subclass(typeDefinition.asGenericType()), ModifierContributor.Resolver.of(Visibility.PUBLIC, TypeManifestation.PLAIN).resolve(typeDefinition.getModifiers()), asGenericType).withInterfaces(empty), this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, constructorStrategy);
    }

    public DynamicType.Builder<?> makeInterface() {
        return makeInterface((Collection<? extends TypeDefinition>) Collections.emptyList());
    }

    public <T> DynamicType.Builder<T> makeInterface(Class<T> cls) {
        return (DynamicType.Builder<T>) makeInterface(Collections.singletonList(cls));
    }

    public DynamicType.Builder<?> makeInterface(Type... typeArr) {
        return makeInterface(Arrays.asList(typeArr));
    }

    public DynamicType.Builder<?> makeInterface(List<? extends Type> list) {
        return makeInterface((Collection<? extends TypeDefinition>) new TypeList.Generic.ForLoadedTypes(list));
    }

    public DynamicType.Builder<?> makeInterface(TypeDefinition... typeDefinitionArr) {
        return makeInterface((Collection<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
    }

    public DynamicType.Builder<?> makeInterface(Collection<? extends TypeDefinition> collection) {
        return subclass(Object.class, (ConstructorStrategy) ConstructorStrategy.Default.NO_CONSTRUCTORS).implement(collection).modifiers(TypeManifestation.INTERFACE, Visibility.PUBLIC);
    }

    public DynamicType.Builder<?> makePackage(String str) {
        return new SubclassDynamicTypeBuilder(this.instrumentedTypeFactory.subclass(str + ".package-info", PackageDescription.PACKAGE_MODIFIERS, TypeDescription.Generic.OBJECT), this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, ConstructorStrategy.Default.NO_CONSTRUCTORS);
    }

    public DynamicType.Builder<? extends Annotation> makeAnnotation() {
        return new SubclassDynamicTypeBuilder(this.instrumentedTypeFactory.subclass(this.namingStrategy.subclass(TypeDescription.Generic.ANNOTATION), ModifierContributor.Resolver.of(Visibility.PUBLIC, TypeManifestation.ANNOTATION).resolve(), TypeDescription.Generic.OBJECT).withInterfaces((TypeList.Generic) new TypeList.Generic.Explicit(TypeDescription.Generic.ANNOTATION)), this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, ConstructorStrategy.Default.NO_CONSTRUCTORS);
    }

    public DynamicType.Builder<? extends Enum<?>> makeEnumeration(String... strArr) {
        return makeEnumeration(Arrays.asList(strArr));
    }

    public DynamicType.Builder<? extends Enum<?>> makeEnumeration(Collection<? extends String> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Require at least one enumeration constant");
        }
        TypeDescription.Generic build = TypeDescription.Generic.Builder.parameterizedType((Class<?>) Enum.class, TargetType.class).build();
        return new SubclassDynamicTypeBuilder(this.instrumentedTypeFactory.subclass(this.namingStrategy.subclass(build), ModifierContributor.Resolver.of(Visibility.PUBLIC, TypeManifestation.FINAL, EnumerationState.ENUMERATION).resolve(), build), this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, ConstructorStrategy.Default.NO_CONSTRUCTORS).defineConstructor(Visibility.PRIVATE).withParameters(String.class, Integer.TYPE).intercept(SuperMethodCall.INSTANCE).defineMethod("valueOf", TargetType.class, Visibility.PUBLIC, Ownership.STATIC).withParameters(String.class).intercept(MethodCall.invoke((MethodDescription) build.getDeclaredMethods().filter(ElementMatchers.named("valueOf").and(ElementMatchers.takesArguments((Class<?>[]) new Class[]{Class.class, String.class}))).getOnly()).withOwnType().withArgument(0).withAssigner(Assigner.DEFAULT, Assigner.Typing.DYNAMIC)).defineMethod("values", TargetType[].class, Visibility.PUBLIC, Ownership.STATIC).intercept(new EnumerationImplementation(new ArrayList(collection)));
    }

    public <T> DynamicType.Builder<T> redefine(Class<T> cls) {
        return redefine(cls, ClassFileLocator.ForClassLoader.of(cls.getClassLoader()));
    }

    public <T> DynamicType.Builder<T> redefine(Class<T> cls, ClassFileLocator classFileLocator) {
        return redefine(TypeDescription.ForLoadedType.of(cls), classFileLocator);
    }

    public <T> DynamicType.Builder<T> redefine(TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        if (typeDescription.isArray() || typeDescription.isPrimitive()) {
            throw new IllegalArgumentException("Cannot redefine array or primitive type: " + typeDescription);
        }
        return new RedefinitionDynamicTypeBuilder(this.instrumentedTypeFactory.represent(typeDescription), this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, typeDescription, classFileLocator);
    }

    public <T> DynamicType.Builder<T> rebase(Class<T> cls) {
        return rebase(cls, ClassFileLocator.ForClassLoader.of(cls.getClassLoader()));
    }

    public <T> DynamicType.Builder<T> rebase(Class<T> cls, ClassFileLocator classFileLocator) {
        return rebase(TypeDescription.ForLoadedType.of(cls), classFileLocator);
    }

    public <T> DynamicType.Builder<T> rebase(Class<T> cls, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer) {
        return rebase(TypeDescription.ForLoadedType.of(cls), classFileLocator, methodNameTransformer);
    }

    public <T> DynamicType.Builder<T> rebase(TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        return rebase(typeDescription, classFileLocator, MethodNameTransformer.Suffixing.withRandomSuffix());
    }

    public <T> DynamicType.Builder<T> rebase(TypeDescription typeDescription, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer) {
        if (typeDescription.isArray() || typeDescription.isPrimitive()) {
            throw new IllegalArgumentException("Cannot rebase array or primitive type: " + typeDescription);
        }
        return new RebaseDynamicTypeBuilder(this.instrumentedTypeFactory.represent(typeDescription), this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, typeDescription, classFileLocator, methodNameTransformer);
    }

    public DynamicType.Builder<?> rebase(Package r2, ClassFileLocator classFileLocator) {
        return rebase(new PackageDescription.ForLoadedPackage(r2), classFileLocator);
    }

    public DynamicType.Builder<?> rebase(PackageDescription packageDescription, ClassFileLocator classFileLocator) {
        return rebase(new TypeDescription.ForPackageDescription(packageDescription), classFileLocator);
    }

    public <T> DynamicType.Builder<T> decorate(Class<T> cls) {
        return decorate(cls, ClassFileLocator.ForClassLoader.of(cls.getClassLoader()));
    }

    public <T> DynamicType.Builder<T> decorate(Class<T> cls, ClassFileLocator classFileLocator) {
        return decorate(TypeDescription.ForLoadedType.of(cls), classFileLocator);
    }

    public <T> DynamicType.Builder<T> decorate(TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        if (typeDescription.isArray() || typeDescription.isPrimitive()) {
            throw new IllegalArgumentException("Cannot decorate array or primitive type: " + typeDescription);
        }
        return new DecoratingDynamicTypeBuilder(typeDescription, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, classFileLocator);
    }

    public ByteBuddy with(ClassFileVersion classFileVersion) {
        return new ByteBuddy(classFileVersion, this.namingStrategy, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.instrumentedTypeFactory, this.typeValidation, this.classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy with(NamingStrategy namingStrategy) {
        return new ByteBuddy(this.classFileVersion, namingStrategy, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.instrumentedTypeFactory, this.typeValidation, this.classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy with(AuxiliaryType.NamingStrategy namingStrategy) {
        return new ByteBuddy(this.classFileVersion, this.namingStrategy, namingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.instrumentedTypeFactory, this.typeValidation, this.classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy with(AnnotationValueFilter.Factory factory) {
        return new ByteBuddy(this.classFileVersion, this.namingStrategy, this.auxiliaryTypeNamingStrategy, factory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.instrumentedTypeFactory, this.typeValidation, this.classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy with(AnnotationRetention annotationRetention) {
        return new ByteBuddy(this.classFileVersion, this.namingStrategy, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.instrumentedTypeFactory, this.typeValidation, this.classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy with(Implementation.Context.Factory factory) {
        return new ByteBuddy(this.classFileVersion, this.namingStrategy, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, factory, this.methodGraphCompiler, this.instrumentedTypeFactory, this.typeValidation, this.classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy with(MethodGraph.Compiler compiler) {
        return new ByteBuddy(this.classFileVersion, this.namingStrategy, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, compiler, this.instrumentedTypeFactory, this.typeValidation, this.classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy with(InstrumentedType.Factory factory) {
        return new ByteBuddy(this.classFileVersion, this.namingStrategy, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, factory, this.typeValidation, this.classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy with(TypeValidation typeValidation) {
        return new ByteBuddy(this.classFileVersion, this.namingStrategy, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.instrumentedTypeFactory, typeValidation, this.classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy with(ClassWriterStrategy classWriterStrategy) {
        return new ByteBuddy(this.classFileVersion, this.namingStrategy, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.instrumentedTypeFactory, this.typeValidation, classWriterStrategy, this.ignoredMethods);
    }

    public ByteBuddy ignore(ElementMatcher<? super MethodDescription> elementMatcher) {
        return ignore(new LatentMatcher.Resolved(elementMatcher));
    }

    public ByteBuddy ignore(LatentMatcher<? super MethodDescription> latentMatcher) {
        return new ByteBuddy(this.classFileVersion, this.namingStrategy, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.instrumentedTypeFactory, this.typeValidation, this.classWriterStrategy, latentMatcher);
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class EnumerationImplementation implements Implementation {
        protected static final String CLONE_METHOD_NAME = "clone";
        private static final int ENUM_FIELD_MODIFIERS = 25;
        private static final String ENUM_VALUES = "$VALUES";
        protected static final String ENUM_VALUES_METHOD_NAME = "values";
        protected static final String ENUM_VALUE_OF_METHOD_NAME = "valueOf";
        private final List<String> values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.values.equals(((EnumerationImplementation) obj).values);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.values.hashCode();
        }

        protected EnumerationImplementation(List<String> list) {
            this.values = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            Iterator<String> it = this.values.iterator();
            while (it.hasNext()) {
                instrumentedType = instrumentedType.withField(new FieldDescription.Token(it.next(), 16409, TargetType.DESCRIPTION.asGenericType()));
            }
            return instrumentedType.withField(new FieldDescription.Token(ENUM_VALUES, 4121, TypeDescription.ArrayProjection.of(TargetType.DESCRIPTION).asGenericType())).withInitializer(new InitializationAppender(this.values));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new ValuesMethodAppender(target.getInstrumentedType());
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class ValuesMethodAppender implements ByteCodeAppender {
            private final TypeDescription instrumentedType;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ValuesMethodAppender) obj).instrumentedType);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode();
            }

            protected ValuesMethodAppender(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                FieldDescription fieldDescription = (FieldDescription) this.instrumentedType.getDeclaredFields().filter(ElementMatchers.named(EnumerationImplementation.ENUM_VALUES)).getOnly();
                return new ByteCodeAppender.Size(new StackManipulation.Compound(FieldAccess.forField(fieldDescription).read(), MethodInvocation.invoke((MethodDescription) TypeDescription.Generic.OBJECT.getDeclaredMethods().filter(ElementMatchers.named(EnumerationImplementation.CLONE_METHOD_NAME)).getOnly()).virtual(fieldDescription.getType().asErasure()), TypeCasting.to(fieldDescription.getType().asErasure()), MethodReturn.REFERENCE).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class InitializationAppender implements ByteCodeAppender {
            private final List<String> values;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.values.equals(((InitializationAppender) obj).values);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.values.hashCode();
            }

            protected InitializationAppender(List<String> list) {
                this.values = list;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                TypeDescription asErasure = methodDescription.getDeclaringType().asErasure();
                MethodDescription methodDescription2 = (MethodDescription) asErasure.getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.takesArguments((Class<?>[]) new Class[]{String.class, Integer.TYPE}))).getOnly();
                StackManipulation stackManipulation = StackManipulation.Trivial.INSTANCE;
                ArrayList arrayList = new ArrayList(this.values.size());
                int i = 0;
                for (String str : this.values) {
                    FieldDescription fieldDescription = (FieldDescription) asErasure.getDeclaredFields().filter(ElementMatchers.named(str)).getOnly();
                    StackManipulation compound = new StackManipulation.Compound(stackManipulation, TypeCreation.of(asErasure), Duplication.SINGLE, new TextConstant(str), IntegerConstant.forValue(i), MethodInvocation.invoke(methodDescription2), FieldAccess.forField(fieldDescription).write());
                    arrayList.add(fieldDescription);
                    i++;
                    stackManipulation = compound;
                }
                ArrayList arrayList2 = new ArrayList(this.values.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(FieldAccess.forField((FieldDescription) it.next()).read());
                }
                return new ByteCodeAppender.Size(new StackManipulation.Compound(stackManipulation, ArrayFactory.forType(asErasure.asGenericType()).withValues(arrayList2), FieldAccess.forField((FieldDescription.InDefinedShape) asErasure.getDeclaredFields().filter(ElementMatchers.named(EnumerationImplementation.ENUM_VALUES)).getOnly()).write()).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
            }
        }
    }
}
