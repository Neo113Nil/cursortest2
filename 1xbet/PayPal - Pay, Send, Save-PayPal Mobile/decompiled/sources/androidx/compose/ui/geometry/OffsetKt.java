package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\"\u001c\u0010\u0016\u001a\u00020\u0011*\u00020\u00038Ç\u0002¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"\u001c\u0010\u0019\u001a\u00020\u0011*\u00020\u00038Ç\u0002¢\u0006\f\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013\"\u001c\u0010\u001c\u001a\u00020\u0011*\u00020\u00038Ç\u0002¢\u0006\f\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0013"}, d2 = {"", "x", "y", "Landroidx/compose/ui/geometry/Offset;", "Offset", "(FF)J", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp-Wko1d7g", "(JJF)J", "lerp", "Lkotlin/Function0;", "block", "takeOrElse-3MmeM6k", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "", "isFinite-k-4lQ0M", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "isSpecified-k-4lQ0M", "isSpecified-k-4lQ0M$annotations", "isSpecified", "isUnspecified-k-4lQ0M", "isUnspecified-k-4lQ0M$annotations", "isUnspecified"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OffsetKt {
    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m5769isFinitek4lQ0M(long j) {
        return ((((j & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0;
    }

    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m5770isFinitek4lQ0M$annotations(long j) {
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m5771isSpecifiedk4lQ0M(long j) {
        return (j & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m5772isSpecifiedk4lQ0M$annotations(long j) {
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m5773isUnspecifiedk4lQ0M(long j) {
        return (j & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m5774isUnspecifiedk4lQ0M$annotations(long j) {
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m5776takeOrElse3MmeM6k(long j, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> function0) {
        return (9223372034707292159L & j) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : function0.invoke().m5762unboximpl();
    }

    public static final long Offset(float f, float f2) {
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m5775lerpWko1d7g(long j, long j2, float f) {
        float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(lerp) << 32) | (java.lang.Float.floatToRawIntBits(lerp2) & 4294967295L));
    }
}
