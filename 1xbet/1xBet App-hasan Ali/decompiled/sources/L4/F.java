package L4;

import java.security.MessageDigest;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class F extends C0229l {

    /* renamed from: o, reason: collision with root package name */
    public final transient byte[][] f3062o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int[] f3063p;

    public F(byte[][] bArr, int[] iArr) {
        super(C0229l.f3092n.f3093k);
        this.f3062o = bArr;
        this.f3063p = iArr;
    }

    @Override // L4.C0229l
    public final C0229l b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f3062o;
        int length = bArr.length;
        int i = 0;
        int i5 = 0;
        while (i < length) {
            int[] iArr = this.f3063p;
            int i6 = iArr[length + i];
            int i7 = iArr[i];
            messageDigest.update(bArr[i], i6, i7 - i5);
            i++;
            i5 = i7;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l.c(digest);
        return new C0229l(digest);
    }

    @Override // L4.C0229l
    public final int c() {
        return this.f3063p[this.f3062o.length - 1];
    }

    @Override // L4.C0229l
    public final String d() {
        return s().d();
    }

    @Override // L4.C0229l
    public final int e(int i, byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        return s().e(i, bArr);
    }

    @Override // L4.C0229l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0229l) {
            C0229l c0229l = (C0229l) obj;
            if (c0229l.c() == c() && l(0, c0229l, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // L4.C0229l
    public final byte[] g() {
        return r();
    }

    @Override // L4.C0229l
    public final byte h(int i) {
        byte[][] bArr = this.f3062o;
        int length = bArr.length - 1;
        int[] iArr = this.f3063p;
        G4.l.o(iArr[length], i, 1L);
        int g5 = M4.b.g(this, i);
        return bArr[g5][(i - (g5 == 0 ? 0 : iArr[g5 - 1])) + iArr[bArr.length + g5]];
    }

    @Override // L4.C0229l
    public final int hashCode() {
        int i = this.f3094l;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f3062o;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f3063p;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            byte[] bArr2 = bArr[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr2[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        this.f3094l = i6;
        return i6;
    }

    @Override // L4.C0229l
    public final int i(byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        return s().i(bArr);
    }

    @Override // L4.C0229l
    public final boolean k(int i, int i5, int i6, byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        if (i < 0 || i > c() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i;
        int g5 = M4.b.g(this, i);
        while (i < i7) {
            int[] iArr = this.f3063p;
            int i8 = g5 == 0 ? 0 : iArr[g5 - 1];
            int i9 = iArr[g5] - i8;
            byte[][] bArr2 = this.f3062o;
            int i10 = iArr[bArr2.length + g5];
            int min = Math.min(i7, i9 + i8) - i;
            if (!G4.l.i((i - i8) + i10, i5, min, bArr2[g5], bArr)) {
                return false;
            }
            i5 += min;
            i += min;
            g5++;
        }
        return true;
    }

    @Override // L4.C0229l
    public final boolean l(int i, C0229l c0229l, int i5) {
        kotlin.jvm.internal.l.f("other", c0229l);
        if (i >= 0 && i <= c() - i5) {
            int i6 = i5 + i;
            int g5 = M4.b.g(this, i);
            int i7 = 0;
            while (i < i6) {
                int[] iArr = this.f3063p;
                int i8 = g5 == 0 ? 0 : iArr[g5 - 1];
                int i9 = iArr[g5] - i8;
                byte[][] bArr = this.f3062o;
                int i10 = iArr[bArr.length + g5];
                int min = Math.min(i6, i9 + i8) - i;
                if (c0229l.k(i7, (i - i8) + i10, min, bArr[g5])) {
                    i7 += min;
                    i += min;
                    g5++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // L4.C0229l
    public final C0229l m(int i, int i5) {
        if (i5 == -1234567890) {
            i5 = c();
        }
        if (i < 0) {
            throw new IllegalArgumentException(L1.a.l(i, "beginIndex=", " < 0").toString());
        }
        if (i5 > c()) {
            StringBuilder v4 = AbstractC2107A.v(i5, "endIndex=", " > length(");
            v4.append(c());
            v4.append(')');
            throw new IllegalArgumentException(v4.toString().toString());
        }
        int i6 = i5 - i;
        if (i6 < 0) {
            throw new IllegalArgumentException(L1.a.k(i5, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i5 == c()) {
            return this;
        }
        if (i == i5) {
            return C0229l.f3092n;
        }
        int g5 = M4.b.g(this, i);
        int g6 = M4.b.g(this, i5 - 1);
        byte[][] bArr = this.f3062o;
        byte[][] bArr2 = (byte[][]) X3.l.A0(bArr, g5, g6 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f3063p;
        if (g5 <= g6) {
            int i7 = g5;
            int i8 = 0;
            while (true) {
                iArr[i8] = Math.min(iArr2[i7] - i, i6);
                int i9 = i8 + 1;
                iArr[i8 + bArr2.length] = iArr2[bArr.length + i7];
                if (i7 == g6) {
                    break;
                }
                i7++;
                i8 = i9;
            }
        }
        int i10 = g5 != 0 ? iArr2[g5 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i10) + iArr[length];
        return new F(bArr2, iArr);
    }

    @Override // L4.C0229l
    public final C0229l o() {
        return s().o();
    }

    @Override // L4.C0229l
    public final void q(C0226i c0226i, int i) {
        kotlin.jvm.internal.l.f("buffer", c0226i);
        int g5 = M4.b.g(this, 0);
        int i5 = 0;
        while (i5 < i) {
            int[] iArr = this.f3063p;
            int i6 = g5 == 0 ? 0 : iArr[g5 - 1];
            int i7 = iArr[g5] - i6;
            byte[][] bArr = this.f3062o;
            int i8 = iArr[bArr.length + g5];
            int min = Math.min(i, i7 + i6) - i5;
            int i9 = (i5 - i6) + i8;
            D d5 = new D(bArr[g5], i9, i9 + min, true);
            D d6 = c0226i.f3090k;
            if (d6 == null) {
                d5.f3058g = d5;
                d5.f = d5;
                c0226i.f3090k = d5;
            } else {
                D d7 = d6.f3058g;
                kotlin.jvm.internal.l.c(d7);
                d7.b(d5);
            }
            i5 += min;
            g5++;
        }
        c0226i.f3091l += i;
    }

    public final byte[] r() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f3062o;
        int length = bArr2.length;
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        while (i < length) {
            int[] iArr = this.f3063p;
            int i7 = iArr[length + i];
            int i8 = iArr[i];
            int i9 = i8 - i5;
            X3.l.r0(i6, i7, i7 + i9, bArr2[i], bArr);
            i6 += i9;
            i++;
            i5 = i8;
        }
        return bArr;
    }

    public final C0229l s() {
        return new C0229l(r());
    }

    @Override // L4.C0229l
    public final String toString() {
        return s().toString();
    }
}
