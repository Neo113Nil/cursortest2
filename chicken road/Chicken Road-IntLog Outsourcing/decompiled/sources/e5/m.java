package e5;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f5542a;

    /* renamed from: b, reason: collision with root package name */
    public n f5543b;

    public m(l lVar) {
        this.f5542a = lVar;
    }

    @Override // e5.n
    public final String a(SSLSocket sSLSocket) {
        n e3 = e(sSLSocket);
        if (e3 != null) {
            return e3.a(sSLSocket);
        }
        return null;
    }

    @Override // e5.n
    public final boolean b(SSLSocket sSLSocket) {
        return this.f5542a.b(sSLSocket);
    }

    @Override // e5.n
    public final boolean c() {
        return true;
    }

    @Override // e5.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        n e3 = e(sSLSocket);
        if (e3 != null) {
            e3.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f5543b == null && this.f5542a.b(sSLSocket)) {
                this.f5543b = this.f5542a.d(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5543b;
    }
}
