package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/unit/Velocity;", "Landroidx/compose/ui/geometry/Offset;", "toOffset-TH1AsA0", "(J)J", "toOffset", "Landroidx/compose/animation/core/SpringSpec;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/SpringSpec;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharedElementKt {
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> getHighSpeedVideoSizes = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(3.0f) << 32) | (java.lang.Float.floatToRawIntBits(3.0f) & 4294967295L))), 1, null);

    /* renamed from: toOffset-TH1AsA0, reason: not valid java name */
    public static final long m1141toOffsetTH1AsA0(long j) {
        float m8839getXimpl = androidx.compose.ui.unit.Velocity.m8839getXimpl(j);
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.unit.Velocity.m8840getYimpl(j)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m8839getXimpl) << 32));
    }

    public static final /* synthetic */ boolean access$hasVisibleContent(java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((androidx.compose.animation.SharedElementEntry) list.get(i)).getBoundsAnimation().getTarget()) {
                return true;
            }
        }
        return false;
    }
}
