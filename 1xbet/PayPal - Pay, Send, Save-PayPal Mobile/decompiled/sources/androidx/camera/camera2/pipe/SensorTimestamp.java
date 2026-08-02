package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/SensorTimestamp;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "J", "getValue", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class SensorTimestamp {
    private final long value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m703constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m705equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ SensorTimestamp(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m708unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m707toStringimpl(this.value);
    }

    public final int hashCode() {
        return m706hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m704equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m707toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SensorTimestamp(value=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m706hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m704equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.SensorTimestamp) && j == ((androidx.camera.camera2.pipe.SensorTimestamp) obj).m708unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.SensorTimestamp m702boximpl(long j) {
        return new androidx.camera.camera2.pipe.SensorTimestamp(j);
    }
}
