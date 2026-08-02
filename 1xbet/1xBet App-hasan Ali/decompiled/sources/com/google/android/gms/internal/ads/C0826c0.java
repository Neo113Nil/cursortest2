package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12942a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12943b;

    /* renamed from: c, reason: collision with root package name */
    public int f12944c;

    /* renamed from: d, reason: collision with root package name */
    public int f12945d;

    /* renamed from: e, reason: collision with root package name */
    public int f12946e;

    public C0826c0(int i, byte[] bArr) {
        this.f12942a = 1;
        this.f12943b = bArr;
        this.f12946e = i;
    }

    public int a() {
        return ((this.f12946e - this.f12944c) * 8) - this.f12945d;
    }

    public int b(int i) {
        int i5;
        byte[] bArr;
        this.f12946e += i;
        int i6 = 0;
        while (true) {
            i5 = this.f12946e;
            bArr = this.f12943b;
            if (i5 <= 8) {
                break;
            }
            int i7 = i5 - 8;
            this.f12946e = i7;
            int i8 = this.f12945d;
            i6 |= (bArr[i8] & 255) << i7;
            if (true != r(i8 + 1)) {
                r3 = 1;
            }
            this.f12945d = i8 + r3;
        }
        int i9 = this.f12945d;
        int i10 = i6 | ((bArr[i9] & 255) >> (8 - i5));
        int i11 = 32 - i;
        if (i5 == 8) {
            this.f12946e = 0;
            this.f12945d = i9 + (true != r(i9 + 1) ? 1 : 2);
        }
        int i12 = ((-1) >>> i11) & i10;
        p();
        return i12;
    }

    public int c() {
        switch (this.f12942a) {
            case 1:
                AbstractC1668us.a0(this.f12945d == 0);
                return this.f12944c;
            default:
                int o5 = o();
                int i = o5 % 2;
                return ((o5 + 1) / 2) * (i == 0 ? -1 : 1);
        }
    }

    public int d(int i) {
        int i5 = this.f12945d;
        int i6 = i5 + 1;
        int min = Math.min(i, 8 - this.f12946e);
        byte[] bArr = this.f12943b;
        int i7 = ((bArr[i5] & 255) >> this.f12946e) & (255 >> (8 - min));
        while (min < i) {
            i7 |= (bArr[i6] & 255) << min;
            min += 8;
            i6++;
        }
        int i8 = i7 & ((-1) >>> (32 - i));
        e(i);
        return i8;
    }

    public void e(int i) {
        int i5;
        int i6 = i / 8;
        int i7 = this.f12945d + i6;
        this.f12945d = i7;
        int i8 = (i - (i6 * 8)) + this.f12946e;
        this.f12946e = i8;
        if (i8 > 7) {
            i7++;
            this.f12945d = i7;
            i8 -= 8;
            this.f12946e = i8;
        }
        boolean z3 = false;
        if (i7 >= 0 && (i7 < (i5 = this.f12944c) || (i7 == i5 && i8 == 0))) {
            z3 = true;
        }
        AbstractC1668us.a0(z3);
    }

    public int f(int i) {
        int i5;
        if (i == 0) {
            return 0;
        }
        this.f12945d += i;
        int i6 = 0;
        while (true) {
            i5 = this.f12945d;
            if (i5 <= 8) {
                break;
            }
            int i7 = i5 - 8;
            this.f12945d = i7;
            byte[] bArr = this.f12943b;
            int i8 = this.f12944c;
            this.f12944c = i8 + 1;
            i6 |= (bArr[i8] & 255) << i7;
        }
        byte[] bArr2 = this.f12943b;
        int i9 = this.f12944c;
        int i10 = i6 | ((bArr2[i9] & 255) >> (8 - i5));
        int i11 = 32 - i;
        if (i5 == 8) {
            this.f12945d = 0;
            this.f12944c = i9 + 1;
        }
        int i12 = ((-1) >>> i11) & i10;
        x();
        return i12;
    }

    public boolean g() {
        int i = (this.f12943b[this.f12945d] & 255) >> this.f12946e;
        e(1);
        return 1 == (i & 1);
    }

    public long h(int i) {
        if (i <= 32) {
            int f = f(i);
            int i5 = AbstractC1260lo.f14419a;
            return 4294967295L & f;
        }
        int f5 = f(i - 32);
        int f6 = f(32);
        int i6 = AbstractC1260lo.f14419a;
        return (4294967295L & f6) | ((f5 & 4294967295L) << 32);
    }

    public void i() {
        int i = this.f12946e + 1;
        this.f12946e = i;
        if (i == 8) {
            this.f12946e = 0;
            int i5 = this.f12945d;
            this.f12945d = i5 + (true == r(i5 + 1) ? 2 : 1);
        }
        p();
    }

    public void j() {
        if (this.f12945d == 0) {
            return;
        }
        this.f12945d = 0;
        this.f12944c++;
        x();
    }

    public void k(int i) {
        int i5 = this.f12945d;
        int i6 = i / 8;
        int i7 = i5 + i6;
        this.f12945d = i7;
        int i8 = (i - (i6 * 8)) + this.f12946e;
        this.f12946e = i8;
        if (i8 > 7) {
            this.f12945d = i7 + 1;
            this.f12946e = i8 - 8;
        }
        while (true) {
            i5++;
            if (i5 > this.f12945d) {
                p();
                return;
            } else if (r(i5)) {
                this.f12945d++;
                i5 += 2;
            }
        }
    }

    public boolean l(int i) {
        int i5;
        int i6 = this.f12945d;
        int i7 = i / 8;
        int i8 = i6 + i7;
        int i9 = (this.f12946e + i) - (i7 * 8);
        if (i9 > 7) {
            i8++;
            i9 -= 8;
        }
        while (true) {
            i6++;
            i5 = this.f12944c;
            if (i6 > i8 || i8 >= i5) {
                break;
            }
            if (r(i6)) {
                i8++;
                i6 += 2;
            }
        }
        if (i8 >= i5) {
            return i8 == i5 && i9 == 0;
        }
        return true;
    }

    public void m(int i, byte[] bArr) {
        int i5;
        int i6 = 0;
        while (true) {
            i5 = i >> 3;
            if (i6 >= i5) {
                break;
            }
            byte[] bArr2 = this.f12943b;
            int i7 = this.f12944c;
            int i8 = i7 + 1;
            this.f12944c = i8;
            byte b3 = bArr2[i7];
            int i9 = this.f12945d;
            byte b5 = (byte) (b3 << i9);
            bArr[i6] = b5;
            bArr[i6] = (byte) (((bArr2[i8] & 255) >> (8 - i9)) | b5);
            i6++;
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return;
        }
        byte b6 = (byte) (bArr[i5] & (255 >> i10));
        bArr[i5] = b6;
        int i11 = this.f12945d;
        if (i11 + i10 > 8) {
            byte[] bArr3 = this.f12943b;
            int i12 = this.f12944c;
            this.f12944c = i12 + 1;
            b6 = (byte) (b6 | ((bArr3[i12] & 255) << i11));
            bArr[i5] = b6;
            i11 -= 8;
        }
        int i13 = i11 + i10;
        this.f12945d = i13;
        byte[] bArr4 = this.f12943b;
        int i14 = this.f12944c;
        bArr[i5] = (byte) (((byte) (((255 & bArr4[i14]) >> (8 - i13)) << (8 - i10))) | b6);
        if (i13 == 8) {
            this.f12945d = 0;
            this.f12944c = i14 + 1;
        }
        x();
    }

    public boolean n() {
        int i = this.f12943b[this.f12945d] & (128 >> this.f12946e);
        i();
        return i != 0;
    }

    public int o() {
        int i = 0;
        while (!n()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? b(i) : 0);
    }

    public void p() {
        int i;
        int i5 = this.f12945d;
        boolean z3 = false;
        if (i5 >= 0 && (i5 < (i = this.f12944c) || (i5 == i && this.f12946e == 0))) {
            z3 = true;
        }
        AbstractC1668us.a0(z3);
    }

    public void q(C1617tm c1617tm) {
        byte[] bArr = c1617tm.f15724a;
        int i = c1617tm.f15726c;
        this.f12943b = bArr;
        this.f12944c = 0;
        this.f12945d = 0;
        this.f12946e = i;
        s(c1617tm.f15725b * 8);
    }

    public boolean r(int i) {
        if (i < 2 || i >= this.f12944c) {
            return false;
        }
        byte[] bArr = this.f12943b;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public void s(int i) {
        int i5 = i / 8;
        this.f12944c = i5;
        this.f12945d = i - (i5 * 8);
        x();
    }

    public void t() {
        int i = this.f12945d + 1;
        this.f12945d = i;
        if (i == 8) {
            this.f12945d = 0;
            this.f12944c++;
        }
        x();
    }

    public void u(int i) {
        int i5 = i / 8;
        int i6 = this.f12944c + i5;
        this.f12944c = i6;
        int i7 = (i - (i5 * 8)) + this.f12945d;
        this.f12945d = i7;
        if (i7 > 7) {
            this.f12944c = i6 + 1;
            this.f12945d = i7 - 8;
        }
        x();
    }

    public void v(int i) {
        AbstractC1668us.a0(this.f12945d == 0);
        this.f12944c += i;
        x();
    }

    public boolean w() {
        int i = this.f12943b[this.f12944c] & (128 >> this.f12945d);
        t();
        return i != 0;
    }

    public void x() {
        int i;
        int i5 = this.f12944c;
        boolean z3 = false;
        if (i5 >= 0 && (i5 < (i = this.f12946e) || (i5 == i && this.f12945d == 0))) {
            z3 = true;
        }
        AbstractC1668us.a0(z3);
    }

    public C0826c0() {
        this.f12942a = 1;
        this.f12943b = AbstractC1260lo.f;
    }

    public C0826c0(byte[] bArr) {
        this.f12942a = 0;
        this.f12943b = bArr;
        this.f12944c = bArr.length;
    }

    public C0826c0(byte[] bArr, int i, int i5) {
        this.f12942a = 2;
        this.f12943b = bArr;
        this.f12945d = i;
        this.f12944c = i5;
        this.f12946e = 0;
        p();
    }
}
