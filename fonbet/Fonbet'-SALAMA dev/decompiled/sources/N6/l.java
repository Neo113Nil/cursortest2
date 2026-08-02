package N6;

import g6.AbstractC1158g;
import io.sentry.protocol.Request;

/* loaded from: classes2.dex */
public final class l extends f {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f4819e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f4820f;

    public l(byte[][] bArr, int[] iArr) {
        super(f.f4798d.f4799a);
        this.f4819e = bArr;
        this.f4820f = iArr;
    }

    @Override // N6.f
    public final String a() {
        throw null;
    }

    @Override // N6.f
    public final int b() {
        return this.f4820f[this.f4819e.length - 1];
    }

    @Override // N6.f
    public final String c() {
        return new f(t()).c();
    }

    @Override // N6.f
    public final byte[] d() {
        return t();
    }

    @Override // N6.f
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.b() == b() && m(fVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // N6.f
    public final byte f(int i7) {
        byte[][] bArr = this.f4819e;
        int length = bArr.length - 1;
        int[] iArr = this.f4820f;
        p3.f.m(iArr[length], i7, 1L);
        int a2 = O6.b.a(this, i7);
        return bArr[a2][(i7 - (a2 == 0 ? 0 : iArr[a2 - 1])) + iArr[bArr.length + a2]];
    }

    @Override // N6.f
    public final int hashCode() {
        int i7 = this.f4800b;
        if (i7 != 0) {
            return i7;
        }
        byte[][] bArr = this.f4819e;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            int[] iArr = this.f4820f;
            int i11 = iArr[length + i8];
            int i12 = iArr[i8];
            byte[] bArr2 = bArr[i8];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr2[i11];
                i11++;
            }
            i8++;
            i10 = i12;
        }
        this.f4800b = i9;
        return i9;
    }

    @Override // N6.f
    public final boolean l(int i7, byte[] bArr, int i8, int i9) {
        t6.h.e(bArr, Request.JsonKeys.OTHER);
        if (i7 < 0 || i7 > b() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int a2 = O6.b.a(this, i7);
        while (i7 < i10) {
            int[] iArr = this.f4820f;
            int i11 = a2 == 0 ? 0 : iArr[a2 - 1];
            int i12 = iArr[a2] - i11;
            byte[][] bArr2 = this.f4819e;
            int i13 = iArr[bArr2.length + a2];
            int min = Math.min(i10, i12 + i11) - i7;
            if (!p3.f.a(bArr2[a2], (i7 - i11) + i13, bArr, i8, min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            a2++;
        }
        return true;
    }

    @Override // N6.f
    public final boolean m(f fVar, int i7) {
        t6.h.e(fVar, Request.JsonKeys.OTHER);
        if (b() - i7 < 0) {
            return false;
        }
        int a2 = O6.b.a(this, 0);
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int[] iArr = this.f4820f;
            int i10 = a2 == 0 ? 0 : iArr[a2 - 1];
            int i11 = iArr[a2] - i10;
            byte[][] bArr = this.f4819e;
            int i12 = iArr[bArr.length + a2];
            int min = Math.min(i7, i11 + i10) - i8;
            if (!fVar.l(i9, bArr[a2], (i8 - i10) + i12, min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            a2++;
        }
        return true;
    }

    @Override // N6.f
    public final f p() {
        return new f(t()).p();
    }

    @Override // N6.f
    public final byte[] t() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f4819e;
        int length = bArr2.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f4820f;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            int i12 = i11 - i8;
            AbstractC1158g.q0(bArr2[i7], i9, bArr, i10, i10 + i12);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    @Override // N6.f
    public final String toString() {
        return new f(t()).toString();
    }

    @Override // N6.f
    public final void z(d dVar, int i7) {
        t6.h.e(dVar, "buffer");
        int a2 = O6.b.a(this, 0);
        int i8 = 0;
        while (i8 < i7) {
            int[] iArr = this.f4820f;
            int i9 = a2 == 0 ? 0 : iArr[a2 - 1];
            int i10 = iArr[a2] - i9;
            byte[][] bArr = this.f4819e;
            int i11 = iArr[bArr.length + a2];
            int min = Math.min(i7, i10 + i9) - i8;
            int i12 = (i8 - i9) + i11;
            j jVar = new j(bArr[a2], i12, i12 + min, true);
            j jVar2 = dVar.f4796a;
            if (jVar2 == null) {
                jVar.f4815g = jVar;
                jVar.f4814f = jVar;
                dVar.f4796a = jVar;
            } else {
                j jVar3 = jVar2.f4815g;
                t6.h.b(jVar3);
                jVar3.b(jVar);
            }
            i8 += min;
            a2++;
        }
        dVar.f4797b += i7;
    }
}
