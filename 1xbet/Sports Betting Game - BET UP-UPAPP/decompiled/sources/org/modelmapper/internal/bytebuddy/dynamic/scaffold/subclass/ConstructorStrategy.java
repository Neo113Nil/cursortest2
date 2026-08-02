package org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.Transformer;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.modelmapper.internal.bytebuddy.implementation.MethodCall;
import org.modelmapper.internal.bytebuddy.implementation.SuperMethodCall;
import org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.matcher.LatentMatcher;

/* loaded from: classes4.dex */
public interface ConstructorStrategy {
    List<MethodDescription.Token> extractConstructors(TypeDescription typeDescription);

    MethodRegistry inject(TypeDescription typeDescription, MethodRegistry methodRegistry);

    public enum Default implements ConstructorStrategy {
        NO_CONSTRUCTORS { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.1
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            protected MethodRegistry doInject(MethodRegistry methodRegistry, MethodAttributeAppender.Factory factory) {
                return methodRegistry;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            protected List<MethodDescription.Token> doExtractConstructors(TypeDescription typeDescription) {
                return Collections.emptyList();
            }
        },
        DEFAULT_CONSTRUCTOR { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.2
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            protected List<MethodDescription.Token> doExtractConstructors(TypeDescription typeDescription) {
                MethodList filter;
                TypeDescription.Generic superClass = typeDescription.getSuperClass();
                if (superClass == null) {
                    filter = new MethodList.Empty();
                } else {
                    filter = superClass.getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.takesArguments(0)).and(ElementMatchers.isVisibleTo(typeDescription)));
                }
                if (filter.size() == 1) {
                    return Collections.singletonList(new MethodDescription.Token(1));
                }
                throw new IllegalArgumentException(typeDescription.getSuperClass() + " declares no constructor that is visible to " + typeDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            protected MethodRegistry doInject(MethodRegistry methodRegistry, MethodAttributeAppender.Factory factory) {
                return methodRegistry.append(new LatentMatcher.Resolved(ElementMatchers.isConstructor()), new MethodRegistry.Handler.ForImplementation(SuperMethodCall.INSTANCE), factory, Transformer.NoOp.make());
            }
        },
        IMITATE_SUPER_CLASS { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.3
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            protected List<MethodDescription.Token> doExtractConstructors(TypeDescription typeDescription) {
                MethodList filter;
                TypeDescription.Generic superClass = typeDescription.getSuperClass();
                if (superClass == null) {
                    filter = new MethodList.Empty();
                } else {
                    filter = superClass.getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.isVisibleTo(typeDescription)));
                }
                return filter.asTokenList(ElementMatchers.is(typeDescription));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public MethodRegistry doInject(MethodRegistry methodRegistry, MethodAttributeAppender.Factory factory) {
                return methodRegistry.append(new LatentMatcher.Resolved(ElementMatchers.isConstructor()), new MethodRegistry.Handler.ForImplementation(SuperMethodCall.INSTANCE), factory, Transformer.NoOp.make());
            }
        },
        IMITATE_SUPER_CLASS_PUBLIC { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.4
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            protected List<MethodDescription.Token> doExtractConstructors(TypeDescription typeDescription) {
                MethodList filter;
                TypeDescription.Generic superClass = typeDescription.getSuperClass();
                if (superClass == null) {
                    filter = new MethodList.Empty();
                } else {
                    filter = superClass.getDeclaredMethods().filter(ElementMatchers.isPublic().and(ElementMatchers.isConstructor()));
                }
                return filter.asTokenList(ElementMatchers.is(typeDescription));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public MethodRegistry doInject(MethodRegistry methodRegistry, MethodAttributeAppender.Factory factory) {
                return methodRegistry.append(new LatentMatcher.Resolved(ElementMatchers.isConstructor()), new MethodRegistry.Handler.ForImplementation(SuperMethodCall.INSTANCE), factory, Transformer.NoOp.make());
            }
        },
        IMITATE_SUPER_CLASS_OPENING { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.5
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            protected int resolveModifier(int i) {
                return 1;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            protected List<MethodDescription.Token> doExtractConstructors(TypeDescription typeDescription) {
                MethodList filter;
                TypeDescription.Generic superClass = typeDescription.getSuperClass();
                if (superClass == null) {
                    filter = new MethodList.Empty();
                } else {
                    filter = superClass.getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.isVisibleTo(typeDescription)));
                }
                return filter.asTokenList(ElementMatchers.is(typeDescription));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public MethodRegistry doInject(MethodRegistry methodRegistry, MethodAttributeAppender.Factory factory) {
                return methodRegistry.append(new LatentMatcher.Resolved(ElementMatchers.isConstructor()), new MethodRegistry.Handler.ForImplementation(SuperMethodCall.INSTANCE), factory, Transformer.NoOp.make());
            }
        };

        protected abstract List<MethodDescription.Token> doExtractConstructors(TypeDescription typeDescription);

        protected abstract MethodRegistry doInject(MethodRegistry methodRegistry, MethodAttributeAppender.Factory factory);

        protected int resolveModifier(int i) {
            return i;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public List<MethodDescription.Token> extractConstructors(TypeDescription typeDescription) {
            List<MethodDescription.Token> doExtractConstructors = doExtractConstructors(typeDescription);
            ArrayList arrayList = new ArrayList(doExtractConstructors.size());
            for (MethodDescription.Token token : doExtractConstructors) {
                arrayList.add(new MethodDescription.Token(token.getName(), resolveModifier(token.getModifiers()), token.getTypeVariableTokens(), token.getReturnType(), token.getParameterTokens(), token.getExceptionTypes(), token.getAnnotations(), token.getDefaultValue(), TypeDescription.Generic.UNDEFINED));
            }
            return arrayList;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public MethodRegistry inject(TypeDescription typeDescription, MethodRegistry methodRegistry) {
            return doInject(methodRegistry, MethodAttributeAppender.NoOp.INSTANCE);
        }

        public ConstructorStrategy with(MethodAttributeAppender.Factory factory) {
            return new WithMethodAttributeAppenderFactory(this, factory);
        }

        public ConstructorStrategy withInheritedAnnotations() {
            return new WithMethodAttributeAppenderFactory(this, MethodAttributeAppender.ForInstrumentedMethod.EXCLUDING_RECEIVER);
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class WithMethodAttributeAppenderFactory implements ConstructorStrategy {
            private final Default delegate;
            private final MethodAttributeAppender.Factory methodAttributeAppenderFactory;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                WithMethodAttributeAppenderFactory withMethodAttributeAppenderFactory = (WithMethodAttributeAppenderFactory) obj;
                return this.delegate.equals(withMethodAttributeAppenderFactory.delegate) && this.methodAttributeAppenderFactory.equals(withMethodAttributeAppenderFactory.methodAttributeAppenderFactory);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.delegate.hashCode()) * 31) + this.methodAttributeAppenderFactory.hashCode();
            }

            protected WithMethodAttributeAppenderFactory(Default r1, MethodAttributeAppender.Factory factory) {
                this.delegate = r1;
                this.methodAttributeAppenderFactory = factory;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
            public List<MethodDescription.Token> extractConstructors(TypeDescription typeDescription) {
                return this.delegate.extractConstructors(typeDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
            public MethodRegistry inject(TypeDescription typeDescription, MethodRegistry methodRegistry) {
                return this.delegate.doInject(methodRegistry, this.methodAttributeAppenderFactory);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForDefaultConstructor implements ConstructorStrategy {
        private final ElementMatcher<? super MethodDescription> elementMatcher;
        private final MethodAttributeAppender.Factory methodAttributeAppenderFactory;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ForDefaultConstructor forDefaultConstructor = (ForDefaultConstructor) obj;
            return this.elementMatcher.equals(forDefaultConstructor.elementMatcher) && this.methodAttributeAppenderFactory.equals(forDefaultConstructor.methodAttributeAppenderFactory);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.elementMatcher.hashCode()) * 31) + this.methodAttributeAppenderFactory.hashCode();
        }

        public ForDefaultConstructor() {
            this(ElementMatchers.any());
        }

        public ForDefaultConstructor(ElementMatcher<? super MethodDescription> elementMatcher) {
            this(elementMatcher, MethodAttributeAppender.NoOp.INSTANCE);
        }

        public ForDefaultConstructor(MethodAttributeAppender.Factory factory) {
            this(ElementMatchers.any(), factory);
        }

        public ForDefaultConstructor(ElementMatcher<? super MethodDescription> elementMatcher, MethodAttributeAppender.Factory factory) {
            this.elementMatcher = elementMatcher;
            this.methodAttributeAppenderFactory = factory;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public List<MethodDescription.Token> extractConstructors(TypeDescription typeDescription) {
            if (typeDescription.getSuperClass().getDeclaredMethods().filter(ElementMatchers.isConstructor()).isEmpty()) {
                throw new IllegalStateException("Cannot define default constructor for class without super class constructor");
            }
            return Collections.singletonList(new MethodDescription.Token(1));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public MethodRegistry inject(TypeDescription typeDescription, MethodRegistry methodRegistry) {
            MethodList filter = typeDescription.getSuperClass().getDeclaredMethods().filter(ElementMatchers.isConstructor().and(this.elementMatcher));
            if (filter.isEmpty()) {
                throw new IllegalStateException("No possible candidate for super constructor invocation in " + typeDescription.getSuperClass());
            }
            if (!filter.filter(ElementMatchers.takesArguments(0)).isEmpty()) {
                filter = (MethodList) filter.filter(ElementMatchers.takesArguments(0));
            } else if (filter.size() > 1) {
                throw new IllegalStateException("More than one possible super constructor for constructor delegation: " + filter);
            }
            MethodCall invoke = MethodCall.invoke((MethodDescription) filter.getOnly());
            Iterator it = ((MethodDescription) filter.getOnly()).getParameters().asTypeList().asErasures().iterator();
            while (it.hasNext()) {
                invoke = invoke.with(((TypeDescription) it.next()).getDefaultValue());
            }
            return methodRegistry.append(new LatentMatcher.Resolved(ElementMatchers.isConstructor().and(ElementMatchers.takesArguments(0))), new MethodRegistry.Handler.ForImplementation(invoke), this.methodAttributeAppenderFactory, Transformer.NoOp.make());
        }
    }
}
