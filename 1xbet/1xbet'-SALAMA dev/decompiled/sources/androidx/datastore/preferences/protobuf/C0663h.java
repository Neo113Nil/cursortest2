package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0663h extends L3.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9193i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0663h(byte[] bArr, int i7, int i8, boolean z4) {
        this.f9187c = bArr;
        this.f9188d = i8 + i7;
        this.f9190f = i7;
        this.f9191g = i7;
    }

    @Override // L3.e
    public final String A() throws C0679y {
        int iJ = J();
        if (iJ > 0) {
            int i7 = this.f9188d;
            int i8 = this.f9190f;
            if (iJ <= i7 - i8) {
                String str = new String(this.f9187c, i8, iJ, AbstractC0677w.f9255a);
                this.f9190f += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw C0679y.d();
        }
        throw C0679y.e();
    }

    @Override // L3.e
    public final String B() throws C0679y {
        int iJ = J();
        if (iJ > 0) {
            int i7 = this.f9188d;
            int i8 = this.f9190f;
            if (iJ <= i7 - i8) {
                String strP = k0.f9221a.p(this.f9187c, i8, iJ);
                this.f9190f += iJ;
                return strP;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw C0679y.d();
        }
        throw C0679y.e();
    }

    @Override // L3.e
    public final int C() throws C0679y {
        if (g()) {
            this.f9192h = 0;
            return 0;
        }
        int iJ = J();
        this.f9192h = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new C0679y("Protocol message contained an invalid tag (zero).");
    }

    @Override // L3.e
    public final int D() {
        return J();
    }

    @Override // L3.e
    public final long E() {
        return K();
    }

    @Override // L3.e
    public final boolean F(int i7) throws C0679y {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 != 0) {
            if (i8 == 1) {
                N(8);
                return true;
            }
            if (i8 == 2) {
                N(J());
                return true;
            }
            if (i8 == 3) {
                G();
                b(((i7 >>> 3) << 3) | 4);
                return true;
            }
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw C0679y.b();
            }
            N(4);
            return true;
        }
        int i10 = this.f9188d - this.f9190f;
        byte[] bArr = this.f9187c;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f9190f;
                this.f9190f = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw C0679y.c();
        }
        while (i9 < 10) {
            int i12 = this.f9190f;
            if (i12 == this.f9188d) {
                throw C0679y.e();
            }
            this.f9190f = i12 + 1;
            if (bArr[i12] < 0) {
                i9++;
            }
        }
        throw C0679y.c();
        return true;
    }

    public final int H() throws C0679y {
        int i7 = this.f9190f;
        if (this.f9188d - i7 < 4) {
            throw C0679y.e();
        }
        this.f9190f = i7 + 4;
        byte[] bArr = this.f9187c;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long I() throws C0679y {
        int i7 = this.f9190f;
        if (this.f9188d - i7 < 8) {
            throw C0679y.e();
        }
        this.f9190f = i7 + 8;
        byte[] bArr = this.f9187c;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int J() {
        int i7;
        int i8 = this.f9190f;
        int i9 = this.f9188d;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f9187c;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f9190f = i10;
                return b7;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b7;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b8 = bArr[i15];
                            int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f9190f = i11;
                return i7;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j3;
        long j7;
        long j8;
        int i7 = this.f9190f;
        int i8 = this.f9188d;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f9187c;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f9190f = i9;
                return b7;
            }
            if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b7;
                if (i11 < 0) {
                    j = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j8 = (-2080896) ^ i15;
                        } else {
                            long j9 = i15;
                            i10 = i7 + 5;
                            long j10 = j9 ^ (((long) bArr[i14]) << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                i14 = i7 + 6;
                                long j11 = j10 ^ (((long) bArr[i10]) << 35);
                                if (j11 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j10 = j11 ^ (((long) bArr[i14]) << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i14 = i7 + 8;
                                        j11 = j10 ^ (((long) bArr[i10]) << 49);
                                        if (j11 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j12 = (j11 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i16 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j = j12;
                                        }
                                    }
                                }
                                j8 = j3 ^ j11;
                            }
                            j = j7 ^ j10;
                        }
                        i10 = i14;
                        j = j8;
                    }
                }
                this.f9190f = i10;
                return j;
            }
        }
        return L();
    }

    public final long L() throws C0679y {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i8 = this.f9190f;
            if (i8 == this.f9188d) {
                throw C0679y.e();
            }
            this.f9190f = i8 + 1;
            byte b7 = this.f9187c[i8];
            j |= ((long) (b7 & 127)) << i7;
            if ((b7 & 128) == 0) {
                return j;
            }
        }
        throw C0679y.c();
    }

    public final void M() {
        int i7 = this.f9188d + this.f9189e;
        this.f9188d = i7;
        int i8 = i7 - this.f9191g;
        int i9 = this.f9193i;
        if (i8 <= i9) {
            this.f9189e = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f9189e = i10;
        this.f9188d = i7 - i10;
    }

    public final void N(int i7) throws C0679y {
        if (i7 >= 0) {
            int i8 = this.f9188d;
            int i9 = this.f9190f;
            if (i7 <= i8 - i9) {
                this.f9190f = i9 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw C0679y.e();
        }
        throw C0679y.d();
    }

    @Override // L3.e
    public final void b(int i7) throws C0679y {
        if (this.f9192h != i7) {
            throw new C0679y("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // L3.e
    public final int f() {
        return this.f9190f - this.f9191g;
    }

    @Override // L3.e
    public final boolean g() {
        return this.f9190f == this.f9188d;
    }

    @Override // L3.e
    public final void j(int i7) {
        this.f9193i = i7;
        M();
    }

    @Override // L3.e
    public final int l(int i7) throws C0679y {
        if (i7 < 0) {
            throw C0679y.d();
        }
        int iF = f() + i7;
        if (iF < 0) {
            throw new C0679y("Failed to parse the message.");
        }
        int i8 = this.f9193i;
        if (iF > i8) {
            throw C0679y.e();
        }
        this.f9193i = iF;
        M();
        return i8;
    }

    @Override // L3.e
    public final boolean m() {
        return K() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // L3.e
    public final C0662g n() throws C0679y {
        byte[] bArrCopyOfRange;
        int iJ = J();
        byte[] bArr = this.f9187c;
        if (iJ > 0) {
            int i7 = this.f9188d;
            int i8 = this.f9190f;
            if (iJ <= i7 - i8) {
                C0662g c0662gT = C0662g.t(bArr, i8, iJ);
                this.f9190f += iJ;
                return c0662gT;
            }
        }
        if (iJ == 0) {
            return C0662g.f9182c;
        }
        if (iJ > 0) {
            int i9 = this.f9188d;
            int i10 = this.f9190f;
            if (iJ <= i9 - i10) {
                int i11 = iJ + i10;
                this.f9190f = i11;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
            } else {
                if (iJ <= 0) {
                    throw C0679y.e();
                }
                if (iJ == 0) {
                    throw C0679y.d();
                }
                bArrCopyOfRange = AbstractC0677w.f9256b;
            }
        } else {
            if (iJ <= 0) {
                throw C0679y.e();
            }
            if (iJ == 0) {
                throw C0679y.d();
            }
            bArrCopyOfRange = AbstractC0677w.f9256b;
        }
        C0662g c0662g = C0662g.f9182c;
        return new C0662g(bArrCopyOfRange);
    }

    @Override // L3.e
    public final double p() {
        return Double.longBitsToDouble(I());
    }

    @Override // L3.e
    public final int q() {
        return J();
    }

    @Override // L3.e
    public final int r() {
        return H();
    }

    @Override // L3.e
    public final long s() {
        return I();
    }

    @Override // L3.e
    public final float t() {
        return Float.intBitsToFloat(H());
    }

    @Override // L3.e
    public final int u() {
        return J();
    }

    @Override // L3.e
    public final long v() {
        return K();
    }

    @Override // L3.e
    public final int w() {
        return H();
    }

    @Override // L3.e
    public final long x() {
        return I();
    }

    @Override // L3.e
    public final int y() {
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // L3.e
    public final long z() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }
}
