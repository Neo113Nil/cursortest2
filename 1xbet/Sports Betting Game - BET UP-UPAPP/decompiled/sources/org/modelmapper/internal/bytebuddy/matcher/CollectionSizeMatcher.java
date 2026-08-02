package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Iterator;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class CollectionSizeMatcher<T extends Iterable<?>> extends ElementMatcher.Junction.AbstractBase<T> {
    private final int size;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.size == ((CollectionSizeMatcher) obj).size;
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.size;
    }

    public CollectionSizeMatcher(int i) {
        this.size = i;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        if (t instanceof Collection) {
            return ((Collection) t).size() == this.size;
        }
        Iterator it = t.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i == this.size;
    }

    public String toString() {
        return "ofSize(" + this.size + ')';
    }
}
