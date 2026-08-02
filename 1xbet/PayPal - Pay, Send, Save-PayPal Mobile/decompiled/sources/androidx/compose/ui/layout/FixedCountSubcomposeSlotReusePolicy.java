package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/layout/FixedCountSubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "", "p0", "<init>", "(I)V", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "getSlotsToRetain", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;)V", "", "p1", "", "areCompatible", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FixedCountSubcomposeSlotReusePolicy implements androidx.compose.ui.layout.SubcomposeSlotReusePolicy {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean areCompatible(java.lang.Object p0, java.lang.Object p1) {
        return true;
    }

    public FixedCountSubcomposeSlotReusePolicy(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void getSlotsToRetain(androidx.compose.ui.layout.SubcomposeSlotReusePolicy.SlotIdsSet p0) {
        int size = p0.size();
        int i = this.Camera2StreamConfigurationMap;
        if (size > i) {
            p0.trimToSize(i);
        }
    }
}
