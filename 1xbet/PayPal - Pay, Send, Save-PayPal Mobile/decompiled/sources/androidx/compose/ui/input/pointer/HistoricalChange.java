package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0012\u0010\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/HistoricalChange;", "", "", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "originalEventPosition", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "J", "getUptimeMillis", "()J", "getPosition-F1C5BW0", "p0", "getOriginalEventPosition-F1C5BW0$ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long position;
    private final long uptimeMillis;

    private HistoricalChange(long j, long j2) {
        this.uptimeMillis = j;
        this.position = j2;
        this.originalEventPosition = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name and from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    private HistoricalChange(long j, long j2, long j3) {
        this(j, j2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        this.originalEventPosition = j3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HistoricalChange(uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(", position=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.position));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ HistoricalChange(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public /* synthetic */ HistoricalChange(long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
