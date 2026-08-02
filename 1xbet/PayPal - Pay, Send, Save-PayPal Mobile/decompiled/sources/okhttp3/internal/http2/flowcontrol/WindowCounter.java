package okhttp3.internal.http2.flowcontrol;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "", "", "streamId", "<init>", "(I)V", "", "total", "acknowledged", "", "update", "(JJ)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStreamId", "()I", "p0", "J", "getTotal", "()J", "getAcknowledged", "getUnacknowledged", "unacknowledged"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WindowCounter {
    private long acknowledged;
    private final int streamId;
    private long total;

    public WindowCounter(int i) {
        this.streamId = i;
    }

    public final int getStreamId() {
        return this.streamId;
    }

    public final long getTotal() {
        return this.total;
    }

    public final long getAcknowledged() {
        return this.acknowledged;
    }

    public final long getUnacknowledged() {
        long j;
        long j2;
        synchronized (this) {
            j = this.total;
            j2 = this.acknowledged;
        }
        return j - j2;
    }

    public static /* synthetic */ void update$default(okhttp3.internal.http2.flowcontrol.WindowCounter windowCounter, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        windowCounter.update(j, j2);
    }

    public final void update(long total, long acknowledged) {
        synchronized (this) {
            if (total < 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (acknowledged < 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            long j = this.total + total;
            this.total = j;
            long j2 = this.acknowledged + acknowledged;
            this.acknowledged = j2;
            if (j2 > j) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WindowCounter(streamId=");
        sb.append(this.streamId);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", acknowledged=");
        sb.append(this.acknowledged);
        sb.append(", unacknowledged=");
        sb.append(getUnacknowledged());
        sb.append(')');
        return sb.toString();
    }
}
