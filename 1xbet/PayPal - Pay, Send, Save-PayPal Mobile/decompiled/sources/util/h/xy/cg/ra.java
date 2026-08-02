package util.h.xy.cg;

/* loaded from: classes5.dex */
public class ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static boolean getHighSpeedVideoFpsRangesFor = false;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static boolean getInputSizeshNQ4ISI;
    private static char[] getOutputFormats;
    private static int[] getOutputMinFrameDuration;

    static {
        getHighSpeedVideoFpsRangesFor();
        getInputFormats = util.h.xy.cg.ra.class.getName();
        int i = getHighSpeedVideoFpsRanges + 67;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25918(com.gemalto.mfs.mwsdk.exception.InternalComponentException internalComponentException) {
        if (internalComponentException != null) {
            internalComponentException.getMessage();
        }
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{652055224, -1566998040, 1223397712, 164771668, 1230844385, 2055847893, -468812174, 118329707, 186524515, -506415353, 1833786037, 486210261, 865682973, 24526129, 1523910410, 1024756210, 385617427, -2098225415}, android.graphics.Color.argb(0, 0, 0, 0) + 36, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(internalComponentException != null ? internalComponentException.getMessage() : "");
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, sb.toString(), null);
        if (internalComponentException != null && internalComponentException.getMessage() != null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.Gravity.getAbsoluteGravity(0, 0) + 127, "\u0092\u008b\u0091\u008c\u0082\u008a\u008d\u0082\u0083\u0087\u0085\u0089\u0087\u0082\u0083\u0085\u0084\u0082\u0090\u0087\u008f\u008e\u0081\u0087\u0089\u0088\u0087\u008d\u0088\u0089\u0087\u0082\u008c\u0085\u0087\u0089\u008b\u0088\u0082\u008a\u0087\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr2);
            if (((java.lang.String) objArr2[0]).intern().equalsIgnoreCase(internalComponentException.getMessage())) {
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.INVALID_REPLENISH_MISSING_PAYMENT;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{1662610091, 806073670, -28260282, 1194276069, -834185188, -1732684210, -1078352499, -1765723517, -107103411, 1435535015, 569304104, -873238112, 415502029, 901304404, -1666976561, 2020204426, -1338499182, 602067986}, 33 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                sb2.append(((java.lang.String) objArr3[0]).intern());
                sb2.append(internalComponentException.getMessage());
                return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 0, 0, null, sb2.toString(), null);
            }
        }
        return provisioningServiceError;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25922(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> asyncResult) {
        int i;
        int i2;
        int i3;
        java.lang.String str;
        if (asyncResult == null || asyncResult.isSuccessful()) {
            return null;
        }
        int errorCode = asyncResult.getErrorCode();
        if (errorCode == -101) {
            return m25917();
        }
        if (errorCode == 504) {
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.RETRY_EXCEEDED, errorCode, asyncResult.getErrorCode(), null, asyncResult.getErrorMessage() == null ? com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.RETRY_EXCEEDED.toString() : asyncResult.getErrorMessage(), null);
        }
        if (errorCode == -104 || errorCode == -103 || errorCode == -109 || errorCode == -102 || errorCode == -106 || errorCode == -105 || errorCode == -107 || errorCode == -108) {
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ASM_ERROR, -2, asyncResult.getErrorCode(), null, asyncResult.getErrorMessage() == null ? com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ASM_ERROR.toString() : asyncResult.getErrorMessage(), null);
        }
        util.h.xy.bv.rb result = asyncResult.getResult();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 126, "\u0083\u0085\u0083\u0083\u0082\u0087\u008c\u0088\u0087\u0098\u0082\u0083\u0082\u0089\u008c\u0094\u0085\u0095\u008c\u0082\u0087\u008b\u0088\u0092\u0087\u0083\u0082\u0097\u0083\u0082\u008b\u0087\u0092\u0089\u0091\u0096\u0087\u008c\u0085\u0091\u0089\u0088\u0095\u0091\u008c\u0094\u0086\u0086\u0085\u0093", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            if (result != null) {
                if (result.m25752() == util.h.xy.bv.rb.b.f1060) {
                    return util.h.xy.bs.b.m25614(result);
                }
                int m25751 = result.m25751();
                java.lang.String errorMessage = asyncResult.getErrorMessage();
                i2 = result.m25749();
                str = errorMessage;
                i3 = m25751;
            } else {
                if (asyncResult.getErrorMessage() != null) {
                    intern = asyncResult.getErrorMessage();
                    i = asyncResult.getErrorCode();
                } else {
                    i = -1;
                }
                i2 = i;
                i3 = -2;
                str = intern;
            }
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_ERROR, i3, i2, null, str, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int length2;
        int[] iArr3;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = getOutputMinFrameDuration;
        if (iArr4 != null) {
            int i3 = Camera2StreamConfigurationMap + 41;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            for (int i4 = 0; i4 < length2; i4++) {
                iArr3[i4] = (int) (iArr4[i4] ^ (-5569649899877129369L));
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getOutputMinFrameDuration;
        if (iArr6 != null) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 83;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                iArr2[i2] = (int) (iArr6[i2] ^ (-5569649899877129369L));
                i2++;
                length = length;
            }
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
            iArr6 = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            for (int i6 = 0; i6 < 16; i6++) {
                cVar.f2627 ^= iArr5[i6];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i7 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i7;
            }
            int i8 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i8;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i9 = cVar.f2627;
            int i10 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr5);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 + 29;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 27;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i6 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
        if (!getInputSizeshNQ4ISI) {
            if (!getHighSpeedVideoFpsRangesFor) {
                throw null;
            }
            int i7 = Camera2StreamConfigurationMap + 45;
            getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i6);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x019c  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage m25923(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.lang.String str;
        com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification messageClassification;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-1192180997, -1619578679, -2021016789, 491294153}, android.view.View.combineMeasuredStates(0, 0) + 7, objArr2);
        java.lang.String[] strArr = null;
        if (!jSONObject.has(((java.lang.String) objArr2[0]).intern())) {
            return null;
        }
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1192180997, -1619578679, -2021016789, 491294153}, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 6, objArr3);
            java.lang.String string = jSONObject.getString(((java.lang.String) objArr3[0]).intern());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{238473921, -1942202283, 1709269972, -717066853}, android.widget.ExpandableListView.getPackedPositionType(0L) + 7, objArr4);
            if (jSONObject.has(((java.lang.String) objArr4[0]).intern())) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{238473921, -1942202283, 1709269972, -717066853}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 7, objArr5);
                str = jSONObject.getString(((java.lang.String) objArr5[0]).intern());
            } else {
                str = null;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u009a\u0089\u0091\u0083\u0082\u0097\u0082\u008f\u0099\u008b\u0086", objArr6);
            if (jSONObject.has(((java.lang.String) objArr6[0]).intern())) {
                int i = getHighSpeedVideoSizes;
                int i2 = i + 125;
                getHighSpeedVideoFpsRanges = i2 % 128;
                int i3 = i2 % 2 != 0 ? 4 : 127;
                getHighSpeedVideoFpsRanges = (i + 103) % 128;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(i3 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), "\u009a\u0089\u0091\u0083\u0082\u0097\u0082\u008f\u0099\u008b\u0086", objArr7);
                java.lang.String string2 = jSONObject.getString(((java.lang.String) objArr7[0]).intern());
                if (string2.equals(com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification.ERROR.toString())) {
                    int i4 = getHighSpeedVideoFpsRanges + 85;
                    getHighSpeedVideoSizes = i4 % 128;
                    if (i4 % 2 == 0) {
                        com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification messageClassification2 = com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification.ERROR;
                        throw new java.lang.ArithmeticException();
                    }
                    messageClassification = com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification.ERROR;
                } else if (string2.equals(com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification.INFO.toString())) {
                    int i5 = getHighSpeedVideoFpsRanges + 125;
                    getHighSpeedVideoSizes = i5 % 128;
                    if (i5 % 2 != 0) {
                        messageClassification = com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification.INFO;
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 105) % 128;
                    } else {
                        com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification messageClassification3 = com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification.INFO;
                        throw new java.lang.ArithmeticException();
                    }
                } else if (string2.equals(com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification.WARNING.toString())) {
                    messageClassification = com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification.WARNING;
                }
                objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u008b\u0086\u0088\u0083\u0088\u0081\u0099\u008b\u0086", objArr);
                if (jSONObject.has(((java.lang.String) objArr[0]).intern())) {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u008b\u0086\u0088\u0083\u0088\u0081\u0099\u008b\u0086", objArr8);
                    org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.get(((java.lang.String) objArr8[0]).intern()).toString().trim());
                    strArr = new java.lang.String[jSONArray.length()];
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        strArr[i6] = jSONArray.getString(i6);
                    }
                }
                return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage(string, str, strArr, messageClassification);
            }
            messageClassification = null;
            objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u008b\u0086\u0088\u0083\u0088\u0081\u0099\u008b\u0086", objArr);
            if (jSONObject.has(((java.lang.String) objArr[0]).intern())) {
            }
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage(string, str, strArr, messageClassification);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> m25926(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 59) % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> m26210 = ((util.h.xy.d.md) com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalizedCard(str)).m26210();
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return m26210;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25920(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) {
        util.h.xy.x.mb.m27698(new util.h.xy.an.ma(), util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).mo26155(str, digitalizedCardState));
        int i = getHighSpeedVideoFpsRanges + 83;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25917() {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_NO_INTERNET;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{1407944637, -1083427821, 1956821078, -702940537, 1310803723, 2064928854, -397479396, -1060501549, 1223707613, -91474271, 589292177, 467491039}, 22 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, -101, -1, null, ((java.lang.String) objArr[0]).intern(), null);
        int i = getHighSpeedVideoSizes + 79;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return provisioningServiceError;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25919(util.h.xy.bv.rb rbVar) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 9) % 128;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25925 = m25925(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_ERROR, rbVar);
        int i = getHighSpeedVideoFpsRanges + 91;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return m25925;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25925(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes, util.h.xy.bv.rb rbVar) {
        return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, rbVar.m25751(), -1, null, rbVar.m25742() == null ? provisioningServiceErrorCodes.toString() : rbVar.m25742(), null);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25921(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes, util.h.xy.bv.me meVar) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, meVar.m25751(), meVar.m25749(), (meVar.m25716() == null || meVar.m25716().length <= 0) ? null : meVar.m25716()[0], meVar.m25742() == null ? provisioningServiceErrorCodes.toString() : meVar.m25742(), meVar.m25750());
        provisioningServiceError.getHttpStatusCode();
        return provisioningServiceError;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25924(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError2) {
        if (provisioningServiceError2 != null) {
            int i = getHighSpeedVideoSizes + 125;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (provisioningServiceError != null) {
                return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceError.getSdkErrorCode(), provisioningServiceError.getHttpStatusCode(), provisioningServiceError.getCpsErrorCode(), provisioningServiceError.getTokenId(), provisioningServiceError.getErrorMessage(), provisioningServiceError.getCausingException(), provisioningServiceError.getStatusAdditionalInfo(), provisioningServiceError2);
            }
        }
        if (provisioningServiceError == null) {
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_ERROR;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u0083\u0085\u0083\u0083\u0082\u0087\u008c\u0085\u0091\u0089\u0088\u0095\u0091\u008c\u0094\u0086\u0086\u0085\u0093", objArr);
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, ((java.lang.String) objArr[0]).intern(), null);
        }
        int i2 = getHighSpeedVideoSizes + 5;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return provisioningServiceError;
        }
        throw new java.lang.ArithmeticException();
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputMinFrameDuration = new int[]{1081809139, 730207942, -1621773166, 782697992, 481488368, -1114247496, 1287804403, 518450936, -2025844075, -333578170, -1015760720, 1589224640, 1992185220, 396479888, -1307250788, 938831512, -255621784, -751139074};
        getOutputFormats = new char[]{64128, 64127, 64098, 64126, 64097, 64103, 64176, 64115, 64108, 64100, 64109, 64102, 64096, 64129, 64141, 64114, 64123, 64120, 64157, 64111, 64125, 64105, 64110, 64124, 64121, 64107};
        getHighSpeedVideoSizesFor = -1074857264;
        getHighSpeedVideoFpsRangesFor = true;
        getInputSizeshNQ4ISI = true;
    }
}
