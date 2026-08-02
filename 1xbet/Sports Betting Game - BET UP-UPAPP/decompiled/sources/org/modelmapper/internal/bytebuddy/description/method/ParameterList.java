package org.modelmapper.internal.bytebuddy.description.method;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.FilterableList;

/* loaded from: classes4.dex */
public interface ParameterList<T extends ParameterDescription> extends FilterableList<T, ParameterList<T>> {
    ParameterList<ParameterDescription.InDefinedShape> asDefined();

    ByteCodeElement.Token.TokenList<ParameterDescription.Token> asTokenList(ElementMatcher<? super TypeDescription> elementMatcher);

    TypeList.Generic asTypeList();

    boolean hasExplicitMetaData();

    public static abstract class AbstractBase<S extends ParameterDescription> extends FilterableList.AbstractBase<S, ParameterList<S>> implements ParameterList<S> {
        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList
        public boolean hasExplicitMetaData() {
            Iterator it = iterator();
            while (it.hasNext()) {
                ParameterDescription parameterDescription = (ParameterDescription) it.next();
                if (!parameterDescription.isNamed() || !parameterDescription.hasModifiers()) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList
        public ByteCodeElement.Token.TokenList<ParameterDescription.Token> asTokenList(ElementMatcher<? super TypeDescription> elementMatcher) {
            ArrayList arrayList = new ArrayList(size());
            Iterator it = iterator();
            while (it.hasNext()) {
                arrayList.add(((ParameterDescription) it.next()).asToken(elementMatcher));
            }
            return new ByteCodeElement.Token.TokenList<>(arrayList);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList
        public TypeList.Generic asTypeList() {
            ArrayList arrayList = new ArrayList(size());
            Iterator it = iterator();
            while (it.hasNext()) {
                arrayList.add(((ParameterDescription) it.next()).getType());
            }
            return new TypeList.Generic.Explicit(arrayList);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList
        public ParameterList<ParameterDescription.InDefinedShape> asDefined() {
            ArrayList arrayList = new ArrayList(size());
            Iterator it = iterator();
            while (it.hasNext()) {
                arrayList.add(((ParameterDescription) it.next()).asDefined());
            }
            return new Explicit(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.modelmapper.internal.bytebuddy.matcher.FilterableList.AbstractBase
        public ParameterList<S> wrap(List<S> list) {
            return new Explicit(list);
        }
    }

    public static abstract class ForLoadedExecutable<T> extends AbstractBase<ParameterDescription.InDefinedShape> {
        private static final Dispatcher DISPATCHER = (Dispatcher) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);
        protected final T executable;
        protected final ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource;

        protected ForLoadedExecutable(T t, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
            this.executable = t;
            this.parameterAnnotationSource = parameterAnnotationSource;
        }

        public static ParameterList<ParameterDescription.InDefinedShape> of(Constructor<?> constructor) {
            return of(constructor, (ParameterDescription.ForLoadedParameter.ParameterAnnotationSource) new ParameterDescription.ForLoadedParameter.ParameterAnnotationSource.ForLoadedConstructor(constructor));
        }

        public static ParameterList<ParameterDescription.InDefinedShape> of(Constructor<?> constructor, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
            return DISPATCHER.describe(constructor, parameterAnnotationSource);
        }

        public static ParameterList<ParameterDescription.InDefinedShape> of(Method method) {
            return of(method, (ParameterDescription.ForLoadedParameter.ParameterAnnotationSource) new ParameterDescription.ForLoadedParameter.ParameterAnnotationSource.ForLoadedMethod(method));
        }

        public static ParameterList<ParameterDescription.InDefinedShape> of(Method method, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
            return DISPATCHER.describe(method, parameterAnnotationSource);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return DISPATCHER.getParameterCount(this.executable);
        }

        protected interface Dispatcher {
            ParameterList<ParameterDescription.InDefinedShape> describe(Constructor<?> constructor, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource);

            ParameterList<ParameterDescription.InDefinedShape> describe(Method method, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource);

            int getParameterCount(Object obj);

            public enum CreationAction implements PrivilegedAction<Dispatcher> {
                INSTANCE;

                @Override // java.security.PrivilegedAction
                public Dispatcher run() {
                    try {
                        return new ForJava8CapableVm(Class.forName("java.lang.reflect.Executable").getMethod("getParameterCount", new Class[0]));
                    } catch (Exception unused) {
                        return ForLegacyVm.INSTANCE;
                    }
                }
            }

            public enum ForLegacyVm implements Dispatcher {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList.ForLoadedExecutable.Dispatcher
                public int getParameterCount(Object obj) {
                    throw new IllegalStateException("Cannot dispatch method for java.lang.reflect.Executable");
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList.ForLoadedExecutable.Dispatcher
                public ParameterList<ParameterDescription.InDefinedShape> describe(Constructor<?> constructor, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
                    return new OfLegacyVmConstructor(constructor, parameterAnnotationSource);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList.ForLoadedExecutable.Dispatcher
                public ParameterList<ParameterDescription.InDefinedShape> describe(Method method, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
                    return new OfLegacyVmMethod(method, parameterAnnotationSource);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForJava8CapableVm implements Dispatcher {
                private static final Object[] NO_ARGUMENTS = new Object[0];
                private final Method getParameterCount;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.getParameterCount.equals(((ForJava8CapableVm) obj).getParameterCount);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.getParameterCount.hashCode();
                }

                protected ForJava8CapableVm(Method method) {
                    this.getParameterCount = method;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList.ForLoadedExecutable.Dispatcher
                public int getParameterCount(Object obj) {
                    try {
                        return ((Integer) this.getParameterCount.invoke(obj, NO_ARGUMENTS)).intValue();
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.Parameter#getModifiers", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.Parameter#getModifiers", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList.ForLoadedExecutable.Dispatcher
                public ParameterList<ParameterDescription.InDefinedShape> describe(Constructor<?> constructor, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
                    return new OfConstructor(constructor, parameterAnnotationSource);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList.ForLoadedExecutable.Dispatcher
                public ParameterList<ParameterDescription.InDefinedShape> describe(Method method, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
                    return new OfMethod(method, parameterAnnotationSource);
                }
            }
        }

        protected static class OfConstructor extends ForLoadedExecutable<Constructor<?>> {
            protected OfConstructor(Constructor<?> constructor, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
                super(constructor, parameterAnnotationSource);
            }

            @Override // java.util.AbstractList, java.util.List
            public ParameterDescription.InDefinedShape get(int i) {
                return new ParameterDescription.ForLoadedParameter.OfConstructor((Constructor) this.executable, i, this.parameterAnnotationSource);
            }
        }

        protected static class OfMethod extends ForLoadedExecutable<Method> {
            protected OfMethod(Method method, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
                super(method, parameterAnnotationSource);
            }

            @Override // java.util.AbstractList, java.util.List
            public ParameterDescription.InDefinedShape get(int i) {
                return new ParameterDescription.ForLoadedParameter.OfMethod((Method) this.executable, i, this.parameterAnnotationSource);
            }
        }

        protected static class OfLegacyVmConstructor extends AbstractBase<ParameterDescription.InDefinedShape> {
            private final Constructor<?> constructor;
            private final ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource;
            private final Class<?>[] parameterType;

            protected OfLegacyVmConstructor(Constructor<?> constructor, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
                this.constructor = constructor;
                this.parameterType = constructor.getParameterTypes();
                this.parameterAnnotationSource = parameterAnnotationSource;
            }

            @Override // java.util.AbstractList, java.util.List
            public ParameterDescription.InDefinedShape get(int i) {
                return new ParameterDescription.ForLoadedParameter.OfLegacyVmConstructor(this.constructor, i, this.parameterType, this.parameterAnnotationSource);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.parameterType.length;
            }
        }

        protected static class OfLegacyVmMethod extends AbstractBase<ParameterDescription.InDefinedShape> {
            private final Method method;
            private final ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource;
            private final Class<?>[] parameterType;

            protected OfLegacyVmMethod(Method method, ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource) {
                this.method = method;
                this.parameterType = method.getParameterTypes();
                this.parameterAnnotationSource = parameterAnnotationSource;
            }

            @Override // java.util.AbstractList, java.util.List
            public ParameterDescription.InDefinedShape get(int i) {
                return new ParameterDescription.ForLoadedParameter.OfLegacyVmMethod(this.method, i, this.parameterType, this.parameterAnnotationSource);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.parameterType.length;
            }
        }
    }

    public static class Explicit<S extends ParameterDescription> extends AbstractBase<S> {
        private final List<? extends S> parameterDescriptions;

        public Explicit(S... sArr) {
            this(Arrays.asList(sArr));
        }

        public Explicit(List<? extends S> list) {
            this.parameterDescriptions = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public S get(int i) {
            return this.parameterDescriptions.get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parameterDescriptions.size();
        }

        public static class ForTypes extends AbstractBase<ParameterDescription.InDefinedShape> {
            private final MethodDescription.InDefinedShape methodDescription;
            private final List<? extends TypeDefinition> typeDefinitions;

            public ForTypes(MethodDescription.InDefinedShape inDefinedShape, TypeDefinition... typeDefinitionArr) {
                this(inDefinedShape, (List<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
            }

            public ForTypes(MethodDescription.InDefinedShape inDefinedShape, List<? extends TypeDefinition> list) {
                this.methodDescription = inDefinedShape;
                this.typeDefinitions = list;
            }

            @Override // java.util.AbstractList, java.util.List
            public ParameterDescription.InDefinedShape get(int i) {
                int i2 = !this.methodDescription.isStatic() ? 1 : 0;
                for (int i3 = 0; i3 < i; i3++) {
                    i2 += this.typeDefinitions.get(i3).getStackSize().getSize();
                }
                return new ParameterDescription.Latent(this.methodDescription, this.typeDefinitions.get(i).asGenericType(), i, i2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.typeDefinitions.size();
            }
        }
    }

    public static class ForTokens extends AbstractBase<ParameterDescription.InDefinedShape> {
        private final MethodDescription.InDefinedShape declaringMethod;
        private final List<? extends ParameterDescription.Token> tokens;

        public ForTokens(MethodDescription.InDefinedShape inDefinedShape, List<? extends ParameterDescription.Token> list) {
            this.declaringMethod = inDefinedShape;
            this.tokens = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public ParameterDescription.InDefinedShape get(int i) {
            int i2 = !this.declaringMethod.isStatic() ? 1 : 0;
            Iterator<? extends ParameterDescription.Token> it = this.tokens.subList(0, i).iterator();
            while (it.hasNext()) {
                i2 += it.next().getType().getStackSize().getSize();
            }
            return new ParameterDescription.Latent(this.declaringMethod, this.tokens.get(i), i, i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.tokens.size();
        }
    }

    public static class TypeSubstituting extends AbstractBase<ParameterDescription.InGenericShape> {
        private final MethodDescription.InGenericShape declaringMethod;
        private final List<? extends ParameterDescription> parameterDescriptions;
        private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

        public TypeSubstituting(MethodDescription.InGenericShape inGenericShape, List<? extends ParameterDescription> list, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
            this.declaringMethod = inGenericShape;
            this.parameterDescriptions = list;
            this.visitor = visitor;
        }

        @Override // java.util.AbstractList, java.util.List
        public ParameterDescription.InGenericShape get(int i) {
            return new ParameterDescription.TypeSubstituting(this.declaringMethod, this.parameterDescriptions.get(i), this.visitor);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parameterDescriptions.size();
        }
    }

    public static class Empty<S extends ParameterDescription> extends FilterableList.Empty<S, ParameterList<S>> implements ParameterList<S> {
        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList
        public ParameterList<ParameterDescription.InDefinedShape> asDefined() {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList
        public boolean hasExplicitMetaData() {
            return true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList
        public TypeList.Generic asTypeList() {
            return new TypeList.Generic.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList
        public ByteCodeElement.Token.TokenList<ParameterDescription.Token> asTokenList(ElementMatcher<? super TypeDescription> elementMatcher) {
            return new ByteCodeElement.Token.TokenList<>(new ParameterDescription.Token[0]);
        }
    }
}
