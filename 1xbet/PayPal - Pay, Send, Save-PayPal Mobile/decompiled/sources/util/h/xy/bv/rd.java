package util.h.xy.bv;

/* loaded from: classes5.dex */
public class rd extends util.h.xy.bv.mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static short[] getInputFormats = null;
    private static byte[] getInputSizeshNQ4ISI = null;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 0;
    private static char getOutputMinFrameDurationlomOqCM = 0;
    private static final java.lang.String getOutputSizes;
    private static int getOutputSizeshNQ4ISI = 0;
    private static int getOutputStallDuration = 1;
    private static char getOutputStallDurationlomOqCM;
    private java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private long isOutputSupportedForhNQ4ISI;
    private java.lang.String toString;
    private java.lang.String unwrapAs;

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor();
        getOutputSizes = util.h.xy.bv.rd.class.getName();
        getOutputSizeshNQ4ISI = (getOutputStallDuration + 17) % 128;
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor + 109;
        Camera2StreamConfigurationMap = i2 % 128;
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
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 95) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getOutputStallDurationlomOqCM ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDurationlomOqCM ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizes ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 89) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 1) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 11) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
            int i5 = getHighSpeedVideoFpsRangesFor + 111;
            Camera2StreamConfigurationMap = i5 % 128;
            int i6 = i5 % 2;
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 1) % 128;
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        int i7 = Camera2StreamConfigurationMap + 37;
        getHighSpeedVideoFpsRangesFor = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rd() {
        super(((java.lang.String) r14[0]).intern());
        byte b;
        int i;
        boolean z;
        int i2;
        byte[] m25800;
        int i3 = 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0004\u000e\u0001\r\r\u000f￣\u0014\u0018\u0005￮\u0014\u0005\u0007ￏ\u0013\u0014\u0005\f\f\u0001\u0017ￏￒ\u0016ￏ", 25 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.MeasureSpec.getSize(0) + 26, android.text.TextUtils.indexOf("", "", 0, 0) + 259, true, objArr);
        try {
            m25800 = util.h.xy.by.ma.f1067.m25800();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getLocalizedMessage();
        }
        try {
            if (m25800 != null && !util.h.xy.ar.b.m25070(m25800)) {
                this.isOutputSupportedForhNQ4ISI = java.lang.Long.parseLong(new java.lang.String(m25800));
                getOutputSizeshNQ4ISI = (getOutputStallDuration + 119) % 128;
                i2 = getOutputSizeshNQ4ISI + 41;
                getOutputStallDuration = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
            short doubleTapTimeout = (short) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte maximumDrawingCacheSize = (byte) ((-64) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int i4 = (-387418905) - (scrollDefaultDelay >> 16);
            int indexOf = (-73) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            int i5 = 1580460335 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            util.h.xz.b.me meVar = new util.h.xz.b.me();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i6 = indexOf + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
            int i7 = i6 == -1 ? 1 : 0;
            if (i7 != 0) {
                byte[] bArr = getInputSizeshNQ4ISI;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    while (i3 < length) {
                        bArr2[i3] = (byte) (bArr[i3] ^ (-2689713159175858216L));
                        i3++;
                        maximumDrawingCacheSize = maximumDrawingCacheSize;
                    }
                    b = maximumDrawingCacheSize;
                    bArr = bArr2;
                } else {
                    b = maximumDrawingCacheSize;
                }
                i6 = bArr != null ? (byte) (((byte) (getInputSizeshNQ4ISI[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i4] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)))) : (short) (((short) (getInputFormats[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i4] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            } else {
                b = maximumDrawingCacheSize;
            }
            if (i6 > 0) {
                meVar.f2647 = ((i4 + i6) - 2) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i7;
                meVar.f2644 = (char) (i5 + ((int) (getOutputFormats ^ (-2689713159175858216L))));
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                byte[] bArr3 = getInputSizeshNQ4ISI;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i8 = 0; i8 < length2; i8++) {
                        bArr4[i8] = (byte) (bArr3[i8] ^ (-2689713159175858216L));
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    i = 1;
                    z = true;
                } else {
                    i = 1;
                    z = false;
                }
                meVar.f2645 = i;
                while (meVar.f2645 < i6) {
                    if (z) {
                        byte[] bArr5 = getInputSizeshNQ4ISI;
                        meVar.f2647 = meVar.f2647 - 1;
                        meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r5] ^ (-2689713159175858216L))) + doubleTapTimeout)) ^ b));
                    } else {
                        short[] sArr = getInputFormats;
                        meVar.f2647 = meVar.f2647 - 1;
                        meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r5] ^ (-2689713159175858216L))) + doubleTapTimeout)) ^ b));
                    }
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    meVar.f2645++;
                }
            }
            java.lang.String obj = sb.toString();
            java.lang.String str = obj;
            this.isOutputSupportedForhNQ4ISI = (long) (((java.security.SecureRandom) java.lang.Class.forName(obj).getDeclaredConstructor(null).newInstance(null)).nextDouble() * 9.9999E9d);
            i2 = getOutputSizeshNQ4ISI + 41;
            getOutputStallDuration = i2 % 128;
            if (i2 % 2 != 0) {
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        int i9 = (getOutputStallDuration + 7) % 128;
        getOutputSizeshNQ4ISI = i9;
        getOutputStallDuration = (i9 + 35) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25753(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i = (getOutputSizeshNQ4ISI + 115) % 128;
        getOutputStallDuration = i;
        this.toString = str2;
        this.getValidOutputFormatsForInputhNQ4ISI = str;
        this.unwrapAs = str3;
        int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25754() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDuration = (getOutputSizeshNQ4ISI + 119) % 128;
        util.h.xy.by.ma.f1067.m25798();
        getOutputStallDuration = (getOutputSizeshNQ4ISI + 35) % 128;
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˎ */
    protected java.util.Map<java.lang.String, java.lang.String> mo25690() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, util.h.xy.ck.rc {
        long j;
        int i = getOutputSizeshNQ4ISI + 59;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            super.mo25690();
            throw new java.lang.ArithmeticException();
        }
        java.util.Map<java.lang.String, java.lang.String> mo25690 = super.mo25690();
        java.lang.String str = this.unwrapAs;
        if (str == null || str.isEmpty()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ﳕ㪼\u193f㰡蚐櫟쬸ਦ곎⼎㋒汽⍠㔀", 14 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr);
            mo25690.put(((java.lang.String) objArr[0]).intern(), this.getValidOutputFormatsForInputhNQ4ISI);
            getOutputStallDuration = (getOutputSizeshNQ4ISI + 101) % 128;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\uef0e黪鉯器姺㍞毃栊⍠㔀", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, objArr2);
            mo25690.put(((java.lang.String) objArr2[0]).intern(), this.unwrapAs);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ﳕ㪼\u193f㰡蚐櫟쬸ਦ곎⼎㋒汽⍠㔀", 14 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
            java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u0000", android.graphics.Color.alpha(0) + 1, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + kotlin.text.Typography.pound, false, objArr4);
            mo25690.put(intern, ((java.lang.String) objArr4[0]).intern());
            getOutputSizeshNQ4ISI = (getOutputStallDuration + 17) % 128;
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\f￥\b￼\n\u0004", 6 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 5 - android.view.View.MeasureSpec.getSize(0), 268 - android.graphics.Color.argb(0, 0, 0, 0), true, objArr5);
        java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
        int i2 = getOutputSizeshNQ4ISI + 97;
        getOutputStallDuration = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.by.ma.f1067.m25803(java.lang.Long.toString(this.isOutputSupportedForhNQ4ISI).getBytes());
            j = this.isOutputSupportedForhNQ4ISI;
            this.isOutputSupportedForhNQ4ISI = j;
        } else {
            util.h.xy.by.ma.f1067.m25803(java.lang.Long.toString(this.isOutputSupportedForhNQ4ISI).getBytes());
            j = this.isOutputSupportedForhNQ4ISI;
            this.isOutputSupportedForhNQ4ISI = 1 + j;
        }
        mo25690.put(intern2, java.lang.Long.toString(j));
        if (this.toString != null) {
            getOutputSizeshNQ4ISI = (getOutputStallDuration + 73) % 128;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("讞奈\uf7ab螄\uddbc\ue4f8\uf6ea가勩馠\u0a46ꡠ讑윮랲弲ￔĒ\uee91㯚", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, objArr6);
            mo25690.put(((java.lang.String) objArr6[0]).intern(), this.toString);
        }
        return mo25690;
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˏ */
    protected com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> mo25691(util.h.xy.bv.rb rbVar) {
        java.lang.String[] strArr;
        util.h.xy.bv.me meVar = new util.h.xy.bv.me(rbVar.m25751());
        java.util.Map<java.lang.String, java.lang.String> m25747 = rbVar.m25747();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\n￼\t\r￼\tￚ\u0006\u0004\u0004\ufff8\u0005\ufffb", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, android.text.TextUtils.getTrimmedLength("") + 13, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, false, objArr);
        java.lang.String str = m25747.get(((java.lang.String) objArr[0]).intern());
        java.util.Map<java.lang.String, java.lang.String> m257472 = rbVar.m25747();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ꦲ\uf362㵧扅椤군\ue823\u0c5c\uef16뎄\ue721괲쑉惴", android.text.TextUtils.getOffsetAfter("", 0) + 14, objArr2);
        boolean parseBoolean = java.lang.Boolean.parseBoolean(m257472.get(((java.lang.String) objArr2[0]).intern()));
        java.util.Map<java.lang.String, java.lang.String> m257473 = rbVar.m25747();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䤁ꝴ킽뺕\u0adcʉ瀴\uef39\uf3e4䁂", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 10, objArr3);
        java.lang.String str2 = m257473.get(((java.lang.String) objArr3[0]).intern());
        java.util.Map<java.lang.String, java.lang.String> m257474 = rbVar.m25747();
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\r\n�\r\ufffe￣\b\uffff\u0005\t￮", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 11, android.text.TextUtils.getOffsetAfter("", 0) + 3, android.text.TextUtils.getOffsetBefore("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, true, objArr4);
            java.lang.String str3 = m257474.get(((java.lang.String) objArr4[0]).intern());
            if (str3 != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(str3.trim());
                    strArr = new java.lang.String[jSONArray.length()];
                    getOutputStallDuration = (getOutputSizeshNQ4ISI + 65) % 128;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            strArr[i] = jSONArray.getString(i);
                        } catch (org.json.JSONException unused) {
                        }
                    }
                    getOutputStallDuration = (getOutputSizeshNQ4ISI + 101) % 128;
                } catch (org.json.JSONException unused2) {
                }
                meVar.m25719(str);
                meVar.m25720(strArr);
                meVar.m25715(str2);
                meVar.m25717(parseBoolean);
                meVar.m25744(rbVar.m25745());
                meVar.m25748(rbVar.m25742());
                meVar.m25743(rbVar.m25749());
                util.h.xy.an.ra raVar = new util.h.xy.an.ra(meVar, true, null);
                getOutputStallDuration = (getOutputSizeshNQ4ISI + 51) % 128;
                return raVar;
            }
            strArr = null;
            meVar.m25719(str);
            meVar.m25720(strArr);
            meVar.m25715(str2);
            meVar.m25717(parseBoolean);
            meVar.m25744(rbVar.m25745());
            meVar.m25748(rbVar.m25742());
            meVar.m25743(rbVar.m25749());
            util.h.xy.an.ra raVar2 = new util.h.xy.an.ra(meVar, true, null);
            getOutputStallDuration = (getOutputSizeshNQ4ISI + 51) % 128;
            return raVar2;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = -256467775;
        getOutputMinFrameDuration = -408873030;
        getOutputFormats = 1181548772;
        getInputSizeshNQ4ISI = new byte[]{-26, 19, -18, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ETB, -11, -21, -27, 10, -26, 10, kotlin.io.encoding.Base64.padSymbol, -83, com.google.common.base.Ascii.GS, 19, -17, -27, 10, -26, -22, 93, -43, -13, 13, -17, -40};
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighResolutionOutputSizeshNQ4ISI = -1231763915;
        getOutputMinFrameDurationlomOqCM = (char) 37067;
        getHighSpeedVideoSizes = (char) 12325;
        getOutputStallDurationlomOqCM = (char) 312;
        getHighSpeedVideoFpsRanges = (char) 52134;
    }
}
