package s1;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q extends h {

    /* renamed from: f, reason: collision with root package name */
    public final transient byte[][] f6651f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int[] f6652g;

    public q(e eVar, int i2) {
        super(null);
        v.a(eVar.f6618b, 0L, i2);
        o oVar = eVar.f6617a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = oVar.f6643c;
            int i7 = oVar.f6642b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            oVar = oVar.f6646f;
        }
        this.f6651f = new byte[i5][];
        this.f6652g = new int[i5 * 2];
        o oVar2 = eVar.f6617a;
        int i8 = 0;
        while (i3 < i2) {
            byte[][] bArr = this.f6651f;
            bArr[i8] = oVar2.f6641a;
            int i9 = oVar2.f6643c;
            int i10 = oVar2.f6642b;
            int i11 = (i9 - i10) + i3;
            i3 = i11 > i2 ? i2 : i11;
            int[] iArr = this.f6652g;
            iArr[i8] = i3;
            iArr[bArr.length + i8] = i10;
            oVar2.f6644d = true;
            i8++;
            oVar2 = oVar2.f6646f;
        }
    }

    @Override // s1.h
    public final byte d(int i2) {
        byte[][] bArr = this.f6651f;
        int length = bArr.length - 1;
        int[] iArr = this.f6652g;
        v.a(iArr[length], i2, 1L);
        int n2 = n(i2);
        return bArr[n2][(i2 - (n2 == 0 ? 0 : iArr[n2 - 1])) + iArr[bArr.length + n2]];
    }

    @Override // s1.h
    public final String e() {
        return o().e();
    }

    @Override // s1.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.i() == i() && h(hVar, i())) {
                return true;
            }
        }
        return false;
    }

    @Override // s1.h
    public final boolean g(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > i() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int n2 = n(i2);
        while (i4 > 0) {
            int[] iArr = this.f6652g;
            int i5 = n2 == 0 ? 0 : iArr[n2 - 1];
            int min = Math.min(i4, ((iArr[n2] - i5) + i5) - i2);
            byte[][] bArr2 = this.f6651f;
            int i6 = (i2 - i5) + iArr[bArr2.length + n2];
            byte[] bArr3 = bArr2[n2];
            Charset charset = v.f6657a;
            for (int i7 = 0; i7 < min; i7++) {
                if (bArr3[i7 + i6] != bArr[i7 + i3]) {
                    return false;
                }
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            n2++;
        }
        return true;
    }

    @Override // s1.h
    public final boolean h(h hVar, int i2) {
        if (i() - i2 < 0) {
            return false;
        }
        int n2 = n(0);
        int i3 = 0;
        int i4 = 0;
        while (i2 > 0) {
            int[] iArr = this.f6652g;
            int i5 = n2 == 0 ? 0 : iArr[n2 - 1];
            int min = Math.min(i2, ((iArr[n2] - i5) + i5) - i3);
            byte[][] bArr = this.f6651f;
            if (!hVar.g(i4, bArr[n2], (i3 - i5) + iArr[bArr.length + n2], min)) {
                return false;
            }
            i3 += min;
            i4 += min;
            i2 -= min;
            n2++;
        }
        return true;
    }

    @Override // s1.h
    public final int hashCode() {
        int i2 = this.f6622b;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f6651f;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            byte[] bArr2 = bArr[i3];
            int[] iArr = this.f6652g;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f6622b = i4;
        return i4;
    }

    @Override // s1.h
    public final int i() {
        return this.f6652g[this.f6651f.length - 1];
    }

    @Override // s1.h
    public final h j() {
        return o().j();
    }

    @Override // s1.h
    public final h k() {
        return o().k();
    }

    @Override // s1.h
    public final String l() {
        return o().l();
    }

    @Override // s1.h
    public final void m(e eVar) {
        byte[][] bArr = this.f6651f;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f6652g;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            o oVar = new o(bArr[i2], i4, (i4 + i5) - i3);
            o oVar2 = eVar.f6617a;
            if (oVar2 == null) {
                oVar.f6647g = oVar;
                oVar.f6646f = oVar;
                eVar.f6617a = oVar;
            } else {
                oVar2.f6647g.b(oVar);
            }
            i2++;
            i3 = i5;
        }
        eVar.f6618b += i3;
    }

    public final int n(int i2) {
        int binarySearch = Arrays.binarySearch(this.f6652g, 0, this.f6651f.length, i2 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public final h o() {
        byte[][] bArr = this.f6651f;
        int length = bArr.length - 1;
        int[] iArr = this.f6652g;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            int i4 = iArr[length2 + i2];
            int i5 = iArr[i2];
            System.arraycopy(bArr[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return new h(bArr2);
    }

    @Override // s1.h
    public final String toString() {
        return o().toString();
    }
}
