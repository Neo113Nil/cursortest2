package p000;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lo1 extends AbstractC0860x0 {

    /* JADX INFO: renamed from: m */
    public final byte[] f4867m;

    /* JADX INFO: renamed from: o */
    public int f4869o;

    /* JADX INFO: renamed from: q */
    public int f4871q;

    /* JADX INFO: renamed from: r */
    public int f4872r = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: n */
    public int f4868n = 0;

    /* JADX INFO: renamed from: p */
    public int f4870p = 0;

    public /* synthetic */ lo1(byte[] bArr) {
        this.f4867m = bArr;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: D */
    public final int mo3240D(int i) {
        if (i < 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.f4870p;
        if (i2 < 0) {
            re1.m4350e("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.f4872r;
        if (i2 > i3) {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f4872r = i2;
        int i4 = this.f4868n + this.f4869o;
        this.f4868n = i4;
        if (i4 <= i2) {
            this.f4869o = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.f4869o = i5;
        this.f4868n = i4 - i5;
        return i3;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: E */
    public final void mo3241E(int i) {
        this.f4872r = i;
        int i2 = this.f4868n + this.f4869o;
        this.f4868n = i2;
        if (i2 <= i) {
            this.f4869o = 0;
            return;
        }
        int i3 = i2 - i;
        this.f4869o = i3;
        this.f4868n = i2 - i3;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: F */
    public final int mo3242F() {
        int i = this.f4872r;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f4870p;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: G */
    public final boolean mo3243G() {
        return this.f4870p == this.f4868n;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: H */
    public final int mo3244H() {
        return this.f4870p;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: I */
    public final int mo3245I(byte[] bArr, int i, int i2) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.f4868n - this.f4870p);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.f4867m, this.f4870p, bArr, i, iMin);
        this.f4870p += iMin;
        return iMin;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: J */
    public final void mo3246J(int i) throws mp1 {
        if (i >= 0) {
            int i2 = this.f4868n;
            int i3 = this.f4870p;
            if (i <= i2 - i3) {
                this.f4870p = i3 + i;
                return;
            }
        }
        if (i < 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: O */
    public final int mo3247O() throws mp1 {
        if (mo3243G()) {
            this.f4871q = 0;
            return 0;
        }
        int iM3274p0 = m3274p0();
        this.f4871q = iM3274p0;
        if ((iM3274p0 >>> 3) != 0) {
            return iM3274p0;
        }
        re1.m4350e("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: P */
    public final void mo3248P(int i) throws mp1 {
        if (this.f4871q == i) {
            return;
        }
        re1.m4350e("Protocol message end-group tag did not match expected tag.");
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: Q */
    public final boolean mo3249Q(int i) throws mp1 {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                mo3246J(8);
                return true;
            }
            if (i2 == 2) {
                mo3246J(m3274p0());
                return true;
            }
            if (i2 == 3) {
                m5491L();
                mo3248P(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.f8728k == 0) {
                    mo3248P(0);
                }
                return false;
            }
            if (i2 == 5) {
                mo3246J(4);
                return true;
            }
            re1.m4347b();
            return false;
        }
        int i3 = this.f4868n - this.f4870p;
        byte[] bArr = this.f4867m;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.f4870p;
                this.f4870p = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            re1.m4350e("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = this.f4870p;
            if (i7 == this.f4868n) {
                re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.f4870p = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        re1.m4350e("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: R */
    public final double mo3250R() {
        return Double.longBitsToDouble(m3272n0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: S */
    public final float mo3251S() {
        return Float.intBitsToFloat(m3271m0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: T */
    public final long mo3252T() {
        return mo3269k0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: U */
    public final long mo3253U() {
        return mo3269k0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: V */
    public final int mo3254V() {
        return m3274p0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: W */
    public final long mo3255W() {
        return m3272n0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: X */
    public final int mo3256X() {
        return m3271m0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: Y */
    public final boolean mo3257Y() {
        return mo3269k0() != 0;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: Z */
    public final String mo3258Z() throws mp1 {
        int iM3274p0 = m3274p0();
        if (iM3274p0 > 0) {
            int i = this.f4868n;
            int i2 = this.f4870p;
            if (iM3274p0 <= i - i2) {
                String str = new String(this.f4867m, i2, iM3274p0, StandardCharsets.UTF_8);
                this.f4870p += iM3274p0;
                return str;
            }
        }
        if (iM3274p0 == 0) {
            return "";
        }
        if (iM3274p0 < 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: a0 */
    public final String mo3259a0() throws mp1 {
        int iM3274p0 = m3274p0();
        if (iM3274p0 > 0) {
            int i = this.f4868n;
            int i2 = this.f4870p;
            if (iM3274p0 <= i - i2) {
                String strM5186d = vq1.m5186d(this.f4867m, i2, iM3274p0);
                this.f4870p += iM3274p0;
                return strM5186d;
            }
        }
        if (iM3274p0 == 0) {
            return "";
        }
        if (iM3274p0 <= 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: b0 */
    public final jo1 mo3260b0() throws mp1 {
        int iM3274p0 = m3274p0();
        if (iM3274p0 > 0) {
            int i = this.f4868n;
            int i2 = this.f4870p;
            if (iM3274p0 <= i - i2) {
                jo1 jo1VarM3064l = ko1.m3064l(this.f4867m, i2, iM3274p0);
                this.f4870p += iM3274p0;
                return jo1VarM3064l;
            }
        }
        if (iM3274p0 == 0) {
            return ko1.f4486k;
        }
        byte[] bArrM3273o0 = m3273o0(iM3274p0);
        jo1 jo1Var = ko1.f4486k;
        return bArrM3273o0.length == 0 ? ko1.f4486k : new jo1(bArrM3273o0);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: c0 */
    public final byte[] mo3261c0() {
        return m3273o0(m3274p0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: d0 */
    public final int mo3262d0() {
        return m3274p0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: e0 */
    public final int mo3263e0() {
        return m3274p0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: f0 */
    public final int mo3264f0() {
        return m3271m0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: g0 */
    public final long mo3265g0() {
        return m3272n0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: h0 */
    public final int mo3266h0() {
        return AbstractC0860x0.m5487M(m3274p0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: i0 */
    public final long mo3267i0() {
        return AbstractC0860x0.m5488N(mo3269k0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: j0 */
    public final int mo3268j0() {
        return m3274p0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: k0 */
    public final long mo3269k0() {
        long j;
        long j2;
        long j3;
        int i = this.f4870p;
        int i2 = this.f4868n;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f4867m;
            byte b = bArr[i];
            if (b >= 0) {
                this.f4870p = i3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (((long) bArr[i6]) << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.f4870p = i4;
                return j;
            }
        }
        return m3270l0();
    }

    /* JADX INFO: renamed from: l0 */
    public final long m3270l0() throws mp1 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f4870p;
            if (i2 == this.f4868n) {
                re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.f4870p = i2 + 1;
            byte b = this.f4867m[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        re1.m4350e("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    /* JADX INFO: renamed from: m0 */
    public final int m3271m0() throws mp1 {
        int i = this.f4870p;
        if (this.f4868n - i < 4) {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f4870p = i + 4;
        byte[] bArr = this.f4867m;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: n0 */
    public final long m3272n0() throws mp1 {
        int i = this.f4870p;
        if (this.f4868n - i < 8) {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.f4870p = i + 8;
        byte[] bArr = this.f4867m;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: renamed from: o0 */
    public final byte[] m3273o0(int i) throws mp1 {
        if (i > 0) {
            int i2 = this.f4868n;
            int i3 = this.f4870p;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.f4870p = i4;
                return Arrays.copyOfRange(this.f4867m, i3, i4);
            }
        }
        if (i > 0) {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        if (i == 0) {
            return ip1.f3634a;
        }
        re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public final int m3274p0() {
        int i;
        int i2 = this.f4870p;
        int i3 = this.f4868n;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f4867m;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f4870p = i4;
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
                this.f4870p = i5;
                return i;
            }
        }
        return (int) m3270l0();
    }
}
