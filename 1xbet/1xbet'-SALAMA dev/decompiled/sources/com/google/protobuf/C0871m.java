package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0871m extends H6.b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f12223B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f12224C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f12225D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f12226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f12227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12228f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12229x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12231z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12230y = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12222A = 0;

    public C0871m(ArrayList arrayList, int i7) {
        this.f12228f = i7;
        this.f12226d = arrayList.iterator();
        if (i7 != 0) {
            O();
            return;
        }
        this.f12227e = K.f12114c;
        this.f12223B = 0L;
        this.f12224C = 0L;
        this.f12225D = 0L;
    }

    @Override // H6.b
    public final int A() throws M {
        if (f()) {
            this.f12231z = 0;
            return 0;
        }
        int iJ = J();
        this.f12231z = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw M.b();
    }

    @Override // H6.b
    public final int B() {
        return J();
    }

    @Override // H6.b
    public final long C() {
        return K();
    }

    @Override // H6.b
    public final boolean D(int i7) throws M {
        int iA;
        int i8 = i7 & 7;
        if (i8 == 0) {
            for (int i9 = 0; i9 < 10; i9++) {
                if (F() >= 0) {
                    return true;
                }
            }
            throw M.e();
        }
        if (i8 == 1) {
            N(8);
            return true;
        }
        if (i8 == 2) {
            N(J());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw M.d();
            }
            N(4);
            return true;
        }
        do {
            iA = A();
            if (iA == 0) {
                break;
            }
        } while (D(iA));
        a(((i7 >>> 3) << 3) | 4);
        return true;
    }

    public final long E() {
        return this.f12225D - this.f12223B;
    }

    public final byte F() throws M {
        if (E() == 0) {
            if (!this.f12226d.hasNext()) {
                throw M.h();
            }
            O();
        }
        long j = this.f12223B;
        this.f12223B = 1 + j;
        return K0.f12117c.e(j);
    }

    public final void G(int i7, byte[] bArr) throws M {
        if (i7 < 0 || i7 > M()) {
            if (i7 > 0) {
                throw M.h();
            }
            if (i7 != 0) {
                throw M.f();
            }
            return;
        }
        int i8 = i7;
        while (i8 > 0) {
            if (E() == 0) {
                if (!this.f12226d.hasNext()) {
                    throw M.h();
                }
                O();
            }
            int iMin = Math.min(i8, (int) E());
            long j = iMin;
            K0.f12117c.c(this.f12223B, bArr, i7 - i8, j);
            i8 -= iMin;
            this.f12223B += j;
        }
    }

    public final int H() {
        if (E() < 4) {
            return (F() & 255) | ((F() & 255) << 8) | ((F() & 255) << 16) | ((F() & 255) << 24);
        }
        long j = this.f12223B;
        this.f12223B = 4 + j;
        J0 j3 = K0.f12117c;
        return ((j3.e(j + 3) & 255) << 24) | (j3.e(j) & 255) | ((j3.e(1 + j) & 255) << 8) | ((j3.e(2 + j) & 255) << 16);
    }

    public final long I() throws M {
        long jF;
        byte bF;
        if (E() >= 8) {
            long j = this.f12223B;
            this.f12223B = 8 + j;
            J0 j3 = K0.f12117c;
            jF = (((long) j3.e(j)) & 255) | ((((long) j3.e(j + 1)) & 255) << 8) | ((((long) j3.e(2 + j)) & 255) << 16) | ((((long) j3.e(3 + j)) & 255) << 24) | ((((long) j3.e(4 + j)) & 255) << 32) | ((((long) j3.e(5 + j)) & 255) << 40) | ((((long) j3.e(6 + j)) & 255) << 48);
            bF = j3.e(j + 7);
        } else {
            jF = (((long) F()) & 255) | ((((long) F()) & 255) << 8) | ((((long) F()) & 255) << 16) | ((((long) F()) & 255) << 24) | ((((long) F()) & 255) << 32) | ((((long) F()) & 255) << 40) | ((((long) F()) & 255) << 48);
            bF = F();
        }
        return ((((long) bF) & 255) << 56) | jF;
    }

    public final int J() {
        int i7;
        long j = this.f12223B;
        if (this.f12225D != j) {
            long j3 = j + 1;
            J0 j7 = K0.f12117c;
            byte bE = j7.e(j);
            if (bE >= 0) {
                this.f12223B++;
                return bE;
            }
            if (this.f12225D - this.f12223B >= 10) {
                long j8 = 2 + j;
                int iE = (j7.e(j3) << 7) ^ bE;
                if (iE < 0) {
                    i7 = iE ^ (-128);
                } else {
                    long j9 = 3 + j;
                    int iE2 = (j7.e(j8) << 14) ^ iE;
                    if (iE2 >= 0) {
                        i7 = iE2 ^ 16256;
                    } else {
                        long j10 = 4 + j;
                        int iE3 = iE2 ^ (j7.e(j9) << 21);
                        if (iE3 < 0) {
                            i7 = (-2080896) ^ iE3;
                        } else {
                            j9 = 5 + j;
                            byte bE2 = j7.e(j10);
                            int i8 = (iE3 ^ (bE2 << 28)) ^ 266354560;
                            if (bE2 < 0) {
                                j10 = 6 + j;
                                if (j7.e(j9) < 0) {
                                    j9 = 7 + j;
                                    if (j7.e(j10) < 0) {
                                        j10 = 8 + j;
                                        if (j7.e(j9) < 0) {
                                            j9 = 9 + j;
                                            if (j7.e(j10) < 0) {
                                                long j11 = j + 10;
                                                if (j7.e(j9) >= 0) {
                                                    i7 = i8;
                                                    j8 = j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i8;
                            }
                            i7 = i8;
                        }
                        j8 = j10;
                    }
                    j8 = j9;
                }
                this.f12223B = j8;
                return i7;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j3;
        long j7;
        long j8 = this.f12223B;
        if (this.f12225D != j8) {
            long j9 = j8 + 1;
            J0 j10 = K0.f12117c;
            byte bE = j10.e(j8);
            if (bE >= 0) {
                this.f12223B++;
                return bE;
            }
            if (this.f12225D - this.f12223B >= 10) {
                long j11 = 2 + j8;
                int iE = (j10.e(j9) << 7) ^ bE;
                if (iE < 0) {
                    j = iE ^ (-128);
                } else {
                    long j12 = 3 + j8;
                    int iE2 = (j10.e(j11) << 14) ^ iE;
                    if (iE2 >= 0) {
                        j = iE2 ^ 16256;
                    } else {
                        long j13 = 4 + j8;
                        int iE3 = iE2 ^ (j10.e(j12) << 21);
                        if (iE3 < 0) {
                            j = (-2080896) ^ iE3;
                            j11 = j13;
                        } else {
                            long j14 = 5 + j8;
                            long jE = (((long) j10.e(j13)) << 28) ^ ((long) iE3);
                            if (jE >= 0) {
                                j7 = 266354560;
                            } else {
                                j12 = 6 + j8;
                                long jE2 = jE ^ (((long) j10.e(j14)) << 35);
                                if (jE2 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j14 = 7 + j8;
                                    jE = jE2 ^ (((long) j10.e(j12)) << 42);
                                    if (jE >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        j12 = 8 + j8;
                                        jE2 = jE ^ (((long) j10.e(j14)) << 49);
                                        if (jE2 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j14 = 9 + j8;
                                            long jE3 = (jE2 ^ (((long) j10.e(j12)) << 56)) ^ 71499008037633920L;
                                            if (jE3 < 0) {
                                                long j15 = j8 + 10;
                                                if (j10.e(j14) >= 0) {
                                                    j = jE3;
                                                    j11 = j15;
                                                }
                                            } else {
                                                j = jE3;
                                                j11 = j14;
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ jE2;
                            }
                            j = j7 ^ jE;
                            j11 = j14;
                        }
                    }
                    j11 = j12;
                }
                this.f12223B = j11;
                return j;
            }
        }
        return L();
    }

    public final long L() throws M {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte bF = F();
            j |= ((long) (bF & 127)) << i7;
            if ((bF & 128) == 0) {
                return j;
            }
        }
        throw M.e();
    }

    public final int M() {
        return (int) ((((long) (this.f12228f - this.f12222A)) - this.f12223B) + this.f12224C);
    }

    public final void N(int i7) throws M {
        if (i7 < 0 || i7 > (((long) (this.f12228f - this.f12222A)) - this.f12223B) + this.f12224C) {
            if (i7 >= 0) {
                throw M.h();
            }
            throw M.f();
        }
        while (i7 > 0) {
            if (E() == 0) {
                if (!this.f12226d.hasNext()) {
                    throw M.h();
                }
                O();
            }
            int iMin = Math.min(i7, (int) E());
            i7 -= iMin;
            this.f12223B += (long) iMin;
        }
    }

    public final void O() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f12226d.next();
        this.f12227e = byteBuffer;
        this.f12222A += (int) (this.f12223B - this.f12224C);
        long jPosition = byteBuffer.position();
        this.f12223B = jPosition;
        this.f12224C = jPosition;
        this.f12225D = this.f12227e.limit();
        long j = K0.f12117c.j(K0.f12121g, this.f12227e);
        this.f12223B += j;
        this.f12224C += j;
        this.f12225D += j;
    }

    @Override // H6.b
    public final void a(int i7) throws M {
        if (this.f12231z != i7) {
            throw M.a();
        }
    }

    @Override // H6.b
    public final int e() {
        return (int) ((((long) this.f12222A) + this.f12223B) - this.f12224C);
    }

    @Override // H6.b
    public final boolean f() {
        return (((long) this.f12222A) + this.f12223B) - this.f12224C == ((long) this.f12228f);
    }

    @Override // H6.b
    public final void h(int i7) {
        this.f12230y = i7;
        int i8 = this.f12228f + this.f12229x;
        this.f12228f = i8;
        if (i8 <= i7) {
            this.f12229x = 0;
            return;
        }
        int i9 = i8 - i7;
        this.f12229x = i9;
        this.f12228f = i8 - i9;
    }

    @Override // H6.b
    public final int i(int i7) throws M {
        if (i7 < 0) {
            throw M.f();
        }
        int iE = e() + i7;
        int i8 = this.f12230y;
        if (iE > i8) {
            throw M.h();
        }
        this.f12230y = iE;
        int i9 = this.f12228f + this.f12229x;
        this.f12228f = i9;
        if (i9 > iE) {
            int i10 = i9 - iE;
            this.f12229x = i10;
            this.f12228f = i9 - i10;
        } else {
            this.f12229x = 0;
        }
        return i8;
    }

    @Override // H6.b
    public final boolean j() {
        return K() != 0;
    }

    @Override // H6.b
    public final C0865j k() throws M {
        int iJ = J();
        if (iJ > 0) {
            long j = iJ;
            long j3 = this.f12225D;
            long j7 = this.f12223B;
            if (j <= j3 - j7) {
                byte[] bArr = new byte[iJ];
                K0.f12117c.c(j7, bArr, 0L, j);
                this.f12223B += j;
                C0865j c0865j = AbstractC0867k.f12212b;
                return new C0865j(bArr);
            }
        }
        if (iJ > 0 && iJ <= M()) {
            byte[] bArr2 = new byte[iJ];
            G(iJ, bArr2);
            C0865j c0865j2 = AbstractC0867k.f12212b;
            return new C0865j(bArr2);
        }
        if (iJ == 0) {
            return AbstractC0867k.f12212b;
        }
        if (iJ < 0) {
            throw M.f();
        }
        throw M.h();
    }

    @Override // H6.b
    public final double l() {
        return Double.longBitsToDouble(I());
    }

    @Override // H6.b
    public final int m() {
        return J();
    }

    @Override // H6.b
    public final int n() {
        return H();
    }

    @Override // H6.b
    public final long o() {
        return I();
    }

    @Override // H6.b
    public final float p() {
        return Float.intBitsToFloat(H());
    }

    @Override // H6.b
    public final int q() {
        return J();
    }

    @Override // H6.b
    public final long s() {
        return K();
    }

    @Override // H6.b
    public final int u() {
        return H();
    }

    @Override // H6.b
    public final long v() {
        return I();
    }

    @Override // H6.b
    public final int w() {
        return H6.b.b(J());
    }

    @Override // H6.b
    public final long x() {
        return H6.b.d(K());
    }

    @Override // H6.b
    public final String y() throws M {
        int iJ = J();
        if (iJ > 0) {
            long j = iJ;
            long j3 = this.f12225D;
            long j7 = this.f12223B;
            if (j <= j3 - j7) {
                byte[] bArr = new byte[iJ];
                K0.f12117c.c(j7, bArr, 0L, j);
                String str = new String(bArr, K.f12112a);
                this.f12223B += j;
                return str;
            }
        }
        if (iJ > 0 && iJ <= M()) {
            byte[] bArr2 = new byte[iJ];
            G(iJ, bArr2);
            return new String(bArr2, K.f12112a);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw M.f();
        }
        throw M.h();
    }

    @Override // H6.b
    public final String z() throws M {
        int iJ = J();
        if (iJ > 0) {
            long j = iJ;
            long j3 = this.f12225D;
            long j7 = this.f12223B;
            if (j <= j3 - j7) {
                String strB = N0.b(this.f12227e, (int) (j7 - this.f12224C), iJ);
                this.f12223B += j;
                return strB;
            }
        }
        if (iJ >= 0 && iJ <= M()) {
            byte[] bArr = new byte[iJ];
            G(iJ, bArr);
            return N0.f12134a.H(bArr, 0, iJ);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw M.f();
        }
        throw M.h();
    }
}
