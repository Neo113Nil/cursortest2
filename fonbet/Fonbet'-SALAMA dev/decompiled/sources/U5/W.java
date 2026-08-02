package U5;

/* loaded from: classes2.dex */
public final class W extends Y {

    /* renamed from: e, reason: collision with root package name */
    public final X f6447e;

    public W(String str, X x4) {
        super(false, str, x4);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(P6.b.z("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        p3.f.k(x4, "marshaller");
        this.f6447e = x4;
    }

    @Override // U5.Y
    public final Object a(byte[] bArr) {
        return this.f6447e.e(new String(bArr, D3.f.f1717a));
    }

    @Override // U5.Y
    public final byte[] b(Object obj) {
        String a2 = this.f6447e.a(obj);
        p3.f.k(a2, "null marshaller.toAsciiString()");
        return a2.getBytes(D3.f.f1717a);
    }
}
