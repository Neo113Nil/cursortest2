package U5;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f6452e;

    public Z(String str, boolean z4, a0 a0Var) {
        super(z4, str, a0Var);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(P6.b.z("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        this.f6452e = a0Var;
    }

    @Override // U5.Y
    public final Object a(byte[] bArr) {
        return this.f6452e.f(bArr);
    }

    @Override // U5.Y
    public final byte[] b(Object obj) {
        byte[] bArrMo0a = this.f6452e.mo0a(obj);
        p113p3.f.k(bArrMo0a, "null marshaller.toAsciiString()");
        return bArrMo0a;
    }
}
