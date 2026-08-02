package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "x", "y", "Landroidx/compose/ui/geometry/CornerRadius;", "CornerRadius", "(FF)J", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp-3Ry4LBc", "(JJF)J", "lerp"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CornerRadiusKt {
    public static final long CornerRadius(float f, float f2) {
        return androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m5725lerp3Ry4LBc(long j, long j2, float f) {
        float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(lerp) << 32) | (java.lang.Float.floatToRawIntBits(lerp2) & 4294967295L));
    }
}
