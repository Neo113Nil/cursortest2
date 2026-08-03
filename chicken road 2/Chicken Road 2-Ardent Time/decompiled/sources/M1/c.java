package M1;

/* loaded from: classes.dex */
public final class c implements V1.u {

    /* renamed from: a, reason: collision with root package name */
    public final V1.u f1024a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1025b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1026c;

    /* renamed from: d, reason: collision with root package name */
    public long f1027d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M1.e f1029f;

    public c(M1.e this$0, V1.u delegate, long j2) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f1029f = this$0;
        this.f1024a = delegate;
        this.f1025b = j2;
    }

    public final void a() {
        this.f1024a.close();
    }

    public final java.io.IOException b(java.io.IOException iOException) {
        if (this.f1026c) {
            return iOException;
        }
        this.f1026c = true;
        return this.f1029f.a(false, true, iOException);
    }

    @Override // V1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1028e) {
            return;
        }
        this.f1028e = true;
        long j2 = this.f1025b;
        if (j2 != -1 && this.f1027d != j2) {
            throw new java.net.ProtocolException("unexpected end of stream");
        }
        try {
            a();
            b(null);
        } catch (java.io.IOException e2) {
            throw b(e2);
        }
    }

    @Override // V1.u
    public final V1.y d() {
        return this.f1024a.d();
    }

    @Override // V1.u
    public final void e(V1.g gVar, long j2) {
        if (this.f1028e) {
            throw new java.lang.IllegalStateException("closed");
        }
        long j3 = this.f1025b;
        if (j3 == -1 || this.f1027d + j2 <= j3) {
            try {
                this.f1024a.e(gVar, j2);
                this.f1027d += j2;
                return;
            } catch (java.io.IOException e2) {
                throw b(e2);
            }
        }
        throw new java.net.ProtocolException("expected " + j3 + " bytes but received " + (this.f1027d + j2));
    }

    @Override // V1.u, java.io.Flushable
    public final void flush() {
        try {
            g();
        } catch (java.io.IOException e2) {
            throw b(e2);
        }
    }

    public final void g() {
        this.f1024a.flush();
    }

    public final java.lang.String toString() {
        return M1.c.class.getSimpleName() + '(' + this.f1024a + ')';
    }
}
