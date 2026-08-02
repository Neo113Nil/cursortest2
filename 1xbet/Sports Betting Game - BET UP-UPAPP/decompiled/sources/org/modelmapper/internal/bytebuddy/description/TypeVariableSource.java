package org.modelmapper.internal.bytebuddy.description;

import org.modelmapper.internal.bytebuddy.description.ModifierReviewable;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

/* loaded from: classes4.dex */
public interface TypeVariableSource extends ModifierReviewable.OfAbstraction {
    public static final TypeVariableSource UNDEFINED = null;

    public interface Visitor<T> {

        public enum NoOp implements Visitor<TypeVariableSource> {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource.Visitor
            public TypeVariableSource onMethod(MethodDescription.InDefinedShape inDefinedShape) {
                return inDefinedShape;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource.Visitor
            public TypeVariableSource onType(TypeDescription typeDescription) {
                return typeDescription;
            }
        }

        T onMethod(MethodDescription.InDefinedShape inDefinedShape);

        T onType(TypeDescription typeDescription);
    }

    <T> T accept(Visitor<T> visitor);

    TypeDescription.Generic findVariable(String str);

    TypeVariableSource getEnclosingSource();

    TypeList.Generic getTypeVariables();

    boolean isGenerified();

    public static abstract class AbstractBase extends ModifierReviewable.AbstractBase implements TypeVariableSource {
        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeDescription.Generic findVariable(String str) {
            TypeList.Generic filter = getTypeVariables().filter(ElementMatchers.named(str));
            if (filter.isEmpty()) {
                TypeVariableSource enclosingSource = getEnclosingSource();
                if (enclosingSource == null) {
                    return TypeDescription.Generic.UNDEFINED;
                }
                return enclosingSource.findVariable(str);
            }
            return filter.getOnly();
        }
    }
}
