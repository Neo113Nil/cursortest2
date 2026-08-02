package util.h.xy.v;

/* loaded from: classes5.dex */
public final class c {
    private static int Camera2StreamConfigurationMap = 0;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = 0;
    private static com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState getHighSpeedVideoSizesFor = null;
    private static long getInputFormats = 0;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static util.h.xy.v.c getOutputFormats = null;
    private static int getOutputMinFrameDuration = 1;
    private util.h.xy.ag.ma getOutputSizes;
    private util.h.xy.bv.b getOutputStallDurationlomOqCM;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizes ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges() {
        int i = (getOutputMinFrameDuration + 25) % 128;
        Camera2StreamConfigurationMap = i;
        java.lang.String str = getInputSizeshNQ4ISI;
        int i2 = i + 81;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener, com.gemalto.mfs.mwsdk.sdkconfig.SDKError sDKError) {
        int i = Camera2StreamConfigurationMap + 109;
        getOutputMinFrameDuration = i % 128;
        getHighResolutionOutputSizeshNQ4ISI(sDKControllerListener, sDKError);
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = Camera2StreamConfigurationMap + 41;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRangesFor();
        getInputSizeshNQ4ISI = util.h.xy.v.c.class.getName();
        getOutputFormats = null;
        getHighSpeedVideoSizesFor = com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_NOT_INITIALIZED;
        int i = getOutputMinFrameDuration + 55;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 1) % 128;
            jArr[rbVar.f2651] = (((char) (getHighResolutionOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputFormats))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 13) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private c() {
        com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState sDKServiceState = com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_NOT_INITIALIZED;
        int blue = android.graphics.Color.blue(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(blue + 38, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27492), objArr);
        m27652(sDKServiceState, ((java.lang.String) objArr[0]).intern());
        this.getOutputSizes = new util.h.xy.ag.ma();
        this.getOutputStallDurationlomOqCM = new util.h.xy.bv.b();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.v.c m27646() {
        util.h.xy.v.c cVar;
        synchronized (util.h.xy.v.c.class) {
            int i = getOutputMinFrameDuration + 69;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                if (getOutputFormats == null) {
                    getOutputFormats = new util.h.xy.v.c();
                    int i2 = getOutputMinFrameDuration + 39;
                    Camera2StreamConfigurationMap = i2 % 128;
                    int i3 = i2 % 2;
                }
                cVar = getOutputFormats;
            } else {
                throw null;
            }
        }
        return cVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27651(android.content.Context context, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) throws com.gemalto.mfs.mwsdk.exception.SDKInitializationException {
        if (m27665()) {
            Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 109) % 128;
            if ((context.getApplicationInfo().flags & 2) != 2) {
                com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.DEBUG_SDK_USED;
                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(packedPositionType + 41, 39 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 34957), objArr);
                throw new com.gemalto.mfs.mwsdk.exception.SDKInitializationException(sDKInitializeErrorCode, ((java.lang.String) objArr[0]).intern());
            }
        }
        if (!m27648()) {
            int i = Camera2StreamConfigurationMap + 111;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                Camera2StreamConfigurationMap(context, customConfiguration);
            } else {
                Camera2StreamConfigurationMap(context, customConfiguration);
                throw null;
            }
        }
        if (!m27648()) {
            m27656((com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener) null);
        } else {
            getHighSpeedVideoFpsRanges(null);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27655(android.content.Context context, final com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) {
        int i = getOutputMinFrameDuration + 3;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            if (m27665() && (context.getApplicationInfo().flags & 2) != 2) {
                com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.DEBUG_SDK_USED;
                int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(41 - offsetAfter, 38 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 34956), objArr);
                getHighResolutionOutputSizeshNQ4ISI(sDKControllerListener, new util.h.xy.v.mc(sDKInitializeErrorCode, ((java.lang.String) objArr[0]).intern()));
                Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 47) % 128;
                return;
            }
            try {
                if (m27648()) {
                    getHighSpeedVideoFpsRanges(sDKControllerListener);
                    return;
                }
                Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 53) % 128;
                Camera2StreamConfigurationMap(context, customConfiguration);
                new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.v.c.5
                    private static int getHighSpeedVideoFpsRanges = 0;
                    private static int getHighSpeedVideoSizes = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = getHighSpeedVideoFpsRanges;
                        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
                        getHighSpeedVideoSizes = i3 % 128;
                        try {
                            if (i3 % 2 != 0) {
                                util.h.xy.v.c.this.m27656(sDKControllerListener);
                            } else {
                                util.h.xy.v.c.this.m27656(sDKControllerListener);
                                throw new java.lang.NullPointerException();
                            }
                        } catch (com.gemalto.mfs.mwsdk.exception.SDKInitializationException e) {
                            com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().shutDown();
                            util.h.xy.v.c.getHighSpeedVideoSizes(sDKControllerListener, new util.h.xy.v.mc(e.getErrorCode(), e.getErrorMessage(), e.getCausingException(), e.getAdditionalInformation()));
                        } catch (java.lang.Exception e2) {
                            util.h.xy.v.c.getHighSpeedVideoFpsRanges();
                            util.h.xy.al.rc.m25022(e2);
                            com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().shutDown();
                            com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode2 = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.SDK_INIT_FAILED;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(e2.getMessage());
                            sb.append(util.h.xy.al.rc.m25019(e2));
                            util.h.xy.v.c.getHighSpeedVideoSizes(sDKControllerListener, new util.h.xy.v.mc(sDKInitializeErrorCode2, sb.toString(), e2));
                        }
                    }
                }).start();
                return;
            } catch (com.gemalto.mfs.mwsdk.exception.SDKInitializationException e) {
                com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().shutDown();
                getHighResolutionOutputSizeshNQ4ISI(sDKControllerListener, new util.h.xy.v.mc(e.getErrorCode(), e.getErrorMessage(), e.getCausingException(), e.getAdditionalInformation()));
                return;
            } catch (java.lang.Exception e2) {
                com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode2 = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.SDK_INIT_FAILED;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(e2.getMessage());
                sb.append(util.h.xy.al.rc.m25019(e2));
                getHighResolutionOutputSizeshNQ4ISI(sDKControllerListener, new util.h.xy.v.mc(sDKInitializeErrorCode2, sb.toString(), e2));
                return;
            }
        }
        m27665();
        throw null;
    }

    private void Camera2StreamConfigurationMap(android.content.Context context, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) throws com.gemalto.mfs.mwsdk.exception.SDKInitializationException {
        synchronized (this) {
            try {
                try {
                    util.h.xy.ag.a.m24556().m24559(context.getApplicationContext());
                    if (util.h.xy.bh.ra.m25484().m25485() == null) {
                        util.h.xy.bh.ra.m25484().m25486(context.getApplicationContext());
                    }
                    m27666();
                    util.h.xy.aw.ra.m25248();
                    if (customConfiguration == null) {
                        customConfiguration = new com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder().build();
                    }
                    util.h.xy.af.mb.m24551().m24552();
                    int m27658 = m27658(context.getApplicationContext(), (util.h.xy.bu.a) customConfiguration);
                    if (m27658 != -91) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put(util.h.xy.al.b.f183, util.h.xy.ar.b.m25093(m27658));
                        throw new com.gemalto.mfs.mwsdk.exception.SDKInitializationException(com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.DEVICE_SUSPICIOUS, util.h.xy.ar.b.m25093(m27658), null, hashMap);
                    }
                    if (612000 < util.h.xy.n.a.f2244) {
                        com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.SDK_DATA_VERSION_NOT_SUPPORTED;
                        float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 79, android.view.MotionEvent.axisFromString("") + 80, (char) (android.text.TextUtils.getTrimmedLength("") + 64628), objArr);
                        throw new com.gemalto.mfs.mwsdk.exception.SDKInitializationException(sDKInitializeErrorCode, ((java.lang.String) objArr[0]).intern(), null, null);
                    }
                    int m27023 = util.h.xy.p.a.m27023(context);
                    if (m27023 == 0) {
                        try {
                            util.h.xy.p.a.m27021(context, util.h.xy.n.a.f2244);
                        } catch (java.io.IOException | org.json.JSONException e) {
                            com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().shutDown();
                            util.h.xy.al.rc.m25022(e);
                            com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode2 = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.SDK_INIT_FAILED;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(e.getMessage());
                            sb.append(util.h.xy.al.rc.m25019(e));
                            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(packedPositionGroup + 28, 159 - android.graphics.Color.alpha(0), (char) (android.view.View.MeasureSpec.getSize(0) + 41696), objArr2);
                            sb.append(((java.lang.String) objArr2[0]).intern());
                            throw new com.gemalto.mfs.mwsdk.exception.SDKInitializationException(sDKInitializeErrorCode2, sb.toString(), e);
                        }
                    } else if (612000 < m27023) {
                        com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode3 = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.SDK_DATA_VERSION_NOT_SUPPORTED;
                        int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(offsetAfter + 44, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 187, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
                            throw new com.gemalto.mfs.mwsdk.exception.SDKInitializationException(sDKInitializeErrorCode3, ((java.lang.String) objArr3[0]).intern(), null, null);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                } catch (java.lang.Exception e2) {
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().shutDown();
                    util.h.xy.al.rc.m25022(e2);
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode4 = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.SDK_INIT_FAILED;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(e2.getMessage());
                    sb2.append(util.h.xy.al.rc.m25019(e2));
                    throw new com.gemalto.mfs.mwsdk.exception.SDKInitializationException(sDKInitializeErrorCode4, sb2.toString(), e2);
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27654(final android.content.Context context, final com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            if (context == null) {
                int ordinal = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.NULL_CONTEXT_ERROR.ordinal();
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(23 - indexOf, android.text.TextUtils.indexOf("", "", 0, 0) + 231, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(ordinal, ((java.lang.String) objArr[0]).intern());
            }
            if (m27665()) {
                int i = Camera2StreamConfigurationMap + 97;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 != 0) {
                    if ((context.getApplicationInfo().flags & 2) == 2) {
                    }
                    int ordinal2 = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.DEBUG_SDK_USED.ordinal();
                    int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(41 - (longPressTimeout >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 38, (char) (34956 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr2);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(ordinal2, ((java.lang.String) objArr2[0]).intern());
                }
                if ((context.getApplicationInfo().flags & 3) == 4) {
                }
                int ordinal22 = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.DEBUG_SDK_USED.ordinal();
                int longPressTimeout2 = android.view.ViewConfiguration.getLongPressTimeout();
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(41 - (longPressTimeout2 >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 38, (char) (34956 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr22);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(ordinal22, ((java.lang.String) objArr22[0]).intern());
            }
            util.h.xy.ag.a.m24556().m24559(context.getApplicationContext());
            if (util.h.xy.bh.ra.m25484().m25485() == null) {
                util.h.xy.bh.ra.m25484().m25486(context.getApplicationContext());
            }
            try {
                m27666();
                try {
                    util.h.xy.aw.ra.m25248();
                    Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 27) % 128;
                    new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.v.c.4
                        private static int getHighSpeedVideoFpsRanges = 1;
                        private static int getHighSpeedVideoSizes;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = getHighSpeedVideoSizes + 85;
                            getHighSpeedVideoFpsRanges = i2 % 128;
                            if (i2 % 2 == 0) {
                                throw new java.lang.NullPointerException();
                            }
                            com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration2 = customConfiguration;
                            if (customConfiguration2 == null) {
                                customConfiguration2 = new com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder().build();
                                int i3 = getHighSpeedVideoSizes;
                                getHighSpeedVideoFpsRanges = (((i3 | 35) << 1) - (i3 ^ 35)) % 128;
                            }
                            util.h.xy.v.c.this.m27658(context, (util.h.xy.bu.a) customConfiguration2);
                            util.h.xy.bg.a.f944.m25454().countDown();
                            int i4 = getHighSpeedVideoFpsRanges;
                            getHighSpeedVideoSizes = ((i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                            int i5 = getHighSpeedVideoSizes + 41;
                            getHighSpeedVideoFpsRanges = i5 % 128;
                            if (i5 % 2 == 0) {
                                throw new java.lang.ArithmeticException();
                            }
                        }
                    }).start();
                } catch (java.lang.IllegalStateException unused) {
                    int ordinal3 = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.INTERNAL_COMPONENT_ERROR.ordinal();
                    int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(19 - (scrollDefaultDelay >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 270, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(ordinal3, ((java.lang.String) objArr3[0]).intern());
                }
            } catch (java.io.IOException e) {
                e.getMessage();
                int ordinal4 = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.INTERNAL_COMPONENT_ERROR.ordinal();
                float complexToFloat = android.util.TypedValue.complexToFloat(0);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(15 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), 256 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(ordinal4, ((java.lang.String) objArr4[0]).intern());
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(6:(3:8|(1:10)|11)|23|24|25|26|11)|15|16|17|18|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x021e, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x021f, code lost:
    
        r0 = m27646();
        r1 = com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_NOT_INITIALIZED;
        r6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 14, 549 - android.graphics.Color.red(0), (char) android.graphics.Color.red(0), r6);
        r0.m27652(r1, ((java.lang.String) r6[0]).intern());
        m27661(r14);
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27656(com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener) throws com.gemalto.mfs.mwsdk.exception.SDKInitializationException {
        com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState sDKServiceState;
        long zoomControlsTimeout;
        android.content.Context m24558;
        com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState;
        synchronized (this) {
            try {
                try {
                    if (getHighSpeedVideoSizesFor != com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_NOT_INITIALIZED && getHighSpeedVideoSizesFor != com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZING_IN_PROGRESS) {
                        if (getHighSpeedVideoSizesFor == com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED) {
                            util.h.xy.ag.a.m24556().m24558();
                            getHighSpeedVideoFpsRanges(sDKControllerListener);
                            Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 43) % 128;
                        }
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(33 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 353, (char) (5608 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), objArr);
                    getHighSpeedVideoFpsRangesFor(sDKControllerListener, sDKSetupProgressState, ((java.lang.String) objArr[0]).intern());
                    util.h.xy.m.mb.m26975(m24558).initialize();
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState2 = com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState.DCM_MODULE_INIT_COMPLETED;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(android.graphics.Color.red(0) + 26, 384 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (28268 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr2);
                    getHighSpeedVideoFpsRangesFor(sDKControllerListener, sDKSetupProgressState2, ((java.lang.String) objArr2[0]).intern());
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState3 = com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState.PAYMENT_MODULE_INIT_STARTED;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(38 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 410 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
                    getHighSpeedVideoFpsRangesFor(sDKControllerListener, sDKSetupProgressState3, ((java.lang.String) objArr3[0]).intern());
                    util.h.xy.bu.mb.m25666().initialize();
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState4 = com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState.PAYMENT_MODULE_INIT_COMPLETED;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(30 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 448 - android.text.TextUtils.indexOf("", ""), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30011), objArr4);
                    getHighSpeedVideoFpsRangesFor(sDKControllerListener, sDKSetupProgressState4, ((java.lang.String) objArr4[0]).intern());
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState5 = com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState.PROVISION_MODULE_INIT_STARTED;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(40 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 478 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (16801 - android.text.TextUtils.indexOf("", "", 0)), objArr5);
                    getHighSpeedVideoFpsRangesFor(sDKControllerListener, sDKSetupProgressState5, ((java.lang.String) objArr5[0]).intern());
                    util.h.xy.ca.b m25836 = util.h.xy.ca.b.m25836(m24558);
                    util.h.xy.ca.ra m25842 = util.h.xy.ca.ra.m25842(m24558);
                    util.h.xy.ca.mb m25841 = util.h.xy.ca.mb.m25841(m24558);
                    util.h.xy.ca.a m25835 = util.h.xy.ca.a.m25835(m24558);
                    m25836.initialize();
                    m25842.initialize();
                    m25841.initialize();
                    m25835.initialize();
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState6 = com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState.PROVISION_MODULE_INIT_COMPLETED;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr6);
                    getHighSpeedVideoFpsRangesFor(sDKControllerListener, sDKSetupProgressState6, ((java.lang.String) objArr6[0]).intern());
                    getHighSpeedVideoFpsRanges(sDKControllerListener);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 36, 289 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) android.view.View.MeasureSpec.getSize(0), objArr7);
                m27652(sDKServiceState, ((java.lang.String) objArr7[0]).intern());
                com.gemalto.mfs.mwsdk.SDKEnv.displaySDKVersion();
                com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState7 = com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState.SDK_INIT_STARTED;
                getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 19) % 128;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(26 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), 326 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 44505), objArr8);
                getHighSpeedVideoFpsRangesFor(sDKControllerListener, sDKSetupProgressState7, ((java.lang.String) objArr8[0]).intern());
                m24558 = util.h.xy.ag.a.m24556().m24558();
                sDKSetupProgressState = com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState.DCM_MODULE_INIT_STARTED;
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            sDKServiceState = com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZING_IN_PROGRESS;
            zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
            int i = getOutputMinFrameDuration + 19;
            Camera2StreamConfigurationMap = i % 128;
            int i2 = i % 2;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27657(java.util.Observer observer) {
        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 63) % 128;
        this.getOutputSizes.addObserver(observer);
        int i = Camera2StreamConfigurationMap + 113;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27649() {
        int i = getOutputMinFrameDuration + 57;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            if (this.getOutputSizes.countObservers() > 0) {
                int i2 = getOutputMinFrameDuration + 87;
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 == 0) {
                    this.getOutputSizes.deleteObservers();
                } else {
                    this.getOutputSizes.deleteObservers();
                    throw new java.lang.ArithmeticException();
                }
            }
            getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 55) % 128;
            return;
        }
        this.getOutputSizes.countObservers();
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27663(util.h.xy.ag.ma.InterfaceC0255ma interfaceC0255ma) {
        int i = Camera2StreamConfigurationMap + 29;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            this.getOutputSizes.m24563(interfaceC0255ma);
        } else {
            this.getOutputSizes.m24563(interfaceC0255ma);
            throw new java.lang.ArithmeticException();
        }
    }

    private void getHighSpeedVideoFpsRanges(final com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener) {
        Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 1) % 128;
        com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState sDKServiceState = com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED;
        int touchSlop = android.view.ViewConfiguration.getTouchSlop();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((touchSlop >> 8) + 37, absoluteGravity + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr);
        m27652(sDKServiceState, ((java.lang.String) objArr[0]).intern());
        com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState = com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState.SDK_INIT_COMPLETED;
        int blue = android.graphics.Color.blue(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(20 - blue, 564 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.text.TextUtils.getOffsetBefore("", 0) + 15652), objArr2);
        getHighSpeedVideoFpsRangesFor(sDKControllerListener, sDKSetupProgressState, ((java.lang.String) objArr2[0]).intern());
        this.getOutputSizes.m24562();
        if (getHighSpeedVideoSizesFor == com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED) {
            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.v.c.1
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                private static int getHighSpeedVideoFpsRanges = 0;
                private static int getInputFormats = 1;
                private static int getOutputMinFrameDuration = -1231763960;

                private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr3) {
                    int i4 = Camera2StreamConfigurationMap + 41;
                    getHighSpeedVideoFpsRanges = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    char[] charArray = str.toCharArray();
                    util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                    char[] cArr = new char[i];
                    raVar.f2649 = 0;
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 5) % 128;
                    while (raVar.f2649 < i) {
                        raVar.f2650 = charArray[raVar.f2649];
                        cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
                        int i5 = raVar.f2649;
                        cArr[i5] = (char) (cArr[i5] - ((int) (getOutputMinFrameDuration ^ (-4839292868003314026L))));
                        raVar.f2649++;
                    }
                    if (i2 > 0) {
                        raVar.f2648 = i2;
                        char[] cArr2 = new char[i];
                        java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
                        java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
                        java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
                    }
                    objArr3[0] = new java.lang.String(cArr);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
                    if (sDKControllerListener != null) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\ufff9\u0002\u0006\uffff", 4 - android.view.KeyEvent.keyCodeFromString(""), 1 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, objArr3);
                        java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("￪\n\uffff￪\u000b\u000f\uffff\u000f\uffff\u0005", 10 - android.view.View.MeasureSpec.getMode(0), android.view.View.getDefaultSize(0, 0) + 7, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 227, objArr4);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr4[0]).intern());
                        sDKControllerListener.onSetupComplete();
                    }
                    getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 9) % 128;
                }
            });
        }
        util.h.xy.bg.a.f944.m25452().countDown();
        Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 125) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0122, code lost:
    
        if (r11.equalsIgnoreCase(((java.lang.String) r4[0]).intern()) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x015c, code lost:
    
        r1 = android.view.ViewConfiguration.getTouchSlop();
        r2 = android.view.ViewConfiguration.getZoomControlsTimeout();
        r5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(37 - (r1 >> 8), (r2 > 0 ? 1 : (r2 == 0 ? 0 : -1)) + 715, (char) (63978 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0188, code lost:
    
        if (r11.equalsIgnoreCase(((java.lang.String) r5[0]).intern()) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x018a, code lost:
    
        util.h.xy.v.c.Camera2StreamConfigurationMap = (util.h.xy.v.c.getOutputMinFrameDuration + 85) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x019e, code lost:
    
        return util.h.xy.ca.a.m25835(util.h.xy.ag.a.m24556().m24558());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x019f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015b, code lost:
    
        return util.h.xy.ca.mb.m25841(util.h.xy.ag.a.m24556().m24558());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014d, code lost:
    
        if (r11.equalsIgnoreCase(((java.lang.String) r4[0]).intern()) != false) goto L27;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.gemalto.mfs.mwsdk.sdkconfig.BusinessService m27660(java.lang.String str) {
        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 125) % 128;
        int blue = android.graphics.Color.blue(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(blue + 30, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 583, (char) android.view.KeyEvent.keyCodeFromString(""), objArr);
        if (str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
            return util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
        }
        float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 22, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 613, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr2);
        if (str.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
            return util.h.xy.bu.mb.m25666();
        }
        long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 26, 635 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.MotionEvent.axisFromString("") + 1), objArr3);
        if (str.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
            return util.h.xy.ca.b.m25836(util.h.xy.ag.a.m24556().m24558());
        }
        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(24 - deadChar, 662 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
        if (str.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
            return util.h.xy.ca.ra.m25842(util.h.xy.ag.a.m24556().m24558());
        }
        int scrollDefaultDelay = 30 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
        int mirror = 734 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i = Camera2StreamConfigurationMap + 87;
        getOutputMinFrameDuration = i % 128;
        try {
            if (i % 2 == 0) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(scrollDefaultDelay, mirror, (char) (1 >> (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr5);
            } else {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(scrollDefaultDelay, mirror, (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr6);
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27653() {
        util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).reset();
        util.h.xy.bu.mb.m25666().reset();
        util.h.xy.ca.b.m25836(util.h.xy.ag.a.m24556().m24558()).reset();
        util.h.xy.ca.ra.m25842(util.h.xy.ag.a.m24556().m24558()).reset();
        util.h.xy.ca.mb.m25841(util.h.xy.ag.a.m24556().m24558()).reset();
        util.h.xy.ca.a.m25835(util.h.xy.ag.a.m24556().m24558()).reset();
        com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState sDKServiceState = com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_NOT_INITIALIZED;
        int i = (Camera2StreamConfigurationMap + 99) % 128;
        getOutputMinFrameDuration = i;
        Camera2StreamConfigurationMap = (i + 7) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(22 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 753 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.View.combineMeasuredStates(0, 0) + 32186), objArr);
            m27652(sDKServiceState, ((java.lang.String) objArr[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m27658(android.content.Context context, util.h.xy.bu.a aVar) {
        int m27671 = util.h.xy.v.mb.m27671(context, aVar);
        util.h.xy.bg.a.f944.m25454().countDown();
        if (m27671 == -91) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ዒ䱸꾝म案쯣┉萞\ue7f4䄍ꃯϠ絪\udcb0㿀饿", 24229 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ዚᄻᔁᤧᴽġԶउഎㄒ㔾㤕㴙Ⅲ╬⥥\u2d77兽啱", 1019 - android.view.View.getDefaultSize(0, 0), objArr2);
                if (((java.lang.Boolean) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).booleanValue()) {
                    return 803;
                }
                if (util.h.xy.aw.ma.m25245()) {
                    int i = Camera2StreamConfigurationMap + 1;
                    getOutputMinFrameDuration = i % 128;
                    return i % 2 == 0 ? 26527 : 805;
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i2 = getOutputMinFrameDuration + 11;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return m27671;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoFpsRangesFor(final com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener, final com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState, final java.lang.String str) {
        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 85) % 128;
        if (sDKControllerListener != null) {
            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.v.c.3
                private static int getHighSpeedVideoFpsRanges = 1;
                private static int getHighSpeedVideoFpsRangesFor = 0;
                private static int getInputFormats = 1;
                private static int getInputSizeshNQ4ISI;
                private static char[] getHighSpeedVideoSizesFor = {63894, 24246, 47083, 3117, 29993, 53862, 15154, 33012, 59863, 12661, 40498, 59364, 19642, 37947, 64798, 23246, 41865};
                private static long getOutputFormats = -9037601424646390979L;

                private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
                    int i3;
                    util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                    long[] jArr = new long[i];
                    rbVar.f2651 = 0;
                    while (rbVar.f2651 < i) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 77) % 128;
                        jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputFormats))) ^ c;
                        rbVar.f2651++;
                    }
                    char[] cArr = new char[i];
                    rbVar.f2651 = 0;
                    while (rbVar.f2651 < i) {
                        int i4 = getHighSpeedVideoFpsRanges + 77;
                        getHighSpeedVideoFpsRangesFor = i4 % 128;
                        if (i4 % 2 != 0) {
                            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                            i3 = rbVar.f2651 - 1;
                        } else {
                            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                            i3 = rbVar.f2651 + 1;
                        }
                        rbVar.f2651 = i3;
                    }
                    objArr[0] = new java.lang.String(cArr);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    getInputFormats = (getInputSizeshNQ4ISI + 7) % 128;
                    util.h.xy.v.c.getHighSpeedVideoFpsRanges();
                    if (com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener.this != null) {
                        getInputSizeshNQ4ISI = (getInputFormats + 33) % 128;
                        float minVolume = android.media.AudioTrack.getMinVolume();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes(4 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), android.view.ViewConfiguration.getEdgeSlop() >> 16, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26027), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(indexOf + 14, 4 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 59655), objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener.this.onSetupProgress(sDKSetupProgressState, str);
                    }
                    getInputFormats = (getInputSizeshNQ4ISI + 31) % 128;
                }
            });
            getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 57) % 128;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(final com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener, final com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode> sDKError) {
        int i = Camera2StreamConfigurationMap + 107;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (sDKControllerListener != null) {
            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.v.c.2
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                private static int getHighSpeedVideoFpsRangesFor = 0;
                private static long getInputFormats = 4636343355539624084L;
                private static int getOutputFormats = 1;

                private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i2, java.lang.Object[] objArr) {
                    int i3 = getHighResolutionOutputSizeshNQ4ISI + 71;
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    char[] charArray = str.toCharArray();
                    util.h.xz.b.a aVar = new util.h.xz.b.a();
                    char[] m27721 = util.h.xz.b.a.m27721(getInputFormats ^ 7817488252581312552L, charArray, i2);
                    aVar.f2623 = 4;
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
                    while (aVar.f2623 < m27721.length) {
                        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 9) % 128;
                        aVar.f2624 = aVar.f2623 - 4;
                        m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getInputFormats ^ 7817488252581312552L)));
                        aVar.f2623++;
                    }
                    objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = getOutputFormats + 79;
                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                    if (i2 % 2 == 0) {
                        util.h.xy.v.c.getHighSpeedVideoFpsRanges();
                        if (com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener.this != null) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("꧌⨢ꦀ䋎ᩃ㳽쭲ڊ", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 11) % 128;
                            try {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("끎瘯뀝Ố諯箜寞ዮ䆆緐\u2fff鳧\uf580\ud8fc䳃", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1, objArr2);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                                com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener.this.onError(sDKError);
                                return;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        return;
                    }
                    util.h.xy.v.c.getHighSpeedVideoFpsRanges();
                    throw null;
                }
            });
        }
        int i2 = Camera2StreamConfigurationMap + 121;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState m27659() {
        int i = Camera2StreamConfigurationMap;
        getOutputMinFrameDuration = (i + 81) % 128;
        com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState sDKServiceState = getHighSpeedVideoSizesFor;
        int i2 = i + 93;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            return sDKServiceState;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27652(com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState sDKServiceState, java.lang.String str) {
        synchronized (this) {
            int i = (getOutputMinFrameDuration + 19) % 128;
            Camera2StreamConfigurationMap = i;
            getHighSpeedVideoSizesFor = sDKServiceState;
            getOutputMinFrameDuration = (i + 25) % 128;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final boolean m27665() {
        int i = Camera2StreamConfigurationMap + 109;
        int i2 = i % 128;
        getOutputMinFrameDuration = i2;
        boolean z = i % 2 == 0;
        Camera2StreamConfigurationMap = (i2 + 17) % 128;
        return z;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final boolean m27648() {
        boolean z;
        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 113) % 128;
        if (m27659() == com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED) {
            z = true;
        } else {
            Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 93) % 128;
            z = false;
        }
        Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 11) % 128;
        return z;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final boolean m27647() {
        int i = getOutputMinFrameDuration + 61;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ag.a.m24556().m24560();
            throw new java.lang.ArithmeticException();
        }
        if (!util.h.xy.ag.a.m24556().m24560()) {
            return false;
        }
        if (m27648()) {
            return true;
        }
        int i2 = Camera2StreamConfigurationMap + 85;
        getOutputMinFrameDuration = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m27656((com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener) null);
                return true;
            }
            m27656((com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener) null);
            throw null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27661(com.gemalto.mfs.mwsdk.exception.InternalComponentException internalComponentException) throws com.gemalto.mfs.mwsdk.exception.SDKInitializationException {
        boolean z;
        com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode;
        java.lang.Throwable th = internalComponentException;
        while (true) {
            int i = (Camera2StreamConfigurationMap + 11) % 128;
            getOutputMinFrameDuration = i;
            if (th == null) {
                break;
            }
            int i2 = i + 85;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                th.getCause();
                throw null;
            }
            if (th.getCause() == null) {
                break;
            }
            if (th.getCause() instanceof util.h.xy.da.b) {
                int i3 = Camera2StreamConfigurationMap + 67;
                getOutputMinFrameDuration = i3 % 128;
                if (i3 % 2 != 0) {
                    z = true;
                }
            } else {
                th = th.getCause();
            }
        }
        z = false;
        boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(internalComponentException);
        boolean highSpeedVideoSizes = getHighSpeedVideoSizes(internalComponentException);
        java.lang.String m25019 = util.h.xy.al.rc.m25019(internalComponentException);
        com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().shutDown();
        if (highSpeedVideoSizes) {
            sDKInitializeErrorCode = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.NULL_CONTEXT_ERROR;
        } else if (Camera2StreamConfigurationMap2) {
            sDKInitializeErrorCode = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.KEY_STORE_INACCESSIBLE;
        } else if (m25019 == null || !m25019.contains(util.h.xy.al.ra.f716)) {
            if (m25019 != null) {
                int i4 = Camera2StreamConfigurationMap + 9;
                getOutputMinFrameDuration = i4 % 128;
                if (i4 % 2 == 0) {
                    Camera2StreamConfigurationMap(m25019);
                    throw new java.lang.ArithmeticException();
                }
                if (Camera2StreamConfigurationMap(m25019)) {
                    sDKInitializeErrorCode = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.ASM_MIGRATION_ERROR;
                }
            }
            if (z) {
                sDKInitializeErrorCode = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.STORAGE_COMPONENT_ERROR;
                getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 49) % 128;
            } else {
                sDKInitializeErrorCode = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.INTERNAL_COMPONENT_ERROR;
            }
        } else {
            sDKInitializeErrorCode = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.INVALID_PREVIOUS_VERSION;
        }
        throw new com.gemalto.mfs.mwsdk.exception.SDKInitializationException(sDKInitializeErrorCode, m25019, internalComponentException);
    }

    private boolean Camera2StreamConfigurationMap(java.lang.Throwable th) {
        while (true) {
            int i = getOutputMinFrameDuration;
            Camera2StreamConfigurationMap = (i + 47) % 128;
            if (th == null) {
                return false;
            }
            int i2 = i + 101;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                th.getCause();
                throw new java.lang.ArithmeticException();
            }
            if (th.getCause() == null) {
                return false;
            }
            if (th.getCause() instanceof com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException) {
                return true;
            }
            th = th.getCause();
        }
    }

    private static boolean getHighSpeedVideoSizes(java.lang.Throwable th) {
        if (th != null) {
            if (th.getMessage() != null) {
                java.lang.String message = th.getMessage();
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(25 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), 775 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.text.TextUtils.indexOf("", ""), objArr);
                    if (message.contains(((java.lang.String) objArr[0]).intern())) {
                        int i = Camera2StreamConfigurationMap + 59;
                        getOutputMinFrameDuration = i % 128;
                        return i % 2 != 0;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            if (th.getCause() != null && th.getCause().getMessage() != null) {
                getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 25) % 128;
                java.lang.String message2 = th.getCause().getMessage();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(23 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 775, (char) android.text.TextUtils.getOffsetBefore("", 0), objArr2);
                if (message2.contains(((java.lang.String) objArr2[0]).intern())) {
                    return true;
                }
            }
            return false;
        }
        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 43) % 128;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0116 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        if (str == null) {
            int i = getOutputMinFrameDuration + 35;
            Camera2StreamConfigurationMap = i % 128;
            return i % 2 != 0;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", "", 0, 0) + 53, 799 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.View.getDefaultSize(0, 0) + 54457), objArr);
        if (!str.contains(((java.lang.String) objArr[0]).intern())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(52 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 853, (char) (50950 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr2);
            if (!str.contains(((java.lang.String) objArr2[0]).intern())) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(79 - android.widget.ExpandableListView.getPackedPositionType(0L), 905 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                if (!str.contains(((java.lang.String) objArr3[0]).intern())) {
                    getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 97) % 128;
                    int longPressTimeout = 55 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 985;
                    int i2 = getOutputMinFrameDuration;
                    Camera2StreamConfigurationMap = (i2 + 15) % 128;
                    int i3 = i2 + 79;
                    Camera2StreamConfigurationMap = i3 % 128;
                    try {
                        if (i3 % 2 != 0) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(longPressTimeout, indexOf, (char) (53162 << (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() % 67)), objArr4);
                            if (!str.contains(((java.lang.String) objArr4[0]).intern())) {
                                return false;
                            }
                        } else {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(longPressTimeout, indexOf, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 53162), objArr5);
                            if (!str.contains(((java.lang.String) objArr5[0]).intern())) {
                            }
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
        }
        return true;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m27666() throws java.io.IOException {
        synchronized (this) {
            android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
            java.io.File filesDir = m24558.getFilesDir();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(filesDir.getAbsolutePath());
            try {
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((intValue >> 22) + 1, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1039, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 63375), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                float minVolume = android.media.AudioTrack.getMinVolume();
                int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(8 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), resolveSizeAndState + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_WATERMARK, (char) android.text.TextUtils.indexOf("", "", 0, 0), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                java.io.File file = new java.io.File(sb.toString());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(filesDir.getAbsolutePath());
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), 1039 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.View.MeasureSpec.getMode(0) + 63375), objArr3);
                sb2.append(((java.lang.String) objArr3[0]).intern());
                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(8 - packedPositionType, android.text.TextUtils.getOffsetBefore("", 0) + 1048, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
                sb2.append(((java.lang.String) objArr4[0]).intern());
                java.io.File file2 = new java.io.File(sb2.toString());
                if (file.exists()) {
                    byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                    int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(7 - modifierMetaStateMask, trimmedLength + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_WATERMARK, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr5);
                    byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(m24558, ((java.lang.String) objArr5[0]).intern());
                    float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                    int resolveSize = android.view.View.resolveSize(0, 0);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 6, resolveSize + 1056, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24520), objArr6);
                    util.h.xy.av.ra.m25239(m24558, ((java.lang.String) objArr6[0]).intern(), util.h.xy.al.rb.m25016(highSpeedVideoFpsRanges));
                    file.delete();
                }
                if (file2.exists()) {
                    long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(9 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0) + 1048, (char) android.text.TextUtils.indexOf("", ""), objArr7);
                    byte[] highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(m24558, ((java.lang.String) objArr7[0]).intern());
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(7 - makeMeasureSpec, lastIndexOf + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PIXEL_ASPECT_RATIO, (char) (1832 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr8);
                    util.h.xy.av.ra.m25239(m24558, ((java.lang.String) objArr8[0]).intern(), util.h.xy.al.rb.m25016(highSpeedVideoFpsRanges2));
                    file2.delete();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private static byte[] getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.String str) throws java.io.IOException {
        java.io.FileInputStream fileInputStream;
        java.io.File filesDir = context.getFilesDir();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1039 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 63375), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(str);
        java.io.File file = new java.io.File(sb.toString());
        try {
            fileInputStream = context.openFileInput(str);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                if (fileInputStream != null) {
                    getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 35) % 128;
                    fileInputStream.close();
                }
                return bArr;
            } catch (java.lang.Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    fileInputStream.close();
                    int i = getOutputMinFrameDuration + 93;
                    Camera2StreamConfigurationMap = i % 128;
                    int i2 = i % 2;
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27662(java.util.Observer observer) {
        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 5) % 128;
        this.getOutputStallDurationlomOqCM.addObserver(observer);
        this.getOutputStallDurationlomOqCM.m25680(observer);
        int i = Camera2StreamConfigurationMap + 83;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27650(java.util.Observer observer) {
        int i = getOutputMinFrameDuration + 33;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            this.getOutputStallDurationlomOqCM.deleteObserver(observer);
        } else {
            this.getOutputStallDurationlomOqCM.deleteObserver(observer);
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27664(util.h.xy.bv.b.ma.EnumC0265b enumC0265b) {
        int i = Camera2StreamConfigurationMap + 101;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            this.getOutputStallDurationlomOqCM.m25681(enumC0265b);
        } else {
            this.getOutputStallDurationlomOqCM.m25681(enumC0265b);
            throw null;
        }
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = -7136463477513117400L;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        char[] cArr = new char[1070];
        java.nio.ByteBuffer.wrap("÷,\u0018\u0017)T:\u0085KÊ[\nl]}\u0092\u008eÚ\u009e*¯y°ºÁ\u008fÑ:âióª\u0004æ\u0015ö%36eG§hæx!\u0089m\u009a «Ë»>Ì^Ý\u009bîÚþ\u0019\u000fS\u0010\u0090!º2éB>Sgdó\u0014ÉûÔÊ\u0097ÙL¨\u001a¸\u0081\u008f¶\u009emm&}±L¶Sx\"32ï\u0001ª\u0010}çmö\u0013ÆÐÕÙ¤H\u008b\u0012\u009bÀj\u008dy\rH&Xü/\u00ad>u\ra\u001d×ì¬óaÂTÑ\u0014¡Ê°\u0098\u0087\u0001\u0096$fÙu\u009d`8\u008f\u0000¾C\u00ad\u009eÜÁÌ\u0016ûJê\u009f\u0019Ò\t;8l'¥VäF;uqd´\u0093ê\u0082Ú²\t¡JÐ\u009aÿÏï\u0018\u001eC\r\u0086<à,\"[oJÅyÊi\u0015\u0098P\u0087\u0099¶¥¥\u00adÕ\u000fÄJó\u008dâ½\u00123\u0001p0É_ÊO\u0013~@m\u0098\u009cÉ\u008c\u0014»Gª)Ù¹Èéø$çw\u0016ý\u0005Ó5 $@S\u0081BÅr&aV\u0090\u0093¿×¯\u001cÞ.Í#ü\u0097ëÀ\u001b\u000b\nN9\u0098(ÚX'Grv¢eê\u0095=\u0084x³ß>ÍÑýàëó:\u0082}\u0092¡¥ë´$GbW\u0096f\u0099y\u001c\b_\u0018\u008b+Æ:EÍHÜsì°ÿá\u008eq¡k±¨@ìS-bXr\u009d\u0005\u009b\u009cRsyB2Q\u0095 \u00950L\u0007\u001d\u0016ÄåÁõkÄ<Ûçª¢ºd\u0089&\u0098ëoá~\u0094NJ]U,ß\u0003\u0082\u0013]âEñÀÀ±Ðu§:¶æ\u0085¨\u0095mde{õJÒYÙ)G8\u001e\u000fÁ\u001e\u0085îGý\u0000Ìþ£²³;\u009c@sOB\u001eQÀ \u009c0H\u0007\u0007\u0016Ñå\u0092õ=Ä:Ûôª¿ºc\u0089&\u0098ñoá~\u009fN\\]U,ß\u0003\u0098\u0013Eâ\t\u009cRs\\B\u0015QÁ Ñ0K\u0007\u0000\u0016Éå\u0084õ=Ä<Ûçª£ºb\u0089;\u009cHsQB\u0015QÐ \u00960L\u0007\u0005\u0016\u0085å\u0092õiÄ8Ûáª´º-\u0089,\u0098÷o³~\u0092NK\u009cHssB0Qá ®0n\u00079\u0016öå¾õNÄ\u001dÛÞªëº^\u0089\r\u0098Îo\u0082~\u0092NW]\u0001,Ã\u0003\u0082\u0013Eâ\tñÄÀ¯ÐP§;¶ø\u0085¹\u0095`d${íJÔY\u0083)P8K1\u008bÞ ïëüL\u008dA\u009d\u0087ª\u0090»\u0015HVX\u00adiôv%\u0007i\u0017¸$ù5&ÂqÓJã\u0087ð\u008c\u0081\u0006®[¾\u0087O\u0092\\Vm*\u0089\u00adf\u0096WÜD}5t%ª\u0012å\u00038ðeà\u0090Ñ\u0091Î\u0014¿J¯Å\u009cÈ\u008d\u0003z@ka[¸Hü95\u0016l\u0006»÷ää'ÕRÅÑ²Ó£\u0016\u0090R\u0080Ïq\u0083nGò)\u001d\u0012,X?ùNð^.iax¼\u008bá\u009b\u0014ª\u0015µ\u0090ÄÎÔAçLö\u0087\u0001Ä\u0010å <3xB±mè}?\u008cl\u009f©®\u009f\u009cQs\\B\u0000QØ \u00940C\u0007\u001d\u0016\u0085å\u008cõrÄ=Ûàª½ºh\u0089i\u0098ìo²~ÝNP]\u001b,Ø\u0003\u0099\u0013@â\u0004ñÍÀ´Ðc§<¶ÿ\u0085ª\u0095)d+{îJÊY×)\u001b8_ém\u0006`7<$äU¨E\u007fr!c¹\u0090°\u0080N±\u0001®Üß\u0081ÏTüUíÐ\u001a\u008e\u000bá;l('Yäv¥f|\u00978\u0084ñµ\u0088¥_Ò\fÃÉðßÝð2î\u0003·\u0010ba9qÿF¡Wk¤.´\u009c\u0085\u0095\u009a[ë\u0014ûÙÈ\u0084ÙA.@?5\u000fë\u001cômyB\"Rá£°°i\u0081\u001d\u0091Ôæ\u009d÷JÄ\u0005ÔÆ%\u0083:\u0000\u000br\u00187hãyþN\"_f\u009cQsOB\u0016QÃ \u00980^\u0007\u0000\u0016Êå\u008fõ=Ä4Ûúªµºx\u0089%\u0098àoá~\u0094NJ]U,Ø\u0003\u0083\u0013@â\u0011ñÈÀ¼Ðu§<¶ë\u0085¨\u0095mdk\u009cRsyB2Q\u0095 ¸0c\u0007 \u0016ñåÁõXÄ\u000bÛÇª\u009eº_¡vN]\u007f\u0016l±\u001dõ\r`:>+¡Ø¬ÈWù\u0014æÅ\u0097\u009c\u0087H´\u0001¥ÈR\u009fC¼sy`\u007f\u009cEsTB\u001eQÜ \u00850L\u0007\u0005\u0016Ìå\u009bõxÄ=ÛÖª°º\u007f\u0089-\u0098Ço´~\u0094NW]\u0006,Ô\u0003\u009e\u0013Zâ6ñÄÀ¯Ðo§<¶ò\u0085¨\u009cQs\\B\u0000QØ \u00940C\u0007\u001d\u0016çå\u0094õtÄ7Ûæª´º~\u0089:\u0098Öo¤~\u008fNO]\u001c,Ò\u0003\u0088\u009cQsOB\u0016QÃ \u00980^\u0007\u0000\u0016Êå\u008fõtÄ7Ûòª\u0093ºx\u0089:\u0098ìo¯~\u0098NJ]\u0006,â\u0003\u0088\u0013[â\u0013ñÈÀ¾Ð|\u009cDsSB\u000bQÚ \u009d0A\u0007\u0000\u0016Ëå\u0086õ_Ä,Ûæª¸ºc\u0089,\u0098öo²~®N\\]\u0007,Ç\u0003\u0084\u0013Jâ\u0000\u009cWs\\B\nQå \u00830B\u0007\u001f\u0016Ìå\u0092õtÄ6Ûûª¸ºc\u0089.\u0098Ço´~\u008eNP]\u001b,Ô\u0003\u009e\u0013Zâ6ñÄÀ¯Ðo§<¶ò\u0085¨e¿\u008aµ»ü¨0Ù}É°þÓï)\u001ck\f\u0081=Â\"\u0019S}C\u008apÒa\u0003\u0096D\u0087x·½¤ùÕ6úpê\u0082\u001bù\b;9])\u009e^ÙO\u000b|Wl³\u009dÉ\u0082\u001a³\" yÐ¿Áýáè\u000eÃ?\u0088,L]$Mùz§km\u00984\u0088Ë¹\u008f¦J×\u0019Çäô\u009båJ\u0012\u000f\u0003#3ì ¸Qe~m\u009cBsRB\u0017QÁ \u00940U\u0007\u001d\u0016\u0085å\u008cõhÄ*Ûáªñºc\u0089&\u0098ñoá~\u009fN\\]U,ß\u0003\u0098\u0013Eâ\tHù§×\u0096\u008d\u0085,ô\u0005äýÓ·Ân19!Ð\u0010\u0089\u000fC~\u0006n\u0094]¶L]»\u0011ª(\u009aå\u0089¨ø(×nÇ°6\u0089%v\u0014\u0005\u0004Âs\u0080bMQTAÄ°\u0093¯\u0018\u009ev\u008d%ýíì¬Û4Ê5:ò)ª\u0018Kw\fgÀV\u008dEP´P¤Ï\u0093\u008c\u0082¥ñtà)Ð©[F´h\u00852\u0096\u0093çº÷BÀ\bÑÑ\"\u00862o\u00036\u001cým°}+N\t_â¨®¹\u0097\u0089Z\u009a\u0017ë\u0097ÄÑÔ\u000f%66É\u0007º\u0017}`?qòBëR{£,¼§\u008dÖ\u009e\u0096îTÿ\u0005ÈÊÙ\u009b)F:G\u000bød³tzE2Vå§»·#\u0080#\u0091\u001aâËó\u0092Ã\u0016\u009c@snB4Q\u0095 ¼0D\u0007\u000e\u0016×å\u0080õiÄ0Ûûª¶º-\u0089\u000f\u0098äo¨~\u0091N\\]\u0011,\u0091\u0003×\u0013\tâ&ñÓÀ¤Ði§!¶þ\u0085ª\u0095{d${ñJÕY\u0090)V8Q\u000fÝ\u001e\u009bîJý\u0003Ìñ£¼³x\u0082q\u0091é`¼pwG(V\u0013%Þ4Õ\u0004V\u001b\bêÇù\u0080ÉSØ<¯í¾¼\u008e\u007f\u009d*l©CªSm\"Y1Y\u0000Ó\u0017\u0098çCö\u000eÅÀÔ\u0093¤m»+\u008aü\u0099¿iyxhSê¼Ä\u008d\u009e\u009e?ï\u0016ÿîÈ¤Ù}**:Ã\u000b\u009a\u0014Qe\u001cu\u0087F¥WN \u0002±;\u0081ö\u0092»ã;Ì}Ü£-\u009a>e\u000f\u0016\u001fÑh\u0093y^JGZ×«\u0080´\u000b\u0085d\u00962æé÷¾À'Ñ,!ã2¯\u0003Ql\u0003|\u009fM\u008f^H¯C¿Ü\u0088\u009f\u0099¸êaû>ËüÔ¢%\"k¡\u009c/s\\B\u001cQÆ \u009c0K\u0007\r\u0016Á\u009c/s\\B\nQÐ \u009c0N\u0007\n\u0016ÁÃ©,\u0091\u001dÃ\u000e\u0011\u007f^o\u0080XÄ\u009bHtfE4Vð'º7f\u0000%".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1070);
        getHighResolutionOutputSizeshNQ4ISI = cArr;
        getInputFormats = -5340007474796465347L;
    }
}
