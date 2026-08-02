package util.h.xy.ak;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ma {
    private static final byte[] Camera2StreamConfigurationMap;
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static final byte[] getHighSpeedVideoSizesFor;
    private static final byte[] getInputFormats;
    private static int[] getInputSizeshNQ4ISI = null;
    private static final byte[] getOutputFormats;
    private static int getOutputMinFrameDuration = 1;
    private static final /* synthetic */ util.h.xy.ak.ma[] getOutputStallDuration;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final byte[] f77;

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final byte[] f78;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final java.lang.String f79;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final byte[] f80;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final byte[] f81;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final byte[] f82;

    /* renamed from: ͺ, reason: contains not printable characters */
    public static final byte[] f83;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.ak.ma f84;
    private android.content.SharedPreferences getOutputStallDurationlomOqCM = null;
    private java.lang.String getOutputMinFrameDurationlomOqCM = null;
    private java.lang.String getValidOutputFormatsForInputhNQ4ISI = null;
    private java.lang.String unwrapAs = null;
    private java.lang.String toString = null;
    private java.lang.String getOutputSizeshNQ4ISI = null;
    private java.lang.String getOutputSizes = null;

    private ma(java.lang.String str) {
    }

    public static util.h.xy.ak.ma valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges + 111;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.ak.ma maVar = (util.h.xy.ak.ma) java.lang.Enum.valueOf(util.h.xy.ak.ma.class, str);
        if (i % 2 != 0) {
            return maVar;
        }
        throw null;
    }

    public static util.h.xy.ak.ma[] values() {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 105) % 128;
        util.h.xy.ak.ma[] maVarArr = (util.h.xy.ak.ma[]) getOutputStallDuration.clone();
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 61) % 128;
        return maVarArr;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{197092770, -584739042, -1379982860, -176304789}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 9, objArr);
        util.h.xy.ak.ma maVar = new util.h.xy.ak.ma(((java.lang.String) objArr[0]).intern());
        f84 = maVar;
        int i = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i + 63) % 128;
        util.h.xy.ak.ma[] maVarArr = {maVar};
        int i2 = i + 51;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            getOutputStallDuration = maVarArr;
            f79 = "ma";
            Camera2StreamConfigurationMap = new byte[]{-3, com.google.common.base.Ascii.FF, 113, 83, -4, -9, -82, 125};
            f82 = new byte[]{48, -94, -61, -73, com.visa.cbp.getEncExpo.kernelVersion, -1, -34, -20};
            f80 = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 110, 10, com.visa.cbp.getEncExpo.onUnminimized, -74, -127, 116, 41};
            f81 = new byte[]{kotlin.io.encoding.Base64.padSymbol, 110, com.visa.cbp.getEncExpo.onUnminimized, -4, -74, 125, -3, -15};
            getInputFormats = new byte[]{-39, 10, com.google.common.base.Ascii.EM, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -54, -85, 63};
            f77 = new byte[]{com.visa.cbp.getEncExpo.onUnminimized, 103, 47, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -36, Byte.MIN_VALUE, -57, 124};
            f78 = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver, 10, 41, -17, -7, -22, -78, -62};
            f83 = new byte[]{-30, com.google.common.base.Ascii.VT, 65, -74, com.google.common.base.Ascii.EM, -84, -86, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION};
            getOutputFormats = new byte[]{-14, com.google.common.base.Ascii.VT, 34, -74, 45, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -70, -97};
            getHighSpeedVideoSizesFor = new byte[]{47, -80, 43, 107, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -53, -85, -20};
            getHighResolutionOutputSizeshNQ4ISI = new byte[]{-61, 10, 85, -40, 36, -52, -35, com.google.common.base.Ascii.SUB};
            getHighSpeedVideoFpsRanges = (i + 5) % 128;
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24976(byte[] bArr) {
        int i = getOutputMinFrameDuration + 59;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            util.h.xy.al.rb.m25016(bArr);
            getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(f82), bArr);
            this.getOutputMinFrameDurationlomOqCM = util.h.xy.al.rb.m25016(bArr);
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 11) % 128;
            return;
        }
        util.h.xy.al.rb.m25016(bArr);
        getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(f82), bArr);
        this.getOutputMinFrameDurationlomOqCM = util.h.xy.al.rb.m25016(bArr);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24983(byte[] bArr) {
        int i = getOutputMinFrameDuration + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRanges = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] bArr2 = f80;
                util.h.xy.al.rb.m25016(bArr2);
                util.h.xy.al.rb.m25016(bArr);
                getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr2), bArr);
                this.getValidOutputFormatsForInputhNQ4ISI = util.h.xy.al.rb.m25016(bArr);
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 73) % 128;
                return;
            }
            byte[] bArr3 = f80;
            util.h.xy.al.rb.m25016(bArr3);
            util.h.xy.al.rb.m25016(bArr);
            getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr3), bArr);
            this.getValidOutputFormatsForInputhNQ4ISI = util.h.xy.al.rb.m25016(bArr);
            throw new java.lang.ArithmeticException();
        } catch (org.json.JSONException unused) {
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        int length = iArr.length;
        char[] cArr2 = new char[8];
        int[] iArr2 = getInputSizeshNQ4ISI;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int[] iArr3 = new int[length2];
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 59) % 128;
            for (int i2 = 0; i2 < length2; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length3 = iArr2.length;
        int[] iArr4 = new int[length3];
        int[] iArr5 = getInputSizeshNQ4ISI;
        if (iArr5 != null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 13) % 128;
            int length4 = iArr5.length;
            int[] iArr6 = new int[length4];
            for (int i3 = 0; i3 < length4; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length3);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 83) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24994(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges + 101;
        getOutputMinFrameDuration = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] bArr2 = f81;
                util.h.xy.al.rb.m25016(bArr2);
                util.h.xy.al.rb.m25016(bArr);
                getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr2), bArr);
                this.unwrapAs = util.h.xy.al.rb.m25016(bArr);
                return;
            }
            byte[] bArr3 = f81;
            util.h.xy.al.rb.m25016(bArr3);
            util.h.xy.al.rb.m25016(bArr);
            getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr3), bArr);
            this.unwrapAs = util.h.xy.al.rb.m25016(bArr);
            throw new java.lang.ArithmeticException();
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24987(byte[] bArr) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 67) % 128;
        util.h.xy.al.rb.m25016(bArr);
        try {
            getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(getInputFormats), bArr);
            this.toString = util.h.xy.al.rb.m25016(bArr);
        } catch (org.json.JSONException unused) {
        }
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 51) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24980(byte[] bArr) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 9) % 128;
        byte[] bArr2 = f77;
        util.h.xy.al.rb.m25016(bArr2);
        util.h.xy.al.rb.m25016(bArr);
        try {
            getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr2), bArr);
            this.getOutputSizeshNQ4ISI = util.h.xy.al.rb.m25016(bArr);
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 35) % 128;
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m24970(byte[] bArr) {
        int i = getOutputMinFrameDuration + 35;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            util.h.xy.al.rb.m25016(bArr);
            getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(f78), bArr);
            this.getOutputSizes = util.h.xy.al.rb.m25016(bArr);
            int i2 = getHighSpeedVideoFpsRanges + 119;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        util.h.xy.al.rb.m25016(bArr);
        getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(f78), bArr);
        this.getOutputSizes = util.h.xy.al.rb.m25016(bArr);
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24986(java.lang.String str, int i) {
        try {
            byte[] bArr = f83;
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr));
            if (highSpeedVideoFpsRangesFor != null && highSpeedVideoFpsRangesFor.length() != 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(highSpeedVideoFpsRangesFor);
                if (jSONObject.has(str)) {
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 59) % 128;
                    jSONObject.remove(str);
                    getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 83) % 128;
                }
                jSONObject.put(str, i);
                m24993(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 29) % 128;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(str, i);
            m24993(util.h.xy.al.rb.m25016(bArr), jSONObject2.toString());
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 29) % 128;
        } catch (org.json.JSONException e) {
            e.getMessage();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m24995() {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 11) % 128;
        java.lang.String str = this.getOutputMinFrameDurationlomOqCM;
        if (str == null || str.equalsIgnoreCase("")) {
            getHighSpeedVideoFpsRanges();
            if (this.getOutputMinFrameDurationlomOqCM == null) {
                int i = getOutputMinFrameDuration + 27;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        byte[] m25017 = util.h.xy.al.rb.m25017(this.getOutputMinFrameDurationlomOqCM);
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 57) % 128;
        return m25017;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m24984() {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 55) % 128;
        java.lang.String str = this.getValidOutputFormatsForInputhNQ4ISI;
        if (str == null || str.equalsIgnoreCase("")) {
            getHighSpeedVideoFpsRanges();
            if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
                int i = getOutputMinFrameDuration + 27;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        byte[] m25017 = util.h.xy.al.rb.m25017(this.getValidOutputFormatsForInputhNQ4ISI);
        int i2 = getHighSpeedVideoFpsRanges + 93;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            return m25017;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m24989() {
        int i = getHighSpeedVideoFpsRanges + 39;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            java.lang.String str = this.unwrapAs;
            if (str == null || str.equalsIgnoreCase("")) {
                getHighSpeedVideoFpsRanges();
                if (this.unwrapAs == null) {
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 71) % 128;
                    return null;
                }
            }
            return util.h.xy.al.rb.m25017(this.unwrapAs);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1.equalsIgnoreCase("") != false) goto L10;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m24981() {
        int i = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i + 107) % 128;
        java.lang.String str = this.toString;
        if (str != null) {
            int i2 = i + 57;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
        getHighSpeedVideoFpsRanges();
        if (this.toString == null) {
            return null;
        }
        return util.h.xy.al.rb.m25017(this.toString);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.String m24974() {
        int i = getHighSpeedVideoFpsRanges + 83;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.getOutputSizeshNQ4ISI;
        if (str == null || str.length() == 0) {
            getHighSpeedVideoFpsRanges();
            java.lang.String str2 = this.getOutputSizeshNQ4ISI;
            if (str2 == null || str2.length() == 0) {
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 15) % 128;
                return null;
            }
        }
        return m24968(util.h.xy.al.rb.m25017(this.getOutputSizeshNQ4ISI));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r0.length() != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.length() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        r0 = m24968(util.h.xy.al.rb.m25017(r4.getOutputSizes));
        util.h.xy.ak.ma.getHighSpeedVideoFpsRanges = (util.h.xy.ak.ma.getOutputMinFrameDuration + 103) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        return r0;
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String m24971() {
        java.lang.String str = this.getOutputSizes;
        if (str != null) {
            int i = getOutputMinFrameDuration + 107;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
        getHighSpeedVideoFpsRanges();
        java.lang.String str2 = this.getOutputSizes;
        if (str2 != null) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 11) % 128;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
    
        if (r0 != null) goto L9;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m24992(java.lang.String str) {
        java.lang.String highSpeedVideoFpsRangesFor;
        int i = getHighSpeedVideoFpsRanges + 27;
        getOutputMinFrameDuration = i % 128;
        int i2 = 4;
        if (i % 2 == 0) {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(f83));
            if (highSpeedVideoFpsRangesFor != null) {
                if (highSpeedVideoFpsRangesFor.length() > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(highSpeedVideoFpsRangesFor);
                    if (jSONObject.has(str)) {
                        i2 = jSONObject.getInt(str);
                    } else {
                        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        jSONObject.put(str, 4);
                        m24993(util.h.xy.al.rb.m25016(f83), jSONObject.toString());
                    }
                }
            }
            return i2;
        }
        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(f83));
        return i2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24978(java.lang.String str) {
        try {
            byte[] bArr = f83;
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr));
            if (highSpeedVideoFpsRangesFor != null && highSpeedVideoFpsRangesFor.length() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(highSpeedVideoFpsRangesFor);
                if (jSONObject.has(str)) {
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 3) % 128;
                    jSONObject.remove(str);
                }
                m24993(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
            }
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 13) % 128;
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24975(java.lang.String str, int i) {
        int i2 = getOutputMinFrameDuration + 121;
        getHighSpeedVideoFpsRanges = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(getOutputFormats));
                throw new java.lang.ArithmeticException();
            }
            byte[] bArr = getOutputFormats;
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr));
            if (highSpeedVideoFpsRangesFor != null) {
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 9) % 128;
                if (highSpeedVideoFpsRangesFor.length() != 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(highSpeedVideoFpsRangesFor);
                    if (jSONObject.has(str)) {
                        jSONObject.remove(str);
                    }
                    jSONObject.put(str, i);
                    m24993(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
                    return;
                }
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(str, i);
            m24993(util.h.xy.al.rb.m25016(bArr), jSONObject2.toString());
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 79) % 128;
        } catch (org.json.JSONException e) {
            e.getMessage();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m24982(java.lang.String str) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 1) % 128;
        int i = 9;
        try {
            byte[] bArr = getOutputFormats;
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr));
            if (highSpeedVideoFpsRangesFor != null) {
                int i2 = getHighSpeedVideoFpsRanges + 77;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 != 0) {
                    if (highSpeedVideoFpsRangesFor.length() > 0) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(highSpeedVideoFpsRangesFor);
                        if (!jSONObject.has(str)) {
                            jSONObject.put(str, 9);
                            m24993(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
                        } else {
                            i = jSONObject.getInt(str);
                        }
                    }
                } else {
                    throw new java.lang.ArithmeticException();
                }
            }
            int i3 = getOutputMinFrameDuration + 81;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 5;
            }
        } catch (org.json.JSONException unused) {
        }
        return i;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24979(java.lang.String str, int i) {
        try {
            byte[] bArr = getHighSpeedVideoSizesFor;
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr));
            if (highSpeedVideoFpsRangesFor != null && highSpeedVideoFpsRangesFor.length() != 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(highSpeedVideoFpsRangesFor);
                if (jSONObject.has(str)) {
                    int i2 = getHighSpeedVideoFpsRanges + 31;
                    getOutputMinFrameDuration = i2 % 128;
                    if (i2 % 2 != 0) {
                        jSONObject.remove(str);
                    } else {
                        jSONObject.remove(str);
                        throw new java.lang.ArithmeticException();
                    }
                }
                jSONObject.put(str, i);
                m24993(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 101) % 128;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(str, i);
            m24993(util.h.xy.al.rb.m25016(bArr), jSONObject2.toString());
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 101) % 128;
        } catch (org.json.JSONException e) {
            e.getMessage();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m24973(java.lang.String str) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 29) % 128;
        int i = 9;
        try {
            byte[] bArr = getHighSpeedVideoSizesFor;
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr));
            if (highSpeedVideoFpsRangesFor != null && highSpeedVideoFpsRangesFor.length() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(highSpeedVideoFpsRangesFor);
                if (!jSONObject.has(str)) {
                    jSONObject.put(str, 9);
                    m24993(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 67) % 128;
                } else {
                    i = jSONObject.getInt(str);
                }
            }
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 59) % 128;
        } catch (org.json.JSONException unused) {
        }
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 25) % 128;
        return i;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24985(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges + 61;
        getOutputMinFrameDuration = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] bArr = getOutputFormats;
                java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr));
                if (highSpeedVideoFpsRangesFor == null || highSpeedVideoFpsRangesFor.length() <= 0) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(highSpeedVideoFpsRangesFor);
                if (jSONObject.has(str)) {
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 25) % 128;
                    jSONObject.remove(str);
                }
                m24993(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
                return;
            }
            getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(getOutputFormats));
            throw new java.lang.NullPointerException();
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m24972(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 37) % 128;
        try {
            byte[] bArr = getHighSpeedVideoSizesFor;
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.al.rb.m25016(bArr));
            if (highSpeedVideoFpsRangesFor != null) {
                int i = getHighSpeedVideoFpsRanges + 45;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 != 0) {
                    if (highSpeedVideoFpsRangesFor.length() > 0) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(highSpeedVideoFpsRangesFor);
                        if (jSONObject.has(str)) {
                            jSONObject.remove(str);
                        }
                        m24993(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
                        return;
                    }
                    return;
                }
                throw new java.lang.NullPointerException();
            }
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m24990() {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 57) % 128;
        getHighSpeedVideoSizes();
        getHighSpeedVideoSizes(util.h.xy.al.rb.m25016(f83));
        getHighSpeedVideoSizes(util.h.xy.al.rb.m25016(getOutputFormats));
        getHighSpeedVideoSizes(util.h.xy.al.rb.m25016(getHighSpeedVideoSizesFor));
        android.content.SharedPreferences sharedPreferences = this.getOutputStallDurationlomOqCM;
        byte[] bArr = Camera2StreamConfigurationMap;
        java.lang.String string = sharedPreferences.getString(util.h.xy.al.rb.m25016(bArr), null);
        if (string != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                jSONObject.remove(util.h.xy.al.rb.m25016(f82));
                jSONObject.remove(util.h.xy.al.rb.m25016(f80));
                byte[] bArr2 = f81;
                if (jSONObject.has(util.h.xy.al.rb.m25016(bArr2))) {
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 57) % 128;
                    jSONObject.remove(util.h.xy.al.rb.m25016(bArr2));
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 77) % 128;
                }
                jSONObject.remove(util.h.xy.al.rb.m25016(getInputFormats));
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
                edit.putString(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
                edit.apply();
                int i = getOutputMinFrameDuration + 103;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
            } catch (org.json.JSONException unused) {
            }
        }
        this.getOutputMinFrameDurationlomOqCM = null;
        this.toString = null;
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.unwrapAs = null;
        getHighSpeedVideoFpsRangesFor();
    }

    private void getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRanges + 55;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
            for (java.util.Map.Entry<java.lang.String, ?> entry : this.getOutputStallDurationlomOqCM.getAll().entrySet()) {
                entry.getKey();
                entry.getValue();
                java.lang.String key = entry.getKey();
                if (!key.equals(util.h.xy.al.rb.m25016(Camera2StreamConfigurationMap))) {
                    edit.remove(key);
                    getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 103) % 128;
                }
            }
            edit.apply();
            return;
        }
        this.getOutputStallDurationlomOqCM.edit();
        this.getOutputStallDurationlomOqCM.getAll().entrySet().iterator();
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final java.lang.String m24968(byte[] bArr) {
        java.lang.String str;
        if (bArr != null) {
            str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 65) % 128;
        } else {
            str = null;
        }
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 103) % 128;
        return str;
    }

    private void getHighSpeedVideoFpsRangesFor(java.lang.String str, byte[] bArr) throws org.json.JSONException {
        org.json.JSONObject jSONObject;
        int i = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i + 109) % 128;
        if (str == null) {
            int i2 = i + 67;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (bArr == null) {
                return;
            }
        }
        getHighSpeedVideoSizes();
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges == null) {
            jSONObject = new org.json.JSONObject();
            jSONObject.put(str, util.h.xy.al.rb.m25016(bArr));
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(highSpeedVideoFpsRanges);
            jSONObject2.put(str, util.h.xy.al.rb.m25016(bArr));
            jSONObject = jSONObject2;
        }
        android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
        byte[] bArr2 = Camera2StreamConfigurationMap;
        util.h.xy.al.rb.m25016(bArr2);
        edit.putString(util.h.xy.al.rb.m25016(bArr2), jSONObject.toString());
        edit.apply();
        int length = bArr.length;
    }

    private java.lang.String getHighSpeedVideoFpsRanges() {
        int i;
        getHighSpeedVideoSizes();
        java.lang.String string = this.getOutputStallDurationlomOqCM.getString(util.h.xy.al.rb.m25016(Camera2StreamConfigurationMap), null);
        if (string != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                this.toString = jSONObject.optString(util.h.xy.al.rb.m25016(getInputFormats));
                this.getOutputMinFrameDurationlomOqCM = jSONObject.optString(util.h.xy.al.rb.m25016(f82));
                this.getValidOutputFormatsForInputhNQ4ISI = jSONObject.optString(util.h.xy.al.rb.m25016(f80));
                this.unwrapAs = jSONObject.optString(util.h.xy.al.rb.m25016(f81));
                this.getOutputSizeshNQ4ISI = jSONObject.optString(util.h.xy.al.rb.m25016(f77));
                this.getOutputSizes = jSONObject.optString(util.h.xy.al.rb.m25016(f78));
                i = getOutputMinFrameDuration + 31;
            } catch (org.json.JSONException unused) {
            }
        } else {
            i = getOutputMinFrameDuration + 37;
        }
        getHighSpeedVideoFpsRanges = i % 128;
        return string;
    }

    private void getHighSpeedVideoSizes() {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 9) % 128;
        if (this.getOutputStallDurationlomOqCM == null) {
            android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-208116866, -199005091, 1007017650, -1627303018}, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7, objArr);
            this.getOutputStallDurationlomOqCM = m24558.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0);
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 13) % 128;
        }
        int i = getOutputMinFrameDuration + 55;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24988(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges + 109;
        getOutputMinFrameDuration = i % 128;
        try {
            if (i % 2 != 0) {
                util.h.xy.ar.b.m25074(bArr);
                util.h.xy.ar.b.m25074(bArr2);
                m24977(bArr, bArr2);
            } else {
                util.h.xy.ar.b.m25074(bArr);
                util.h.xy.ar.b.m25074(bArr2);
                m24977(bArr, bArr2);
                util.h.xy.ar.b.m25074(bArr);
                throw null;
            }
        } finally {
            util.h.xy.ar.b.m25074(bArr);
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m24991(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges + 119;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ar.b.m25074(bArr);
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr);
            if (highSpeedVideoSizes == null) {
                highSpeedVideoSizes = new byte[]{0};
            }
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 93) % 128;
            return highSpeedVideoSizes;
        }
        util.h.xy.ar.b.m25074(bArr);
        getHighSpeedVideoSizes(bArr);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m24969(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges + 21;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            getHighResolutionOutputSizeshNQ4ISI(str);
            int i2 = getHighSpeedVideoFpsRanges + 65;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(str);
        throw new java.lang.ArithmeticException();
    }

    private byte[] getHighSpeedVideoSizes(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges + 35;
        getOutputMinFrameDuration = i % 128;
        try {
            if (i % 2 == 0) {
                getHighSpeedVideoSizes();
                android.text.TextUtils.isEmpty(this.getOutputStallDurationlomOqCM.getString(util.h.xy.al.rb.m25016(bArr), null));
                throw new java.lang.ArithmeticException();
            }
            getHighSpeedVideoSizes();
            java.lang.String string = this.getOutputStallDurationlomOqCM.getString(util.h.xy.al.rb.m25016(bArr), null);
            if (!android.text.TextUtils.isEmpty(string)) {
                return util.h.xy.al.rb.m25017(string);
            }
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 67) % 128;
            return null;
        } catch (java.lang.Exception e) {
            e.getMessage();
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(e.getMessage());
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 89) % 128;
        try {
            getHighSpeedVideoSizes();
            android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
            edit.remove(str);
            edit.apply();
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 57) % 128;
        } catch (java.lang.Exception e) {
            e.getMessage();
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(e.getMessage());
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24977(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputMinFrameDuration + 29;
        getHighSpeedVideoFpsRanges = i % 128;
        try {
            if (i % 2 == 0) {
                getHighSpeedVideoSizes();
                java.lang.String m25016 = util.h.xy.al.rb.m25016(bArr);
                android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
                edit.putString(m25016, util.h.xy.al.rb.m25016(bArr2));
                edit.apply();
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 121) % 128;
                return;
            }
            getHighSpeedVideoSizes();
            java.lang.String m250162 = util.h.xy.al.rb.m25016(bArr);
            android.content.SharedPreferences.Editor edit2 = this.getOutputStallDurationlomOqCM.edit();
            edit2.putString(m250162, util.h.xy.al.rb.m25016(bArr2));
            edit2.apply();
            throw null;
        } catch (java.lang.Exception e) {
            e.getMessage();
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(e.getMessage());
        }
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        int i = getOutputMinFrameDuration + 119;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoSizes();
            return this.getOutputStallDurationlomOqCM.getString(str, null);
        }
        getHighSpeedVideoSizes();
        this.getOutputStallDurationlomOqCM.getString(str, null);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24993(java.lang.String str, java.lang.String str2) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 23) % 128;
        getHighSpeedVideoSizes();
        android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
        edit.putString(str, str2);
        edit.commit();
        int i = getOutputMinFrameDuration + 97;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private void getHighSpeedVideoSizes(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 109) % 128;
        getHighSpeedVideoSizes();
        android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
        edit.remove(str);
        edit.commit();
        int i = getHighSpeedVideoFpsRanges + 49;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputSizeshNQ4ISI = new int[]{-1723484540, 726220241, 614785575, -682893328, 446961168, 1919063369, -2136470785, 1180293842, -1679038349, 816052001, -714771188, 107872567, -851374241, 1288236547, -628773890, 1244596516, -1439560692, 1247238373};
    }
}
