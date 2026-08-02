package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class BooleanMatcher<T> extends ElementMatcher.Junction.AbstractBase<T> {
    private final boolean matches;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matches == ((BooleanMatcher) obj).matches;
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.matches ? 1 : 0);
    }

    public BooleanMatcher(boolean z) {
        this.matches = z;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        return this.matches;
    }

    public String toString() {
        return Boolean.toString(this.matches);
    }
}
