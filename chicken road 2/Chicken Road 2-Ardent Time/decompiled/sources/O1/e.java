package O1;

/* loaded from: classes.dex */
public final class e extends O1.b {

    /* renamed from: d, reason: collision with root package name */
    public long f1178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M1.o f1179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(M1.o this$0, long j2) {
        super(this$0);
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1179e = this$0;
        this.f1178d = j2;
        if (j2 == 0) {
            a();
        }
    }

    @Override // O1.b, V1.w
    public final long c(V1.g sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (this.f1169b) {
            throw new java.lang.IllegalStateException("closed");
        }
        long j3 = this.f1178d;
        if (j3 == 0) {
            return -1L;
        }
        long c2 = super.c(sink, java.lang.Math.min(j3, 8192L));
        if (c2 == -1) {
            ((M1.k) this.f1179e.f1097c).k();
            java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j4 = this.f1178d - c2;
        this.f1178d = j4;
        if (j4 == 0) {
            a();
        }
        return c2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1169b) {
            return;
        }
        if (this.f1178d != 0 && !J1.b.h(this, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            ((M1.k) this.f1179e.f1097c).k();
            a();
        }
        this.f1169b = true;
    }
}
