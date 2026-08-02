package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lp0 extends kp0 {

    /* JADX INFO: renamed from: e */
    public final mp0 f4879e;

    public lp0(String str, boolean z, mp0 mp0Var) {
        super(mp0Var, str, z);
        if (str.endsWith("-bin")) {
            C0270h1.m2190f(o80.m3651s("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
            throw null;
        }
        this.f4879e = mp0Var;
    }

    @Override // p000.kp0
    /* JADX INFO: renamed from: a */
    public final Object mo2949a(byte[] bArr) {
        return this.f4879e.mo160h(bArr);
    }

    @Override // p000.kp0
    /* JADX INFO: renamed from: b */
    public final byte[] mo2950b(Object obj) {
        byte[] bArrMo157e = this.f4879e.mo157e(obj);
        a90.m127k(bArrMo157e, "null marshaller.toAsciiString()");
        return bArrMo157e;
    }
}
