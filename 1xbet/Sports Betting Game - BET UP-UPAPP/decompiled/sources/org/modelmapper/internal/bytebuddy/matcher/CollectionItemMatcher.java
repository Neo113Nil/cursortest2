package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class CollectionItemMatcher<T> extends ElementMatcher.Junction.AbstractBase<Iterable<? extends T>> {
    private final ElementMatcher<? super T> matcher;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((CollectionItemMatcher) obj).matcher);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
    }

    public CollectionItemMatcher(ElementMatcher<? super T> elementMatcher) {
        this.matcher = elementMatcher;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (this.matcher.matches(it.next())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "whereOne(" + this.matcher + ")";
    }
}
