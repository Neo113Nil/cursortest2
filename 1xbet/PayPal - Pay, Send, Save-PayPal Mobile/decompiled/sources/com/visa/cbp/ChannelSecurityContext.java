package com.visa.cbp;

/* loaded from: classes16.dex */
class ChannelSecurityContext {
    private static int Camera2StreamConfigurationMap;
    public static final int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    public static final byte[] getHighSpeedVideoSizes = null;
    private static char getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static char[] getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static char getOutputStallDuration;
    private static char getOutputStallDurationlomOqCM;
    private final java.lang.String ArtificialStackFrames;
    private final java.lang.String CoroutineDebuggingKt;
    private final java.lang.String coroutineBoundary;
    private final java.lang.String getOutputMinFrameDurationlomOqCM;
    private com.visa.cbp.setMaxPmts getOutputSizes;
    private final java.lang.String getOutputSizeshNQ4ISI;
    private com.visa.cbp.setWidth getValidOutputFormatsForInputhNQ4ISI;
    private java.lang.String isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    private com.visa.cbp.getSc toString;
    private com.visa.cbp.sdk.facade.data.CvmMode unwrapAs;

    private static void getHighSpeedVideoFpsRangesFor(short s, java.lang.Object[] objArr) {
        int i = s + 97;
        byte[] bArr = new byte[1];
        if (getHighSpeedVideoSizes == null) {
            i = s + 100;
        }
        bArr[0] = (byte) i;
        objArr[0] = new java.lang.String(bArr, 0);
    }

    static {
        getHighSpeedVideoFpsRanges();
        Camera2StreamConfigurationMap = 0;
        getHighSpeedVideoFpsRangesFor = 1;
        getHighSpeedVideoFpsRanges = 0;
        getOutputMinFrameDuration = 1;
        Camera2StreamConfigurationMap();
        getInputFormats = "ChannelSecurityContext";
        int i = getOutputMinFrameDuration + 119;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    ChannelSecurityContext(com.visa.cbp.getSc getsc, com.visa.cbp.setMaxPmts setmaxpmts, com.visa.cbp.setWidth setwidth, java.lang.String str, boolean z, com.visa.cbp.sdk.facade.data.CvmMode cvmMode) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("螭߭蛿쏪", 5 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        this.CoroutineDebuggingKt = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("㋇钙蛿쏪", 5 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
        this.getOutputSizeshNQ4ISI = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("퀒虖嘒Ꙛ텕ῥ垠⢻ꘗߦ\u2fe9蛎川칚", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, objArr3);
        this.coroutineBoundary = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("茓闸Ｋ矢\ufde3ꄋ텕ῥط嶧\uf1dcற잊흊̩듾䘞ԗ\ue48cᐂ娙Ẽ\ue48cᐂ厞艁퉈╎\ufde3ꄋ퀒虖\uf418蜥\uecf1\ue4ee䢷䆭川칚", 40 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
        this.getOutputMinFrameDurationlomOqCM = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("垠⢻舭㽠⮣쪜曃驊⮣쪜ᄏ全\ue61d囷", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 14, objArr5);
        this.ArtificialStackFrames = ((java.lang.String) objArr5[0]).intern();
        this.toString = getsc;
        this.getOutputSizes = setmaxpmts;
        this.getValidOutputFormatsForInputhNQ4ISI = setwidth;
        this.isOutputSupportedFor = str;
        this.isOutputSupportedForhNQ4ISI = z;
        this.unwrapAs = cvmMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x06b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0640  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    java.lang.String getHighSpeedVideoFpsRangesFor(android.content.Context context, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.security.PublicKey publicKey, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        android.content.Context context2;
        byte[] bArr;
        int i;
        java.lang.String svcCode;
        char c;
        java.lang.String intern;
        java.lang.String intern2;
        int i2;
        byte b;
        byte[] ReplenishAckRequest;
        byte[] highSpeedVideoFpsRanges;
        com.visa.cbp.getDeviceType ConfirmReplenishRequest;
        com.visa.cbp.ChannelSecurityContext channelSecurityContext = this;
        com.visa.cbp.getPaymentInstrument getpaymentinstrument = new com.visa.cbp.getPaymentInstrument();
        com.visa.cbp.setPaymentInstrument setpaymentinstrument = new com.visa.cbp.setPaymentInstrument();
        com.visa.cbp.getVPanEnrollmentID getvpanenrollmentid = new com.visa.cbp.getVPanEnrollmentID();
        com.visa.cbp.getEncryptionScheme getencryptionscheme = new com.visa.cbp.getEncryptionScheme();
        if (tokenKey != null) {
            int i3 = getOutputMinFrameDuration + 95;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0 ? tokenKey.getTokenId() > 0 : tokenKey.getTokenId() > 0) {
                if (channelSecurityContext.toString.getTvls(tokenKey) != null) {
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 49) % 128;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("﨣㧠嚖ꗁꏲ㽇䵦Ḕ铚\uf031ົ銌", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, objArr);
                    android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService(((java.lang.String) objArr[0]).intern())).getActiveNetworkInfo();
                    com.visa.cbp.setDeviceId BuildConfig = channelSecurityContext.toString.BuildConfig(tokenKey);
                    com.visa.cbp.sdk.j.b.d.C0206 tvls = channelSecurityContext.toString.getTvls(context, tokenKey);
                    com.visa.cbp.Content valueOf = channelSecurityContext.toString.valueOf(tokenKey, com.visa.cbp.getCertFormat.ReplenishAckRequest() == null ? 0 : 1);
                    java.lang.String str = channelSecurityContext.isOutputSupportedFor;
                    if (str != null) {
                        int i4 = getOutputMinFrameDuration + 31;
                        getHighSpeedVideoFpsRanges = i4 % 128;
                        if (i4 % 2 != 0) {
                            com.visa.cbp.sdk.facade.data.TokenStatus.ACTIVE.getValue();
                            throw null;
                        }
                        if (str.equalsIgnoreCase(com.visa.cbp.sdk.facade.data.TokenStatus.ACTIVE.getValue())) {
                            if (BuildConfig.getSignature().getQrConsumerDeviceData() != null) {
                                java.util.List<com.visa.cbp.external.common.AidInfo> aidInfo = BuildConfig.getSignature().getAidInfo();
                                if (aidInfo != null && aidInfo.size() > 0) {
                                    com.visa.cbp.external.common.AidInfo aidInfo2 = aidInfo.get(0);
                                    if (aidInfo2.getAid() != null && aidInfo2.getAid().length() > 0) {
                                        aidInfo2.getAid();
                                        BuildConfig.getSignature();
                                        try {
                                        } catch (com.google.gson.JsonSyntaxException unused) {
                                            i = 0;
                                        }
                                        try {
                                            com.visa.cbp.sdk.facade.data.Token token = (com.visa.cbp.sdk.facade.data.Token) new com.google.gson.Gson().fromJson(new java.lang.String(channelSecurityContext.getValidOutputFormatsForInputhNQ4ISI.BuildConfig(context, valueOf.ConfirmReplenishRequest(), com.visa.cbp.getLocale.ConfirmReplenishRequest)), com.visa.cbp.sdk.facade.data.Token.class);
                                            java.lang.Long serverTimeStamp = com.visa.cbp.sdk.facade.DASServiceManager.getServerTimeStamp();
                                            java.lang.String str2 = getInputFormats;
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(false, new int[]{0, 16, 193, 9}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001", objArr2);
                                            sb.append(((java.lang.String) objArr2[0]).intern());
                                            sb.append(serverTimeStamp);
                                            com.visa.cbp.setVtsCerts.getTvls(str2, sb.toString());
                                            java.lang.Long etwrtu = com.visa.cbp.sdk.facade.DASServiceManager.getETWRTU();
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges("\ued52\uf5ea氊䞁͈\ude4eꂜ鬧", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, objArr3);
                                            sb2.append(((java.lang.String) objArr3[0]).intern());
                                            sb2.append(etwrtu);
                                            com.visa.cbp.setVtsCerts.getTvls(str2, sb2.toString());
                                            java.lang.Long valueOf2 = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
                                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(true, new int[]{16, 14, 41, 0}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr4);
                                            sb3.append(((java.lang.String) objArr4[0]).intern());
                                            sb3.append(valueOf2);
                                            com.visa.cbp.setVtsCerts.getTvls(str2, sb3.toString());
                                            java.lang.String l = java.lang.Long.toString((serverTimeStamp.longValue() + valueOf2.longValue()) - etwrtu.longValue());
                                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges("Ⓠ⫎ꂜ鬧", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr5);
                                            sb4.append(((java.lang.String) objArr5[0]).intern());
                                            sb4.append(l);
                                            com.visa.cbp.setVtsCerts.getTvls(str2, sb4.toString());
                                            java.lang.Long valueOf3 = java.lang.Long.valueOf(java.lang.Long.parseLong(l) / 1000);
                                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges("Ⓠ⫎䛼별\ufb0c\uf64c㻧쳨ᔝꐀ़捼﨣㧠핺䈉⻓\uee4d川칚", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 19, objArr6);
                                            sb5.append(((java.lang.String) objArr6[0]).intern());
                                            sb5.append(valueOf3);
                                            com.visa.cbp.setVtsCerts.getTvls(str2, sb5.toString());
                                            java.lang.String hexString = java.lang.Long.toHexString(valueOf3.longValue());
                                            if (hexString.length() < 8) {
                                                hexString = channelSecurityContext.getHighResolutionOutputSizeshNQ4ISI(hexString);
                                            }
                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges("Ⓠ⫎䛼별\ufb0c\uf64c打䪣腷ﻬ川칚", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, objArr7);
                                            sb6.append(((java.lang.String) objArr7[0]).intern());
                                            sb6.append(hexString);
                                            com.visa.cbp.setVtsCerts.getTvls(str2, sb6.toString());
                                            java.lang.String token2 = token.getToken();
                                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                            sb7.append(BuildConfig.getTvls().getYear().substring(2, 4));
                                            sb7.append(BuildConfig.getTvls().getMonth());
                                            java.lang.String obj = sb7.toString();
                                            if (BuildConfig.getSignature().getTrack2DataNotDec() != null) {
                                                svcCode = BuildConfig.getSignature().getTrack2DataNotDec().getSvcCode();
                                                intern = BuildConfig.getSignature().getTrack2DataNotDec().getPinVerField();
                                                intern2 = BuildConfig.getSignature().getTrack2DataNotDec().getTrack2DiscData();
                                                c = 0;
                                            } else {
                                                svcCode = BuildConfig.getSignature().getTrack2DataDec().getSvcCode();
                                                c = 0;
                                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges("神栵神栵峟ꔤ", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6, objArr8);
                                                intern = ((java.lang.String) objArr8[0]).intern();
                                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                Camera2StreamConfigurationMap(false, new int[]{64, 8, 199, 1}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000", objArr9);
                                                intern2 = ((java.lang.String) objArr9[0]).intern();
                                                android.text.TextUtils.indexOf("", "", 0, 0);
                                            }
                                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                            sb8.append(token2);
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges("ⴀ俐", 1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr10);
                                            sb8.append(((java.lang.String) objArr10[c]).intern());
                                            sb8.append(obj);
                                            sb8.append(svcCode);
                                            sb8.append(intern);
                                            sb8.append(intern2);
                                            java.lang.String obj2 = sb8.toString();
                                            if (obj2.length() % 2 != 0) {
                                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                                                sb9.append(obj2);
                                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges("䚚䨠", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr11);
                                                sb9.append(((java.lang.String) objArr11[0]).intern());
                                                obj2 = sb9.toString();
                                            }
                                            int intValue = tvls.m23151().intValue();
                                            if (intValue >= 65535) {
                                                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getAdditionalProperties);
                                            }
                                            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 75) % 128;
                                            int i5 = intValue + 1;
                                            if (i5 >= 65535 || i5 <= 0) {
                                                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getAdditionalProperties);
                                            }
                                            java.util.Locale locale = java.util.Locale.US;
                                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges("\ueeefꖬ톮낸", 4 - android.text.TextUtils.indexOf("", ""), objArr12);
                                            java.lang.String format = java.lang.String.format(locale, ((java.lang.String) objArr12[0]).intern(), java.lang.Integer.valueOf(i5));
                                            android.graphics.Color.blue(0);
                                            new com.google.gson.Gson().toJson(BuildConfig);
                                            setpaymentinstrument.values(BuildConfig.getSignature().getAidInfo().get(0).getAid());
                                            java.lang.String ffi = BuildConfig.getSignature().getAidInfo().get(0).getQVSDCData().getFfi();
                                            if (ffi != null) {
                                                setpaymentinstrument.valueOf(ffi);
                                            } else {
                                                setpaymentinstrument.valueOf("");
                                            }
                                            java.lang.String ced = BuildConfig.getSignature().getQrConsumerDeviceData().getCed();
                                            if (ced != null) {
                                                int i6 = getOutputMinFrameDuration + 111;
                                                getHighSpeedVideoFpsRanges = i6 % 128;
                                                if (i6 % 2 != 0) {
                                                    setpaymentinstrument.ReplenishAckRequest(ced);
                                                    throw null;
                                                }
                                                setpaymentinstrument.ReplenishAckRequest(ced);
                                            } else {
                                                setpaymentinstrument.ReplenishAckRequest("");
                                            }
                                            getpaymentinstrument.ConfirmReplenishRequest(setpaymentinstrument);
                                            getencryptionscheme.ConfirmReplenishRequest(obj2);
                                            java.lang.String aip = BuildConfig.getSignature().getQrConsumerDeviceData().getAip();
                                            getencryptionscheme.ReplenishAckRequest(aip);
                                            android.media.AudioTrack.getMinVolume();
                                            java.lang.String cvn = BuildConfig.getSignature().getQrConsumerDeviceData().getCvn();
                                            java.lang.String tokenInfo = BuildConfig.setTokenInfo();
                                            if (tokenInfo.length() == 1) {
                                                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                                                i2 = i5;
                                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                Camera2StreamConfigurationMap(false, new int[]{100, 1, 0, 1}, "\u0000", objArr13);
                                                sb10.append(((java.lang.String) objArr13[0]).intern());
                                                sb10.append(tokenInfo);
                                                tokenInfo = sb10.toString();
                                            } else {
                                                i2 = i5;
                                            }
                                            byte[] bArr2 = new byte[6];
                                            if (channelSecurityContext.isOutputSupportedForhNQ4ISI) {
                                                byte value = channelSecurityContext.unwrapAs.getVerifyingEntity().getValue();
                                                b = 0;
                                                bArr2[0] = value;
                                                bArr2[0] = (byte) (value | channelSecurityContext.unwrapAs.getVerifyingType().getValue());
                                            } else {
                                                b = 0;
                                                bArr2[0] = 0;
                                            }
                                            bArr2[1] = b;
                                            bArr2[2] = b;
                                            bArr2[3] = b;
                                            bArr2[4] = b;
                                            bArr2[5] = b;
                                            java.lang.String digitalWalletID = BuildConfig.getSignature().getQrConsumerDeviceData().getDigitalWalletID();
                                            java.lang.String m23156 = tvls.m23156();
                                            int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(b);
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges("神栵神栵神栵神栵神栵神栵神栵神栵神栵神栵神栵神栵神栵神栵神栵", 29 - bitsPerPixel, objArr14);
                                            java.lang.String intern3 = ((java.lang.String) objArr14[0]).intern();
                                            if (aidInfo2.getIssuerApplicationDiscretionaryData() != null) {
                                                int i7 = getOutputMinFrameDuration + 93;
                                                getHighSpeedVideoFpsRanges = i7 % 128;
                                                if (i7 % 2 == 0 ? aidInfo2.getIssuerApplicationDiscretionaryData().length() == 30 : aidInfo2.getIssuerApplicationDiscretionaryData().length() == 2) {
                                                    intern3 = aidInfo2.getIssuerApplicationDiscretionaryData();
                                                }
                                            }
                                            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(false, new int[]{101, 2, 62, 1}, "\u0000\u0001", objArr15);
                                            sb11.append(((java.lang.String) objArr15[0]).intern());
                                            sb11.append(cvn);
                                            sb11.append(tokenInfo);
                                            sb11.append(new java.lang.String(com.visa.cbp.external.common.Hex.encode(bArr2)));
                                            sb11.append(digitalWalletID);
                                            sb11.append(m23156);
                                            sb11.append(intern3);
                                            java.lang.String obj3 = sb11.toString();
                                            getencryptionscheme.valueOf(obj3);
                                            android.text.TextUtils.indexOf("", "");
                                            byte[] bArr3 = new byte[40];
                                            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.Utils.hexToByteArray(hexString), 0, bArr3, 0, 4);
                                            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.Utils.hexToByteArray(aip), 0, bArr3, 4, 2);
                                            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.Utils.hexToByteArray(format), 0, bArr3, 6, 2);
                                            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.Utils.hexToByteArray(obj3), 0, bArr3, 8, 32);
                                            byte[] valueOf4 = valueOf.valueOf();
                                            if (activeNetworkInfo != null) {
                                                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 47) % 128;
                                                if (com.visa.cbp.getCertFormat.ConfirmReplenishRequest() != null) {
                                                    channelSecurityContext = this;
                                                    context2 = context;
                                                    ConfirmReplenishRequest = com.visa.cbp.getCertFormat.ConfirmReplenishRequest();
                                                    if (ConfirmReplenishRequest != null) {
                                                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setContentType, com.visa.cbp.sdk.facade.error.ReasonCode.SESSION_ERROR);
                                                    }
                                                    getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 103) % 128;
                                                    byte[] values = ConfirmReplenishRequest.values();
                                                    byte[] ReplenishAckRequest2 = com.visa.cbp.getCertFormat.ReplenishAckRequest();
                                                    if (ReplenishAckRequest2 == null || ReplenishAckRequest2.length <= 0) {
                                                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setContentType, com.visa.cbp.sdk.facade.error.ReasonCode.SESSION_ERROR);
                                                    }
                                                    ReplenishAckRequest = channelSecurityContext.getValidOutputFormatsForInputhNQ4ISI.valueOf(context, valueOf4, bArr3, values, ReplenishAckRequest2);
                                                    getencryptionscheme.BuildConfig(new java.lang.String(com.visa.cbp.external.common.Hex.encode(ReplenishAckRequest)));
                                                    android.view.ViewConfiguration.getScrollDefaultDelay();
                                                    com.visa.cbp.external.common.Hex.encode(bArr3);
                                                    android.os.SystemClock.elapsedRealtime();
                                                    com.visa.cbp.external.common.Hex.encode(ReplenishAckRequest);
                                                    getencryptionscheme.values(format);
                                                    getencryptionscheme.setTvls(hexString);
                                                    if (BuildConfig.getTokenInfo() != null) {
                                                        int i8 = getHighSpeedVideoFpsRanges + 121;
                                                        getOutputMinFrameDuration = i8 % 128;
                                                        if (i8 % 2 == 0) {
                                                            getencryptionscheme.ReplenishRequest(com.visa.cbp.sdk.facade.util.MiscUtils.asciiToHex(BuildConfig.getTokenInfo()));
                                                            throw new java.lang.ArithmeticException();
                                                        }
                                                        getencryptionscheme.ReplenishRequest(com.visa.cbp.sdk.facade.util.MiscUtils.asciiToHex(BuildConfig.getTokenInfo()));
                                                    }
                                                    getpaymentinstrument.ReplenishAckRequest(getencryptionscheme);
                                                    if (aidInfo != null && aidInfo.size() > 1) {
                                                        aidInfo.get(1);
                                                        getvpanenrollmentid.valueOf(BuildConfig.getSignature().getAidInfo().get(1).getAid());
                                                        getpaymentinstrument.values(getvpanenrollmentid);
                                                    }
                                                    channelSecurityContext.toString.BuildConfig(context2, tokenKey, i2);
                                                    channelSecurityContext.toString.valueOf(context2, tokenKey);
                                                    com.visa.cbp.setEncCert.values = (byte) 9;
                                                    com.visa.cbp.setEncCert.ReplenishAckRequest = (byte) 8;
                                                    highSpeedVideoFpsRanges = new com.visa.cbp.getFirstName().getHighSpeedVideoFpsRanges(getpaymentinstrument);
                                                    if (highSpeedVideoFpsRanges != null) {
                                                        bArr = com.visa.cbp.external.common.Base64.encode(highSpeedVideoFpsRanges);
                                                        if (bArr != null) {
                                                            return null;
                                                        }
                                                        try {
                                                            return channelSecurityContext.Camera2StreamConfigurationMap(context2, sQLiteDatabase, publicKey, bArr);
                                                        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
                                                            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getForegroundColor, e.getMessage());
                                                        }
                                                    }
                                                }
                                            }
                                            channelSecurityContext = this;
                                            if (channelSecurityContext.getOutputSizes.getMac()) {
                                                context2 = context;
                                                ReplenishAckRequest = channelSecurityContext.getValidOutputFormatsForInputhNQ4ISI.ReplenishAckRequest(context2, valueOf4, bArr3);
                                                getencryptionscheme.BuildConfig(new java.lang.String(com.visa.cbp.external.common.Hex.encode(ReplenishAckRequest)));
                                                android.view.ViewConfiguration.getScrollDefaultDelay();
                                                com.visa.cbp.external.common.Hex.encode(bArr3);
                                                android.os.SystemClock.elapsedRealtime();
                                                com.visa.cbp.external.common.Hex.encode(ReplenishAckRequest);
                                                getencryptionscheme.values(format);
                                                getencryptionscheme.setTvls(hexString);
                                                if (BuildConfig.getTokenInfo() != null) {
                                                }
                                                getpaymentinstrument.ReplenishAckRequest(getencryptionscheme);
                                                if (aidInfo != null) {
                                                    aidInfo.get(1);
                                                    getvpanenrollmentid.valueOf(BuildConfig.getSignature().getAidInfo().get(1).getAid());
                                                    getpaymentinstrument.values(getvpanenrollmentid);
                                                }
                                                channelSecurityContext.toString.BuildConfig(context2, tokenKey, i2);
                                                channelSecurityContext.toString.valueOf(context2, tokenKey);
                                                com.visa.cbp.setEncCert.values = (byte) 9;
                                                com.visa.cbp.setEncCert.ReplenishAckRequest = (byte) 8;
                                                highSpeedVideoFpsRanges = new com.visa.cbp.getFirstName().getHighSpeedVideoFpsRanges(getpaymentinstrument);
                                                if (highSpeedVideoFpsRanges != null) {
                                                }
                                            }
                                            context2 = context;
                                            ConfirmReplenishRequest = com.visa.cbp.getCertFormat.ConfirmReplenishRequest();
                                            if (ConfirmReplenishRequest != null) {
                                            }
                                        } catch (com.google.gson.JsonSyntaxException unused2) {
                                            i = 0;
                                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges("ᱧ\u0b53誜必ꮳ\uf2a5\u200b\uf754쌷著뻣奨ꂄꇍ䵱뚚\u0ba1濜\uf6c0퓤稵姀峨\ue66a\ufb0c\uf64c큩ɟ屫⚜﨣㧠\uf0af绮\uee76ᕶ쫳␄皿꽳舭㽠筨\uf01a\u18fc㸚ઐ䟎⚺잒瑩ौ\u2fe9蛎\ue0e9爯皿꽳큩ɟ\ufde3ꄋ쪦퍳䙒攖꾩翯ఠ뵬\udca2ㄿ屫⚜\ufde3ꄋ쪦퍳䙒攖꾩翯疼ଆ鐲\uec3e峨\ue66a阐阈ᔝꐀ轺혏䵦Ḕ\uf27e\ue1db", 98 - android.graphics.Color.alpha(i), objArr16);
                                            throw new com.visa.cbp.sdk.facade.exception.SDKUnrecoverableException(((java.lang.String) objArr16[i]).intern());
                                        }
                                    }
                                }
                                context2 = context;
                            } else {
                                context2 = context;
                                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 7) % 128;
                            }
                            bArr = null;
                            if (bArr != null) {
                            }
                        }
                    }
                    throw new com.visa.cbp.sdk.facade.exception.InvalidTokenStateException(com.visa.cbp.setDeviceCerts.setIssuerDiscretionaryData);
                }
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.TokenKeyInvalidException(com.visa.cbp.setDeviceCerts.getCap);
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 119) % 128;
        int i = 0;
        while (i < 8 - str.length()) {
            sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            i++;
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 103) % 128;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(sb.toString());
        sb2.append(str);
        return sb2.toString();
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.String obj;
        java.lang.Object obj2;
        int i = getOutputMinFrameDuration + 53;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            obj = java.util.UUID.randomUUID().toString();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 1, 147, 1}, "\u0000", objArr);
            obj2 = objArr[0];
        } else {
            obj = java.util.UUID.randomUUID().toString();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 1, 147, 1}, "\u0000", objArr2);
            obj2 = objArr2[0];
        }
        return obj.replace(((java.lang.String) obj2).intern(), "");
    }

    private java.lang.String Camera2StreamConfigurationMap(android.content.Context context, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.security.PublicKey publicKey, byte[] bArr) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException {
        com.visa.cbp.getHeight getheight = new com.visa.cbp.getHeight();
        try {
            java.security.KeyPair values = getheight.values();
            java.security.PublicKey publicKey2 = values.getPublic();
            java.security.PrivateKey privateKey = values.getPrivate();
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 61) % 128;
            java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("螭߭蛿쏪", 5 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(highResolutionOutputSizeshNQ4ISI);
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㋇钙蛿쏪", android.text.TextUtils.indexOf("", "", 0, 0) + 4, objArr2);
            sb2.append(((java.lang.String) objArr2[0]).intern());
            sb2.append(highResolutionOutputSizeshNQ4ISI);
            java.lang.String obj2 = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("퀒虖嘒Ꙛ텕ῥ垠⢻ꘗߦ\u2fe9蛎川칚", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12, objArr3);
            sb3.append(((java.lang.String) objArr3[0]).intern());
            sb3.append(obj);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("萫⏧", 1 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr4);
            sb3.append(((java.lang.String) objArr4[0]).intern());
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("茓闸Ｋ矢\ufde3ꄋ텕ῥط嶧\uf1dcற잊흊̩듾䘞ԗ\ue48cᐂ娙Ẽ\ue48cᐂ厞艁퉈╎\ufde3ꄋ퀒虖\uf418蜥\uecf1\ue4ee䢷䆭川칚", 38 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr5);
            sb3.append(((java.lang.String) objArr5[0]).intern());
            sb3.append(obj2);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("垠⢻舭㽠⮣쪜曃驊⮣쪜ᄏ全\ue61d囷", 14 - android.graphics.Color.green(0), objArr6);
            sb3.append(((java.lang.String) objArr6[0]).intern());
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(true, new int[]{140, 2, 0, 2}, "\u0001\u0000", objArr7);
            sb3.append(((java.lang.String) objArr7[0]).intern());
            sQLiteDatabase.execSQL(sb3.toString());
            byte[] BuildConfig = getheight.BuildConfig(context, bArr, publicKey, privateKey);
            if (BuildConfig != null) {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put(obj2, new java.lang.String(com.visa.cbp.external.common.Base64.encode(BuildConfig)));
                sQLiteDatabase.insert(obj, null, contentValues);
                com.visa.cbp.external.common.Base64.encode(BuildConfig);
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(obj);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 1, 147, 1}, "\u0000", objArr8);
                sb4.append(((java.lang.String) objArr8[0]).intern());
                sb4.append(obj2);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 1, 147, 1}, "\u0000", objArr9);
                sb4.append(((java.lang.String) objArr9[0]).intern());
                return new java.lang.String(com.visa.cbp.external.common.Base64.encode(sb4.toString().concat(getheight.valueOf(publicKey2.getEncoded(), 0, publicKey2.getEncoded().length, "")).getBytes()));
            }
        } catch (java.security.NoSuchAlgorithmException unused) {
        }
        return null;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 11) % 128;
        char[] charArray = str.toCharArray();
        com.visa.cbp.setSignature setsignature = new com.visa.cbp.setSignature();
        char[] cArr = new char[charArray.length];
        setsignature.ConfirmReplenishRequest = 0;
        char[] cArr2 = new char[2];
        int i2 = getHighSpeedVideoFpsRangesFor + 9;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 4;
        }
        while (setsignature.ConfirmReplenishRequest < charArray.length) {
            int i4 = Camera2StreamConfigurationMap + 35;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                cArr2[0] = charArray[setsignature.ConfirmReplenishRequest];
                cArr2[1] = charArray[setsignature.ConfirmReplenishRequest];
            } else {
                cArr2[0] = charArray[setsignature.ConfirmReplenishRequest];
                cArr2[1] = charArray[setsignature.ConfirmReplenishRequest + 1];
            }
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (getOutputFormats ^ 7012782929194310790L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getOutputStallDuration)};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1957494866);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3290), android.widget.ExpandableListView.getPackedPositionChild(0L) + 431, 43 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((short) 21, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1957494866, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getOutputStallDurationlomOqCM ^ 7012782929194310790L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getHighSpeedVideoSizesFor)};
                        int i7 = charValue + i5;
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1957494866);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (3291 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 430 - (android.os.Process.myTid() >> 22), 42 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((short) 21, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1957494866, obj2);
                        }
                        cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i5 -= 40503;
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
                    java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (58033 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1675 - android.os.Process.getGidForName(""), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((short) 20, objArr7);
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

    private static void Camera2StreamConfigurationMap(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i;
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i2 + 51) % 128;
        getHighSpeedVideoFpsRangesFor = (i2 + 103) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        com.visa.cbp.ReplenishResponse replenishResponse = new com.visa.cbp.ReplenishResponse();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = 2;
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr2 = getInputSizeshNQ4ISI;
        if (cArr2 != null) {
            int i10 = getHighSpeedVideoFpsRangesFor + 73;
            Camera2StreamConfigurationMap = i10 % 128;
            if (i10 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            int i11 = i;
            while (i11 < length) {
                int i12 = getHighSpeedVideoFpsRangesFor + 13;
                Camera2StreamConfigurationMap = i12 % 128;
                if (i12 % i7 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i5];
                        objArr2[i3] = java.lang.Integer.valueOf(cArr2[i11]);
                        java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-586396651);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getOffsetAfter("", i3), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1700, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18);
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((short) 3, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[i3], java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-586396651, obj);
                        }
                        cArr[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[i11])};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-586396651);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - android.view.MotionEvent.axisFromString("")), android.text.TextUtils.indexOf("", "") + 1701, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 19);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((short) 3, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-586396651, obj2);
                        }
                        cArr[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i11++;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 0;
                i5 = 1;
                i7 = 2;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        java.lang.System.arraycopy(cArr2, i4, cArr3, 0, i6);
        if (bytes != null) {
            char[] cArr4 = new char[i6];
            replenishResponse.ConfirmReplenishRequest = 0;
            char c = 0;
            while (replenishResponse.ConfirmReplenishRequest < i6) {
                if (bytes[replenishResponse.ConfirmReplenishRequest] == 1) {
                    int i13 = getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    Camera2StreamConfigurationMap = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = replenishResponse.ConfirmReplenishRequest;
                        try {
                            java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-718164716);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.green(0), 1655 - android.os.Process.getGidForName(""), 20 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((short) 2, objArr7);
                                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-718164716, obj3);
                            }
                            cArr4[i14] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                            throw new java.lang.ArithmeticException();
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    int i15 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-718164716);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 1655 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 20 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((short) 2, objArr9);
                            obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-718164716, obj4);
                        }
                        cArr4[i15] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                    } catch (java.lang.Throwable th4) {
                        java.lang.Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                } else {
                    int i16 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1678831086);
                        if (obj5 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 21018), 346 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 32 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((short) 0, objArr11);
                            obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1678831086, obj5);
                        }
                        cArr4[i16] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr10)).charValue();
                    } catch (java.lang.Throwable th5) {
                        java.lang.Throwable cause5 = th5.getCause();
                        if (cause5 == null) {
                            throw th5;
                        }
                        throw cause5;
                    }
                }
                c = cArr4[replenishResponse.ConfirmReplenishRequest];
                try {
                    java.lang.Object[] objArr12 = {replenishResponse, replenishResponse};
                    java.lang.Object obj6 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(116191609);
                    if (obj6 == null) {
                        obj6 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59971 - android.view.KeyEvent.keyCodeFromString("")), android.view.View.getDefaultSize(0, 0) + 1741, 40 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(116191609, obj6);
                    }
                    ((java.lang.reflect.Method) obj6).invoke(null, objArr12);
                } catch (java.lang.Throwable th6) {
                    java.lang.Throwable cause6 = th6.getCause();
                    if (cause6 == null) {
                        throw th6;
                    }
                    throw cause6;
                }
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i6];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i17 = i6 - i9;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i17, i9);
            java.lang.System.arraycopy(cArr5, i9, cArr3, 0, i17);
        }
        if (z) {
            int i18 = getHighSpeedVideoFpsRangesFor + 103;
            Camera2StreamConfigurationMap = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i6];
            int i20 = 0;
            while (true) {
                replenishResponse.ConfirmReplenishRequest = i20;
                if (replenishResponse.ConfirmReplenishRequest >= i6) {
                    break;
                }
                cArr6[replenishResponse.ConfirmReplenishRequest] = cArr3[(i6 - replenishResponse.ConfirmReplenishRequest) - 1];
                i20 = replenishResponse.ConfirmReplenishRequest + 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i21 = 0;
            while (true) {
                replenishResponse.ConfirmReplenishRequest = i21;
                if (replenishResponse.ConfirmReplenishRequest >= i6) {
                    break;
                }
                cArr3[replenishResponse.ConfirmReplenishRequest] = (char) (cArr3[replenishResponse.ConfirmReplenishRequest] - iArr[2]);
                i21 = replenishResponse.ConfirmReplenishRequest + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizesFor = (char) 24167;
        getOutputStallDuration = (char) 48039;
        getOutputStallDurationlomOqCM = (char) 49430;
        getOutputFormats = (char) 13454;
        getInputSizeshNQ4ISI = new char[]{26427, 26246, 26289, 26248, 26247, 26244, 26243, 26298, 26434, 26454, 26289, 26242, 26242, 26240, 26248, 26291, 26504, 26618, 26580, 26430, 26424, 26411, 26575, 26567, 26401, 26425, 26422, 26429, 26403, 26413, 26526, 26568, 26563, 26589, 26566, 26570, 26571, 26567, 26570, 26568, 26568, 26606, 26598, 26589, 26610, 26523, 26604, 26566, 26566, 26574, 26561, 26563, 26563, 26591, 26567, 26599, 26594, 26571, 26574, 26565, 26591, 26615, 26598, 26621, 26583, 26459, 26459, 26459, 26459, 26459, 26459, 26459, 26597, 26431, 26400, 26417, 26393, 26375, 26376, 26373, 26428, 26401, 26369, 26393, 26397, 26397, 26371, 26376, 26368, 26368, 26403, 26563, 26443, 26452, 26441, 26475, 26490, 26489, 26376, 26386, 26548, 26606, 26581, 26610, 26384, 26368, 26376, 26375, 26430, 26411, 26396, 26473, 26387, 26476, 26475, 26473, 26473, 26466, 26464, 26469, 26473, 26551, 26593, 26560, 26566, 26621, 26621, 26566, 26566, 26622, 26616, 26568, 26565, 26613, 26614, 26589, 26596, 26497, 26523, 26572, 26545, 26526, 26518, 26588, 26576, 26400, 26410, 26561, 26561, 26472, 26382, 26378, 26371, 26417, 26476, 26444, 26487, 26441, 26501, 26575, 26591, 26561, 26567, 26566, 26620, 26497, 26606, 26574, 26566, 26566};
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizes = new byte[]{com.google.common.base.Ascii.FF, -71, -45, -84};
        getHighResolutionOutputSizeshNQ4ISI = 41;
    }
}
