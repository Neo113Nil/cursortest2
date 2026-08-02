package H4;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f2380a;

    /* renamed from: b, reason: collision with root package name */
    public n f2381b;

    public m(l lVar) {
        this.f2380a = lVar;
    }

    @Override // H4.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f2380a.a(sSLSocket);
    }

    @Override // H4.n
    public final String b(SSLSocket sSLSocket) {
        n e3 = e(sSLSocket);
        if (e3 != null) {
            return e3.b(sSLSocket);
        }
        return null;
    }

    @Override // H4.n
    public final boolean c() {
        return true;
    }

    @Override // H4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        n e3 = e(sSLSocket);
        if (e3 != null) {
            e3.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f2381b == null && this.f2380a.a(sSLSocket)) {
                this.f2381b = this.f2380a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2381b;
    }
}
