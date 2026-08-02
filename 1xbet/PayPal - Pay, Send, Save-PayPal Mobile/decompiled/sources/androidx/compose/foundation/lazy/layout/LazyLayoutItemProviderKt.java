package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "key", "", "lastKnownIndex", "findIndexByKey", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutItemProviderKt {
    public static final int findIndexByKey(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider lazyLayoutItemProvider, java.lang.Object obj, int i) {
        int index;
        return (obj == null || lazyLayoutItemProvider.getItemCount() == 0 || (i < lazyLayoutItemProvider.getItemCount() && kotlin.jvm.internal.Intrinsics.areEqual(obj, lazyLayoutItemProvider.getKey(i))) || (index = lazyLayoutItemProvider.getIndex(obj)) == -1) ? i : index;
    }
}
