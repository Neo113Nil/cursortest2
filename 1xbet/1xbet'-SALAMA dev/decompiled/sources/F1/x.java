package F1;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f2586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2587e;

    public x() {
        this.f2583a = 2;
        this.f2586d = p151v2.t.f17164f;
    }

    public void a() {
        int i7;
        int i8;
        switch (this.f2583a) {
            case 2:
                int i9 = this.f2584b;
                p151v2.a.h(i9 >= 0 && (i9 < (i7 = this.f2587e) || (i9 == i7 && this.f2585c == 0)));
                break;
            default:
                int i10 = this.f2585c;
                p151v2.a.h(i10 >= 0 && (i10 < (i8 = this.f2584b) || (i10 == i8 && this.f2587e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f2587e - this.f2584b) * 8) - this.f2585c;
    }

    public void c() {
        if (this.f2585c == 0) {
            return;
        }
        this.f2585c = 0;
        this.f2584b++;
        a();
    }

    public boolean d(int i7) {
        int i8 = this.f2585c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f2587e + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f2584b) {
                break;
            }
            if (p(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.f2584b;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public boolean e() {
        int i7 = this.f2585c;
        int i8 = this.f2587e;
        int i9 = 0;
        while (this.f2585c < this.f2584b && !h()) {
            i9++;
        }
        boolean z4 = this.f2585c == this.f2584b;
        this.f2585c = i7;
        this.f2587e = i8;
        return !z4 && d((i9 * 2) + 1);
    }

    public int f() {
        p151v2.a.h(this.f2585c == 0);
        return this.f2584b;
    }

    public int g() {
        return (this.f2584b * 8) + this.f2585c;
    }

    public boolean h() {
        switch (this.f2583a) {
            case 0:
                boolean z4 = (((this.f2586d[this.f2585c] & 255) >> this.f2587e) & 1) == 1;
                r(1);
                return z4;
            case 1:
            default:
                boolean z7 = (this.f2586d[this.f2585c] & (128 >> this.f2587e)) != 0;
                q();
                return z7;
            case 2:
                boolean z8 = (this.f2586d[this.f2584b] & (128 >> this.f2585c)) != 0;
                q();
                return z8;
        }
    }

    public int i(int i7) {
        switch (this.f2583a) {
            case 0:
                int i8 = this.f2585c;
                int iMin = Math.min(i7, 8 - this.f2587e);
                int i9 = i8 + 1;
                byte[] bArr = this.f2586d;
                int i10 = ((bArr[i8] & 255) >> this.f2587e) & (255 >> (8 - iMin));
                while (iMin < i7) {
                    i10 |= (bArr[i9] & 255) << iMin;
                    iMin += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i7));
                r(i7);
                return i11;
            case 1:
            default:
                this.f2587e += i7;
                int i12 = 0;
                while (true) {
                    int i13 = this.f2587e;
                    int i14 = 2;
                    if (i13 <= 8) {
                        byte[] bArr2 = this.f2586d;
                        int i15 = this.f2585c;
                        int i16 = ((-1) >>> (32 - i7)) & (i12 | ((bArr2[i15] & 255) >> (8 - i13)));
                        if (i13 == 8) {
                            this.f2587e = 0;
                            this.f2585c = i15 + (p(i15 + 1) ? 2 : 1);
                        }
                        a();
                        return i16;
                    }
                    int i17 = i13 - 8;
                    this.f2587e = i17;
                    byte[] bArr3 = this.f2586d;
                    int i18 = this.f2585c;
                    i12 |= (bArr3[i18] & 255) << i17;
                    if (!p(i18 + 1)) {
                        i14 = 1;
                    }
                    this.f2585c = i18 + i14;
                }
                break;
            case 2:
                if (i7 == 0) {
                    return 0;
                }
                this.f2585c += i7;
                int i19 = 0;
                while (true) {
                    int i20 = this.f2585c;
                    if (i20 <= 8) {
                        byte[] bArr4 = this.f2586d;
                        int i21 = this.f2584b;
                        int i22 = ((-1) >>> (32 - i7)) & (i19 | ((bArr4[i21] & 255) >> (8 - i20)));
                        if (i20 == 8) {
                            this.f2585c = 0;
                            this.f2584b = i21 + 1;
                        }
                        a();
                        return i22;
                    }
                    int i23 = i20 - 8;
                    this.f2585c = i23;
                    byte[] bArr5 = this.f2586d;
                    int i24 = this.f2584b;
                    this.f2584b = i24 + 1;
                    i19 |= (bArr5[i24] & 255) << i23;
                }
                break;
        }
    }

    public void j(int i7, byte[] bArr) {
        int i8 = i7 >> 3;
        for (int i9 = 0; i9 < i8; i9++) {
            byte[] bArr2 = this.f2586d;
            int i10 = this.f2584b;
            int i11 = i10 + 1;
            this.f2584b = i11;
            byte b7 = bArr2[i10];
            int i12 = this.f2585c;
            byte b8 = (byte) (b7 << i12);
            bArr[i9] = b8;
            bArr[i9] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b8);
        }
        int i13 = i7 & 7;
        if (i13 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i8] & (255 >> i13));
        bArr[i8] = b9;
        int i14 = this.f2585c;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f2586d;
            int i15 = this.f2584b;
            this.f2584b = i15 + 1;
            bArr[i8] = (byte) (b9 | ((bArr3[i15] & 255) << i14));
            this.f2585c = i14 - 8;
        }
        int i16 = this.f2585c + i13;
        this.f2585c = i16;
        byte[] bArr4 = this.f2586d;
        int i17 = this.f2584b;
        bArr[i8] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i8]);
        if (i16 == 8) {
            this.f2585c = 0;
            this.f2584b = i17 + 1;
        }
        a();
    }

    public void k(int i7, byte[] bArr) {
        p151v2.a.h(this.f2585c == 0);
        System.arraycopy(this.f2586d, this.f2584b, bArr, 0, i7);
        this.f2584b += i7;
        a();
    }

    public int l() {
        int i7 = 0;
        while (!h()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? i(i7) : 0);
    }

    public int m() {
        int iL = l();
        return ((iL + 1) / 2) * (iL % 2 == 0 ? -1 : 1);
    }

    public void n(int i7, byte[] bArr) {
        this.f2586d = bArr;
        this.f2584b = 0;
        this.f2585c = 0;
        this.f2587e = i7;
    }

    public void o(int i7) {
        int i8 = i7 / 8;
        this.f2584b = i8;
        this.f2585c = i7 - (i8 * 8);
        a();
    }

    public boolean p(int i7) {
        if (2 <= i7 && i7 < this.f2584b) {
            byte[] bArr = this.f2586d;
            if (bArr[i7] == 3 && bArr[i7 - 2] == 0 && bArr[i7 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void q() {
        switch (this.f2583a) {
            case 2:
                int i7 = this.f2585c + 1;
                this.f2585c = i7;
                if (i7 == 8) {
                    this.f2585c = 0;
                    this.f2584b++;
                }
                a();
                break;
            default:
                int i8 = this.f2587e + 1;
                this.f2587e = i8;
                if (i8 == 8) {
                    this.f2587e = 0;
                    int i9 = this.f2585c;
                    this.f2585c = i9 + (p(i9 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void r(int i7) {
        int i8;
        switch (this.f2583a) {
            case 0:
                int i9 = i7 / 8;
                int i10 = this.f2585c + i9;
                this.f2585c = i10;
                int i11 = (i7 - (i9 * 8)) + this.f2587e;
                this.f2587e = i11;
                boolean z4 = true;
                if (i11 > 7) {
                    this.f2585c = i10 + 1;
                    this.f2587e = i11 - 8;
                }
                int i12 = this.f2585c;
                if (i12 < 0 || (i12 >= (i8 = this.f2584b) && (i12 != i8 || this.f2587e != 0))) {
                    z4 = false;
                }
                p151v2.a.h(z4);
                break;
            case 1:
            default:
                int i13 = this.f2585c;
                int i14 = i7 / 8;
                int i15 = i13 + i14;
                this.f2585c = i15;
                int i16 = (i7 - (i14 * 8)) + this.f2587e;
                this.f2587e = i16;
                if (i16 > 7) {
                    this.f2585c = i15 + 1;
                    this.f2587e = i16 - 8;
                }
                while (true) {
                    i13++;
                    if (i13 > this.f2585c) {
                        a();
                        break;
                    } else if (p(i13)) {
                        this.f2585c++;
                        i13 += 2;
                    }
                }
                break;
            case 2:
                int i17 = i7 / 8;
                int i18 = this.f2584b + i17;
                this.f2584b = i18;
                int i19 = (i7 - (i17 * 8)) + this.f2585c;
                this.f2585c = i19;
                if (i19 > 7) {
                    this.f2584b = i18 + 1;
                    this.f2585c = i19 - 8;
                }
                a();
                break;
        }
    }

    public void s(int i7) {
        p151v2.a.h(this.f2585c == 0);
        this.f2584b += i7;
        a();
    }

    public x(byte[] bArr, int i7, int i8) {
        this.f2583a = 3;
        this.f2586d = bArr;
        this.f2585c = i7;
        this.f2584b = i8;
        this.f2587e = 0;
        a();
    }

    public x(byte[] bArr) {
        this.f2583a = 0;
        this.f2586d = bArr;
        this.f2584b = bArr.length;
    }

    public x(byte[] bArr, int i7) {
        this.f2583a = 2;
        this.f2586d = bArr;
        this.f2587e = i7;
    }

    public x(int i7, int i8) {
        this.f2583a = 1;
        this.f2584b = i7;
        this.f2585c = i8;
        this.f2586d = new byte[(i8 * 2) - 1];
        this.f2587e = 0;
    }
}
