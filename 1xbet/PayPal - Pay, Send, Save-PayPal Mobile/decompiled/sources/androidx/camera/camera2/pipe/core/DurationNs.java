package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\n\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0086\n¢\u0006\u0004\b\r\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/core/DurationNs;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "other", "minus-AUCehY4", "(JJ)J", "minus", "plus-AUCehY4", "plus", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "plus-OxkKeMI", "", "compareTo-zYRVrok", "(JJ)I", "compareTo", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "J", "getValue", "()J", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class DurationNs {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.core.DurationNs.Companion INSTANCE = new androidx.camera.camera2.pipe.core.DurationNs.Companion(null);
    private final long value;

    /* renamed from: compareTo-zYRVrok, reason: not valid java name */
    public static final int m871compareTozYRVrok(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m872constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m874equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ DurationNs(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }

    /* renamed from: minus-AUCehY4, reason: not valid java name */
    public static final long m876minusAUCehY4(long j, long j2) {
        return m872constructorimpl(j - j2);
    }

    /* renamed from: plus-AUCehY4, reason: not valid java name */
    public static final long m877plusAUCehY4(long j, long j2) {
        return m872constructorimpl(j + j2);
    }

    /* renamed from: plus-OxkKeMI, reason: not valid java name */
    public static final long m878plusOxkKeMI(long j, long j2) {
        return androidx.camera.camera2.pipe.core.TimestampNs.m888constructorimpl(j + j2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/core/DurationNs$Companion;", "", "<init>", "()V", "", "durationMs", "Landroidx/camera/camera2/pipe/core/DurationNs;", "fromMs-wRu4V9A", "(J)J", "fromMs"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: fromMs-wRu4V9A, reason: not valid java name */
        public final long m881fromMswRu4V9A(long durationMs) {
            return androidx.camera.camera2.pipe.core.DurationNs.m872constructorimpl(durationMs * 1000000);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m880unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m879toStringimpl(this.value);
    }

    public final int hashCode() {
        return m875hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m873equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m879toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DurationNs(value=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m875hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m873equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.core.DurationNs) && j == ((androidx.camera.camera2.pipe.core.DurationNs) obj).m880unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.core.DurationNs m870boximpl(long j) {
        return new androidx.camera.camera2.pipe.core.DurationNs(j);
    }
}
