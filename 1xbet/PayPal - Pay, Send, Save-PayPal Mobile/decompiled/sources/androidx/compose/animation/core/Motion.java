package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0016\u001a\u00020\u00138Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0018\u001a\u00020\u00138Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/animation/core/Motion;", "", "", "packedValue", "constructor-impl", "(J)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getPackedValue", "()J", "", "getValue-impl", "(J)F", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getVelocity-impl", "velocity"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class Motion {
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1206constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1208equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ Motion(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m1209getValueimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m1210getVelocityimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1213unboximpl() {
        return this.packedValue;
    }

    public final java.lang.String toString() {
        return m1212toStringimpl(this.packedValue);
    }

    public final int hashCode() {
        return m1211hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m1207equalsimpl(this.packedValue, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1212toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Motion(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1211hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1207equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.animation.core.Motion) && j == ((androidx.compose.animation.core.Motion) obj).m1213unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.animation.core.Motion m1205boximpl(long j) {
        return new androidx.compose.animation.core.Motion(j);
    }
}
