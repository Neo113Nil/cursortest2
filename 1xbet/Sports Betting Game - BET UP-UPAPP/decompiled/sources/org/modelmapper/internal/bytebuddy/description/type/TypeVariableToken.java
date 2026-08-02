package org.modelmapper.internal.bytebuddy.description.type;

import java.util.Collections;
import java.util.List;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

/* loaded from: classes4.dex */
public class TypeVariableToken implements ByteCodeElement.Token<TypeVariableToken> {
    private final List<? extends AnnotationDescription> annotations;
    private final List<? extends TypeDescription.Generic> bounds;
    private final String symbol;

    @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.Token
    public /* bridge */ /* synthetic */ TypeVariableToken accept(TypeDescription.Generic.Visitor visitor) {
        return accept2((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) visitor);
    }

    public TypeVariableToken(String str, List<? extends TypeDescription.Generic> list) {
        this(str, list, Collections.emptyList());
    }

    public TypeVariableToken(String str, List<? extends TypeDescription.Generic> list, List<? extends AnnotationDescription> list2) {
        this.symbol = str;
        this.bounds = list;
        this.annotations = list2;
    }

    public static TypeVariableToken of(TypeDescription.Generic generic, ElementMatcher<? super TypeDescription> elementMatcher) {
        return new TypeVariableToken(generic.getSymbol(), generic.getUpperBounds().accept(new TypeDescription.Generic.Visitor.Substitutor.ForDetachment(elementMatcher)), generic.getDeclaredAnnotations());
    }

    public String getSymbol() {
        return this.symbol;
    }

    public TypeList.Generic getBounds() {
        return new TypeList.Generic.Explicit(this.bounds);
    }

    public AnnotationList getAnnotations() {
        return new AnnotationList.Explicit(this.annotations);
    }

    @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.Token
    /* renamed from: accept, reason: avoid collision after fix types in other method */
    public TypeVariableToken accept2(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
        return new TypeVariableToken(this.symbol, getBounds().accept(visitor), this.annotations);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeVariableToken)) {
            return false;
        }
        TypeVariableToken typeVariableToken = (TypeVariableToken) obj;
        return this.symbol.equals(typeVariableToken.symbol) && this.bounds.equals(typeVariableToken.bounds) && this.annotations.equals(typeVariableToken.annotations);
    }

    public int hashCode() {
        return (((this.symbol.hashCode() * 31) + this.bounds.hashCode()) * 31) + this.annotations.hashCode();
    }

    public String toString() {
        return this.symbol;
    }
}
