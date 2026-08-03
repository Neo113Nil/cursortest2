package M1;

/* loaded from: classes.dex */
public final class d implements V1.w {

    /* renamed from: a, reason: collision with root package name */
    public final V1.w f1030a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1031b;

    /* renamed from: c, reason: collision with root package name */
    public long f1032c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1033d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1034e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ M1.e f1036g;

    public d(M1.e this$0, V1.w delegate, long j2) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f1036g = this$0;
        this.f1030a = delegate;
        this.f1031b = j2;
        this.f1033d = true;
        if (j2 == 0) {
            b(null);
        }
    }

    public final void a() {
        this.f1030a.close();
    }

    public final java.io.IOException b(java.io.IOException iOException) {
        if (this.f1034e) {
            return iOException;
        }
        this.f1034e = true;
        M1.e eVar = this.f1036g;
        if (iOException == null && this.f1033d) {
            this.f1033d = false;
            eVar.getClass();
            M1.i call = (M1.i) eVar.f1038b;
            kotlin.jvm.internal.i.e(call, "call");
        }
        return eVar.a(true, false, iOException);
    }

    @Override // V1.w
    public final long c(V1.g sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (this.f1035f) {
            throw new java.lang.IllegalStateException("closed");
        }
        try {
            long c2 = this.f1030a.c(sink, 8192L);
            if (this.f1033d) {
                this.f1033d = false;
                M1.e eVar = this.f1036g;
                eVar.getClass();
                M1.i call = (M1.i) eVar.f1038b;
                kotlin.jvm.internal.i.e(call, "call");
            }
            if (c2 == -1) {
                b(null);
                return -1L;
            }
            long j3 = this.f1032c + c2;
            long j4 = this.f1031b;
            if (j4 == -1 || j3 <= j4) {
                this.f1032c = j3;
                if (j3 == j4) {
                    b(null);
                }
                return c2;
            }
            throw new java.net.ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (java.io.IOException e2) {
            throw b(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1035f) {
            return;
        }
        this.f1035f = true;
        try {
            a();
            b(null);
        } catch (java.io.IOException e2) {
            throw b(e2);
        }
    }

    @Override // V1.w
    public final V1.y d() {
        return this.f1030a.d();
    }

    public final java.lang.String toString() {
        return M1.d.class.getSimpleName() + '(' + this.f1030a + ')';
    }
}
