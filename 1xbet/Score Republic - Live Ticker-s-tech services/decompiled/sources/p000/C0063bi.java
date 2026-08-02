package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: bi */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0063bi extends AbstractC0175ei {

    /* JADX INFO: renamed from: c */
    public final byte[] f877c;

    /* JADX INFO: renamed from: d */
    public int f878d;

    /* JADX INFO: renamed from: e */
    public int f879e;

    /* JADX INFO: renamed from: f */
    public int f880f;

    /* JADX INFO: renamed from: g */
    public final int f881g;

    /* JADX INFO: renamed from: h */
    public int f882h;

    /* JADX INFO: renamed from: i */
    public int f883i = Integer.MAX_VALUE;

    public C0063bi(byte[] bArr, int i, int i2, boolean z) {
        this.f877c = bArr;
        this.f878d = i2 + i;
        this.f880f = i;
        this.f881g = i;
    }

    /* JADX INFO: renamed from: A */
    public final int m669A() throws if0 {
        int i = this.f880f;
        if (this.f878d - i < 4) {
            throw if0.m2600e();
        }
        this.f880f = i + 4;
        byte[] bArr = this.f877c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: B */
    public final long m670B() throws if0 {
        int i = this.f880f;
        if (this.f878d - i < 8) {
            throw if0.m2600e();
        }
        this.f880f = i + 8;
        byte[] bArr = this.f877c;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: C */
    public final int m671C() {
        int i;
        int i2 = this.f880f;
        int i3 = this.f878d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f877c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f880f = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f880f = i5;
                return i;
            }
        }
        return (int) m673E();
    }

    /* JADX INFO: renamed from: D */
    public final long m672D() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f880f;
        int i2 = this.f878d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f877c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f880f = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f880f = i4;
                return j;
            }
        }
        return m673E();
    }

    /* JADX INFO: renamed from: E */
    public final long m673E() throws if0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f880f;
            if (i2 == this.f878d) {
                throw if0.m2600e();
            }
            this.f880f = i2 + 1;
            byte b = this.f877c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw if0.m2598c();
    }

    /* JADX INFO: renamed from: F */
    public final void m674F() {
        int i = this.f878d + this.f879e;
        this.f878d = i;
        int i2 = i - this.f881g;
        int i3 = this.f883i;
        if (i2 <= i3) {
            this.f879e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f879e = i4;
        this.f878d = i - i4;
    }

    /* JADX INFO: renamed from: G */
    public final void m675G(int i) throws if0 {
        if (i >= 0) {
            int i2 = this.f878d;
            int i3 = this.f880f;
            if (i <= i2 - i3) {
                this.f880f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw if0.m2600e();
        }
        throw if0.m2599d();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: a */
    public final void mo676a(int i) throws if0 {
        if (this.f882h != i) {
            throw new if0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: b */
    public final int mo677b() {
        return this.f880f - this.f881g;
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: c */
    public final boolean mo678c() {
        return this.f880f == this.f878d;
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: d */
    public final void mo679d(int i) {
        this.f883i = i;
        m674F();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: e */
    public final int mo680e(int i) {
        if (i < 0) {
            throw if0.m2599d();
        }
        int iMo677b = mo677b() + i;
        if (iMo677b < 0) {
            throw new if0("Failed to parse the message.");
        }
        int i2 = this.f883i;
        if (iMo677b > i2) {
            throw if0.m2600e();
        }
        this.f883i = iMo677b;
        m674F();
        return i2;
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: f */
    public final boolean mo681f() {
        return m672D() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: g */
    public final C0799vd mo682g() throws if0 {
        byte[] bArrCopyOfRange;
        int iM671C = m671C();
        byte[] bArr = this.f877c;
        if (iM671C > 0) {
            int i = this.f878d;
            int i2 = this.f880f;
            if (iM671C <= i - i2) {
                C0799vd c0799vdM5148d = C0799vd.m5148d(bArr, i2, iM671C);
                this.f880f += iM671C;
                return c0799vdM5148d;
            }
        }
        if (iM671C == 0) {
            return C0799vd.f8177l;
        }
        if (iM671C > 0) {
            int i3 = this.f878d;
            int i4 = this.f880f;
            if (iM671C <= i3 - i4) {
                int i5 = iM671C + i4;
                this.f880f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM671C <= 0) {
                    throw if0.m2600e();
                }
                if (iM671C == 0) {
                    throw if0.m2599d();
                }
                bArrCopyOfRange = ge0.f2711b;
            }
        } else {
            if (iM671C <= 0) {
                throw if0.m2600e();
            }
            if (iM671C == 0) {
                throw if0.m2599d();
            }
            bArrCopyOfRange = ge0.f2711b;
        }
        C0799vd c0799vd = C0799vd.f8177l;
        return new C0799vd(bArrCopyOfRange);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: h */
    public final double mo683h() {
        return Double.longBitsToDouble(m670B());
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: i */
    public final int mo684i() {
        return m671C();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: j */
    public final int mo685j() {
        return m669A();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: k */
    public final long mo686k() {
        return m670B();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: l */
    public final float mo687l() {
        return Float.intBitsToFloat(m669A());
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: m */
    public final int mo688m() {
        return m671C();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: n */
    public final long mo689n() {
        return m672D();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: o */
    public final int mo690o() {
        return m669A();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: p */
    public final long mo691p() {
        return m670B();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: q */
    public final int mo692q() {
        int iM671C = m671C();
        return (-(iM671C & 1)) ^ (iM671C >>> 1);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: r */
    public final long mo693r() {
        long jM672D = m672D();
        return (-(jM672D & 1)) ^ (jM672D >>> 1);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: s */
    public final String mo694s() throws if0 {
        int iM671C = m671C();
        if (iM671C > 0) {
            int i = this.f878d;
            int i2 = this.f880f;
            if (iM671C <= i - i2) {
                String str = new String(this.f877c, i2, iM671C, ge0.f2710a);
                this.f880f += iM671C;
                return str;
            }
        }
        if (iM671C == 0) {
            return "";
        }
        if (iM671C < 0) {
            throw if0.m2599d();
        }
        throw if0.m2600e();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: t */
    public final String mo695t() throws if0 {
        int iM671C = m671C();
        if (iM671C > 0) {
            int i = this.f878d;
            int i2 = this.f880f;
            if (iM671C <= i - i2) {
                String strMo3413b = xg1.f8962a.mo3413b(this.f877c, i2, iM671C);
                this.f880f += iM671C;
                return strMo3413b;
            }
        }
        if (iM671C == 0) {
            return "";
        }
        if (iM671C <= 0) {
            throw if0.m2599d();
        }
        throw if0.m2600e();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: u */
    public final int mo696u() throws if0 {
        if (mo678c()) {
            this.f882h = 0;
            return 0;
        }
        int iM671C = m671C();
        this.f882h = iM671C;
        if ((iM671C >>> 3) != 0) {
            return iM671C;
        }
        throw new if0("Protocol message contained an invalid tag (zero).");
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: v */
    public final int mo697v() {
        return m671C();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: w */
    public final long mo698w() {
        return m672D();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: x */
    public final boolean mo699x(int i) throws if0 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m675G(8);
                return true;
            }
            if (i2 == 2) {
                m675G(m671C());
                return true;
            }
            if (i2 == 3) {
                m1426y();
                mo676a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw if0.m2597b();
            }
            m675G(4);
            return true;
        }
        int i4 = this.f878d - this.f880f;
        byte[] bArr = this.f877c;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f880f;
                this.f880f = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw if0.m2598c();
        }
        while (i3 < 10) {
            int i6 = this.f880f;
            if (i6 == this.f878d) {
                throw if0.m2600e();
            }
            this.f880f = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw if0.m2598c();
        return true;
    }
}
