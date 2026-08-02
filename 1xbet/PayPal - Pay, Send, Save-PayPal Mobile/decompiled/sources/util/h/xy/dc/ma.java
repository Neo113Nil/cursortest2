package util.h.xy.dc;

/* loaded from: classes18.dex */
public final class ma extends java.io.FilterInputStream {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static char getOutputFormats;
    private static char getOutputMinFrameDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final int[] f1157;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final byte[] f1158;

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final int[] f1159;

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final int[] f1160;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private static final int[] f1161;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final byte[][] f1162;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f1163;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int[] f1164;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f1165;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f1166;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int f1167;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f1168;

    /* renamed from: ˌ, reason: contains not printable characters */
    private final byte[] f1169;

    /* renamed from: ͺ, reason: contains not printable characters */
    private final int[] f1170;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f1171;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int f1172;

    /* renamed from: ι, reason: contains not printable characters */
    private final byte[] f1173;

    static {
        getHighSpeedVideoSizes();
        f1158 = util.h.xy.dc.b.getHighResolutionOutputSizeshNQ4ISI;
        f1159 = util.h.xy.dc.b.getHighSpeedVideoSizes;
        f1160 = util.h.xy.dc.b.getOutputFormats;
        f1157 = util.h.xy.dc.b.getHighSpeedVideoFpsRangesFor;
        f1161 = util.h.xy.dc.b.getHighSpeedVideoSizesFor;
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
    }

    public ma(java.io.InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, 100, 100);
    }

    public ma(java.io.InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, int i2, int i3) {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.f1164 = new int[4];
        this.f1173 = new byte[16];
        this.f1169 = new byte[16];
        this.f1168 = 1;
        this.f1166 = Integer.MAX_VALUE;
        this.f1172 = 16;
        this.f1171 = 16;
        this.f1163 = i;
        this.f1170 = util.h.xy.dc.b.getHighResolutionOutputSizeshNQ4ISI(bArr, i);
        this.f1162 = m26270(bArr2);
        this.f1165 = i2;
        this.f1167 = i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
        m26268();
        int i = this.f1172;
        if (i < this.f1171) {
            byte[] bArr = this.f1169;
            this.f1172 = i + 1;
            return bArr[i] & 255;
        }
        int i2 = getInputSizeshNQ4ISI + 109;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return -1;
        }
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
        int read = read(bArr, 0, bArr.length);
        int i = getHighResolutionOutputSizeshNQ4ISI + 89;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return read;
        }
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m26268();
            int i5 = this.f1172;
            if (i5 < this.f1171) {
                byte[] bArr2 = this.f1169;
                this.f1172 = i5 + 1;
                bArr[i4] = bArr2[i5];
                getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 65) % 128;
            } else {
                int i6 = (getInputSizeshNQ4ISI + 115) % 128;
                getHighResolutionOutputSizeshNQ4ISI = i6;
                if (i4 != i) {
                    return i2 - (i3 - i4);
                }
                getInputSizeshNQ4ISI = (i6 + 13) % 128;
                return -1;
            }
        }
        return i2;
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 49;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 11) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 103) % 128;
        long j2 = 0;
        while (j2 < j && read() != -1) {
            getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
            j2++;
        }
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 65) % 128;
        m26268();
        int i = this.f1171;
        int i2 = this.f1172;
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
        return i - i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 35) % 128;
        super.close();
        int i = getHighResolutionOutputSizeshNQ4ISI + 71;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 109) % 128;
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws java.io.IOException {
        synchronized (this) {
            getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private byte[][] m26270(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
            getInputSizeshNQ4ISI = i2;
            bArr2[i] = new byte[bArr[i].length];
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 55) % 128;
            int i3 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i3 < bArr3.length) {
                    getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
                    bArr2[i][bArr3[i3]] = (byte) i3;
                    i3++;
                }
            }
        }
        return bArr2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private int m26268() throws java.io.IOException {
        if (this.f1166 == Integer.MAX_VALUE) {
            this.f1166 = this.in.read();
        }
        if (this.f1172 == 16) {
            byte[] bArr = this.f1173;
            int i = this.f1166;
            bArr[0] = (byte) i;
            if (i < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("辭ⶁ\uf8f3\ue6a3閨꣪䎁\uecf3쯐ﾗ良ణ孬촧罜짫ᶟ\u1ae3甸⊞Თ⟏", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21, objArr);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
            }
            int i2 = 1;
            while (true) {
                int read = this.in.read(this.f1173, i2, 16 - i2);
                if (read <= 0) {
                    getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
                    break;
                }
                i2 += read;
                if (i2 >= 16) {
                    break;
                }
            }
            if (i2 < 16) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("辭ⶁ\uf8f3\ue6a3閨꣪䎁\uecf3쯐ﾗ良ణ孬촧罜짫ᶟ\u1ae3甸⊞Თ⟏", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 21, objArr2);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
            }
            int i3 = this.f1165;
            if (i3 == this.f1167) {
                m26267(this.f1173, 0, this.f1169, 0);
                getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
            } else {
                if (this.f1168 <= i3) {
                    m26267(this.f1173, 0, this.f1169, 0);
                } else {
                    byte[] bArr2 = this.f1173;
                    java.lang.System.arraycopy(bArr2, 0, this.f1169, 0, bArr2.length);
                }
                m26269();
            }
            int read2 = this.in.read();
            this.f1166 = read2;
            this.f1172 = 0;
            this.f1171 = read2 < 0 ? 16 - (this.f1169[15] & 255) : 16;
            getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 47) % 128;
        }
        return this.f1171;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m26267(byte[] bArr, int i, byte[] bArr2, int i2) {
        util.h.xy.dc.ma maVar = this;
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 51) % 128;
        int[] iArr = maVar.f1164;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr2 = maVar.f1170;
        int i3 = (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
        char c = 0;
        iArr[0] = i3 ^ iArr2[0];
        int i4 = (bArr[i + 4] << com.google.common.base.Ascii.CAN) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i + 7] & 255);
        char c2 = 1;
        iArr[1] = i4 ^ iArr2[1];
        char c3 = 2;
        iArr[2] = ((((bArr[i + 8] << com.google.common.base.Ascii.CAN) | ((bArr[i + 9] & 255) << 16)) | ((bArr[i + 10] & 255) << 8)) | (bArr[i + 11] & 255)) ^ iArr2[2];
        int i5 = (bArr[i + 12] << com.google.common.base.Ascii.CAN) | ((bArr[i + 13] & 255) << 16) | ((bArr[i + 14] & 255) << 8) | (bArr[i + 15] & 255);
        char c4 = 3;
        iArr[3] = i5 ^ iArr2[3];
        int i6 = 4;
        int i7 = 1;
        while (i7 < maVar.f1163) {
            int i8 = getHighResolutionOutputSizeshNQ4ISI;
            getInputSizeshNQ4ISI = (i8 + 111) % 128;
            int[] iArr3 = f1159;
            int[] iArr4 = maVar.f1164;
            byte[][] bArr3 = maVar.f1162;
            byte[] bArr4 = bArr3[c];
            int i9 = iArr3[iArr4[bArr4[c]] >>> 24];
            int[] iArr5 = f1160;
            byte[] bArr5 = bArr3[c2];
            int i10 = iArr5[(iArr4[bArr5[c]] >>> 16) & 255];
            int[] iArr6 = f1157;
            byte[] bArr6 = bArr3[c3];
            int i11 = iArr6[(iArr4[bArr6[c]] >>> 8) & 255];
            int[] iArr7 = f1161;
            byte[] bArr7 = bArr3[c4];
            int i12 = iArr7[iArr4[bArr7[c]] & 255];
            int[] iArr8 = maVar.f1170;
            int i13 = iArr8[i6];
            int i14 = iArr3[iArr4[bArr4[c2]] >>> 24];
            int i15 = iArr5[(iArr4[bArr5[c2]] >>> 16) & 255];
            int i16 = iArr6[(iArr4[bArr6[1]] >>> 8) & 255];
            int i17 = iArr7[iArr4[bArr7[1]] & 255];
            int i18 = iArr8[i6 + 1];
            int i19 = iArr3[iArr4[bArr4[2]] >>> 24];
            int i20 = i7;
            int i21 = iArr5[(iArr4[bArr5[2]] >>> 16) & 255];
            int i22 = iArr6[(iArr4[bArr6[2]] >>> 8) & 255];
            int i23 = iArr7[iArr4[bArr7[2]] & 255];
            int i24 = iArr8[i6 + 2];
            int i25 = iArr3[iArr4[bArr4[3]] >>> 24];
            int i26 = iArr5[(iArr4[bArr5[3]] >>> 16) & 255];
            int i27 = iArr6[(iArr4[bArr6[3]] >>> 8) & 255];
            int i28 = iArr7[iArr4[bArr7[3]] & 255];
            int i29 = iArr8[i6 + 3];
            iArr4[0] = (i12 ^ (i11 ^ (i9 ^ i10))) ^ i13;
            iArr4[1] = ((i16 ^ (i14 ^ i15)) ^ i17) ^ i18;
            iArr4[2] = (((i21 ^ i19) ^ i22) ^ i23) ^ i24;
            iArr4[3] = (((i25 ^ i26) ^ i27) ^ i28) ^ i29;
            i7 = i20 + 1;
            i6 += 4;
            getInputSizeshNQ4ISI = (i8 + 63) % 128;
            maVar = this;
            c = 0;
            c2 = 1;
            c3 = 2;
            c4 = 3;
        }
        int[] iArr9 = maVar.f1170;
        int i30 = iArr9[i6];
        byte[] bArr8 = f1158;
        int[] iArr10 = maVar.f1164;
        byte[][] bArr9 = maVar.f1162;
        byte[] bArr10 = bArr9[0];
        bArr2[i2] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i30 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[i2 + 1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i30 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[i2 + 2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i30 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[i2 + 3] = (byte) (i30 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i31 = iArr9[i6 + 1];
        bArr2[i2 + 4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i31 >>> 24));
        bArr2[i2 + 5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i31 >>> 16));
        bArr2[i2 + 6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i31 >>> 8));
        bArr2[i2 + 7] = (byte) (i31 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i32 = iArr9[i6 + 2];
        bArr2[i2 + 8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i32 >>> 24));
        bArr2[i2 + 9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i32 >>> 16));
        bArr2[i2 + 10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i32 >>> 8));
        bArr2[i2 + 11] = (byte) (i32 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i33 = iArr9[i6 + 3];
        bArr2[i2 + 12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i33 >>> 24));
        bArr2[i2 + 13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i33 >>> 16));
        bArr2[i2 + 14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i33 >>> 8));
        bArr2[i2 + 15] = (byte) (i33 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m26269() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getInputSizeshNQ4ISI = (i + 97) % 128;
        int i2 = this.f1168;
        if (i2 >= this.f1167) {
            this.f1168 = 1;
            return;
        }
        int i3 = i + 89;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            this.f1168 = i2;
        } else {
            this.f1168 = i2 + 1;
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRanges = (char) 9635;
        getOutputMinFrameDuration = (char) 19604;
        getHighSpeedVideoFpsRangesFor = (char) 17210;
        getOutputFormats = (char) 31680;
    }
}
