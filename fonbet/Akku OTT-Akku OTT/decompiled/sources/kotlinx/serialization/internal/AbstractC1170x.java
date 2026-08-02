package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1170x<E, C extends Collection<? extends E>, B> extends AbstractC1168w<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1170x(kotlinx.serialization.b<E> element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Iterator d(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }
}
