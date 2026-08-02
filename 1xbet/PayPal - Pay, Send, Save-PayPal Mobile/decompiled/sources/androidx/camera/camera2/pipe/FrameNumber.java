package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/FrameNumber;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "J", "getValue", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class FrameNumber {
    private final long value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m498constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m500equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ FrameNumber(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m502toStringimpl(long j) {
        return "Frame-".concat(java.lang.String.valueOf(j));
    }

    public final java.lang.String toString() {
        return m502toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m503unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m501hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m499equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m501hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m499equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.FrameNumber) && j == ((androidx.camera.camera2.pipe.FrameNumber) obj).m503unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.FrameNumber m497boximpl(long j) {
        return new androidx.camera.camera2.pipe.FrameNumber(j);
    }
}
