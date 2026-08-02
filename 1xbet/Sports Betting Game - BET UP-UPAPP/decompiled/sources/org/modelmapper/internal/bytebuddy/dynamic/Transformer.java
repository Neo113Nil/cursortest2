package org.modelmapper.internal.bytebuddy.dynamic;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

/* loaded from: classes4.dex */
public interface Transformer<T> {
    T transform(TypeDescription typeDescription, T t);

    public enum NoOp implements Transformer<Object> {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.Transformer
        public Object transform(TypeDescription typeDescription, Object obj) {
            return obj;
        }

        public static <T> Transformer<T> make() {
            return INSTANCE;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForField implements Transformer<FieldDescription> {
        private final Transformer<FieldDescription.Token> transformer;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.transformer.equals(((ForField) obj).transformer);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.transformer.hashCode();
        }

        public ForField(Transformer<FieldDescription.Token> transformer) {
            this.transformer = transformer;
        }

        public static Transformer<FieldDescription> withModifiers(ModifierContributor.ForField... forFieldArr) {
            return withModifiers((List<? extends ModifierContributor.ForField>) Arrays.asList(forFieldArr));
        }

        public static Transformer<FieldDescription> withModifiers(List<? extends ModifierContributor.ForField> list) {
            return new ForField(new FieldModifierTransformer(ModifierContributor.Resolver.of(list)));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.Transformer
        public FieldDescription transform(TypeDescription typeDescription, FieldDescription fieldDescription) {
            return new TransformedField(typeDescription, fieldDescription.getDeclaringType(), this.transformer.transform(typeDescription, fieldDescription.asToken(ElementMatchers.none())), fieldDescription.asDefined());
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class FieldModifierTransformer implements Transformer<FieldDescription.Token> {
            private final ModifierContributor.Resolver<ModifierContributor.ForField> resolver;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.resolver.equals(((FieldModifierTransformer) obj).resolver);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.resolver.hashCode();
            }

            protected FieldModifierTransformer(ModifierContributor.Resolver<ModifierContributor.ForField> resolver) {
                this.resolver = resolver;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.Transformer
            public FieldDescription.Token transform(TypeDescription typeDescription, FieldDescription.Token token) {
                return new FieldDescription.Token(token.getName(), this.resolver.resolve(token.getModifiers()), token.getType(), token.getAnnotations());
            }
        }

        protected static class TransformedField extends FieldDescription.AbstractBase {
            private final TypeDefinition declaringType;
            private final FieldDescription.InDefinedShape fieldDescription;
            private final TypeDescription instrumentedType;
            private final FieldDescription.Token token;

            protected TransformedField(TypeDescription typeDescription, TypeDefinition typeDefinition, FieldDescription.Token token, FieldDescription.InDefinedShape inDefinedShape) {
                this.instrumentedType = typeDescription;
                this.declaringType = typeDefinition;
                this.token = token;
                this.fieldDescription = inDefinedShape;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.field.FieldDescription
            public TypeDescription.Generic getType() {
                return (TypeDescription.Generic) this.token.getType().accept(TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(this.instrumentedType));
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
            public AnnotationList getDeclaredAnnotations() {
                return this.token.getAnnotations();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
            public TypeDefinition getDeclaringType() {
                return this.declaringType;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                return this.token.getModifiers();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
            public FieldDescription.InDefinedShape asDefined() {
                return this.fieldDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
            public String getName() {
                return this.token.getName();
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForMethod implements Transformer<MethodDescription> {
        private final Transformer<MethodDescription.Token> transformer;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.transformer.equals(((ForMethod) obj).transformer);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.transformer.hashCode();
        }

        public ForMethod(Transformer<MethodDescription.Token> transformer) {
            this.transformer = transformer;
        }

        public static Transformer<MethodDescription> withModifiers(ModifierContributor.ForMethod... forMethodArr) {
            return withModifiers((List<? extends ModifierContributor.ForMethod>) Arrays.asList(forMethodArr));
        }

        public static Transformer<MethodDescription> withModifiers(List<? extends ModifierContributor.ForMethod> list) {
            return new ForMethod(new MethodModifierTransformer(ModifierContributor.Resolver.of(list)));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.Transformer
        public MethodDescription transform(TypeDescription typeDescription, MethodDescription methodDescription) {
            return new TransformedMethod(typeDescription, methodDescription.getDeclaringType(), this.transformer.transform(typeDescription, methodDescription.asToken(ElementMatchers.none())), methodDescription.asDefined());
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class MethodModifierTransformer implements Transformer<MethodDescription.Token> {
            private final ModifierContributor.Resolver<ModifierContributor.ForMethod> resolver;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.resolver.equals(((MethodModifierTransformer) obj).resolver);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.resolver.hashCode();
            }

            protected MethodModifierTransformer(ModifierContributor.Resolver<ModifierContributor.ForMethod> resolver) {
                this.resolver = resolver;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.Transformer
            public MethodDescription.Token transform(TypeDescription typeDescription, MethodDescription.Token token) {
                return new MethodDescription.Token(token.getName(), this.resolver.resolve(token.getModifiers()), token.getTypeVariableTokens(), token.getReturnType(), token.getParameterTokens(), token.getExceptionTypes(), token.getAnnotations(), token.getDefaultValue(), token.getReceiverType());
            }
        }

        protected static class TransformedMethod extends MethodDescription.AbstractBase {
            private final TypeDefinition declaringType;
            private final TypeDescription instrumentedType;
            private final MethodDescription.InDefinedShape methodDescription;
            private final MethodDescription.Token token;

            protected TransformedMethod(TypeDescription typeDescription, TypeDefinition typeDefinition, MethodDescription.Token token, MethodDescription.InDefinedShape inDefinedShape) {
                this.instrumentedType = typeDescription;
                this.declaringType = typeDefinition;
                this.token = token;
                this.methodDescription = inDefinedShape;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
            public TypeList.Generic getTypeVariables() {
                return new TypeList.Generic.ForDetachedTypes.OfTypeVariables(this, this.token.getTypeVariableTokens(), new AttachmentVisitor());
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
            public TypeDescription.Generic getReturnType() {
                return (TypeDescription.Generic) this.token.getReturnType().accept(new AttachmentVisitor());
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
            public ParameterList<?> getParameters() {
                return new TransformedParameterList();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
            public TypeList.Generic getExceptionTypes() {
                return new TypeList.Generic.ForDetachedTypes(this.token.getExceptionTypes(), new AttachmentVisitor());
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
            public AnnotationList getDeclaredAnnotations() {
                return this.token.getAnnotations();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
            public String getInternalName() {
                return this.token.getName();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
            public TypeDefinition getDeclaringType() {
                return this.declaringType;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                return this.token.getModifiers();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
            public AnnotationValue<?, ?> getDefaultValue() {
                return this.token.getDefaultValue();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
            public MethodDescription.InDefinedShape asDefined() {
                return this.methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
            public TypeDescription.Generic getReceiverType() {
                TypeDescription.Generic receiverType = this.token.getReceiverType();
                if (receiverType == null) {
                    return TypeDescription.Generic.UNDEFINED;
                }
                return (TypeDescription.Generic) receiverType.accept(new AttachmentVisitor());
            }

            protected class TransformedParameterList extends ParameterList.AbstractBase<ParameterDescription> {
                protected TransformedParameterList() {
                }

                @Override // java.util.AbstractList, java.util.List
                public ParameterDescription get(int i) {
                    TransformedMethod transformedMethod = TransformedMethod.this;
                    return transformedMethod.new TransformedParameter(i, transformedMethod.token.getParameterTokens().get(i));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return TransformedMethod.this.token.getParameterTokens().size();
                }
            }

            protected class TransformedParameter extends ParameterDescription.AbstractBase {
                private final int index;
                private final ParameterDescription.Token parameterToken;

                protected TransformedParameter(int i, ParameterDescription.Token token) {
                    this.index = i;
                    this.parameterToken = token;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
                public TypeDescription.Generic getType() {
                    return (TypeDescription.Generic) this.parameterToken.getType().accept(TransformedMethod.this.new AttachmentVisitor());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.InDefinedShape
                public MethodDescription getDeclaringMethod() {
                    return TransformedMethod.this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
                public int getIndex() {
                    return this.index;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithOptionalName
                public boolean isNamed() {
                    return this.parameterToken.getName() != null;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
                public boolean hasModifiers() {
                    return this.parameterToken.getModifiers() != null;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getName() {
                    if (isNamed()) {
                        return this.parameterToken.getName();
                    }
                    return super.getName();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                    if (hasModifiers()) {
                        return this.parameterToken.getModifiers().intValue();
                    }
                    return super.getModifiers();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.parameterToken.getAnnotations();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
                public ParameterDescription.InDefinedShape asDefined() {
                    return (ParameterDescription.InDefinedShape) TransformedMethod.this.methodDescription.getParameters().get(this.index);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class AttachmentVisitor extends TypeDescription.Generic.Visitor.Substitutor.WithoutTypeSubstitution {
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && TransformedMethod.this.equals(TransformedMethod.this);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + TransformedMethod.this.hashCode();
                }

                protected AttachmentVisitor() {
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public TypeDescription.Generic onTypeVariable(TypeDescription.Generic generic) {
                    TypeDescription.Generic only;
                    TypeList.Generic filter = TransformedMethod.this.getTypeVariables().filter(ElementMatchers.named(generic.getSymbol()));
                    if (filter.isEmpty()) {
                        only = TransformedMethod.this.instrumentedType.findVariable(generic.getSymbol());
                    } else {
                        only = filter.getOnly();
                    }
                    if (only == null) {
                        throw new IllegalArgumentException("Cannot attach undefined variable: " + generic);
                    }
                    return new TypeDescription.Generic.OfTypeVariable.WithAnnotationOverlay(only, generic);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound<S> implements Transformer<S> {
        private final List<Transformer<S>> transformers;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.transformers.equals(((Compound) obj).transformers);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.transformers.hashCode();
        }

        public Compound(Transformer<S>... transformerArr) {
            this(Arrays.asList(transformerArr));
        }

        public Compound(List<? extends Transformer<S>> list) {
            this.transformers = new ArrayList();
            for (Transformer<S> transformer : list) {
                if (transformer instanceof Compound) {
                    this.transformers.addAll(((Compound) transformer).transformers);
                } else if (!(transformer instanceof NoOp)) {
                    this.transformers.add(transformer);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.Transformer
        public S transform(TypeDescription typeDescription, S s) {
            Iterator<Transformer<S>> it = this.transformers.iterator();
            while (it.hasNext()) {
                s = it.next().transform(typeDescription, s);
            }
            return s;
        }
    }
}
