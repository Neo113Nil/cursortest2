package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\n\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0015\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0015\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0013\u0010\u0017\u001a\u001c\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0013\u0010\u0018\u001a\u0011\u0010\u001c\u001a\u00020\u0019*\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001b\"\u001c\u0010\"\u001a\u00020\u001d*\u00020\u00038Ç\u0002¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\"\u001c\u0010%\u001a\u00020\u001d*\u00020\u00038Ç\u0002¢\u0006\f\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f\"\u001b\u0010*\u001a\u00020&*\u00020\u00038G¢\u0006\f\u0012\u0004\b)\u0010!\u001a\u0004\b'\u0010("}, d2 = {"", "width", "height", "Landroidx/compose/ui/geometry/Size;", "Size", "(FF)J", "Lkotlin/Function0;", "block", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "lerp", "", io.ktor.http.ContentDisposition.Parameters.Size, "times-d16Qtg0", "(IJ)J", "times", "", "(DJ)J", "(FJ)J", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "toRect", "", "isSpecified-uvyYCjk", "(J)Z", "isSpecified-uvyYCjk$annotations", "(J)V", "isSpecified", "isUnspecified-uvyYCjk", "isUnspecified-uvyYCjk$annotations", "isUnspecified", "Landroidx/compose/ui/geometry/Offset;", "getCenter-uvyYCjk", "(J)J", "getCenter-uvyYCjk$annotations", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SizeKt {
    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m5832getCenteruvyYCjk$annotations(long j) {
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m5833isSpecifieduvyYCjk(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m5834isSpecifieduvyYCjk$annotations(long j) {
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m5835isUnspecifieduvyYCjk(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m5836isUnspecifieduvyYCjk$annotations(long j) {
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m5838takeOrElseTmRCtEA(long j, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Size> function0) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : function0.invoke().m5826unboximpl();
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m5841timesd16Qtg0(int i, long j) {
        return androidx.compose.ui.geometry.Size.m5824times7Ah8Wj8(j, i);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m5839timesd16Qtg0(double d, long j) {
        return androidx.compose.ui.geometry.Size.m5824times7Ah8Wj8(j, (float) d);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m5840timesd16Qtg0(float f, long j) {
        return androidx.compose.ui.geometry.Size.m5824times7Ah8Wj8(j, f);
    }

    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final androidx.compose.ui.geometry.Rect m5842toRectuvyYCjk(long j) {
        return androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), j);
    }

    public static final long Size(float f, float f2) {
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m5837lerpVgWVRYQ(long j, long j2, float f) {
        float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(lerp) << 32) | (java.lang.Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m5831getCenteruvyYCjk(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32));
    }
}
