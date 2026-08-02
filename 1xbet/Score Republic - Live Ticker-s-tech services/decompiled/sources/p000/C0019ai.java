package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ai */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0019ai extends AbstractC0860x0 {

    /* JADX INFO: renamed from: m */
    public final byte[] f185m;

    /* JADX INFO: renamed from: n */
    public int f186n;

    /* JADX INFO: renamed from: o */
    public int f187o;

    /* JADX INFO: renamed from: p */
    public int f188p;

    /* JADX INFO: renamed from: q */
    public final int f189q;

    /* JADX INFO: renamed from: r */
    public int f190r;

    /* JADX INFO: renamed from: s */
    public int f191s = Integer.MAX_VALUE;

    public C0019ai(byte[] bArr, int i, int i2, boolean z) {
        this.f185m = bArr;
        this.f186n = i2 + i;
        this.f188p = i;
        this.f189q = i;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: A */
    public final long mo214A() {
        return m231o0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: B */
    public final boolean mo215B(int i) throws hf0 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m236r0(8);
                return true;
            }
            if (i2 == 2) {
                m236r0(m229n0());
                return true;
            }
            if (i2 == 3) {
                m5490C();
                mo216a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw hf0.m2259b();
            }
            m236r0(4);
            return true;
        }
        int i4 = this.f186n - this.f188p;
        byte[] bArr = this.f185m;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f188p;
                this.f188p = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw hf0.m2260c();
        }
        while (i3 < 10) {
            int i6 = this.f188p;
            if (i6 == this.f186n) {
                throw hf0.m2262e();
            }
            this.f188p = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw hf0.m2260c();
        return true;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: a */
    public final void mo216a(int i) throws hf0 {
        if (this.f190r != i) {
            throw new hf0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: b */
    public final int mo217b() {
        return this.f188p - this.f189q;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: c */
    public final boolean mo218c() {
        return this.f188p == this.f186n;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: e */
    public final void mo219e(int i) {
        this.f191s = i;
        m235q0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: f */
    public final int mo220f(int i) throws hf0 {
        if (i < 0) {
            throw hf0.m2261d();
        }
        int iMo217b = mo217b() + i;
        if (iMo217b < 0) {
            throw new hf0("Failed to parse the message.");
        }
        int i2 = this.f191s;
        if (iMo217b > i2) {
            throw hf0.m2262e();
        }
        this.f191s = iMo217b;
        m235q0();
        return i2;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: g */
    public final boolean mo221g() {
        return m231o0() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: i */
    public final C0762ud mo222i() throws hf0 {
        byte[] bArrCopyOfRange;
        int iM229n0 = m229n0();
        byte[] bArr = this.f185m;
        if (iM229n0 > 0) {
            int i = this.f186n;
            int i2 = this.f188p;
            if (iM229n0 <= i - i2) {
                C0762ud c0762udM4908d = C0762ud.m4908d(bArr, i2, iM229n0);
                this.f188p += iM229n0;
                return c0762udM4908d;
            }
        }
        if (iM229n0 == 0) {
            return C0762ud.f7797l;
        }
        if (iM229n0 > 0) {
            int i3 = this.f186n;
            int i4 = this.f188p;
            if (iM229n0 <= i3 - i4) {
                int i5 = iM229n0 + i4;
                this.f188p = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM229n0 <= 0) {
                    throw hf0.m2262e();
                }
                if (iM229n0 == 0) {
                    throw hf0.m2261d();
                }
                bArrCopyOfRange = fe0.f2382b;
            }
        } else {
            if (iM229n0 <= 0) {
                throw hf0.m2262e();
            }
            if (iM229n0 == 0) {
                throw hf0.m2261d();
            }
            bArrCopyOfRange = fe0.f2382b;
        }
        C0762ud c0762ud = C0762ud.f7797l;
        return new C0762ud(bArrCopyOfRange);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: k */
    public final double mo223k() {
        return Double.longBitsToDouble(m227m0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: l */
    public final int mo224l() {
        return m229n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final int m225l0() throws hf0 {
        int i = this.f188p;
        if (this.f186n - i < 4) {
            throw hf0.m2262e();
        }
        this.f188p = i + 4;
        byte[] bArr = this.f185m;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: m */
    public final int mo226m() {
        return m225l0();
    }

    /* JADX INFO: renamed from: m0 */
    public final long m227m0() throws hf0 {
        int i = this.f188p;
        if (this.f186n - i < 8) {
            throw hf0.m2262e();
        }
        this.f188p = i + 8;
        byte[] bArr = this.f185m;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: n */
    public final long mo228n() {
        return m227m0();
    }

    /* JADX INFO: renamed from: n0 */
    public final int m229n0() {
        int i;
        int i2 = this.f188p;
        int i3 = this.f186n;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f185m;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f188p = i4;
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
                this.f188p = i5;
                return i;
            }
        }
        return (int) m233p0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: o */
    public final float mo230o() {
        return Float.intBitsToFloat(m225l0());
    }

    /* JADX INFO: renamed from: o0 */
    public final long m231o0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f188p;
        int i2 = this.f186n;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f185m;
            byte b = bArr[i];
            if (b >= 0) {
                this.f188p = i3;
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
                this.f188p = i4;
                return j;
            }
        }
        return m233p0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: p */
    public final int mo232p() {
        return m229n0();
    }

    /* JADX INFO: renamed from: p0 */
    public final long m233p0() throws hf0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f188p;
            if (i2 == this.f186n) {
                throw hf0.m2262e();
            }
            this.f188p = i2 + 1;
            byte b = this.f185m[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw hf0.m2260c();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: q */
    public final long mo234q() {
        return m231o0();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m235q0() {
        int i = this.f186n + this.f187o;
        this.f186n = i;
        int i2 = i - this.f189q;
        int i3 = this.f191s;
        if (i2 <= i3) {
            this.f187o = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f187o = i4;
        this.f186n = i - i4;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m236r0(int i) throws hf0 {
        if (i >= 0) {
            int i2 = this.f186n;
            int i3 = this.f188p;
            if (i <= i2 - i3) {
                this.f188p = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw hf0.m2262e();
        }
        throw hf0.m2261d();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: s */
    public final int mo237s() {
        return m225l0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: t */
    public final long mo238t() {
        return m227m0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: u */
    public final int mo239u() {
        int iM229n0 = m229n0();
        return (-(iM229n0 & 1)) ^ (iM229n0 >>> 1);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: v */
    public final long mo240v() {
        long jM231o0 = m231o0();
        return (-(jM231o0 & 1)) ^ (jM231o0 >>> 1);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: w */
    public final String mo241w() throws hf0 {
        int iM229n0 = m229n0();
        if (iM229n0 > 0) {
            int i = this.f186n;
            int i2 = this.f188p;
            if (iM229n0 <= i - i2) {
                String str = new String(this.f185m, i2, iM229n0, fe0.f2381a);
                this.f188p += iM229n0;
                return str;
            }
        }
        if (iM229n0 == 0) {
            return "";
        }
        if (iM229n0 < 0) {
            throw hf0.m2261d();
        }
        throw hf0.m2262e();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: x */
    public final String mo242x() throws hf0 {
        int iM229n0 = m229n0();
        if (iM229n0 > 0) {
            int i = this.f186n;
            int i2 = this.f188p;
            if (iM229n0 <= i - i2) {
                String strMo4522d = wg1.f8548a.mo4522d(this.f185m, i2, iM229n0);
                this.f188p += iM229n0;
                return strMo4522d;
            }
        }
        if (iM229n0 == 0) {
            return "";
        }
        if (iM229n0 <= 0) {
            throw hf0.m2261d();
        }
        throw hf0.m2262e();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: y */
    public final int mo243y() throws hf0 {
        if (mo218c()) {
            this.f190r = 0;
            return 0;
        }
        int iM229n0 = m229n0();
        this.f190r = iM229n0;
        if ((iM229n0 >>> 3) != 0) {
            return iM229n0;
        }
        throw new hf0("Protocol message contained an invalid tag (zero).");
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: z */
    public final int mo244z() {
        return m229n0();
    }
}
