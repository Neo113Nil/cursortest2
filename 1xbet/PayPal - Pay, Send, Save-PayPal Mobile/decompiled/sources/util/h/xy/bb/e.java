package util.h.xy.bb;

/* loaded from: classes5.dex */
public class e implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation {
    private static int Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char[] getHighSpeedVideoSizes = null;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputMinFrameDuration;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final java.lang.String f919;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector getOutputFormats;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData getOutputStallDurationlomOqCM;

    public static /* synthetic */ void $r8$lambda$2ejCTRfmLn0FdBhY7_GXy9B6J2M(boolean[] zArr, java.util.concurrent.CountDownLatch countDownLatch, util.h.xy.bv.b.ma.EnumC0265b enumC0265b) {
        boolean z = zArr[0];
        if (enumC0265b == util.h.xy.bv.b.ma.EnumC0265b.f1057) {
            int i = getOutputMinFrameDuration + 67;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0 ? !zArr[0] : !zArr[1]) {
                countDownLatch.countDown();
                zArr[0] = true;
                getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 17) % 128;
            }
        }
        if (enumC0265b == util.h.xy.bv.b.ma.EnumC0265b.f1056) {
            countDownLatch.countDown();
        }
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 17) % 128;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector Camera2StreamConfigurationMap(util.h.xy.bb.e eVar) {
        int i = getOutputMinFrameDuration;
        getInputSizeshNQ4ISI = (i + 17) % 128;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector iDVMethodSelector = eVar.getOutputFormats;
        int i2 = i + 71;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return iDVMethodSelector;
        }
        throw null;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.e eVar, byte[] bArr) {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 31) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0086\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - android.graphics.Color.argb(0, 0, 0, 0), "\u0085\u0086\u0082\u0088\u0087\u0086\u0082\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager cardLifeCycleManager = com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardLifeCycleManager();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        cardLifeCycleManager.deleteCard(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener() { // from class: util.h.xy.bb.e.9
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoSizes;
            private static int getHighSpeedVideoSizesFor;
            private static char[] getInputFormats = {9097, 37370, 18258, 13515, 40005, 11838, 63644, 35597, 21907, 57454, 45783, 32038, 3894, 55733, 40005, 11838, 63644, 35597, 21907, 57454, 45783, 32038, 3894, 55715};
            private static long getOutputMinFrameDuration = -4809022985537507730L;

            private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr3) {
                util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                long[] jArr = new long[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 21) % 128;
                    jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
                    rbVar.f2651++;
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 51) % 128;
                }
                char[] cArr = new char[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 111) % 128;
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    rbVar.f2651++;
                }
                objArr3[0] = new java.lang.String(cArr);
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
            public final void onSuccess(java.lang.String str) {
                int i = getHighSpeedVideoSizesFor;
                getHighResolutionOutputSizeshNQ4ISI = (i + 119) % 128;
                getHighResolutionOutputSizeshNQ4ISI = (i + 53) % 128;
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(4 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), android.text.TextUtils.getOffsetAfter("", 0), (char) (49092 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 9, 4 - android.graphics.Color.red(0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                    java.lang.String str2 = util.h.xy.bb.e.f919;
                    countDownLatch.countDown();
                    getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
            public final void onError(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
                getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(4 - android.graphics.Color.green(0), android.view.View.MeasureSpec.getMode(0), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49091), objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                int indexOf = android.text.TextUtils.indexOf("", "");
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(indexOf + 10, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 14, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), objArr4);
                util.h.xy.am.ma.m25029(intern2, ((java.lang.String) objArr4[0]).intern());
                java.lang.String str2 = util.h.xy.bb.e.f919;
                countDownLatch.countDown();
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 55) % 128;
            }
        });
        try {
            countDownLatch.await(30L, java.util.concurrent.TimeUnit.SECONDS);
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 89) % 128;
        } catch (java.lang.InterruptedException unused) {
        }
        int i = getOutputMinFrameDuration;
        int i2 = i + 105;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 5;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(util.h.xy.au.rg rgVar, java.lang.String str) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException, org.json.JSONException {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 101) % 128;
        getHighSpeedVideoFpsRangesFor(rgVar, str);
        int i = getOutputMinFrameDuration + 21;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(util.h.xy.bb.e eVar, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 97) % 128;
        eVar.getHighSpeedVideoSizes(mGDigitizationListener, mobileGatewayError);
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 39) % 128;
    }

    static /* synthetic */ byte[] getHighSpeedVideoFpsRanges(util.h.xy.bb.e eVar) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException, org.json.JSONException {
        int i = getInputSizeshNQ4ISI + 105;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            eVar.getHighSpeedVideoFpsRangesFor();
            throw null;
        }
        byte[] highSpeedVideoFpsRangesFor = eVar.getHighSpeedVideoFpsRangesFor();
        int i2 = getOutputMinFrameDuration + 15;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor(util.h.xy.bb.e eVar) {
        int i = getInputSizeshNQ4ISI + 27;
        int i2 = i % 128;
        getOutputMinFrameDuration = i2;
        java.lang.String str = eVar.getOutputSizeshNQ4ISI;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = i2 + 33;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(util.h.xy.bb.e eVar, java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.au.mb mbVar;
        java.lang.String intern;
        java.lang.Object obj;
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 29) % 128;
        java.lang.String tokenizedCardId = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getTokenizedCardId(str);
        if (tokenizedCardId == null) {
            if (getHighResolutionOutputSizeshNQ4ISI()) {
                getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 59) % 128;
                tokenizedCardId = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getTokenizedCardId(str);
                if (tokenizedCardId != null) {
                    int i = getInputSizeshNQ4ISI + 105;
                    getOutputMinFrameDuration = i % 128;
                    if (i % 2 != 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(27056 << (android.os.SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)), "\u0086\u0083\u0082\u0081", objArr);
                        intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(45 % (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u009b\u0088\u0082\u0087\u0087¢\u0086\u0086\u0088\u0087\u0086\u0082\u0085", objArr2);
                        obj = objArr2[0];
                    } else {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0086\u0083\u0082\u0081", objArr3);
                        intern = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, "\u009b\u0088\u0082\u0087\u0087¢\u0086\u0086\u0088\u0087\u0086\u0082\u0085", objArr4);
                        obj = objArr4[0];
                    }
                } else {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0086\u0083\u0082\u0081", objArr5);
                    java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("ᱺ\uf0c3씧\uda78꺤茜遳擑礗乪⊬㝿ѧᣆ", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 60541, objArr6);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr6[0]).intern());
                    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u0090\u0092\u008e\u008f\u008d¤\u0091\u008b\u009f\u008f\u0097\u008d\u008c\u008f\u0097\u0094\u0087\u0091\u0090\u0095\u008d\u0086", objArr7);
                    mbVar = new util.h.xy.au.mb(mGErrorCode, ((java.lang.String) objArr7[0]).intern());
                }
            } else {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u0086\u0083\u0082\u0081", objArr8);
                java.lang.String intern3 = ((java.lang.String) objArr8[0]).intern();
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱺ大雯펤ऴ䘐菋\uf895㘷珮ꢴ\ue633⌗颹", 17737 - android.view.View.getDefaultSize(0, 0), objArr9);
                util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr9[0]).intern());
                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode2 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.view.View.MeasureSpec.getSize(0) + 127, "\u0090\u0092\u008e\u008f\u008d¤\u0091\u008b\u009f\u008f\u0097\u008d\u008c\u008f\u0097\u0094\u0087\u0091\u0090\u0095\u008d\u0086", objArr10);
                mbVar = new util.h.xy.au.mb(mGErrorCode2, ((java.lang.String) objArr10[0]).intern());
            }
            eVar.getHighSpeedVideoSizes(mGDigitizationListener, mbVar);
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 125) % 128;
        }
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 25) % 128;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u0086\u0083\u0082\u0081", objArr11);
        intern = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getTapTimeout() >> 16), "£\u0088\u0082\u0087\u0087¢\u0086\u0086\u0088\u0087\u0086\u0082\u0085", objArr12);
        obj = objArr12[0];
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
        eVar.getHighSpeedVideoSizes(str, tokenizedCardId, mGDigitizationListener);
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 125) % 128;
    }

    static /* synthetic */ util.h.xy.az.b getHighSpeedVideoSizes(util.h.xy.bb.e eVar, byte[] bArr, byte[] bArr2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws util.h.xy.az.ma, org.json.JSONException {
        int i = getOutputMinFrameDuration + 1;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return eVar.getHighSpeedVideoSizes(bArr, bArr2, str, str2, str3, str4);
        }
        eVar.getHighSpeedVideoSizes(bArr, bArr2, str, str2, str3, str4);
        throw null;
    }

    static {
        Camera2StreamConfigurationMap();
        f919 = "e";
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 105) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25305(java.lang.String str) {
        int i = getOutputMinFrameDuration + 25;
        int i2 = i % 128;
        getInputSizeshNQ4ISI = i2;
        if (i % 2 != 0) {
            this.getOutputSizeshNQ4ISI = str;
            int i3 = i2 + 27;
            getOutputMinFrameDuration = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getOutputSizeshNQ4ISI = str;
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 51) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighResolutionOutputSizeshNQ4ISI ^ (-7508379876853140581L));
            dVar.f2629++;
            int i2 = Camera2StreamConfigurationMap + 37;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 5;
            }
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 65) % 128;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.lang.String m25306() {
        java.lang.String intern;
        java.lang.Object obj;
        int i = getInputSizeshNQ4ISI + 101;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(55 >>> (android.view.ViewConfiguration.getTapTimeout() - 16), "\u0084\u0083\u0082\u0081", objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.View.getDefaultSize(0, 1) * 15, "\u0083\u0086\u0085\u0089\u0088\u0087\u0086\u0082\u0085", objArr2);
            obj = objArr2[0];
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.view.ViewConfiguration.getTapTimeout() >> 16) + 127, "\u0084\u0083\u0082\u0081", objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.View.getDefaultSize(0, 0) + 127, "\u0083\u0086\u0085\u0089\u0088\u0087\u0086\u0082\u0085", objArr4);
            obj = objArr4[0];
        }
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
        java.lang.String str = this.getOutputSizeshNQ4ISI;
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 121) % 128;
        return str;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25308(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure threeDSecure) {
        int i = getOutputMinFrameDuration;
        getInputSizeshNQ4ISI = (i + 1) % 128;
        this.getOutputSizes = threeDSecure;
        int i2 = i + 79;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation
    public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure getThreeDSecure() {
        java.lang.String intern;
        java.lang.Object obj;
        int i = getOutputMinFrameDuration + 31;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(25107 % android.view.MotionEvent.axisFromString(""), "\u0084\u0083\u0082\u0081", objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ᱺ꧕看㵎쫼郞师\ue467놵", 46524 >>> android.text.TextUtils.indexOf("", io.ktor.util.date.GMTDateParser.MINUTES), objArr2);
            obj = objArr2[0];
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.MotionEvent.axisFromString("") + 128, "\u0084\u0083\u0082\u0081", objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ᱺ꧕看㵎쫼郞师\ue467놵", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 46524, objArr4);
            obj = objArr4[0];
        }
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
        return this.getOutputSizes;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation
    public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData getAppToAppData() {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 103) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ᱺ彩驳핪ဌ博蹕쥛ч䝅", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 17160, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData appToAppData = this.getOutputStallDurationlomOqCM;
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 71) % 128;
            return appToAppData;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25307(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData appToAppData) {
        int i = getOutputMinFrameDuration;
        getInputSizeshNQ4ISI = (i + 69) % 128;
        this.getOutputStallDurationlomOqCM = appToAppData;
        int i2 = i + 51;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162 A[Catch: all -> 0x01ee, TryCatch #7 {, blocks: (B:3:0x0001, B:5:0x0010, B:6:0x003b, B:7:0x006b, B:16:0x008d, B:32:0x0107, B:35:0x0162, B:36:0x019f, B:38:0x01ab, B:48:0x01be, B:49:0x01bf, B:50:0x01c4, B:66:0x01c7, B:67:0x01ca, B:56:0x013a, B:62:0x015b, B:71:0x01cb, B:72:0x01e7, B:73:0x01e8, B:74:0x01ed, B:75:0x0040, B:44:0x01b7, B:45:0x01bc), top: B:2:0x0001, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ab A[Catch: all -> 0x01ee, TRY_LEAVE, TryCatch #7 {, blocks: (B:3:0x0001, B:5:0x0010, B:6:0x003b, B:7:0x006b, B:16:0x008d, B:32:0x0107, B:35:0x0162, B:36:0x019f, B:38:0x01ab, B:48:0x01be, B:49:0x01bf, B:50:0x01c4, B:66:0x01c7, B:67:0x01ca, B:56:0x013a, B:62:0x015b, B:71:0x01cb, B:72:0x01e7, B:73:0x01e8, B:74:0x01ed, B:75:0x0040, B:44:0x01b7, B:45:0x01bc), top: B:2:0x0001, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bf A[Catch: all -> 0x01ee, TryCatch #7 {, blocks: (B:3:0x0001, B:5:0x0010, B:6:0x003b, B:7:0x006b, B:16:0x008d, B:32:0x0107, B:35:0x0162, B:36:0x019f, B:38:0x01ab, B:48:0x01be, B:49:0x01bf, B:50:0x01c4, B:66:0x01c7, B:67:0x01ca, B:56:0x013a, B:62:0x015b, B:71:0x01cb, B:72:0x01e7, B:73:0x01e8, B:74:0x01ed, B:75:0x0040, B:44:0x01b7, B:45:0x01bc), top: B:2:0x0001, inners: #4 }] */
    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void invokeIdvSelection(final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        java.lang.String intern;
        java.lang.String str;
        java.lang.String intern2;
        java.lang.Object[] objArr;
        int i;
        byte[] m25216;
        synchronized (this) {
            int i2 = getOutputMinFrameDuration + 11;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(25462 % (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr2);
                intern = ((java.lang.String) objArr2[0]).intern();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱺ箣폧⬘茤᭶犹쫶", (android.view.ViewConfiguration.getLongPressTimeout() >> 31) + 32556, objArr3);
                str = (java.lang.String) objArr3[0];
            } else {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr4);
                intern = ((java.lang.String) objArr4[0]).intern();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱺ箣폧⬘茤᭶犹쫶", 26573 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr5);
                str = (java.lang.String) objArr5[0];
            }
            util.h.xy.am.ma.m25027(intern, str.intern());
            int i3 = getOutputMinFrameDuration + 43;
            getInputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
            if (mGDigitizationListener == null) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱲ䁊ꑷࠝ氯탁㓵颇ﳶ⅘蕽\ue96f䴌넨ᗜ禭\udd8cƶ昔쩷⸏鈳\uf62c", android.text.TextUtils.getTrimmedLength("") + 23581, objArr6);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr6[0]).intern());
            }
            byte[] bArr = null;
            java.lang.String str2 = null;
            byte[] bArr2 = null;
            byte[] bArr3 = null;
            try {
                try {
                    if (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.IDV_METHOD_NOT_SELECTED != getState() && com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.OTP_NEEDED != getState()) {
                        int i4 = getOutputMinFrameDuration + 85;
                        getInputSizeshNQ4ISI = i4 % 128;
                        if (i4 % 2 == 0) {
                            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState pendingCardActivationState = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.WEB_3DS_NEEDED;
                            getState();
                            throw new java.lang.NullPointerException();
                        }
                        if (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.WEB_3DS_NEEDED != getState() && com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.APP2APP_NEEDED != getState()) {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0092\u0097\u008d\u0097\u0096\u0091\u008b\u009f\u008f\u0097\u008d\u008c\u008f\u0097\u0094\u008d\u0091\u0090\u0095\u008d\u0094\u0091\u0093\u008b\u008f\u0090\u008b\u0092\u0082\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u0083", objArr7);
                            throw new java.lang.IllegalStateException(((java.lang.String) objArr7[0]).intern());
                        }
                    }
                    m25216 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25216(this.getOutputSizeshNQ4ISI);
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                try {
                    this.getOutputFormats = new util.h.xy.bb.c(util.h.xy.au.g.m25127().m25151(m25216).getBytes(), this.getOutputSizeshNQ4ISI, mGDigitizationListener);
                    util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.bb.e.5
                        private static int Camera2StreamConfigurationMap = 1;
                        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                        private static int getHighSpeedVideoSizes = 1;
                        private static int getInputFormats;
                        private static char[] getHighSpeedVideoSizesFor = {43435, 63380, 5608, 46029, 40005, 49778, 8196, 34345, 58531, 19175, 43136, 3802, 27990, 54121, 12566, 38861};
                        private static long getInputSizeshNQ4ISI = -973208492481461726L;

                        private static void getHighResolutionOutputSizeshNQ4ISI(int i5, int i6, char c, java.lang.Object[] objArr8) {
                            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                            long[] jArr = new long[i5];
                            rbVar.f2651 = 0;
                            while (rbVar.f2651 < i5) {
                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 69) % 128;
                                jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i6] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputSizeshNQ4ISI))) ^ c;
                                rbVar.f2651++;
                            }
                            char[] cArr = new char[i5];
                            rbVar.f2651 = 0;
                            while (rbVar.f2651 < i5) {
                                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                                rbVar.f2651++;
                            }
                            java.lang.String str3 = new java.lang.String(cArr);
                            int i7 = getHighResolutionOutputSizeshNQ4ISI + 79;
                            getHighSpeedVideoSizes = i7 % 128;
                            if (i7 % 2 == 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            objArr8[0] = str3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int edgeSlop;
                            int mode;
                            int i5;
                            int i6 = getInputFormats + 125;
                            Camera2StreamConfigurationMap = i6 % 128;
                            if (i6 % 2 == 0) {
                                edgeSlop = 3 >>> (android.view.ViewConfiguration.getEdgeSlop() << 77);
                                mode = android.view.View.MeasureSpec.getMode(0);
                                i5 = 18913;
                            } else {
                                edgeSlop = (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 4;
                                mode = android.view.View.MeasureSpec.getMode(0);
                                i5 = 13799;
                            }
                            try {
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(edgeSlop, mode, (char) (i5 + ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr8);
                                java.lang.String intern3 = ((java.lang.String) objArr8[0]).intern();
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(12 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 5 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
                                util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr9[0]).intern());
                                mGDigitizationListener.onSelectIDVMethod(util.h.xy.bb.e.Camera2StreamConfigurationMap(util.h.xy.bb.e.this));
                                Camera2StreamConfigurationMap = (getInputFormats + 111) % 128;
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                        }
                    });
                    if (m25216 != null) {
                        java.util.Arrays.fill(m25216, (byte) 0);
                    }
                    objArr = false;
                } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e) {
                    e = e;
                    bArr3 = m25216;
                    e.getMessage();
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("ᱻ쀭\ua48e襲淈击㘞\u1afcｂꌴ螜摼䣜Ⲵᅐ\uf5f5\uda4f븻抍䜭⯌ྐྵ\uec07탤딆餴綐≪ې\ueaa2켇돤逰", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 56417, objArr8);
                    intern2 = ((java.lang.String) objArr8[0]).intern();
                    if (bArr3 != null) {
                        java.util.Arrays.fill(bArr3, (byte) 0);
                    }
                    str2 = intern2;
                    objArr = true;
                    if (objArr != false) {
                    }
                    i = getInputSizeshNQ4ISI + 27;
                    int i5 = i % 128;
                    getOutputMinFrameDuration = i5;
                    if (i % 2 != 0) {
                    }
                } catch (org.json.JSONException e2) {
                    e = e2;
                    bArr = m25216;
                    e.getMessage();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u008d\u0097\u008d\u0090\u0091\u0093\u008b\u008f\u0096\u0095\u008d\u009d\u0091\u0095\u009f\u0095\u0095 ", objArr9);
                    intern2 = ((java.lang.String) objArr9[0]).intern();
                    if (bArr != null) {
                        java.util.Arrays.fill(bArr, (byte) 0);
                    }
                    str2 = intern2;
                    objArr = true;
                    if (objArr != false) {
                    }
                    i = getInputSizeshNQ4ISI + 27;
                    int i52 = i % 128;
                    getOutputMinFrameDuration = i52;
                    if (i % 2 != 0) {
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bArr2 = m25216;
                    if (bArr2 != null) {
                        java.util.Arrays.fill(bArr2, (byte) 0);
                    }
                    throw th;
                }
            } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e3) {
                e = e3;
            } catch (org.json.JSONException e4) {
                e = e4;
            }
            if (objArr != false) {
                util.h.xy.au.mb mbVar = new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, str2);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u0086\u0083\u0082\u0081", objArr10);
                java.lang.String intern3 = ((java.lang.String) objArr10[0]).intern();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), " ¡\u0088\u0084\u0083\u0088\u0087\u0086\u0082\u0085", objArr11);
                util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr11[0]).intern());
                mGDigitizationListener.onError(this.getOutputSizeshNQ4ISI, mbVar);
            }
            i = getInputSizeshNQ4ISI + 27;
            int i522 = i % 128;
            getOutputMinFrameDuration = i522;
            if (i % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            int i6 = i522 + 17;
            getInputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation
    public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState getState() {
        java.lang.String intern;
        java.lang.String str;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState highSpeedVideoSizes;
        synchronized (this) {
            int i = getOutputMinFrameDuration + 55;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(45 - android.view.View.MeasureSpec.getSize(0), "\u0084\u0083\u0082\u0081", objArr);
                intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.widget.ExpandableListView.getPackedPositionType(0L) * 7, "\u0084\u0089\u0088\u0087\u0086\u0082\u0085", objArr2);
                str = (java.lang.String) objArr2[0];
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.view.View.MeasureSpec.getSize(0) + 127, "\u0084\u0083\u0082\u0081", objArr3);
                intern = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - android.widget.ExpandableListView.getPackedPositionType(0L), "\u0084\u0089\u0088\u0087\u0086\u0082\u0085", objArr4);
                str = (java.lang.String) objArr4[0];
            }
            util.h.xy.am.ma.m25027(intern, str.intern());
            highSpeedVideoSizes = getHighSpeedVideoSizes();
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 5) % 128;
        }
        return highSpeedVideoSizes;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation
    public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt getCardArt() {
        java.lang.String intern;
        java.lang.String str;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt highSpeedVideoFpsRanges;
        synchronized (this) {
            int i = getOutputMinFrameDuration + 35;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)) + 6233, "\u0084\u0083\u0082\u0081", objArr);
                intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(119 / (android.view.ViewConfiguration.getMaximumDrawingCacheSize() - 108), "\u0087\u0086\u0089\u0088\u0087\u0086\u0082\u0085", objArr2);
                str = (java.lang.String) objArr2[0];
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr3);
                intern = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0087\u0086\u0089\u0088\u0087\u0086\u0082\u0085", objArr4);
                str = (java.lang.String) objArr4[0];
            }
            util.h.xy.am.ma.m25027(intern, str.intern());
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 111) % 128;
        }
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r9 != null) goto L10;
     */
    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void activate(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        synchronized (this) {
            int i = getOutputMinFrameDuration + 95;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(30733 % android.text.TextUtils.lastIndexOf("", 'n', 0), "\u0084\u0083\u0082\u0081", objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱺ䐃겧ᔸ綤Ꙟກ", 10380 % android.view.View.MeasureSpec.getMode(0), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                if (bArr != null) {
                    if (bArr.length != 0) {
                        if (mGDigitizationListener == null) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("ᱺ❮樫근\uf0ae㑊缒苐얂ॖ䱫霣\udab2ᶷⅉ搚꿚\uf292㙒祠밸잳\u0abb乀鄈퓁ᾛ⍉昢ꤩ\uecf5㟹筰븒쇀ҙ", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 15161, objArr3);
                            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
                        }
                        if (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.OTP_NEEDED != getState()) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("ᱷⵓ繎轖\ud85e\ue958㩈䬋鑶ꕀ\uf64eݻ偳慷뉳쌳౭嵬湺뽣젢ᥲ⨈笚萂픐\ue650㝀䁊鄚ꈁ\uf30f㰻䴾鸬꼲\uf836ॱ娅欏됐앥ᘩ⟌烔膞틀\ue393ⳡ緹軸", 12547 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
                            throw new java.lang.IllegalStateException(((java.lang.String) objArr4[0]).intern());
                        }
                        Camera2StreamConfigurationMap(bArr, mGDigitizationListener);
                        int i2 = getOutputMinFrameDuration + 5;
                        getInputSizeshNQ4ISI = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                    }
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱱⅩ晨\uab17\ue851ⵐ牂띅\uf449㥑縀荽쁿Թ䩺车챢ᅡ", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 15620, objArr5);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0084\u0083\u0082\u0081", objArr6);
            java.lang.String intern2 = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ᱺ䐃겧ᔸ綤Ꙟກ", android.view.View.MeasureSpec.getMode(0) + 22637, objArr7);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr7[0]).intern());
        }
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 3;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 13) % 128;
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getInputFormats);
        if (!getHighSpeedVideoFpsRanges) {
            if (!getHighSpeedVideoSizesFor) {
                throw null;
            }
            throw null;
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 57) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i5 = Camera2StreamConfigurationMap + 43;
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(9:(9:(13:17|18|(1:20)|21|22|23|24|25|26|(1:28)|29|30|(1:32)(3:35|36|37))|47|48|25|26|(0)|29|30|(0)(0))|49|48|25|26|(0)|29|30|(0)(0))|50|51|52|(0)|29|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0156, code lost:
    
        r10.getMessage();
        r0 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ᱴఄ㲣ⵋ嶺乶縺溓鼙追렄\ua8cd\ud8b3줙麟\uea70ᫀઠ㭼⮑呫䓗留", android.view.View.MeasureSpec.getSize(0) + 4201, r0);
        r10 = (java.lang.String) r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013c, code lost:
    
        r10.getMessage();
        r10 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), "\u008d\u0097\u008d\u0090\u0091\u0093\u008b\u008f\u0096\u0095\u008d\u009d\u0091\u0095\u009f\u0095\u0095 \u0091¦\u0085\u0084\u0091\u0089¥", r10);
        r10 = (java.lang.String) r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:
    
        if (r10 != 2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016e A[Catch: all -> 0x0200, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:6:0x003e, B:7:0x006e, B:10:0x007e, B:12:0x0086, B:18:0x009f, B:20:0x00a8, B:21:0x00aa, B:24:0x00d4, B:28:0x016e, B:29:0x01ab, B:40:0x01bf, B:43:0x00ff, B:45:0x0105, B:46:0x0106, B:47:0x0107, B:48:0x012e, B:49:0x011d, B:51:0x0134, B:57:0x013c, B:55:0x0156, B:61:0x01c0, B:62:0x01dc, B:63:0x01dd, B:64:0x01f9, B:65:0x01fa, B:66:0x01ff, B:67:0x0043, B:36:0x01b8, B:37:0x01bd, B:23:0x00b0), top: B:2:0x0001, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b6 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void activate(int i, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        java.lang.String intern;
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        java.lang.String intern2;
        int i2;
        synchronized (this) {
            int i3 = getOutputMinFrameDuration + 101;
            getInputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(108 >>> (android.view.ViewConfiguration.getMinimumFlingVelocity() << 125), "\u0084\u0083\u0082\u0081", objArr);
                intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱺཉ㨳┊傌䎼滦", 16699 << (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
                str = (java.lang.String) objArr2[0];
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0084\u0083\u0082\u0081", objArr3);
                intern = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱺཉ㨳┊傌䎼滦", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4902, objArr4);
                str = (java.lang.String) objArr4[0];
            }
            util.h.xy.am.ma.m25027(intern, str.intern());
            int i4 = getInputSizeshNQ4ISI + 35;
            getOutputMinFrameDuration = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            if (mGDigitizationListener == null) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱺ❮樫근\uf0ae㑊缒苐얂ॖ䱫霣\udab2ᶷⅉ搚꿚\uf292㙒祠밸잳\u0abb乀鄈퓁ᾛ⍉昢ꤩ\uecf5㟹筰븒쇀ҙ", android.text.TextUtils.getOffsetAfter("", 0) + 15161, objArr5);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
            }
            if (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.WEB_3DS_NEEDED != getState()) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.view.KeyEvent.keyCodeFromString("") + 127, "\u0084\u0085°¯\u0092®\u0091\u0097\u009a\u008b\u0096\u008f\u0091\u0099\u0085\u0083\u0091\u0090\u0092\u0097\u0094\u0092\u008e\u0092\u0096\u0091\u0098\u0091\u0092\u0097\u008d\u0097\u0096\u0091\u0090\u0095\u008d\u0094\u0091\u0093\u008b\u008f\u0090\u008b\u0092\u0082\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u0083", objArr6);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr6[0]).intern());
            }
            int i5 = getOutputMinFrameDuration + 75;
            int i6 = i5 % 128;
            getInputSizeshNQ4ISI = i6;
            java.lang.String str3 = null;
            if (i5 % 2 == 0) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            int i7 = i6 + 67;
                            int i8 = i7 % 128;
                            getOutputMinFrameDuration = i8;
                            if (i7 % 2 != 0) {
                                int i9 = 2 / 2;
                            }
                            getInputSizeshNQ4ISI = (i8 + 17) % 128;
                            try {
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u00ad\u0090¬«\u0091\u0092\u0090\u009f\u0094\u0091\u0095\u009f\u0095\u0095\u0092\u0091\u008b\u009c\u009f\u008bª\u008b©", objArr7);
                                intern2 = java.lang.String.format(((java.lang.String) objArr7[0]).intern(), java.lang.Integer.valueOf(i));
                                getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 89) % 128;
                                str3 = intern2;
                                z = true;
                                if (z) {
                                    util.h.xy.au.mb mbVar = new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.WEB_3DS_AUTHENTICATION_FAILED, str3);
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap(android.text.TextUtils.getOffsetBefore("", 0) + 127, "\u0086\u0083\u0082\u0081", objArr8);
                                    java.lang.String intern3 = ((java.lang.String) objArr8[0]).intern();
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, " ¡\u0088\u0086\u0082\u0087\u0088\u0087\u0086\u0082\u0085", objArr9);
                                    util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr9[0]).intern());
                                    mGDigitizationListener.onError(this.getOutputSizeshNQ4ISI, mbVar);
                                }
                                i2 = getOutputMinFrameDuration + 109;
                                getInputSizeshNQ4ISI = i2 % 128;
                                if (i2 % 2 != 0) {
                                    throw new java.lang.ArithmeticException();
                                }
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0090\u008b¨\u009f¤\u0091\u0097\u009f\u008b\u0091\u008b\u009f\u008f\u0096\u0096\u0092\u0096\u0091\u0097\u008b\u0092§\u008e\u009f\u0095\u008b ", objArr10);
                        str2 = (java.lang.String) objArr10[0];
                        intern2 = str2.intern();
                        str3 = intern2;
                        z = true;
                        if (z) {
                        }
                        i2 = getOutputMinFrameDuration + 109;
                        getInputSizeshNQ4ISI = i2 % 128;
                        if (i2 % 2 != 0) {
                        }
                    }
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("ᰍ∖恰ꘑ\ue479⩂桃깨\uec64㉶瀬뙨\uf477㨋砐븐ﰀȟ䀍蘂쐻ਣ䠹踢차ባ僚雘퓛᫃壍黁", android.graphics.Color.green(0) + 15877, objArr11);
                    str2 = (java.lang.String) objArr11[0];
                    intern2 = str2.intern();
                    str3 = intern2;
                    z = true;
                    if (z) {
                    }
                    i2 = getOutputMinFrameDuration + 109;
                    getInputSizeshNQ4ISI = i2 % 128;
                    if (i2 % 2 != 0) {
                    }
                }
                m25309(this.getOutputSizeshNQ4ISI, mGDigitizationListener);
                z = false;
                if (z) {
                }
                i2 = getOutputMinFrameDuration + 109;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                }
            } else {
                if (i != 0) {
                    if (i != 1) {
                    }
                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("ᰍ∖恰ꘑ\ue479⩂桃깨\uec64㉶瀬뙨\uf477㨋砐븐ﰀȟ䀍蘂쐻ਣ䠹踢차ባ僚雘퓛᫃壍黁", android.graphics.Color.green(0) + 15877, objArr112);
                    str2 = (java.lang.String) objArr112[0];
                    intern2 = str2.intern();
                    str3 = intern2;
                    z = true;
                    if (z) {
                    }
                    i2 = getOutputMinFrameDuration + 109;
                    getInputSizeshNQ4ISI = i2 % 128;
                    if (i2 % 2 != 0) {
                    }
                }
                m25309(this.getOutputSizeshNQ4ISI, mGDigitizationListener);
                z = false;
                if (z) {
                }
                i2 = getOutputMinFrameDuration + 109;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                }
            }
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation
    public void activate(final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        synchronized (this) {
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 97) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u0084\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ᱺờᤛᑦᛜᄀి", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 691, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 19) % 128;
            if (mGDigitizationListener == null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱺ❮樫근\uf0ae㑊缒苐얂ॖ䱫霣\udab2ᶷⅉ搚꿚\uf292㙒祠밸잳\u0abb乀鄈퓁ᾛ⍉昢ꤩ\uecf5㟹筰븒쇀ҙ", 15161 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
            }
            if (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.APP2APP_NEEDED != getState()) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0082\u0082\u0087\u009b\u0082\u0082\u0087\u0091\u0097\u009a\u008b\u0096\u008f\u0091\u0099\u0085\u0083\u0091\u0090\u0092\u0097\u0094\u0092\u008e\u0092\u0096\u0091\u0098\u0091\u0092\u0097\u008d\u0097\u0096\u0091\u0090\u0095\u008d\u0094\u0091\u0093\u008b\u008f\u0090\u008b\u0092\u0082\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u0083", objArr4);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr4[0]).intern());
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25216(this.getOutputSizeshNQ4ISI), java.nio.charset.StandardCharsets.UTF_8));
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u0096\u008e\u008f\u008d\u0097\u0092\u0085\u0090\u0095\u008d\u0094", objArr5);
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.graphics.ImageFormat.getBitsPerPixel(0) + 128, "\u008d\u0097\u008d\u0090±\u009d\u009d\u008d\u009b\u009d\u009d\u008d", objArr6);
                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData m25128 = util.h.xy.au.g.m25127().m25128(jSONObject2.getString(((java.lang.String) objArr6[0]).intern()));
                util.h.xy.bb.e eVar = new util.h.xy.bb.e();
                eVar.m25307(m25128);
                eVar.m25305(this.getOutputSizeshNQ4ISI);
                util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.bb.e.2
                    private static int Camera2StreamConfigurationMap = 0;
                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                    private static int getHighSpeedVideoFpsRangesFor = 1;
                    private static int getHighSpeedVideoSizesFor = 0;
                    private static long getInputFormats = -6768474402829264113L;

                    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr7) {
                        int i2;
                        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
                        char[] charArray = str.toCharArray();
                        util.h.xz.b.d dVar = new util.h.xz.b.d();
                        dVar.f2628 = i;
                        int length = charArray.length;
                        long[] jArr = new long[length];
                        dVar.f2629 = 0;
                        while (dVar.f2629 < charArray.length) {
                            int i3 = getHighResolutionOutputSizeshNQ4ISI + 57;
                            Camera2StreamConfigurationMap = i3 % 128;
                            if (i3 % 2 != 0) {
                                jArr[dVar.f2629] = ((-7508379876853140581L) ^ getInputFormats) | (charArray[dVar.f2629] - (dVar.f2629 * dVar.f2628));
                                i2 = dVar.f2629;
                            } else {
                                jArr[dVar.f2629] = ((-7508379876853140581L) ^ getInputFormats) ^ (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628));
                                i2 = dVar.f2629 + 1;
                            }
                            dVar.f2629 = i2;
                        }
                        char[] cArr = new char[length];
                        dVar.f2629 = 0;
                        while (dVar.f2629 < charArray.length) {
                            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                            dVar.f2629++;
                        }
                        java.lang.String str2 = new java.lang.String(cArr);
                        int i4 = Camera2StreamConfigurationMap + 27;
                        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                        objArr7[0] = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 45) % 128;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("꣘쓭炏\uecac", 27689 - android.text.TextUtils.indexOf("", "", 0, 0), objArr7);
                        java.lang.String intern2 = ((java.lang.String) objArr7[0]).intern();
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("꣐\ue2cb㳉相肆\uda9eᒞ꺾\uf8c2㉒䱖虰큯樔", android.view.View.MeasureSpec.getMode(0) + 18959, objArr8);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr8[0]).intern());
                        mGDigitizationListener.onComplete(util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(util.h.xy.bb.e.this));
                        int i = getHighSpeedVideoSizesFor + 103;
                        getHighSpeedVideoFpsRangesFor = i % 128;
                        if (i % 2 == 0) {
                            throw null;
                        }
                    }
                });
            } catch (java.lang.Exception e) {
                e.getMessage();
                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.APP_TO_APP_DATA_ERROR;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱩ箓폯⯍茥ᭅ獅쭗⊶몽ዧ櫪숺娝눬ੋ憯礪凱", android.text.TextUtils.getTrimmedLength("") + 26591, objArr7);
                final util.h.xy.au.mb mbVar = new util.h.xy.au.mb(mGErrorCode, ((java.lang.String) objArr7[0]).intern());
                mbVar.getMessage();
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u0086\u0083\u0082\u0081", objArr8);
                java.lang.String intern2 = ((java.lang.String) objArr8[0]).intern();
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, " ¡\u0087¢\u0087\u0088\u0086\u0082\u0087\u0088\u0087\u0086\u0082\u0085", objArr9);
                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr9[0]).intern());
                util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.bb.e.6
                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                    private static int getHighSpeedVideoSizes;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoSizes = ((i & 39) + (i | 39)) % 128;
                        mGDigitizationListener.onError(util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(util.h.xy.bb.e.this), mbVar);
                        int i2 = getHighResolutionOutputSizeshNQ4ISI + 57;
                        getHighSpeedVideoSizes = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                    }
                });
            }
            int i = getOutputMinFrameDuration + 47;
            int i2 = i % 128;
            getInputSizeshNQ4ISI = i2;
            if (i % 2 == 0) {
                throw null;
            }
            int i3 = i2 + 93;
            getOutputMinFrameDuration = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r7 != null) goto L10;
     */
    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void activateWithTav(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        synchronized (this) {
            int i = getInputSizeshNQ4ISI + 35;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(8 >>> android.view.View.getDefaultSize(0, 0), "\u0084\u0083\u0082\u0081", objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.view.ViewConfiguration.getDoubleTapTimeout() >>> 93) + 88, "\u008a\u0087\u0088\u0087\u0086\u0082\u0085", objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                if (bArr != null) {
                    if (bArr.length != 0) {
                        if (mGDigitizationListener == null) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("ᱺ❮樫근\uf0ae㑊缒苐얂ॖ䱫霣\udab2ᶷⅉ搚꿚\uf292㙒祠밸잳\u0abb乀鄈퓁ᾛ⍉昢ꤩ\uecf5㟹筰븒쇀ҙ", android.view.View.resolveSizeAndState(0, 0, 0) + 15161, objArr3);
                            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
                        }
                        if (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.APP2APP_NEEDED != getState()) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(127 - android.view.View.MeasureSpec.getSize(0), "\u0082\u0082\u0087\u009b\u0082\u0082\u0087\u0091\u0097\u009a\u008b\u0096\u008f\u0091\u0099\u0085\u0083\u0091\u0090\u0092\u0097\u0094\u0092\u008e\u0092\u0096\u0091\u0098\u0091\u0092\u0097\u008d\u0097\u0096\u0091\u0090\u0095\u008d\u0094\u0091\u0093\u008b\u008f\u0090\u008b\u0092\u0082\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u0083", objArr4);
                            throw new java.lang.IllegalStateException(((java.lang.String) objArr4[0]).intern());
                        }
                        Camera2StreamConfigurationMap(bArr, mGDigitizationListener);
                        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 59) % 128;
                    }
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ᱪ섐ꚶ葓槡佴Ⳋ\u1259\uf729풭멈龙絯⊽B\ue5ca쪢ꠍ跐獬僠㘅ᯑ\uf8aa\ude26莝愁", 56687 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.View.getDefaultSize(0, 0) + 127, "\u0084\u0083\u0082\u0081", objArr6);
            java.lang.String intern2 = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u008a\u0087\u0088\u0087\u0086\u0082\u0085", objArr7);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr7[0]).intern());
        }
    }

    private util.h.xy.az.b getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws util.h.xy.az.ma, org.json.JSONException {
        util.h.xy.az.b bVar;
        synchronized (this) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.view.KeyEvent.normalizeMetaState(0), "\u008f\u009d\u008d\u0097\u0092\u008e\u008e\u008d\u009c", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(1);
            sb.append(util.h.xy.al.ra.f320);
            sb.append(1);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.graphics.Color.argb(0, 0, 0, 0) + 127, "\u0096\u0095\u0092\u0090\u008f\u008c\u009f\u0095\u009d\u009e\u0097\u0092\u008e\u008e\u008d\u009c", objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str2);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0096\u0097\u0092\u008e\u008e\u008d\u009c", objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str3);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ᱚ煮옫导ꢮ㹂錄\ue09c疕쭞塶괩ˡ", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27960, objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str4);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.graphics.Color.red(0), "\u0090\u0095\u008d\u0086\u0092\u0097\u008d\u008c\u008f\u0097\u0094\u008d", objArr5);
            sb.append(((java.lang.String) objArr5[0]).intern());
            bVar = new util.h.xy.az.b(sb.toString(), util.h.xy.az.b.EnumC0259b.f912);
            bVar.m25258(util.h.xy.au.g.m25127().m25160(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), bArr2));
            int i = getInputSizeshNQ4ISI + 89;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return bVar;
    }

    private byte[] getHighSpeedVideoFpsRangesFor() throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException, org.json.JSONException {
        byte[] bytes;
        synchronized (this) {
            byte[] bArr = null;
            try {
                bArr = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25216(this.getOutputSizeshNQ4ISI);
                bytes = util.h.xy.au.g.m25127().m25129(bArr).getBytes();
                if (bArr != null) {
                    int i = getInputSizeshNQ4ISI + 89;
                    getOutputMinFrameDuration = i % 128;
                    if (i % 2 != 0) {
                        java.util.Arrays.fill(bArr, (byte) 1);
                    } else {
                        java.util.Arrays.fill(bArr, (byte) 0);
                    }
                }
            } catch (java.lang.Throwable th) {
                if (bArr != null) {
                    java.util.Arrays.fill(bArr, (byte) 0);
                    getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 13) % 128;
                }
                throw th;
            }
        }
        return bytes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [util.h.xy.au.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(util.h.xy.au.rg rgVar, java.lang.String str) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException, org.json.JSONException {
        byte[] bArr;
        int i = getInputSizeshNQ4ISI + 85;
        getOutputMinFrameDuration = i % 128;
        ?? r0 = i % 2;
        byte[] bArr2 = null;
        try {
            try {
                if (r0 == 0) {
                    byte[] m25226 = rgVar.m25226();
                    byte[] m25162 = util.h.xy.au.g.m25127().m25162(m25226, str);
                    rgVar.m25224(m25162);
                    if (m25226 != null) {
                        java.util.Arrays.fill(m25226, (byte) 0);
                    }
                    if (m25162 != null) {
                        java.util.Arrays.fill(m25162, (byte) 0);
                    }
                    getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 37) % 128;
                    return;
                }
                r0 = rgVar.m25226();
                byte[] m251622 = util.h.xy.au.g.m25127().m25162(r0, str);
                try {
                    rgVar.m25224(m251622);
                    throw null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bArr2 = m251622;
                    bArr = bArr2;
                    bArr2 = r0;
                    if (bArr2 != null) {
                        java.util.Arrays.fill(bArr2, (byte) 0);
                    }
                    if (bArr != null) {
                        java.util.Arrays.fill(bArr, (byte) 0);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr = bArr2;
            if (bArr2 != null) {
            }
            if (bArr != null) {
            }
            throw th;
        }
    }

    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState getHighSpeedVideoSizes() {
        org.json.JSONException e;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState pendingCardActivationState;
        com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e2;
        byte[] bArr;
        java.lang.Throwable th;
        byte[] bArr2 = null;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState pendingCardActivationState2 = null;
        byte[] bArr3 = null;
        try {
            try {
                bArr = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25216(this.getOutputSizeshNQ4ISI);
            } catch (java.lang.Throwable th2) {
                bArr = null;
                th = th2;
            }
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e3) {
            e2 = e3;
            pendingCardActivationState = null;
        } catch (org.json.JSONException e4) {
            e = e4;
            pendingCardActivationState = null;
        }
        try {
            java.lang.String m25143 = util.h.xy.au.g.m25127().m25143(bArr);
            if (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.IDV_METHOD_NOT_SELECTED.toString().equalsIgnoreCase(m25143)) {
                pendingCardActivationState2 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.IDV_METHOD_NOT_SELECTED;
                getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 79) % 128;
            } else if (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.OTP_NEEDED.toString().equalsIgnoreCase(m25143)) {
                pendingCardActivationState2 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.OTP_NEEDED;
            } else if (!com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.WEB_3DS_NEEDED.toString().equalsIgnoreCase(m25143)) {
                if (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.APP2APP_NEEDED.toString().equalsIgnoreCase(m25143)) {
                    getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 117) % 128;
                    pendingCardActivationState2 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.APP2APP_NEEDED;
                }
            } else {
                int i = getOutputMinFrameDuration + 105;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState pendingCardActivationState3 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.WEB_3DS_NEEDED;
                    throw new java.lang.ArithmeticException();
                }
                pendingCardActivationState2 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.WEB_3DS_NEEDED;
            }
            if (bArr != null) {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
            return pendingCardActivationState2;
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e5) {
            e2 = e5;
            pendingCardActivationState = null;
            bArr3 = bArr;
            e2.getMessage();
            if (bArr3 != null) {
                java.util.Arrays.fill(bArr3, (byte) 0);
            }
            return pendingCardActivationState;
        } catch (org.json.JSONException e6) {
            e = e6;
            pendingCardActivationState = null;
            bArr2 = bArr;
            e.getMessage();
            if (bArr2 != null) {
                java.util.Arrays.fill(bArr2, (byte) 0);
            }
            return pendingCardActivationState;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (bArr != null) {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
            throw th;
        }
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005e: MOVE (r5 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:22:0x005e */
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt getHighSpeedVideoFpsRanges() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            util.h.xy.bh.ra r2 = util.h.xy.bh.ra.m25484()     // Catch: java.lang.Throwable -> L3b com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L3d org.json.JSONException -> L49
            android.content.Context r2 = r2.m25485()     // Catch: java.lang.Throwable -> L3b com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L3d org.json.JSONException -> L49
            util.h.xy.au.rg r2 = util.h.xy.au.rg.m25213(r2)     // Catch: java.lang.Throwable -> L3b com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L3d org.json.JSONException -> L49
            java.lang.String r3 = r6.getOutputSizeshNQ4ISI     // Catch: java.lang.Throwable -> L3b com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L3d org.json.JSONException -> L49
            byte[] r2 = r2.m25216(r3)     // Catch: java.lang.Throwable -> L3b com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L3d org.json.JSONException -> L49
            util.h.xy.au.g r3 = util.h.xy.au.g.m25127()     // Catch: com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L37 org.json.JSONException -> L39 java.lang.Throwable -> L5d
            org.json.JSONObject r3 = r3.m25139(r2)     // Catch: com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L37 org.json.JSONException -> L39 java.lang.Throwable -> L5d
            java.lang.String r3 = r3.toString()     // Catch: com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L37 org.json.JSONException -> L39 java.lang.Throwable -> L5d
            util.h.xy.bb.ra r4 = new util.h.xy.bb.ra     // Catch: com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L37 org.json.JSONException -> L39 java.lang.Throwable -> L5d
            byte[] r3 = r3.getBytes()     // Catch: com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L37 org.json.JSONException -> L39 java.lang.Throwable -> L5d
            r4.<init>(r3)     // Catch: com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException -> L37 org.json.JSONException -> L39 java.lang.Throwable -> L5d
            if (r2 == 0) goto L36
            int r1 = util.h.xy.bb.e.getInputSizeshNQ4ISI
            int r1 = r1 + 17
            int r1 = r1 % 128
            util.h.xy.bb.e.getOutputMinFrameDuration = r1
            java.util.Arrays.fill(r2, r0)
        L36:
            return r4
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            goto L4c
        L3b:
            r2 = move-exception
            goto L61
        L3d:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L40:
            r3.getMessage()     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L5c
            java.util.Arrays.fill(r2, r0)
            goto L5c
        L49:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L4c:
            r3.getMessage()     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L5c
            java.util.Arrays.fill(r2, r0)
            int r0 = util.h.xy.bb.e.getOutputMinFrameDuration
            int r0 = r0 + 11
            int r0 = r0 % 128
            util.h.xy.bb.e.getInputSizeshNQ4ISI = r0
        L5c:
            return r1
        L5d:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L61:
            if (r1 == 0) goto L66
            java.util.Arrays.fill(r1, r0)
        L66:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: util.h.xy.bb.e.getHighSpeedVideoFpsRanges():com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt");
    }

    private void Camera2StreamConfigurationMap(final byte[] bArr, final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bb.e.1
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoSizes = 0;
            private static int getHighSpeedVideoSizesFor = 1;
            private static char getInputFormats = 5365;
            private static char getInputSizeshNQ4ISI = 30635;
            private static char getOutputFormats = 64511;
            private static char getOutputMinFrameDuration = 6114;
            private static int getOutputStallDurationlomOqCM;

            private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
                int i2 = Camera2StreamConfigurationMap;
                int i3 = i2 + 47;
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = i2 + 93;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
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
                    int i5 = 58224;
                    for (int i6 = 0; i6 < 16; i6++) {
                        char c = cArr2[1];
                        char c2 = cArr2[0];
                        char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (getInputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))));
                        cArr2[1] = c3;
                        cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i5)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                        i5 -= 40503;
                    }
                    cArr[eVar.f2630] = cArr2[0];
                    cArr[eVar.f2630 + 1] = cArr2[1];
                    eVar.f2630 += 2;
                }
                objArr[0] = new java.lang.String(cArr, 0, i);
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArr2;
                byte[] bArr3;
                java.lang.Exception e;
                util.h.xy.az.ma e2;
                org.json.JSONException e3;
                byte[] bArr4 = null;
                try {
                    try {
                        util.h.xy.au.rg m25213 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485());
                        byte[] m25206 = ((util.h.xy.au.re) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876)).m25206();
                        try {
                            bArr2 = util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485()).getBytes();
                            try {
                                bArr3 = util.h.xy.bh.mb.m25469();
                                try {
                                    util.h.xy.bb.e eVar = util.h.xy.bb.e.this;
                                    util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(util.h.xy.bb.e.getHighSpeedVideoSizes(eVar, util.h.xy.bb.e.getHighSpeedVideoFpsRanges(eVar), bArr, new java.lang.String(m25206, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), util.h.xy.bb.e.this.m25306()));
                                    java.lang.String str = util.h.xy.bb.e.f919;
                                    new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8);
                                    java.lang.String m25142 = util.h.xy.au.g.m25127().m25142(m25276);
                                    java.lang.String str2 = util.h.xy.bb.e.f919;
                                    if (util.h.xy.az.ra.m25277(m25142)) {
                                        getHighSpeedVideoSizesFor = (getOutputStallDurationlomOqCM + 79) % 128;
                                        util.h.xy.bb.e eVar2 = util.h.xy.bb.e.this;
                                        eVar2.m25309(util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(eVar2), null);
                                        util.h.xy.bb.e eVar3 = util.h.xy.bb.e.this;
                                        util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(eVar3, util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(eVar3), mGDigitizationListener);
                                    } else {
                                        java.lang.Object[] objArr = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("鷔챳ꦒ瞵", 3 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr);
                                        if (((java.lang.String) objArr[0]).intern().equalsIgnoreCase(m25142)) {
                                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("鍗뚩뗉롦", android.view.View.MeasureSpec.getSize(0) + 4, objArr2);
                                            java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("㐷ὶ\uec83윜䉰耾覗곿传㇉癍뀀", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 11, objArr3);
                                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                                            util.h.xy.bb.e.getHighSpeedVideoFpsRanges(m25213, util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(util.h.xy.bb.e.this));
                                            java.lang.String str3 = util.h.xy.bb.e.f919;
                                            new util.h.xy.bv.ma(util.h.xy.bh.ra.m25484().m25485()).m25708(util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(util.h.xy.bb.e.this));
                                            util.h.xy.bb.e eVar4 = util.h.xy.bb.e.this;
                                            util.h.xy.bb.e.getHighResolutionOutputSizeshNQ4ISI(eVar4, util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(eVar4).getBytes(java.nio.charset.StandardCharsets.UTF_8));
                                        }
                                        util.h.xy.bb.e.getHighSpeedVideoFpsRanges(util.h.xy.bb.e.this, mGDigitizationListener, new util.h.xy.au.mb(m25142, util.h.xy.au.g.m25127().m25134(m25276)));
                                    }
                                    util.h.xy.bh.mb.m25483(m25206, bArr2, bArr3);
                                    getOutputStallDurationlomOqCM = (getHighSpeedVideoSizesFor + 59) % 128;
                                } catch (org.json.JSONException e4) {
                                    e3 = e4;
                                    e = e3;
                                    bArr4 = m25206;
                                    util.h.xy.bb.e.getHighSpeedVideoFpsRanges(util.h.xy.bb.e.this, mGDigitizationListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, e.getMessage()));
                                    util.h.xy.bh.mb.m25483(bArr4, bArr2, bArr3);
                                } catch (util.h.xy.az.ma e5) {
                                    e2 = e5;
                                    e = e2;
                                    bArr4 = m25206;
                                    util.h.xy.bb.e.getHighSpeedVideoFpsRanges(util.h.xy.bb.e.this, mGDigitizationListener, util.h.xy.bh.mb.m25478(e));
                                    util.h.xy.bh.mb.m25483(bArr4, bArr2, bArr3);
                                } catch (java.lang.Exception e6) {
                                    e = e6;
                                    e = e;
                                    bArr4 = m25206;
                                    util.h.xy.bb.e.getHighSpeedVideoFpsRanges(util.h.xy.bb.e.this, mGDigitizationListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, e.getMessage()));
                                    util.h.xy.bh.mb.m25483(bArr4, bArr2, bArr3);
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    bArr4 = m25206;
                                    util.h.xy.bh.mb.m25483(bArr4, bArr2, bArr3);
                                    throw th;
                                }
                            } catch (org.json.JSONException e7) {
                                e = e7;
                                bArr3 = null;
                                e3 = e;
                                e = e3;
                                bArr4 = m25206;
                                util.h.xy.bb.e.getHighSpeedVideoFpsRanges(util.h.xy.bb.e.this, mGDigitizationListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, e.getMessage()));
                                util.h.xy.bh.mb.m25483(bArr4, bArr2, bArr3);
                            } catch (util.h.xy.az.ma e8) {
                                e = e8;
                                bArr3 = null;
                                e2 = e;
                                e = e2;
                                bArr4 = m25206;
                                util.h.xy.bb.e.getHighSpeedVideoFpsRanges(util.h.xy.bb.e.this, mGDigitizationListener, util.h.xy.bh.mb.m25478(e));
                                util.h.xy.bh.mb.m25483(bArr4, bArr2, bArr3);
                            } catch (java.lang.Exception e9) {
                                e = e9;
                                bArr3 = null;
                                e = e;
                                e = e;
                                bArr4 = m25206;
                                util.h.xy.bb.e.getHighSpeedVideoFpsRanges(util.h.xy.bb.e.this, mGDigitizationListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, e.getMessage()));
                                util.h.xy.bh.mb.m25483(bArr4, bArr2, bArr3);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                bArr3 = null;
                            }
                        } catch (org.json.JSONException e10) {
                            e = e10;
                            bArr2 = null;
                            bArr3 = null;
                        } catch (util.h.xy.az.ma e11) {
                            e = e11;
                            bArr2 = null;
                            bArr3 = null;
                        } catch (java.lang.Exception e12) {
                            e = e12;
                            bArr2 = null;
                            bArr3 = null;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            bArr2 = null;
                            bArr3 = null;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        bArr4 = null;
                    }
                } catch (org.json.JSONException e13) {
                    e = e13;
                    bArr2 = null;
                    bArr3 = null;
                } catch (util.h.xy.az.ma e14) {
                    e = e14;
                    bArr2 = null;
                    bArr3 = null;
                } catch (java.lang.Exception e15) {
                    e = e15;
                    bArr2 = null;
                    bArr3 = null;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    bArr2 = null;
                    bArr3 = null;
                }
            }
        }).start();
        int i = getOutputMinFrameDuration + 99;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI() {
        final boolean[] zArr = new boolean[1];
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        util.h.xy.bb.ma maVar = new util.h.xy.bb.ma(new util.h.xy.bv.b.ma() { // from class: util.h.xy.bb.e$$ExternalSyntheticLambda0
            @Override // util.h.xy.bv.b.ma
            public final void onUpdate(util.h.xy.bv.b.ma.EnumC0265b enumC0265b) {
                util.h.xy.bb.e.$r8$lambda$2ejCTRfmLn0FdBhY7_GXy9B6J2M(zArr, countDownLatch, enumC0265b);
            }
        });
        util.h.xy.v.c.m27646().m27662(maVar);
        try {
            try {
                countDownLatch.await(45L, java.util.concurrent.TimeUnit.SECONDS);
                util.h.xy.v.c.m27646().m27650(maVar);
                getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 11) % 128;
            } catch (java.lang.InterruptedException unused) {
                zArr[0] = false;
                util.h.xy.v.c.m27646().m27650(maVar);
            }
            return zArr[0];
        } catch (java.lang.Throwable th) {
            util.h.xy.v.c.m27646().m27650(maVar);
            throw th;
        }
    }

    private void getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener, final com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.bb.e.4
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getInputFormats = 0;
            private static int[] getInputSizeshNQ4ISI = {1774356121, 1326724092, 1684022043, -767021263, -1687328421, 117543457, 1800312310, 1311120389, -812069626, 766525213, 1871018665, 1337163245, 460281784, 241608113, -1771046582, 1922565859, 139349940, -1291867325};
            private static int getOutputMinFrameDuration = 1;

            private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
                int i2;
                int length;
                int[] iArr2;
                int i3;
                util.h.xz.b.c cVar = new util.h.xz.b.c();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = getInputSizeshNQ4ISI;
                if (iArr3 != null) {
                    int i4 = getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    Camera2StreamConfigurationMap = i4 % 128;
                    if (i4 % 2 == 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i3 = 1;
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i3 = 0;
                    }
                    while (i3 < length) {
                        iArr2[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
                        i3++;
                    }
                    iArr3 = iArr2;
                }
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = getInputSizeshNQ4ISI;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i5 = 0;
                    while (i5 < length3) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 109) % 128;
                        iArr6[i5] = (int) (iArr5[i5] ^ (-5569649899877129369L));
                        i5++;
                        length2 = length2;
                    }
                    i2 = length2;
                    iArr5 = iArr6;
                } else {
                    i2 = length2;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, i2);
                cVar.f2626 = 0;
                while (cVar.f2626 < iArr.length) {
                    cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                    cArr[1] = (char) iArr[cVar.f2626];
                    cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                    cArr[3] = (char) iArr[cVar.f2626 + 1];
                    cVar.f2627 = (cArr[0] << 16) + cArr[1];
                    cVar.f2625 = (cArr[2] << 16) + cArr[3];
                    util.h.xz.b.c.m27723(iArr4);
                    for (int i6 = 0; i6 < 16; i6++) {
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 85) % 128;
                        cVar.f2627 ^= iArr4[i6];
                        cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                        int i7 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i7;
                    }
                    int i8 = cVar.f2627;
                    cVar.f2627 = cVar.f2625;
                    cVar.f2625 = i8;
                    cVar.f2625 ^= iArr4[16];
                    cVar.f2627 ^= iArr4[17];
                    int i9 = cVar.f2627;
                    int i10 = cVar.f2625;
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

            @Override // java.lang.Runnable
            public final void run() {
                getOutputMinFrameDuration = (getInputFormats + 21) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{510290593, 283816363}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 4, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{558110539, -1120243424, 12718, -1875675787, 1997852026, 822951287}, 11 - android.text.TextUtils.indexOf("", "", 0, 0), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                mGDigitizationListener.onError(util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(util.h.xy.bb.e.this), mobileGatewayError);
                int i = getInputFormats + 93;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }
        });
        int i = getOutputMinFrameDuration + 35;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25309(final java.lang.String str, final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) throws org.json.JSONException {
        try {
            if (!util.h.xy.au.mc.m25165(str).equals("")) {
                getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 39) % 128;
                if (!util.h.xy.au.mc.m25165(str).equals(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.ACTIVE.toString())) {
                    util.h.xy.au.rg m25213 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485());
                    byte[] m25216 = m25213.m25216(str);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m25216, java.nio.charset.StandardCharsets.UTF_8));
                    java.util.Arrays.fill(m25216, (byte) 0);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0096\u008e\u008f\u008d\u0097\u0092\u0085\u0090\u0095\u008d\u0094", objArr);
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr[0]).intern());
                    if (jSONObject2 != null) {
                        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 11) % 128;
                        byte[] m25149 = util.h.xy.au.g.m25127().m25149(jSONObject2);
                        util.h.xy.au.mc.m25164(str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.ACTIVE, m25149);
                        java.util.Arrays.fill(m25149, (byte) 0);
                        getHighSpeedVideoFpsRangesFor(m25213, str);
                        m25213.m25221();
                        if (mGDigitizationListener != null) {
                            util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.bb.e.3
                                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                private static int getHighSpeedVideoFpsRanges = 0;
                                private static int getHighSpeedVideoSizesFor = 0;
                                private static int getOutputFormats = 1;
                                private static long getOutputMinFrameDuration = 7883861319791739469L;

                                private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str2, int i, java.lang.Object[] objArr2) {
                                    int i2 = getHighSpeedVideoFpsRanges + 89;
                                    getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        throw new java.lang.ArithmeticException();
                                    }
                                    char[] charArray = str2.toCharArray();
                                    util.h.xz.b.d dVar = new util.h.xz.b.d();
                                    dVar.f2628 = i;
                                    int length = charArray.length;
                                    long[] jArr = new long[length];
                                    loop0: while (true) {
                                        dVar.f2629 = 0;
                                        while (dVar.f2629 < charArray.length) {
                                            int i3 = getHighResolutionOutputSizeshNQ4ISI + 1;
                                            getHighSpeedVideoFpsRanges = i3 % 128;
                                            if (i3 % 2 != 0) {
                                                break;
                                            }
                                            jArr[dVar.f2629] = ((-7508379876853140581L) ^ getOutputMinFrameDuration) ^ (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628));
                                            dVar.f2629++;
                                        }
                                        jArr[dVar.f2629] = (charArray[dVar.f2629] - (dVar.f2629 ^ dVar.f2628)) & (getOutputMinFrameDuration / (-7508379876853140581L));
                                        int i4 = dVar.f2629;
                                    }
                                    char[] cArr = new char[length];
                                    dVar.f2629 = 0;
                                    while (dVar.f2629 < charArray.length) {
                                        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
                                        cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                                        dVar.f2629++;
                                    }
                                    objArr2[0] = new java.lang.String(cArr);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    getHighSpeedVideoSizesFor = (getOutputFormats + 19) % 128;
                                    try {
                                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI("㆚䘡\uded1坠", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 30631, objArr2);
                                        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI("㆒引\uecb3種讴ᥜꛥ㞃䔍틓性\uf1c4", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28306, objArr3);
                                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                                        mGDigitizationListener.onComplete(str);
                                        getOutputFormats = (getHighSpeedVideoSizesFor + 117) % 128;
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                            });
                            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 115) % 128;
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 9) % 128;
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException unused) {
        }
    }

    private void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0086\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ᱺ栳\uf4c7䅨쵤妼Ꙁ", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29789, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (new util.h.xy.bv.ma(util.h.xy.bh.ra.m25484().m25485()).m25701(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2) != null) {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0090\u0092\u008e\u008f\u008d¤\u0091\u008b\u009f\u008f\u0097\u008d\u008c\u008f\u0097\u0094\u0087\u0091\u0090\u0095\u008d\u0086", objArr3);
            getHighSpeedVideoSizes(mGDigitizationListener, new util.h.xy.au.mb(mGErrorCode, ((java.lang.String) objArr3[0]).intern()));
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 97) % 128;
            return;
        }
        getHighSpeedVideoSizes(mGDigitizationListener);
    }

    private void getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        int i = getOutputMinFrameDuration + 119;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (mGDigitizationListener != null) {
            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bb.e.10
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighSpeedVideoFpsRangesFor = 0;
                private static int getHighSpeedVideoSizes = 0;
                private static long getHighSpeedVideoSizesFor = -25201742594256142L;
                private static char getInputSizeshNQ4ISI = 13130;
                private static int getOutputFormats = 294925130;
                private static int getOutputMinFrameDuration = 1;

                private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i2, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
                    int i3 = getHighSpeedVideoSizes + 29;
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    char[] charArray = str3.toCharArray();
                    int i4 = Camera2StreamConfigurationMap + 5;
                    getHighSpeedVideoSizes = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
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
                    cArr2[2] = (char) (cArr2[2] + ((char) i2));
                    int length3 = charArray3.length;
                    char[] cArr3 = new char[length3];
                    rcVar.f2652 = 0;
                    while (rcVar.f2652 < length3) {
                        int i5 = (rcVar.f2652 + 2) % 4;
                        int i6 = (rcVar.f2652 + 3) % 4;
                        rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i5]) % 65535);
                        cArr2[i6] = (char) (((cArr[i6] * 32718) + cArr2[i5]) / 65535);
                        cArr[i6] = rcVar.f2653;
                        cArr3[rcVar.f2652] = (char) ((((cArr[i6] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getOutputFormats ^ 2457411417541981002L))) ^ ((char) (getInputSizeshNQ4ISI ^ 2457411417541981002L)));
                        rcVar.f2652++;
                    }
                    objArr[0] = new java.lang.String(cArr3);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 119) % 128;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("ᘠ錫卲욎", (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 48580), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, "礳♕약뢽", "\ue1b8ᵦඌ\uddbc", objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\ue552䞖씖糅ኧ㫆蚒旉൭᭴㿵āⵈ", (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6465), android.text.TextUtils.indexOf("", "", 0, 0) + 285739215, "쾹ࠈ䈑栙", "\ue1b8ᵦඌ\uddbc", objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    mGDigitizationListener.onComplete(util.h.xy.bb.e.getHighSpeedVideoFpsRangesFor(util.h.xy.bb.e.this));
                    int i2 = getHighSpeedVideoFpsRangesFor + 67;
                    getOutputMinFrameDuration = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                }
            });
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 43) % 128;
        }
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = new char[]{64219, 64199, 64222, 64192, 64211, 64208, 64214, 64229, 64220, 64227, 64165, 64173, 64182, 64187, 64190, 64179, 64247, 64178, 64188, 64176, 64161, 64160, 64163, 64228, 64205, 64252, 64225, 64172, 64167, 64250, 64164, 64210, 64196, 64195, 64230, 64189, 64218, 64216, 64186, 64162, 64194, 64184, 64255, 64242, 64254, 64204, 64177, 64224, 64180};
        getInputFormats = -1074857193;
        getHighSpeedVideoSizesFor = true;
        getHighSpeedVideoFpsRanges = true;
        getHighResolutionOutputSizeshNQ4ISI = -6143732614354686043L;
    }
}
