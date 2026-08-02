package util.h.xy.ca;

/* loaded from: classes5.dex */
public class ma implements com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ReplenishmentPrepService {
    private static int Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static char getInputFormats = 0;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static char getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    private static char getOutputSizes;
    org.json.JSONArray getHighSpeedVideoSizes;
    private com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState getOutputStallDurationlomOqCM = null;
    private java.lang.String getOutputMinFrameDurationlomOqCM = null;

    /* JADX WARN: Removed duplicated region for block: B:60:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ma maVar, final com.gemalto.mfs.mwsdk.provisioning.listener.AuthenticationStateListener authenticationStateListener, java.lang.String str) {
        util.h.xy.ag.a m24556;
        java.lang.Runnable runnable;
        int i;
        getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 41) % 128;
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m26900 = util.h.xy.j.ma.f2241.m26900();
        maVar.getOutputStallDurationlomOqCM = new com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState(com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState.AUTH_NOT_NEEDED, m26900, null);
        if (m26900 != null) {
            getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 43) % 128;
            if (m26900 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE && m26900 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN) {
                try {
                    org.json.JSONArray m26912 = util.h.xy.k.b.m26912();
                    maVar.getHighSpeedVideoSizes = m26912;
                    if (m26912 != null && m26912.length() > 0) {
                        for (int i2 = 0; i2 < maVar.getHighSpeedVideoSizes.length(); i2++) {
                            getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 71) % 128;
                            maVar.getOutputMinFrameDurationlomOqCM = null;
                            try {
                                org.json.JSONObject jSONObject = maVar.getHighSpeedVideoSizes.getJSONObject(i2);
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("뾓ẕ㵮ꏌ묈떪醻倬", 6 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
                                maVar.getOutputMinFrameDurationlomOqCM = jSONObject.getString(((java.lang.String) objArr[0]).intern());
                                org.json.JSONObject jSONObject2 = maVar.getHighSpeedVideoSizes.getJSONObject(i2);
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("\ufff8\u000b￼￼\u000f\u0007\u0000\t\u0010ￛ", 10 - android.text.TextUtils.getOffsetBefore("", 0), android.graphics.Color.alpha(0) + 3, android.widget.ExpandableListView.getPackedPositionType(0L) + 302, false, objArr2);
                                java.lang.String string = jSONObject2.getString(((java.lang.String) objArr2[0]).intern());
                                org.json.JSONObject jSONObject3 = maVar.getHighSpeedVideoSizes.getJSONObject(i2);
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("\uffdd\u0007\u0002\u0006\f\u0012\ufffa", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7, 4 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 301, true, objArr3);
                                long j = jSONObject3.getLong(((java.lang.String) objArr3[0]).intern());
                                if (maVar.getOutputMinFrameDurationlomOqCM != null) {
                                    boolean equals = java.util.Arrays.equals(util.h.xy.ak.ma.f84.m24991(maVar.getOutputMinFrameDurationlomOqCM.getBytes(util.h.xy.h.a.f2221)), new byte[]{1});
                                    if (str == null) {
                                        try {
                                            if (!util.h.xy.d.rf.m26257(string, j)) {
                                                continue;
                                            } else {
                                                if (!equals) {
                                                    maVar.getOutputStallDurationlomOqCM = new com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState(com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState.AUTH_NEEDED, m26900, maVar.getOutputMinFrameDurationlomOqCM);
                                                    break;
                                                }
                                                maVar.getOutputStallDurationlomOqCM = new com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState(com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState.AUTH_NOT_NEEDED, m26900, maVar.getOutputMinFrameDurationlomOqCM);
                                            }
                                        } catch (java.text.ParseException e) {
                                            e = e;
                                            e.getMessage();
                                        }
                                    } else if (str.equalsIgnoreCase(maVar.getOutputMinFrameDurationlomOqCM)) {
                                        try {
                                            if (util.h.xy.d.rf.m26257(string, j)) {
                                                maVar.getOutputStallDurationlomOqCM = equals ? new com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState(com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState.AUTH_NOT_NEEDED, m26900, maVar.getOutputMinFrameDurationlomOqCM) : new com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState(com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState.AUTH_NEEDED, m26900, maVar.getOutputMinFrameDurationlomOqCM);
                                                break;
                                            } else {
                                                int i3 = getOutputMinFrameDuration + 73;
                                                getHighSpeedVideoSizesFor = i3 % 128;
                                                int i4 = i3 % 2;
                                            }
                                        } catch (java.text.ParseException e2) {
                                            e = e2;
                                            e.getMessage();
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } catch (org.json.JSONException unused) {
                            }
                        }
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                    e3.getmErrorCode();
                }
                m24556 = util.h.xy.ag.a.m24556();
                runnable = new java.lang.Runnable() { // from class: util.h.xy.ca.ma.5
                    private static int Camera2StreamConfigurationMap = 1;
                    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                    private static int getHighSpeedVideoFpsRanges = 1;
                    private static long getHighSpeedVideoSizesFor = -8621248815467118287L;
                    private static int getOutputMinFrameDuration;

                    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str2, int i5, java.lang.Object[] objArr4) {
                        int i6 = getHighSpeedVideoFpsRanges;
                        getHighResolutionOutputSizeshNQ4ISI = (i6 + 71) % 128;
                        int i7 = i6 + 9;
                        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                        char[] charArray = str2.toCharArray();
                        util.h.xz.b.d dVar = new util.h.xz.b.d();
                        dVar.f2628 = i5;
                        int length = charArray.length;
                        long[] jArr = new long[length];
                        dVar.f2629 = 0;
                        while (dVar.f2629 < charArray.length) {
                            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizesFor ^ (-7508379876853140581L));
                            dVar.f2629++;
                        }
                        char[] cArr = new char[length];
                        dVar.f2629 = 0;
                        while (dVar.f2629 < charArray.length) {
                            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                            dVar.f2629++;
                        }
                        objArr4[0] = new java.lang.String(cArr);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 13) % 128;
                        util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor();
                        util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor();
                        util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ma.this).getState();
                        util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor();
                        util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ma.this).getCvm();
                        util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor();
                        util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ma.this).getTokenID();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("狦ᣇꚙ䱞", 27197 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
                        java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("狸ጛ넻圧\uf560鮎㦻\udfa3緭Ȑ", android.view.View.resolveSizeAndState(0, 0, 0) + 25057, objArr5);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr5[0]).intern());
                        authenticationStateListener.onSuccess(util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ma.this));
                        int i5 = Camera2StreamConfigurationMap + 13;
                        getOutputMinFrameDuration = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                    }
                };
                m24556.m24557(runnable);
                i = getOutputMinFrameDuration + 95;
                getHighSpeedVideoSizesFor = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        m24556 = util.h.xy.ag.a.m24556();
        runnable = new java.lang.Runnable() { // from class: util.h.xy.ca.ma.3
            private static long getHighResolutionOutputSizeshNQ4ISI = -5991546299871262655L;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes = 0;
            private static int getInputFormats = 0;
            private static int getInputSizeshNQ4ISI = 1;

            private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str2, int i5, java.lang.Object[] objArr4) {
                int i6 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = (i6 + 33) % 128;
                getHighSpeedVideoSizes = (i6 + 119) % 128;
                char[] charArray = str2.toCharArray();
                util.h.xz.b.a aVar = new util.h.xz.b.a();
                char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i5);
                aVar.f2623 = 4;
                while (aVar.f2623 < m27721.length) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 101) % 128;
                    aVar.f2624 = aVar.f2623 - 4;
                    m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
                    aVar.f2623++;
                }
                objArr4[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getInputSizeshNQ4ISI = (getInputFormats + 99) % 128;
                util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("鵪鴦ၚ\ue063艱拪幰輈", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr4);
                java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("熌燞└픭鬐箑\u1c4c쵙끦条\ud9b0躽\uf28bꛏ", -android.graphics.ImageFormat.getBitsPerPixel(0), objArr5);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr5[0]).intern());
                authenticationStateListener.onSuccess(util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ma.this));
                getInputFormats = (getInputSizeshNQ4ISI + 69) % 128;
            }
        };
        m24556.m24557(runnable);
        i = getOutputMinFrameDuration + 95;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:3|4|(2:6|(4:8|(1:10)|11|12)(4:19|(1:21)|11|12))|22|23|(2:31|32)(2:27|28)|29|12) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        r0.getmErrorCode();
        r1 = com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus.INTERNAL_ERROR;
        r3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ᒀ擽\ude8f记礀Ω큆肥띳\ue7b2㐅鬓裮౽굦퐂╎覵쓣官", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 19, r3);
        r6.onPreparationFailed(new util.h.xy.v.mc(r1, ((java.lang.String) r3[0]).intern()));
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0057 -> B:29:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void getHighSpeedVideoFpsRanges(util.h.xy.ca.ma maVar, final com.gemalto.mfs.mwsdk.provisioning.listener.ReplenishmentPrepListener replenishmentPrepListener) {
        getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 23) % 128;
        synchronized (maVar) {
            org.json.JSONArray jSONArray = maVar.getHighSpeedVideoSizes;
            if (jSONArray != null) {
                int i = getHighSpeedVideoSizesFor + 75;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 == 0) {
                    if (jSONArray.length() == 0) {
                    }
                    maVar.Camera2StreamConfigurationMap(replenishmentPrepListener);
                } else {
                    if (jSONArray.length() == 0) {
                    }
                    maVar.Camera2StreamConfigurationMap(replenishmentPrepListener);
                }
            }
            org.json.JSONArray m26912 = util.h.xy.k.b.m26912();
            maVar.getHighSpeedVideoSizes = m26912;
            if (m26912 == null || m26912.length() <= 0) {
                maVar.getHighSpeedVideoSizes = null;
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.8
                    private static int getHighSpeedVideoFpsRanges = 0;
                    private static int getHighSpeedVideoFpsRangesFor = 1;
                    private static int getHighSpeedVideoSizes = 1;
                    private static char[] getInputFormats = {53454, 471, 29387, 41930, 38117, 50646, 14038, 26565, 22749, 35204, 64205, 11223, 7300, 19905, 48845, 61392, 49356, 12737, 25302, 21380, 33994, 62929, 9928, 6088, 18564, 47563, 60118, 56196, 3265, 32201, 44756, 40912, 61661, 8588, 4749, 40013, 19793, 15944, 61250, 40019, 19793, 15954, 61231, 55366, 35140, 31317, 11095, 5197, 50479, 46670, 26449, 20551};
                    private static long getInputSizeshNQ4ISI = 2526090177918160129L;
                    private static int getOutputMinFrameDuration;

                    private static void getHighResolutionOutputSizeshNQ4ISI(int i2, int i3, char c, java.lang.Object[] objArr) {
                        int i4;
                        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                        long[] jArr = new long[i2];
                        rbVar.f2651 = 0;
                        while (rbVar.f2651 < i2) {
                            jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i3] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputSizeshNQ4ISI))) ^ c;
                            rbVar.f2651++;
                        }
                        char[] cArr = new char[i2];
                        rbVar.f2651 = 0;
                        while (rbVar.f2651 < i2) {
                            int i5 = getHighSpeedVideoFpsRanges + 37;
                            getHighSpeedVideoSizes = i5 % 128;
                            if (i5 % 2 == 0) {
                                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                                i4 = rbVar.f2651;
                            } else {
                                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                                i4 = rbVar.f2651 + 1;
                            }
                            rbVar.f2651 = i4;
                            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 77) % 128;
                        }
                        objArr[0] = new java.lang.String(cArr);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus replenishmentPrepStatus = com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus.INTERNAL_ERROR;
                        int indexOf = android.text.TextUtils.indexOf("", "");
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(35 - indexOf, android.view.ViewConfiguration.getScrollBarSize() >> 8, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 19621), objArr);
                        util.h.xy.v.mc mcVar = new util.h.xy.v.mc(replenishmentPrepStatus, ((java.lang.String) objArr[0]).intern());
                        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(3 - lastIndexOf, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 36, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr2);
                        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                        int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(indexOf2 + 14, 39 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr3);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                        replenishmentPrepListener.onPreparationFailed(mcVar);
                        int i2 = getOutputMinFrameDuration + 23;
                        getHighSpeedVideoFpsRangesFor = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                    }
                });
                replenishmentPrepListener = replenishmentPrepListener;
            } else {
                maVar.Camera2StreamConfigurationMap(replenishmentPrepListener);
                int i2 = (getOutputMinFrameDuration + 69) % 128;
                getHighSpeedVideoSizesFor = i2;
                replenishmentPrepListener = i2;
            }
        }
        int i3 = getHighSpeedVideoSizesFor + 7;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ma maVar) {
        int i = getHighSpeedVideoSizesFor + 5;
        getOutputMinFrameDuration = i % 128;
        com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState authenticationState = maVar.getOutputStallDurationlomOqCM;
        if (i % 2 != 0) {
            return authenticationState;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoSizesFor;
        getOutputMinFrameDuration = (i + 19) % 128;
        java.lang.String str = getInputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i + 93) % 128;
        return str;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes(util.h.xy.ca.ma maVar) {
        int i = (getOutputMinFrameDuration + 3) % 128;
        getHighSpeedVideoSizesFor = i;
        java.lang.String str = maVar.getOutputMinFrameDurationlomOqCM;
        getOutputMinFrameDuration = (i + 41) % 128;
        return str;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getInputSizeshNQ4ISI = util.h.xy.ca.ma.class.getName();
        getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 43) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ReplenishmentPrepService
    public void prepareForReplenishment(final com.gemalto.mfs.mwsdk.provisioning.listener.ReplenishmentPrepListener replenishmentPrepListener) {
        int i = getOutputMinFrameDuration;
        getHighSpeedVideoSizesFor = (i + 95) % 128;
        getHighSpeedVideoSizesFor = (i + 89) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ue914\uf7a2Ŷ餡", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 4, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\udbc1Ⳃ᛬셽揸닅蓶쉷", 8 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (replenishmentPrepListener == null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("⟸嫾\uf72c☎\uf857Կ\uf4b3쪎\uf430藢\uf857Կ៩⁂ੋꍅ墱ꀙ\uf4b3쪎അឧ鳇\udf63\ue90b鞍\ue950涫随愨챁ﴕ⬥뻏䆢┮\ue5fdໜ셧᥈", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 39, objArr3);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
            }
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.4
                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                private static int getHighSpeedVideoFpsRanges;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoFpsRanges = ((i2 ^ 115) + ((i2 & 115) << 1)) % 128;
                    util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor();
                    if (util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ma.this) == null) {
                        util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor();
                        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.4.1
                            private static int Camera2StreamConfigurationMap = 1;
                            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                            private static int getHighSpeedVideoFpsRanges = 1;
                            private static long getHighSpeedVideoFpsRangesFor = -3826942324466582196L;
                            private static int getHighSpeedVideoSizesFor = 294925130;
                            private static char getOutputFormats = 13130;
                            private static int getOutputMinFrameDuration;

                            private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i3, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr4) {
                                int i4 = getHighResolutionOutputSizeshNQ4ISI + 47;
                                Camera2StreamConfigurationMap = i4 % 128;
                                if (i4 % 2 == 0) {
                                    throw null;
                                }
                                char[] charArray = str3.toCharArray();
                                int i5 = Camera2StreamConfigurationMap + 33;
                                getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                                if (i5 % 2 != 0) {
                                    throw null;
                                }
                                char[] charArray2 = str2.toCharArray();
                                char[] charArray3 = str.toCharArray();
                                util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                                int length = charArray2.length;
                                char[] cArr = new char[length];
                                int length2 = charArray.length;
                                char[] cArr2 = new char[length2];
                                java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
                                java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
                                cArr[0] = (char) (cArr[0] ^ c);
                                cArr2[2] = (char) (cArr2[2] + ((char) i3));
                                int length3 = charArray3.length;
                                char[] cArr3 = new char[length3];
                                rcVar.f2652 = 0;
                                int i6 = getHighResolutionOutputSizeshNQ4ISI + 125;
                                Camera2StreamConfigurationMap = i6 % 128;
                                if (i6 % 2 == 0) {
                                    int i7 = 2 / 3;
                                }
                                while (rcVar.f2652 < length3) {
                                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
                                    int i8 = (rcVar.f2652 + 2) % 4;
                                    int i9 = (rcVar.f2652 + 3) % 4;
                                    rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i8]) % 65535);
                                    cArr2[i9] = (char) (((cArr[i9] * 32718) + cArr2[i8]) / 65535);
                                    cArr[i9] = rcVar.f2653;
                                    cArr3[rcVar.f2652] = (char) ((((cArr[i9] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizesFor ^ 2457411417541981002L))) ^ ((char) (getOutputFormats ^ 2457411417541981002L)));
                                    rcVar.f2652++;
                                }
                                objArr4[0] = new java.lang.String(cArr3);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus replenishmentPrepStatus = com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus.NEEDS_AUTHENTICATION;
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("倮냈꧅㹂\udceeཋæ屰\uee07\ud9f9滼渓盖㯋췇틖賶\uebbd", (char) (33063 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.view.ViewConfiguration.getWindowTouchSlop() >> 8, "헭⍀⠢龁", "츆俖芑\ue8f9", objArr4);
                                util.h.xy.v.mc mcVar = new util.h.xy.v.mc(replenishmentPrepStatus, ((java.lang.String) objArr4[0]).intern());
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("։㖫腶\uf7d9", (char) (15239 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), "Ỉ䀊蟓밻", "츆俖芑\ue8f9", objArr5);
                                java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("ㄊᐩ\ue235矀䳴⒤듁ᶒ㿅쌇䫤", (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), android.graphics.Color.argb(0, 0, 0, 0) - 348806464, "쀞㖢蓫狨", "츆俖芑\ue8f9", objArr6);
                                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr6[0]).intern());
                                replenishmentPrepListener.onPreparationFailed(mcVar);
                                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                            }
                        });
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 79) % 128;
                        return;
                    }
                    util.h.xy.ca.ma.getHighSpeedVideoFpsRanges(util.h.xy.ca.ma.this, replenishmentPrepListener);
                }
            }).start();
            getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 63) % 128;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ReplenishmentPrepService
    public com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier getDeviceCVMVerifier() {
        getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 63) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\ue914\uf7a2Ŷ餡", '4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\udbc1Ⳃ᛬셽\udadcᙚ轠⠾갟䵨鷕\ue0d9", 11 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 55) % 128;
            if (this.getOutputStallDurationlomOqCM == null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0014\u000f\u000e\u000e\u0001\u0003\uffc0\u0004\u000f\b\u0014\u0005\r\uffc0\u0013\t\b\ufff4\u000e\u000f\t\u0014\u0001\u0003\t\u0014\u000e\u0005\b\u0014\u0015￡\u0013\u0004\u0005\u0005\u000e\uffc0\u0007\u000e\t\f\f\u0001\u0003\uffc0\u0005\u0012\u000f\u0006\u0005\u0002\uffc0\u0004\u0005\f\f\u0001\u0003\uffc0\u0005\u0002\uffc0", 63 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 18 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, true, objArr3);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
            }
            if (com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE == this.getOutputStallDurationlomOqCM.getCvm() || com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN == this.getOutputStallDurationlomOqCM.getCvm()) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0012\t\r\u0016\t\u0014\u001c\tￄ\ufff2￭\ufff4ￄ\u0018\t\u0010\u0010\u0005\ufffbￄ\u0016\u0013ￄ\t\u000f\r\u0010\b\u0016\u0005\uffe7ￄ\u0016\u0013\nￄ\b\t\u0010\u0010\u0005\u0007ￄ\t\u0006ￄ\u0018\u0013\u0012\u0012\u0005\u0007ￄ\b\u0013\f\u0018\t\u0011ￄ\u0017\r\f\ufff8\t\u0007", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 67, 64 - android.view.KeyEvent.getDeadChar(0, 0), 288 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), true, objArr4);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr4[0]).intern());
            }
            com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier m25571 = new util.h.xy.bq.ra().m25571(this.getOutputStallDurationlomOqCM.getCvm());
            int i = getOutputMinFrameDuration + 29;
            int i2 = i % 128;
            getHighSpeedVideoSizesFor = i2;
            if (i % 2 == 0) {
                int i3 = i2 + 3;
                getOutputMinFrameDuration = i3 % 128;
                if (i3 % 2 != 0) {
                    return m25571;
                }
                throw null;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ReplenishmentPrepService
    public void needsAuthentication(com.gemalto.mfs.mwsdk.provisioning.listener.AuthenticationStateListener authenticationStateListener) {
        getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 107) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\ue914\uf7a2Ŷ餡", android.view.View.MeasureSpec.getMode(0) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0006\ufff9\n\b\u000b\u0001￦", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 269, false, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (authenticationStateListener == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u0001\u0010�\u0010\uffef\n\u000b\u0005\u0010�\uffff\u0005\u0010\n\u0001\u0004\u0010\u0011\uffdd\b\b\u0011\nﾼ\u0001\ufffeﾼ\u0010\u000b\n\n�\uffffﾼ", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 27, android.view.View.resolveSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, true, objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        getHighSpeedVideoSizes(authenticationStateListener, null);
        int i = getOutputMinFrameDuration + 3;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i2 = getHighSpeedVideoFpsRanges + 55;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                cArr2[1] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 % 1];
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
            }
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 61) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputFormats ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getOutputSizes ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ReplenishmentPrepService
    public void needsAuthentication(final com.gemalto.mfs.mwsdk.provisioning.listener.AuthenticationStateListener authenticationStateListener, java.lang.String str) {
        getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 59) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\ue914\uf7a2Ŷ餡", 4 - android.graphics.Color.red(0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0004\u000e\u000b\r￭￼\t￩", android.view.View.MeasureSpec.getSize(0) + 8, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 4, 266 - android.view.View.MeasureSpec.getMode(0), true, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (authenticationStateListener == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u0001\u0010�\u0010\uffef\n\u000b\u0005\u0010�\uffff\u0005\u0010\n\u0001\u0004\u0010\u0011\uffdd\b\b\u0011\nﾼ\u0001\ufffeﾼ\u0010\u000b\n\n�\uffffﾼ", android.text.TextUtils.indexOf("", "") + 42, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, true, objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (str != null) {
            int i = getHighSpeedVideoSizesFor + 111;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (!str.isEmpty()) {
                try {
                    if (java.util.Arrays.equals(util.h.xy.ak.ma.f84.m24991(str.getBytes(util.h.xy.h.a.f2221)), new byte[]{1})) {
                        this.getOutputStallDurationlomOqCM = new com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState(com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState.AUTH_NOT_NEEDED, util.h.xy.j.ma.f2241.m26900(), str);
                        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.1
                            private static int getHighSpeedVideoFpsRanges = 1;
                            private static int getHighSpeedVideoFpsRangesFor = 1;
                            private static int getHighSpeedVideoSizes = 0;
                            private static int getInputFormats = 0;
                            private static int getOutputMinFrameDuration = -1231763768;

                            @Override // java.lang.Runnable
                            public final void run() {
                                getHighSpeedVideoFpsRangesFor = (getInputFormats + 105) % 128;
                                util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor();
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("\ufff9\u0002\u0006\uffff", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4, android.view.View.resolveSize(0, 0) + 1, android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr4);
                                java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("￣\u0004\b\u0007\u0005\b￣�\u000b\u0001\u000b\t", 12 - android.text.TextUtils.getOffsetBefore("", 0), android.view.View.MeasureSpec.getSize(0) + 3, android.widget.ExpandableListView.getPackedPositionChild(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, objArr5);
                                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                                authenticationStateListener.onSuccess(util.h.xy.ca.ma.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ma.this));
                                int i2 = getHighSpeedVideoFpsRangesFor + 49;
                                getInputFormats = i2 % 128;
                                if (i2 % 2 != 0) {
                                    throw new java.lang.ArithmeticException();
                                }
                            }

                            private static void getHighSpeedVideoFpsRanges(java.lang.String str2, int i2, int i3, int i4, java.lang.Object[] objArr4) {
                                int i5 = getHighSpeedVideoSizes + 9;
                                getHighSpeedVideoFpsRanges = i5 % 128;
                                if (i5 % 2 == 0) {
                                    throw new java.lang.ArithmeticException();
                                }
                                char[] charArray = str2.toCharArray();
                                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                                char[] cArr = new char[i2];
                                raVar.f2649 = 0;
                                while (raVar.f2649 < i2) {
                                    raVar.f2650 = charArray[raVar.f2649];
                                    cArr[raVar.f2649] = (char) (raVar.f2650 + i4);
                                    int i6 = raVar.f2649;
                                    cArr[i6] = (char) (cArr[i6] - ((int) (getOutputMinFrameDuration ^ (-4839292868003314026L))));
                                    raVar.f2649++;
                                }
                                if (i3 > 0) {
                                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 79) % 128;
                                    raVar.f2648 = i3;
                                    char[] cArr2 = new char[i2];
                                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
                                    java.lang.System.arraycopy(cArr2, 0, cArr, i2 - raVar.f2648, raVar.f2648);
                                    java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i2 - raVar.f2648);
                                }
                                java.lang.String str3 = new java.lang.String(cArr);
                                int i7 = getHighSpeedVideoFpsRanges + 43;
                                getHighSpeedVideoSizes = i7 % 128;
                                if (i7 % 2 != 0) {
                                    throw null;
                                }
                                objArr4[0] = str3;
                            }
                        });
                        int i2 = getHighSpeedVideoSizesFor + 65;
                        getOutputMinFrameDuration = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    authenticationStateListener.onError(new util.h.xy.v.mc(com.gemalto.mfs.mwsdk.provisioning.model.NeedsAuthenticationErrorCode.GENERIC_ERROR, e.getMessage()));
                }
                getHighSpeedVideoSizes(authenticationStateListener, str);
                getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 121) % 128;
                return;
            }
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("뾓ẕ㵮ꏌ묈떪띳\ue7b2\ue950涫随愨챁ﴕ⬥뻏䆢┮\ue5fdໜ셧᥈", 23 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighSpeedVideoFpsRanges + 85;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 33) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getHighSpeedVideoFpsRangesFor ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 49) % 128;
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 117) % 128;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private void Camera2StreamConfigurationMap(final com.gemalto.mfs.mwsdk.provisioning.listener.ReplenishmentPrepListener replenishmentPrepListener) {
        int i;
        int i2 = getOutputMinFrameDuration + 97;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoSizes.length();
            i = 1;
        } else {
            this.getHighSpeedVideoSizes.length();
            i = 0;
        }
        while (i < this.getHighSpeedVideoSizes.length()) {
            getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 31) % 128;
            this.getOutputMinFrameDurationlomOqCM = null;
            try {
                org.json.JSONObject jSONObject = this.getHighSpeedVideoSizes.getJSONObject(i);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("뾓ẕ㵮ꏌ묈떪醻倬", 7 - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
                this.getOutputMinFrameDurationlomOqCM = jSONObject.getString(((java.lang.String) objArr[0]).intern());
                org.json.JSONObject jSONObject2 = this.getHighSpeedVideoSizes.getJSONObject(i);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ufff8\u000b￼￼\u000f\u0007\u0000\t\u0010ￛ", 9 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3, 302 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), false, objArr2);
                java.lang.String string = jSONObject2.getString(((java.lang.String) objArr2[0]).intern());
                org.json.JSONObject jSONObject3 = this.getHighSpeedVideoSizes.getJSONObject(i);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\uffdd\u0007\u0002\u0006\f\u0012\ufffa", android.text.TextUtils.indexOf("", "", 0, 0) + 7, (-16777212) - android.graphics.Color.rgb(0, 0, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 300, true, objArr3);
                long j = jSONObject3.getLong(((java.lang.String) objArr3[0]).intern());
                org.json.JSONObject jSONObject4 = this.getHighSpeedVideoSizes.getJSONObject(i);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ੋꍅ˺獵涏✣땓\ude26丂\uf5f1", 10 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr4);
                int i3 = jSONObject4.getInt(((java.lang.String) objArr4[0]).intern());
                getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 77) % 128;
                try {
                    if (util.h.xy.d.rf.m26257(string, j)) {
                        getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 33) % 128;
                        byte[] m26767 = util.h.xy.f.b.f2201.m26767(this.getOutputMinFrameDurationlomOqCM, (util.h.xy.d.rc) null, i3);
                        if (m26767 != null && m26767.length != 0) {
                            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.10
                                private static int Camera2StreamConfigurationMap = 1;
                                private static int getHighSpeedVideoFpsRanges = 1;
                                private static int getHighSpeedVideoSizes;
                                private static int getOutputMinFrameDuration;
                                private static char[] getInputFormats = {40013, 9852, 59410, 45765, 40019, 9852, 59400, 45736, 29938, 16037, 49499, 35694, 19747, 6074, 55692, 25534, 9805, 59421};
                                private static long getHighSpeedVideoSizesFor = 4747308192781248044L;

                                private static void getHighSpeedVideoFpsRangesFor(int i4, int i5, char c, java.lang.Object[] objArr5) {
                                    util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                                    long[] jArr = new long[i4];
                                    rbVar.f2651 = 0;
                                    while (rbVar.f2651 < i4) {
                                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 31) % 128;
                                        jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i5] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizesFor))) ^ c;
                                        rbVar.f2651++;
                                    }
                                    char[] cArr = new char[i4];
                                    rbVar.f2651 = 0;
                                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 19) % 128;
                                    while (rbVar.f2651 < i4) {
                                        cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                                        rbVar.f2651++;
                                    }
                                    objArr5[0] = new java.lang.String(cArr);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 125) % 128;
                                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(4 - (scrollBarFadeDuration >> 16), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr5);
                                    java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
                                    int blue = android.graphics.Color.blue(0);
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(blue + 14, 4 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.View.resolveSize(0, 0), objArr6);
                                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr6[0]).intern());
                                    replenishmentPrepListener.onPreparationProgressUpdate(com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus.SUCCESS, util.h.xy.ca.ma.getHighSpeedVideoSizes(util.h.xy.ca.ma.this));
                                    int i4 = Camera2StreamConfigurationMap + 99;
                                    getOutputMinFrameDuration = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        throw null;
                                    }
                                }
                            });
                        }
                        this.getHighSpeedVideoSizes = null;
                        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.9
                            private static int Camera2StreamConfigurationMap = 1;
                            private static int getHighSpeedVideoFpsRangesFor = 0;
                            private static int getHighSpeedVideoSizes = 0;
                            private static int getInputFormats = 1;
                            private static char[] getOutputMinFrameDuration = {42359, 42257, 42255, 42245, 42255, 42263, 42253, 42244, 42259, 42261, 42263, 42266, 42263, 42249, 42254, 42262, 42264, 42270, 42264, 42263, 42261, 42265, 42252, 42244, 42252, 42250, 42254, 42267, 42260, 42260, 42262, 42260, 42364, 42267, 42257, 42259, 42356, 42252, 42252, 42269, 42343, 42267, 42257, 42249, 42258, 42337, 42268, 42254, 42254, 42252, 42258, 42262};

                            private static void getHighResolutionOutputSizeshNQ4ISI(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr5) {
                                int i4;
                                int i5 = (Camera2StreamConfigurationMap + 101) % 128;
                                getHighSpeedVideoSizes = i5;
                                int i6 = i5 + 107;
                                Camera2StreamConfigurationMap = i6 % 128;
                                if (i6 % 2 == 0) {
                                    throw new java.lang.ArithmeticException();
                                }
                                byte[] bytes = str.getBytes("ISO-8859-1");
                                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                                int i7 = iArr[0];
                                int i8 = iArr[1];
                                int i9 = iArr[2];
                                int i10 = iArr[3];
                                char[] cArr = getOutputMinFrameDuration;
                                if (cArr != null) {
                                    int length = cArr.length;
                                    char[] cArr2 = new char[length];
                                    for (int i11 = 0; i11 < length; i11++) {
                                        cArr2[i11] = (char) (cArr[i11] ^ (-8125198844289309347L));
                                    }
                                    cArr = cArr2;
                                }
                                char[] cArr3 = new char[i8];
                                java.lang.System.arraycopy(cArr, i7, cArr3, 0, i8);
                                if (bytes != null) {
                                    char[] cArr4 = new char[i8];
                                    maVar.f2631 = 0;
                                    char c = 0;
                                    while (maVar.f2631 < i8) {
                                        if (bytes[maVar.f2631] == 1) {
                                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                                        } else {
                                            cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                                        }
                                        c = cArr4[maVar.f2631];
                                        maVar.f2631++;
                                    }
                                    cArr3 = cArr4;
                                }
                                if (i10 > 0) {
                                    char[] cArr5 = new char[i8];
                                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i8);
                                    int i12 = i8 - i10;
                                    java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i10);
                                    java.lang.System.arraycopy(cArr5, i10, cArr3, 0, i12);
                                }
                                if (z) {
                                    char[] cArr6 = new char[i8];
                                    maVar.f2631 = 0;
                                    while (maVar.f2631 < i8) {
                                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 111) % 128;
                                        cArr6[maVar.f2631] = cArr3[(i8 - maVar.f2631) - 1];
                                        maVar.f2631++;
                                    }
                                    cArr3 = cArr6;
                                }
                                if (i9 > 0) {
                                    maVar.f2631 = 0;
                                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 93) % 128;
                                    while (maVar.f2631 < i8) {
                                        int i13 = Camera2StreamConfigurationMap + 3;
                                        getHighSpeedVideoSizes = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] << iArr[3]);
                                            i4 = maVar.f2631;
                                        } else {
                                            cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                                            i4 = maVar.f2631 + 1;
                                        }
                                        maVar.f2631 = i4;
                                    }
                                }
                                objArr5[0] = new java.lang.String(cArr3);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus replenishmentPrepStatus = com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus.FAILED_TO_GENERATE_RSA_SIGNATURE;
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(false, new int[]{0, 32, 0, 16}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", objArr5);
                                util.h.xy.v.mc mcVar = new util.h.xy.v.mc(replenishmentPrepStatus, ((java.lang.String) objArr5[0]).intern());
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{32, 4, 0, 4}, "\u0001\u0000\u0001\u0000", objArr6);
                                java.lang.String intern = ((java.lang.String) objArr6[0]).intern();
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(false, new int[]{36, 16, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000", objArr7);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr7[0]).intern());
                                replenishmentPrepListener.onPreparationFailed(mcVar);
                                int i4 = getHighSpeedVideoFpsRangesFor + 29;
                                getInputFormats = i4 % 128;
                                if (i4 % 2 == 0) {
                                    throw null;
                                }
                            }
                        });
                        return;
                    }
                    i++;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    e.getMessage();
                    util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.12
                        private static int Camera2StreamConfigurationMap = 1;
                        private static int getHighSpeedVideoFpsRanges;
                        private static char[] getInputFormats = {36490, 24933, 20775, 16894, 12689, 8261, 4114, kotlin.text.Typography.times, 61632, 57508, 54142, 49963, 46028, 41861, 37462, 33301, 29239, 25294, 21163, 17784, 13574, 9691, 5511, 1106, 62572, 58405, 54441, 50401, 54216, 15388, 3165, 7327, 40019, 29593, 17346, 21367, 9062, 12972, 741, 4653, 57867, 61991, 49557, 53722, 41257, 45439, 32952, 37110, 24785, 28687};
                        private static long getOutputMinFrameDuration = -7311594291405163575L;

                        private static void Camera2StreamConfigurationMap(int i4, int i5, char c, java.lang.Object[] objArr5) {
                            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                            long[] jArr = new long[i4];
                            rbVar.f2651 = 0;
                            while (rbVar.f2651 < i4) {
                                jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i5] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
                                rbVar.f2651++;
                            }
                            char[] cArr = new char[i4];
                            rbVar.f2651 = 0;
                            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 11) % 128;
                            while (rbVar.f2651 < i4) {
                                int i6 = getHighSpeedVideoFpsRanges + 29;
                                Camera2StreamConfigurationMap = i6 % 128;
                                if (i6 % 2 == 0) {
                                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                                    int i7 = rbVar.f2651;
                                    rbVar.f2651 = 0;
                                } else {
                                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                                    rbVar.f2651++;
                                }
                            }
                            objArr5[0] = new java.lang.String(cArr);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus replenishmentPrepStatus = com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus.INTERNAL_ERROR;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            int defaultSize = android.view.View.getDefaultSize(0, 0);
                            try {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap(28 - defaultSize, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1, (char) (4802 - android.text.TextUtils.indexOf("", "", 0)), objArr5);
                                sb.append(((java.lang.String) objArr5[0]).intern());
                                sb.append(e.getMessage());
                                util.h.xy.v.mc mcVar = new util.h.xy.v.mc(replenishmentPrepStatus, sb.toString());
                                int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap(4 - (pressedStateDuration >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 28, (char) (20356 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr6);
                                java.lang.String intern = ((java.lang.String) objArr6[0]).intern();
                                float length = android.graphics.PointF.length(0.0f, 0.0f);
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap((length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 18, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 33, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr7);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr7[0]).intern());
                                replenishmentPrepListener.onPreparationFailed(mcVar);
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                    });
                    return;
                } catch (java.text.ParseException e2) {
                    e2.getMessage();
                    this.getHighSpeedVideoSizes = null;
                    util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.7
                        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                        private static int getHighSpeedVideoSizes = 1;
                        private static int getInputFormats = 0;
                        private static long getOutputFormats = 8316315740859406372L;
                        private static int getOutputMinFrameDuration = 1;

                        private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i4, java.lang.Object[] objArr5) {
                            int i5 = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
                            getHighSpeedVideoSizes = i5;
                            getHighResolutionOutputSizeshNQ4ISI = (i5 + 57) % 128;
                            char[] charArray = str.toCharArray();
                            util.h.xz.b.a aVar = new util.h.xz.b.a();
                            char[] m27721 = util.h.xz.b.a.m27721(getOutputFormats ^ 7817488252581312552L, charArray, i4);
                            aVar.f2623 = 4;
                            while (aVar.f2623 < m27721.length) {
                                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
                                aVar.f2624 = aVar.f2623 - 4;
                                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputFormats ^ 7817488252581312552L)));
                                aVar.f2623++;
                                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
                            }
                            objArr5[0] = new java.lang.String(m27721, 4, m27721.length - 4);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus replenishmentPrepStatus = com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus.INTERNAL_ERROR;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("驯\uf034騿ၙΆﻳ쏬庤ᨺ遍䎶\udec4驪ဨ쎊帞᪐郆䌔\ude7d", android.text.TextUtils.getOffsetBefore("", 0), objArr5);
                            sb.append(((java.lang.String) objArr5[0]).intern());
                            sb.append(e2.getMessage());
                            util.h.xy.v.mc mcVar = new util.h.xy.v.mc(replenishmentPrepStatus, sb.toString());
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("튉陁틅瘝睅胱뜔ₖ", android.text.TextUtils.getTrimmedLength(""), objArr6);
                            java.lang.String intern = ((java.lang.String) objArr6[0]).intern();
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("㇜ղㆎ\ue52e怑竕ꁚ\udadf놫攋\u200d嫕ㇶ\ue530ꀭ\uda12넄斸⃩娮ㅌ\ue5f8", android.view.Gravity.getAbsoluteGravity(0, 0), objArr7);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr7[0]).intern());
                            replenishmentPrepListener.onPreparationFailed(mcVar);
                            getOutputMinFrameDuration = (getInputFormats + 21) % 128;
                        }
                    });
                    return;
                }
            } catch (org.json.JSONException e3) {
                this.getHighSpeedVideoSizes = null;
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.6
                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                    private static int getHighSpeedVideoSizes = 0;
                    private static int getHighSpeedVideoSizesFor = 1;
                    private static int getOutputFormats;
                    private static char[] getOutputMinFrameDuration = {41896, 41897, 41882, 41892, 41871, 41874, 41970, 41864, 41883, 41911, 41907, 41878, 41875, 41872, 41870, 41919, 41913, 41910, 41887, 41906, 41877, 41881, 41868, 41900, 41909};
                    private static char getInputFormats = 38467;

                    private static void Camera2StreamConfigurationMap(byte b, java.lang.String str, int i4, java.lang.Object[] objArr5) {
                        int i5;
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 13) % 128;
                        char[] charArray = str.toCharArray();
                        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                        char[] cArr = getOutputMinFrameDuration;
                        if (cArr != null) {
                            int length = cArr.length;
                            char[] cArr2 = new char[length];
                            for (int i6 = 0; i6 < length; i6++) {
                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 33) % 128;
                                cArr2[i6] = (char) (cArr[i6] ^ 4042185467053315654L);
                            }
                            cArr = cArr2;
                        }
                        char c = (char) (4042185467053315654L ^ getInputFormats);
                        char[] cArr3 = new char[i4];
                        if (i4 % 2 != 0) {
                            i5 = i4 - 1;
                            cArr3[i5] = (char) (charArray[i5] - b);
                        } else {
                            i5 = i4;
                        }
                        if (i5 > 1) {
                            int i7 = getHighResolutionOutputSizeshNQ4ISI + 79;
                            getHighSpeedVideoSizes = i7 % 128;
                            if (i7 % 2 != 0) {
                                mcVar.f2638 = 1;
                            } else {
                                mcVar.f2638 = 0;
                            }
                            while (mcVar.f2638 < i5) {
                                mcVar.f2641 = charArray[mcVar.f2638];
                                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                                if (mcVar.f2641 == mcVar.f2636) {
                                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 59) % 128;
                                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                                } else {
                                    mcVar.f2639 = mcVar.f2641 / c;
                                    mcVar.f2640 = mcVar.f2641 % c;
                                    mcVar.f2637 = mcVar.f2636 / c;
                                    mcVar.f2635 = mcVar.f2636 % c;
                                    if (mcVar.f2640 == mcVar.f2635) {
                                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                        int i8 = mcVar.f2639;
                                        int i9 = mcVar.f2640;
                                        int i10 = mcVar.f2637;
                                        int i11 = mcVar.f2635;
                                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                                    } else if (mcVar.f2639 == mcVar.f2637) {
                                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                        int i12 = mcVar.f2639;
                                        int i13 = mcVar.f2640;
                                        int i14 = mcVar.f2637;
                                        int i15 = mcVar.f2635;
                                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                                    } else {
                                        int i16 = mcVar.f2639;
                                        int i17 = mcVar.f2635;
                                        int i18 = mcVar.f2637;
                                        int i19 = mcVar.f2640;
                                        cArr3[mcVar.f2638] = cArr[(i16 * c) + i17];
                                        cArr3[mcVar.f2638 + 1] = cArr[(i18 * c) + i19];
                                    }
                                }
                                mcVar.f2638 += 2;
                            }
                        }
                        for (int i20 = 0; i20 < i4; i20++) {
                            cArr3[i20] = (char) (cArr3[i20] ^ 13722);
                        }
                        objArr5[0] = new java.lang.String(cArr3);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus replenishmentPrepStatus = com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus.INTERNAL_ERROR;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap((byte) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 18), "\u000e\u0001\n\u0007\u0017\u0001\u0010\u0011\u0014\u0003\u0014\u000e㘆", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, objArr5);
                        sb.append(((java.lang.String) objArr5[0]).intern());
                        sb.append(e3.getMessage());
                        util.h.xy.v.mc mcVar = new util.h.xy.v.mc(replenishmentPrepStatus, sb.toString());
                        byte normalizeMetaState = (byte) (125 - android.view.KeyEvent.normalizeMetaState(0));
                        int i4 = getHighSpeedVideoSizesFor;
                        getOutputFormats = (i4 + 121) % 128;
                        getOutputFormats = (i4 + 51) % 128;
                        try {
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(normalizeMetaState, "\f\u0017\u0017\u000f", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 4, objArr6);
                            java.lang.String intern = ((java.lang.String) objArr6[0]).intern();
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap((byte) (11 - android.view.View.combineMeasuredStates(0, 0)), "\f\u0018\u0001\t\u0006\u0017㗙㗙\u0010\u000b\f\r\u0002\u0007", 14 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr7);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr7[0]).intern());
                            replenishmentPrepListener.onPreparationFailed(mcVar);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                });
                return;
            }
        }
        this.getHighSpeedVideoSizes = null;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.15
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes;
            private static int getOutputMinFrameDuration;
            private static char[] getOutputFormats = {40013, 12929, 49640, 36914, 31821, 53919, 8684, 28737, 50968, 5706, 25771, 48123, 2773, 22881, 43120, 65215, 19855, 40140};
            private static long getInputSizeshNQ4ISI = 4157450391110759121L;

            private static void Camera2StreamConfigurationMap(int i4, int i5, char c, java.lang.Object[] objArr5) {
                util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                long[] jArr = new long[i4];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i4) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 121) % 128;
                    jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i5] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputSizeshNQ4ISI))) ^ c;
                    rbVar.f2651++;
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 117) % 128;
                }
                char[] cArr = new char[i4];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i4) {
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 65) % 128;
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    rbVar.f2651++;
                }
                objArr5[0] = new java.lang.String(cArr);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 63) % 128;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(4 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr5);
                java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
                int size = android.view.View.MeasureSpec.getSize(0);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(14 - size, android.graphics.Color.red(0) + 4, (char) (57374 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), objArr6);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr6[0]).intern());
                replenishmentPrepListener.onPreparationComplete();
                Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 121) % 128;
            }
        });
    }

    private void getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.provisioning.listener.AuthenticationStateListener authenticationStateListener, final java.lang.String str) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.ma.2
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // java.lang.Runnable
            public final void run() {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 11) % 128;
                util.h.xy.ca.ma.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ma.this, authenticationStateListener, str);
                int i = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = ((i & 19) + (i | 19)) % 128;
            }
        }).start();
        getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 1) % 128;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputFormats = (char) 27244;
        getOutputSizes = (char) 4509;
        getHighResolutionOutputSizeshNQ4ISI = (char) 21671;
        getOutputFormats = (char) 44492;
        getHighSpeedVideoFpsRangesFor = -1231763885;
    }
}
