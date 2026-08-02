package org.modelmapper.internal.bytebuddy.description.field;

import java.lang.reflect.Field;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import org.modelmapper.internal.asm.signature.SignatureVisitor;
import org.modelmapper.internal.asm.signature.SignatureWriter;
import org.modelmapper.internal.bytebuddy.build.CachedReturnPlugin;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement;
import org.modelmapper.internal.bytebuddy.description.ModifierReviewable;
import org.modelmapper.internal.bytebuddy.description.NamedElement;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeVariableToken;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* loaded from: classes4.dex */
public interface FieldDescription extends ByteCodeElement, ModifierReviewable.ForFieldDescription, NamedElement.WithGenericName, ByteCodeElement.TypeDependant<InDefinedShape, Token> {
    public static final Object NO_DEFAULT_VALUE = null;

    public interface InDefinedShape extends FieldDescription {

        public static abstract class AbstractBase extends AbstractBase implements InDefinedShape {
            @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
            public InDefinedShape asDefined() {
                return this;
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        TypeDescription getDeclaringType();
    }

    public interface InGenericShape extends FieldDescription {
        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        TypeDescription.Generic getDeclaringType();
    }

    SignatureToken asSignatureToken();

    int getActualModifiers();

    TypeDescription.Generic getType();

    public static abstract class AbstractBase extends ModifierReviewable.AbstractBase implements FieldDescription {
        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
        public /* bridge */ /* synthetic */ Token asToken(ElementMatcher elementMatcher) {
            return asToken2((ElementMatcher<? super TypeDescription>) elementMatcher);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getInternalName() {
            return getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
        public String getActualName() {
            return getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public String getDescriptor() {
            return getType().asErasure().getDescriptor();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public String getGenericSignature() {
            TypeDescription.Generic type = getType();
            try {
                return type.getSort().isNonGeneric() ? NON_GENERIC_SIGNATURE : ((SignatureVisitor) type.accept(new TypeDescription.Generic.Visitor.ForSignatureVisitor(new SignatureWriter()))).toString();
            } catch (GenericSignatureFormatError unused) {
                return NON_GENERIC_SIGNATURE;
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public boolean isVisibleTo(TypeDescription typeDescription) {
            return getDeclaringType().asErasure().isVisibleTo(typeDescription) && (isPublic() || typeDescription.equals(getDeclaringType().asErasure()) || ((isProtected() && getDeclaringType().asErasure().isAssignableFrom(typeDescription)) || (!isPrivate() && typeDescription.isSamePackage(getDeclaringType().asErasure()))));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public boolean isAccessibleTo(TypeDescription typeDescription) {
            return isPublic() || typeDescription.equals(getDeclaringType().asErasure()) || (!isPrivate() && typeDescription.isSamePackage(getDeclaringType().asErasure()));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.field.FieldDescription
        public int getActualModifiers() {
            return getModifiers() | (getDeclaredAnnotations().isAnnotationPresent(Deprecated.class) ? 131072 : 0);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
        /* renamed from: asToken, reason: avoid collision after fix types in other method */
        public Token asToken2(ElementMatcher<? super TypeDescription> elementMatcher) {
            return new Token(getName(), getModifiers(), (TypeDescription.Generic) getType().accept(new TypeDescription.Generic.Visitor.Substitutor.ForDetachment(elementMatcher)), getDeclaredAnnotations());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.field.FieldDescription
        public SignatureToken asSignatureToken() {
            return new SignatureToken(getInternalName(), getType().asErasure());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FieldDescription)) {
                return false;
            }
            FieldDescription fieldDescription = (FieldDescription) obj;
            return getName().equals(fieldDescription.getName()) && getDeclaringType().equals(fieldDescription.getDeclaringType());
        }

        public int hashCode() {
            return getDeclaringType().hashCode() + ((getName().hashCode() + 17) * 31);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithGenericName
        public String toGenericString() {
            StringBuilder sb = new StringBuilder();
            if (getModifiers() != 0) {
                sb.append(Modifier.toString(getModifiers())).append(' ');
            }
            sb.append(getType().getActualName()).append(' ');
            sb.append(getDeclaringType().asErasure().getActualName()).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            return sb.append(getName()).toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (getModifiers() != 0) {
                sb.append(Modifier.toString(getModifiers())).append(' ');
            }
            sb.append(getType().asErasure().getActualName()).append(' ');
            sb.append(getDeclaringType().asErasure().getActualName()).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            return sb.append(getName()).toString();
        }
    }

    public static class ForLoadedField extends InDefinedShape.AbstractBase {
        private transient /* synthetic */ AnnotationList declaredAnnotations;
        private final Field field;

        public ForLoadedField(Field field) {
            this.field = field;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.field.FieldDescription
        public TypeDescription.Generic getType() {
            if (TypeDescription.AbstractBase.RAW_TYPES) {
                return TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(this.field.getType());
            }
            return new TypeDescription.Generic.LazyProjection.ForLoadedFieldType(this.field);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        @CachedReturnPlugin.Enhance("declaredAnnotations")
        public AnnotationList getDeclaredAnnotations() {
            AnnotationList.ForLoadedAnnotations forLoadedAnnotations = this.declaredAnnotations != null ? null : new AnnotationList.ForLoadedAnnotations(this.field.getDeclaredAnnotations());
            if (forLoadedAnnotations == null) {
                return this.declaredAnnotations;
            }
            this.declaredAnnotations = forLoadedAnnotations;
            return forLoadedAnnotations;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.field.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return TypeDescription.ForLoadedType.of(this.field.getDeclaringClass());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.field.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public boolean isSynthetic() {
            return this.field.isSynthetic();
        }
    }

    public static class Latent extends InDefinedShape.AbstractBase {
        private final List<? extends AnnotationDescription> declaredAnnotations;
        private final TypeDescription declaringType;
        private final String fieldName;
        private final TypeDescription.Generic fieldType;
        private final int modifiers;

        public Latent(TypeDescription typeDescription, Token token) {
            this(typeDescription, token.getName(), token.getModifiers(), token.getType(), token.getAnnotations());
        }

        public Latent(TypeDescription typeDescription, String str, int i, TypeDescription.Generic generic, List<? extends AnnotationDescription> list) {
            this.declaringType = typeDescription;
            this.fieldName = str;
            this.modifiers = i;
            this.fieldType = generic;
            this.declaredAnnotations = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.field.FieldDescription
        public TypeDescription.Generic getType() {
            return (TypeDescription.Generic) this.fieldType.accept(TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(this));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Explicit(this.declaredAnnotations);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.fieldName;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return this.declaringType;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.modifiers;
        }
    }

    public static class TypeSubstituting extends AbstractBase implements InGenericShape {
        private final TypeDescription.Generic declaringType;
        private final FieldDescription fieldDescription;
        private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

        public TypeSubstituting(TypeDescription.Generic generic, FieldDescription fieldDescription, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
            this.declaringType = generic;
            this.fieldDescription = fieldDescription;
            this.visitor = visitor;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.field.FieldDescription
        public TypeDescription.Generic getType() {
            return (TypeDescription.Generic) this.fieldDescription.getType().accept(this.visitor);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return this.fieldDescription.getDeclaredAnnotations();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription.Generic getDeclaringType() {
            return this.declaringType;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.fieldDescription.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.fieldDescription.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
        public InDefinedShape asDefined() {
            return this.fieldDescription.asDefined();
        }
    }

    public static class Token implements ByteCodeElement.Token<Token> {
        private final List<? extends AnnotationDescription> annotations;
        private final int modifiers;
        private final String name;
        private final TypeDescription.Generic type;

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.Token
        public /* bridge */ /* synthetic */ Token accept(TypeDescription.Generic.Visitor visitor) {
            return accept2((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) visitor);
        }

        public Token(String str, int i, TypeDescription.Generic generic) {
            this(str, i, generic, Collections.emptyList());
        }

        public Token(String str, int i, TypeDescription.Generic generic, List<? extends AnnotationDescription> list) {
            this.name = str;
            this.modifiers = i;
            this.type = generic;
            this.annotations = list;
        }

        public String getName() {
            return this.name;
        }

        public TypeDescription.Generic getType() {
            return this.type;
        }

        public int getModifiers() {
            return this.modifiers;
        }

        public AnnotationList getAnnotations() {
            return new AnnotationList.Explicit(this.annotations);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.Token
        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public Token accept2(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
            return new Token(this.name, this.modifiers, (TypeDescription.Generic) this.type.accept(visitor), this.annotations);
        }

        public SignatureToken asSignatureToken(TypeDescription typeDescription) {
            return new SignatureToken(this.name, (TypeDescription) this.type.accept(new TypeDescription.Generic.Visitor.Reducing(typeDescription, new TypeVariableToken[0])));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Token token = (Token) obj;
            return this.modifiers == token.modifiers && this.name.equals(token.name) && this.type.equals(token.type) && this.annotations.equals(token.annotations);
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.modifiers) * 31) + this.type.hashCode()) * 31) + this.annotations.hashCode();
        }
    }

    public static class SignatureToken {
        private final String name;
        private final TypeDescription type;

        public SignatureToken(String str, TypeDescription typeDescription) {
            this.name = str;
            this.type = typeDescription;
        }

        public String getName() {
            return this.name;
        }

        public TypeDescription getType() {
            return this.type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignatureToken)) {
                return false;
            }
            SignatureToken signatureToken = (SignatureToken) obj;
            return this.name.equals(signatureToken.name) && this.type.equals(signatureToken.type);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return this.type + " " + this.name;
        }
    }
}
