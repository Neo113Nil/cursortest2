package com.visa.cbp;

/* loaded from: classes5.dex */
public class getOsType {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int Camera2StreamConfigurationMap;
    protected static com.visa.cbp.getOsType ReplenishAckRequest;
    private static char getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static int getInputFormats;
    private static long getOutputFormats;
    private static int getOutputMinFrameDuration;
    private com.google.gson.Gson getInputSizeshNQ4ISI = null;
    private java.util.HashMap<com.visa.cbp.getCertValue, java.lang.String> getHighSpeedVideoSizesFor = null;

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] objArr) {
        byte[] bArr = new byte[1];
        bArr[0] = (byte) ($$a != null ? 67 : -66);
        objArr[0] = new java.lang.String(bArr, 0);
    }

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRanges = 0;
        getHighSpeedVideoFpsRangesFor = 1;
        getInputFormats = 0;
        getOutputMinFrameDuration = 1;
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizes = "getOsType";
        int i = getInputFormats + 49;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private getOsType() {
    }

    public static com.visa.cbp.getOsType ConfirmReplenishRequest(java.lang.String str) {
        getOutputMinFrameDuration = (getInputFormats + 53) % 128;
        if (ReplenishAckRequest == null) {
            com.visa.cbp.getOsType getostype = new com.visa.cbp.getOsType();
            ReplenishAckRequest = getostype;
            getostype.getHighSpeedVideoFpsRangesFor(str);
            getOutputMinFrameDuration = (getInputFormats + 73) % 128;
        }
        return ReplenishAckRequest;
    }

    public static com.visa.cbp.getOsType valueOf() {
        getInputFormats = (getOutputMinFrameDuration + 5) % 128;
        com.visa.cbp.getOsType ConfirmReplenishRequest = ConfirmReplenishRequest("");
        int i = getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            return ConfirmReplenishRequest;
        }
        throw null;
    }

    private void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        this.getInputSizeshNQ4ISI = new com.google.gson.Gson();
        java.util.HashMap<com.visa.cbp.getCertValue, java.lang.String> hashMap = new java.util.HashMap<>();
        this.getHighSpeedVideoSizesFor = hashMap;
        hashMap.put(com.visa.cbp.getCertValue.ReplenishAckRequest, "https://icl.visa.com");
        this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.setTokenInfo, "https://icl.visa.com");
        this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.ConfirmReplenishRequest, "https://dpe.qa.consumerapi.digital.visa.com/");
        this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.BuildConfig, "https://dpe.aacert.consumerapi.digital.visa.com");
        this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.valueOf, "https://dpe.aacert.consumerapi.digital.visa.com");
        this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.values, "https://dpe.sandbox.consumerapi.digital.visa.com");
        this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.ReplenishRequest, "https://dpe.consumerapi.digital.visa.com");
        if (str == null || str.length() <= 0) {
            return;
        }
        com.visa.cbp.sdk.facade.EndPointEnum endPointEnum = (com.visa.cbp.sdk.facade.EndPointEnum) this.getInputSizeshNQ4ISI.fromJson(str, com.visa.cbp.sdk.facade.EndPointEnum.class);
        if (endPointEnum.getDEV() != null) {
            int i = getOutputMinFrameDuration + 5;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                endPointEnum.getDEV();
                throw null;
            }
            if (endPointEnum.getDEV().length() > 0) {
                this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.ReplenishAckRequest, endPointEnum.getDEV());
            }
        }
        if (endPointEnum.getTEST() != null && endPointEnum.getTEST().length() > 0) {
            int i2 = getOutputMinFrameDuration + 35;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.setTokenInfo, endPointEnum.getTEST());
                throw null;
            }
            this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.setTokenInfo, endPointEnum.getTEST());
        }
        if (endPointEnum.getQA() != null) {
            getInputFormats = (getOutputMinFrameDuration + 105) % 128;
            if (endPointEnum.getQA().length() > 0) {
                this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.ConfirmReplenishRequest, endPointEnum.getQA());
            }
        }
        if (endPointEnum.getCERT() != null && endPointEnum.getCERT().length() > 0) {
            this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.BuildConfig, endPointEnum.getCERT());
        }
        if (endPointEnum.getSBX() != null && endPointEnum.getSBX().length() > 0) {
            getOutputMinFrameDuration = (getInputFormats + 93) % 128;
            this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.values, endPointEnum.getSBX());
        }
        if (endPointEnum.getPROD() != null && endPointEnum.getPROD().length() > 0) {
            this.getHighSpeedVideoSizesFor.put(com.visa.cbp.getCertValue.ReplenishRequest, endPointEnum.getPROD());
        }
        this.getHighSpeedVideoSizesFor.size();
        BuildConfig();
        int i3 = getOutputMinFrameDuration + 79;
        getInputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 / 2;
        }
    }

    public java.lang.String BuildConfig() {
        getOutputMinFrameDuration = (getInputFormats + 71) % 128;
        java.util.HashMap<com.visa.cbp.getCertValue, java.lang.String> hashMap = this.getHighSpeedVideoSizesFor;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 18124), "\u0000\u0000\u0000\u0000", (-1863328293) - android.view.View.MeasureSpec.getSize(0), "ϭ㙍쌀", "\udbc5\uefdd첐ⵆ", objArr);
        java.lang.String str = hashMap.get(com.visa.cbp.getCertValue.valueOf(((java.lang.String) objArr[0]).intern()));
        getOutputMinFrameDuration = (getInputFormats + 51) % 128;
        return str;
    }

    public java.lang.String ConfirmReplenishRequest() {
        getOutputMinFrameDuration = (getInputFormats + 43) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((char) (android.text.TextUtils.indexOf("", "", 0, 0) + 18124), "\u0000\u0000\u0000\u0000", (-1863328293) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "ϭ㙍쌀", "\udbc5\uefdd첐ⵆ", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        getInputFormats = (getOutputMinFrameDuration + 95) % 128;
        return intern;
    }

    private static void getHighSpeedVideoSizes(char c, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char c2;
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 101) % 128;
        char[] charArray2 = str2.toCharArray();
        int i2 = getHighSpeedVideoFpsRangesFor + 99;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray3 = str.toCharArray();
        com.visa.cbp.AidInfo aidInfo = new com.visa.cbp.AidInfo();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        aidInfo.valueOf = 0;
        while (aidInfo.valueOf < length3) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
            try {
                java.lang.Object[] objArr2 = {aidInfo};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1983273232);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 2000 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 28 - android.widget.ExpandableListView.getPackedPositionChild(0L))).getMethod("D", java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1983273232, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                try {
                    java.lang.Object[] objArr3 = {aidInfo};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1725818816);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 27);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(objArr4);
                        obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1725818816, obj2);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    try {
                        java.lang.Object[] objArr5 = {aidInfo, java.lang.Integer.valueOf(cArr[aidInfo.valueOf % 4] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1422457014);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getTrimmedLength(""), android.text.TextUtils.indexOf("", "", 0, 0) + 99, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 25)).getMethod("A", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1422457014, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                        try {
                            java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr[intValue2] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                            java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(894413753);
                            if (obj4 == null) {
                                c2 = 2;
                                obj4 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 30832), 1971 - android.widget.ExpandableListView.getPackedPositionType(0L), android.widget.ExpandableListView.getPackedPositionChild(0L) + 30)).getMethod(com.visa.cbp.getEncExpo.warmup, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(894413753, obj4);
                            } else {
                                c2 = 2;
                            }
                            cArr2[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).charValue();
                            cArr[intValue2] = aidInfo.BuildConfig;
                            cArr3[aidInfo.valueOf] = (char) ((((charArray2[aidInfo.valueOf] ^ cArr[intValue2]) ^ (getOutputFormats ^ 1527987341865046008L)) ^ ((int) (Camera2StreamConfigurationMap ^ 1527987341865046008L))) ^ ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 1527987341865046008L)));
                            aidInfo.valueOf++;
                            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 7) % 128;
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
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap = 1294520312;
        getHighResolutionOutputSizeshNQ4ISI = (char) 52422;
        getOutputFormats = 1527987341865046008L;
    }

    static void Camera2StreamConfigurationMap() {
        $$a = new byte[]{64, -120, -99, com.google.common.base.Ascii.GS};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
    }
}
