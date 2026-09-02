package V1;

/* loaded from: classes.dex */
public final class t extends V1.j {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f1797e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f1798f;

    public t(byte[][] bArr, int[] iArr) {
        super(V1.j.f1765d.f1766a);
        this.f1797e = bArr;
        this.f1798f = iArr;
    }

    @Override // V1.j
    public final int a() {
        return this.f1798f[this.f1797e.length - 1];
    }

    @Override // V1.j
    public final java.lang.String b() {
        return new V1.j(j()).b();
    }

    @Override // V1.j
    public final byte[] c() {
        return j();
    }

    @Override // V1.j
    public final byte d(int i2) {
        byte[][] bArr = this.f1797e;
        int length = bArr.length - 1;
        int[] iArr = this.f1798f;
        a.AbstractC0059a.f(iArr[length], i2, 1L);
        int b2 = W1.b.b(this, i2);
        return bArr[b2][(i2 - (b2 == 0 ? 0 : iArr[b2 - 1])) + iArr[bArr.length + b2]];
    }

    @Override // V1.j
    public final boolean e(int i2, byte[] other, int i3, int i4) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i2 < 0 || i2 > a() - i4 || i3 < 0 || i3 > other.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int b2 = W1.b.b(this, i2);
        while (i2 < i5) {
            int[] iArr = this.f1798f;
            int i6 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i7 = iArr[b2] - i6;
            byte[][] bArr = this.f1797e;
            int i8 = iArr[bArr.length + b2];
            int min = java.lang.Math.min(i5, i7 + i6) - i2;
            if (!a.AbstractC0059a.c((i2 - i6) + i8, i3, min, bArr[b2], other)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b2++;
        }
        return true;
    }

    @Override // V1.j
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof V1.j) {
            V1.j jVar = (V1.j) obj;
            if (jVar.a() == a() && f(jVar, a())) {
                return true;
            }
        }
        return false;
    }

    @Override // V1.j
    public final boolean f(V1.j other, int i2) {
        kotlin.jvm.internal.i.e(other, "other");
        if (a() - i2 < 0) {
            return false;
        }
        int b2 = W1.b.b(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int[] iArr = this.f1798f;
            int i5 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i6 = iArr[b2] - i5;
            byte[][] bArr = this.f1797e;
            int i7 = iArr[bArr.length + b2];
            int min = java.lang.Math.min(i2, i6 + i5) - i3;
            if (!other.e(i4, bArr[b2], (i3 - i5) + i7, min)) {
                return false;
            }
            i4 += min;
            i3 += min;
            b2++;
        }
        return true;
    }

    @Override // V1.j
    public final V1.j g() {
        return new V1.j(j()).g();
    }

    @Override // V1.j
    public final int hashCode() {
        int i2 = this.f1767b;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f1797e;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f1798f;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f1767b = i4;
        return i4;
    }

    @Override // V1.j
    public final void i(V1.g buffer, int i2) {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        int b2 = W1.b.b(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int[] iArr = this.f1798f;
            int i4 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i5 = iArr[b2] - i4;
            byte[][] bArr = this.f1797e;
            int i6 = iArr[bArr.length + b2];
            int min = java.lang.Math.min(i2, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            V1.r rVar = new V1.r(bArr[b2], i7, i7 + min, true);
            V1.r rVar2 = buffer.f1763a;
            if (rVar2 == null) {
                rVar.f1793g = rVar;
                rVar.f1792f = rVar;
                buffer.f1763a = rVar;
            } else {
                V1.r rVar3 = rVar2.f1793g;
                kotlin.jvm.internal.i.b(rVar3);
                rVar3.b(rVar);
            }
            i3 += min;
            b2++;
        }
        buffer.f1764b += i2;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f1797e;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f1798f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            i1.AbstractC0189h.K(i4, i5, i5 + i7, bArr2[i2], bArr);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // V1.j
    public final java.lang.String toString() {
        return new V1.j(j()).toString();
    }
}
