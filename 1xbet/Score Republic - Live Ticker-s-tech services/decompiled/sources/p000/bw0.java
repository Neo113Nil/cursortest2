package p000;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bw0 extends fw0 {

    /* JADX INFO: renamed from: e */
    public final oq0 f1008e;

    /* JADX INFO: renamed from: f */
    public final oq0 f1009f;

    /* JADX INFO: renamed from: g */
    public final oq0 f1010g;

    /* JADX INFO: renamed from: h */
    public final oq0 f1011h;

    /* JADX INFO: renamed from: i */
    public final int f1012i;

    public bw0(oq0 oq0Var, oq0 oq0Var2, oq0 oq0Var3, oq0 oq0Var4, Provider provider, int i) {
        super(provider);
        this.f1008e = oq0Var;
        this.f1009f = oq0Var2;
        this.f1010g = oq0Var3;
        this.f1011h = oq0Var4;
        this.f1012i = i;
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: c */
    public final void mo787c(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f1008e.m3740l(sSLSocket, Boolean.TRUE);
            this.f1009f.m3740l(sSLSocket, str);
        }
        Class<?> cls = sSLSocket.getClass();
        oq0 oq0Var = this.f1011h;
        if (oq0Var.m3738h(cls) != null) {
            oq0Var.m3741m(sSLSocket, fw0.m1895b(list));
        }
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: d */
    public final String mo788d(SSLSocket sSLSocket) {
        byte[] bArr;
        Class<?> cls = sSLSocket.getClass();
        oq0 oq0Var = this.f1010g;
        if (oq0Var.m3738h(cls) == null || (bArr = (byte[]) oq0Var.m3741m(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, ah1.f184b);
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: e */
    public final int mo789e() {
        return this.f1012i;
    }
}
