package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "p0", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;)V", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "getSlotsToRetain", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;)V", "", "p1", "", "areCompatible", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableObjectIntMap;", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableObjectIntMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutItemReusePolicy implements androidx.compose.ui.layout.SubcomposeSlotReusePolicy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.collection.MutableObjectIntMap<java.lang.Object> getHighSpeedVideoSizes = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory getHighSpeedVideoFpsRangesFor;

    public LazyLayoutItemReusePolicy(androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.getHighSpeedVideoFpsRangesFor = lazyLayoutItemContentFactory;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void getSlotsToRetain(androidx.compose.ui.layout.SubcomposeSlotReusePolicy.SlotIdsSet p0) {
        this.getHighSpeedVideoSizes.clear();
        androidx.collection.MutableOrderedScatterSet<java.lang.Object> set = p0.getSet();
        java.lang.Object[] objArr = set.elements;
        long[] jArr = set.nodes;
        int i = set.tail;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            java.lang.Object obj = objArr[i];
            java.lang.Object contentType = this.getHighSpeedVideoFpsRangesFor.getContentType(obj);
            int orDefault = this.getHighSpeedVideoSizes.getOrDefault(contentType, 0);
            if (orDefault == 7) {
                p0.remove(obj);
            } else {
                this.getHighSpeedVideoSizes.set(contentType, orDefault + 1);
            }
            i = i2;
        }
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean areCompatible(java.lang.Object p0, java.lang.Object p1) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor.getContentType(p0), this.getHighSpeedVideoFpsRangesFor.getContentType(p1));
    }
}
