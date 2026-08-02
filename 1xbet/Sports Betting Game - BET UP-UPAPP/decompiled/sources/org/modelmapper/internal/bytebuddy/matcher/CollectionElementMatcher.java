package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class CollectionElementMatcher<T> extends ElementMatcher.Junction.AbstractBase<Iterable<? extends T>> {
    private final int index;
    private final ElementMatcher<? super T> matcher;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectionElementMatcher collectionElementMatcher = (CollectionElementMatcher) obj;
        return this.index == collectionElementMatcher.index && this.matcher.equals(collectionElementMatcher.matcher);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.index) * 31) + this.matcher.hashCode();
    }

    public CollectionElementMatcher(int i, ElementMatcher<? super T> elementMatcher) {
        this.index = i;
        this.matcher = elementMatcher;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        for (int i = 0; i < this.index; i++) {
            if (!it.hasNext()) {
                return false;
            }
            it.next();
        }
        return it.hasNext() && this.matcher.matches(it.next());
    }

    public String toString() {
        return "with(" + this.index + " matches " + this.matcher + ")";
    }
}
