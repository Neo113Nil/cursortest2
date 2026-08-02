package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0915m extends H6.b {

    /* renamed from: B, reason: collision with root package name */
    public long f12223B;

    /* renamed from: C, reason: collision with root package name */
    public long f12224C;

    /* renamed from: D, reason: collision with root package name */
    public long f12225D;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f12226d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f12227e;

    /* renamed from: f, reason: collision with root package name */
    public int f12228f;

    /* renamed from: x, reason: collision with root package name */
    public int f12229x;

    /* renamed from: z, reason: collision with root package name */
    public int f12231z;

    /* renamed from: y, reason: collision with root package name */
    public int f12230y = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: A, reason: collision with root package name */
    public int f12222A = 0;

    public C0915m(ArrayList arrayList, int i7) {
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
    public final int A() {
        if (f()) {
            this.f12231z = 0;
            return 0;
        }
        int J5 = J();
        this.f12231z = J5;
        if ((J5 >>> 3) != 0) {
            return J5;
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
    public final boolean D(int i7) {
        int A7;
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
            A7 = A();
            if (A7 == 0) {
                break;
            }
        } while (D(A7));
        a(((i7 >>> 3) << 3) | 4);
        return true;
    }

    public final long E() {
        return this.f12225D - this.f12223B;
    }

    public final byte F() {
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

    public final void G(int i7, byte[] bArr) {
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
            int min = Math.min(i8, (int) E());
            long j = min;
            K0.f12117c.c(this.f12223B, bArr, i7 - i8, j);
            i8 -= min;
            this.f12223B += j;
        }
    }

    public final int H() {
        if (E() < 4) {
            return (F() & 255) | ((F() & 255) << 8) | ((F() & 255) << 16) | ((F() & 255) << 24);
        }
        long j = this.f12223B;
        this.f12223B = 4 + j;
        J0 j02 = K0.f12117c;
        return ((j02.e(j + 3) & 255) << 24) | (j02.e(j) & 255) | ((j02.e(1 + j) & 255) << 8) | ((j02.e(2 + j) & 255) << 16);
    }

    public final long I() {
        long F7;
        byte F8;
        if (E() >= 8) {
            long j = this.f12223B;
            this.f12223B = 8 + j;
            F7 = (r1.e(j) & 255) | ((r1.e(j + 1) & 255) << 8) | ((r1.e(2 + j) & 255) << 16) | ((r1.e(3 + j) & 255) << 24) | ((r1.e(4 + j) & 255) << 32) | ((r1.e(5 + j) & 255) << 40) | ((r1.e(6 + j) & 255) << 48);
            F8 = K0.f12117c.e(j + 7);
        } else {
            F7 = (F() & 255) | ((F() & 255) << 8) | ((F() & 255) << 16) | ((F() & 255) << 24) | ((F() & 255) << 32) | ((F() & 255) << 40) | ((F() & 255) << 48);
            F8 = F();
        }
        return ((F8 & 255) << 56) | F7;
    }

    public final int J() {
        int i7;
        long j = this.f12223B;
        if (this.f12225D != j) {
            long j3 = j + 1;
            J0 j02 = K0.f12117c;
            byte e7 = j02.e(j);
            if (e7 >= 0) {
                this.f12223B++;
                return e7;
            }
            if (this.f12225D - this.f12223B >= 10) {
                long j7 = 2 + j;
                int e8 = (j02.e(j3) << 7) ^ e7;
                if (e8 < 0) {
                    i7 = e8 ^ (-128);
                } else {
                    long j8 = 3 + j;
                    int e9 = (j02.e(j7) << 14) ^ e8;
                    if (e9 >= 0) {
                        i7 = e9 ^ 16256;
                    } else {
                        long j9 = 4 + j;
                        int e10 = e9 ^ (j02.e(j8) << 21);
                        if (e10 < 0) {
                            i7 = (-2080896) ^ e10;
                        } else {
                            j8 = 5 + j;
                            byte e11 = j02.e(j9);
                            int i8 = (e10 ^ (e11 << 28)) ^ 266354560;
                            if (e11 < 0) {
                                j9 = 6 + j;
                                if (j02.e(j8) < 0) {
                                    j8 = 7 + j;
                                    if (j02.e(j9) < 0) {
                                        j9 = 8 + j;
                                        if (j02.e(j8) < 0) {
                                            j8 = 9 + j;
                                            if (j02.e(j9) < 0) {
                                                long j10 = j + 10;
                                                if (j02.e(j8) >= 0) {
                                                    i7 = i8;
                                                    j7 = j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i8;
                            }
                            i7 = i8;
                        }
                        j7 = j9;
                    }
                    j7 = j8;
                }
                this.f12223B = j7;
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
            J0 j02 = K0.f12117c;
            byte e7 = j02.e(j8);
            if (e7 >= 0) {
                this.f12223B++;
                return e7;
            }
            if (this.f12225D - this.f12223B >= 10) {
                long j10 = 2 + j8;
                int e8 = (j02.e(j9) << 7) ^ e7;
                if (e8 < 0) {
                    j = e8 ^ (-128);
                } else {
                    long j11 = 3 + j8;
                    int e9 = (j02.e(j10) << 14) ^ e8;
                    if (e9 >= 0) {
                        j = e9 ^ 16256;
                    } else {
                        long j12 = 4 + j8;
                        int e10 = e9 ^ (j02.e(j11) << 21);
                        if (e10 < 0) {
                            j = (-2080896) ^ e10;
                            j10 = j12;
                        } else {
                            long j13 = 5 + j8;
                            long e11 = (j02.e(j12) << 28) ^ e10;
                            if (e11 >= 0) {
                                j7 = 266354560;
                            } else {
                                j11 = 6 + j8;
                                long e12 = e11 ^ (j02.e(j13) << 35);
                                if (e12 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j13 = 7 + j8;
                                    e11 = e12 ^ (j02.e(j11) << 42);
                                    if (e11 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        j11 = 8 + j8;
                                        e12 = e11 ^ (j02.e(j13) << 49);
                                        if (e12 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j13 = 9 + j8;
                                            long e13 = (e12 ^ (j02.e(j11) << 56)) ^ 71499008037633920L;
                                            if (e13 < 0) {
                                                long j14 = j8 + 10;
                                                if (j02.e(j13) >= 0) {
                                                    j = e13;
                                                    j10 = j14;
                                                }
                                            } else {
                                                j = e13;
                                                j10 = j13;
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ e12;
                            }
                            j = j7 ^ e11;
                            j10 = j13;
                        }
                    }
                    j10 = j11;
                }
                this.f12223B = j10;
                return j;
            }
        }
        return L();
    }

    public final long L() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((F() & 128) == 0) {
                return j;
            }
        }
        throw M.e();
    }

    public final int M() {
        return (int) (((this.f12228f - this.f12222A) - this.f12223B) + this.f12224C);
    }

    public final void N(int i7) {
        if (i7 < 0 || i7 > ((this.f12228f - this.f12222A) - this.f12223B) + this.f12224C) {
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
            int min = Math.min(i7, (int) E());
            i7 -= min;
            this.f12223B += min;
        }
    }

    public final void O() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f12226d.next();
        this.f12227e = byteBuffer;
        this.f12222A += (int) (this.f12223B - this.f12224C);
        long position = byteBuffer.position();
        this.f12223B = position;
        this.f12224C = position;
        this.f12225D = this.f12227e.limit();
        long j = K0.f12117c.j(K0.f12121g, this.f12227e);
        this.f12223B += j;
        this.f12224C += j;
        this.f12225D += j;
    }

    @Override // H6.b
    public final void a(int i7) {
        if (this.f12231z != i7) {
            throw M.a();
        }
    }

    @Override // H6.b
    public final int e() {
        return (int) ((this.f12222A + this.f12223B) - this.f12224C);
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
    public final int i(int i7) {
        if (i7 < 0) {
            throw M.f();
        }
        int e7 = e() + i7;
        int i8 = this.f12230y;
        if (e7 > i8) {
            throw M.h();
        }
        this.f12230y = e7;
        int i9 = this.f12228f + this.f12229x;
        this.f12228f = i9;
        if (i9 > e7) {
            int i10 = i9 - e7;
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
    public final C0909j k() {
        int J5 = J();
        if (J5 > 0) {
            long j = J5;
            long j3 = this.f12225D;
            long j7 = this.f12223B;
            if (j <= j3 - j7) {
                byte[] bArr = new byte[J5];
                K0.f12117c.c(j7, bArr, 0L, j);
                this.f12223B += j;
                C0909j c0909j = AbstractC0911k.f12212b;
                return new C0909j(bArr);
            }
        }
        if (J5 > 0 && J5 <= M()) {
            byte[] bArr2 = new byte[J5];
            G(J5, bArr2);
            C0909j c0909j2 = AbstractC0911k.f12212b;
            return new C0909j(bArr2);
        }
        if (J5 == 0) {
            return AbstractC0911k.f12212b;
        }
        if (J5 < 0) {
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
    public final String y() {
        int J5 = J();
        if (J5 > 0) {
            long j = J5;
            long j3 = this.f12225D;
            long j7 = this.f12223B;
            if (j <= j3 - j7) {
                byte[] bArr = new byte[J5];
                K0.f12117c.c(j7, bArr, 0L, j);
                String str = new String(bArr, K.f12112a);
                this.f12223B += j;
                return str;
            }
        }
        if (J5 > 0 && J5 <= M()) {
            byte[] bArr2 = new byte[J5];
            G(J5, bArr2);
            return new String(bArr2, K.f12112a);
        }
        if (J5 == 0) {
            return "";
        }
        if (J5 < 0) {
            throw M.f();
        }
        throw M.h();
    }

    @Override // H6.b
    public final String z() {
        int J5 = J();
        if (J5 > 0) {
            long j = J5;
            long j3 = this.f12225D;
            long j7 = this.f12223B;
            if (j <= j3 - j7) {
                String b7 = N0.b(this.f12227e, (int) (j7 - this.f12224C), J5);
                this.f12223B += j;
                return b7;
            }
        }
        if (J5 >= 0 && J5 <= M()) {
            byte[] bArr = new byte[J5];
            G(J5, bArr);
            return N0.f12134a.H(bArr, 0, J5);
        }
        if (J5 == 0) {
            return "";
        }
        if (J5 <= 0) {
            throw M.f();
        }
        throw M.h();
    }
}
