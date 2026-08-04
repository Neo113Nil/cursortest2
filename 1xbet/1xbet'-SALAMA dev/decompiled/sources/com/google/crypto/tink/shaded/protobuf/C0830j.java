package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0830j extends L3.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11789i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0830j(byte[] bArr, int i7, int i8, boolean z4) {
        this.f11783c = bArr;
        this.f11784d = i8 + i7;
        this.f11786f = i7;
        this.f11787g = i7;
    }

    @Override // L3.e
    public final String A() throws C {
        int iJ = J();
        if (iJ > 0) {
            int i7 = this.f11784d;
            int i8 = this.f11786f;
            if (iJ <= i7 - i8) {
                String str = new String(this.f11783c, i8, iJ, A.f11702a);
                this.f11786f += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw C.e();
        }
        throw C.g();
    }

    @Override // L3.e
    public final String B() throws C {
        int iJ = J();
        if (iJ > 0) {
            int i7 = this.f11784d;
            int i8 = this.f11786f;
            if (iJ <= i7 - i8) {
                String strT = r0.f11823a.t(this.f11783c, i8, iJ);
                this.f11786f += iJ;
                return strT;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw C.e();
        }
        throw C.g();
    }

    @Override // L3.e
    public final int C() throws C {
        if (g()) {
            this.f11788h = 0;
            return 0;
        }
        int iJ = J();
        this.f11788h = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw C.a();
    }

    @Override // L3.e
    public final int D() {
        return J();
    }

    @Override // L3.e
    public final long E() {
        return K();
    }

    public final int H() throws C {
        int i7 = this.f11786f;
        if (this.f11784d - i7 < 4) {
            throw C.g();
        }
        this.f11786f = i7 + 4;
        byte[] bArr = this.f11783c;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long I() throws C {
        int i7 = this.f11786f;
        if (this.f11784d - i7 < 8) {
            throw C.g();
        }
        this.f11786f = i7 + 8;
        byte[] bArr = this.f11783c;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int J() {
        int i7;
        int i8 = this.f11786f;
        int i9 = this.f11784d;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f11783c;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f11786f = i10;
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
                this.f11786f = i11;
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
        int i7 = this.f11786f;
        int i8 = this.f11784d;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f11783c;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f11786f = i9;
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
                this.f11786f = i10;
                return j;
            }
        }
        return L();
    }

    public final long L() throws C {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i8 = this.f11786f;
            if (i8 == this.f11784d) {
                throw C.g();
            }
            this.f11786f = i8 + 1;
            byte b7 = this.f11783c[i8];
            j |= ((long) (b7 & 127)) << i7;
            if ((b7 & 128) == 0) {
                return j;
            }
        }
        throw C.d();
    }

    public final void M() {
        int i7 = this.f11784d + this.f11785e;
        this.f11784d = i7;
        int i8 = i7 - this.f11787g;
        int i9 = this.f11789i;
        if (i8 <= i9) {
            this.f11785e = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f11785e = i10;
        this.f11784d = i7 - i10;
    }

    @Override // L3.e
    public final void b(int i7) throws C {
        if (this.f11788h != i7) {
            throw new C("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // L3.e
    public final int f() {
        return this.f11786f - this.f11787g;
    }

    @Override // L3.e
    public final boolean g() {
        return this.f11786f == this.f11784d;
    }

    @Override // L3.e
    public final void j(int i7) {
        this.f11789i = i7;
        M();
    }

    @Override // L3.e
    public final int l(int i7) {
        if (i7 < 0) {
            throw C.e();
        }
        int iF = f() + i7;
        if (iF < 0) {
            throw C.f();
        }
        int i8 = this.f11789i;
        if (iF > i8) {
            throw C.g();
        }
        this.f11789i = iF;
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
    public final C0828h o() throws C {
        byte[] bArrCopyOfRange;
        int iJ = J();
        byte[] bArr = this.f11783c;
        if (iJ > 0) {
            int i7 = this.f11784d;
            int i8 = this.f11786f;
            if (iJ <= i7 - i8) {
                C0828h c0828hT = AbstractC0829i.t(bArr, i8, iJ);
                this.f11786f += iJ;
                return c0828hT;
            }
        }
        if (iJ == 0) {
            return AbstractC0829i.f11779b;
        }
        if (iJ > 0) {
            int i9 = this.f11784d;
            int i10 = this.f11786f;
            if (iJ <= i9 - i10) {
                int i11 = iJ + i10;
                this.f11786f = i11;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
            } else {
                if (iJ <= 0) {
                    throw C.g();
                }
                if (iJ == 0) {
                    throw C.e();
                }
                bArrCopyOfRange = A.f11703b;
            }
        } else {
            if (iJ <= 0) {
                throw C.g();
            }
            if (iJ == 0) {
                throw C.e();
            }
            bArrCopyOfRange = A.f11703b;
        }
        C0828h c0828h = AbstractC0829i.f11779b;
        return new C0828h(bArrCopyOfRange);
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
        return L3.e.d(J());
    }

    @Override // L3.e
    public final long z() {
        return L3.e.e(K());
    }
}
