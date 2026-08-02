package com.gemalto.mfs.mwsdk.payment.sdkconfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class SDKInitializer {
    private static char[] Camera2StreamConfigurationMap = null;
    public static final com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer INSTANCE;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static boolean getHighSpeedVideoFpsRangesFor = false;
    private static int getHighSpeedVideoSizes = 1;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static final /* synthetic */ com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer[] getInputFormats;
    private static int getOutputFormats = 1;
    private static int getOutputMinFrameDuration;

    private SDKInitializer(java.lang.String str) {
    }

    public static com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer valueOf(java.lang.String str) {
        int i = getOutputMinFrameDuration + 7;
        getOutputFormats = i % 128;
        com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer sDKInitializer = (com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer) java.lang.Enum.valueOf(com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer.class, str);
        if (i % 2 != 0) {
            return sDKInitializer;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer[] values() {
        getOutputFormats = (getOutputMinFrameDuration + 47) % 128;
        com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer[] sDKInitializerArr = (com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer[]) getInputFormats.clone();
        getOutputFormats = (getOutputMinFrameDuration + 119) % 128;
        return sDKInitializerArr;
    }

    static {
        com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer[] sDKInitializerArr;
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0091\u0089\u008f\u0088\u0090\u0084\u008f\u0083", objArr);
        com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer sDKInitializer = new com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer(((java.lang.String) objArr[0]).intern());
        INSTANCE = sDKInitializer;
        int i = getOutputFormats + 97;
        int i2 = i % 128;
        getOutputMinFrameDuration = i2;
        if (i % 2 != 0) {
            sDKInitializerArr = new com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer[1];
            sDKInitializerArr[1] = sDKInitializer;
        } else {
            sDKInitializerArr = new com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer[]{sDKInitializer};
        }
        int i3 = i2 + 37;
        getOutputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            getInputFormats = sDKInitializerArr;
            int i4 = i2 + 9;
            getOutputFormats = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        throw null;
    }

    public final void configure(android.content.Context context, android.app.Notification notification, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.String intern;
        java.lang.String intern2;
        synchronized (this) {
            int i = getOutputFormats + 29;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(63 >>> (android.view.KeyEvent.getMaxKeyCode() >> 113), "\u0084\u0083\u0082\u0081", objArr);
                intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMinimumFlingVelocity() >>> 56) * 12, "\u0089\u0088\u0084\u0087\u0083\u0086\u0085\u0084", objArr2);
                intern2 = ((java.lang.String) objArr2[0]).intern();
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0084\u0083\u0082\u0081", objArr3);
                intern = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0089\u0088\u0084\u0087\u0083\u0086\u0085\u0084", objArr4);
                intern2 = ((java.lang.String) objArr4[0]).intern();
            }
            util.h.xy.am.ma.m25027(intern, intern2);
            util.h.xy.bu.e.f1052.m25661(context, customConfiguration);
        }
    }

    public final void configure(android.content.Context context, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.String intern;
        java.lang.String intern2;
        synchronized (this) {
            int i = getOutputMinFrameDuration + 119;
            getOutputFormats = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(104 >>> android.view.View.MeasureSpec.getSize(0), "\u0084\u0083\u0082\u0081", objArr);
                intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.view.View.resolveSizeAndState(1, 0, 1) * 40, "\u0089\u0088\u0084\u0087\u0083\u0086\u0085\u0084", objArr2);
                intern2 = ((java.lang.String) objArr2[0]).intern();
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.MeasureSpec.getSize(0), "\u0084\u0083\u0082\u0081", objArr3);
                intern = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.resolveSizeAndState(0, 0, 0), "\u0089\u0088\u0084\u0087\u0083\u0086\u0085\u0084", objArr4);
                intern2 = ((java.lang.String) objArr4[0]).intern();
            }
            util.h.xy.am.ma.m25027(intern, intern2);
            util.h.xy.bu.e.f1052.m25661(context, customConfiguration);
        }
    }

    public final void configure(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            getOutputFormats = (getOutputMinFrameDuration + 71) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionChild(0L) + 128, "\u0089\u0088\u0084\u0087\u0083\u0086\u0085\u0084", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            util.h.xy.bu.e.f1052.m25661(context, null);
            getOutputFormats = (getOutputMinFrameDuration + 115) % 128;
        }
    }

    public final void initialize(android.content.Context context, com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener, android.app.Notification notification) {
        getOutputFormats = (getOutputMinFrameDuration + 47) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u0083\u0087\u0083\u0086\u0085\u0084", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.ag.a.m24556().m24559(context);
        util.h.xy.bu.e.f1052.m25663(context, sDKControllerListener, null);
        getOutputFormats = (getOutputMinFrameDuration + 67) % 128;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i2 + 61) % 128;
        int i3 = i2 + 83;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
        byte[] bArr = bytes;
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
            int i4 = 0;
            while (i4 < length) {
                int i5 = getHighSpeedVideoSizes;
                getHighResolutionOutputSizeshNQ4ISI = (i5 + 31) % 128;
                cArr2[i4] = (char) (cArr[i4] ^ (-3299939579226817547L));
                i4++;
                getHighResolutionOutputSizeshNQ4ISI = (i5 + 15) % 128;
            }
            cArr = cArr2;
        }
        int i6 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoFpsRanges);
        if (!getHighSpeedVideoSizesFor) {
            if (!getHighSpeedVideoFpsRangesFor) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bArr.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bArr[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i6);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public final void initialize(android.content.Context context, com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener) {
        getOutputMinFrameDuration = (getOutputFormats + 53) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u008a\u0083\u0087\u0083\u0086\u0085\u0084", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.bu.e.f1052.m25663(context, sDKControllerListener, null);
        getOutputMinFrameDuration = (getOutputFormats + 7) % 128;
    }

    public final void initialize(android.content.Context context, com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener, android.app.Notification notification, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) {
        getOutputMinFrameDuration = (getOutputFormats + 109) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u008b\u0083\u0087\u0083\u0086\u0085\u0084", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.ag.a.m24556().m24559(context);
        util.h.xy.bu.e.f1052.m25663(context, sDKControllerListener, customConfiguration);
        int i = getOutputFormats + 77;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final void initialize(android.content.Context context, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration, com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener) {
        java.lang.String intern;
        int i;
        int i2 = getOutputFormats + 41;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.Gravity.getAbsoluteGravity(0, 1) + 116, "\u0084\u0083\u0082\u0081", objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            i = 46;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u0084\u0083\u0082\u0081", objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            i = 127;
        }
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(i - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), "\u008b\u0083\u0087\u0083\u0086\u0085\u0084", objArr3);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            util.h.xy.ag.a.m24556().m24559(context);
            util.h.xy.bu.e.f1052.m25663(context, sDKControllerListener, customConfiguration);
            getOutputMinFrameDuration = (getOutputFormats + 91) % 128;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void initialize(android.content.Context context, android.app.Notification notification, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) throws com.gemalto.mfs.mwsdk.exception.SDKInitializationException {
        getOutputFormats = (getOutputMinFrameDuration + 65) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.combineMeasuredStates(0, 0), "\u008c\u0083\u0087\u0083\u0086\u0085\u0084", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.ag.a.m24556().m24559(context);
        util.h.xy.bu.e.f1052.m25662(context, customConfiguration);
        int i = getOutputMinFrameDuration + 7;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final void initialize(android.content.Context context, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) throws com.gemalto.mfs.mwsdk.exception.SDKInitializationException {
        getOutputMinFrameDuration = (getOutputFormats + 75) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.MeasureSpec.getSize(0), "\u008d\u0083\u0087\u0083\u0086\u0085\u0084", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.ag.a.m24556().m24559(context);
        util.h.xy.bu.e.f1052.m25662(context, customConfiguration);
        getOutputFormats = (getOutputMinFrameDuration + 87) % 128;
    }

    public final void initialize(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.SDKInitializationException {
        getOutputMinFrameDuration = (getOutputFormats + 89) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionChild(0L) + 128, "\u008e\u0083\u0087\u0083\u0086\u0085\u0084", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.ag.a.m24556().m24559(context);
        util.h.xy.bu.e.f1052.m25662(context, null);
        int i = getOutputMinFrameDuration + 11;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final com.thalesgroup.gemalto.securelog.SecureLog configureSecureLog(com.thalesgroup.gemalto.securelog.SecureLogConfig secureLogConfig) {
        getOutputFormats = (getOutputMinFrameDuration + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        util.h.xy.bu.e eVar = util.h.xy.bu.e.f1052;
        com.thalesgroup.gemalto.securelog.SecureLog m25660 = util.h.xy.bu.e.m25660(secureLogConfig);
        getOutputMinFrameDuration = (getOutputFormats + 95) % 128;
        return m25660;
    }

    static void Camera2StreamConfigurationMap() {
        Camera2StreamConfigurationMap = new char[]{64370, 64382, 64369, 64379, 64394, 64371, 64412, 64393, 64395, 64388, 64408, 64411, 64410, 64389, 64380, 64378, 64373};
        getHighSpeedVideoFpsRanges = -1074857010;
        getHighSpeedVideoFpsRangesFor = true;
        getHighSpeedVideoSizesFor = true;
    }
}
