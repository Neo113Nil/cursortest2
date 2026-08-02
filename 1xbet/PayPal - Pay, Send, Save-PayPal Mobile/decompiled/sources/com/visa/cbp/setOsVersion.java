package com.visa.cbp;

/* loaded from: classes5.dex */
public class setOsVersion {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int Camera2StreamConfigurationMap;
    private static char getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static char getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static char getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private final java.lang.String getInputFormats;
    private final int getOutputMinFrameDuration;
    private final java.lang.String getOutputMinFrameDurationlomOqCM;
    private final java.lang.String getOutputSizes;

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.Object[] objArr) {
        int i = b + 117;
        byte[] bArr = new byte[1];
        if ($$a == null) {
            i = -4;
        }
        bArr[0] = (byte) i;
        objArr[0] = new java.lang.String(bArr, 0);
    }

    public setOsVersion() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("쎚\ue790챂좧纱㡢", 6 - android.text.TextUtils.getTrimmedLength(""), objArr);
        this.getOutputMinFrameDurationlomOqCM = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ᱤ䀪간뱢寥䖻ꑘ\ue391짤\uec2a棻짵\udd57埏ﲳ席緭⮾ꢺ\uf8ad", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, objArr2);
        this.getInputFormats = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\uf300堋大\u2061庬ɦ\ue608\uda1d賥䪻", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 10, objArr3);
        this.getOutputSizes = ((java.lang.String) objArr3[0]).intern();
        this.getOutputMinFrameDuration = 11;
    }

    public java.lang.String valueOf(java.security.PublicKey publicKey, byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        byte[] decode = android.util.Base64.decode(str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), 11);
        byte[] decode2 = android.util.Base64.decode(str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), 11);
        byte[] BuildConfig = new com.visa.cbp.setDeviceType(decode, decode2, java.nio.ByteBuffer.allocate(4).putInt(1152).array()).BuildConfig();
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) publicKey;
        byte[] byteArray = eCPublicKey.getW().getAffineX().toByteArray();
        byte[] byteArray2 = eCPublicKey.getW().getAffineY().toByteArray();
        java.lang.String obj = com.nimbusds.jose.util.Base64URL.encode(byteArray).toString();
        java.lang.String obj2 = com.nimbusds.jose.util.Base64URL.encode(byteArray2).toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        java.lang.String obj3 = sb.toString();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("쎚\ue790챂좧纱㡢", android.os.Process.getGidForName("") + 7, objArr);
        byte[] bytes = ((java.lang.String) objArr[0]).intern().getBytes(java.nio.charset.StandardCharsets.UTF_8);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ᱤ䀪간뱢寥䖻ꑘ\ue391짤\uec2a棻짵\udd57埏ﲳ席緭⮾ꢺ\uf8ad", 20 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr2);
        byte[] BuildConfig2 = new com.visa.cbp.setDeviceType(bytes, ((java.lang.String) objArr2[0]).intern().getBytes(java.nio.charset.StandardCharsets.UTF_8), str.getBytes(java.nio.charset.StandardCharsets.UTF_8), decode2, obj3.getBytes(java.nio.charset.StandardCharsets.UTF_8), BuildConfig).BuildConfig();
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\uf300堋大\u2061庬ɦ\ue608\uda1d賥䪻", 10 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(((java.lang.String) objArr3[0]).intern());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\uf300堋大\u2061庬ɦ\ue608\uda1d賥䪻", 9 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr4);
            mac.init(new javax.crypto.spec.SecretKeySpec(bArr, ((java.lang.String) objArr4[0]).intern()));
            java.lang.String obj4 = com.nimbusds.jose.util.Base64URL.encode(mac.doFinal(BuildConfig2)).toString();
            int i = getHighSpeedVideoFpsRangesFor + 67;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                return obj4;
            }
            throw null;
        } catch (java.lang.IllegalArgumentException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException unused) {
            throw new com.visa.cbp.sdk.facade.exception.CorruptedMacDataException();
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        com.visa.cbp.setSignature setsignature = new com.visa.cbp.setSignature();
        char[] cArr = new char[charArray.length];
        setsignature.ConfirmReplenishRequest = 0;
        char[] cArr2 = new char[2];
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 45) % 128;
        while (setsignature.ConfirmReplenishRequest < charArray.length) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 95) % 128;
            cArr2[0] = charArray[setsignature.ConfirmReplenishRequest];
            cArr2[1] = charArray[setsignature.ConfirmReplenishRequest + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getOutputFormats ^ 7012782929194310790L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getInputSizeshNQ4ISI)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1957494866);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.KeyEvent.getDeadChar(0, 0) + 3290), 430 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 44 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((byte) 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1957494866, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 7012782929194310790L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getHighSpeedVideoSizes)};
                        int i5 = charValue + i2;
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1957494866);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.getTrimmedLength("") + 3290), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 429, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((byte) 1, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1957494866, obj2);
                        }
                        cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i2 -= 40503;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[setsignature.ConfirmReplenishRequest] = cArr2[0];
            cArr[setsignature.ConfirmReplenishRequest + 1] = cArr2[1];
            try {
                java.lang.Object[] objArr6 = {setsignature, setsignature};
                java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1837204720);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 58033), android.text.TextUtils.indexOf("", "", 0) + 1676, 24 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) 0, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1837204720, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        $$a = new byte[]{58, -63, 121, -14};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
    }

    public static char h(int i, int i2) {
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(894413753);
            if (obj == null) {
                obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (30832 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1971 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.view.KeyEvent.getDeadChar(0, 0) + 29)).getMethod(com.visa.cbp.getEncExpo.warmup, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(894413753, obj);
            }
            return ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr)).charValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = 0;
        getHighSpeedVideoFpsRanges = 1;
        getHighSpeedVideoSizesFor = 0;
        getHighSpeedVideoFpsRangesFor = 1;
        getHighSpeedVideoSizes = (char) 42689;
        getInputSizeshNQ4ISI = (char) 57131;
        getHighResolutionOutputSizeshNQ4ISI = (char) 55131;
        getOutputFormats = (char) 50155;
    }
}
