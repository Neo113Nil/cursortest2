package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import com.ironsource.C3664q2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Serializable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import org.modelmapper.internal.bytebuddy.implementation.ExceptionMethod;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.TypeCreation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface FieldProxy {
    Class<?> declaringType() default void.class;

    boolean serializableProxy() default false;

    String value() default "";

    @HashCodeAndEqualsPlugin.Enhance
    public static class Binder extends TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding<FieldProxy> {
        private static final MethodDescription.InDefinedShape DECLARING_TYPE;
        private static final MethodDescription.InDefinedShape FIELD_NAME;
        private static final MethodDescription.InDefinedShape SERIALIZABLE_PROXY;
        private final FieldResolver.Factory fieldResolverFactory;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.fieldResolverFactory.equals(((Binder) obj).fieldResolverFactory);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldResolverFactory.hashCode();
        }

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(FieldProxy.class).getDeclaredMethods();
            DECLARING_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("declaringType")).getOnly();
            FIELD_NAME = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("value")).getOnly();
            SERIALIZABLE_PROXY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("serializableProxy")).getOnly();
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<FieldProxy> install(Class<?> cls) {
            return install(TypeDescription.ForLoadedType.of(cls));
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<FieldProxy> install(TypeDescription typeDescription) {
            if (!typeDescription.isInterface()) {
                throw new IllegalArgumentException(typeDescription + " is not an interface");
            }
            if (!typeDescription.getInterfaces().isEmpty()) {
                throw new IllegalArgumentException(typeDescription + " must not extend other interfaces");
            }
            if (!typeDescription.isPublic()) {
                throw new IllegalArgumentException(typeDescription + " is not public");
            }
            MethodList filter = typeDescription.getDeclaredMethods().filter(ElementMatchers.isAbstract());
            if (filter.size() != 2) {
                throw new IllegalArgumentException(typeDescription + " does not declare exactly two non-abstract methods");
            }
            MethodList filter2 = filter.filter(ElementMatchers.isGetter((Class<?>) Object.class));
            if (filter2.size() != 1) {
                throw new IllegalArgumentException(typeDescription + " does not declare a getter with an Object type");
            }
            MethodList filter3 = filter.filter(ElementMatchers.isSetter((Class<?>) Object.class));
            if (filter3.size() != 1) {
                throw new IllegalArgumentException(typeDescription + " does not declare a setter with an Object type");
            }
            return new Binder(typeDescription, (MethodDescription.InDefinedShape) filter2.getOnly(), (MethodDescription.InDefinedShape) filter3.getOnly());
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<FieldProxy> install(Class<?> cls, Class<?> cls2) {
            return install(TypeDescription.ForLoadedType.of(cls), TypeDescription.ForLoadedType.of(cls2));
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<FieldProxy> install(TypeDescription typeDescription, TypeDescription typeDescription2) {
            MethodDescription.InDefinedShape onlyMethod = onlyMethod(typeDescription);
            if (!onlyMethod.getReturnType().asErasure().represents(Object.class)) {
                throw new IllegalArgumentException(onlyMethod + " must take a single Object-typed parameter");
            }
            if (onlyMethod.getParameters().size() != 0) {
                throw new IllegalArgumentException(onlyMethod + " must not declare parameters");
            }
            MethodDescription.InDefinedShape onlyMethod2 = onlyMethod(typeDescription2);
            if (!onlyMethod2.getReturnType().asErasure().represents(Void.TYPE)) {
                throw new IllegalArgumentException(onlyMethod2 + " must return void");
            }
            if (onlyMethod2.getParameters().size() != 1 || !((ParameterDescription.InDefinedShape) onlyMethod2.getParameters().get(0)).getType().asErasure().represents(Object.class)) {
                throw new IllegalArgumentException(onlyMethod2 + " must declare a single Object-typed parameters");
            }
            return new Binder(onlyMethod, onlyMethod2);
        }

        private static MethodDescription.InDefinedShape onlyMethod(TypeDescription typeDescription) {
            if (!typeDescription.isInterface()) {
                throw new IllegalArgumentException(typeDescription + " is not an interface");
            }
            if (!typeDescription.getInterfaces().isEmpty()) {
                throw new IllegalArgumentException(typeDescription + " must not extend other interfaces");
            }
            if (!typeDescription.isPublic()) {
                throw new IllegalArgumentException(typeDescription + " is not public");
            }
            MethodList filter = typeDescription.getDeclaredMethods().filter(ElementMatchers.isAbstract());
            if (filter.size() != 1) {
                throw new IllegalArgumentException(typeDescription + " must declare exactly one abstract method");
            }
            return (MethodDescription.InDefinedShape) filter.getOnly();
        }

        protected Binder(MethodDescription.InDefinedShape inDefinedShape, MethodDescription.InDefinedShape inDefinedShape2) {
            this(new FieldResolver.Factory.Simplex(inDefinedShape, inDefinedShape2));
        }

        protected Binder(TypeDescription typeDescription, MethodDescription.InDefinedShape inDefinedShape, MethodDescription.InDefinedShape inDefinedShape2) {
            this(new FieldResolver.Factory.Duplex(typeDescription, inDefinedShape, inDefinedShape2));
        }

        protected Binder(FieldResolver.Factory factory) {
            this.fieldResolverFactory = factory;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<FieldProxy> getHandledType() {
            return FieldProxy.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
        protected String fieldName(AnnotationDescription.Loadable<FieldProxy> loadable) {
            return (String) loadable.getValue(FIELD_NAME).resolve(String.class);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
        protected TypeDescription declaringType(AnnotationDescription.Loadable<FieldProxy> loadable) {
            return (TypeDescription) loadable.getValue(DECLARING_TYPE).resolve(TypeDescription.class);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
        protected MethodDelegationBinder.ParameterBinding<?> bind(FieldDescription fieldDescription, AnnotationDescription.Loadable<FieldProxy> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner) {
            FieldResolver resolve = this.fieldResolverFactory.resolve(parameterDescription.getType().asErasure(), fieldDescription);
            if (resolve.isResolved()) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(new AccessorProxy(fieldDescription, target.getInstrumentedType(), resolve, assigner, ((Boolean) loadable.getValue(SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue()));
            }
            return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
        }

        protected interface FieldResolver {
            DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, FieldDescription fieldDescription, Assigner assigner, MethodAccessorFactory methodAccessorFactory);

            TypeDescription getProxyType();

            boolean isResolved();

            public interface Factory {
                FieldResolver resolve(TypeDescription typeDescription, FieldDescription fieldDescription);

                @HashCodeAndEqualsPlugin.Enhance
                public static class Duplex implements Factory {
                    private final MethodDescription.InDefinedShape getterMethod;
                    private final TypeDescription proxyType;
                    private final MethodDescription.InDefinedShape setterMethod;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Duplex duplex = (Duplex) obj;
                        return this.proxyType.equals(duplex.proxyType) && this.getterMethod.equals(duplex.getterMethod) && this.setterMethod.equals(duplex.setterMethod);
                    }

                    public int hashCode() {
                        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.proxyType.hashCode()) * 31) + this.getterMethod.hashCode()) * 31) + this.setterMethod.hashCode();
                    }

                    protected Duplex(TypeDescription typeDescription, MethodDescription.InDefinedShape inDefinedShape, MethodDescription.InDefinedShape inDefinedShape2) {
                        this.proxyType = typeDescription;
                        this.getterMethod = inDefinedShape;
                        this.setterMethod = inDefinedShape2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory
                    public FieldResolver resolve(TypeDescription typeDescription, FieldDescription fieldDescription) {
                        if (typeDescription.equals(this.proxyType)) {
                            return new ForGetterSetterPair(this.proxyType, this.getterMethod, this.setterMethod);
                        }
                        throw new IllegalStateException("Cannot use @FieldProxy on a non-installed type");
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Simplex implements Factory {
                    private final MethodDescription.InDefinedShape getterMethod;
                    private final MethodDescription.InDefinedShape setterMethod;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Simplex simplex = (Simplex) obj;
                        return this.getterMethod.equals(simplex.getterMethod) && this.setterMethod.equals(simplex.setterMethod);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.getterMethod.hashCode()) * 31) + this.setterMethod.hashCode();
                    }

                    protected Simplex(MethodDescription.InDefinedShape inDefinedShape, MethodDescription.InDefinedShape inDefinedShape2) {
                        this.getterMethod = inDefinedShape;
                        this.setterMethod = inDefinedShape2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory
                    public FieldResolver resolve(TypeDescription typeDescription, FieldDescription fieldDescription) {
                        if (typeDescription.equals(this.getterMethod.getDeclaringType())) {
                            return new ForGetter(this.getterMethod);
                        }
                        if (typeDescription.equals(this.setterMethod.getDeclaringType())) {
                            return fieldDescription.isFinal() ? Unresolved.INSTANCE : new ForSetter(this.setterMethod);
                        }
                        throw new IllegalStateException("Cannot use @FieldProxy on a non-installed type");
                    }
                }
            }

            public enum Unresolved implements FieldResolver {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public boolean isResolved() {
                    return false;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public TypeDescription getProxyType() {
                    throw new IllegalStateException("Cannot read type for unresolved field resolver");
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, FieldDescription fieldDescription, Assigner assigner, MethodAccessorFactory methodAccessorFactory) {
                    throw new IllegalStateException("Cannot apply unresolved field resolver");
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForGetter implements FieldResolver {
                private final MethodDescription.InDefinedShape getterMethod;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.getterMethod.equals(((ForGetter) obj).getterMethod);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.getterMethod.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public boolean isResolved() {
                    return true;
                }

                protected ForGetter(MethodDescription.InDefinedShape inDefinedShape) {
                    this.getterMethod = inDefinedShape;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public TypeDescription getProxyType() {
                    return this.getterMethod.getDeclaringType();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, FieldDescription fieldDescription, Assigner assigner, MethodAccessorFactory methodAccessorFactory) {
                    return builder.method(ElementMatchers.definedMethod(ElementMatchers.is(this.getterMethod))).intercept(new FieldGetter(fieldDescription, assigner, methodAccessorFactory));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForSetter implements FieldResolver {
                private final MethodDescription.InDefinedShape setterMethod;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.setterMethod.equals(((ForSetter) obj).setterMethod);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.setterMethod.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public boolean isResolved() {
                    return true;
                }

                protected ForSetter(MethodDescription.InDefinedShape inDefinedShape) {
                    this.setterMethod = inDefinedShape;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public TypeDescription getProxyType() {
                    return this.setterMethod.getDeclaringType();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, FieldDescription fieldDescription, Assigner assigner, MethodAccessorFactory methodAccessorFactory) {
                    return builder.method(ElementMatchers.is(this.setterMethod)).intercept(new FieldSetter(fieldDescription, assigner, methodAccessorFactory));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForGetterSetterPair implements FieldResolver {
                private final MethodDescription.InDefinedShape getterMethod;
                private final TypeDescription proxyType;
                private final MethodDescription.InDefinedShape setterMethod;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForGetterSetterPair forGetterSetterPair = (ForGetterSetterPair) obj;
                    return this.proxyType.equals(forGetterSetterPair.proxyType) && this.getterMethod.equals(forGetterSetterPair.getterMethod) && this.setterMethod.equals(forGetterSetterPair.setterMethod);
                }

                public int hashCode() {
                    return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.proxyType.hashCode()) * 31) + this.getterMethod.hashCode()) * 31) + this.setterMethod.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public boolean isResolved() {
                    return true;
                }

                protected ForGetterSetterPair(TypeDescription typeDescription, MethodDescription.InDefinedShape inDefinedShape, MethodDescription.InDefinedShape inDefinedShape2) {
                    this.proxyType = typeDescription;
                    this.getterMethod = inDefinedShape;
                    this.setterMethod = inDefinedShape2;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public TypeDescription getProxyType() {
                    return this.proxyType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, FieldDescription fieldDescription, Assigner assigner, MethodAccessorFactory methodAccessorFactory) {
                    return builder.method(ElementMatchers.is(this.getterMethod)).intercept(new FieldGetter(fieldDescription, assigner, methodAccessorFactory)).method(ElementMatchers.is(this.setterMethod)).intercept(fieldDescription.isFinal() ? ExceptionMethod.throwing((Class<? extends Throwable>) UnsupportedOperationException.class, "Cannot set final field " + fieldDescription) : new FieldSetter(fieldDescription, assigner, methodAccessorFactory));
                }
            }
        }

        protected enum StaticFieldConstructor implements Implementation {
            INSTANCE;

            private final MethodDescription objectTypeDefaultConstructor = (MethodDescription) TypeDescription.OBJECT.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            StaticFieldConstructor() {
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
            public ByteCodeAppender appender(Implementation.Target target) {
                return new ByteCodeAppender.Simple(MethodVariableAccess.loadThis(), MethodInvocation.invoke(this.objectTypeDefaultConstructor), MethodReturn.VOID);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class InstanceFieldConstructor implements Implementation {
            private final TypeDescription instrumentedType;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((InstanceFieldConstructor) obj).instrumentedType);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode();
            }

            protected InstanceFieldConstructor(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType.withField(new FieldDescription.Token(C3664q2.p, 18, this.instrumentedType.asGenericType()));
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
            public ByteCodeAppender appender(Implementation.Target target) {
                return new Appender(target);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Appender implements ByteCodeAppender {
                private final FieldDescription fieldDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Appender) obj).fieldDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode();
                }

                protected Appender(Implementation.Target target) {
                    this.fieldDescription = (FieldDescription) target.getInstrumentedType().getDeclaredFields().filter(ElementMatchers.named(C3664q2.p)).getOnly();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                    return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.loadThis(), MethodInvocation.invoke(StaticFieldConstructor.INSTANCE.objectTypeDefaultConstructor), MethodVariableAccess.allArgumentsOf(methodDescription.asDefined()).prependThisReference(), FieldAccess.forField(this.fieldDescription).write(), MethodReturn.VOID).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class FieldGetter implements Implementation {
            private final Assigner assigner;
            private final FieldDescription fieldDescription;
            private final MethodAccessorFactory methodAccessorFactory;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                FieldGetter fieldGetter = (FieldGetter) obj;
                return this.fieldDescription.equals(fieldGetter.fieldDescription) && this.assigner.equals(fieldGetter.assigner) && this.methodAccessorFactory.equals(fieldGetter.methodAccessorFactory);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.methodAccessorFactory.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            protected FieldGetter(FieldDescription fieldDescription, Assigner assigner, MethodAccessorFactory methodAccessorFactory) {
                this.fieldDescription = fieldDescription;
                this.assigner = assigner;
                this.methodAccessorFactory = methodAccessorFactory;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
            public ByteCodeAppender appender(Implementation.Target target) {
                return new Appender(target);
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class Appender implements ByteCodeAppender {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Appender appender = (Appender) obj;
                    return this.typeDescription.equals(appender.typeDescription) && FieldGetter.this.equals(FieldGetter.this);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode()) * 31) + FieldGetter.this.hashCode();
                }

                protected Appender(Implementation.Target target) {
                    this.typeDescription = target.getInstrumentedType();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                    MethodDescription.InDefinedShape registerGetterFor = FieldGetter.this.methodAccessorFactory.registerGetterFor(FieldGetter.this.fieldDescription, MethodAccessorFactory.AccessType.DEFAULT);
                    StackManipulation[] stackManipulationArr = new StackManipulation[4];
                    stackManipulationArr[0] = FieldGetter.this.fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : new StackManipulation.Compound(MethodVariableAccess.loadThis(), FieldAccess.forField((FieldDescription.InDefinedShape) this.typeDescription.getDeclaredFields().filter(ElementMatchers.named(C3664q2.p)).getOnly()).read());
                    stackManipulationArr[1] = MethodInvocation.invoke((MethodDescription) registerGetterFor);
                    stackManipulationArr[2] = FieldGetter.this.assigner.assign(registerGetterFor.getReturnType(), methodDescription.getReturnType(), Assigner.Typing.DYNAMIC);
                    stackManipulationArr[3] = MethodReturn.of(methodDescription.getReturnType().asErasure());
                    return new ByteCodeAppender.Size(new StackManipulation.Compound(stackManipulationArr).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class FieldSetter implements Implementation {
            private final Assigner assigner;
            private final FieldDescription fieldDescription;
            private final MethodAccessorFactory methodAccessorFactory;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                FieldSetter fieldSetter = (FieldSetter) obj;
                return this.fieldDescription.equals(fieldSetter.fieldDescription) && this.assigner.equals(fieldSetter.assigner) && this.methodAccessorFactory.equals(fieldSetter.methodAccessorFactory);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.methodAccessorFactory.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            protected FieldSetter(FieldDescription fieldDescription, Assigner assigner, MethodAccessorFactory methodAccessorFactory) {
                this.fieldDescription = fieldDescription;
                this.assigner = assigner;
                this.methodAccessorFactory = methodAccessorFactory;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
            public ByteCodeAppender appender(Implementation.Target target) {
                return new Appender(target);
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class Appender implements ByteCodeAppender {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Appender appender = (Appender) obj;
                    return this.typeDescription.equals(appender.typeDescription) && FieldSetter.this.equals(FieldSetter.this);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode()) * 31) + FieldSetter.this.hashCode();
                }

                protected Appender(Implementation.Target target) {
                    this.typeDescription = target.getInstrumentedType();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                    TypeDescription.Generic type = ((ParameterDescription) methodDescription.getParameters().get(0)).getType();
                    MethodDescription.InDefinedShape registerSetterFor = FieldSetter.this.methodAccessorFactory.registerSetterFor(FieldSetter.this.fieldDescription, MethodAccessorFactory.AccessType.DEFAULT);
                    StackManipulation[] stackManipulationArr = new StackManipulation[5];
                    stackManipulationArr[0] = FieldSetter.this.fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : new StackManipulation.Compound(MethodVariableAccess.loadThis(), FieldAccess.forField((FieldDescription.InDefinedShape) this.typeDescription.getDeclaredFields().filter(ElementMatchers.named(C3664q2.p)).getOnly()).read());
                    stackManipulationArr[1] = MethodVariableAccess.of(type).loadFrom(1);
                    stackManipulationArr[2] = FieldSetter.this.assigner.assign(type, ((ParameterDescription) registerSetterFor.getParameters().get(0)).getType(), Assigner.Typing.DYNAMIC);
                    stackManipulationArr[3] = MethodInvocation.invoke((MethodDescription) registerSetterFor);
                    stackManipulationArr[4] = MethodReturn.VOID;
                    return new ByteCodeAppender.Size(new StackManipulation.Compound(stackManipulationArr).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class AccessorProxy implements AuxiliaryType, StackManipulation {
            protected static final String FIELD_NAME = "instance";
            private final Assigner assigner;
            private final FieldDescription fieldDescription;
            private final FieldResolver fieldResolver;
            private final TypeDescription instrumentedType;
            private final boolean serializableProxy;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                AccessorProxy accessorProxy = (AccessorProxy) obj;
                return this.fieldDescription.equals(accessorProxy.fieldDescription) && this.instrumentedType.equals(accessorProxy.instrumentedType) && this.fieldResolver.equals(accessorProxy.fieldResolver) && this.assigner.equals(accessorProxy.assigner) && this.serializableProxy == accessorProxy.serializableProxy && Binder.this.equals(Binder.this);
            }

            public int hashCode() {
                return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode()) * 31) + this.instrumentedType.hashCode()) * 31) + this.fieldResolver.hashCode()) * 31) + this.assigner.hashCode()) * 31) + (this.serializableProxy ? 1 : 0)) * 31) + Binder.this.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return true;
            }

            protected AccessorProxy(FieldDescription fieldDescription, TypeDescription typeDescription, FieldResolver fieldResolver, Assigner assigner, boolean z) {
                this.fieldDescription = fieldDescription;
                this.instrumentedType = typeDescription;
                this.fieldResolver = fieldResolver;
                this.assigner = assigner;
                this.serializableProxy = z;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType
            public DynamicType make(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
                List singletonList;
                FieldResolver fieldResolver = this.fieldResolver;
                DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<?> defineConstructor = new ByteBuddy(classFileVersion).with(TypeValidation.DISABLED).subclass(this.fieldResolver.getProxyType(), ConstructorStrategy.Default.NO_CONSTRUCTORS).name(str).modifiers(DEFAULT_TYPE_MODIFIER).implement(this.serializableProxy ? new Class[]{Serializable.class} : new Class[0]).defineConstructor(new ModifierContributor.ForMethod[0]);
                if (this.fieldDescription.isStatic()) {
                    singletonList = Collections.emptyList();
                } else {
                    singletonList = Collections.singletonList(this.instrumentedType);
                }
                return fieldResolver.apply(defineConstructor.withParameters((Collection<? extends TypeDefinition>) singletonList).intercept(this.fieldDescription.isStatic() ? StaticFieldConstructor.INSTANCE : new InstanceFieldConstructor(this.instrumentedType)), this.fieldDescription, this.assigner, methodAccessorFactory).make();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                TypeDescription register = context.register(this);
                StackManipulation[] stackManipulationArr = new StackManipulation[4];
                stackManipulationArr[0] = TypeCreation.of(register);
                stackManipulationArr[1] = Duplication.SINGLE;
                stackManipulationArr[2] = this.fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                stackManipulationArr[3] = MethodInvocation.invoke((MethodDescription.InDefinedShape) register.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly());
                return new StackManipulation.Compound(stackManipulationArr).apply(methodVisitor, context);
            }
        }
    }
}
