package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mo1 extends AbstractC0860x0 {

    /* JADX INFO: renamed from: m */
    public final InputStream f5113m;

    /* JADX INFO: renamed from: n */
    public final byte[] f5114n;

    /* JADX INFO: renamed from: o */
    public int f5115o;

    /* JADX INFO: renamed from: p */
    public int f5116p;

    /* JADX INFO: renamed from: q */
    public int f5117q;

    /* JADX INFO: renamed from: r */
    public int f5118r;

    /* JADX INFO: renamed from: s */
    public int f5119s;

    /* JADX INFO: renamed from: t */
    public int f5120t = Integer.MAX_VALUE;

    public /* synthetic */ mo1(InputStream inputStream, int i) {
        this.f5113m = inputStream;
        this.f5114n = new byte[i < 8 ? 8 : i];
        this.f5115o = 0;
        this.f5117q = 0;
        this.f5119s = 0;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: D */
    public final int mo3240D(int i) throws mp1 {
        if (i < 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.f5119s + this.f5117q + i;
        if (i2 < 0) {
            re1.m4350e("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.f5120t;
        if (i2 > i3) {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f5120t = i2;
        m3416l0();
        return i3;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: E */
    public final void mo3241E(int i) {
        this.f5120t = i;
        m3416l0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: F */
    public final int mo3242F() {
        int i = this.f5120t;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f5119s + this.f5117q);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: G */
    public final boolean mo3243G() {
        return this.f5117q == this.f5115o && !m3418n0(1);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: H */
    public final int mo3244H() {
        return this.f5119s + this.f5117q;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: I */
    public final int mo3245I(byte[] bArr, int i, int i2) throws IOException {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f5115o;
        int i4 = this.f5117q;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int iMin = Math.min(i2, i5);
            System.arraycopy(this.f5114n, this.f5117q, bArr, i, iMin);
            this.f5117q += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i2, (this.f5120t - this.f5119s) - i4);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i6 = this.f5113m.read(bArr, i, iMin2);
            if (i6 != -1) {
                this.f5119s += i6;
            }
            return i6;
        } catch (mp1 e) {
            e.f5126j = true;
            throw e;
        }
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: J */
    public final void mo3246J(int i) throws mp1 {
        InputStream inputStream = this.f5113m;
        int i2 = this.f5115o;
        int i3 = this.f5117q;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f5117q = i3 + i;
            return;
        }
        if (i < 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.f5119s;
        int i6 = i5 + i3;
        int i7 = this.f5120t;
        if (i6 + i > i7) {
            mo3246J((i7 - i5) - i3);
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.f5119s = i6;
        this.f5115o = 0;
        this.f5117q = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (mp1 e) {
                    e.f5126j = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f5119s += i4;
                m3416l0();
                throw th;
            }
        }
        this.f5119s += i4;
        m3416l0();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f5115o;
        int i9 = i8 - this.f5117q;
        this.f5117q = i8;
        m3417m0(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f5115o;
            if (i10 <= i11) {
                this.f5117q = i10;
                return;
            } else {
                i9 += i11;
                this.f5117q = i11;
                m3417m0(1);
            }
        }
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: O */
    public final int mo3247O() throws mp1 {
        if (mo3243G()) {
            this.f5118r = 0;
            return 0;
        }
        int iMo3268j0 = mo3268j0();
        this.f5118r = iMo3268j0;
        if ((iMo3268j0 >>> 3) != 0) {
            return iMo3268j0;
        }
        re1.m4350e("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: P */
    public final void mo3248P(int i) throws mp1 {
        if (this.f5118r == i) {
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
                mo3246J(mo3268j0());
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
        int i3 = this.f5115o - this.f5117q;
        byte[] bArr = this.f5114n;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.f5117q;
                this.f5117q = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            re1.m4350e("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.f5117q == this.f5115o) {
                m3417m0(1);
            }
            int i7 = this.f5117q;
            this.f5117q = i7 + 1;
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
        return Double.longBitsToDouble(m3424t0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: S */
    public final float mo3251S() {
        return Float.intBitsToFloat(m3423s0());
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
        return mo3268j0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: W */
    public final long mo3255W() {
        return m3424t0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: X */
    public final int mo3256X() {
        return m3423s0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: Y */
    public final boolean mo3257Y() {
        return mo3269k0() != 0;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: Z */
    public final String mo3258Z() throws mp1 {
        int iMo3268j0 = mo3268j0();
        byte[] bArr = this.f5114n;
        if (iMo3268j0 > 0) {
            int i = this.f5115o;
            int i2 = this.f5117q;
            if (iMo3268j0 <= i - i2) {
                String str = new String(bArr, i2, iMo3268j0, StandardCharsets.UTF_8);
                this.f5117q += iMo3268j0;
                return str;
            }
        }
        if (iMo3268j0 == 0) {
            return "";
        }
        if (iMo3268j0 < 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iMo3268j0 > this.f5115o) {
            return new String(m3419o0(iMo3268j0), StandardCharsets.UTF_8);
        }
        m3417m0(iMo3268j0);
        String str2 = new String(bArr, this.f5117q, iMo3268j0, StandardCharsets.UTF_8);
        this.f5117q += iMo3268j0;
        return str2;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: a0 */
    public final String mo3259a0() throws IOException {
        int iMo3268j0 = mo3268j0();
        int i = this.f5117q;
        int i2 = this.f5115o;
        int i3 = i2 - i;
        byte[] bArrM3419o0 = this.f5114n;
        if (iMo3268j0 <= i3 && iMo3268j0 > 0) {
            this.f5117q = i + iMo3268j0;
        } else {
            if (iMo3268j0 == 0) {
                return "";
            }
            if (iMo3268j0 < 0) {
                re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iMo3268j0 <= i2) {
                m3417m0(iMo3268j0);
                this.f5117q = iMo3268j0;
            } else {
                bArrM3419o0 = m3419o0(iMo3268j0);
            }
        }
        return vq1.m5186d(bArrM3419o0, i, iMo3268j0);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: b0 */
    public final jo1 mo3260b0() throws IOException {
        int iMo3268j0 = mo3268j0();
        int i = this.f5115o;
        int i2 = this.f5117q;
        int i3 = i - i2;
        byte[] bArr = this.f5114n;
        if (iMo3268j0 <= i3 && iMo3268j0 > 0) {
            jo1 jo1VarM3064l = ko1.m3064l(bArr, i2, iMo3268j0);
            this.f5117q += iMo3268j0;
            return jo1VarM3064l;
        }
        if (iMo3268j0 == 0) {
            return ko1.f4486k;
        }
        if (iMo3268j0 < 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrM3420p0 = m3420p0(iMo3268j0);
        if (bArrM3420p0 != null) {
            return ko1.m3064l(bArrM3420p0, 0, bArrM3420p0.length);
        }
        int i4 = this.f5117q;
        int i5 = this.f5115o;
        int i6 = i5 - i4;
        this.f5119s += i5;
        this.f5117q = 0;
        this.f5115o = 0;
        ArrayList arrayListM3421q0 = m3421q0(iMo3268j0 - i6);
        byte[] bArr2 = new byte[iMo3268j0];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = arrayListM3421q0.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayListM3421q0.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            jo1 jo1Var = ko1.f4486k;
            return iMo3268j0 == 0 ? ko1.f4486k : new jo1(bArr2);
        } catch (mp1 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: c0 */
    public final byte[] mo3261c0() throws mp1 {
        int iMo3268j0 = mo3268j0();
        int i = this.f5115o;
        int i2 = this.f5117q;
        if (iMo3268j0 <= i - i2 && iMo3268j0 > 0) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f5114n, i2, i2 + iMo3268j0);
            this.f5117q += iMo3268j0;
            return bArrCopyOfRange;
        }
        if (iMo3268j0 >= 0) {
            return m3419o0(iMo3268j0);
        }
        re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: d0 */
    public final int mo3262d0() {
        return mo3268j0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: e0 */
    public final int mo3263e0() {
        return mo3268j0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: f0 */
    public final int mo3264f0() {
        return m3423s0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: g0 */
    public final long mo3265g0() {
        return m3424t0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: h0 */
    public final int mo3266h0() {
        return AbstractC0860x0.m5487M(mo3268j0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: i0 */
    public final long mo3267i0() {
        return AbstractC0860x0.m5488N(mo3269k0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: j0 */
    public final int mo3268j0() {
        int i;
        int i2 = this.f5117q;
        int i3 = this.f5115o;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f5114n;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f5117q = i4;
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
                this.f5117q = i5;
                return i;
            }
        }
        return (int) m3422r0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: k0 */
    public final long mo3269k0() {
        long j;
        long j2;
        long j3;
        int i = this.f5117q;
        int i2 = this.f5115o;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f5114n;
            byte b = bArr[i];
            if (b >= 0) {
                this.f5117q = i3;
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
                this.f5117q = i4;
                return j;
            }
        }
        return m3422r0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m3416l0() {
        int i = this.f5115o + this.f5116p;
        this.f5115o = i;
        int i2 = this.f5119s + i;
        int i3 = this.f5120t;
        if (i2 <= i3) {
            this.f5116p = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f5116p = i4;
        this.f5115o = i - i4;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m3417m0(int i) throws mp1 {
        if (m3418n0(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f5119s) - this.f5117q) {
            re1.m4350e("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m3418n0(int i) throws IOException {
        InputStream inputStream = this.f5113m;
        int i2 = this.f5117q;
        int i3 = i2 + i;
        int i4 = this.f5115o;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i5 = this.f5119s;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f5120t) {
            byte[] bArr = this.f5114n;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.f5119s + i2;
                this.f5119s = i5;
                i4 = this.f5115o - i2;
                this.f5115o = i4;
                this.f5117q = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    String strValueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + strValueOf.length() + 39 + 41);
                    sb2.append(strValueOf);
                    sb2.append("#read(byte[]) returned invalid result: ");
                    sb2.append(i6);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                }
                if (i6 > 0) {
                    this.f5115o += i6;
                    m3416l0();
                    if (this.f5115o >= i || m3418n0(i)) {
                        return true;
                    }
                }
            } catch (mp1 e) {
                e.f5126j = true;
                throw e;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final byte[] m3419o0(int i) throws IOException {
        byte[] bArrM3420p0 = m3420p0(i);
        if (bArrM3420p0 != null) {
            return bArrM3420p0;
        }
        int i2 = this.f5117q;
        int i3 = this.f5115o;
        int i4 = i3 - i2;
        this.f5119s += i3;
        this.f5117q = 0;
        this.f5115o = 0;
        ArrayList arrayListM3421q0 = m3421q0(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f5114n, i2, bArr, 0, i4);
        int size = arrayListM3421q0.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayListM3421q0.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: p0 */
    public final byte[] m3420p0(int i) throws IOException {
        if (i == 0) {
            return ip1.f3634a;
        }
        int i2 = this.f5119s;
        int i3 = this.f5117q;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            re1.m4350e("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.f5120t;
        if (i4 > i5) {
            mo3246J((i5 - i2) - i3);
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.f5115o - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f5113m;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (mp1 e) {
                e.f5126j = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f5114n, this.f5117q, bArr, 0, i6);
        this.f5119s += this.f5115o;
        this.f5117q = 0;
        this.f5115o = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.f5119s += i8;
                i6 += i8;
            } catch (mp1 e2) {
                e2.f5126j = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: q0 */
    public final ArrayList m3421q0(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.f5113m.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.f5119s += i3;
                    i2 += i3;
                } catch (mp1 e) {
                    e.f5126j = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public final long m3422r0() throws mp1 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f5117q == this.f5115o) {
                m3417m0(1);
            }
            int i2 = this.f5117q;
            this.f5117q = i2 + 1;
            byte b = this.f5114n[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        re1.m4350e("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    /* JADX INFO: renamed from: s0 */
    public final int m3423s0() throws mp1 {
        int i = this.f5117q;
        if (this.f5115o - i < 4) {
            m3417m0(4);
            i = this.f5117q;
        }
        this.f5117q = i + 4;
        byte[] bArr = this.f5114n;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: t0 */
    public final long m3424t0() throws mp1 {
        int i = this.f5117q;
        if (this.f5115o - i < 8) {
            m3417m0(8);
            i = this.f5117q;
        }
        this.f5117q = i + 8;
        byte[] bArr = this.f5114n;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
