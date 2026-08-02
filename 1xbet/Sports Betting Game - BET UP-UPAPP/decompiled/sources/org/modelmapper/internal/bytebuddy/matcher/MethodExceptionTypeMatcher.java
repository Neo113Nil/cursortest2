package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class MethodExceptionTypeMatcher<T extends MethodDescription> extends ElementMatcher.Junction.AbstractBase<T> {
    private final ElementMatcher<? super TypeList.Generic> matcher;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((MethodExceptionTypeMatcher) obj).matcher);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
    }

    public MethodExceptionTypeMatcher(ElementMatcher<? super TypeList.Generic> elementMatcher) {
        this.matcher = elementMatcher;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        return this.matcher.matches(t.getExceptionTypes());
    }

    public String toString() {
        return "exceptions(" + this.matcher + ")";
    }
}
