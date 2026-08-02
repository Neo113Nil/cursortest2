package util.h.xy.bv;

/* loaded from: classes18.dex */
public class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static long getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static final java.lang.String getInputFormats;
    private final android.content.Context getOutputFormats;

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
        int i = (getHighSpeedVideoSizesFor + 61) % 128;
        getHighSpeedVideoSizes = i;
        java.lang.String str = getInputFormats;
        int i2 = i + 21;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public ma(android.content.Context context) {
        this.getOutputFormats = context;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getInputFormats = util.h.xy.bv.ma.class.getName();
        int i = getHighSpeedVideoSizesFor + 35;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 105;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
        while (aVar.f2623 < m27721.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 103) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x013b A[RETURN] */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String m25707(byte[] bArr) {
        byte[] m25216;
        java.lang.String string;
        int i;
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 73) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 90, false, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\uffff\ufffe\u000f\u0001\ufffe\u0001￩\u000b", offsetBefore + 8, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 2, android.graphics.Color.rgb(0, 0, 0) + 16777301, true, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (bArr != null) {
                try {
                    m25216 = util.h.xy.au.rg.m25213(util.h.xy.ag.a.m24556().m24558()).m25216(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
                } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException | java.lang.IllegalStateException | org.json.JSONException e) {
                    e.getMessage();
                }
                if (m25216 != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m25216));
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 71) % 128;
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("\u0004￼\u000f\u0000\uffdf\uffff\r￼\ufffe\u000e\u0007", lastIndexOf + 12, 10 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'E', true, objArr3);
                        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr3[0]).intern());
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("连辸\u0ab1\ue214Ꙍ琊뭙燎", android.view.KeyEvent.normalizeMetaState(0) + 1, objArr4);
                        if (jSONObject2.has(((java.lang.String) objArr4[0]).intern())) {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("连辸\u0ab1\ue214Ꙍ琊뭙燎", 1 - android.text.TextUtils.indexOf("", "", 0, 0), objArr5);
                            string = jSONObject2.getString(((java.lang.String) objArr5[0]).intern());
                            i = getHighSpeedVideoSizes + 71;
                            getHighSpeedVideoSizesFor = i % 128;
                            if (i % 2 == 0) {
                                return string;
                            }
                            throw null;
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            string = null;
            i = getHighSpeedVideoSizes + 71;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean m25703(java.lang.String str) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 109) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", 4 - android.view.View.MeasureSpec.getSize(0), android.graphics.Color.argb(0, 0, 0, 0) + 4, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 90, false, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("饮餭䊾\ud872\uee6b嘏⭣脀냽訵厒\ue424ﶧＱ㳫", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (str != null) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 27) % 128;
            if (!str.isEmpty()) {
                try {
                    util.h.xy.d.b m26923 = util.h.xy.k.b.m26923(str);
                    if (m26923 != null) {
                        m26923.m26136();
                        m26923.m26139();
                    }
                    if (m26923 != null && m26923.m26136() == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 85) % 128;
                        if (m26923.m26139() > 0) {
                            return true;
                        }
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25702(byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, 4 - android.view.View.resolveSizeAndState(0, 0, 0), 90 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\f￪\f\uffff\u0000\uffff\u0000", 7 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 5 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 84, false, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager cardLifeCycleManager = com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardLifeCycleManager();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        cardLifeCycleManager.deleteCard(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener() { // from class: util.h.xy.bv.ma.1
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes = 0;
            private static long getHighSpeedVideoSizesFor = -8623886524095521840L;
            private static int getOutputMinFrameDuration = 1;

            private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr3) {
                int i2 = getHighSpeedVideoFpsRangesFor + 59;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                char[] charArray = str.toCharArray();
                util.h.xz.b.a aVar = new util.h.xz.b.a();
                char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizesFor ^ 7817488252581312552L, charArray, i);
                aVar.f2623 = 4;
                while (aVar.f2623 < m27721.length) {
                    aVar.f2624 = aVar.f2623 - 4;
                    m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizesFor ^ 7817488252581312552L)));
                    aVar.f2623++;
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 113) % 128;
                }
                objArr3[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
            public final void onSuccess(java.lang.String str) {
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 73) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\ud837㵪︺\u2eec2㦃튭礆", android.view.View.resolveSize(0, 0), objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("楠䲰丸椣꼌覘\uebc0\ue6c4㼤ᧆ䀆箁盳", android.text.TextUtils.getOffsetAfter("", 0), objArr4);
                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                util.h.xy.bv.ma.getHighSpeedVideoSizes();
                countDownLatch.countDown();
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 115) % 128;
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
            public final void onError(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
                java.lang.String intern2;
                java.lang.Object obj;
                int i = getHighSpeedVideoFpsRanges + 33;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 == 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\ud837㵪︺\u2eec2㦃튭礆", android.graphics.Color.green(0), objArr3);
                    intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("鿯䍂墌龬ꃾ鼬ឋ။ブི뱍蟊聪", android.view.ViewConfiguration.getWindowTouchSlop() >> 94, objArr4);
                    obj = objArr4[0];
                } else {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\ud837㵪︺\u2eec2㦃튭礆", android.graphics.Color.green(0), objArr5);
                    intern2 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("鿯䍂墌龬ꃾ鼬ឋ။ブི뱍蟊聪", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr6);
                    obj = objArr6[0];
                }
                util.h.xy.am.ma.m25029(intern2, ((java.lang.String) obj).intern());
                util.h.xy.bv.ma.getHighSpeedVideoSizes();
                countDownLatch.countDown();
                int i2 = getHighSpeedVideoFpsRanges + 9;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }
        });
        try {
            countDownLatch.await(30L, java.util.concurrent.TimeUnit.SECONDS);
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 43) % 128;
        } catch (java.lang.InterruptedException unused) {
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 59) % 128;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] cArr;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr2 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr2[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr2[i4] = (char) (cArr2[i4] - ((int) (Camera2StreamConfigurationMap ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
            raVar.f2648 = i2;
            char[] cArr3 = new char[i];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr3, raVar.f2648, cArr2, 0, i - raVar.f2648);
        }
        if (z) {
            int i5 = getHighSpeedVideoFpsRanges + 7;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                cArr = new char[i];
                raVar.f2649 = 1;
            } else {
                cArr = new char[i];
                raVar.f2649 = 0;
            }
            while (raVar.f2649 < i) {
                cArr[raVar.f2649] = cArr2[(i - raVar.f2649) - 1];
                raVar.f2649++;
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
            }
            cArr2 = cArr;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoSizes(java.lang.String str) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError;
        synchronized (this) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", 4 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0) + 4, 91 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), false, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("癗瘔\udc8bᰲ灞\ue303쑃䕀\ue69e", android.text.TextUtils.getOffsetBefore("", 0) + 1, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError[] provisioningServiceErrorArr = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError[1];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0000", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1, 1 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 64 - android.text.TextUtils.getOffsetAfter("", 0), false, objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", android.view.MotionEvent.axisFromString("") + 5, android.text.TextUtils.getCapsMode("", 0, 0) + 4, 90 - android.graphics.Color.argb(0, 0, 0, 0), false, objArr4);
            java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("≼∿声또\uf425\ue3c9遺\uef62ꪹ\ue654", android.view.KeyEvent.normalizeMetaState(0) + 1, objArr5);
            util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr5[0]).intern());
            android.content.Intent intent = new android.content.Intent(this.getOutputFormats, (java.lang.Class<?>) com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.class);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\uec90\uecf3\udac1\ud99e瘿㟁庱胒⢘诇㈄薒衬杏㴗塑凞딆", android.graphics.Color.rgb(0, 0, 0) + 16777217, objArr6);
            intent.putExtra(((java.lang.String) objArr6[0]).intern(), intern2);
            if (str != null) {
                int i = getHighSpeedVideoSizes + 121;
                getHighSpeedVideoSizesFor = i % 128;
                if (i % 2 != 0) {
                    if (!str.isEmpty()) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 23) % 128;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\ue4ba\ue4d9쌐礵濱ꏳ嚑\u2064ㅏ⭧ꘔᆍ聻續", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr7);
                        intent.putExtra(((java.lang.String) objArr7[0]).intern(), str);
                    }
                } else {
                    throw new java.lang.NullPointerException();
                }
            }
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.setPushServiceListener(new com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener() { // from class: util.h.xy.bv.ma.5
                private static int Camera2StreamConfigurationMap = 0;
                private static int getHighSpeedVideoSizes = 1;
                private static int getHighSpeedVideoSizesFor = 1;
                private static long getOutputFormats = -4178326788104468312L;
                private static int getOutputMinFrameDuration;

                private static void Camera2StreamConfigurationMap(java.lang.String str2, int i2, java.lang.Object[] objArr8) {
                    int i3 = getHighSpeedVideoSizes + 43;
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    char[] charArray = str2.toCharArray();
                    util.h.xz.b.d dVar = new util.h.xz.b.d();
                    dVar.f2628 = i2;
                    int length = charArray.length;
                    long[] jArr = new long[length];
                    dVar.f2629 = 0;
                    while (dVar.f2629 < charArray.length) {
                        jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputFormats ^ (-7508379876853140581L));
                        dVar.f2629++;
                    }
                    char[] cArr = new char[length];
                    dVar.f2629 = 0;
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 41) % 128;
                    while (dVar.f2629 < charArray.length) {
                        cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                        dVar.f2629++;
                    }
                    objArr8[0] = new java.lang.String(cArr);
                }

                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError2) {
                    getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 13) % 128;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ﭿ樂\ud9b8体", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37216, objArr8);
                    java.lang.String intern4 = ((java.lang.String) objArr8[0]).intern();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ﭰ銀⢍웸岿\ueace肶ặ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27127, objArr9);
                    util.h.xy.am.ma.m25027(intern4, ((java.lang.String) objArr9[0]).intern());
                    provisioningServiceErrorArr[0] = provisioningServiceError2;
                    countDownLatch.countDown();
                    int i2 = getHighSpeedVideoSizesFor + 23;
                    getOutputMinFrameDuration = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                }

                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                public final void onUnsupportedPushContent(android.os.Bundle bundle) {
                    java.lang.Object obj;
                    int i2 = getOutputMinFrameDuration + 115;
                    getHighSpeedVideoSizesFor = i2 % 128;
                    if (i2 % 2 == 0) {
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("ﭿ樂\ud9b8体", 37217 >>> (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 72), objArr8);
                        obj = objArr8[0];
                    } else {
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("ﭿ樂\ud9b8体", 37217 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr9);
                        obj = objArr9[0];
                    }
                    java.lang.String intern4 = ((java.lang.String) obj).intern();
                    try {
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("ﭰἾ㏱埆橇蹰ꋊ욙\ud92b\ufde1", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 58441, objArr10);
                        util.h.xy.am.ma.m25027(intern4, ((java.lang.String) objArr10[0]).intern());
                        int i3 = getOutputMinFrameDuration + 61;
                        getHighSpeedVideoSizesFor = i3 % 128;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }

                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                public final void onServerMessage(java.lang.String str2, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage) {
                    getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 53) % 128;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ﭿ樂\ud9b8体", 37217 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr8);
                    java.lang.String intern4 = ((java.lang.String) objArr8[0]).intern();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ﭰࠄᶅ⅄㚯㨢俎卅惦", 62323 - android.graphics.Color.red(0), objArr9);
                    util.h.xy.am.ma.m25027(intern4, ((java.lang.String) objArr9[0]).intern());
                    getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 77) % 128;
                }

                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                public final void onComplete() {
                    getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 85) % 128;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ﭿ樂\ud9b8体", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37216, objArr8);
                    java.lang.String intern4 = ((java.lang.String) objArr8[0]).intern();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ﭰ岌뒕೬撏볺ᒞ沭", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 43003, objArr9);
                    util.h.xy.am.ma.m25027(intern4, ((java.lang.String) objArr9[0]).intern());
                    provisioningServiceErrorArr[0] = null;
                    countDownLatch.countDown();
                    getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 99) % 128;
                }
            });
            com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.enqueueWork(this.getOutputFormats, intent);
            try {
                countDownLatch.await(300L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.InterruptedException e) {
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ろヨ朎㏭쯭뙴芻檽锂懻뎨", android.view.Gravity.getAbsoluteGravity(0, 0) + 1, objArr8);
                sb.append(((java.lang.String) objArr8[0]).intern());
                sb.append(e.getMessage());
                provisioningServiceErrorArr[0] = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, sb.toString(), null);
            }
            provisioningServiceError = provisioningServiceErrorArr[0];
            int i2 = getHighSpeedVideoSizes + 35;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return provisioningServiceError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        if (m25703(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError Camera2StreamConfigurationMap(java.lang.String str) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError highSpeedVideoSizes;
        boolean z;
        synchronized (this) {
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 81) % 128;
            if (!m25703(str)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", 4 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 4 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 89 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), false, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ｇ＄\ue0c3\ue06f䰖傫䵓뤝ኅ눸唶\ue280鮘嵌ҙ㽝\ue9ba", 1 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                highSpeedVideoSizes = getHighSpeedVideoSizes(str);
                if (!m25703(str)) {
                    if (highSpeedVideoSizes == null) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", android.view.KeyEvent.getDeadChar(0, 0) + 4, 4 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 138 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), false, objArr3);
                        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("\u0003\r￫\r\u0001\u0000\uffef\r￫\u0000\u0014\ufffe\u0000", 13 - android.text.TextUtils.indexOf("", "", 0, 0), 5 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 83 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), true, objArr4);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                        highSpeedVideoSizes = getHighSpeedVideoSizes(str);
                    }
                    z = false;
                    if (!z) {
                        return null;
                    }
                    if (highSpeedVideoSizes != null) {
                        return highSpeedVideoSizes;
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_NOT_ENROLLED;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("붑뷒ﺭ⾧剬ꛊྶ盖ೖ緝ꍙᓃ\ud96c䌛쬟줃ꬩ酘ᥗ뽈璡➨咖淨욪痻ꊌ≾遙蠩\uf009遳戾\ude64丈䚢⿃沤鶴㓫漣ꋸ\ueb39\ue920䬙\uf139㥽彶ᔘݣ", 1 - android.graphics.Color.green(0), objArr5);
                    return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, -1, str, ((java.lang.String) objArr5[0]).intern(), hashMap);
                }
            } else {
                getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 121) % 128;
                highSpeedVideoSizes = null;
            }
            z = true;
            if (!z) {
            }
        }
    }

    private static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoFpsRangesFor() {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_NOT_ENROLLED;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("⒇Ⓞ뇋䏠ᴻᴱ難᪰䎀ᆹᣦ꽥䀯ేꝴ犯㈤\ude0a甲Ӽ\uedf3", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr);
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, -1, null, ((java.lang.String) objArr[0]).intern(), null);
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 99) % 128;
        return provisioningServiceError;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25708(java.lang.String str) {
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 67) % 128;
        util.h.xy.d.d result = util.h.xy.k.ma.m26925().mo26175(str).getResult();
        if (result != null) {
            try {
                util.h.xy.k.ma.m26925().mo26174(result.m26180());
            } catch (java.lang.Exception unused) {
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", 5 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 91, false, objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\uffff\uffff\u0000\f￪\u0000\b\uffff\u0000￪\f\u0013", 12 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.getCapsMode("", 0, 0) + 1, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 84, false, objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            util.h.xy.cg.b.m25907().m25911(str);
            return;
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 1) % 128;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", 4 - android.view.View.getDefaultSize(0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, 90 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), false, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0001\u0000\t\u0001￫\r\u0001\u0000\u000b\n￫", 11 - android.text.TextUtils.getTrimmedLength(""), 8 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 82 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), true, objArr4);
        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        int i = getHighSpeedVideoSizesFor + 73;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25704(java.lang.String str) {
        synchronized (this) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", 4 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.graphics.Color.green(0) + 4, 90 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), false, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("땠딣姊䟍\uf51f岟ݴếꮌᖚ夂\ueea5퇆\ue456ꌤ", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (getHighSpeedVideoSizes(str) != null) {
                getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 41) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, 4 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.View.getDefaultSize(0, 0) + 90, false, objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("㌟㍜ே\ue4be꜒\uebc1脋뷌女뛩\uee5c姻垹뙎", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1, objArr4);
                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                int i = getHighSpeedVideoSizesFor + 103;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 != 0) {
                    int i2 = 5 / 5;
                }
            }
        }
        return null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25706(byte[] bArr, java.lang.String str) {
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 1) % 128;
        java.lang.String m25707 = m25707(bArr);
        try {
            if (m25707 != null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("죚좝黸\u244e㈛╯竰紉₹", 1 - android.text.TextUtils.indexOf("", "", 0, 0), objArr);
                if (m25707.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 43) % 128;
                    int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    int red = android.graphics.Color.red(0);
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 39) % 128;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", resolveOpacity + 4, 4 - red, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 91, false, objArr2);
                    java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("骔髗ǈ嚫괝汆⢀࿙\uf39bӺ槛\ude02﹛", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr3);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str);
                    if (Camera2StreamConfigurationMap2 != null) {
                        m25708(new java.lang.String(bArr));
                        m25702(bArr);
                    }
                    return Camera2StreamConfigurationMap2;
                }
            }
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", 3 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, 90 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, objArr4);
            java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 99) % 128;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䵟䴜幥\uf626\uf2b0ඁｋ꽔갶ꑷࠜ뿅⦎", 1 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr5);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
            return m25704(str);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bc, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00be, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c1, code lost:
    
        r2 = Camera2StreamConfigurationMap(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c7, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c9, code lost:
    
        m25708(new java.lang.String(r16));
        m25702(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r2.equalsIgnoreCase(((java.lang.String) r7[0]).intern()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r2.equalsIgnoreCase(((java.lang.String) r7[0]).intern()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        r13 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", android.graphics.Color.alpha(0) + 4, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4, 90 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), false, r13);
        r2 = ((java.lang.String) r13[0]).intern();
        r3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\uffff\u0002￫\u0004\u0000\u0001\r￫\r\u0010\u0000", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 3, 83 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), false, r3);
        util.h.xy.am.ma.m25027(r2, ((java.lang.String) r3[0]).intern());
        r2 = Camera2StreamConfigurationMap(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a5, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a7, code lost:
    
        m25708(new java.lang.String(r16));
        m25702(r16);
        r1 = util.h.xy.bv.ma.getHighSpeedVideoSizesFor + 57;
        util.h.xy.bv.ma.getHighSpeedVideoSizes = r1 % 128;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25705(byte[] bArr, java.lang.String str, java.lang.String str2) {
        java.lang.String m25707 = m25707(bArr);
        if (m25707 != null) {
            int i = getHighSpeedVideoSizes + 19;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("죚좝黸\u244e㈛╯竰紉₹", 0 - android.view.KeyEvent.getDeadChar(0, 0), objArr);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("죚좝黸\u244e㈛╯竰紉₹", 1 - android.view.KeyEvent.getDeadChar(0, 0), objArr2);
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", android.graphics.Color.green(0) + 4, 4 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 90 - android.text.TextUtils.getOffsetBefore("", 0), false, objArr3);
        java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ター嶇䢫\uf152腜芫ᇙ꿔\u1afc蓁㍴呲\ue065갪", android.view.View.getDefaultSize(0, 0) + 1, objArr4);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr4[0]).intern());
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        int i2 = getHighSpeedVideoSizesFor + 77;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25701(byte[] bArr, java.lang.String str) {
        int i;
        int indexOf;
        int i2 = getHighSpeedVideoSizesFor + 51;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            indexOf = android.text.TextUtils.indexOf((java.lang.CharSequence) "", '?') * 4;
            i = 5;
        } else {
            i = 3;
            indexOf = 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        int i3 = indexOf;
        int i4 = (getHighSpeedVideoSizes + 45) % 128;
        getHighSpeedVideoSizesFor = i4;
        getHighSpeedVideoSizes = (i4 + 19) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0002\u0006\uffff\ufff9", i3, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + i, 90 - (android.view.KeyEvent.getMaxKeyCode() >> 16), false, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("㣕㢖둥ꕣᢰބ諒ﰑ䘬\uf72dș", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (Camera2StreamConfigurationMap(str) != null) {
                m25708(new java.lang.String(bArr));
                m25702(bArr);
            }
            return Camera2StreamConfigurationMap(str);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        Camera2StreamConfigurationMap = -1231763834;
        getHighSpeedVideoFpsRangesFor = -2458374765274377031L;
    }
}
