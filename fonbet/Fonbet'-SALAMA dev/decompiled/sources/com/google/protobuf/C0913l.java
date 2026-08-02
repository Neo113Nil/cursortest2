package com.google.protobuf;

import java.util.Arrays;

/* renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0913l extends H6.b {

    /* renamed from: A, reason: collision with root package name */
    public int f12215A = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12216d;

    /* renamed from: e, reason: collision with root package name */
    public int f12217e;

    /* renamed from: f, reason: collision with root package name */
    public int f12218f;

    /* renamed from: x, reason: collision with root package name */
    public int f12219x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12220y;

    /* renamed from: z, reason: collision with root package name */
    public int f12221z;

    public C0913l(byte[] bArr, int i7, int i8, boolean z4) {
        this.f12216d = bArr;
        this.f12217e = i8 + i7;
        this.f12219x = i7;
        this.f12220y = i7;
    }

    @Override // H6.b
    public final int A() {
        if (f()) {
            this.f12221z = 0;
            return 0;
        }
        int G2 = G();
        this.f12221z = G2;
        if ((G2 >>> 3) != 0) {
            return G2;
        }
        throw M.b();
    }

    @Override // H6.b
    public final int B() {
        return G();
    }

    @Override // H6.b
    public final long C() {
        return H();
    }

    @Override // H6.b
    public final boolean D(int i7) {
        int A7;
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            int i10 = this.f12217e - this.f12219x;
            byte[] bArr = this.f12216d;
            if (i10 >= 10) {
                while (i9 < 10) {
                    int i11 = this.f12219x;
                    this.f12219x = i11 + 1;
                    if (bArr[i11] < 0) {
                        i9++;
                    }
                }
                throw M.e();
            }
            while (i9 < 10) {
                int i12 = this.f12219x;
                if (i12 == this.f12217e) {
                    throw M.h();
                }
                this.f12219x = i12 + 1;
                if (bArr[i12] < 0) {
                    i9++;
                }
            }
            throw M.e();
            return true;
        }
        if (i8 == 1) {
            K(8);
            return true;
        }
        if (i8 == 2) {
            K(G());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw M.d();
            }
            K(4);
            return true;
        }
        do {
            A7 = A();
            if (A7 == 0) {
                break;
            }
        } while (D(A7));
        a(((i7 >>> 3) << 3) | 4);
        return true;
    }

    public final int E() {
        int i7 = this.f12219x;
        if (this.f12217e - i7 < 4) {
            throw M.h();
        }
        this.f12219x = i7 + 4;
        byte[] bArr = this.f12216d;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long F() {
        int i7 = this.f12219x;
        if (this.f12217e - i7 < 8) {
            throw M.h();
        }
        this.f12219x = i7 + 8;
        byte[] bArr = this.f12216d;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int G() {
        int i7;
        int i8 = this.f12219x;
        int i9 = this.f12217e;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f12216d;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f12219x = i10;
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
                this.f12219x = i11;
                return i7;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j3;
        long j7;
        long j8;
        int i7 = this.f12219x;
        int i8 = this.f12217e;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f12216d;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f12219x = i9;
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
                            long j10 = j9 ^ (bArr[i14] << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                i14 = i7 + 6;
                                long j11 = j10 ^ (bArr[i10] << 35);
                                if (j11 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j10 = j11 ^ (bArr[i14] << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i14 = i7 + 8;
                                        j11 = j10 ^ (bArr[i10] << 49);
                                        if (j11 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j12 = (j11 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
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
                this.f12219x = i10;
                return j;
            }
        }
        return I();
    }

    public final long I() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i8 = this.f12219x;
            if (i8 == this.f12217e) {
                throw M.h();
            }
            this.f12219x = i8 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((this.f12216d[i8] & 128) == 0) {
                return j;
            }
        }
        throw M.e();
    }

    public final void J() {
        int i7 = this.f12217e + this.f12218f;
        this.f12217e = i7;
        int i8 = i7 - this.f12220y;
        int i9 = this.f12215A;
        if (i8 <= i9) {
            this.f12218f = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f12218f = i10;
        this.f12217e = i7 - i10;
    }

    public final void K(int i7) {
        if (i7 >= 0) {
            int i8 = this.f12217e;
            int i9 = this.f12219x;
            if (i7 <= i8 - i9) {
                this.f12219x = i9 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw M.h();
        }
        throw M.f();
    }

    @Override // H6.b
    public final void a(int i7) {
        if (this.f12221z != i7) {
            throw M.a();
        }
    }

    @Override // H6.b
    public final int e() {
        return this.f12219x - this.f12220y;
    }

    @Override // H6.b
    public final boolean f() {
        return this.f12219x == this.f12217e;
    }

    @Override // H6.b
    public final void h(int i7) {
        this.f12215A = i7;
        J();
    }

    @Override // H6.b
    public final int i(int i7) {
        if (i7 < 0) {
            throw M.f();
        }
        int e7 = e() + i7;
        if (e7 < 0) {
            throw M.g();
        }
        int i8 = this.f12215A;
        if (e7 > i8) {
            throw M.h();
        }
        this.f12215A = e7;
        J();
        return i8;
    }

    @Override // H6.b
    public final boolean j() {
        return H() != 0;
    }

    @Override // H6.b
    public final C0909j k() {
        byte[] bArr;
        int G2 = G();
        byte[] bArr2 = this.f12216d;
        if (G2 > 0) {
            int i7 = this.f12217e;
            int i8 = this.f12219x;
            if (G2 <= i7 - i8) {
                C0909j A7 = AbstractC0911k.A(bArr2, i8, G2);
                this.f12219x += G2;
                return A7;
            }
        }
        if (G2 == 0) {
            return AbstractC0911k.f12212b;
        }
        if (G2 > 0) {
            int i9 = this.f12217e;
            int i10 = this.f12219x;
            if (G2 <= i9 - i10) {
                int i11 = G2 + i10;
                this.f12219x = i11;
                bArr = Arrays.copyOfRange(bArr2, i10, i11);
                C0909j c0909j = AbstractC0911k.f12212b;
                return new C0909j(bArr);
            }
        }
        if (G2 > 0) {
            throw M.h();
        }
        if (G2 != 0) {
            throw M.f();
        }
        bArr = K.f12113b;
        C0909j c0909j2 = AbstractC0911k.f12212b;
        return new C0909j(bArr);
    }

    @Override // H6.b
    public final double l() {
        return Double.longBitsToDouble(F());
    }

    @Override // H6.b
    public final int m() {
        return G();
    }

    @Override // H6.b
    public final int n() {
        return E();
    }

    @Override // H6.b
    public final long o() {
        return F();
    }

    @Override // H6.b
    public final float p() {
        return Float.intBitsToFloat(E());
    }

    @Override // H6.b
    public final int q() {
        return G();
    }

    @Override // H6.b
    public final long s() {
        return H();
    }

    @Override // H6.b
    public final int u() {
        return E();
    }

    @Override // H6.b
    public final long v() {
        return F();
    }

    @Override // H6.b
    public final int w() {
        return H6.b.b(G());
    }

    @Override // H6.b
    public final long x() {
        return H6.b.d(H());
    }

    @Override // H6.b
    public final String y() {
        int G2 = G();
        if (G2 > 0) {
            int i7 = this.f12217e;
            int i8 = this.f12219x;
            if (G2 <= i7 - i8) {
                String str = new String(this.f12216d, i8, G2, K.f12112a);
                this.f12219x += G2;
                return str;
            }
        }
        if (G2 == 0) {
            return "";
        }
        if (G2 < 0) {
            throw M.f();
        }
        throw M.h();
    }

    @Override // H6.b
    public final String z() {
        int G2 = G();
        if (G2 > 0) {
            int i7 = this.f12217e;
            int i8 = this.f12219x;
            if (G2 <= i7 - i8) {
                String H7 = N0.f12134a.H(this.f12216d, i8, G2);
                this.f12219x += G2;
                return H7;
            }
        }
        if (G2 == 0) {
            return "";
        }
        if (G2 <= 0) {
            throw M.f();
        }
        throw M.h();
    }
}
