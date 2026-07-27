package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213h extends R4.c {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4440c;

    /* renamed from: d, reason: collision with root package name */
    public int f4441d;

    /* renamed from: e, reason: collision with root package name */
    public int f4442e;

    /* renamed from: f, reason: collision with root package name */
    public int f4443f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4444g;

    /* renamed from: h, reason: collision with root package name */
    public int f4445h;

    /* renamed from: i, reason: collision with root package name */
    public int f4446i = Integer.MAX_VALUE;

    public C0213h(byte[] bArr, int i2, int i3, boolean z) {
        this.f4440c = bArr;
        this.f4441d = i3 + i2;
        this.f4443f = i2;
        this.f4444g = i2;
    }

    public final long A() {
        int i2 = this.f4443f;
        if (this.f4441d - i2 < 8) {
            throw C0230z.e();
        }
        this.f4443f = i2 + 8;
        byte[] bArr = this.f4440c;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public final int B() {
        int i2;
        int i3 = this.f4443f;
        int i6 = this.f4441d;
        if (i6 != i3) {
            int i7 = i3 + 1;
            byte[] bArr = this.f4440c;
            byte b6 = bArr[i3];
            if (b6 >= 0) {
                this.f4443f = i7;
                return b6;
            }
            if (i6 - i7 >= 9) {
                int i8 = i3 + 2;
                int i9 = (bArr[i7] << 7) ^ b6;
                if (i9 < 0) {
                    i2 = i9 ^ (-128);
                } else {
                    int i10 = i3 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i2 = i11 ^ 16256;
                    } else {
                        int i12 = i3 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i2 = (-2080896) ^ i13;
                        } else {
                            i10 = i3 + 5;
                            byte b7 = bArr[i12];
                            int i14 = (i13 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i12 = i3 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i3 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i3 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i3 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i3 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i2 = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i14;
                            }
                            i2 = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.f4443f = i8;
                return i2;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j2;
        long j6;
        long j7;
        long j8;
        int i2 = this.f4443f;
        int i3 = this.f4441d;
        if (i3 != i2) {
            int i6 = i2 + 1;
            byte[] bArr = this.f4440c;
            byte b6 = bArr[i2];
            if (b6 >= 0) {
                this.f4443f = i6;
                return b6;
            }
            if (i3 - i6 >= 9) {
                int i7 = i2 + 2;
                int i8 = (bArr[i6] << 7) ^ b6;
                if (i8 < 0) {
                    j2 = i8 ^ (-128);
                } else {
                    int i9 = i2 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j2 = i10 ^ 16256;
                        i7 = i9;
                    } else {
                        int i11 = i2 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            j8 = (-2080896) ^ i12;
                        } else {
                            long j9 = i12;
                            i7 = i2 + 5;
                            long j10 = j9 ^ (bArr[i11] << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                i11 = i2 + 6;
                                long j11 = j10 ^ (bArr[i7] << 35);
                                if (j11 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i7 = i2 + 7;
                                    j10 = j11 ^ (bArr[i11] << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i11 = i2 + 8;
                                        j11 = j10 ^ (bArr[i7] << 49);
                                        if (j11 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i7 = i2 + 9;
                                            long j12 = (j11 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i13 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i13;
                                                }
                                            }
                                            j2 = j12;
                                        }
                                    }
                                }
                                j8 = j6 ^ j11;
                            }
                            j2 = j7 ^ j10;
                        }
                        i7 = i11;
                        j2 = j8;
                    }
                }
                this.f4443f = i7;
                return j2;
            }
        }
        return D();
    }

    public final long D() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            int i3 = this.f4443f;
            if (i3 == this.f4441d) {
                throw C0230z.e();
            }
            this.f4443f = i3 + 1;
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((this.f4440c[i3] & 128) == 0) {
                return j2;
            }
        }
        throw C0230z.c();
    }

    public final void E() {
        int i2 = this.f4441d + this.f4442e;
        this.f4441d = i2;
        int i3 = i2 - this.f4444g;
        int i6 = this.f4446i;
        if (i3 <= i6) {
            this.f4442e = 0;
            return;
        }
        int i7 = i3 - i6;
        this.f4442e = i7;
        this.f4441d = i2 - i7;
    }

    public final void F(int i2) {
        if (i2 >= 0) {
            int i3 = this.f4441d;
            int i6 = this.f4443f;
            if (i2 <= i3 - i6) {
                this.f4443f = i6 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw C0230z.e();
        }
        throw C0230z.d();
    }

    @Override // R4.c
    public final void a(int i2) {
        if (this.f4445h != i2) {
            throw new C0230z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // R4.c
    public final int b() {
        return this.f4443f - this.f4444g;
    }

    @Override // R4.c
    public final boolean c() {
        return this.f4443f == this.f4441d;
    }

    @Override // R4.c
    public final void d(int i2) {
        this.f4446i = i2;
        E();
    }

    @Override // R4.c
    public final int e(int i2) {
        if (i2 < 0) {
            throw C0230z.d();
        }
        int b6 = b() + i2;
        if (b6 < 0) {
            throw new C0230z("Failed to parse the message.");
        }
        int i3 = this.f4446i;
        if (b6 > i3) {
            throw C0230z.e();
        }
        this.f4446i = b6;
        E();
        return i3;
    }

    @Override // R4.c
    public final boolean f() {
        return C() != 0;
    }

    @Override // R4.c
    public final C0212g g() {
        byte[] bArr;
        int B5 = B();
        byte[] bArr2 = this.f4440c;
        if (B5 > 0) {
            int i2 = this.f4441d;
            int i3 = this.f4443f;
            if (B5 <= i2 - i3) {
                C0212g d6 = C0212g.d(bArr2, i3, B5);
                this.f4443f += B5;
                return d6;
            }
        }
        if (B5 == 0) {
            return C0212g.f4436c;
        }
        if (B5 > 0) {
            int i6 = this.f4441d;
            int i7 = this.f4443f;
            if (B5 <= i6 - i7) {
                int i8 = B5 + i7;
                this.f4443f = i8;
                bArr = Arrays.copyOfRange(bArr2, i7, i8);
                C0212g c0212g = C0212g.f4436c;
                return new C0212g(bArr);
            }
        }
        if (B5 > 0) {
            throw C0230z.e();
        }
        if (B5 != 0) {
            throw C0230z.d();
        }
        bArr = AbstractC0228x.f4509b;
        C0212g c0212g2 = C0212g.f4436c;
        return new C0212g(bArr);
    }

    @Override // R4.c
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // R4.c
    public final int i() {
        return B();
    }

    @Override // R4.c
    public final int j() {
        return z();
    }

    @Override // R4.c
    public final long k() {
        return A();
    }

    @Override // R4.c
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // R4.c
    public final int m() {
        return B();
    }

    @Override // R4.c
    public final long n() {
        return C();
    }

    @Override // R4.c
    public final int o() {
        return z();
    }

    @Override // R4.c
    public final long p() {
        return A();
    }

    @Override // R4.c
    public final int q() {
        int B5 = B();
        return (-(B5 & 1)) ^ (B5 >>> 1);
    }

    @Override // R4.c
    public final long r() {
        long C2 = C();
        return (-(C2 & 1)) ^ (C2 >>> 1);
    }

    @Override // R4.c
    public final String s() {
        int B5 = B();
        if (B5 > 0) {
            int i2 = this.f4441d;
            int i3 = this.f4443f;
            if (B5 <= i2 - i3) {
                String str = new String(this.f4440c, i3, B5, AbstractC0228x.f4508a);
                this.f4443f += B5;
                return str;
            }
        }
        if (B5 == 0) {
            return "";
        }
        if (B5 < 0) {
            throw C0230z.d();
        }
        throw C0230z.e();
    }

    @Override // R4.c
    public final String t() {
        int B5 = B();
        if (B5 > 0) {
            int i2 = this.f4441d;
            int i3 = this.f4443f;
            if (B5 <= i2 - i3) {
                String h3 = l0.f4474a.h(this.f4440c, i3, B5);
                this.f4443f += B5;
                return h3;
            }
        }
        if (B5 == 0) {
            return "";
        }
        if (B5 <= 0) {
            throw C0230z.d();
        }
        throw C0230z.e();
    }

    @Override // R4.c
    public final int u() {
        if (c()) {
            this.f4445h = 0;
            return 0;
        }
        int B5 = B();
        this.f4445h = B5;
        if ((B5 >>> 3) != 0) {
            return B5;
        }
        throw new C0230z("Protocol message contained an invalid tag (zero).");
    }

    @Override // R4.c
    public final int v() {
        return B();
    }

    @Override // R4.c
    public final long w() {
        return C();
    }

    @Override // R4.c
    public final boolean x(int i2) {
        int i3 = i2 & 7;
        int i6 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                F(8);
                return true;
            }
            if (i3 == 2) {
                F(B());
                return true;
            }
            if (i3 == 3) {
                y();
                a(((i2 >>> 3) << 3) | 4);
                return true;
            }
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw C0230z.b();
            }
            F(4);
            return true;
        }
        int i7 = this.f4441d - this.f4443f;
        byte[] bArr = this.f4440c;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f4443f;
                this.f4443f = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw C0230z.c();
        }
        while (i6 < 10) {
            int i9 = this.f4443f;
            if (i9 == this.f4441d) {
                throw C0230z.e();
            }
            this.f4443f = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw C0230z.c();
        return true;
    }

    public final int z() {
        int i2 = this.f4443f;
        if (this.f4441d - i2 < 4) {
            throw C0230z.e();
        }
        this.f4443f = i2 + 4;
        byte[] bArr = this.f4440c;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }
}
