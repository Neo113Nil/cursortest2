package util.h.xy.bv;

/* loaded from: classes5.dex */
public class rf {
    private static int Camera2StreamConfigurationMap = 1;
    private static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> getHighResolutionOutputSizeshNQ4ISI = null;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static boolean getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static int getOutputMinFrameDuration;

    static /* synthetic */ com.gemalto.mfs.mwsdk.utils.async.AsyncResult getHighResolutionOutputSizeshNQ4ISI(com.gemalto.mfs.mwsdk.utils.async.AsyncResult asyncResult) {
        int i = getOutputFormats;
        int i2 = i + 65;
        Camera2StreamConfigurationMap = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = asyncResult;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i + 5;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            return asyncResult;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        int i = getOutputFormats + 37;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return getInputFormats;
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getInputFormats = "rf";
        getHighResolutionOutputSizeshNQ4ISI = null;
        Camera2StreamConfigurationMap = (getOutputFormats + 27) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25756(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) {
        if (str == null || str.equalsIgnoreCase("")) {
            return new util.h.xy.an.ra(null, false, util.h.xy.i.b.f2229, com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.TOKENID_MISSING.getIntValue());
        }
        if (digitalizedCardState.toString().equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.UNKNOWN.toString())) {
            return new util.h.xy.an.ra(null, false, util.h.xy.i.b.f2230, 3000);
        }
        try {
            if (util.h.xy.ak.ma.f84.m24982(str) == 4) {
                util.h.xy.k.mb.m26930(str, digitalizedCardState, util.h.xy.k.ra.f2243.m26940(str).booleanValue());
            }
            if (util.h.xy.k.ra.f2243.m26968(str)) {
                if (digitalizedCardState == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
                    util.h.xy.d.d result = util.h.xy.k.ra.f2243.m26950(str).getResult();
                    if (result != null) {
                        if (result.m26179() != null && !result.m26179().isEmpty()) {
                            util.h.xy.f.b.f2201.m26771(result.m26179(), true);
                        }
                        util.h.xy.f.b.f2201.m26771(result.m26180(), false);
                    }
                } else {
                    util.h.xy.k.ra.f2243.m26958(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, util.h.xy.k.ra.f2243.m26950(str).getResult());
                }
            }
            try {
                if (digitalizedCardState == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
                    int i = Camera2StreamConfigurationMap + 1;
                    getOutputFormats = i % 128;
                    if (i % 2 != 0) {
                        util.h.xy.f.b.f2201.m26759(str);
                        throw null;
                    }
                    java.lang.String m26759 = util.h.xy.f.b.f2201.m26759(str);
                    if (m26759 != null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u009b\u0082\u009c\u009d", objArr);
                        boolean equalsIgnoreCase = m26759.equalsIgnoreCase(((java.lang.String) objArr[0]).intern());
                        int i2 = getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        Camera2StreamConfigurationMap = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw new java.lang.NullPointerException();
                        }
                        if (!equalsIgnoreCase) {
                        }
                    }
                    return Camera2StreamConfigurationMap(str);
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "\u009e\u009d\u009c\u009a\u0097\u009b\u0085\u009a\u0083\u0084\u0085\u0089\u008a\u0085\u008d\u0092\u0087\u0092\u0082\u0095\u0088\u0087\u0097\u0085\u0097\u0099", objArr2);
                return new util.h.xy.an.ra(null, true, ((java.lang.String) objArr2[0]).intern(), 0);
            } catch (org.json.JSONException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0) + 127, "\u0085\u0098\u0095\u0088\u0087\u0097\u0092\u0091\u0094\u0087\u0096\u008d\u0095\u0085\u0088\u0094\u008e\u0093\u0085\u0092\u008d\u0089\u008d\u0088\u0085\u008e\u0092\u0085\u0093\u0088\u0092\u0085\u008d\u0089\u0087\u008d\u0091\u0090\u0085\u008f\u0088\u008e\u0088\u0088\u008d\u0085\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
                sb.append(e.getMessage());
                return new util.h.xy.an.ra(null, false, sb.toString(), 583);
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
            return new util.h.xy.an.ra(null, false, e2.getMessage(), e2.getmErrorCode());
        } catch (org.json.JSONException e3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), "\u0085\u0098\u0095\u0088\u0087\u0097\u0092\u0091\u0094\u0087\u0096\u008d\u0095\u0085\u0088\u0094\u008e\u0093\u0085\u0092\u008d\u0089\u008d\u0088\u0085\u008e\u0092\u0085\u0093\u0088\u0092\u0085\u008d\u0089\u0087\u008d\u0091\u0090\u0085\u008f\u0088\u008e\u0088\u0088\u008d\u0085\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                sb2.append(((java.lang.String) objArr4[0]).intern());
                sb2.append(e3.getMessage());
                return new util.h.xy.an.ra(null, false, sb2.toString(), 583);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> Camera2StreamConfigurationMap(java.lang.String str) {
        if (new util.h.xy.cg.ma().m25915(str)) {
            getOutputFormats = (Camera2StreamConfigurationMap + 53) % 128;
            return getHighSpeedVideoSizes(str);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, "\u0095\u008d\u0095\u008d\u008d\u008b\u0085\u0092\u008e\u008b\u0085\u0089\u008a\u0085\u0092\u008b\u008d¡ \u0089\u008a\u008b\u008d\u0091\u0086\u008d\u009f", objArr);
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(null, true, ((java.lang.String) objArr[0]).intern(), 0);
        getOutputFormats = (Camera2StreamConfigurationMap + 33) % 128;
        return raVar;
    }

    private com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> getHighSpeedVideoSizes(final java.lang.String str) {
        com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService provisioningBusinessService = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        provisioningBusinessService.sendRequestForReplenishment(str, new com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener() { // from class: util.h.xy.bv.rf.3
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoSizes = 0;
            private static int getInputFormats = 0;
            private static int getInputSizeshNQ4ISI = 1;
            private static char[] getOutputMinFrameDuration = {40019, 9560, 60937, 47065, 30868, 579, 51968, 36054, 21897, 8048, 41020, 27131, 12965, 62509, 48416, 18166, 4065, 53390, 39500, 8982, 58578, 44424, 30554, 14358, 49607, 35496, 19573};
            private static long getOutputFormats = -3801809136574257859L;

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
                util.h.xy.bv.rf.getHighResolutionOutputSizeshNQ4ISI(new util.h.xy.an.ra(null, false, provisioningServiceError.getErrorMessage(), provisioningServiceError.getCpsErrorCode()));
                countDownLatch.countDown();
                getInputSizeshNQ4ISI = (getInputFormats + 93) % 128;
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onUnsupportedPushContent(android.os.Bundle bundle) {
                int i = getInputSizeshNQ4ISI + 117;
                getInputFormats = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onServerMessage(java.lang.String str2, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage) {
                int i = getInputSizeshNQ4ISI + 15;
                getInputFormats = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onComplete() {
                util.h.xy.bv.rf.getHighResolutionOutputSizeshNQ4ISI();
                int rgb = android.graphics.Color.rgb(0, 0, 0);
                long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                char trimmedLength = (char) android.text.TextUtils.getTrimmedLength("");
                java.lang.Object[] objArr = new java.lang.Object[1];
                int i = (-16777189) - rgb;
                int i2 = (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) - 1;
                util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                long[] jArr = new long[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 103) % 128;
                    jArr[rbVar.f2651] = (((char) (getOutputMinFrameDuration[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputFormats))) ^ trimmedLength;
                    rbVar.f2651++;
                }
                char[] cArr = new char[i];
                loop1: while (true) {
                    rbVar.f2651 = 0;
                    while (rbVar.f2651 < i) {
                        int i3 = Camera2StreamConfigurationMap + 23;
                        getHighSpeedVideoSizes = i3 % 128;
                        if (i3 % 2 != 0) {
                            break;
                        }
                        cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                        rbVar.f2651++;
                    }
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    int i4 = rbVar.f2651;
                }
                java.lang.String str2 = new java.lang.String(cArr);
                int i5 = getHighSpeedVideoSizes + 97;
                Camera2StreamConfigurationMap = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str2;
                util.h.xy.bv.rf.getHighResolutionOutputSizeshNQ4ISI(new util.h.xy.an.ra(null, true, ((java.lang.String) objArr[0]).intern(), 0));
                countDownLatch.countDown();
                getInputSizeshNQ4ISI = (getInputFormats + 51) % 128;
            }
        });
        try {
            countDownLatch.await(15L, java.util.concurrent.TimeUnit.SECONDS);
            getOutputFormats = (Camera2StreamConfigurationMap + 61) % 128;
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> asyncResult = getHighResolutionOutputSizeshNQ4ISI;
        if (asyncResult == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - android.view.View.MeasureSpec.getMode(0), "\u0092\u0094\u008e\u0085\u008d¡\u008a\u009a\u0085\u0092\u008b\u008d¡ \u0089\u008a\u008b\u008d\u0091\u0086\u008d\u009f", objArr);
            getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr[0]).intern(), -104);
        } else {
            asyncResult.isSuccessful();
            getHighResolutionOutputSizeshNQ4ISI.getErrorMessage();
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> asyncResult2 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (getOutputFormats + 37) % 128;
        return asyncResult2;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 111) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getOutputMinFrameDuration);
        if (!getHighSpeedVideoFpsRanges) {
            if (!getInputSizeshNQ4ISI) {
                throw null;
            }
            int i4 = getHighSpeedVideoSizes + 43;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 19) % 128;
        objArr[0] = str2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m25757(org.json.JSONObject jSONObject) throws org.json.JSONException {
        int i = Camera2StreamConfigurationMap;
        getOutputFormats = (i + 17) % 128;
        if (jSONObject == null) {
            getOutputFormats = (i + 83) % 128;
            return false;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u0095\u008b\u0087¡¡\u008e\u0097\u0095\u0088\u0087\u0097¢\u008e\u0088\u0086", objArr);
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u008b\u008e\u008a\u0092£\u0087", objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u009e¦\u009c¥\u0083\u009f\u0090¤\u009a\u009c\u0084\u009c", objArr3);
        java.lang.String optString = jSONObject2.optString(intern, ((java.lang.String) objArr3[0]).intern());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - android.view.KeyEvent.normalizeMetaState(0), "\u009e¦\u009c¥\u0083\u009f\u0090¤\u009e\u0097\u009b¦\u0090\u009e\u009f", objArr4);
        if (!optString.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
            return false;
        }
        Camera2StreamConfigurationMap = (getOutputFormats + 3) % 128;
        return true;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = new char[]{64210, 64197, 64217, 64222, 64264, 64184, 64203, 64186, 64165, 64179, 64190, 64177, 64183, 64185, 64254, 64216, 64188, 64164, 64163, 64167, 64180, 64182, 64213, 64226, 64212, 64196, 64235, 64211, 64198, 64215, 64218, 64176, 64191, 64166, 64181, 64201, 64214, 64220};
        getOutputMinFrameDuration = -1074857176;
        getInputSizeshNQ4ISI = true;
        getHighSpeedVideoFpsRanges = true;
    }
}
