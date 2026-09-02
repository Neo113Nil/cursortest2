package s1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6641a;

    /* renamed from: b, reason: collision with root package name */
    public int f6642b;

    /* renamed from: c, reason: collision with root package name */
    public int f6643c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6644d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6645e;

    /* renamed from: f, reason: collision with root package name */
    public o f6646f;

    /* renamed from: g, reason: collision with root package name */
    public o f6647g;

    public o() {
        this.f6641a = new byte[8192];
        this.f6645e = true;
        this.f6644d = false;
    }

    public final o a() {
        o oVar = this.f6646f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f6647g;
        oVar3.f6646f = oVar;
        this.f6646f.f6647g = oVar3;
        this.f6646f = null;
        this.f6647g = null;
        return oVar2;
    }

    public final void b(o oVar) {
        oVar.f6647g = this;
        oVar.f6646f = this.f6646f;
        this.f6646f.f6647g = oVar;
        this.f6646f = oVar;
    }

    public final o c() {
        this.f6644d = true;
        return new o(this.f6641a, this.f6642b, this.f6643c);
    }

    public final void d(o oVar, int i2) {
        if (!oVar.f6645e) {
            throw new IllegalArgumentException();
        }
        int i3 = oVar.f6643c;
        int i4 = i3 + i2;
        byte[] bArr = oVar.f6641a;
        if (i4 > 8192) {
            if (oVar.f6644d) {
                throw new IllegalArgumentException();
            }
            int i5 = oVar.f6642b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i5, bArr, 0, i3 - i5);
            oVar.f6643c -= oVar.f6642b;
            oVar.f6642b = 0;
        }
        System.arraycopy(this.f6641a, this.f6642b, bArr, oVar.f6643c, i2);
        oVar.f6643c += i2;
        this.f6642b += i2;
    }

    public o(byte[] bArr, int i2, int i3) {
        this.f6641a = bArr;
        this.f6642b = i2;
        this.f6643c = i3;
        this.f6644d = true;
        this.f6645e = false;
    }
}
