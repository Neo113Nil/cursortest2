package Y5;

import android.support.v4.media.session.t;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class f extends j {

    /* renamed from: e, reason: collision with root package name */
    public final t f7786e;

    /* renamed from: f, reason: collision with root package name */
    public final t f7787f;

    /* renamed from: g, reason: collision with root package name */
    public final t f7788g;

    /* renamed from: h, reason: collision with root package name */
    public final t f7789h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7790i;

    public f(t tVar, t tVar2, t tVar3, t tVar4, Provider provider, int i7) {
        super(provider);
        this.f7786e = tVar;
        this.f7787f = tVar2;
        this.f7788g = tVar3;
        this.f7789h = tVar4;
        this.f7790i = i7;
    }

    @Override // Y5.j
    public final void c(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f7786e.n0(sSLSocket, Boolean.TRUE);
            this.f7787f.n0(sSLSocket, str);
        }
        t tVar = this.f7789h;
        if (tVar.c0(sSLSocket.getClass()) != null) {
            tVar.o0(sSLSocket, j.b(list));
        }
    }

    @Override // Y5.j
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        t tVar = this.f7788g;
        if ((tVar.c0(sSLSocket.getClass()) != null) && (bArr = (byte[]) tVar.o0(sSLSocket, new Object[0])) != null) {
            return new String(bArr, m.f7819b);
        }
        return null;
    }

    @Override // Y5.j
    public final int e() {
        return this.f7790i;
    }
}
