package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\n¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/core/TimestampNs;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "other", "Landroidx/camera/camera2/pipe/core/DurationNs;", "minus-pEw-518", "(JJ)J", "minus", "plus-rKz7-cU", "plus", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "J", "getValue", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class TimestampNs {
    private final long value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m888constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m890equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ TimestampNs(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }

    /* renamed from: minus-pEw-518, reason: not valid java name */
    public static final long m892minuspEw518(long j, long j2) {
        return androidx.camera.camera2.pipe.core.DurationNs.m872constructorimpl(j - j2);
    }

    /* renamed from: plus-rKz7-cU, reason: not valid java name */
    public static final long m893plusrKz7cU(long j, long j2) {
        return m888constructorimpl(j + j2);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m895unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m894toStringimpl(this.value);
    }

    public final int hashCode() {
        return m891hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m889equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m894toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimestampNs(value=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m891hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m889equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.core.TimestampNs) && j == ((androidx.camera.camera2.pipe.core.TimestampNs) obj).m895unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.core.TimestampNs m887boximpl(long j) {
        return new androidx.camera.camera2.pipe.core.TimestampNs(j);
    }
}
