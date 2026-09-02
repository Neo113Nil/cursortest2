package R1;

/* loaded from: classes.dex */
public final class j implements R1.l {
    @Override // R1.l
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        boolean z2 = Q1.h.f1623d;
        return Q1.f.b() && org.conscrypt.Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // R1.l
    public final R1.n b(javax.net.ssl.SSLSocket sSLSocket) {
        return new R1.k();
    }
}
