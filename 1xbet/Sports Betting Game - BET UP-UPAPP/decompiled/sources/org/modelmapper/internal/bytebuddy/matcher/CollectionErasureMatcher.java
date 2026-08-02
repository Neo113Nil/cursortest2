package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Iterator;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class CollectionErasureMatcher<T extends Iterable<? extends TypeDefinition>> extends ElementMatcher.Junction.AbstractBase<T> {
    private final ElementMatcher<? super Iterable<? extends TypeDescription>> matcher;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((CollectionErasureMatcher) obj).matcher);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
    }

    public CollectionErasureMatcher(ElementMatcher<? super Iterable<? extends TypeDescription>> elementMatcher) {
        this.matcher = elementMatcher;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        ArrayList arrayList = new ArrayList();
        Iterator it = t.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeDefinition) it.next()).asErasure());
        }
        return this.matcher.matches(arrayList);
    }

    public String toString() {
        return "erasures(" + this.matcher + ')';
    }
}
