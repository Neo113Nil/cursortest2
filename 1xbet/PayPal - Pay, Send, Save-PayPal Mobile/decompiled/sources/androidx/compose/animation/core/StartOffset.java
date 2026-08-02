package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018\u0088\u0001\u001a\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "", "p0", "getHighSpeedVideoFpsRangesFor", "(J)J", "", "offsetMillis", "Landroidx/compose/animation/core/StartOffsetType;", "offsetType", "constructor-impl", "(II)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getHighResolutionOutputSizeshNQ4ISI", "getOffsetMillis-impl", "(J)I", "getOffsetType-Eo1U57Q", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class StartOffset {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1221equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private static long getHighSpeedVideoFpsRangesFor(long j) {
        return j;
    }

    private /* synthetic */ StartOffset(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m1219constructorimpl$default(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = androidx.compose.animation.core.StartOffsetType.INSTANCE.m1233getDelayEo1U57Q();
        }
        return m1218constructorimpl(i, i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1218constructorimpl(int i, int i2) {
        return getHighSpeedVideoFpsRangesFor(i * i2);
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m1222getOffsetMillisimpl(long j) {
        return java.lang.Math.abs((int) j);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m1223getOffsetTypeEo1U57Q(long j) {
        if (j > 0) {
            return androidx.compose.animation.core.StartOffsetType.INSTANCE.m1234getFastForwardEo1U57Q();
        }
        return androidx.compose.animation.core.StartOffsetType.INSTANCE.m1233getDelayEo1U57Q();
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return m1225toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return m1224hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m1220equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1225toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StartOffset(value=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1224hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1220equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.animation.core.StartOffset) && j == ((androidx.compose.animation.core.StartOffset) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.animation.core.StartOffset m1217boximpl(long j) {
        return new androidx.compose.animation.core.StartOffset(j);
    }
}
