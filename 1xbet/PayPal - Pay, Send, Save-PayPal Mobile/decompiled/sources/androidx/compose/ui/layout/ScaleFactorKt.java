package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\n\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u001c\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u000e\u001a%\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001c\u0010\u001f\u001a\u00020\u001a*\u00020\u00038Ç\u0002¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\"\u001c\u0010\"\u001a\u00020\u001a*\u00020\u00038Ç\u0002¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001c"}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", "Lkotlin/Function0;", "block", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", io.ktor.http.ContentDisposition.Parameters.Size, "times-m-w2e94", "div-UQTWf7w", "div", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp--bDIf60", "(JJF)J", "lerp", "", "isSpecified-FK8aYYs", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "isUnspecified-FK8aYYs", "isUnspecified-FK8aYYs$annotations", "isUnspecified"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaleFactorKt {
    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m7468isSpecifiedFK8aYYs$annotations(long j) {
    }

    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m7470isUnspecifiedFK8aYYs$annotations(long j) {
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m7467isSpecifiedFK8aYYs(long j) {
        return j != androidx.compose.ui.layout.ScaleFactor.INSTANCE.m7465getUnspecified_hLwfpc();
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m7469isUnspecifiedFK8aYYs(long j) {
        return j == androidx.compose.ui.layout.ScaleFactor.INSTANCE.m7465getUnspecified_hLwfpc();
    }

    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m7474timesmw2e94(long j, long j2) {
        return m7473timesUQTWf7w(j2, j);
    }

    public static final long ScaleFactor(float f, float f2) {
        return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m7472takeOrElseoyDd2qo(long j, kotlin.jvm.functions.Function0<androidx.compose.ui.layout.ScaleFactor> function0) {
        return j != androidx.compose.ui.layout.ScaleFactor.INSTANCE.m7465getUnspecified_hLwfpc() ? j : function0.invoke().m7463unboximpl();
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m7473timesUQTWf7w(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat3 * intBitsToFloat4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat * intBitsToFloat2) << 32));
    }

    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m7466divUQTWf7w(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m7471lerpbDIf60(long j, long j2, float f) {
        float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(lerp) << 32) | (java.lang.Float.floatToRawIntBits(lerp2) & 4294967295L));
    }
}
