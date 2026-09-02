package R1;

/* loaded from: classes.dex */
public final class m implements R1.n {

    /* renamed from: a, reason: collision with root package name */
    public final R1.l f1704a;

    /* renamed from: b, reason: collision with root package name */
    public R1.n f1705b;

    public m(R1.l lVar) {
        this.f1704a = lVar;
    }

    @Override // R1.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return this.f1704a.a(sSLSocket);
    }

    @Override // R1.n
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        R1.n e2 = e(sSLSocket);
        if (e2 == null) {
            return null;
        }
        return e2.b(sSLSocket);
    }

    @Override // R1.n
    public final boolean c() {
        return true;
    }

    @Override // R1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        R1.n e2 = e(sSLSocket);
        if (e2 == null) {
            return;
        }
        e2.d(sSLSocket, str, protocols);
    }

    public final synchronized R1.n e(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            if (this.f1705b == null && this.f1704a.a(sSLSocket)) {
                this.f1705b = this.f1704a.b(sSLSocket);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f1705b;
    }
}
