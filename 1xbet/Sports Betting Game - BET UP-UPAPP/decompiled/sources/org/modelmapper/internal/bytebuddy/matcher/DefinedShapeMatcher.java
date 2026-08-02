package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class DefinedShapeMatcher<T extends ByteCodeElement.TypeDependant<S, ?>, S extends ByteCodeElement.TypeDependant<?, ?>> extends ElementMatcher.Junction.AbstractBase<T> {
    private final ElementMatcher<? super S> matcher;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((DefinedShapeMatcher) obj).matcher);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
    }

    public DefinedShapeMatcher(ElementMatcher<? super S> elementMatcher) {
        this.matcher = elementMatcher;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        return this.matcher.matches(t.asDefined());
    }

    public String toString() {
        return "isDefinedAs(" + this.matcher + ')';
    }
}
