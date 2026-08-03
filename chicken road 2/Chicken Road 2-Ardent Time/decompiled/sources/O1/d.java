package O1;

/* loaded from: classes.dex */
public final class d extends O1.b {

    /* renamed from: d, reason: collision with root package name */
    public final I1.o f1174d;

    /* renamed from: e, reason: collision with root package name */
    public long f1175e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ M1.o f1177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(M1.o this$0, I1.o url) {
        super(this$0);
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(url, "url");
        this.f1177g = this$0;
        this.f1174d = url;
        this.f1175e = -1L;
        this.f1176f = true;
    }

    @Override // O1.b, V1.w
    public final long c(V1.g sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (this.f1169b) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (!this.f1176f) {
            return -1L;
        }
        long j3 = this.f1175e;
        M1.o oVar = this.f1177g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((V1.q) oVar.f1098d).o(Long.MAX_VALUE);
            }
            try {
                this.f1175e = ((V1.q) oVar.f1098d).k();
                java.lang.String obj = y1.g.c0(((V1.q) oVar.f1098d).o(Long.MAX_VALUE)).toString();
                if (this.f1175e < 0 || (obj.length() > 0 && !y1.o.K(obj, ";", false))) {
                    throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + this.f1175e + obj + '\"');
                }
                if (this.f1175e == 0) {
                    this.f1176f = false;
                    oVar.f1101g = ((O1.a) oVar.f1100f).c();
                    I1.s sVar = (I1.s) oVar.f1096b;
                    kotlin.jvm.internal.i.b(sVar);
                    I1.m mVar = (I1.m) oVar.f1101g;
                    kotlin.jvm.internal.i.b(mVar);
                    N1.f.b(sVar.f805j, this.f1174d, mVar);
                    a();
                }
                if (!this.f1176f) {
                    return -1L;
                }
            } catch (java.lang.NumberFormatException e2) {
                throw new java.net.ProtocolException(e2.getMessage());
            }
        }
        long c2 = super.c(sink, java.lang.Math.min(8192L, this.f1175e));
        if (c2 != -1) {
            this.f1175e -= c2;
            return c2;
        }
        ((M1.k) oVar.f1097c).k();
        java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1169b) {
            return;
        }
        if (this.f1176f && !J1.b.h(this, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            ((M1.k) this.f1177g.f1097c).k();
            a();
        }
        this.f1169b = true;
    }
}
