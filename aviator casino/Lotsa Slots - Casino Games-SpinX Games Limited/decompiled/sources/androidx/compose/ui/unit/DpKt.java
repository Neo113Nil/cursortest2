package androidx.compose.ui.unit;

/* compiled from: Dp.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\"\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a\"\u0010:\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00109\u001a*\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a*\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a*\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010C\u001a#\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a#\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bK\u0010I\u001a\u001f\u0010L\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bN\u0010I\u001a\u001f\u0010O\u001a\u00020\b*\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010I\u001a'\u0010R\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010A\u001a%\u0010T\u001a\u00020\b*\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0VH\u0086\bø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a%\u0010T\u001a\u00020\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010VH\u0086\bø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a%\u0010T\u001a\u00020\u0002*\u00020\u00022\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020VH\u0086\bø\u0001\u0000¢\u0006\u0004\b[\u0010Z\u001a\u001f\u0010\\\u001a\u00020\b*\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\u001f\u0010\\\u001a\u00020\b*\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000¢\u0006\u0004\b^\u0010I\u001a\u001f\u0010\\\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\u001f\u0010\\\u001a\u00020\b*\u00020\u00112\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000¢\u0006\u0004\b^\u0010b\u001a\u001f\u0010\\\u001a\u00020\u0002*\u00020\u00112\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b`\u0010c\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00118Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\u001f\u0010\u0014\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010$\"\u001f\u0010'\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u001e\"\u001f\u0010'\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010$\"\u001f\u0010'\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010$\"\u001f\u0010.\u001a\u00020\u0002*\u00020\u00158Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101\"\u001f\u00102\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"center", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", "dp", "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", "start", "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "a", "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", "times", "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DpKt {
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4505getCenterEaSLcWc$annotations(long j) {
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

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m4506isFinite0680j_4(float f) {
        return !(f == Float.POSITIVE_INFINITY);
    }

    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4507isFinite0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4509isSpecified0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4511isSpecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m4513isSpecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4515isUnspecified0680j_4$annotations(float f) {
    }

    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4517isUnspecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m4519isUnspecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m4508isSpecified0680j_4(float f) {
        return !java.lang.Float.isNaN(f);
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m4514isUnspecified0680j_4(float f) {
        return java.lang.Float.isNaN(f);
    }

    public static final float getDp(int i) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(i);
    }

    public static final float getDp(double d) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl((float) d);
    }

    public static final float getDp(float f) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4529times3ABfNKs(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(f * f2);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4528times3ABfNKs(double d, float f) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(((float) d) * f);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4530times3ABfNKs(int i, float f) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(i * f);
    }

    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m4524minYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(java.lang.Math.min(f, f2));
    }

    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m4523maxYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(java.lang.Math.max(f, f2));
    }

    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m4503coerceIn2z7ARbQ(float f, float f2, float f3) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(kotlin.ranges.RangesKt.coerceIn(f, f2, f3));
    }

    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m4501coerceAtLeastYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(f, f2));
    }

    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m4502coerceAtMostYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(kotlin.ranges.RangesKt.coerceAtMost(f, f2));
    }

    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m4521lerpMdfbLM(float f, float f2, float f3) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.ui.util.MathHelpersKt.lerp(f, f2, f3));
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m4512isSpecifiedjoFl9I(long j) {
        return j != androidx.compose.ui.unit.DpOffset.INSTANCE.m4548getUnspecifiedRKDOV3M();
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m4518isUnspecifiedjoFl9I(long j) {
        return j == androidx.compose.ui.unit.DpOffset.INSTANCE.m4548getUnspecifiedRKDOV3M();
    }

    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m4522lerpxhh869w(long j, long j2, float f) {
        return m4499DpOffsetYgX7TsA(m4521lerpMdfbLM(androidx.compose.ui.unit.DpOffset.m4539getXD9Ej5fM(j), androidx.compose.ui.unit.DpOffset.m4539getXD9Ej5fM(j2), f), m4521lerpMdfbLM(androidx.compose.ui.unit.DpOffset.m4541getYD9Ej5fM(j), androidx.compose.ui.unit.DpOffset.m4541getYD9Ej5fM(j2), f));
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m4510isSpecifiedEaSLcWc(long j) {
        return j != androidx.compose.ui.unit.DpSize.INSTANCE.m4585getUnspecifiedMYxV2XQ();
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m4516isUnspecifiedEaSLcWc(long j) {
        return j == androidx.compose.ui.unit.DpSize.INSTANCE.m4585getUnspecifiedMYxV2XQ();
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m4504getCenterEaSLcWc(long j) {
        return m4499DpOffsetYgX7TsA(androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(j) / 2.0f), androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j) / 2.0f));
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m4532times6HolHcs(int i, long j) {
        return androidx.compose.ui.unit.DpSize.m4582timesGh9hcWk(j, i);
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m4531times6HolHcs(float f, long j) {
        return androidx.compose.ui.unit.DpSize.m4581timesGh9hcWk(j, f);
    }

    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m4520lerpIDex15A(long j, long j2, float f) {
        return m4500DpSizeYgX7TsA(m4521lerpMdfbLM(androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(j2), f), m4521lerpMdfbLM(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j2), f));
    }

    public static final float getWidth(androidx.compose.ui.unit.DpRect dpRect) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(dpRect.m4562getRightD9Ej5fM() - dpRect.m4561getLeftD9Ej5fM());
    }

    public static final float getHeight(androidx.compose.ui.unit.DpRect dpRect) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(dpRect.m4560getBottomD9Ej5fM() - dpRect.m4563getTopD9Ej5fM());
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m4525takeOrElseD5KLDUw(float f, kotlin.jvm.functions.Function0<androidx.compose.ui.unit.Dp> function0) {
        return java.lang.Float.isNaN(f) ^ true ? f : function0.invoke().m4492unboximpl();
    }

    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m4499DpOffsetYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.DpOffset.m4534constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m4526takeOrElsegVKV90s(long j, kotlin.jvm.functions.Function0<androidx.compose.ui.unit.DpOffset> function0) {
        return j != androidx.compose.ui.unit.DpOffset.INSTANCE.m4548getUnspecifiedRKDOV3M() ? j : function0.invoke().getPackedValue();
    }

    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m4500DpSizeYgX7TsA(float f, float f2) {
        return androidx.compose.ui.unit.DpSize.m4567constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m4527takeOrElseitqla9I(long j, kotlin.jvm.functions.Function0<androidx.compose.ui.unit.DpSize> function0) {
        return j != androidx.compose.ui.unit.DpSize.INSTANCE.m4585getUnspecifiedMYxV2XQ() ? j : function0.invoke().getPackedValue();
    }

    public static final long getSize(androidx.compose.ui.unit.DpRect dpRect) {
        return m4500DpSizeYgX7TsA(androidx.compose.ui.unit.Dp.m4478constructorimpl(dpRect.m4562getRightD9Ej5fM() - dpRect.m4561getLeftD9Ej5fM()), androidx.compose.ui.unit.Dp.m4478constructorimpl(dpRect.m4560getBottomD9Ej5fM() - dpRect.m4563getTopD9Ej5fM()));
    }
}
