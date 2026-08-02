package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\f\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\u000e\u001a \u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0011\u0010\t\u001a \u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0013\u0010\t\u001a$\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u001a\u0010\t\u001a\u001c\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u001c\u0010\t\u001a%\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u0018\u001a \u0010(\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b&\u0010'\u001a\"\u0010\u0005\u001a\u00020%*\u00020%2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u0001H\u0086\b¢\u0006\u0004\b)\u0010*\u001a%\u0010\"\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020%2\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b+\u0010,\u001a\u001d\u00101\u001a\u00020/2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000¢\u0006\u0004\b0\u0010'\u001a\"\u0010\u0005\u001a\u00020/*\u00020/2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020/0\u0001H\u0086\b¢\u0006\u0004\b2\u0010*\u001a\u001c\u0010\n\u001a\u00020/*\u00020\r2\u0006\u00103\u001a\u00020/H\u0086\n¢\u0006\u0004\b4\u00105\u001a\u001c\u0010\n\u001a\u00020/*\u00020\u00062\u0006\u00103\u001a\u00020/H\u0086\n¢\u0006\u0004\b4\u00106\u001a%\u0010\"\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020/2\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b7\u0010,\"\u001c\u0010=\u001a\u000208*\u00020\u00008Ç\u0002¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:\"\u001c\u0010@\u001a\u000208*\u00020\u00008Ç\u0002¢\u0006\f\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010:\"\u001c\u0010E\u001a\u00020\u0000*\u00020\r8Ç\u0002¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bA\u0010B\"\u001c\u0010E\u001a\u00020\u0000*\u00020\u000b8Ç\u0002¢\u0006\f\u0012\u0004\bC\u0010G\u001a\u0004\bA\u0010F\"\u001c\u0010E\u001a\u00020\u0000*\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\bC\u0010<\u001a\u0004\bA\u0010H\"\u001c\u0010K\u001a\u000208*\u00020\u00008Ç\u0002¢\u0006\f\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010:\"\u001c\u0010=\u001a\u000208*\u00020%8Ç\u0002¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010M\"\u001c\u0010@\u001a\u000208*\u00020%8Ç\u0002¢\u0006\f\u0012\u0004\bQ\u0010O\u001a\u0004\bP\u0010M\"\u001c\u0010=\u001a\u000208*\u00020/8Ç\u0002¢\u0006\f\u0012\u0004\bS\u0010O\u001a\u0004\bR\u0010M\"\u001c\u0010@\u001a\u000208*\u00020/8Ç\u0002¢\u0006\f\u0012\u0004\bU\u0010O\u001a\u0004\bT\u0010M\"\u001b\u0010Y\u001a\u00020%*\u00020/8G¢\u0006\f\u0012\u0004\bX\u0010O\u001a\u0004\bV\u0010W\"\u001c\u0010-\u001a\u00020\u0000*\u00020Z8Ç\u0002¢\u0006\f\u0012\u0004\b]\u0010^\u001a\u0004\b[\u0010\\\"\u001c\u0010.\u001a\u00020\u0000*\u00020Z8Ç\u0002¢\u0006\f\u0012\u0004\b`\u0010^\u001a\u0004\b_\u0010\\\"\u001c\u00103\u001a\u00020/*\u00020Z8Ç\u0002¢\u0006\f\u0012\u0004\bc\u0010^\u001a\u0004\ba\u0010b"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "Lkotlin/Function0;", "block", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse", "", "other", "times-3ABfNKs", "(FF)F", "times", "", "(DF)F", "", "(IF)F", "a", util.h.xy.cb.b.f1091, "min-YgX7TsA", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "max-YgX7TsA", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "minimumValue", "maximumValue", "coerceIn-2z7ARbQ", "(FFF)F", "coerceIn", "coerceAtLeast-YgX7TsA", "coerceAtLeast", "coerceAtMost-YgX7TsA", "coerceAtMost", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp-Md-fbLM", "lerp", "x", "y", "Landroidx/compose/ui/unit/DpOffset;", "DpOffset-YgX7TsA", "(FF)J", "DpOffset", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "lerp-xhh869w", "(JJF)J", "width", "height", "Landroidx/compose/ui/unit/DpSize;", "DpSize-YgX7TsA", "DpSize", "takeOrElse-itqla9I", io.ktor.http.ContentDisposition.Parameters.Size, "times-6HolHcs", "(IJ)J", "(FJ)J", "lerp-IDex15A", "", "isSpecified-0680j_4", "(F)Z", "isSpecified-0680j_4$annotations", "(F)V", "isSpecified", "isUnspecified-0680j_4", "isUnspecified-0680j_4$annotations", "isUnspecified", "getDp", "(I)F", "getDp$annotations", "(I)V", "dp", "(D)F", "(D)V", "(F)F", "isFinite-0680j_4", "isFinite-0680j_4$annotations", "isFinite", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-jo-Fl9I$annotations", "(J)V", "isUnspecified-jo-Fl9I", "isUnspecified-jo-Fl9I$annotations", "isSpecified-EaSLcWc", "isSpecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "isUnspecified-EaSLcWc$annotations", "getCenter-EaSLcWc", "(J)J", "getCenter-EaSLcWc$annotations", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "Landroidx/compose/ui/unit/DpRect;", "getWidth", "(Landroidx/compose/ui/unit/DpRect;)F", "getWidth$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "getHeight$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "getSize$annotations"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DpKt {
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m8628getCenterEaSLcWc$annotations(long j) {
    }

    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static /* synthetic */ void getDp$annotations(float f) {
    }

    public static /* synthetic */ void getDp$annotations(int i) {
    }

    public static /* synthetic */ void getHeight$annotations(androidx.compose.ui.unit.DpRect dpRect) {
    }

    public static /* synthetic */ void getSize$annotations(androidx.compose.ui.unit.DpRect dpRect) {
    }

    public static /* synthetic */ void getWidth$annotations(androidx.compose.ui.unit.DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m8630isFinite0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m8632isSpecified0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m8633isSpecifiedEaSLcWc(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m8634isSpecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m8635isSpecifiedjoFl9I(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m8636isSpecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m8638isUnspecified0680j_4$annotations(float f) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m8639isUnspecifiedEaSLcWc(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m8640isUnspecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m8641isUnspecifiedjoFl9I(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m8642isUnspecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m8631isSpecified0680j_4(float f) {
        return !java.lang.Float.isNaN(f);
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m8637isUnspecified0680j_4(float f) {
        return java.lang.Float.isNaN(f);
    }

    public static final float getDp(int i) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(i);
    }

    public static final float getDp(double d) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl((float) d);
    }

    public static final float getDp(float f) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(f);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m8652times3ABfNKs(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(f * f2);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m8651times3ABfNKs(double d, float f) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(((float) d) * f);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m8653times3ABfNKs(int i, float f) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(i * f);
    }

    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m8647minYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(java.lang.Math.min(f, f2));
    }

    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m8646maxYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(java.lang.Math.max(f, f2));
    }

    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m8626coerceIn2z7ARbQ(float f, float f2, float f3) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(kotlin.ranges.RangesKt.coerceIn(f, f2, f3));
    }

    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m8624coerceAtLeastYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(f, f2));
    }

    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m8625coerceAtMostYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(kotlin.ranges.RangesKt.coerceAtMost(f, f2));
    }

    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m8644lerpMdfbLM(float f, float f2, float f3) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.util.MathHelpersKt.lerp(f, f2, f3));
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m8649takeOrElsegVKV90s(long j, kotlin.jvm.functions.Function0<androidx.compose.ui.unit.DpOffset> function0) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : function0.invoke().m8670unboximpl();
    }

    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m8645lerpxhh869w(long j, long j2, float f) {
        float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.ui.unit.DpOffset.m8662getXD9Ej5fM(j), androidx.compose.ui.unit.DpOffset.m8662getXD9Ej5fM(j2), f);
        float lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.ui.unit.DpOffset.m8664getYD9Ej5fM(j), androidx.compose.ui.unit.DpOffset.m8664getYD9Ej5fM(j2), f);
        return androidx.compose.ui.unit.DpOffset.m8657constructorimpl((java.lang.Float.floatToRawIntBits(lerp) << 32) | (java.lang.Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m8650takeOrElseitqla9I(long j, kotlin.jvm.functions.Function0<androidx.compose.ui.unit.DpSize> function0) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : function0.invoke().getGetHighSpeedVideoSizes();
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m8627getCenterEaSLcWc(long j) {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(j) / 2.0f);
        return androidx.compose.ui.unit.DpOffset.m8657constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(j) / 2.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m8601constructorimpl) << 32));
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m8655times6HolHcs(int i, long j) {
        return androidx.compose.ui.unit.DpSize.m8705timesGh9hcWk(j, i);
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m8654times6HolHcs(float f, long j) {
        return androidx.compose.ui.unit.DpSize.m8704timesGh9hcWk(j, f);
    }

    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m8643lerpIDex15A(long j, long j2, float f) {
        float m8644lerpMdfbLM = m8644lerpMdfbLM(androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(j2), f);
        float m8644lerpMdfbLM2 = m8644lerpMdfbLM(androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(j2), f);
        return androidx.compose.ui.unit.DpSize.m8690constructorimpl((java.lang.Float.floatToRawIntBits(m8644lerpMdfbLM) << 32) | (java.lang.Float.floatToRawIntBits(m8644lerpMdfbLM2) & 4294967295L));
    }

    public static final float getWidth(androidx.compose.ui.unit.DpRect dpRect) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(dpRect.m8685getRightD9Ej5fM() - dpRect.m8684getLeftD9Ej5fM());
    }

    public static final float getHeight(androidx.compose.ui.unit.DpRect dpRect) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(dpRect.m8683getBottomD9Ej5fM() - dpRect.m8686getTopD9Ej5fM());
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m8648takeOrElseD5KLDUw(float f, kotlin.jvm.functions.Function0<androidx.compose.ui.unit.Dp> function0) {
        return !java.lang.Float.isNaN(f) ? f : function0.invoke().m8615unboximpl();
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m8629isFinite0680j_4(float f) {
        return (java.lang.Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m8622DpOffsetYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.DpOffset.m8657constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m8623DpSizeYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.DpSize.m8690constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    public static final long getSize(androidx.compose.ui.unit.DpRect dpRect) {
        return m8623DpSizeYgX7TsA(androidx.compose.ui.unit.Dp.m8601constructorimpl(dpRect.m8685getRightD9Ej5fM() - dpRect.m8684getLeftD9Ej5fM()), androidx.compose.ui.unit.Dp.m8601constructorimpl(dpRect.m8683getBottomD9Ej5fM() - dpRect.m8686getTopD9Ej5fM()));
    }
}
