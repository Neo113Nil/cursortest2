package org.modelmapper.internal.bytebuddy.description.method;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement;
import org.modelmapper.internal.bytebuddy.description.ModifierReviewable;
import org.modelmapper.internal.bytebuddy.description.NamedElement;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

/* loaded from: classes4.dex */
public interface ParameterDescription extends AnnotationSource, NamedElement.WithRuntimeName, NamedElement.WithOptionalName, ModifierReviewable.ForParameterDescription, ByteCodeElement.TypeDependant<InDefinedShape, Token> {
    public static final String NAME_PREFIX = "arg";

    public interface InDefinedShape extends ParameterDescription {

        public static abstract class AbstractBase extends AbstractBase implements InDefinedShape {
            @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
            public InDefinedShape asDefined() {
                return this;
            }
        }

        MethodDescription.InDefinedShape getDeclaringMethod();
    }

    public interface InGenericShape extends ParameterDescription {
        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.InDefinedShape
        MethodDescription.InGenericShape getDeclaringMethod();
    }

    MethodDescription getDeclaringMethod();

    int getIndex();

    int getOffset();

    TypeDescription.Generic getType();

    boolean hasModifiers();

    public static abstract class AbstractBase extends ModifierReviewable.AbstractBase implements ParameterDescription {
        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return 0;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
        public /* bridge */ /* synthetic */ Token asToken(ElementMatcher elementMatcher) {
            return asToken2((ElementMatcher<? super TypeDescription>) elementMatcher);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return ParameterDescription.NAME_PREFIX.concat(String.valueOf(getIndex()));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getInternalName() {
            return getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
        public String getActualName() {
            return isNamed() ? getName() : "";
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public int getOffset() {
            int size;
            TypeList asErasures = getDeclaringMethod().getParameters().asTypeList().asErasures();
            if (getDeclaringMethod().isStatic()) {
                size = StackSize.ZERO.getSize();
            } else {
                size = StackSize.SINGLE.getSize();
            }
            for (int i = 0; i < getIndex(); i++) {
                size += ((TypeDescription) asErasures.get(i)).getStackSize().getSize();
            }
            return size;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
        /* renamed from: asToken, reason: avoid collision after fix types in other method */
        public Token asToken2(ElementMatcher<? super TypeDescription> elementMatcher) {
            return new Token((TypeDescription.Generic) getType().accept(new TypeDescription.Generic.Visitor.Substitutor.ForDetachment(elementMatcher)), getDeclaredAnnotations(), isNamed() ? getName() : Token.NO_NAME, hasModifiers() ? Integer.valueOf(getModifiers()) : Token.NO_MODIFIERS);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParameterDescription)) {
                return false;
            }
            ParameterDescription parameterDescription = (ParameterDescription) obj;
            return getDeclaringMethod().equals(parameterDescription.getDeclaringMethod()) && getIndex() == parameterDescription.getIndex();
        }

        public int hashCode() {
            return getDeclaringMethod().hashCode() ^ getIndex();
        }

        public String toString() {
            String name;
            StringBuilder sb = new StringBuilder(Modifier.toString(getModifiers()));
            if (getModifiers() != 0) {
                sb.append(' ');
            }
            if (isVarArgs()) {
                name = getType().asErasure().getName().replaceFirst("\\[\\]$", "...");
            } else {
                name = getType().asErasure().getName();
            }
            sb.append(name);
            return sb.append(' ').append(getName()).toString();
        }
    }

    public static abstract class ForLoadedParameter<T extends AccessibleObject> extends InDefinedShape.AbstractBase {
        private static final Dispatcher DISPATCHER = (Dispatcher) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);
        protected final T executable;
        protected final int index;
        protected final ParameterAnnotationSource parameterAnnotationSource;

        protected ForLoadedParameter(T t, int i, ParameterAnnotationSource parameterAnnotationSource) {
            this.executable = t;
            this.index = i;
            this.parameterAnnotationSource = parameterAnnotationSource;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return DISPATCHER.getName(this.executable, this.index);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public int getIndex() {
            return this.index;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithOptionalName
        public boolean isNamed() {
            return DISPATCHER.isNamePresent(this.executable, this.index);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return DISPATCHER.getModifiers(this.executable, this.index);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public boolean hasModifiers() {
            return isNamed() || getModifiers() != 0;
        }

        public interface ParameterAnnotationSource {
            Annotation[][] getParameterAnnotations();

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForLoadedConstructor implements ParameterAnnotationSource {
                private final Constructor<?> constructor;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.constructor.equals(((ForLoadedConstructor) obj).constructor);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.constructor.hashCode();
                }

                public ForLoadedConstructor(Constructor<?> constructor) {
                    this.constructor = constructor;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource
                public Annotation[][] getParameterAnnotations() {
                    return this.constructor.getParameterAnnotations();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForLoadedMethod implements ParameterAnnotationSource {
                private final Method method;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.method.equals(((ForLoadedMethod) obj).method);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.method.hashCode();
                }

                public ForLoadedMethod(Method method) {
                    this.method = method;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource
                public Annotation[][] getParameterAnnotations() {
                    return this.method.getParameterAnnotations();
                }
            }
        }

        protected interface Dispatcher {
            int getModifiers(AccessibleObject accessibleObject, int i);

            String getName(AccessibleObject accessibleObject, int i);

            boolean isNamePresent(AccessibleObject accessibleObject, int i);

            public enum CreationAction implements PrivilegedAction<Dispatcher> {
                INSTANCE;

                @Override // java.security.PrivilegedAction
                public Dispatcher run() {
                    try {
                        Class<?> cls = Class.forName("java.lang.reflect.Executable");
                        Class<?> cls2 = Class.forName("java.lang.reflect.Parameter");
                        return new ForJava8CapableVm(cls.getMethod("getParameters", new Class[0]), cls2.getMethod("getName", new Class[0]), cls2.getMethod("isNamePresent", new Class[0]), cls2.getMethod("getModifiers", new Class[0]));
                    } catch (Exception unused) {
                        return ForLegacyVm.INSTANCE;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForJava8CapableVm implements Dispatcher {
                private static final Object[] NO_ARGUMENTS = new Object[0];
                private final Method getModifiers;
                private final Method getName;
                private final Method getParameters;
                private final Method isNamePresent;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForJava8CapableVm forJava8CapableVm = (ForJava8CapableVm) obj;
                    return this.getParameters.equals(forJava8CapableVm.getParameters) && this.getName.equals(forJava8CapableVm.getName) && this.isNamePresent.equals(forJava8CapableVm.isNamePresent) && this.getModifiers.equals(forJava8CapableVm.getModifiers);
                }

                public int hashCode() {
                    return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.getParameters.hashCode()) * 31) + this.getName.hashCode()) * 31) + this.isNamePresent.hashCode()) * 31) + this.getModifiers.hashCode();
                }

                protected ForJava8CapableVm(Method method, Method method2, Method method3, Method method4) {
                    this.getParameters = method;
                    this.getName = method2;
                    this.isNamePresent = method3;
                    this.getModifiers = method4;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.Dispatcher
                public int getModifiers(AccessibleObject accessibleObject, int i) {
                    try {
                        return ((Integer) this.getModifiers.invoke(getParameter(accessibleObject, i), NO_ARGUMENTS)).intValue();
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.Parameter#getModifiers", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.Parameter#getModifiers", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.Dispatcher
                public boolean isNamePresent(AccessibleObject accessibleObject, int i) {
                    try {
                        return ((Boolean) this.isNamePresent.invoke(getParameter(accessibleObject, i), NO_ARGUMENTS)).booleanValue();
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.Parameter#isNamePresent", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.Parameter#isNamePresent", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.Dispatcher
                public String getName(AccessibleObject accessibleObject, int i) {
                    try {
                        return (String) this.getName.invoke(getParameter(accessibleObject, i), NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.Parameter#getName", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.Parameter#getName", e2.getCause());
                    }
                }

                private Object getParameter(AccessibleObject accessibleObject, int i) {
                    try {
                        return Array.get(this.getParameters.invoke(accessibleObject, NO_ARGUMENTS), i);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.Executable#getParameters", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.Executable#getParameters", e2.getCause());
                    }
                }
            }

            public enum ForLegacyVm implements Dispatcher {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.Dispatcher
                public int getModifiers(AccessibleObject accessibleObject, int i) {
                    throw new IllegalStateException("Cannot dispatch method for java.lang.reflect.Parameter");
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.Dispatcher
                public boolean isNamePresent(AccessibleObject accessibleObject, int i) {
                    throw new IllegalStateException("Cannot dispatch method for java.lang.reflect.Parameter");
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.Dispatcher
                public String getName(AccessibleObject accessibleObject, int i) {
                    throw new IllegalStateException("Cannot dispatch method for java.lang.reflect.Parameter");
                }
            }
        }

        protected static class OfMethod extends ForLoadedParameter<Method> {
            protected OfMethod(Method method, int i, ParameterAnnotationSource parameterAnnotationSource) {
                super(method, i, parameterAnnotationSource);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.InDefinedShape
            public MethodDescription.InDefinedShape getDeclaringMethod() {
                return new MethodDescription.ForLoadedMethod((Method) this.executable);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
            public TypeDescription.Generic getType() {
                if (TypeDescription.AbstractBase.RAW_TYPES) {
                    return TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(((Method) this.executable).getParameterTypes()[this.index]);
                }
                return new TypeDescription.Generic.LazyProjection.OfMethodParameter((Method) this.executable, this.index, ((Method) this.executable).getParameterTypes());
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
            public AnnotationList getDeclaredAnnotations() {
                return new AnnotationList.ForLoadedAnnotations(this.parameterAnnotationSource.getParameterAnnotations()[this.index]);
            }
        }

        protected static class OfConstructor extends ForLoadedParameter<Constructor<?>> {
            protected OfConstructor(Constructor<?> constructor, int i, ParameterAnnotationSource parameterAnnotationSource) {
                super(constructor, i, parameterAnnotationSource);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.InDefinedShape
            public MethodDescription.InDefinedShape getDeclaringMethod() {
                return new MethodDescription.ForLoadedConstructor((Constructor) this.executable);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
            public TypeDescription.Generic getType() {
                if (TypeDescription.AbstractBase.RAW_TYPES) {
                    return TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(((Constructor) this.executable).getParameterTypes()[this.index]);
                }
                return new TypeDescription.Generic.LazyProjection.OfConstructorParameter((Constructor) this.executable, this.index, ((Constructor) this.executable).getParameterTypes());
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
            public AnnotationList getDeclaredAnnotations() {
                Annotation[][] parameterAnnotations = this.parameterAnnotationSource.getParameterAnnotations();
                MethodDescription.InDefinedShape declaringMethod = getDeclaringMethod();
                if (parameterAnnotations.length != declaringMethod.getParameters().size() && declaringMethod.getDeclaringType().isInnerClass()) {
                    return this.index == 0 ? new AnnotationList.Empty() : new AnnotationList.ForLoadedAnnotations(parameterAnnotations[this.index - 1]);
                }
                return new AnnotationList.ForLoadedAnnotations(parameterAnnotations[this.index]);
            }
        }

        protected static class OfLegacyVmMethod extends InDefinedShape.AbstractBase {
            private final int index;
            private final Method method;
            private final ParameterAnnotationSource parameterAnnotationSource;
            private final Class<?>[] parameterType;

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
            public boolean hasModifiers() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithOptionalName
            public boolean isNamed() {
                return false;
            }

            protected OfLegacyVmMethod(Method method, int i, Class<?>[] clsArr, ParameterAnnotationSource parameterAnnotationSource) {
                this.method = method;
                this.index = i;
                this.parameterType = clsArr;
                this.parameterAnnotationSource = parameterAnnotationSource;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
            public TypeDescription.Generic getType() {
                if (TypeDescription.AbstractBase.RAW_TYPES) {
                    return TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(this.parameterType[this.index]);
                }
                return new TypeDescription.Generic.LazyProjection.OfMethodParameter(this.method, this.index, this.parameterType);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.InDefinedShape
            public MethodDescription.InDefinedShape getDeclaringMethod() {
                return new MethodDescription.ForLoadedMethod(this.method);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
            public int getIndex() {
                return this.index;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
            public AnnotationList getDeclaredAnnotations() {
                return new AnnotationList.ForLoadedAnnotations(this.parameterAnnotationSource.getParameterAnnotations()[this.index]);
            }
        }

        protected static class OfLegacyVmConstructor extends InDefinedShape.AbstractBase {
            private final Constructor<?> constructor;
            private final int index;
            private final ParameterAnnotationSource parameterAnnotationSource;
            private final Class<?>[] parameterType;

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
            public boolean hasModifiers() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithOptionalName
            public boolean isNamed() {
                return false;
            }

            protected OfLegacyVmConstructor(Constructor<?> constructor, int i, Class<?>[] clsArr, ParameterAnnotationSource parameterAnnotationSource) {
                this.constructor = constructor;
                this.index = i;
                this.parameterType = clsArr;
                this.parameterAnnotationSource = parameterAnnotationSource;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
            public TypeDescription.Generic getType() {
                if (TypeDescription.AbstractBase.RAW_TYPES) {
                    return TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(this.parameterType[this.index]);
                }
                return new TypeDescription.Generic.LazyProjection.OfConstructorParameter(this.constructor, this.index, this.parameterType);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.InDefinedShape
            public MethodDescription.InDefinedShape getDeclaringMethod() {
                return new MethodDescription.ForLoadedConstructor(this.constructor);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
            public int getIndex() {
                return this.index;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
            public AnnotationList getDeclaredAnnotations() {
                MethodDescription.InDefinedShape declaringMethod = getDeclaringMethod();
                Annotation[][] parameterAnnotations = this.parameterAnnotationSource.getParameterAnnotations();
                if (parameterAnnotations.length != declaringMethod.getParameters().size() && declaringMethod.getDeclaringType().isInnerClass()) {
                    return this.index == 0 ? new AnnotationList.Empty() : new AnnotationList.ForLoadedAnnotations(parameterAnnotations[this.index - 1]);
                }
                return new AnnotationList.ForLoadedAnnotations(parameterAnnotations[this.index]);
            }
        }
    }

    public static class Latent extends InDefinedShape.AbstractBase {
        private final List<? extends AnnotationDescription> declaredAnnotations;
        private final MethodDescription.InDefinedShape declaringMethod;
        private final int index;
        private final Integer modifiers;
        private final String name;
        private final int offset;
        private final TypeDescription.Generic parameterType;

        public Latent(MethodDescription.InDefinedShape inDefinedShape, Token token, int i, int i2) {
            this(inDefinedShape, token.getType(), token.getAnnotations(), token.getName(), token.getModifiers(), i, i2);
        }

        public Latent(MethodDescription.InDefinedShape inDefinedShape, TypeDescription.Generic generic, int i, int i2) {
            this(inDefinedShape, generic, Collections.emptyList(), Token.NO_NAME, Token.NO_MODIFIERS, i, i2);
        }

        public Latent(MethodDescription.InDefinedShape inDefinedShape, TypeDescription.Generic generic, List<? extends AnnotationDescription> list, String str, Integer num, int i, int i2) {
            this.declaringMethod = inDefinedShape;
            this.parameterType = generic;
            this.declaredAnnotations = list;
            this.name = str;
            this.modifiers = num;
            this.index = i;
            this.offset = i2;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public TypeDescription.Generic getType() {
            return (TypeDescription.Generic) this.parameterType.accept(TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(this));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.InDefinedShape
        public MethodDescription.InDefinedShape getDeclaringMethod() {
            return this.declaringMethod;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public int getIndex() {
            return this.index;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public int getOffset() {
            return this.offset;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithOptionalName
        public boolean isNamed() {
            return this.name != null;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public boolean hasModifiers() {
            return this.modifiers != null;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return isNamed() ? this.name : super.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            if (hasModifiers()) {
                return this.modifiers.intValue();
            }
            return super.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Explicit(this.declaredAnnotations);
        }
    }

    public static class TypeSubstituting extends AbstractBase implements InGenericShape {
        private final MethodDescription.InGenericShape declaringMethod;
        private final ParameterDescription parameterDescription;
        private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

        public TypeSubstituting(MethodDescription.InGenericShape inGenericShape, ParameterDescription parameterDescription, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
            this.declaringMethod = inGenericShape;
            this.parameterDescription = parameterDescription;
            this.visitor = visitor;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public TypeDescription.Generic getType() {
            return (TypeDescription.Generic) this.parameterDescription.getType().accept(this.visitor);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.InDefinedShape
        public MethodDescription.InGenericShape getDeclaringMethod() {
            return this.declaringMethod;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public int getIndex() {
            return this.parameterDescription.getIndex();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithOptionalName
        public boolean isNamed() {
            return this.parameterDescription.isNamed();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public boolean hasModifiers() {
            return this.parameterDescription.hasModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
        public int getOffset() {
            return this.parameterDescription.getOffset();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.parameterDescription.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.parameterDescription.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return this.parameterDescription.getDeclaredAnnotations();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
        public InDefinedShape asDefined() {
            return this.parameterDescription.asDefined();
        }
    }

    public static class Token implements ByteCodeElement.Token<Token> {
        public static final Integer NO_MODIFIERS = null;
        public static final String NO_NAME = null;
        private final List<? extends AnnotationDescription> annotations;
        private final Integer modifiers;
        private final String name;
        private final TypeDescription.Generic type;

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.Token
        public /* bridge */ /* synthetic */ Token accept(TypeDescription.Generic.Visitor visitor) {
            return accept2((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) visitor);
        }

        public Token(TypeDescription.Generic generic) {
            this(generic, Collections.emptyList());
        }

        public Token(TypeDescription.Generic generic, List<? extends AnnotationDescription> list) {
            this(generic, list, NO_NAME, NO_MODIFIERS);
        }

        public Token(TypeDescription.Generic generic, String str, Integer num) {
            this(generic, Collections.emptyList(), str, num);
        }

        public Token(TypeDescription.Generic generic, List<? extends AnnotationDescription> list, String str, Integer num) {
            this.type = generic;
            this.annotations = list;
            this.name = str;
            this.modifiers = num;
        }

        public TypeDescription.Generic getType() {
            return this.type;
        }

        public AnnotationList getAnnotations() {
            return new AnnotationList.Explicit(this.annotations);
        }

        public String getName() {
            return this.name;
        }

        public Integer getModifiers() {
            return this.modifiers;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.Token
        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public Token accept2(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
            return new Token((TypeDescription.Generic) this.type.accept(visitor), this.annotations, this.name, this.modifiers);
        }

        public boolean equals(Object obj) {
            String str;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.type.equals(token.type) && this.annotations.equals(token.annotations) && ((str = this.name) == null ? token.name == null : str.equals(token.name))) {
                Integer num = this.modifiers;
                if (num != null) {
                    if (num.equals(token.modifiers)) {
                        return true;
                    }
                } else if (token.modifiers == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.type.hashCode() * 31) + this.annotations.hashCode()) * 31;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.modifiers;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "ParameterDescription.Token{type=" + this.type + ", annotations=" + this.annotations + ", name='" + this.name + "', modifiers=" + this.modifiers + AbstractJsonLexerKt.END_OBJ;
        }

        public static class TypeList extends AbstractList<Token> {
            private final List<? extends TypeDefinition> typeDescriptions;

            public TypeList(List<? extends TypeDefinition> list) {
                this.typeDescriptions = list;
            }

            @Override // java.util.AbstractList, java.util.List
            public Token get(int i) {
                return new Token(this.typeDescriptions.get(i).asGenericType());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.typeDescriptions.size();
            }
        }
    }
}
