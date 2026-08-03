package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072h extends androidx.datastore.preferences.protobuf.AbstractC0074j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2306c;

    /* renamed from: d, reason: collision with root package name */
    public int f2307d;

    /* renamed from: e, reason: collision with root package name */
    public int f2308e;

    /* renamed from: f, reason: collision with root package name */
    public int f2309f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2310g;

    /* renamed from: h, reason: collision with root package name */
    public int f2311h;

    /* renamed from: i, reason: collision with root package name */
    public int f2312i = Integer.MAX_VALUE;

    public C0072h(byte[] bArr, int i2, int i3, boolean z2) {
        this.f2306c = bArr;
        this.f2307d = i3 + i2;
        this.f2309f = i2;
        this.f2310g = i2;
    }

    public final long A() {
        int i2 = this.f2309f;
        if (this.f2307d - i2 < 8) {
            throw androidx.datastore.preferences.protobuf.A.e();
        }
        this.f2309f = i2 + 8;
        byte[] bArr = this.f2306c;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public final int B() {
        int i2;
        int i3 = this.f2309f;
        int i4 = this.f2307d;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f2306c;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f2309f = i5;
                return b2;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b2;
                if (i7 < 0) {
                    i2 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        i2 = i9 ^ 16256;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            i2 = (-2080896) ^ i11;
                        } else {
                            i8 = i3 + 5;
                            byte b3 = bArr[i10];
                            int i12 = (i11 ^ (b3 << 28)) ^ 266354560;
                            if (b3 < 0) {
                                i10 = i3 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i3 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i3 + 9;
                                            if (bArr[i10] < 0) {
                                                int i13 = i3 + 10;
                                                if (bArr[i8] >= 0) {
                                                    i6 = i13;
                                                    i2 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i12;
                            }
                            i2 = i12;
                        }
                        i6 = i10;
                    }
                    i6 = i8;
                }
                this.f2309f = i6;
                return i2;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2 = this.f2309f;
        int i3 = this.f2307d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f2306c;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f2309f = i4;
                return b2;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b2;
                if (i6 < 0) {
                    j2 = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        j2 = i8 ^ 16256;
                        i5 = i7;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            j5 = (-2080896) ^ i10;
                        } else {
                            long j6 = i10;
                            i5 = i2 + 5;
                            long j7 = j6 ^ (bArr[i9] << 28);
                            if (j7 >= 0) {
                                j4 = 266354560;
                            } else {
                                i9 = i2 + 6;
                                long j8 = j7 ^ (bArr[i5] << 35);
                                if (j8 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i2 + 7;
                                    j7 = j8 ^ (bArr[i9] << 42);
                                    if (j7 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i9 = i2 + 8;
                                        j8 = j7 ^ (bArr[i5] << 49);
                                        if (j8 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i2 + 9;
                                            long j9 = (j8 ^ (bArr[i9] << 56)) ^ 71499008037633920L;
                                            if (j9 < 0) {
                                                int i11 = i2 + 10;
                                                if (bArr[i5] >= 0) {
                                                    i5 = i11;
                                                }
                                            }
                                            j2 = j9;
                                        }
                                    }
                                }
                                j5 = j3 ^ j8;
                            }
                            j2 = j4 ^ j7;
                        }
                        i5 = i9;
                        j2 = j5;
                    }
                }
                this.f2309f = i5;
                return j2;
            }
        }
        return D();
    }

    public final long D() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            int i3 = this.f2309f;
            if (i3 == this.f2307d) {
                throw androidx.datastore.preferences.protobuf.A.e();
            }
            this.f2309f = i3 + 1;
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((this.f2306c[i3] & 128) == 0) {
                return j2;
            }
        }
        throw androidx.datastore.preferences.protobuf.A.c();
    }

    public final void E() {
        int i2 = this.f2307d + this.f2308e;
        this.f2307d = i2;
        int i3 = i2 - this.f2310g;
        int i4 = this.f2312i;
        if (i3 <= i4) {
            this.f2308e = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f2308e = i5;
        this.f2307d = i2 - i5;
    }

    public final void F(int i2) {
        if (i2 >= 0) {
            int i3 = this.f2307d;
            int i4 = this.f2309f;
            if (i2 <= i3 - i4) {
                this.f2309f = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw androidx.datastore.preferences.protobuf.A.e();
        }
        throw androidx.datastore.preferences.protobuf.A.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final void a(int i2) {
        if (this.f2311h != i2) {
            throw new androidx.datastore.preferences.protobuf.A("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final int b() {
        return this.f2309f - this.f2310g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final boolean c() {
        return this.f2309f == this.f2307d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final void d(int i2) {
        this.f2312i = i2;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final int e(int i2) {
        if (i2 < 0) {
            throw androidx.datastore.preferences.protobuf.A.d();
        }
        int b2 = b() + i2;
        if (b2 < 0) {
            throw new androidx.datastore.preferences.protobuf.A("Failed to parse the message.");
        }
        int i3 = this.f2312i;
        if (b2 > i3) {
            throw androidx.datastore.preferences.protobuf.A.e();
        }
        this.f2312i = b2;
        E();
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final boolean f() {
        return C() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final androidx.datastore.preferences.protobuf.C0071g g() {
        byte[] bArr;
        int B2 = B();
        byte[] bArr2 = this.f2306c;
        if (B2 > 0) {
            int i2 = this.f2307d;
            int i3 = this.f2309f;
            if (B2 <= i2 - i3) {
                androidx.datastore.preferences.protobuf.C0071g c2 = androidx.datastore.preferences.protobuf.C0071g.c(bArr2, i3, B2);
                this.f2309f += B2;
                return c2;
            }
        }
        if (B2 == 0) {
            return androidx.datastore.preferences.protobuf.C0071g.f2301c;
        }
        if (B2 > 0) {
            int i4 = this.f2307d;
            int i5 = this.f2309f;
            if (B2 <= i4 - i5) {
                int i6 = B2 + i5;
                this.f2309f = i6;
                bArr = java.util.Arrays.copyOfRange(bArr2, i5, i6);
                androidx.datastore.preferences.protobuf.C0071g c0071g = androidx.datastore.preferences.protobuf.C0071g.f2301c;
                return new androidx.datastore.preferences.protobuf.C0071g(bArr);
            }
        }
        if (B2 > 0) {
            throw androidx.datastore.preferences.protobuf.A.e();
        }
        if (B2 != 0) {
            throw androidx.datastore.preferences.protobuf.A.d();
        }
        bArr = androidx.datastore.preferences.protobuf.AbstractC0088y.f2377b;
        androidx.datastore.preferences.protobuf.C0071g c0071g2 = androidx.datastore.preferences.protobuf.C0071g.f2301c;
        return new androidx.datastore.preferences.protobuf.C0071g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final double h() {
        return java.lang.Double.longBitsToDouble(A());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final int i() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final int j() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final long k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final float l() {
        return java.lang.Float.intBitsToFloat(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final int m() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final long n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final int o() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final long p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final int q() {
        int B2 = B();
        return (-(B2 & 1)) ^ (B2 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final long r() {
        long C2 = C();
        return (-(C2 & 1)) ^ (C2 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final java.lang.String s() {
        int B2 = B();
        if (B2 > 0) {
            int i2 = this.f2307d;
            int i3 = this.f2309f;
            if (B2 <= i2 - i3) {
                java.lang.String str = new java.lang.String(this.f2306c, i3, B2, androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a);
                this.f2309f += B2;
                return str;
            }
        }
        if (B2 == 0) {
            return "";
        }
        if (B2 < 0) {
            throw androidx.datastore.preferences.protobuf.A.d();
        }
        throw androidx.datastore.preferences.protobuf.A.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final java.lang.String t() {
        int B2 = B();
        if (B2 > 0) {
            int i2 = this.f2307d;
            int i3 = this.f2309f;
            if (B2 <= i2 - i3) {
                java.lang.String j2 = androidx.datastore.preferences.protobuf.m0.f2342a.j(this.f2306c, i3, B2);
                this.f2309f += B2;
                return j2;
            }
        }
        if (B2 == 0) {
            return "";
        }
        if (B2 <= 0) {
            throw androidx.datastore.preferences.protobuf.A.d();
        }
        throw androidx.datastore.preferences.protobuf.A.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final int u() {
        if (c()) {
            this.f2311h = 0;
            return 0;
        }
        int B2 = B();
        this.f2311h = B2;
        if ((B2 >>> 3) != 0) {
            return B2;
        }
        throw new androidx.datastore.preferences.protobuf.A("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final int v() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final long w() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0074j
    public final boolean x(int i2) {
        int i3 = i2 & 7;
        int i4 = 0;
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
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            F(4);
            return true;
        }
        int i5 = this.f2307d - this.f2309f;
        byte[] bArr = this.f2306c;
        if (i5 >= 10) {
            while (i4 < 10) {
                int i6 = this.f2309f;
                this.f2309f = i6 + 1;
                if (bArr[i6] < 0) {
                    i4++;
                }
            }
            throw androidx.datastore.preferences.protobuf.A.c();
        }
        while (i4 < 10) {
            int i7 = this.f2309f;
            if (i7 == this.f2307d) {
                throw androidx.datastore.preferences.protobuf.A.e();
            }
            this.f2309f = i7 + 1;
            if (bArr[i7] < 0) {
                i4++;
            }
        }
        throw androidx.datastore.preferences.protobuf.A.c();
        return true;
    }

    public final int z() {
        int i2 = this.f2309f;
        if (this.f2307d - i2 < 4) {
            throw androidx.datastore.preferences.protobuf.A.e();
        }
        this.f2309f = i2 + 4;
        byte[] bArr = this.f2306c;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }
}
