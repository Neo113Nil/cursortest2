package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\u0010\u001a\u00020\r*\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0013\u001a\u0011\u0010\u001a\u001a\u00020\u0003*\u00020\r¢\u0006\u0004\b\u0019\u0010\u000f"}, d2 = {"", "x", "y", "Landroidx/compose/ui/unit/IntOffset;", "IntOffset", "(II)J", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp-81ZRxRo", "(JJF)J", "lerp", "Landroidx/compose/ui/geometry/Offset;", "toOffset--gyyYBs", "(J)J", "toOffset", "offset", "plus-Nv-tHpc", "(JJ)J", "plus", "minus-Nv-tHpc", "minus", "plus-oCl6YwE", "minus-oCl6YwE", "round-k-4lQ0M", "round"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntOffsetKt {
    public static final long IntOffset(int i, int i2) {
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m8741lerp81ZRxRo(long j, long j2, float f) {
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.ui.unit.IntOffset.m8729getXimpl(j), androidx.compose.ui.unit.IntOffset.m8729getXimpl(j2), f) << 32) | (androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.ui.unit.IntOffset.m8730getYimpl(j), androidx.compose.ui.unit.IntOffset.m8730getYimpl(j2), f) & 4294967295L));
    }

    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m8747toOffsetgyyYBs(long j) {
        float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(j);
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.unit.IntOffset.m8730getYimpl(j)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m8729getXimpl) << 32));
    }

    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m8745plusoCl6YwE(long j, long j2) {
        float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(j);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(j);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(m8730getYimpl + intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m8729getXimpl + intBitsToFloat) << 32));
    }

    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m8743minusoCl6YwE(long j, long j2) {
        float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(j);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(j);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(m8730getYimpl - intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m8729getXimpl - intBitsToFloat) << 32));
    }

    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m8744plusNvtHpc(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(j2);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(j2);
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat2 + m8730getYimpl) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat + m8729getXimpl) << 32));
    }

    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m8742minusNvtHpc(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(j2);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(j2);
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat2 - m8730getYimpl) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat - m8729getXimpl) << 32));
    }

    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m8746roundk4lQ0M(long j) {
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32))) << 32));
    }
}
