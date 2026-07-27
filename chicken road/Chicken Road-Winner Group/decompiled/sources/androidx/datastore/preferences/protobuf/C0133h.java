package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133h extends AbstractC0135j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2235c;

    /* renamed from: d, reason: collision with root package name */
    public int f2236d;

    /* renamed from: e, reason: collision with root package name */
    public int f2237e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2238g;

    /* renamed from: h, reason: collision with root package name */
    public int f2239h;

    /* renamed from: i, reason: collision with root package name */
    public int f2240i = Integer.MAX_VALUE;

    public C0133h(byte[] bArr, int i3, int i4, boolean z3) {
        this.f2235c = bArr;
        this.f2236d = i4 + i3;
        this.f = i3;
        this.f2238g = i3;
    }

    public final long A() {
        int i3 = this.f;
        if (this.f2236d - i3 < 8) {
            throw A.e();
        }
        this.f = i3 + 8;
        byte[] bArr = this.f2235c;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int B() {
        int i3;
        int i4 = this.f;
        int i5 = this.f2236d;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f2235c;
            byte b3 = bArr[i4];
            if (b3 >= 0) {
                this.f = i6;
                return b3;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b3;
                if (i8 < 0) {
                    i3 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        i3 = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            i3 = (-2080896) ^ i12;
                        } else {
                            i9 = i4 + 5;
                            byte b4 = bArr[i11];
                            int i13 = (i12 ^ (b4 << 28)) ^ 266354560;
                            if (b4 < 0) {
                                i11 = i4 + 6;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                int i14 = i4 + 10;
                                                if (bArr[i9] >= 0) {
                                                    i7 = i14;
                                                    i3 = i13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i13;
                            }
                            i3 = i13;
                        }
                        i7 = i11;
                    }
                    i7 = i9;
                }
                this.f = i7;
                return i3;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j3;
        long j4;
        long j5;
        long j6;
        int i3 = this.f;
        int i4 = this.f2236d;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f2235c;
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                this.f = i5;
                return b3;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b3;
                if (i7 < 0) {
                    j3 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        j3 = i9 ^ 16256;
                        i6 = i8;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            j6 = (-2080896) ^ i11;
                        } else {
                            long j7 = i11;
                            i6 = i3 + 5;
                            long j8 = j7 ^ (bArr[i10] << 28);
                            if (j8 >= 0) {
                                j5 = 266354560;
                            } else {
                                i10 = i3 + 6;
                                long j9 = j8 ^ (bArr[i6] << 35);
                                if (j9 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i6 = i3 + 7;
                                    j8 = j9 ^ (bArr[i10] << 42);
                                    if (j8 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j9 = j8 ^ (bArr[i6] << 49);
                                        if (j9 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i3 + 9;
                                            long j10 = (j9 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int i12 = i3 + 10;
                                                if (bArr[i6] >= 0) {
                                                    i6 = i12;
                                                }
                                            }
                                            j3 = j10;
                                        }
                                    }
                                }
                                j6 = j4 ^ j9;
                            }
                            j3 = j5 ^ j8;
                        }
                        i6 = i10;
                        j3 = j6;
                    }
                }
                this.f = i6;
                return j3;
            }
        }
        return D();
    }

    public final long D() {
        long j3 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            int i4 = this.f;
            if (i4 == this.f2236d) {
                throw A.e();
            }
            this.f = i4 + 1;
            j3 |= (r3 & Byte.MAX_VALUE) << i3;
            if ((this.f2235c[i4] & 128) == 0) {
                return j3;
            }
        }
        throw A.c();
    }

    public final void E() {
        int i3 = this.f2236d + this.f2237e;
        this.f2236d = i3;
        int i4 = i3 - this.f2238g;
        int i5 = this.f2240i;
        if (i4 <= i5) {
            this.f2237e = 0;
            return;
        }
        int i6 = i4 - i5;
        this.f2237e = i6;
        this.f2236d = i3 - i6;
    }

    public final void F(int i3) {
        if (i3 >= 0) {
            int i4 = this.f2236d;
            int i5 = this.f;
            if (i3 <= i4 - i5) {
                this.f = i5 + i3;
                return;
            }
        }
        if (i3 >= 0) {
            throw A.e();
        }
        throw A.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final void a(int i3) {
        if (this.f2239h != i3) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final int b() {
        return this.f - this.f2238g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final boolean c() {
        return this.f == this.f2236d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final void d(int i3) {
        this.f2240i = i3;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final int e(int i3) {
        if (i3 < 0) {
            throw A.d();
        }
        int b3 = b() + i3;
        if (b3 < 0) {
            throw new A("Failed to parse the message.");
        }
        int i4 = this.f2240i;
        if (b3 > i4) {
            throw A.e();
        }
        this.f2240i = b3;
        E();
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final boolean f() {
        return C() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final C0132g g() {
        byte[] bArr;
        int B3 = B();
        byte[] bArr2 = this.f2235c;
        if (B3 > 0) {
            int i3 = this.f2236d;
            int i4 = this.f;
            if (B3 <= i3 - i4) {
                C0132g d3 = C0132g.d(bArr2, i4, B3);
                this.f += B3;
                return d3;
            }
        }
        if (B3 == 0) {
            return C0132g.f2230c;
        }
        if (B3 > 0) {
            int i5 = this.f2236d;
            int i6 = this.f;
            if (B3 <= i5 - i6) {
                int i7 = B3 + i6;
                this.f = i7;
                bArr = Arrays.copyOfRange(bArr2, i6, i7);
                C0132g c0132g = C0132g.f2230c;
                return new C0132g(bArr);
            }
        }
        if (B3 > 0) {
            throw A.e();
        }
        if (B3 != 0) {
            throw A.d();
        }
        bArr = AbstractC0149y.f2301b;
        C0132g c0132g2 = C0132g.f2230c;
        return new C0132g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final int i() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final int j() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final long k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final int m() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final long n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final int o() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final long p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final int q() {
        int B3 = B();
        return (-(B3 & 1)) ^ (B3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final long r() {
        long C2 = C();
        return (-(C2 & 1)) ^ (C2 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final String s() {
        int B3 = B();
        if (B3 > 0) {
            int i3 = this.f2236d;
            int i4 = this.f;
            if (B3 <= i3 - i4) {
                String str = new String(this.f2235c, i4, B3, AbstractC0149y.f2300a);
                this.f += B3;
                return str;
            }
        }
        if (B3 == 0) {
            return "";
        }
        if (B3 < 0) {
            throw A.d();
        }
        throw A.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final String t() {
        int B3 = B();
        if (B3 > 0) {
            int i3 = this.f2236d;
            int i4 = this.f;
            if (B3 <= i3 - i4) {
                String r3 = m0.f2268a.r(this.f2235c, i4, B3);
                this.f += B3;
                return r3;
            }
        }
        if (B3 == 0) {
            return "";
        }
        if (B3 <= 0) {
            throw A.d();
        }
        throw A.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final int u() {
        if (c()) {
            this.f2239h = 0;
            return 0;
        }
        int B3 = B();
        this.f2239h = B3;
        if ((B3 >>> 3) != 0) {
            return B3;
        }
        throw new A("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final int v() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final long w() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0135j
    public final boolean x(int i3) {
        int i4 = i3 & 7;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 == 1) {
                F(8);
                return true;
            }
            if (i4 == 2) {
                F(B());
                return true;
            }
            if (i4 == 3) {
                y();
                a(((i3 >>> 3) << 3) | 4);
                return true;
            }
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw A.b();
            }
            F(4);
            return true;
        }
        int i6 = this.f2236d - this.f;
        byte[] bArr = this.f2235c;
        if (i6 >= 10) {
            while (i5 < 10) {
                int i7 = this.f;
                this.f = i7 + 1;
                if (bArr[i7] < 0) {
                    i5++;
                }
            }
            throw A.c();
        }
        while (i5 < 10) {
            int i8 = this.f;
            if (i8 == this.f2236d) {
                throw A.e();
            }
            this.f = i8 + 1;
            if (bArr[i8] < 0) {
                i5++;
            }
        }
        throw A.c();
        return true;
    }

    public final int z() {
        int i3 = this.f;
        if (this.f2236d - i3 < 4) {
            throw A.e();
        }
        this.f = i3 + 4;
        byte[] bArr = this.f2235c;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }
}
