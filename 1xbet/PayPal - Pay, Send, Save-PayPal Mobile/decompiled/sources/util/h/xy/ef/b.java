package util.h.xy.ef;

/* loaded from: classes5.dex */
public class b {
    private static char Camera2StreamConfigurationMap = 58893;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char getHighSpeedVideoSizes = 58260;
    private static char getInputFormats = 32273;
    private static int getOutputFormats = 0;
    private static char getOutputMinFrameDuration = 65506;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected boolean f2143;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected boolean f2144;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected util.h.xy.ef.ra f2145;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected byte[] f2146;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected boolean f2147;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected int f2148;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getInputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizes ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i4 = getHighSpeedVideoFpsRanges + 99;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m26540() {
        int i = getOutputFormats + 79;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 4;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f2146;
            if (i3 >= bArr.length) {
                this.f2148 = 0;
                this.f2145.mo26557();
                return;
            }
            int i4 = getOutputFormats + 49;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                bArr[i3] = 1;
                i3 += 26;
            } else {
                bArr[i3] = 0;
                i3++;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public int mo26539(byte[] bArr, int i) throws util.h.xy.ef.mc, java.lang.IllegalStateException, util.h.xy.ef.md {
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 47) % 128;
        try {
            int i2 = this.f2148;
            int i3 = 0;
            if (i + i2 > bArr.length) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("㍌⠒ᦢꎀֿ\ue620\ue28eꗶ\ue3e1\uf043\uef4a鋏ꩊ븖렷硍Ḷ釄嵈\ufbcc辫ᶔ㜌끒핃ᅕꩊ븖痊例ᡖ㾄灺綐掚Ꭸ䑼璎", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 38, objArr);
                throw new util.h.xy.ef.f(((java.lang.String) objArr[0]).intern());
            }
            if (i2 != 0) {
                if (!this.f2147) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("덳\uead9뻕ⷂᤐ\ue976ꪨ쏲\ue28eꗶﾯ舙\ue8f1鿪洉䎎ꏿ㜗ཷ챉뽿뛯䜊悽ᏹ⍴詂瑮", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, objArr2);
                    throw new util.h.xy.ef.mc(((java.lang.String) objArr2[0]).intern());
                }
                util.h.xy.ef.ra raVar = this.f2145;
                byte[] bArr2 = this.f2146;
                raVar.mo26555(bArr2, 0, bArr2, 0);
                int i4 = this.f2148;
                this.f2148 = 0;
                java.lang.System.arraycopy(this.f2146, 0, bArr, i, i4);
                i3 = i4;
            }
            m26540();
            int i5 = getHighSpeedVideoFpsRangesFor + 109;
            getOutputFormats = i5 % 128;
            if (i5 % 2 == 0) {
                return i3;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            m26540();
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public int mo26536(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws util.h.xy.ef.mc, java.lang.IllegalStateException {
        int i4;
        if (i2 < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("葀ﰗ轿勽㜌끒ᗊ\uea3e䓦甿倔瘣ᤐ\ue976免暀횱\uf691⭚뵾ཷ챉႐쥱衩\uec00㜌끒넬댧㮨뻽뉟䁍㗆\uf24c", 35 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int m26534 = m26534();
        int mo26538 = mo26538(i2);
        if (mo26538 > 0) {
            int i5 = getOutputFormats + 93;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 != 0 ? mo26538 + i3 > bArr2.length : i3 - mo26538 > bArr2.length) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("㍌⠒ᦢꎀֿ\ue620\ue28eꗶ\ue3e1\uf043\uef4a鋏ꩊ븖렷硍Ḷ釄嵈\ufbcc辫ᶔ꒻〆", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23, objArr2);
                throw new util.h.xy.ef.f(((java.lang.String) objArr2[0]).intern());
            }
        }
        byte[] bArr3 = this.f2146;
        int length = bArr3.length;
        int i6 = this.f2148;
        int i7 = length - i6;
        if (i2 > i7) {
            java.lang.System.arraycopy(bArr, i, bArr3, i6, i7);
            i4 = this.f2145.mo26555(this.f2146, 0, bArr2, i3);
            this.f2148 = 0;
            i2 -= i7;
            i += i7;
            while (i2 > this.f2146.length) {
                i4 += this.f2145.mo26555(bArr, i, bArr2, i3 + i4);
                i2 -= m26534;
                i += m26534;
            }
        } else {
            i4 = 0;
        }
        java.lang.System.arraycopy(bArr, i, this.f2146, this.f2148, i2);
        int i8 = this.f2148 + i2;
        this.f2148 = i8;
        byte[] bArr4 = this.f2146;
        if (i8 == bArr4.length) {
            int i9 = getHighSpeedVideoFpsRangesFor + 89;
            getOutputFormats = i9 % 128;
            i4 = i9 % 2 != 0 ? i4 - this.f2145.mo26555(bArr4, 0, bArr2, i3 << i4) : i4 + this.f2145.mo26555(bArr4, 0, bArr2, i3 + i4);
            this.f2148 = 0;
        }
        return i4;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public int mo26535(int i) {
        int i2 = getOutputFormats + 37;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = this.f2148;
        return i2 % 2 == 0 ? i * i3 : i + i3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public int mo26538(int i) {
        int length;
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor;
        getOutputFormats = (i3 + 71) % 128;
        int i4 = i + this.f2148;
        if (!this.f2143) {
            length = this.f2146.length;
        } else {
            if (this.f2144) {
                int i5 = i3 + 29;
                getOutputFormats = i5 % 128;
                i2 = i5 % 2 != 0 ? (this.f2146.length + i4) << (this.f2145.mo26554() / 2) : (i4 % this.f2146.length) - (this.f2145.mo26554() + 2);
                return i4 - i2;
            }
            length = this.f2146.length;
        }
        i2 = i4 % length;
        return i4 - i2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public int m26534() {
        int i = getHighSpeedVideoFpsRangesFor + 9;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            this.f2145.mo26554();
            throw null;
        }
        int mo26554 = this.f2145.mo26554();
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 59) % 128;
        return mo26554;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void mo26537(boolean z, util.h.xy.ef.mb mbVar) throws java.lang.IllegalArgumentException {
        int i = getHighSpeedVideoFpsRangesFor + 59;
        getOutputFormats = i % 128;
        this.f2144 = z;
        m26540();
        if (i % 2 != 0) {
            this.f2145.mo26556(z, mbVar);
            throw new java.lang.ArithmeticException();
        }
        this.f2145.mo26556(z, mbVar);
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 31) % 128;
    }
}
