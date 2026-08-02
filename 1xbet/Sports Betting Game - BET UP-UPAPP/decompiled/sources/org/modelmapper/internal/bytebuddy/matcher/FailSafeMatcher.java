package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class FailSafeMatcher<T> extends ElementMatcher.Junction.AbstractBase<T> {
    private final boolean fallback;
    private final ElementMatcher<? super T> matcher;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailSafeMatcher failSafeMatcher = (FailSafeMatcher) obj;
        return this.matcher.equals(failSafeMatcher.matcher) && this.fallback == failSafeMatcher.fallback;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + (this.fallback ? 1 : 0);
    }

    public FailSafeMatcher(ElementMatcher<? super T> elementMatcher, boolean z) {
        this.matcher = elementMatcher;
        this.fallback = z;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        try {
            return this.matcher.matches(t);
        } catch (Exception unused) {
            return this.fallback;
        }
    }

    public String toString() {
        return "failSafe(try(" + this.matcher + ") or " + this.fallback + ")";
    }
}
