package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class CollectionOneToOneMatcher<T> extends ElementMatcher.Junction.AbstractBase<Iterable<? extends T>> {
    private final List<? extends ElementMatcher<? super T>> matchers;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matchers.equals(((CollectionOneToOneMatcher) obj).matchers);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matchers.hashCode();
    }

    public CollectionOneToOneMatcher(List<? extends ElementMatcher<? super T>> list) {
        this.matchers = list;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(Iterable<? extends T> iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() != this.matchers.size()) {
            return false;
        }
        Iterator<? extends ElementMatcher<? super T>> it = this.matchers.iterator();
        for (T t : iterable) {
            if (!it.hasNext() || !it.next().matches(t)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("containing(");
        boolean z = true;
        for (ElementMatcher<? super T> elementMatcher : this.matchers) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(elementMatcher);
        }
        return sb.append(')').toString();
    }
}
