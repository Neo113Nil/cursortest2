package util.h.xy.ca;

/* loaded from: classes5.dex */
public class a implements com.gemalto.mfs.mwsdk.provisioning.sdkconfig.WalletSecureEnrollmentBusinessService {
    private static final byte[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static char[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static boolean getInputFormats = false;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputFormats;
    private static long getOutputMinFrameDuration;
    private static char[] getOutputSizes;
    private static final java.lang.String getOutputSizeshNQ4ISI;
    private static boolean getOutputStallDuration;
    private static long getOutputStallDurationlomOqCM;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.ca.a f1087;
    private util.h.xy.ah.a getOutputMinFrameDurationlomOqCM;
    private com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState toString;
    private java.lang.Boolean getValidOutputFormatsForInputhNQ4ISI = java.lang.Boolean.FALSE;
    private byte[] unwrapAs = null;

    private static void getHighSpeedVideoSizes(java.lang.Object[] objArr) {
        int i = getInputSizeshNQ4ISI + 11;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] cArr = new char[1];
        cArr[0] = (char) (Camera2StreamConfigurationMap == null ? -2 : 715);
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputStallDurationlomOqCM ^ (-7508379876853140581L));
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

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizes[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i4 = getHighSpeedVideoFpsRangesFor + 49;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 >> 1;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i5 = getHighSpeedVideoFpsRangesFor + 87;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
        if (getInputFormats) {
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (getOutputStallDuration) {
            throw null;
        }
        throw null;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.ca.a aVar, com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener walletSecureEnrollmentListener) throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        int i = getInputSizeshNQ4ISI + 83;
        getOutputFormats = i % 128;
        aVar.getHighSpeedVideoSizes(walletSecureEnrollmentListener);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = getInputSizeshNQ4ISI + 13;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.ca.a aVar, com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError walletSecureEnrollmentError, com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener walletSecureEnrollmentListener) {
        int i = getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getInputSizeshNQ4ISI = i % 128;
        aVar.getHighSpeedVideoSizes(walletSecureEnrollmentError, walletSecureEnrollmentListener);
        if (i % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState getHighSpeedVideoFpsRanges(util.h.xy.ca.a aVar) {
        int i = getInputSizeshNQ4ISI + 61;
        int i2 = i % 128;
        getOutputFormats = i2;
        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState walletSecureEnrollmentState = aVar.toString;
        if (i % 2 != 0) {
            throw null;
        }
        getInputSizeshNQ4ISI = (i2 + 121) % 128;
        return walletSecureEnrollmentState;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState getHighSpeedVideoSizes(util.h.xy.ca.a aVar) {
        int i = getOutputFormats + 95;
        getInputSizeshNQ4ISI = i % 128;
        aVar.toString = null;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
        int i = getInputSizeshNQ4ISI + 21;
        getOutputFormats = i % 128;
        java.lang.String str = getOutputSizeshNQ4ISI;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRangesFor();
        getOutputSizeshNQ4ISI = util.h.xy.ca.a.class.getName();
        f1087 = null;
        int i = getOutputFormats + 25;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.ca.a m25835(android.content.Context context) {
        util.h.xy.ca.a aVar;
        synchronized (util.h.xy.ca.a.class) {
            int i = getOutputFormats + 31;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (f1087 == null) {
                f1087 = new util.h.xy.ca.a(new util.h.xy.ah.ra());
            }
            aVar = f1087;
            getOutputFormats = (getInputSizeshNQ4ISI + 47) % 128;
        }
        return aVar;
    }

    private a(util.h.xy.ah.a aVar) {
        this.getOutputMinFrameDurationlomOqCM = aVar;
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void initialize() {
        getInputSizeshNQ4ISI = (getOutputFormats + 47) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.KeyEvent.normalizeMetaState(0), (char) (12450 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
        int rgb = android.graphics.Color.rgb(0, 0, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(8 - trimmedLength, (-16777212) - rgb, (char) (33739 - android.text.TextUtils.indexOf("", "", 0)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        getOutputFormats = (getInputSizeshNQ4ISI + 51) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void reset() {
        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(4 - capsMode, (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 12449), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(7 - indexOf, 12 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (56615 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        this.toString = null;
        this.getValidOutputFormatsForInputhNQ4ISI = java.lang.Boolean.FALSE;
        this.unwrapAs = null;
        if (f1087 != null || this.getOutputMinFrameDurationlomOqCM == null) {
            return;
        }
        int i = getOutputFormats + 13;
        int i2 = i % 128;
        getInputSizeshNQ4ISI = i2;
        if (i % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM = null;
            getOutputFormats = (i2 + 51) % 128;
        } else {
            this.getOutputMinFrameDurationlomOqCM = null;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.WalletSecureEnrollmentBusinessService
    public boolean startWalletSecureEnrollment(com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener walletSecureEnrollmentListener) {
        getOutputFormats = (getInputSizeshNQ4ISI + 3) % 128;
        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((edgeSlop >> 16) + 4, android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12448), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(11 - lastIndexOf, android.graphics.Color.blue(0) + 20, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(walletSecureEnrollmentListener);
        getOutputFormats = (getInputSizeshNQ4ISI + 7) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.WalletSecureEnrollmentBusinessService
    public void startWalletSecureEnrollment() throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        int i = getOutputFormats;
        getInputSizeshNQ4ISI = (i + 33) % 128;
        getInputSizeshNQ4ISI = (i + 67) % 128;
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((intValue >> 22) + 4, android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (12449 - android.view.View.MeasureSpec.getSize(0)), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(10 - lastIndexOf, 32 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            synchronized (this) {
                int i2 = getOutputFormats + 65;
                getInputSizeshNQ4ISI = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        getHighSpeedVideoSizesFor();
                        throw new java.lang.ArithmeticException();
                    }
                    if (getHighSpeedVideoSizesFor()) {
                        getHighSpeedVideoSizes((com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener) null);
                        return;
                    }
                    int i3 = getOutputFormats + 29;
                    getInputSizeshNQ4ISI = i3 % 128;
                    if (i3 % 2 != 0) {
                        return;
                    } else {
                        throw new java.lang.NullPointerException();
                    }
                } catch (com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException e) {
                    this.toString = null;
                    throw e;
                } catch (java.lang.Exception e2) {
                    this.toString = null;
                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_STORAGE_ACCESS_ERROR;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    int alpha = android.graphics.Color.alpha(0);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(alpha + 20, 163 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
                    sb.append(((java.lang.String) objArr3[0]).intern());
                    sb.append(e2.getMessage());
                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes, 0, 0, sb.toString(), null);
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.WalletSecureEnrollmentBusinessService
    public com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState getState() {
        int rgb;
        int deadChar;
        int i;
        int i2 = getInputSizeshNQ4ISI + 91;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            rgb = 16777220 - android.graphics.Color.rgb(1, 1, 0);
            deadChar = android.view.KeyEvent.getDeadChar(1, 1);
            i = 14365;
        } else {
            rgb = 16777220 + android.graphics.Color.rgb(0, 0, 0);
            deadChar = android.view.KeyEvent.getDeadChar(0, 0);
            i = 12449;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(rgb, deadChar, (char) (i - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(normalizeMetaState + 9, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState outputFormats = getOutputFormats();
            int i3 = getInputSizeshNQ4ISI + 45;
            getOutputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                return outputFormats;
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState getOutputFormats() {
        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState walletSecureEnrollmentState;
        java.io.File file;
        boolean z;
        java.io.File file2;
        this.getValidOutputFormatsForInputhNQ4ISI = java.lang.Boolean.FALSE;
        if (this.toString == com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_STARTED) {
            return this.toString;
        }
        try {
            java.io.File filesDir = util.h.xy.ag.a.m24556().m24558().getFilesDir();
            z = false;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionChild(0L) + 9, 130 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr);
            file = new java.io.File(filesDir, ((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(9 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 138 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr2);
            file2 = new java.io.File(filesDir, ((java.lang.String) objArr2[0]).intern());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        if (file.exists()) {
            int i = getOutputFormats + 71;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                file2.exists();
                throw new java.lang.ArithmeticException();
            }
            if (file2.exists()) {
                getOutputFormats = (getInputSizeshNQ4ISI + 125) % 128;
                int m27592 = util.h.xy.v.b.f2439.m27592(util.h.xy.ag.a.m24556().m24558(), new byte[]{0});
                getOutputFormats = (getInputSizeshNQ4ISI + 91) % 128;
                if (m27592 != 0) {
                    android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, android.text.TextUtils.indexOf("", "", 0) + 146, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr3);
                    util.h.xy.av.ra.m25235(m24558, ((java.lang.String) objArr3[0]).intern());
                    this.toString = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_REQUIRED;
                } else {
                    try {
                        byte[] m27427 = util.h.xy.t.mb.f2417.m27427();
                        byte[] m27455 = util.h.xy.t.mb.f2417.m27455();
                        if (m27427 != null) {
                            int i2 = getInputSizeshNQ4ISI;
                            getOutputFormats = (i2 + 79) % 128;
                            if (m27427.length > 0 && m27455 != null) {
                                getOutputFormats = (i2 + 105) % 128;
                                if (m27455.length > 0) {
                                    if (!util.h.xy.av.ra.m25233(util.h.xy.ag.a.m24556().m24558())) {
                                        int i3 = getOutputFormats + 113;
                                        getInputSizeshNQ4ISI = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            z = true;
                                        }
                                    }
                                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
                                    this.getValidOutputFormatsForInputhNQ4ISI = valueOf;
                                    if (valueOf.booleanValue()) {
                                        this.toString = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_REQUIRED;
                                        getInputSizeshNQ4ISI = (getOutputFormats + 93) % 128;
                                    } else if (this.toString != com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_COMPLETED) {
                                        this.toString = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_NOT_REQUIRED;
                                    }
                                }
                            }
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                    }
                    getInputSizeshNQ4ISI = (getOutputFormats + 35) % 128;
                    this.toString = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_REQUIRED;
                }
                walletSecureEnrollmentState = this.toString;
                if (walletSecureEnrollmentState != null) {
                    int i4 = getOutputFormats;
                    int i5 = i4 + 105;
                    getInputSizeshNQ4ISI = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    int i6 = i4 + 69;
                    getInputSizeshNQ4ISI = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 / 3;
                    }
                }
                return walletSecureEnrollmentState;
            }
        }
        android.content.Context m245582 = util.h.xy.ag.a.m24556().m24558();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(15 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 147 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr4);
        util.h.xy.av.ra.m25235(m245582, ((java.lang.String) objArr4[0]).intern());
        this.toString = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_REQUIRED;
        walletSecureEnrollmentState = this.toString;
        if (walletSecureEnrollmentState != null) {
        }
        return walletSecureEnrollmentState;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(final com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener walletSecureEnrollmentListener) {
        synchronized (this) {
            try {
                try {
                    if (!getHighSpeedVideoSizesFor()) {
                        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.a.4
                            private static int Camera2StreamConfigurationMap = 0;
                            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                            private static int getHighSpeedVideoSizes = 1;
                            private static int getInputSizeshNQ4ISI;
                            private static char[] getOutputMinFrameDuration = {42364, 42267, 42257, 42259, 42367, 42270, 42263, 42269, 42269, 42248, 42248, 42257, 42270, 42346, 42339, 42258, 42255, 42251, 42248};

                            private static void getHighSpeedVideoSizes(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
                                byte[] bytes = str.getBytes("ISO-8859-1");
                                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                                int i = iArr[0];
                                int i2 = iArr[1];
                                int i3 = iArr[2];
                                int i4 = iArr[3];
                                char[] cArr = getOutputMinFrameDuration;
                                if (cArr != null) {
                                    int length = cArr.length;
                                    char[] cArr2 = new char[length];
                                    for (int i5 = 0; i5 < length; i5++) {
                                        cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
                                    }
                                    cArr = cArr2;
                                }
                                char[] cArr3 = new char[i2];
                                java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
                                if (bytes != null) {
                                    char[] cArr4 = new char[i2];
                                    maVar.f2631 = 0;
                                    char c = 0;
                                    while (maVar.f2631 < i2) {
                                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 97) % 128;
                                        if (bytes[maVar.f2631] == 1) {
                                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                                        } else {
                                            cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                                        }
                                        c = cArr4[maVar.f2631];
                                        maVar.f2631++;
                                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 35) % 128;
                                    }
                                    cArr3 = cArr4;
                                }
                                if (i4 > 0) {
                                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 41) % 128;
                                    char[] cArr5 = new char[i2];
                                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
                                    int i6 = i2 - i4;
                                    java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
                                    java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
                                }
                                if (z) {
                                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 81) % 128;
                                    char[] cArr6 = new char[i2];
                                    maVar.f2631 = 0;
                                    while (maVar.f2631 < i2) {
                                        cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                                        maVar.f2631++;
                                    }
                                    cArr3 = cArr6;
                                }
                                if (i3 > 0) {
                                    int i7 = Camera2StreamConfigurationMap + 31;
                                    getHighSpeedVideoSizes = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        maVar.f2631 = 1;
                                    } else {
                                        maVar.f2631 = 0;
                                    }
                                    while (maVar.f2631 < i2) {
                                        cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                                        maVar.f2631++;
                                    }
                                }
                                objArr[0] = new java.lang.String(cArr3);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = getInputSizeshNQ4ISI + 19;
                                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                                if (i % 2 != 0) {
                                    util.h.xy.ca.a.getHighSpeedVideoSizes();
                                    if (walletSecureEnrollmentListener != null) {
                                        java.lang.Object[] objArr = new java.lang.Object[1];
                                        getHighSpeedVideoSizes(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr);
                                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes(false, new int[]{4, 15, 0, 13}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000", objArr2);
                                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                                        walletSecureEnrollmentListener.onProgressUpdate(util.h.xy.ca.a.getHighSpeedVideoFpsRanges(util.h.xy.ca.a.this));
                                    }
                                    int i2 = getInputSizeshNQ4ISI + 69;
                                    getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                util.h.xy.ca.a.getHighSpeedVideoSizes();
                                throw new java.lang.ArithmeticException();
                            }
                        });
                        getOutputFormats = (getInputSizeshNQ4ISI + 65) % 128;
                        return false;
                    }
                    new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.a.5
                        private static int Camera2StreamConfigurationMap = 0;
                        private static int getHighSpeedVideoFpsRanges = 1;
                        private static int getHighSpeedVideoFpsRangesFor = 0;
                        private static char getHighSpeedVideoSizesFor = 52369;
                        private static int getInputFormats = 294925130;
                        private static int getInputSizeshNQ4ISI = 1;
                        private static long getOutputFormats = 2457411417541981002L;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = getInputSizeshNQ4ISI + 97;
                            Camera2StreamConfigurationMap = i % 128;
                            int i2 = 2;
                            try {
                                if (i % 2 == 0) {
                                    util.h.xy.ca.a.Camera2StreamConfigurationMap(util.h.xy.ca.a.this, walletSecureEnrollmentListener);
                                } else {
                                    util.h.xy.ca.a.Camera2StreamConfigurationMap(util.h.xy.ca.a.this, walletSecureEnrollmentListener);
                                    throw null;
                                }
                            } catch (com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException e) {
                                util.h.xy.ca.a.getHighSpeedVideoSizes(util.h.xy.ca.a.this);
                                util.h.xy.ca.a.Camera2StreamConfigurationMap(util.h.xy.ca.a.this, new com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError(e.getSdkErrorCode(), e.getHttpStatusCode(), e.getCpsErrorCode(), e.getErrorMessage(), e.getStatusAdditionalInfo()), walletSecureEnrollmentListener);
                            } catch (java.lang.Exception e2) {
                                util.h.xy.ca.a.getHighSpeedVideoSizes(util.h.xy.ca.a.this);
                                com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_STORAGE_ACCESS_ERROR;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                char tapTimeout = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                                int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                                char[] charArray = "\u0000\u0000\u0000\u0000".toCharArray();
                                char[] charArray2 = "곴跓ﲠ台".toCharArray();
                                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 55) % 128;
                                char[] charArray3 = "焪싊苌倔\ue5ac溨\ud886䤯㈞蝾˯㰙Vᗮᜯj歼癏ʧ쾾".toCharArray();
                                util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                                int length = charArray2.length;
                                char[] cArr = new char[length];
                                int length2 = charArray.length;
                                char[] cArr2 = new char[length2];
                                java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
                                java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
                                cArr[0] = (char) (tapTimeout ^ cArr[0]);
                                cArr2[2] = (char) (cArr2[2] + ((char) deadChar));
                                int length3 = charArray3.length;
                                char[] cArr3 = new char[length3];
                                rcVar.f2652 = 0;
                                while (rcVar.f2652 < length3) {
                                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 43) % 128;
                                    int i3 = (rcVar.f2652 + i2) % 4;
                                    int i4 = (rcVar.f2652 + 3) % 4;
                                    rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
                                    cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
                                    cArr[i4] = rcVar.f2653;
                                    cArr3[rcVar.f2652] = (char) ((((int) (getInputFormats ^ 2457411417541981002L)) ^ ((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getOutputFormats ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizesFor ^ 2457411417541981002L)));
                                    rcVar.f2652++;
                                    sb = sb;
                                    i2 = 2;
                                }
                                java.lang.StringBuilder sb2 = sb;
                                sb2.append(new java.lang.String(cArr3).intern());
                                sb2.append(e2.getMessage());
                                util.h.xy.ca.a.Camera2StreamConfigurationMap(util.h.xy.ca.a.this, new com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError(walletSecureEnrollmentErrorCodes, 0, 0, sb2.toString(), null), walletSecureEnrollmentListener);
                            }
                        }
                    }).start();
                    int i = getInputSizeshNQ4ISI + 13;
                    getOutputFormats = i % 128;
                    if (i % 2 == 0) {
                        return true;
                    }
                    throw null;
                } catch (com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException e) {
                    this.toString = null;
                    getHighSpeedVideoSizes(new com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError(e.getSdkErrorCode(), e.getHttpStatusCode(), e.getCpsErrorCode(), e.getErrorMessage(), e.getStatusAdditionalInfo()), walletSecureEnrollmentListener);
                    return false;
                } catch (java.lang.Exception e2) {
                    this.toString = null;
                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_STORAGE_ACCESS_ERROR;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                    int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(20 - normalizeMetaState, keyCodeFromString + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(e2.getMessage());
                    getHighSpeedVideoSizes(new com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError(walletSecureEnrollmentErrorCodes, 0, 0, sb.toString(), null), walletSecureEnrollmentListener);
                    return false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener walletSecureEnrollmentListener) throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        synchronized (this) {
            try {
                try {
                    if (this.toString != com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_COMPLETED && this.toString != com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_NOT_REQUIRED) {
                        this.toString = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_STARTED;
                        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.a.2
                            private static char[] Camera2StreamConfigurationMap = {42364, 42267, 42257, 42259, 42283, 42416, 42422, 42421, 42378, 42377, 42429, 42424, 42419, 42419, 42372, 42372, 42430, 42369, 42424, 42419};
                            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                            private static int getHighSpeedVideoFpsRangesFor = 1;
                            private static int getInputFormats = 0;
                            private static int getOutputFormats = 1;

                            private static void getHighSpeedVideoFpsRangesFor(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
                                char[] cArr;
                                int length;
                                char[] cArr2;
                                byte[] bytes = str.getBytes("ISO-8859-1");
                                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                                int i = iArr[0];
                                int i2 = iArr[1];
                                int i3 = iArr[2];
                                int i4 = iArr[3];
                                char[] cArr3 = Camera2StreamConfigurationMap;
                                if (cArr3 != null) {
                                    int i5 = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        length = cArr3.length;
                                        cArr2 = new char[length];
                                    } else {
                                        length = cArr3.length;
                                        cArr2 = new char[length];
                                    }
                                    for (int i6 = 0; i6 < length; i6++) {
                                        cArr2[i6] = (char) (cArr3[i6] ^ (-8125198844289309347L));
                                    }
                                    cArr3 = cArr2;
                                }
                                char[] cArr4 = new char[i2];
                                java.lang.System.arraycopy(cArr3, i, cArr4, 0, i2);
                                if (bytes != null) {
                                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
                                    char[] cArr5 = new char[i2];
                                    maVar.f2631 = 0;
                                    char c = 0;
                                    while (maVar.f2631 < i2) {
                                        if (bytes[maVar.f2631] == 1) {
                                            int i7 = getHighResolutionOutputSizeshNQ4ISI + 87;
                                            getHighSpeedVideoFpsRangesFor = i7 % 128;
                                            if (i7 % 2 == 0) {
                                                cArr5[maVar.f2631] = (char) ((cArr4[maVar.f2631] << 2) % c);
                                            } else {
                                                cArr5[maVar.f2631] = (char) (((cArr4[maVar.f2631] * 2) + 1) - c);
                                            }
                                        } else {
                                            cArr5[maVar.f2631] = (char) ((cArr4[maVar.f2631] * 2) - c);
                                        }
                                        c = cArr5[maVar.f2631];
                                        maVar.f2631++;
                                    }
                                    cArr4 = cArr5;
                                }
                                if (i4 > 0) {
                                    char[] cArr6 = new char[i2];
                                    java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i2);
                                    int i8 = i2 - i4;
                                    java.lang.System.arraycopy(cArr6, 0, cArr4, i8, i4);
                                    java.lang.System.arraycopy(cArr6, i4, cArr4, 0, i8);
                                }
                                if (z) {
                                    int i9 = getHighResolutionOutputSizeshNQ4ISI + 61;
                                    getHighSpeedVideoFpsRangesFor = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        cArr = new char[i2];
                                        maVar.f2631 = 1;
                                    } else {
                                        cArr = new char[i2];
                                        maVar.f2631 = 0;
                                    }
                                    while (maVar.f2631 < i2) {
                                        cArr[maVar.f2631] = cArr4[(i2 - maVar.f2631) - 1];
                                        maVar.f2631++;
                                    }
                                    cArr4 = cArr;
                                }
                                if (i3 > 0) {
                                    maVar.f2631 = 0;
                                    while (maVar.f2631 < i2) {
                                        cArr4[maVar.f2631] = (char) (cArr4[maVar.f2631] - iArr[2]);
                                        maVar.f2631++;
                                    }
                                }
                                objArr[0] = new java.lang.String(cArr4);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.String intern;
                                java.lang.Object obj;
                                int i = getInputFormats + 81;
                                getOutputFormats = i % 128;
                                if (i % 2 != 0) {
                                    util.h.xy.ca.a.getHighSpeedVideoSizes();
                                    if (walletSecureEnrollmentListener != null) {
                                        int i2 = getInputFormats + 7;
                                        getOutputFormats = i2 % 128;
                                        if (i2 % 2 == 0) {
                                            java.lang.Object[] objArr = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr);
                                            intern = ((java.lang.String) objArr[0]).intern();
                                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(false, new int[]{4, 16, 153, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000", objArr2);
                                            obj = objArr2[0];
                                        } else {
                                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr3);
                                            intern = ((java.lang.String) objArr3[0]).intern();
                                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(true, new int[]{4, 16, 153, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000", objArr4);
                                            obj = objArr4[0];
                                        }
                                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
                                        walletSecureEnrollmentListener.onProgressUpdate(util.h.xy.ca.a.getHighSpeedVideoFpsRanges(util.h.xy.ca.a.this));
                                        return;
                                    }
                                    return;
                                }
                                util.h.xy.ca.a.getHighSpeedVideoSizes();
                                throw new java.lang.ArithmeticException();
                            }
                        });
                        byte[] m25476 = util.h.xy.bh.mb.m25476();
                        java.lang.String inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
                        if (this.getValidOutputFormatsForInputhNQ4ISI.booleanValue()) {
                            getHighResolutionOutputSizeshNQ4ISI(m25476, walletSecureEnrollmentListener);
                        } else {
                            java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(m25476, inputSizeshNQ4ISI);
                            getHighSpeedVideoSizes(util.h.xy.ag.a.m24556().m24558(), getHighSpeedVideoFpsRangesFor(m25476, highResolutionOutputSizeshNQ4ISI), m25476, highResolutionOutputSizeshNQ4ISI);
                            getHighResolutionOutputSizeshNQ4ISI(m25476, walletSecureEnrollmentListener);
                            int i = getOutputFormats + 75;
                            getInputSizeshNQ4ISI = i % 128;
                            int i2 = i % 2;
                        }
                        this.toString = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_COMPLETED;
                        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
                        int alpha = android.graphics.Color.alpha(0);
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(16 - alpha, android.view.KeyEvent.normalizeMetaState(0) + 146, (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + 15, (-16777034) - android.graphics.Color.rgb(0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr2);
                        util.h.xy.av.ra.m25239(m24558, intern, ((java.lang.String) objArr2[0]).intern());
                        this.getValidOutputFormatsForInputhNQ4ISI = java.lang.Boolean.FALSE;
                    }
                    util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.a.3
                        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                        private static int getHighSpeedVideoFpsRanges = 0;
                        private static int getHighSpeedVideoFpsRangesFor = 1;
                        private static char[] getInputFormats = {42361, 42267, 42266, 42259, 42056, 42052, 42056, 42413, 42056, 42073, 42074, 42056, 42052, 42072, 42058, 42063, 42060, 42413, 42070, 42074};
                        private static int getInputSizeshNQ4ISI;

                        private static void Camera2StreamConfigurationMap(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr3) {
                            int i3;
                            int i4;
                            int i5;
                            java.lang.String str2 = str;
                            int i6 = getHighSpeedVideoFpsRanges + 45;
                            int i7 = i6 % 128;
                            getHighSpeedVideoFpsRangesFor = i7;
                            byte[] bArr = str2;
                            if (i6 % 2 == 0) {
                                throw null;
                            }
                            if (str2 != null) {
                                getHighSpeedVideoFpsRanges = (i7 + 45) % 128;
                                bArr = str2.getBytes("ISO-8859-1");
                            }
                            byte[] bArr2 = bArr;
                            util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                            int i8 = iArr[0];
                            int i9 = iArr[1];
                            int i10 = iArr[2];
                            int i11 = iArr[3];
                            char[] cArr = getInputFormats;
                            if (cArr != null) {
                                int length = cArr.length;
                                char[] cArr2 = new char[length];
                                int i12 = 0;
                                while (i12 < length) {
                                    int i13 = getHighSpeedVideoFpsRangesFor + 47;
                                    getHighSpeedVideoFpsRanges = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        i5 = i11;
                                        cArr2[i12] = (char) (cArr[i12] | (-8125198844289309347L));
                                        i12 %= 1;
                                    } else {
                                        i5 = i11;
                                        cArr2[i12] = (char) (cArr[i12] ^ (-8125198844289309347L));
                                        i12++;
                                    }
                                    i11 = i5;
                                }
                                i3 = i11;
                                cArr = cArr2;
                            } else {
                                i3 = i11;
                            }
                            char[] cArr3 = new char[i9];
                            java.lang.System.arraycopy(cArr, i8, cArr3, 0, i9);
                            if (bArr2 != null) {
                                char[] cArr4 = new char[i9];
                                maVar.f2631 = 0;
                                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 13) % 128;
                                char c = 0;
                                while (maVar.f2631 < i9) {
                                    if (bArr2[maVar.f2631] == 1) {
                                        cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                                        int i14 = getHighSpeedVideoFpsRangesFor + 91;
                                        getHighSpeedVideoFpsRanges = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            int i15 = 2 / 3;
                                        }
                                    } else {
                                        cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                                    }
                                    c = cArr4[maVar.f2631];
                                    maVar.f2631++;
                                }
                                cArr3 = cArr4;
                            }
                            if (i3 > 0) {
                                char[] cArr5 = new char[i9];
                                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i9);
                                int i16 = i9 - i3;
                                int i17 = i3;
                                java.lang.System.arraycopy(cArr5, 0, cArr3, i16, i17);
                                java.lang.System.arraycopy(cArr5, i17, cArr3, 0, i16);
                            }
                            if (z) {
                                char[] cArr6 = new char[i9];
                                maVar.f2631 = 0;
                                while (maVar.f2631 < i9) {
                                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 107) % 128;
                                    cArr6[maVar.f2631] = cArr3[(i9 - maVar.f2631) - 1];
                                    maVar.f2631++;
                                }
                                cArr3 = cArr6;
                            }
                            if (i10 > 0) {
                                int i18 = getHighSpeedVideoFpsRangesFor + 37;
                                getHighSpeedVideoFpsRanges = i18 % 128;
                                if (i18 % 2 != 0) {
                                    maVar.f2631 = 1;
                                } else {
                                    maVar.f2631 = 0;
                                }
                                while (maVar.f2631 < i9) {
                                    int i19 = getHighSpeedVideoFpsRanges + 25;
                                    getHighSpeedVideoFpsRangesFor = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] % iArr[4]);
                                        i4 = maVar.f2631 >> 1;
                                    } else {
                                        cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                                        i4 = maVar.f2631 + 1;
                                    }
                                    maVar.f2631 = i4;
                                }
                            }
                            objArr3[0] = new java.lang.String(cArr3);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String intern2;
                            java.lang.Object obj;
                            int i3 = getInputSizeshNQ4ISI + 43;
                            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                            if (i3 % 2 != 0) {
                                util.h.xy.ca.a.getHighSpeedVideoSizes();
                                if (walletSecureEnrollmentListener != null) {
                                    int i4 = getInputSizeshNQ4ISI + 11;
                                    getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(false, new int[]{0, 4, 0, 2}, "\u0001\u0000\u0001\u0000", objArr3);
                                        intern2 = ((java.lang.String) objArr3[0]).intern();
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(true, new int[]{4, 16, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, 9}, null, objArr4);
                                        obj = objArr4[0];
                                    } else {
                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(false, new int[]{0, 4, 0, 2}, "\u0001\u0000\u0001\u0000", objArr5);
                                        intern2 = ((java.lang.String) objArr5[0]).intern();
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(true, new int[]{4, 16, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, 9}, null, objArr6);
                                        obj = objArr6[0];
                                    }
                                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) obj).intern());
                                    walletSecureEnrollmentListener.onProgressUpdate(util.h.xy.ca.a.getHighSpeedVideoFpsRanges(util.h.xy.ca.a.this));
                                    return;
                                }
                                return;
                            }
                            util.h.xy.ca.a.getHighSpeedVideoSizes();
                            throw null;
                        }
                    });
                    getOutputFormats = (getInputSizeshNQ4ISI + 117) % 128;
                } catch (com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException e) {
                    this.toString = null;
                    throw e;
                }
            } catch (java.lang.Exception e2) {
                this.toString = null;
                com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_STORAGE_ACCESS_ERROR;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(capsMode + 20, 161 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
                sb.append(e2.getMessage());
                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes, 0, 0, sb.toString(), null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighSpeedVideoSizesFor() throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        java.lang.Throwable cause;
        byte[] bArr;
        byte[] bArr2;
        int i;
        int i2;
        byte[] m27594;
        int m24553;
        int i3;
        int i4;
        int i5;
        byte b;
        byte b2;
        java.lang.Object obj;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("裼庌␖ஆ텔뢂踑喨㬻ʷ\ue831뾫蔫沇㉿ᧆ\uef45뛈鱂插䥘რ\ue66a췿鍱竸", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 54907, objArr2);
        java.lang.String str = (java.lang.String) objArr2[0];
        if (!util.h.xy.v.c.m27646().m27647()) {
            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_CPS_COMPONENT_NOT_INITIALIZED;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(19 - android.graphics.Color.alpha(0), 198 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18523), objArr3);
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes, 0, -1, ((java.lang.String) objArr3[0]).intern(), null);
        }
        if (!util.h.xy.au.mf.m25169().m25181()) {
            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_MG_COMPONENT_NOT_INITIALIZED;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 29, 217 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 57733), objArr4);
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes2, 0, -1, ((java.lang.String) objArr4[0]).intern(), null);
        }
        getState();
        if (this.toString != com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_REQUIRED && this.toString != com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_STARTED) {
            return false;
        }
        byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
        byte[] bArr3 = new byte[131];
        try {
            ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr3);
            bArr = new byte[128];
            bArr2 = new byte[3];
            util.h.xy.a.ra raVar = new util.h.xy.a.ra();
            raVar.m24514(util.h.xy.ca.a.class);
            raVar.m24514(util.h.xy.bc.b.class);
            raVar.m24514(util.h.xy.aw.ma.class);
            raVar.m24514(util.h.xy.az.b.class);
            raVar.m24514(util.h.xy.az.ra.class);
            raVar.m24514(util.h.xy.au.mf.class);
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f122).getMethod(util.h.xy.al.b.f120, javax.net.ssl.HostnameVerifier.class));
            } catch (java.lang.Exception unused) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f122).getMethod(util.h.xy.al.b.f152, javax.net.ssl.SSLSocketFactory.class));
            } catch (java.lang.Exception unused2) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f155, java.lang.String.class, java.lang.Object.class));
            } catch (java.lang.Exception unused3) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f157, java.lang.String.class));
            } catch (java.lang.Exception unused4) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f156, java.lang.String.class));
            } catch (java.lang.Exception unused5) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f159, java.lang.String.class));
            } catch (java.lang.Exception unused6) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f169, java.lang.String.class));
            } catch (java.lang.Exception unused7) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f160, java.lang.String.class));
            } catch (java.lang.Exception unused8) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f164, java.lang.String.class));
            } catch (java.lang.Exception unused9) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f161, java.lang.String.class));
            } catch (java.lang.Exception unused10) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f179, java.lang.String.class));
            } catch (java.lang.Exception unused11) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f187, new java.lang.Class[0]));
            } catch (java.lang.Exception unused12) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f150).getMethod(util.h.xy.al.b.f189, java.lang.Object.class));
            } catch (java.lang.Exception unused13) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f117).getMethod(util.h.xy.al.b.f132, java.lang.String.class, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused14) {
            }
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("裷ʣ鱄៵ꆕ㬸뛐䃅\uda21嗖\uef36礻\uf4b7蹫᠙鎤", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35418, objArr5);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr5[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
            } catch (java.lang.Exception unused15) {
            }
            try {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    raVar.m24514(android.content.pm.SigningInfo.class.getMethod(util.h.xy.al.b.f127, new java.lang.Class[0]));
                }
            } catch (java.lang.Exception unused16) {
            }
            try {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    raVar.m24514(android.content.pm.SigningInfo.class.getMethod(util.h.xy.al.b.f142, new java.lang.Class[0]));
                }
            } catch (java.lang.Exception unused17) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f121, javax.net.ssl.KeyManager[].class, javax.net.ssl.TrustManager[].class, java.lang.Class.forName(str)));
            } catch (java.lang.Exception unused18) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused19) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused20) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused21) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Object.class));
            } catch (java.lang.Exception unused22) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Integer.TYPE, java.lang.Object.class));
            } catch (java.lang.Exception unused23) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.util.Collection.class));
            } catch (java.lang.Exception unused24) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.lang.Integer.TYPE, java.util.Collection.class));
            } catch (java.lang.Exception unused25) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
            } catch (java.lang.Exception unused26) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f151, new java.lang.Class[0]));
            } catch (java.lang.Exception unused27) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f148, java.lang.Object.class));
            } catch (java.lang.Exception unused28) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f167, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused29) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f149, java.lang.Object.class));
            } catch (java.lang.Exception unused30) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
            } catch (java.lang.Exception unused31) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f162, new java.lang.Class[0]));
            } catch (java.lang.Exception unused32) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, new java.lang.Class[0]));
            } catch (java.lang.Exception unused33) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused34) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused35) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
            } catch (java.lang.Exception unused36) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f178, java.util.Collection.class));
            } catch (java.lang.Exception unused37) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f177, java.lang.Integer.TYPE, java.lang.Object.class));
            } catch (java.lang.Exception unused38) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
            } catch (java.lang.Exception unused39) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, new java.lang.Class[0]));
                getInputSizeshNQ4ISI = (getOutputFormats + 71) % 128;
            } catch (java.lang.Exception unused40) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, java.lang.Object[].class));
                getOutputFormats = (getInputSizeshNQ4ISI + 45) % 128;
            } catch (java.lang.Exception unused41) {
            }
            try {
                java.lang.String str2 = util.h.xy.al.b.f105;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("裍쇙\u1afa叾곬\ue5f8㺪矰샫᧮勽ꯅ\ue4db㷅盅쾕ᣅ净\uaad2\ue3db㲄痱컡ߣ僧ꦞ\ue2bd㮵璶춨ڪ徢ꢕ\ue194㪄玚쳁", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 18692, objArr6);
                raVar.m24514(util.h.xy.df.a.class.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0]), java.lang.String.class));
            } catch (java.lang.Exception unused42) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused43) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused44) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused45) {
            }
            try {
                java.lang.String str3 = util.h.xy.al.b.f121;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("裼붒\ue22a⣘崬舜좭ﴶ⏋桩鴍쎵ࡓ㺙捛ꠘ\udebfͰ䧸纆ꌀ\ue9ba", 13669 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr7);
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr7[0])));
            } catch (java.lang.Exception unused46) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f93, new java.lang.Class[0]));
            } catch (java.lang.Exception unused47) {
            }
            try {
                raVar.m24514(android.provider.Settings.Secure.class.getMethod(util.h.xy.al.b.f106, android.content.ContentResolver.class, java.lang.String.class));
            } catch (java.lang.Exception unused48) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f133, byte[].class));
            } catch (java.lang.Exception unused49) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused50) {
            }
            try {
                raVar.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
            } catch (java.lang.Exception unused51) {
            }
            try {
                m27594 = util.h.xy.v.b.f2439.m27594(bArr3, util.h.xy.a.ma.m24504(raVar));
                m24553 = util.h.xy.af.mb.m24551().m24553(m27594[0]);
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused52) {
                i2 = 0;
            } catch (java.io.UnsupportedEncodingException unused53) {
                i = 0;
            }
        } catch (java.lang.Throwable th) {
            cause = th.getCause();
            if (cause == null) {
            }
        }
        try {
            if (m24553 != -91) {
                if (m24553 == 111) {
                    int i6 = getOutputFormats + 11;
                    getInputSizeshNQ4ISI = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    try {
                        int nextInt = ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt();
                        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
                        int i7 = getInputSizeshNQ4ISI + 47;
                        getOutputFormats = i7 % 128;
                        try {
                            if (i7 % 2 != 0) {
                                objArr = new java.lang.Object[5];
                                objArr[1] = java.lang.Integer.valueOf(nextInt);
                                objArr[1] = m24558;
                                obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                if (obj != null) {
                                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue() != nextInt) {
                                        i3 = -91;
                                        m24553 = com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
                                    }
                                }
                                java.lang.Class cls = (java.lang.Class) util.h.xy.dd.b.m26271(123 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 47455), 20 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(objArr8);
                                java.lang.String str4 = (java.lang.String) objArr8[0];
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(128 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr9);
                                obj = cls.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr9[0]), java.lang.Integer.TYPE);
                                util.h.xy.dd.b.f1176.put(-1119310920, obj);
                                objArr = objArr;
                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue() != nextInt) {
                                }
                            } else {
                                java.lang.Object[] objArr10 = {m24558, java.lang.Integer.valueOf(nextInt)};
                                obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                objArr = objArr10;
                                if (obj != null) {
                                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue() != nextInt) {
                                    }
                                }
                                java.lang.Class cls2 = (java.lang.Class) util.h.xy.dd.b.m26271(123 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 47455), 20 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(objArr82);
                                java.lang.String str42 = (java.lang.String) objArr82[0];
                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(128 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr92);
                                obj = cls2.getMethod(str42, java.lang.Class.forName((java.lang.String) objArr92[0]), java.lang.Integer.TYPE);
                                util.h.xy.dd.b.f1176.put(-1119310920, obj);
                                objArr = objArr;
                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue() != nextInt) {
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } else {
                    i3 = -91;
                }
                if (m24553 == i3) {
                    int i8 = 131;
                    byte[] bArr4 = new byte[131];
                    int i9 = 0;
                    while (i9 < i8) {
                        int i10 = i9 + 1;
                        bArr4[i9] = m27594[i10];
                        i9 = i10;
                        i8 = 131;
                    }
                    int i11 = i8;
                    for (int i12 = 0; i12 < i11; i12++) {
                        byte b3 = (byte) (bArr4[i12] ^ m25017[i12]);
                        bArr4[i12] = b3;
                        bArr4[i12] = (byte) (b3 ^ bArr3[i12]);
                    }
                    for (int i13 = 0; i13 < 128; i13++) {
                        bArr[i13] = bArr4[i13];
                    }
                    for (int i14 = 0; i14 < 3; i14++) {
                        bArr2[i14] = bArr4[i14 + 128];
                    }
                    int i15 = (getOutputFormats + 1) % 128;
                    getInputSizeshNQ4ISI = i15;
                    try {
                        byte b4 = bArr2[0];
                        if (b4 == 0 && bArr2[1] == 0) {
                            int i16 = i15 + 45;
                            getOutputFormats = i16 % 128;
                            if (i16 % 2 != 0) {
                                if (bArr2[4] == 0) {
                                }
                            } else if (bArr2[2] == 0) {
                            }
                            cause = th.getCause();
                            if (cause == null) {
                                throw cause;
                            }
                            throw th;
                        }
                        if (b4 >= 0 && (b = bArr2[1]) >= 0 && (b2 = bArr2[2]) >= 0 && b4 != b) {
                            int i17 = getOutputFormats;
                            getInputSizeshNQ4ISI = (i17 + 95) % 128;
                            if (b != b2 && b4 != b2) {
                                byte b5 = bArr[b4];
                                byte b6 = bArr[b];
                                byte b7 = bArr[b2];
                                if (b5 < b6) {
                                    getInputSizeshNQ4ISI = (i17 + 3) % 128;
                                    if (b5 >= 0) {
                                        int i18 = i17 + 39;
                                        getInputSizeshNQ4ISI = i18 % 128;
                                        if (i18 % 2 != 0 ? b5 <= 100 : b5 <= 107) {
                                            if (b6 >= 0 && b6 <= 100 && b7 >= 0 && b7 <= 100) {
                                                if (b7 < b5) {
                                                    i4 = 801;
                                                    i5 = -91;
                                                    if (i4 == i5) {
                                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI("裷ʣ鱄៵ꆕ㬸뛐䃅\uda21嗖\uef36礻\uf4b7蹫᠙鎤", 35419 - android.graphics.Color.green(0), objArr11);
                                                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI("裿᷄ꊐ㞐\udc70慆\uf637鬖⇻뛍実\ue092畴ᩕ꼽㐚\udaf2濂\uf4a0", android.view.View.MeasureSpec.getMode(0) + 38177, objArr12);
                                                        if (((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr12[0], null).invoke(null, null)).booleanValue()) {
                                                            i4 = 803;
                                                        }
                                                        if (i4 == -91) {
                                                            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState walletSecureEnrollmentState = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_STARTED;
                                                            return true;
                                                        }
                                                        getHighSpeedVideoFpsRangesFor(i4);
                                                    } else {
                                                        getHighSpeedVideoFpsRangesFor(i4);
                                                    }
                                                    return false;
                                                }
                                                if (b7 < b6) {
                                                    if (b7 >= b5 && b7 < b6) {
                                                        try {
                                                            int nextInt2 = ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                                            try {
                                                                java.lang.Object[] objArr13 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt2)};
                                                                java.lang.Object obj2 = util.h.xy.dd.b.f1176.get(-1119310920);
                                                                if (obj2 == null) {
                                                                    java.lang.Class cls4 = (java.lang.Class) util.h.xy.dd.b.m26271(124 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 47407), 20 - android.graphics.ImageFormat.getBitsPerPixel(0));
                                                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                                    getHighSpeedVideoSizes(objArr14);
                                                                    java.lang.String str5 = (java.lang.String) objArr14[0];
                                                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                                    getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 127, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr15);
                                                                    obj2 = cls4.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr15[0]), java.lang.Integer.TYPE);
                                                                    util.h.xy.dd.b.f1176.put(-1119310920, obj2);
                                                                }
                                                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr13)).intValue() != nextInt2) {
                                                                    getInputSizeshNQ4ISI = (getOutputFormats + 69) % 128;
                                                                    i5 = -91;
                                                                    i4 = com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
                                                                    if (i4 == i5) {
                                                                    }
                                                                    return false;
                                                                }
                                                            } catch (java.lang.Throwable th4) {
                                                                java.lang.Throwable cause4 = th4.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th4;
                                                            }
                                                        } catch (java.lang.Throwable th5) {
                                                            java.lang.Throwable cause5 = th5.getCause();
                                                            if (cause5 != null) {
                                                                throw cause5;
                                                            }
                                                            throw th5;
                                                        }
                                                    }
                                                }
                                                i5 = -91;
                                                i4 = -91;
                                                if (i4 == i5) {
                                                }
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused54) {
                        i2 = 0;
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(i2, i2, i2) + 16, 266 - (android.util.TypedValue.complexToFraction(i2, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i2, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (25125 - android.graphics.Color.alpha(i2)), objArr16);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr16[i2]).intern());
                    } catch (java.io.UnsupportedEncodingException unused55) {
                        i = 0;
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i) + 21, 246 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.text.TextUtils.getOffsetBefore("", i), objArr17);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr17[i]).intern());
                    }
                }
                i4 = m24553;
                i5 = -91;
                if (i4 == i5) {
                }
                return false;
            }
            i3 = -91;
            m24553 = -91;
            if (m24553 == i3) {
            }
            i4 = m24553;
            i5 = -91;
            if (i4 == i5) {
            }
            return false;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused56) {
            i2 = 0;
            java.lang.Object[] objArr162 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(i2, i2, i2) + 16, 266 - (android.util.TypedValue.complexToFraction(i2, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i2, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (25125 - android.graphics.Color.alpha(i2)), objArr162);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr162[i2]).intern());
        } catch (java.io.UnsupportedEncodingException unused57) {
            i = 0;
            java.lang.Object[] objArr172 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i) + 21, 246 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.text.TextUtils.getOffsetBefore("", i), objArr172);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr172[i]).intern());
        }
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, java.lang.String str) throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        try {
            this.unwrapAs = null;
            util.h.xy.az.ra m25179 = util.h.xy.au.mf.m25169().m25179(bArr);
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m25179.m25280()));
            java.lang.String m25142 = util.h.xy.au.g.m25127().m25142(m25179);
            if (!util.h.xy.az.ra.m25277(m25142)) {
                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR, 0, java.lang.Integer.parseInt(m25142), util.h.xy.au.g.m25127().m25134(m25179), null);
            }
            getInputSizeshNQ4ISI = (getOutputFormats + 31) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 282, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            if (jSONObject.has(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 12, android.view.KeyEvent.getDeadChar(0, 0) + 282, (char) android.view.View.resolveSize(0, 0), objArr2);
                if (!util.h.xy.cv.b.m26061(jSONObject.getString(((java.lang.String) objArr2[0]).intern()))) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 12, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 282, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                    return jSONObject.getString(((java.lang.String) objArr3[0]).intern());
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 21, 293 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            sb.append(str);
            Camera2StreamConfigurationMap(bArr, 2, sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getCapsMode("", 0, 0) + 21, 294 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
            sb2.append(((java.lang.String) objArr5[0]).intern());
            sb2.append(str);
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR, 0, -1, sb2.toString(), null);
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e) {
            e = e;
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR, 0, 0, e.getMessage(), null);
        } catch (org.json.JSONException e2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(e2.getMessage());
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getMode(0) + 3, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 314, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr6);
            sb3.append(((java.lang.String) objArr6[0]).intern());
            sb3.append(str);
            Camera2StreamConfigurationMap(bArr, 2, sb3.toString());
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.JSON_PARSING_ERROR, 0, -1, e2.getMessage(), null);
        } catch (util.h.xy.az.ma e3) {
            e = e3;
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR, 0, 0, e.getMessage(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private util.h.xy.au.c getHighSpeedVideoFpsRangesFor(byte[] bArr, java.lang.String str) throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        util.h.xy.au.c cVar;
        util.h.xy.au.c highResolutionOutputSizeshNQ4ISI;
        byte[][] m25119;
        int length;
        java.lang.String str2 = str;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        getInputSizeshNQ4ISI = (getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        try {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.view.View.combineMeasuredStates(0, 0) + 127, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(127 - android.graphics.Color.argb(0, 0, 0, 0), "\u0084\u008a\u008d\u0081\u0082\u0081\u0090\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0089\u008a\u008d", objArr2);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr2[0], null).invoke(m24558, null);
                try {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        java.lang.String packageName = m24558.getPackageName();
                        getInputSizeshNQ4ISI = (getOutputFormats + 107) % 128;
                        try {
                            java.lang.Object[] objArr3 = {packageName, java.lang.Integer.valueOf(androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE)};
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0084\u008a\u008d\u0081\u0082\u0081\u0090\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0087\u0092\u0091\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(127 - android.text.TextUtils.indexOf("", "", 0), "\u0085\u0094\u0082\u0093\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0089\u008a\u008d", objArr5);
                            android.content.pm.SigningInfo signingInfo = ((android.content.pm.PackageInfo) cls2.getMethod((java.lang.String) objArr5[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr3)).signingInfo;
                            if (signingInfo.hasMultipleSigners()) {
                                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(signingInfo.getApkContentsSigners(), str2);
                                if (highResolutionOutputSizeshNQ4ISI != null) {
                                    byte[][] m251192 = highResolutionOutputSizeshNQ4ISI.m25119();
                                    int length2 = m251192.length;
                                    getInputSizeshNQ4ISI = (getOutputFormats + 27) % 128;
                                    int i = 0;
                                    while (i < length2) {
                                        int i2 = getInputSizeshNQ4ISI + 91;
                                        getOutputFormats = i2 % 128;
                                        if (i2 % 2 != 0) {
                                            util.h.xy.ar.b.m25074(m251192[i]);
                                            i += 20;
                                        } else {
                                            util.h.xy.ar.b.m25074(m251192[i]);
                                            i++;
                                        }
                                    }
                                } else {
                                    bool = java.lang.Boolean.FALSE;
                                }
                            } else {
                                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(signingInfo.getSigningCertificateHistory(), str2);
                                if (highResolutionOutputSizeshNQ4ISI != null) {
                                    int i3 = getInputSizeshNQ4ISI + 49;
                                    getOutputFormats = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        m25119 = highResolutionOutputSizeshNQ4ISI.m25119();
                                        length = m25119.length;
                                    } else {
                                        m25119 = highResolutionOutputSizeshNQ4ISI.m25119();
                                        length = m25119.length;
                                    }
                                    for (int i4 = 0; i4 < length; i4++) {
                                        util.h.xy.ar.b.m25074(m25119[i4]);
                                    }
                                } else {
                                    bool = java.lang.Boolean.FALSE;
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        try {
                            java.lang.Object[] objArr6 = {m24558.getPackageName(), 64};
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(127 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0084\u008a\u008d\u0081\u0082\u0081\u0090\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0087\u0092\u0091\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(127 - android.graphics.Color.alpha(0), "\u0085\u0094\u0082\u0093\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0089\u008a\u008d", objArr8);
                            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(new android.content.pm.Signature[]{((android.content.pm.PackageInfo) cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr6)).signatures[0]}, str2);
                            if (highResolutionOutputSizeshNQ4ISI != null) {
                                for (byte[] bArr2 : highResolutionOutputSizeshNQ4ISI.m25119()) {
                                    util.h.xy.ar.b.m25074(bArr2);
                                }
                            } else {
                                bool = java.lang.Boolean.FALSE;
                            }
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                    getOutputFormats = (getInputSizeshNQ4ISI + 91) % 128;
                    cVar = highResolutionOutputSizeshNQ4ISI;
                } catch (android.content.pm.PackageManager.NameNotFoundException | com.gemalto.mfs.mwsdk.exception.InternalComponentException | java.security.cert.CertificateException unused) {
                    bool = java.lang.Boolean.FALSE;
                    cVar = str2;
                    if (!bool.booleanValue()) {
                    }
                    return cVar;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException | com.gemalto.mfs.mwsdk.exception.InternalComponentException | java.security.cert.CertificateException unused2) {
            str2 = null;
        }
        if (!bool.booleanValue()) {
            util.h.xy.v.ma m27609 = util.h.xy.v.b.f2439.m27609(util.h.xy.v.b.mb.f2477);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 319, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr9);
                sb.append(((java.lang.String) objArr9[0]).intern());
                sb.append(m27609);
                Camera2StreamConfigurationMap(bArr, 2, sb.toString());
                getInputSizeshNQ4ISI = (getOutputFormats + 57) % 128;
                if (m27609.m27668() > util.h.xy.v.ma.f2558.m27668() || m27609.m27668() <= util.h.xy.v.ma.f2610.m27668()) {
                    getOutputFormats = (getInputSizeshNQ4ISI + 51) % 128;
                    this.toString = null;
                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_ERROR_INIT_SESSION;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getSize(0) + 19, 1270 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43629), objArr10);
                    java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
                    int i5 = util.h.xy.ca.a.AnonymousClass7.getHighSpeedVideoSizes[m27609.ordinal()];
                    if (i5 == 1) {
                        walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_ERROR_COMPUTE_AUTH_VALUE_FAILED_CERT_EXCEPTION;
                        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                        int i6 = getOutputFormats + 103;
                        getInputSizeshNQ4ISI = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 5 / 5;
                        }
                        try {
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(57 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), (tapTimeout >> 16) + 1289, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr11);
                            intern = ((java.lang.String) objArr11[0]).intern();
                            getInputSizeshNQ4ISI = (getOutputFormats + 65) % 128;
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause4 = th4.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th4;
                        }
                    } else if (i5 == 2) {
                        walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_ERROR_COMPUTE_AUTH_VALUE_FAILED_PACKAGE_NOT_FOUND;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 67, 1345 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr12);
                        intern = ((java.lang.String) objArr12[0]).intern();
                    }
                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes, 0, 0, intern, null);
                }
                getOutputFormats = (getInputSizeshNQ4ISI + 51) % 128;
                getHighSpeedVideoFpsRangesFor(util.h.xy.af.mb.m24551().m24553(m27609.m27668()));
            } catch (java.lang.Throwable th5) {
                java.lang.Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0621 A[Catch: ma -> 0x0519, MGException -> 0x051d, JSONException -> 0x069c, InternalComponentException -> 0x069f, MalformedURLException -> 0x0924, ma -> 0x095f, TryCatch #8 {InternalComponentException -> 0x069f, blocks: (B:129:0x0605, B:132:0x0621, B:133:0x069b), top: B:128:0x0605 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0776 A[Catch: ma -> 0x0519, MGException -> 0x051d, JSONException -> 0x069c, InternalComponentException -> 0x080f, MalformedURLException -> 0x0924, ma -> 0x095f, TRY_LEAVE, TryCatch #1 {InternalComponentException -> 0x080f, blocks: (B:145:0x075a, B:148:0x0776, B:152:0x07d1, B:153:0x0804, B:156:0x0806, B:158:0x080d, B:159:0x080e), top: B:144:0x075a }] */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v206 */
    /* JADX WARN: Type inference failed for: r3v207 */
    /* JADX WARN: Type inference failed for: r3v208 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v73 */
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoSizes(android.content.Context context, util.h.xy.au.c cVar, byte[] bArr, java.lang.String str) throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        byte[] bArr2;
        java.lang.Throwable th;
        com.gemalto.mfs.mwsdk.exception.InternalComponentException internalComponentException;
        org.json.JSONException jSONException;
        java.lang.String str2;
        byte[] bArr3;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        byte[] m25786;
        byte[] m257862;
        java.lang.String str5;
        org.json.JSONObject jSONObject;
        java.lang.String str6;
        java.lang.String str7 = "android.os.Process";
        java.lang.Integer num = 0;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(10 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.resolveSize(0, 0) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE, (char) (32782 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), objArr);
            ?? intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(3 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), 567 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr2);
            java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(6 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 475, (char) android.graphics.Color.alpha(0), objArr3);
            java.lang.String intern3 = ((java.lang.String) objArr3[0]).intern();
            java.io.File filesDir = context.getFilesDir();
            util.h.xy.y.mb.m27701(context);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 8, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 130, (char) android.view.KeyEvent.keyCodeFromString(""), objArr4);
            java.io.File file = new java.io.File(filesDir, ((java.lang.String) objArr4[0]).intern());
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 138 - android.text.TextUtils.getCapsMode("", 0, 0), (char) android.text.TextUtils.getOffsetAfter("", 0), objArr5);
            java.io.File file2 = new java.io.File(filesDir, ((java.lang.String) objArr5[0]).intern());
            util.h.xy.au.rd[] rdVarArr = {util.h.xy.au.rd.f880, util.h.xy.au.rd.f879};
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getInputSizeshNQ4ISI());
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(3 - android.view.View.resolveSizeAndState(0, 0, 0), android.view.View.combineMeasuredStates(0, 0) + 315, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
            sb.append(((java.lang.String) objArr6[0]).intern());
            sb.append(str);
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(2 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 314, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr7);
            sb2.append(((java.lang.String) objArr7[0]).intern());
            sb2.append(obj);
            java.lang.String obj2 = sb2.toString();
            try {
                try {
                    try {
                        long m27608 = util.h.xy.v.b.f2439.m27608(context, new byte[]{0});
                        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
                        java.lang.String m25244 = util.h.xy.aw.ma.m25244();
                        util.h.xy.au.mf m25169 = util.h.xy.au.mf.m25169();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(m27608);
                        bArr2 = intern;
                        try {
                            util.h.xy.az.ra m25183 = m25169.m25183(rdVarArr, bArr, sb3.toString(), cVar, m25244);
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(new java.lang.String(m25183.m25280()));
                            java.lang.String m25142 = util.h.xy.au.g.m25127().m25142(m25183);
                            try {
                                if (!util.h.xy.az.ra.m25277(m25142)) {
                                    java.lang.String m25134 = util.h.xy.au.g.m25127().m25134(m25183);
                                    int parseInt = java.lang.Integer.parseInt(m25142);
                                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR;
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                    sb4.append(m25134);
                                    sb4.append(obj2);
                                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes, 0, parseInt, sb4.toString(), null);
                                }
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 376, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1288), objArr8);
                                org.json.JSONArray jSONArray = jSONObject2.getJSONArray(((java.lang.String) objArr8[0]).intern());
                                if (jSONArray == null || jSONArray.length() < 2) {
                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(31 - android.text.TextUtils.indexOf("", "", 0, 0), 383 - android.view.View.resolveSize(0, 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9);
                                    sb5.append(((java.lang.String) objArr9[0]).intern());
                                    sb5.append(obj2);
                                    Camera2StreamConfigurationMap(bArr, 1, sb5.toString());
                                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR;
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    try {
                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 31, 383 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr10);
                                        sb6.append(((java.lang.String) objArr10[0]).intern());
                                        sb6.append(obj2);
                                        throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes2, 0, -1, sb6.toString(), null);
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause = th2.getCause();
                                        if (cause == null) {
                                            throw th2;
                                        }
                                        throw cause;
                                    }
                                }
                                ?? r3 = 0;
                                int i2 = 0;
                                ?? r6 = 0;
                                while (i2 < jSONArray.length()) {
                                    try {
                                        jSONObject = (org.json.JSONObject) jSONArray.get(i2);
                                        str5 = obj2;
                                        str6 = intern2;
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                        e = e;
                                        str5 = obj2;
                                    } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e2) {
                                        e = e2;
                                        str5 = obj2;
                                    } catch (org.json.JSONException e3) {
                                        e = e3;
                                        str5 = obj2;
                                    } catch (util.h.xy.az.ma e4) {
                                        e = e4;
                                        str5 = obj2;
                                    }
                                    try {
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 414, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 37008), objArr11);
                                        java.lang.Object obj3 = jSONObject.get(((java.lang.String) objArr11[0]).intern());
                                        try {
                                            java.lang.Integer num2 = num;
                                            java.lang.String str8 = str7;
                                            byte[] bArr4 = bArr2;
                                            try {
                                                try {
                                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRangesFor((-16777208) - android.graphics.Color.rgb(0, 0, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 370, (char) (((((java.lang.Integer) java.lang.Class.forName(str7).getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6) + 3783), objArr12);
                                                    org.json.JSONObject jSONObject3 = r6;
                                                    if (obj3.equals(((java.lang.String) objArr12[0]).intern())) {
                                                        jSONObject3 = (org.json.JSONObject) jSONArray.get(i2);
                                                    }
                                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRangesFor(3 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 414, (char) (37008 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr13);
                                                    java.lang.Object obj4 = jSONObject.get(((java.lang.String) objArr13[0]).intern());
                                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRangesFor(11 - android.widget.ExpandableListView.getPackedPositionType(0L), 427 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.indexOf("", ""), objArr14);
                                                    if (obj4.equals(((java.lang.String) objArr14[0]).intern())) {
                                                        r3 = (org.json.JSONObject) jSONArray.get(i2);
                                                    }
                                                    i2++;
                                                    obj2 = str5;
                                                    num = num2;
                                                    intern2 = str6;
                                                    str7 = str8;
                                                    bArr2 = bArr4;
                                                    r3 = r3;
                                                    r6 = jSONObject3;
                                                } catch (org.json.JSONException e5) {
                                                    e = e5;
                                                    bArr2 = bArr;
                                                    obj2 = str5;
                                                    jSONException = e;
                                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                                    sb7.append(jSONException.getMessage());
                                                    sb7.append(obj2);
                                                    Camera2StreamConfigurationMap(bArr2, 2, sb7.toString());
                                                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.JSON_PARSING_ERROR;
                                                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                                    sb8.append(jSONException.getMessage());
                                                    sb8.append(obj2);
                                                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes3, 0, -1, sb8.toString(), null);
                                                }
                                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e6) {
                                                e = e6;
                                                obj2 = str5;
                                                internalComponentException = e;
                                                com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes4 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_INTERNAL_ERROR;
                                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                                                sb9.append(internalComponentException.getMessage());
                                                sb9.append(obj2);
                                                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes4, 0, 0, sb9.toString(), null);
                                            } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e7) {
                                                e = e7;
                                                obj2 = str5;
                                                th = e;
                                                com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes5 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR;
                                                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                                                sb10.append(th.getMessage());
                                                sb10.append(obj2);
                                                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes5, 0, 0, sb10.toString(), null);
                                            } catch (util.h.xy.az.ma e8) {
                                                e = e8;
                                                obj2 = str5;
                                                th = e;
                                                com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes52 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR;
                                                java.lang.StringBuilder sb102 = new java.lang.StringBuilder();
                                                sb102.append(th.getMessage());
                                                sb102.append(obj2);
                                                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes52, 0, 0, sb102.toString(), null);
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            java.lang.Throwable cause2 = th3.getCause();
                                            if (cause2 == null) {
                                                throw th3;
                                            }
                                            throw cause2;
                                        }
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e9) {
                                        e = e9;
                                        internalComponentException = e;
                                        obj2 = str5;
                                        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes42 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_INTERNAL_ERROR;
                                        java.lang.StringBuilder sb92 = new java.lang.StringBuilder();
                                        sb92.append(internalComponentException.getMessage());
                                        sb92.append(obj2);
                                        throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes42, 0, 0, sb92.toString(), null);
                                    } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e10) {
                                        e = e10;
                                        th = e;
                                        obj2 = str5;
                                        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes522 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR;
                                        java.lang.StringBuilder sb1022 = new java.lang.StringBuilder();
                                        sb1022.append(th.getMessage());
                                        sb1022.append(obj2);
                                        throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes522, 0, 0, sb1022.toString(), null);
                                    } catch (org.json.JSONException e11) {
                                        e = e11;
                                        jSONException = e;
                                        bArr2 = bArr;
                                        obj2 = str5;
                                        java.lang.StringBuilder sb72 = new java.lang.StringBuilder();
                                        sb72.append(jSONException.getMessage());
                                        sb72.append(obj2);
                                        Camera2StreamConfigurationMap(bArr2, 2, sb72.toString());
                                        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes32 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.JSON_PARSING_ERROR;
                                        java.lang.StringBuilder sb82 = new java.lang.StringBuilder();
                                        sb82.append(jSONException.getMessage());
                                        sb82.append(obj2);
                                        throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes32, 0, -1, sb82.toString(), null);
                                    } catch (util.h.xy.az.ma e12) {
                                        e = e12;
                                        th = e;
                                        obj2 = str5;
                                        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes5222 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR;
                                        java.lang.StringBuilder sb10222 = new java.lang.StringBuilder();
                                        sb10222.append(th.getMessage());
                                        sb10222.append(obj2);
                                        throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes5222, 0, 0, sb10222.toString(), null);
                                    }
                                }
                                java.lang.String str9 = obj2;
                                java.lang.String str10 = str7;
                                ?? r27 = bArr2;
                                java.lang.String str11 = intern2;
                                if (r3 == 0 || r6 == 0) {
                                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(android.view.View.resolveSize(0, 0) + 31, 383 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr15);
                                    sb11.append(((java.lang.String) objArr15[0]).intern());
                                    sb11.append(str9);
                                    Camera2StreamConfigurationMap(bArr, 1, sb11.toString());
                                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes6 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR;
                                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionType(0L) + 31, 383 - android.view.View.getDefaultSize(0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr16);
                                    sb12.append(((java.lang.String) objArr16[0]).intern());
                                    sb12.append(str9);
                                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes6, 0, -1, sb12.toString(), null);
                                }
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 437, (char) (58426 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr17);
                                if (r3.has(((java.lang.String) objArr17[0]).intern())) {
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(3 - android.view.View.MeasureSpec.getMode(0), 437 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 58378), objArr18);
                                    if (r6.has(((java.lang.String) objArr18[0]).intern())) {
                                        if (!r3.has(intern3) || !r6.has(intern3)) {
                                            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(38 - android.view.MotionEvent.axisFromString(""), 480 - android.view.View.MeasureSpec.getSize(0), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 33886), objArr19);
                                            sb13.append(((java.lang.String) objArr19[0]).intern());
                                            sb13.append(str9);
                                            Camera2StreamConfigurationMap(bArr, 2, sb13.toString());
                                            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes7 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR;
                                            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetBefore("", 0) + 39, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, (char) (android.view.View.resolveSize(0, 0) + 33886), objArr20);
                                            sb14.append(((java.lang.String) objArr20[0]).intern());
                                            sb14.append(str9);
                                            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes7, 0, -1, sb14.toString(), null);
                                        }
                                        if (!r3.has(r27) || r3.getString(r27) == null || r3.getString(r27).length() == 0) {
                                            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(36 - android.view.View.getDefaultSize(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 530, (char) (9607 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr21);
                                            sb15.append(((java.lang.String) objArr21[0]).intern());
                                            sb15.append(str9);
                                            Camera2StreamConfigurationMap(bArr, 2, sb15.toString());
                                            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes8 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR;
                                            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor((-16777180) - android.graphics.Color.rgb(0, 0, 0), 529 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 9559), objArr22);
                                            sb16.append(((java.lang.String) objArr22[0]).intern());
                                            sb16.append(str9);
                                            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes8, 0, -1, sb16.toString(), null);
                                        }
                                        if (!r6.has(r27) || r6.getString(r27) == null || r6.getString(r27).length() == 0) {
                                            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 531, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 9559), objArr23);
                                            sb17.append(((java.lang.String) objArr23[0]).intern());
                                            sb17.append(str9);
                                            Camera2StreamConfigurationMap(bArr, 2, sb17.toString());
                                            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes9 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR;
                                            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, 529 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9560), objArr24);
                                            sb18.append(((java.lang.String) objArr24[0]).intern());
                                            sb18.append(str9);
                                            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes9, 0, -1, sb18.toString(), null);
                                        }
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(3 - android.graphics.Color.blue(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 438, (char) (58426 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr25);
                                        java.lang.String string = r3.getString(((java.lang.String) objArr25[0]).intern());
                                        r3.get(intern3);
                                        r3.toString(4);
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(4 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 437, (char) (58425 - android.view.MotionEvent.axisFromString("")), objArr26);
                                        java.lang.String string2 = r6.getString(((java.lang.String) objArr26[0]).intern());
                                        r6.get(intern3);
                                        r6.toString(4);
                                        try {
                                            try {
                                                if (r3.has(str11)) {
                                                    try {
                                                        if (!r3.isNull(str11)) {
                                                            str2 = (java.lang.String) r3.get(str11);
                                                            if (!str2.isEmpty() && str2.length() > 48) {
                                                                java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTouchSlop() >> 8) + 25, android.view.KeyEvent.keyCodeFromString("") + 569, (char) (android.graphics.Color.rgb(0, 0, 0) + 16800694), objArr27);
                                                                sb19.append(((java.lang.String) objArr27[0]).intern());
                                                                obj2 = str9;
                                                                try {
                                                                    sb19.append(obj2);
                                                                    Camera2StreamConfigurationMap(bArr, 4, sb19.toString());
                                                                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes10 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR;
                                                                    java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
                                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(26 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23477), objArr28);
                                                                    sb20.append(((java.lang.String) objArr28[0]).intern());
                                                                    sb20.append(obj2);
                                                                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes10, 0, -1, sb20.toString(), null);
                                                                } catch (org.json.JSONException e13) {
                                                                    e = e13;
                                                                    bArr2 = bArr;
                                                                    jSONException = e;
                                                                    java.lang.StringBuilder sb722 = new java.lang.StringBuilder();
                                                                    sb722.append(jSONException.getMessage());
                                                                    sb722.append(obj2);
                                                                    Camera2StreamConfigurationMap(bArr2, 2, sb722.toString());
                                                                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes322 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.JSON_PARSING_ERROR;
                                                                    java.lang.StringBuilder sb822 = new java.lang.StringBuilder();
                                                                    sb822.append(jSONException.getMessage());
                                                                    sb822.append(obj2);
                                                                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes322, 0, -1, sb822.toString(), null);
                                                                }
                                                            }
                                                            bArr3 = bArr;
                                                            str3 = str9;
                                                            if (r6.has(str11) || r6.isNull(str11)) {
                                                                str4 = null;
                                                            } else {
                                                                str4 = (java.lang.String) r6.get(str11);
                                                                if (!str4.isEmpty() && str4.length() > 48) {
                                                                    java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
                                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(25 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 594 - android.text.TextUtils.getTrimmedLength(""), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 52324), objArr29);
                                                                    sb21.append(((java.lang.String) objArr29[0]).intern());
                                                                    sb21.append(str3);
                                                                    Camera2StreamConfigurationMap(bArr3, 4, sb21.toString());
                                                                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes11 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR;
                                                                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 26, 594 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 52323), objArr30);
                                                                    sb22.append(((java.lang.String) objArr30[0]).intern());
                                                                    sb22.append(str3);
                                                                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes11, 0, -1, sb22.toString(), null);
                                                                }
                                                            }
                                                            new util.h.xy.as.b().m25114(new java.net.URL(string), file, (java.lang.String) r3.get(intern3));
                                                            file.exists();
                                                            file.length();
                                                            if (str2 != null && !str2.isEmpty()) {
                                                                m257862 = util.h.xy.bx.ra.f1063.m25786(str2);
                                                                util.h.xy.ar.b.m25074(m257862);
                                                                try {
                                                                    if (java.nio.ByteBuffer.wrap(m257862, 0, 3).equals(java.nio.ByteBuffer.wrap(util.h.xy.v.b.f2439.m27622(new byte[]{0}), 0, 3))) {
                                                                        java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
                                                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                        getHighSpeedVideoFpsRangesFor(16 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 618, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr31);
                                                                        sb23.append(((java.lang.String) objArr31[0]).intern());
                                                                        sb23.append(str3);
                                                                        Camera2StreamConfigurationMap(bArr3, 4, sb23.toString());
                                                                        util.h.xy.y.mb.m27701(context);
                                                                        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes12 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_KCV_ERROR;
                                                                        java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
                                                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                        getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) + 16, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 619, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr32);
                                                                        sb24.append(((java.lang.String) objArr32[0]).intern());
                                                                        sb24.append(str3);
                                                                        throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes12, 0, -1, sb24.toString(), null);
                                                                    }
                                                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e14) {
                                                                    java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
                                                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 9, 635 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0), objArr33);
                                                                    sb25.append(((java.lang.String) objArr33[0]).intern());
                                                                    sb25.append(e14.getMessage());
                                                                    sb25.append(str3);
                                                                    Camera2StreamConfigurationMap(bArr3, 4, sb25.toString());
                                                                    util.h.xy.y.mb.m27701(context);
                                                                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes13 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_KCV_ERROR;
                                                                    java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
                                                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(8 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.text.TextUtils.indexOf("", "", 0) + 635, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr34);
                                                                    sb26.append(((java.lang.String) objArr34[0]).intern());
                                                                    sb26.append(e14.getMessage());
                                                                    sb26.append(str3);
                                                                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes13, 0, -1, sb26.toString(), null);
                                                                }
                                                            }
                                                            new util.h.xy.as.b().m25114(new java.net.URL(string2), file2, (java.lang.String) r6.get(intern3));
                                                            file2.exists();
                                                            file2.length();
                                                            if (str4 != null && !str4.isEmpty()) {
                                                                m25786 = util.h.xy.bx.ra.f1063.m25786(str4);
                                                                util.h.xy.ar.b.m25074(m25786);
                                                                try {
                                                                    if (java.nio.ByteBuffer.wrap(m25786, 0, 3).equals(java.nio.ByteBuffer.wrap(util.h.xy.v.b.f2439.m27628(new byte[]{0}), 0, 3))) {
                                                                        java.lang.StringBuilder sb27 = new java.lang.StringBuilder();
                                                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                        getHighSpeedVideoFpsRangesFor(16 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 642, (char) android.graphics.Color.blue(0), objArr35);
                                                                        sb27.append(((java.lang.String) objArr35[0]).intern());
                                                                        sb27.append(str3);
                                                                        Camera2StreamConfigurationMap(bArr3, 4, sb27.toString());
                                                                        util.h.xy.y.mb.m27701(context);
                                                                        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes14 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_KCV_ERROR;
                                                                        java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
                                                                        try {
                                                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                            getHighSpeedVideoFpsRangesFor((((java.lang.Integer) java.lang.Class.forName(str10).getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 16, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 643, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr36);
                                                                            sb28.append(((java.lang.String) objArr36[0]).intern());
                                                                            sb28.append(str3);
                                                                            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes14, 0, -1, sb28.toString(), null);
                                                                        } catch (java.lang.Throwable th4) {
                                                                            java.lang.Throwable cause3 = th4.getCause();
                                                                            if (cause3 == null) {
                                                                                throw th4;
                                                                            }
                                                                            throw cause3;
                                                                        }
                                                                    }
                                                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e15) {
                                                                    java.lang.StringBuilder sb29 = new java.lang.StringBuilder();
                                                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 8, 659 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr37);
                                                                    sb29.append(((java.lang.String) objArr37[0]).intern());
                                                                    sb29.append(e15.getMessage());
                                                                    sb29.append(str3);
                                                                    Camera2StreamConfigurationMap(bArr3, 4, sb29.toString());
                                                                    util.h.xy.y.mb.m27701(context);
                                                                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes15 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_KCV_ERROR;
                                                                    java.lang.StringBuilder sb30 = new java.lang.StringBuilder();
                                                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(8 - android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 659, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr38);
                                                                    sb30.append(((java.lang.String) objArr38[0]).intern());
                                                                    sb30.append(e15.getMessage());
                                                                    sb30.append(str3);
                                                                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes15, 0, -1, sb30.toString(), null);
                                                                }
                                                            }
                                                            util.h.xy.t.mb.f2417.m27463(util.h.xy.bx.ra.f1063.m25786(r3.getString(r27)));
                                                            util.h.xy.t.mb.f2417.m27480(util.h.xy.bx.ra.f1063.m25786(r6.getString(r27)));
                                                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 7, (-16776549) - android.graphics.Color.rgb(0, 0, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr39);
                                                            Camera2StreamConfigurationMap(bArr3, 0, ((java.lang.String) objArr39[0]).intern());
                                                            return;
                                                        }
                                                    } catch (org.json.JSONException e16) {
                                                        e = e16;
                                                        bArr2 = bArr;
                                                        obj2 = str9;
                                                    }
                                                }
                                                util.h.xy.t.mb.f2417.m27463(util.h.xy.bx.ra.f1063.m25786(r3.getString(r27)));
                                                util.h.xy.t.mb.f2417.m27480(util.h.xy.bx.ra.f1063.m25786(r6.getString(r27)));
                                                java.lang.Object[] objArr392 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 7, (-16776549) - android.graphics.Color.rgb(0, 0, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr392);
                                                Camera2StreamConfigurationMap(bArr3, 0, ((java.lang.String) objArr392[0]).intern());
                                                return;
                                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e17) {
                                                getInputFormats();
                                                java.lang.StringBuilder sb31 = new java.lang.StringBuilder();
                                                sb31.append(e17.getMessage());
                                                sb31.append(str3);
                                                Camera2StreamConfigurationMap(bArr3, 2, sb31.toString());
                                                com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes16 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_STORAGE_ACCESS_ERROR;
                                                java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
                                                sb32.append(e17.getMessage());
                                                sb32.append(str3);
                                                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes16, 0, -1, sb32.toString(), null);
                                            }
                                            new util.h.xy.as.b().m25114(new java.net.URL(string), file, (java.lang.String) r3.get(intern3));
                                            file.exists();
                                            file.length();
                                            if (str2 != null) {
                                                m257862 = util.h.xy.bx.ra.f1063.m25786(str2);
                                                util.h.xy.ar.b.m25074(m257862);
                                                if (java.nio.ByteBuffer.wrap(m257862, 0, 3).equals(java.nio.ByteBuffer.wrap(util.h.xy.v.b.f2439.m27622(new byte[]{0}), 0, 3))) {
                                                }
                                            }
                                            new util.h.xy.as.b().m25114(new java.net.URL(string2), file2, (java.lang.String) r6.get(intern3));
                                            file2.exists();
                                            file2.length();
                                            if (str4 != null) {
                                                m25786 = util.h.xy.bx.ra.f1063.m25786(str4);
                                                util.h.xy.ar.b.m25074(m25786);
                                                if (java.nio.ByteBuffer.wrap(m25786, 0, 3).equals(java.nio.ByteBuffer.wrap(util.h.xy.v.b.f2439.m27628(new byte[]{0}), 0, 3))) {
                                                }
                                            }
                                        } catch (java.net.MalformedURLException e18) {
                                            java.lang.StringBuilder sb33 = new java.lang.StringBuilder();
                                            sb33.append(e18.getMessage());
                                            sb33.append(str3);
                                            Camera2StreamConfigurationMap(bArr3, 2, sb33.toString());
                                            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes17 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_DOWNLOAD_ERROR;
                                            java.lang.StringBuilder sb34 = new java.lang.StringBuilder();
                                            sb34.append(e18.getMessage());
                                            sb34.append(str3);
                                            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes17, 0, -1, sb34.toString(), null);
                                        } catch (util.h.xy.as.ma e19) {
                                            java.lang.StringBuilder sb35 = new java.lang.StringBuilder();
                                            sb35.append(e19.getMessage());
                                            sb35.append(str3);
                                            java.lang.String obj5 = sb35.toString();
                                            if (e19.m25115() != -7) {
                                                if (e19.m25115() != -2) {
                                                    if (e19.m25115() == -1) {
                                                        Camera2StreamConfigurationMap(bArr3, 3, obj5);
                                                        i = -1;
                                                    } else if (e19.m25115() != -4) {
                                                        e19.m25115();
                                                    }
                                                }
                                                Camera2StreamConfigurationMap(bArr3, 2, obj5);
                                                i = -1;
                                            } else {
                                                Camera2StreamConfigurationMap(bArr3, 3, obj5);
                                                i = 403;
                                            }
                                            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_DOWNLOAD_ERROR, 0, i, obj5, null);
                                        }
                                        bArr3 = bArr;
                                        str3 = str9;
                                        str2 = null;
                                        if (r6.has(str11)) {
                                        }
                                        str4 = null;
                                    }
                                }
                                java.lang.StringBuilder sb36 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(34 - android.text.TextUtils.indexOf("", ""), android.graphics.Color.alpha(0) + 440, (char) android.view.View.getDefaultSize(0, 0), objArr40);
                                sb36.append(((java.lang.String) objArr40[0]).intern());
                                sb36.append(str9);
                                Camera2StreamConfigurationMap(bArr, 2, sb36.toString());
                                com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes18 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_REQUEST_ERROR;
                                java.lang.StringBuilder sb37 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(34 - android.view.View.resolveSize(0, 0), (-16776776) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.alpha(0), objArr41);
                                sb37.append(((java.lang.String) objArr41[0]).intern());
                                sb37.append(str9);
                                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes18, 0, -1, sb37.toString(), null);
                            } catch (org.json.JSONException e20) {
                                e = e20;
                            }
                        } catch (org.json.JSONException e21) {
                            e = e21;
                            bArr2 = bArr;
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e22) {
                        e = e22;
                    }
                } catch (org.json.JSONException e23) {
                    e = e23;
                    bArr2 = bArr;
                }
            } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e24) {
                e = e24;
            } catch (util.h.xy.az.ma e25) {
                e = e25;
            }
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause4 = th5.getCause();
            if (cause4 == null) {
                throw th5;
            }
            throw cause4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener walletSecureEnrollmentListener) throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        byte[] bArr2;
        int i;
        util.h.xy.bv.ri riVar;
        util.h.xy.ca.a aVar;
        java.util.List list;
        java.util.List<util.h.xy.bv.ri.b> list2;
        int i2;
        java.lang.String str;
        java.lang.Boolean bool;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        util.h.xy.ca.a aVar2 = this;
        if (!getHighResolutionOutputSizeshNQ4ISI() && !getOutputMinFrameDuration()) {
            return;
        }
        java.lang.String str5 = null;
        try {
            if (aVar2.getValidOutputFormatsForInputhNQ4ISI.booleanValue()) {
                int i3 = getOutputFormats + 1;
                getInputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                byte[] bArr3 = aVar2.unwrapAs;
                if (bArr3 != null) {
                    bArr2 = bArr3;
                    util.h.xy.bv.ri highSpeedVideoFpsRangesFor = aVar2.getHighSpeedVideoFpsRangesFor(bArr2, 0);
                    int i4 = (getOutputFormats + 81) % 128;
                    getInputSizeshNQ4ISI = i4;
                    int i5 = (i4 + 103) % 128;
                    getOutputFormats = i5;
                    i = i5 + 101;
                    getInputSizeshNQ4ISI = i % 128;
                    if (i % 2 == 0) {
                        util.h.xy.m.mb m26975 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
                        byte[] m25763 = highSpeedVideoFpsRangesFor.m25763();
                        java.util.List<util.h.xy.bv.ri.b> m25764 = highSpeedVideoFpsRangesFor.m25764();
                        m26975.mo26165(m25763);
                        try {
                            util.h.xy.k.mb.m26927();
                            getOutputFormats = (getInputSizeshNQ4ISI + 51) % 128;
                            if (m25764 != null) {
                                try {
                                    if (m25764.size() != 0) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        java.lang.String[] m26919 = util.h.xy.k.b.m26919();
                                        if (m26919 != null && m26919.length > 0) {
                                            arrayList = new java.util.ArrayList(java.util.Arrays.asList(m26919));
                                        }
                                        java.util.List list3 = arrayList;
                                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                                        int i6 = 0;
                                        while (i6 < m25764.size()) {
                                            util.h.xy.bv.ri.b bVar = m25764.get(i6);
                                            java.lang.String str6 = new java.lang.String(bVar.m25769());
                                            if (list3.contains(str6)) {
                                                java.lang.String m26922 = util.h.xy.k.b.m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                                                util.h.xy.d.d result = util.h.xy.k.ra.f2243.m26941(m26922).getResult();
                                                util.h.xy.bv.ri.ma m25770 = bVar.m25770();
                                                if (m25770.m25774() != null) {
                                                    str5 = new java.lang.String(m25770.m25774());
                                                }
                                                java.lang.String str7 = m25770.m25777() == null ? null : new java.lang.String(m25770.m25777());
                                                if (m25770.m25778() == null) {
                                                    bool = bool2;
                                                    str = null;
                                                } else {
                                                    bool = bool2;
                                                    str = new java.lang.String(m25770.m25778());
                                                }
                                                if (m25770.m25772() == null) {
                                                    list = list3;
                                                    str2 = null;
                                                } else {
                                                    list = list3;
                                                    str2 = new java.lang.String(m25770.m25772());
                                                }
                                                if (m25770.m25773() == null) {
                                                    list2 = m25764;
                                                    str3 = null;
                                                } else {
                                                    list2 = m25764;
                                                    str3 = new java.lang.String(m25770.m25773());
                                                }
                                                if (m25770.m25771() == null) {
                                                    riVar = highSpeedVideoFpsRangesFor;
                                                    str4 = null;
                                                } else {
                                                    riVar = highSpeedVideoFpsRangesFor;
                                                    try {
                                                        str4 = new java.lang.String(m25770.m25771());
                                                    } catch (java.lang.Exception e) {
                                                        e = e;
                                                        java.lang.Object[] objArr = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 922, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + org.apache.commons.imaging.formats.jpeg.JpegConstants.RST5_MARKER), objArr);
                                                        util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.al.rc.m25022(e));
                                                        util.h.xy.au.md mdVar = util.h.xy.au.md.f866;
                                                        util.h.xy.au.me meVar = util.h.xy.au.me.f871;
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor(41 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 925 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (43475 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr2);
                                                        sb.append(((java.lang.String) objArr2[0]).intern());
                                                        sb.append(e.getMessage());
                                                        getHighSpeedVideoFpsRanges(bArr, mdVar, meVar, sb.toString(), "");
                                                        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_STORAGE_ACCESS_ERROR;
                                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 41, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 877, (char) (43475 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr3);
                                                        sb2.append(((java.lang.String) objArr3[0]).intern());
                                                        sb2.append(e.getMessage());
                                                        new com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError(walletSecureEnrollmentErrorCodes, 0, 0, sb2.toString(), null);
                                                        riVar.m25765();
                                                        getInputSizeshNQ4ISI = (getOutputFormats + 69) % 128;
                                                        return;
                                                    }
                                                }
                                                i2 = i6;
                                                java.lang.String result2 = util.h.xy.k.ma.m26925().mo26151(str6, util.h.xy.d.ma.f1142).getResult();
                                                if (result2 != null) {
                                                    try {
                                                        if (result2.length() > 0) {
                                                            java.lang.String m27506 = util.h.xy.u.d.m27506(result2, util.h.xy.s.ma.f2350);
                                                            boolean m27515 = util.h.xy.u.d.m27515(util.h.xy.s.rh.f2413, result2);
                                                            try {
                                                                if (!android.text.TextUtils.isEmpty(str5)) {
                                                                    result2 = util.h.xy.u.d.m27512(util.h.xy.s.rh.f2413, str5, result2);
                                                                } else if (m27515) {
                                                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 975, (char) (9500 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr4);
                                                                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr4[0]).intern());
                                                                }
                                                                boolean m275152 = util.h.xy.u.d.m27515(util.h.xy.s.ma.f2376, m27506);
                                                                boolean m275153 = util.h.xy.u.d.m27515(util.h.xy.s.ma.f2341, result2);
                                                                if (android.text.TextUtils.isEmpty(str7) || android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
                                                                    if (m275152) {
                                                                        android.text.TextUtils.isEmpty(str7);
                                                                        android.text.TextUtils.isEmpty(str);
                                                                        android.text.TextUtils.isEmpty(str2);
                                                                        android.text.TextUtils.isEmpty(str3);
                                                                        android.text.TextUtils.isEmpty(str4);
                                                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTapTimeout() >> 16) + 41, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1046, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
                                                                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr5[0]).intern());
                                                                    }
                                                                } else if (m275152) {
                                                                    m27506 = util.h.xy.u.d.m27512(util.h.xy.s.ma.f2368, str4, util.h.xy.u.d.m27512(util.h.xy.s.ma.f2366, str3, util.h.xy.u.d.m27512(util.h.xy.s.ma.f2365, str2, util.h.xy.u.d.m27512(util.h.xy.s.ma.f2372, str, util.h.xy.u.d.m27512(util.h.xy.s.ma.f2376, str7, m27506)))));
                                                                } else if (m275153) {
                                                                    try {
                                                                        result2 = util.h.xy.u.d.m27507(util.h.xy.s.ma.f2341, new org.json.JSONObject(util.h.xy.u.d.m27512(util.h.xy.s.ma.f2368, str4, util.h.xy.u.d.m27512(util.h.xy.s.ma.f2366, str3, util.h.xy.u.d.m27512(util.h.xy.s.ma.f2365, str2, util.h.xy.u.d.m27512(util.h.xy.s.ma.f2372, str, util.h.xy.u.d.m27512(util.h.xy.s.ma.f2376, str7, util.h.xy.u.d.m27506(result2, util.h.xy.s.ma.f2341))))))), result2);
                                                                    } catch (org.json.JSONException e2) {
                                                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                                                        getHighSpeedVideoFpsRangesFor(82 - android.text.TextUtils.getCapsMode("", 0, 0), 1012 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (60461 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr6);
                                                                        sb3.append(((java.lang.String) objArr6[0]).intern());
                                                                        sb3.append(e2.getMessage());
                                                                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb3.toString(), e2);
                                                                    }
                                                                }
                                                                try {
                                                                    util.h.xy.t.mb.f2417.m27470(str6.getBytes(util.h.xy.h.a.f2221), util.h.xy.u.d.m27507(util.h.xy.s.ma.f2350, new org.json.JSONObject(m27506), result2).getBytes(util.h.xy.h.a.f2221));
                                                                    if (result != null && str6.equals(result.m26180())) {
                                                                        if (getHighSpeedVideoSizes(result.m26180()).booleanValue()) {
                                                                            try {
                                                                                util.h.xy.f.b.f2201.m26771(str6, false);
                                                                                if (result.m26179() != null) {
                                                                                    util.h.xy.f.b.f2201.m26771(result.m26179(), true);
                                                                                }
                                                                            } catch (org.json.JSONException e3) {
                                                                                e3.getMessage();
                                                                                e3.printStackTrace();
                                                                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                                                getHighSpeedVideoFpsRangesFor(5 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1209, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                                                                                util.h.xy.am.ma.m25029(((java.lang.String) objArr7[0]).intern(), util.h.xy.al.rc.m25022(e3));
                                                                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                                                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                                                getHighSpeedVideoFpsRangesFor(46 - android.view.View.getDefaultSize(0, 0), 1213 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (42869 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr8);
                                                                                sb4.append(((java.lang.String) objArr8[0]).intern());
                                                                                sb4.append(e3.getMessage());
                                                                                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb4.toString(), e3);
                                                                            }
                                                                        } else {
                                                                            bool = java.lang.Boolean.TRUE;
                                                                        }
                                                                    }
                                                                } catch (org.json.JSONException e4) {
                                                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(73 - android.view.MotionEvent.axisFromString(""), 1135 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (51142 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), objArr9);
                                                                    sb5.append(((java.lang.String) objArr9[0]).intern());
                                                                    sb5.append(e4.getMessage());
                                                                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb5.toString(), e4);
                                                                }
                                                            } catch (java.lang.Throwable th) {
                                                                java.lang.Throwable cause = th.getCause();
                                                                if (cause == null) {
                                                                    throw th;
                                                                }
                                                                throw cause;
                                                            }
                                                        }
                                                    } catch (java.lang.Exception e5) {
                                                        e = e5;
                                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 922, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + org.apache.commons.imaging.formats.jpeg.JpegConstants.RST5_MARKER), objArr10);
                                                        util.h.xy.am.ma.m25029(((java.lang.String) objArr10[0]).intern(), util.h.xy.al.rc.m25022(e));
                                                        util.h.xy.au.md mdVar2 = util.h.xy.au.md.f866;
                                                        util.h.xy.au.me meVar2 = util.h.xy.au.me.f871;
                                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor(41 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 925 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (43475 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr22);
                                                        sb6.append(((java.lang.String) objArr22[0]).intern());
                                                        sb6.append(e.getMessage());
                                                        getHighSpeedVideoFpsRanges(bArr, mdVar2, meVar2, sb6.toString(), "");
                                                        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_STORAGE_ACCESS_ERROR;
                                                        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 41, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 877, (char) (43475 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr32);
                                                        sb22.append(((java.lang.String) objArr32[0]).intern());
                                                        sb22.append(e.getMessage());
                                                        new com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError(walletSecureEnrollmentErrorCodes2, 0, 0, sb22.toString(), null);
                                                        riVar.m25765();
                                                        getInputSizeshNQ4ISI = (getOutputFormats + 69) % 128;
                                                        return;
                                                    }
                                                }
                                                if (m25770.m25776() != null) {
                                                    try {
                                                        util.h.xy.k.ra.f2243.m26971(str6, m26922, m25770.m25776(), m25770.m25775());
                                                        aVar = this;
                                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e6) {
                                                        e6.getMessage();
                                                        java.lang.String digitalCardId = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalCardId(str6);
                                                        if (digitalCardId == null) {
                                                            digitalCardId = "";
                                                        }
                                                        getHighSpeedVideoFpsRanges(bArr, util.h.xy.au.md.f866, util.h.xy.au.me.f871, e6.getMessage(), digitalCardId);
                                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor(5 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1260 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (35268 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr11);
                                                        util.h.xy.am.ma.m25029(((java.lang.String) objArr11[0]).intern(), util.h.xy.al.rc.m25022(e6));
                                                        aVar = this;
                                                        aVar.getHighSpeedVideoSizes(new com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_LUK_REPLACEMENT_ERROR, 0, -2, e6.getMessage(), null), walletSecureEnrollmentListener);
                                                    }
                                                    if (str6.equals(m26922)) {
                                                        try {
                                                            if (getHighSpeedVideoSizes(m26922).booleanValue()) {
                                                                util.h.xy.f.b.f2201.m26777(str6, false);
                                                            } else {
                                                                bool = java.lang.Boolean.TRUE;
                                                            }
                                                        } catch (java.lang.Exception e7) {
                                                            e = e7;
                                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 922, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + org.apache.commons.imaging.formats.jpeg.JpegConstants.RST5_MARKER), objArr102);
                                                            util.h.xy.am.ma.m25029(((java.lang.String) objArr102[0]).intern(), util.h.xy.al.rc.m25022(e));
                                                            util.h.xy.au.md mdVar22 = util.h.xy.au.md.f866;
                                                            util.h.xy.au.me meVar22 = util.h.xy.au.me.f871;
                                                            java.lang.StringBuilder sb62 = new java.lang.StringBuilder();
                                                            java.lang.Object[] objArr222 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRangesFor(41 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 925 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (43475 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr222);
                                                            sb62.append(((java.lang.String) objArr222[0]).intern());
                                                            sb62.append(e.getMessage());
                                                            getHighSpeedVideoFpsRanges(bArr, mdVar22, meVar22, sb62.toString(), "");
                                                            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes22 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_STORAGE_ACCESS_ERROR;
                                                            java.lang.StringBuilder sb222 = new java.lang.StringBuilder();
                                                            java.lang.Object[] objArr322 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 41, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 877, (char) (43475 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr322);
                                                            sb222.append(((java.lang.String) objArr322[0]).intern());
                                                            sb222.append(e.getMessage());
                                                            new com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError(walletSecureEnrollmentErrorCodes22, 0, 0, sb222.toString(), null);
                                                            riVar.m25765();
                                                            getInputSizeshNQ4ISI = (getOutputFormats + 69) % 128;
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    aVar = this;
                                                }
                                                if (str6.equals(m26922) && bool.booleanValue()) {
                                                    util.h.xy.p.mb.f2292.m27043();
                                                }
                                                bool2 = bool;
                                            } else {
                                                aVar = aVar2;
                                                riVar = highSpeedVideoFpsRangesFor;
                                                list = list3;
                                                list2 = m25764;
                                                i2 = i6;
                                            }
                                            i6 = i2 + 1;
                                            aVar2 = aVar;
                                            list3 = list;
                                            m25764 = list2;
                                            highSpeedVideoFpsRangesFor = riVar;
                                            str5 = null;
                                        }
                                    }
                                } catch (java.lang.Exception e8) {
                                    e = e8;
                                    riVar = highSpeedVideoFpsRangesFor;
                                }
                            }
                            riVar = highSpeedVideoFpsRangesFor;
                            riVar.m25765();
                            getInputSizeshNQ4ISI = (getOutputFormats + 69) % 128;
                            return;
                        } catch (java.lang.Exception e9) {
                            e = e9;
                        }
                    } else {
                        util.h.xy.m.mb m269752 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
                        byte[] m257632 = highSpeedVideoFpsRangesFor.m25763();
                        highSpeedVideoFpsRangesFor.m25764();
                        m269752.mo26165(m257632);
                        try {
                            util.h.xy.k.mb.m26927();
                            throw null;
                        } catch (java.lang.Exception e10) {
                            e = e10;
                        }
                    }
                    util.h.xy.au.md mdVar3 = util.h.xy.au.md.f866;
                    util.h.xy.au.me meVar3 = util.h.xy.au.me.f871;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46, 923 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr12);
                    sb7.append(((java.lang.String) objArr12[0]).intern());
                    sb7.append(e.getMessage());
                    getHighSpeedVideoFpsRanges(bArr, mdVar3, meVar3, sb7.toString(), "");
                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_INTERNAL_ERROR;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(46 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 876, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr13);
                    sb8.append(((java.lang.String) objArr13[0]).intern());
                    sb8.append(e.getMessage());
                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes3, 0, 0, sb8.toString(), null);
                }
            }
            util.h.xy.bv.ri highSpeedVideoFpsRangesFor2 = aVar2.getHighSpeedVideoFpsRangesFor(bArr2, 0);
            int i42 = (getOutputFormats + 81) % 128;
            getInputSizeshNQ4ISI = i42;
            int i52 = (i42 + 103) % 128;
            getOutputFormats = i52;
            i = i52 + 101;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
            }
            util.h.xy.au.md mdVar32 = util.h.xy.au.md.f866;
            util.h.xy.au.me meVar32 = util.h.xy.au.me.f871;
            java.lang.StringBuilder sb72 = new java.lang.StringBuilder();
            java.lang.Object[] objArr122 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46, 923 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr122);
            sb72.append(((java.lang.String) objArr122[0]).intern());
            sb72.append(e.getMessage());
            getHighSpeedVideoFpsRanges(bArr, mdVar32, meVar32, sb72.toString(), "");
            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes32 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_INTERNAL_ERROR;
            java.lang.StringBuilder sb82 = new java.lang.StringBuilder();
            java.lang.Object[] objArr132 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(46 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 876, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr132);
            sb82.append(((java.lang.String) objArr132[0]).intern());
            sb82.append(e.getMessage());
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes32, 0, 0, sb82.toString(), null);
        } catch (com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException e11) {
            getHighSpeedVideoFpsRanges(bArr, util.h.xy.au.md.f866, util.h.xy.au.me.f871, e11.getErrorMessage(), "");
            aVar2.unwrapAs = bArr2;
            throw e11;
        }
        bArr2 = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0229 A[Catch: InternalComponentException -> 0x0406, InterruptedException -> 0x0449, TryCatch #5 {InternalComponentException -> 0x0406, InterruptedException -> 0x0449, blocks: (B:3:0x000c, B:5:0x0023, B:7:0x0029, B:9:0x0031, B:12:0x003c, B:15:0x0050, B:16:0x0057, B:17:0x008d, B:19:0x008e, B:21:0x0096, B:25:0x00bd, B:27:0x0101, B:29:0x010d, B:31:0x0113, B:32:0x011f, B:35:0x016d, B:37:0x0229, B:39:0x022d, B:41:0x0239, B:42:0x023a, B:43:0x023b, B:44:0x0241, B:45:0x026d, B:48:0x026f, B:50:0x0275, B:51:0x0276, B:53:0x011d, B:57:0x0278, B:59:0x027e, B:60:0x027f, B:61:0x0280, B:63:0x0292, B:64:0x029d, B:65:0x02a6, B:66:0x0299, B:80:0x02fa, B:81:0x0328, B:82:0x0329, B:84:0x0337, B:86:0x033f, B:88:0x0347, B:90:0x034f, B:92:0x0357, B:93:0x036f, B:94:0x0370, B:95:0x0389, B:96:0x038a, B:97:0x03a2, B:98:0x03a3, B:99:0x03bc, B:100:0x03bd, B:101:0x03d5, B:102:0x03d6, B:103:0x0405, B:23:0x00a2, B:34:0x014a), top: B:2:0x000c, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0241 A[Catch: InternalComponentException -> 0x0406, InterruptedException -> 0x0449, TryCatch #5 {InternalComponentException -> 0x0406, InterruptedException -> 0x0449, blocks: (B:3:0x000c, B:5:0x0023, B:7:0x0029, B:9:0x0031, B:12:0x003c, B:15:0x0050, B:16:0x0057, B:17:0x008d, B:19:0x008e, B:21:0x0096, B:25:0x00bd, B:27:0x0101, B:29:0x010d, B:31:0x0113, B:32:0x011f, B:35:0x016d, B:37:0x0229, B:39:0x022d, B:41:0x0239, B:42:0x023a, B:43:0x023b, B:44:0x0241, B:45:0x026d, B:48:0x026f, B:50:0x0275, B:51:0x0276, B:53:0x011d, B:57:0x0278, B:59:0x027e, B:60:0x027f, B:61:0x0280, B:63:0x0292, B:64:0x029d, B:65:0x02a6, B:66:0x0299, B:80:0x02fa, B:81:0x0328, B:82:0x0329, B:84:0x0337, B:86:0x033f, B:88:0x0347, B:90:0x034f, B:92:0x0357, B:93:0x036f, B:94:0x0370, B:95:0x0389, B:96:0x038a, B:97:0x03a2, B:98:0x03a3, B:99:0x03bc, B:100:0x03bd, B:101:0x03d5, B:102:0x03d6, B:103:0x0405, B:23:0x00a2, B:34:0x014a), top: B:2:0x000c, inners: #1, #4 }] */
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private util.h.xy.bv.ri getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        final java.util.concurrent.CountDownLatch countDownLatch;
        try {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> m25709 = new util.h.xy.bv.rj(this.getOutputMinFrameDurationlomOqCM.mo24566(), this.getOutputMinFrameDurationlomOqCM.mo24565()).m25709();
            if (m25709 == null || !m25709.isSuccessful()) {
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25922 = util.h.xy.cg.ra.m25922(m25709);
                getOutputFormats = (getInputSizeshNQ4ISI + 99) % 128;
                if (m25922 == null) {
                    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_COMM_ERROR;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, 1412 - android.graphics.Color.blue(0), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr);
                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes, 0, 0, ((java.lang.String) objArr[0]).intern(), null);
                }
                if (m25922.getSdkErrorCode() == com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_ERROR) {
                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_COMM_ERROR, m25922.getHttpStatusCode(), m25922.getCpsErrorCode(), m25922.getErrorMessage(), m25922.getStatusAdditionalInfo());
                }
                if (m25922.getSdkErrorCode() == com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_NO_INTERNET) {
                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_NO_INTERNET, m25922.getHttpStatusCode(), m25922.getCpsErrorCode(), m25922.getErrorMessage(), m25922.getStatusAdditionalInfo());
                }
                if (m25922.getSdkErrorCode() == com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.RE_ENROLLMENT_REQUIRED) {
                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.RE_ENROLLMENT_REQUIRED, m25922.getHttpStatusCode(), m25922.getCpsErrorCode(), m25922.getErrorMessage(), m25922.getStatusAdditionalInfo());
                }
                if (m25922.getSdkErrorCode() == com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ASM_ERROR) {
                    throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_ASM_ERROR, m25922.getHttpStatusCode(), m25922.getCpsErrorCode(), m25922.getErrorMessage(), m25922.getStatusAdditionalInfo());
                }
                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_COMM_ERROR, m25922.getHttpStatusCode(), m25922.getCpsErrorCode(), m25922.getErrorMessage(), m25922.getStatusAdditionalInfo());
            }
            util.h.xy.bv.ri riVar = (util.h.xy.bv.ri) m25709.getResult();
            if (riVar == null) {
                com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(20 - android.view.View.MeasureSpec.getSize(0), android.view.View.getDefaultSize(0, 0) + 674, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13512), objArr2);
                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes2, 0, 0, ((java.lang.String) objArr2[0]).intern(), null);
            }
            if (riVar.m25745() == util.h.xy.bv.rb.ra.f1061) {
                riVar.m25751();
                riVar.m25749();
                riVar.m25742();
                if (riVar.m25749() == 671) {
                    if (i >= 3) {
                        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(26 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.getOffsetAfter("", 0) + 694, (char) (35419 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr3);
                        throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes3, 0, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.MIGRATION_SYSTEM_ERROR, ((java.lang.String) objArr3[0]).intern(), null);
                    }
                    riVar = getHighSpeedVideoFpsRangesFor(bArr, i + 1);
                } else {
                    if (riVar.m25749() != 605) {
                        throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR, riVar.m25751(), riVar.m25749(), riVar.m25742() == null ? com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_SERVER_ERROR.toString() : riVar.m25742(), riVar.m25750());
                    }
                    java.util.Map<java.lang.String, java.lang.String> m25750 = riVar.m25750();
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(14 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 87, (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 53059), objArr4);
                        java.lang.String str = m25750.get(((java.lang.String) objArr4[0]).intern());
                        getOutputFormats = (getInputSizeshNQ4ISI + 3) % 128;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51, (char) android.text.TextUtils.indexOf("", "", 0), objArr5);
                        java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
                        try {
                            if (str != null) {
                                int i2 = getInputSizeshNQ4ISI + 113;
                                getOutputFormats = i2 % 128;
                                if (i2 % 2 != 0) {
                                    throw null;
                                }
                                if (!str.equalsIgnoreCase("")) {
                                    getOutputFormats = (getInputSizeshNQ4ISI + 45) % 128;
                                    android.os.Bundle bundle = new android.os.Bundle();
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 6, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 53, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27997), objArr6);
                                    java.lang.String intern2 = ((java.lang.String) objArr6[0]).intern();
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 3, android.view.View.combineMeasuredStates(0, 0) + 59, (char) (19627 - android.view.KeyEvent.normalizeMetaState(0)), objArr7);
                                    bundle.putString(intern2, ((java.lang.String) objArr7[0]).intern());
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(6 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 61, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
                                    java.lang.String intern3 = ((java.lang.String) objArr8[0]).intern();
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(18 - android.view.View.MeasureSpec.getMode(0), 68 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (45084 - android.view.View.MeasureSpec.getSize(0)), objArr9);
                                    bundle.putString(intern3, ((java.lang.String) objArr9[0]).intern());
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 14, 85 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 53060), objArr10);
                                    bundle.putString(((java.lang.String) objArr10[0]).intern(), str);
                                    util.h.xy.ca.b bVar = (util.h.xy.ca.b) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
                                    countDownLatch = new java.util.concurrent.CountDownLatch(1);
                                    final com.gemalto.mfs.mwsdk.exception.InternalComponentException[] internalComponentExceptionArr = {null};
                                    bVar.processIncomingMessage(bundle, new com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener() { // from class: util.h.xy.ca.a.1
                                        private static int Camera2StreamConfigurationMap = 0;
                                        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                        private static int getHighSpeedVideoSizesFor = 0;
                                        private static int[] getInputFormats = {578578912, -1623449048, 1458146027, -186973485, -782421535, -574589683, 356324622, -633784290, -848520954, 2093253678, 1251000388, 588976977, -119021108, -995880445, -1779476185, 1470176827, 335915006, -1573055353};
                                        private static int getOutputFormats = 1;

                                        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                                        public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
                                            util.h.xy.ca.a.getHighSpeedVideoSizes();
                                            provisioningServiceError.getHttpStatusCode();
                                            provisioningServiceError.getSdkErrorCode();
                                            provisioningServiceError.getCpsErrorCode();
                                            provisioningServiceError.getErrorMessage();
                                            internalComponentExceptionArr[0] = new com.gemalto.mfs.mwsdk.exception.InternalComponentException(provisioningServiceError.getErrorMessage(), provisioningServiceError.getCausingException());
                                            countDownLatch.countDown();
                                            int i3 = getHighSpeedVideoSizesFor + 25;
                                            getOutputFormats = i3 % 128;
                                            if (i3 % 2 == 0) {
                                                throw new java.lang.ArithmeticException();
                                            }
                                        }

                                        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                                        public final void onUnsupportedPushContent(android.os.Bundle bundle2) {
                                            int i3;
                                            long j;
                                            util.h.xy.ca.a.getHighSpeedVideoSizes();
                                            com.gemalto.mfs.mwsdk.exception.InternalComponentException[] internalComponentExceptionArr2 = internalComponentExceptionArr;
                                            int[] iArr = {-1733966426, -1049240781, 169347681, 1278679825, -62111, 562903969, -872437862, -482261049, 269849569, 81974378, -528629459, 214743161, -1371203810, 1401248966, 1621617301, -658688618};
                                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                                            int green = android.graphics.Color.green(0) + 32;
                                            util.h.xz.b.c cVar = new util.h.xz.b.c();
                                            char[] cArr = new char[4];
                                            char[] cArr2 = new char[32];
                                            int[] iArr2 = getInputFormats;
                                            if (iArr2 != null) {
                                                int length = iArr2.length;
                                                int[] iArr3 = new int[length];
                                                int i4 = 0;
                                                while (i4 < length) {
                                                    iArr3[i4] = (int) (iArr2[i4] ^ (-5569649899877129369L));
                                                    i4++;
                                                    green = green;
                                                }
                                                i3 = green;
                                                iArr2 = iArr3;
                                            } else {
                                                i3 = green;
                                            }
                                            int length2 = iArr2.length;
                                            int[] iArr4 = new int[length2];
                                            int[] iArr5 = getInputFormats;
                                            if (iArr5 != null) {
                                                int length3 = iArr5.length;
                                                int[] iArr6 = new int[length3];
                                                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
                                                int i5 = 0;
                                                while (i5 < length3) {
                                                    int i6 = Camera2StreamConfigurationMap + 39;
                                                    getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                                                    if (i6 % 2 == 0) {
                                                        j = -5569649899877129369L;
                                                        iArr6[i5] = (int) (iArr5[i5] & (-5569649899877129369L));
                                                        i5 >>= 1;
                                                    } else {
                                                        j = -5569649899877129369L;
                                                        iArr6[i5] = (int) (iArr5[i5] ^ (-5569649899877129369L));
                                                        i5++;
                                                    }
                                                }
                                                iArr5 = iArr6;
                                            }
                                            char c = 0;
                                            java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                                            cVar.f2626 = 0;
                                            while (true) {
                                                if (cVar.f2626 < 16) {
                                                    cArr[c] = (char) (iArr[cVar.f2626] >> 16);
                                                    cArr[1] = (char) iArr[cVar.f2626];
                                                    cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                                                    cArr[3] = (char) iArr[cVar.f2626 + 1];
                                                    cVar.f2627 = (cArr[0] << 16) + cArr[1];
                                                    cVar.f2625 = (cArr[2] << 16) + cArr[3];
                                                    util.h.xz.b.c.m27723(iArr4);
                                                    int i7 = 0;
                                                    for (int i8 = 16; i7 < i8; i8 = 16) {
                                                        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
                                                        cVar.f2627 ^= iArr4[i7];
                                                        cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                                                        int i9 = cVar.f2627;
                                                        cVar.f2627 = cVar.f2625;
                                                        cVar.f2625 = i9;
                                                        i7++;
                                                    }
                                                    int i10 = cVar.f2627;
                                                    cVar.f2627 = cVar.f2625;
                                                    cVar.f2625 = i10;
                                                    cVar.f2625 ^= iArr4[16];
                                                    cVar.f2627 ^= iArr4[17];
                                                    int i11 = cVar.f2627;
                                                    int i12 = cVar.f2625;
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
                                                    c = 0;
                                                } else {
                                                    objArr11[0] = new java.lang.String(cArr2, 0, i3);
                                                    internalComponentExceptionArr2[0] = new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr11[0]).intern());
                                                    countDownLatch.countDown();
                                                    getHighSpeedVideoSizesFor = (getOutputFormats + 63) % 128;
                                                    return;
                                                }
                                            }
                                        }

                                        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                                        public final void onServerMessage(java.lang.String str2, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage) {
                                            int i3 = getOutputFormats + 35;
                                            getHighSpeedVideoSizesFor = i3 % 128;
                                            if (i3 % 2 == 0) {
                                                util.h.xy.ca.a.getHighSpeedVideoSizes();
                                                provisioningServiceMessage.getMsgCode();
                                                provisioningServiceMessage.getMsgText();
                                                getOutputFormats = (getHighSpeedVideoSizesFor + 125) % 128;
                                                return;
                                            }
                                            util.h.xy.ca.a.getHighSpeedVideoSizes();
                                            provisioningServiceMessage.getMsgCode();
                                            provisioningServiceMessage.getMsgText();
                                            throw null;
                                        }

                                        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                                        public final void onComplete() {
                                            getOutputFormats = (getHighSpeedVideoSizesFor + 31) % 128;
                                            util.h.xy.ca.a.getHighSpeedVideoSizes();
                                            countDownLatch.countDown();
                                            int i3 = getHighSpeedVideoSizesFor + 23;
                                            getOutputFormats = i3 % 128;
                                            if (i3 % 2 == 0) {
                                                throw null;
                                            }
                                        }
                                    });
                                    if (countDownLatch.await(120L, java.util.concurrent.TimeUnit.SECONDS)) {
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29, 100 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (46927 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr11);
                                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr11[0]).intern());
                                    }
                                    com.gemalto.mfs.mwsdk.exception.InternalComponentException internalComponentException = internalComponentExceptionArr[0];
                                    if (internalComponentException != null) {
                                        int i3 = getOutputFormats + 105;
                                        getInputSizeshNQ4ISI = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            throw internalComponentException;
                                        }
                                        throw internalComponentException;
                                    }
                                    riVar = getHighSpeedVideoFpsRangesFor(bArr, i + 1);
                                }
                            }
                            java.lang.Object[] objArr72 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 3, android.view.View.combineMeasuredStates(0, 0) + 59, (char) (19627 - android.view.KeyEvent.normalizeMetaState(0)), objArr72);
                            bundle.putString(intern2, ((java.lang.String) objArr72[0]).intern());
                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(6 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 61, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr82);
                            java.lang.String intern32 = ((java.lang.String) objArr82[0]).intern();
                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(18 - android.view.View.MeasureSpec.getMode(0), 68 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (45084 - android.view.View.MeasureSpec.getSize(0)), objArr92);
                            bundle.putString(intern32, ((java.lang.String) objArr92[0]).intern());
                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 14, 85 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 53060), objArr102);
                            bundle.putString(((java.lang.String) objArr102[0]).intern(), str);
                            util.h.xy.ca.b bVar2 = (util.h.xy.ca.b) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
                            countDownLatch = new java.util.concurrent.CountDownLatch(1);
                            final com.gemalto.mfs.mwsdk.exception.InternalComponentException[] internalComponentExceptionArr2 = {null};
                            bVar2.processIncomingMessage(bundle, new com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener() { // from class: util.h.xy.ca.a.1
                                private static int Camera2StreamConfigurationMap = 0;
                                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                private static int getHighSpeedVideoSizesFor = 0;
                                private static int[] getInputFormats = {578578912, -1623449048, 1458146027, -186973485, -782421535, -574589683, 356324622, -633784290, -848520954, 2093253678, 1251000388, 588976977, -119021108, -995880445, -1779476185, 1470176827, 335915006, -1573055353};
                                private static int getOutputFormats = 1;

                                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                                public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
                                    util.h.xy.ca.a.getHighSpeedVideoSizes();
                                    provisioningServiceError.getHttpStatusCode();
                                    provisioningServiceError.getSdkErrorCode();
                                    provisioningServiceError.getCpsErrorCode();
                                    provisioningServiceError.getErrorMessage();
                                    internalComponentExceptionArr2[0] = new com.gemalto.mfs.mwsdk.exception.InternalComponentException(provisioningServiceError.getErrorMessage(), provisioningServiceError.getCausingException());
                                    countDownLatch.countDown();
                                    int i32 = getHighSpeedVideoSizesFor + 25;
                                    getOutputFormats = i32 % 128;
                                    if (i32 % 2 == 0) {
                                        throw new java.lang.ArithmeticException();
                                    }
                                }

                                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                                public final void onUnsupportedPushContent(android.os.Bundle bundle2) {
                                    int i32;
                                    long j;
                                    util.h.xy.ca.a.getHighSpeedVideoSizes();
                                    com.gemalto.mfs.mwsdk.exception.InternalComponentException[] internalComponentExceptionArr22 = internalComponentExceptionArr2;
                                    int[] iArr = {-1733966426, -1049240781, 169347681, 1278679825, -62111, 562903969, -872437862, -482261049, 269849569, 81974378, -528629459, 214743161, -1371203810, 1401248966, 1621617301, -658688618};
                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                    int green = android.graphics.Color.green(0) + 32;
                                    util.h.xz.b.c cVar = new util.h.xz.b.c();
                                    char[] cArr = new char[4];
                                    char[] cArr2 = new char[32];
                                    int[] iArr2 = getInputFormats;
                                    if (iArr2 != null) {
                                        int length = iArr2.length;
                                        int[] iArr3 = new int[length];
                                        int i4 = 0;
                                        while (i4 < length) {
                                            iArr3[i4] = (int) (iArr2[i4] ^ (-5569649899877129369L));
                                            i4++;
                                            green = green;
                                        }
                                        i32 = green;
                                        iArr2 = iArr3;
                                    } else {
                                        i32 = green;
                                    }
                                    int length2 = iArr2.length;
                                    int[] iArr4 = new int[length2];
                                    int[] iArr5 = getInputFormats;
                                    if (iArr5 != null) {
                                        int length3 = iArr5.length;
                                        int[] iArr6 = new int[length3];
                                        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
                                        int i5 = 0;
                                        while (i5 < length3) {
                                            int i6 = Camera2StreamConfigurationMap + 39;
                                            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                                            if (i6 % 2 == 0) {
                                                j = -5569649899877129369L;
                                                iArr6[i5] = (int) (iArr5[i5] & (-5569649899877129369L));
                                                i5 >>= 1;
                                            } else {
                                                j = -5569649899877129369L;
                                                iArr6[i5] = (int) (iArr5[i5] ^ (-5569649899877129369L));
                                                i5++;
                                            }
                                        }
                                        iArr5 = iArr6;
                                    }
                                    char c = 0;
                                    java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                                    cVar.f2626 = 0;
                                    while (true) {
                                        if (cVar.f2626 < 16) {
                                            cArr[c] = (char) (iArr[cVar.f2626] >> 16);
                                            cArr[1] = (char) iArr[cVar.f2626];
                                            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                                            cArr[3] = (char) iArr[cVar.f2626 + 1];
                                            cVar.f2627 = (cArr[0] << 16) + cArr[1];
                                            cVar.f2625 = (cArr[2] << 16) + cArr[3];
                                            util.h.xz.b.c.m27723(iArr4);
                                            int i7 = 0;
                                            for (int i8 = 16; i7 < i8; i8 = 16) {
                                                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
                                                cVar.f2627 ^= iArr4[i7];
                                                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                                                int i9 = cVar.f2627;
                                                cVar.f2627 = cVar.f2625;
                                                cVar.f2625 = i9;
                                                i7++;
                                            }
                                            int i10 = cVar.f2627;
                                            cVar.f2627 = cVar.f2625;
                                            cVar.f2625 = i10;
                                            cVar.f2625 ^= iArr4[16];
                                            cVar.f2627 ^= iArr4[17];
                                            int i11 = cVar.f2627;
                                            int i12 = cVar.f2625;
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
                                            c = 0;
                                        } else {
                                            objArr112[0] = new java.lang.String(cArr2, 0, i32);
                                            internalComponentExceptionArr22[0] = new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr112[0]).intern());
                                            countDownLatch.countDown();
                                            getHighSpeedVideoSizesFor = (getOutputFormats + 63) % 128;
                                            return;
                                        }
                                    }
                                }

                                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                                public final void onServerMessage(java.lang.String str2, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage) {
                                    int i32 = getOutputFormats + 35;
                                    getHighSpeedVideoSizesFor = i32 % 128;
                                    if (i32 % 2 == 0) {
                                        util.h.xy.ca.a.getHighSpeedVideoSizes();
                                        provisioningServiceMessage.getMsgCode();
                                        provisioningServiceMessage.getMsgText();
                                        getOutputFormats = (getHighSpeedVideoSizesFor + 125) % 128;
                                        return;
                                    }
                                    util.h.xy.ca.a.getHighSpeedVideoSizes();
                                    provisioningServiceMessage.getMsgCode();
                                    provisioningServiceMessage.getMsgText();
                                    throw null;
                                }

                                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                                public final void onComplete() {
                                    getOutputFormats = (getHighSpeedVideoSizesFor + 31) % 128;
                                    util.h.xy.ca.a.getHighSpeedVideoSizes();
                                    countDownLatch.countDown();
                                    int i32 = getHighSpeedVideoSizesFor + 23;
                                    getOutputFormats = i32 % 128;
                                    if (i32 % 2 == 0) {
                                        throw null;
                                    }
                                }
                            });
                            if (countDownLatch.await(120L, java.util.concurrent.TimeUnit.SECONDS)) {
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                        str = intern;
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 6, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 53, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27997), objArr62);
                        java.lang.String intern22 = ((java.lang.String) objArr62[0]).intern();
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            if (riVar != null) {
                return riVar;
            }
            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes4 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_COMM_ERROR;
            try {
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(44 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), 831 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.View.combineMeasuredStates(0, 0) + 35865), objArr12);
                throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes4, 0, 0, ((java.lang.String) objArr12[0]).intern(), null);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes5 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.WSE_STORAGE_ACCESS_ERROR;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getCapsMode("", 0, 0) + 49, 782 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16908), objArr13);
            sb.append(((java.lang.String) objArr13[0]).intern());
            sb.append(e.getMessage());
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes5, 0, 0, sb.toString(), null);
        } catch (java.lang.InterruptedException e2) {
            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes6 = com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.COMMON_COMM_ERROR;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.keyCodeFromString("") + 62, 720 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr14);
            sb2.append(((java.lang.String) objArr14[0]).intern());
            sb2.append(e2.getMessage());
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(walletSecureEnrollmentErrorCodes6, 0, 0, sb2.toString(), null);
        }
    }

    private static void Camera2StreamConfigurationMap(byte[] bArr, int i, java.lang.String str) {
        int i2 = getInputSizeshNQ4ISI + 31;
        getOutputFormats = i2 % 128;
        try {
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            int defaultSize = android.view.View.getDefaultSize(0, 0);
            int blue = android.graphics.Color.blue(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(5 - defaultSize, 966 - blue, (char) (39273 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.al.rc.m25022(e));
            e.getMessage();
        }
        if (i2 % 2 == 0) {
            util.h.xy.az.ra m25187 = util.h.xy.au.mf.m25169().m25187(bArr, i, str);
            if (!util.h.xy.az.ra.m25277(util.h.xy.au.g.m25127().m25142(m25187))) {
                util.h.xy.au.g.m25127().m25134(m25187);
            }
            getInputSizeshNQ4ISI = (getOutputFormats + 117) % 128;
            return;
        }
        util.h.xy.az.ra.m25277(util.h.xy.au.g.m25127().m25142(util.h.xy.au.mf.m25169().m25187(bArr, i, str)));
        throw new java.lang.NullPointerException();
    }

    private static void getHighSpeedVideoFpsRanges(byte[] bArr, util.h.xy.au.md mdVar, util.h.xy.au.me meVar, java.lang.String str, java.lang.String str2) {
        try {
            util.h.xy.az.ra m25182 = util.h.xy.au.mf.m25169().m25182(bArr, str2, mdVar, meVar, str);
            if (!util.h.xy.az.ra.m25277(util.h.xy.au.g.m25127().m25142(m25182))) {
                util.h.xy.au.g.m25127().m25134(m25182);
                getOutputFormats = (getInputSizeshNQ4ISI + 7) % 128;
            }
            getOutputFormats = (getInputSizeshNQ4ISI + 61) % 128;
        } catch (java.lang.Exception e) {
            int argb = android.graphics.Color.argb(0, 0, 0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(argb + 4, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 971, (char) android.view.View.MeasureSpec.getMode(0), objArr);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.al.rc.m25022(e));
            e.printStackTrace();
            e.getMessage();
        }
    }

    private static void getInputFormats() {
        int i = getOutputFormats + 103;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            util.h.xy.y.mb.m27701(util.h.xy.ag.a.m24556().m24558());
            util.h.xy.t.mb.f2417.m27478();
            util.h.xy.t.mb.f2417.m27409();
            getOutputFormats = (getInputSizeshNQ4ISI + 11) % 128;
            return;
        }
        util.h.xy.y.mb.m27701(util.h.xy.ag.a.m24556().m24558());
        util.h.xy.t.mb.f2417.m27478();
        util.h.xy.t.mb.f2417.m27409();
        throw null;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getInputSizeshNQ4ISI + 107;
        getOutputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                boolean m25806 = util.h.xy.by.ma.f1067.m25806();
                int i2 = getOutputFormats + 29;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    return m25806;
                }
                throw null;
            }
            util.h.xy.by.ma.f1067.m25806();
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception e) {
            e.getLocalizedMessage();
            return true;
        }
    }

    private static boolean getOutputMinFrameDuration() {
        getOutputFormats = (getInputSizeshNQ4ISI + 101) % 128;
        try {
            java.lang.String[] m26919 = util.h.xy.k.b.m26919();
            if (m26919 != null) {
                int i = getOutputFormats + 15;
                int i2 = i % 128;
                getInputSizeshNQ4ISI = i2;
                if (i % 2 == 0) {
                    int length = m26919.length;
                    throw new java.lang.NullPointerException();
                }
                int length2 = m26919.length;
                getOutputFormats = (i2 + 83) % 128;
            }
            return m26919 != null && m26919.length > 0;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    private static util.h.xy.au.c getHighResolutionOutputSizeshNQ4ISI(android.content.pm.Signature[] signatureArr, java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, java.security.cert.CertificateException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(4 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1265, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25877), objArr);
        try {
            java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(127 - android.view.View.getDefaultSize(0, 0), "\u0099\u0084\u0085\u0089\u0088\u0081\u009a\u008a\u0089\u0081\u0088\u0086\u0094\u0086\u0089\u0084\u008a\u008b\u0087\u0089\u0084\u008a\u0088\u0087\u0099\u0089\u0086\u0084\u0098\u0088\u008a\u0097\u0087\u0081\u0096\u0081\u0095", objArr3);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("裱ݰ韤♖뛴䕪헰摢\uf4e0荮Ꮽ", 36739 - android.view.KeyEvent.normalizeMetaState(0), objArr4);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
            for (android.content.pm.Signature signature : signatureArr) {
                java.lang.Object[] objArr5 = {new java.io.ByteArrayInputStream(signature.toByteArray())};
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 128, "\u0099\u0084\u0085\u0089\u0088\u0081\u009a\u008a\u0089\u0081\u0088\u0086\u0094\u0086\u0089\u0084\u008a\u008b\u0087\u0089\u0084\u008a\u0088\u0087\u0099\u0089\u0086\u0084\u0098\u0088\u008a\u0097\u0087\u0081\u0096\u0081\u0095", objArr6);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("裱\uddf4⋶矦\udcf8⇔盈\udbc2⃭痌\udaa2⾯璫\ud9ab⺝玜\ud887ⶕ犍", 21767 - android.graphics.Color.alpha(0), objArr7);
                java.lang.Object invoke2 = cls2.getMethod((java.lang.String) objArr7[0], java.io.InputStream.class).invoke(invoke, objArr5);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoSizes(127 - android.text.TextUtils.getOffsetAfter("", 0), "\u008a\u0089\u0081\u0088\u0086\u0094\u0086\u0089\u0084\u008a\u008b\u009e\u009d\u009c\u009b\u0087\u0089\u0084\u008a\u0088\u0087\u0099\u0089\u0086\u0084\u0098\u0088\u008a\u0097\u0087\u0081\u0096\u0081\u0095", objArr8);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoSizes(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0099\u008a¡\u0088\u0086 \u009f\u0098\u008e\u0089\u008a\u008d", objArr9);
                java.lang.Object invoke3 = cls3.getMethod((java.lang.String) objArr9[0], null).invoke(invoke2, null);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("裼ᖢ뉊弈\ufdec驌✍얦手༙궭䩅휓痩በ뼘嶤著蜅►쉹漊ඡ", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 40277, objArr10);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("裱㐢\uf140뺠箼㣠\ue41fꅅ湻⮫", 48337 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr11);
                byte[] m27627 = util.h.xy.v.b.f2439.m27627(util.h.xy.ar.b.m25090(getHighResolutionOutputSizeshNQ4ISI((byte[]) cls4.getMethod((java.lang.String) objArr11[0], null).invoke(invoke3, null)), util.h.xy.cv.ma.m26065(str)));
                if (m27627 != null) {
                    int i = (getInputSizeshNQ4ISI + 77) % 128;
                    getOutputFormats = i;
                    if (m27627.length == 32) {
                        int i2 = i + 79;
                        getInputSizeshNQ4ISI = i2 % 128;
                        if (i2 % 2 == 0) {
                            arrayList.add(m27627);
                            throw null;
                        }
                        arrayList.add(m27627);
                    }
                }
                return null;
            }
            return new util.h.xy.au.c((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private java.lang.String getInputSizeshNQ4ISI() {
        getInputSizeshNQ4ISI = (getOutputFormats + 17) % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        getInputSizeshNQ4ISI = (getOutputFormats + 3) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.getTrimmedLength("") + 127, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0084\u008a\u008d\u0081\u0082\u0081\u0090\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0089\u008a\u008d", objArr2);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr2[0], null).invoke(m24558, null);
            if (android.os.Build.VERSION.SDK_INT < 28) {
                try {
                    java.lang.Object[] objArr3 = {util.h.xy.ag.a.m24556().m24558().getPackageName(), 64};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(126 - android.view.MotionEvent.axisFromString(""), "\u0084\u008a\u008d\u0081\u0082\u0081\u0090\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0087\u0092\u0091\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0085\u0094\u0082\u0093\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0089\u008a\u008d", objArr5);
                    return getHighSpeedVideoSizes(new android.content.pm.Signature[]{((android.content.pm.PackageInfo) cls2.getMethod((java.lang.String) objArr5[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr3)).signatures[0]});
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                java.lang.Object[] objArr6 = {util.h.xy.ag.a.m24556().m24558().getPackageName(), java.lang.Integer.valueOf(androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE)};
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 127, "\u0084\u008a\u008d\u0081\u0082\u0081\u0090\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0087\u0092\u0091\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u0085\u0094\u0082\u0093\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0089\u008a\u008d", objArr8);
                android.content.pm.SigningInfo signingInfo = ((android.content.pm.PackageInfo) cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr6)).signingInfo;
                if (!signingInfo.hasMultipleSigners()) {
                    android.content.pm.Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    if (signingCertificateHistory.length > 0) {
                        int i = getOutputFormats + 121;
                        getInputSizeshNQ4ISI = i % 128;
                        if (i % 2 != 0) {
                            util.h.xy.ar.b.m25074(signingCertificateHistory[0].toByteArray());
                            return getHighSpeedVideoSizes(signingCertificateHistory);
                        }
                        util.h.xy.ar.b.m25074(signingCertificateHistory[0].toByteArray());
                        getHighSpeedVideoSizes(signingCertificateHistory);
                        throw new java.lang.NullPointerException();
                    }
                    return "";
                }
                android.content.pm.Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, 1266 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 25878), objArr9);
                try {
                    java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.view.View.MeasureSpec.getSize(0) + 127, "\u0099\u0084\u0085\u0089\u0088\u0081\u009a\u008a\u0089\u0081\u0088\u0086\u0094\u0086\u0089\u0084\u008a\u008b\u0087\u0089\u0084\u008a\u0088\u0087\u0099\u0089\u0086\u0084\u0098\u0088\u008a\u0097\u0087\u0081\u0096\u0081\u0095", objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("裱ݰ韤♖뛴䕪헰摢\uf4e0荮Ꮽ", android.graphics.Color.argb(0, 0, 0, 0) + 36739, objArr12);
                    cls4.getMethod((java.lang.String) objArr12[0], java.lang.String.class).invoke(null, objArr10);
                    return getHighSpeedVideoSizes(apkContentsSigners);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            return "";
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(android.content.pm.Signature[] signatureArr) throws java.security.cert.CertificateException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(6 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1264 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (25877 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr);
        try {
            java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0099\u0084\u0085\u0089\u0088\u0081\u009a\u008a\u0089\u0081\u0088\u0086\u0094\u0086\u0089\u0084\u008a\u008b\u0087\u0089\u0084\u008a\u0088\u0087\u0099\u0089\u0086\u0084\u0098\u0088\u008a\u0097\u0087\u0081\u0096\u0081\u0095", objArr3);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("裱ݰ韤♖뛴䕪헰摢\uf4e0荮Ꮽ", 36740 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
            for (android.content.pm.Signature signature : signatureArr) {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(signature.toByteArray());
                getOutputFormats = (getInputSizeshNQ4ISI + 103) % 128;
                java.lang.Object[] objArr5 = {byteArrayInputStream};
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "\u0099\u0084\u0085\u0089\u0088\u0081\u009a\u008a\u0089\u0081\u0088\u0086\u0094\u0086\u0089\u0084\u008a\u008b\u0087\u0089\u0084\u008a\u0088\u0087\u0099\u0089\u0086\u0084\u0098\u0088\u008a\u0097\u0087\u0081\u0096\u0081\u0095", objArr6);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("裱\uddf4⋶矦\udcf8⇔盈\udbc2⃭痌\udaa2⾯璫\ud9ab⺝玜\ud887ⶕ犍", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21766, objArr7);
                java.lang.Object invoke2 = cls2.getMethod((java.lang.String) objArr7[0], java.io.InputStream.class).invoke(invoke, objArr5);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoSizes(127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u008a\u0089\u0081\u0088\u0086\u0094\u0086\u0089\u0084\u008a\u008b\u009e\u009d\u009c\u009b\u0087\u0089\u0084\u008a\u0088\u0087\u0099\u0089\u0086\u0084\u0098\u0088\u008a\u0097\u0087\u0081\u0096\u0081\u0095", objArr8);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u0099\u008a¡\u0088\u0086 \u009f\u0098\u008e\u0089\u008a\u008d", objArr9);
                java.lang.Object invoke3 = cls3.getMethod((java.lang.String) objArr9[0], null).invoke(invoke2, null);
                getOutputFormats = (getInputSizeshNQ4ISI + 69) % 128;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("裼ᖢ뉊弈\ufdec驌✍얦手༙궭䩅휓痩በ뼘嶤著蜅►쉹漊ඡ", 40277 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr10);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("裱㐢\uf140뺠箼㣠\ue41fꅅ湻⮫", 48336 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr11);
                sb.append(util.h.xy.ar.b.m25074(java.util.Arrays.copyOfRange(getHighResolutionOutputSizeshNQ4ISI((byte[]) cls4.getMethod((java.lang.String) objArr11[0], null).invoke(invoke3, null)), 0, 10)));
            }
            java.lang.String obj = sb.toString();
            getInputSizeshNQ4ISI = (getOutputFormats + 93) % 128;
            return obj;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static java.lang.Boolean getHighSpeedVideoSizes(java.lang.String str) {
        getOutputFormats = (getInputSizeshNQ4ISI + 99) % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> m25926 = util.h.xy.cg.ra.m25926(str);
        if (m25926.isSuccessful()) {
            int i = getInputSizeshNQ4ISI + 119;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                m25926.getResult().getState();
                com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE;
                throw null;
            }
            if (m25926.getResult().getState() == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
                getOutputFormats = (getInputSizeshNQ4ISI + 107) % 128;
                return java.lang.Boolean.TRUE;
            }
        }
        return java.lang.Boolean.FALSE;
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        util.h.xy.eh.mc mcVar = new util.h.xy.eh.mc();
        mcVar.mo26562(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[mcVar.mo26565()];
        mcVar.mo26563(bArr2, 0);
        getOutputFormats = (getInputSizeshNQ4ISI + 97) % 128;
        return bArr2;
    }

    private void getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError walletSecureEnrollmentError, final com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener walletSecureEnrollmentListener) {
        this.toString = null;
        walletSecureEnrollmentError.getHttpStatusCode();
        walletSecureEnrollmentError.getSdkErrorCode();
        walletSecureEnrollmentError.getCpsErrorCode();
        walletSecureEnrollmentError.getErrorMessage();
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.a.6
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizesFor = -408872993;
            private static int getInputFormats = 1328228126;
            private static byte[] getInputSizeshNQ4ISI = {34, 33, -36, 46, -7, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 45, -40, -6, 3, -55, 37, 42, 36, -40, -40};
            private static short[] getOutputFormats = null;
            private static int getOutputMinFrameDuration = 1;
            private static int getOutputSizes = 0;
            private static int getOutputStallDuration = -1494767776;

            private static void Camera2StreamConfigurationMap(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
                int i4;
                util.h.xz.b.me meVar = new util.h.xz.b.me();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i5 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
                if (i5 == -1) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 57) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr = getInputSizeshNQ4ISI;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                        }
                        bArr = bArr2;
                    }
                    i5 = bArr != null ? (byte) (((byte) (getInputSizeshNQ4ISI[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)))) : (short) (((short) (getOutputFormats[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
                }
                if (i5 > 0) {
                    meVar.f2647 = ((i + i5) - 2) + ((int) (getInputFormats ^ (-2689713159175858216L))) + i4;
                    meVar.f2644 = (char) (i3 + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    byte[] bArr3 = getInputSizeshNQ4ISI;
                    if (bArr3 != null) {
                        int length2 = bArr3.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i7 = 0; i7 < length2; i7++) {
                            bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                        }
                        bArr3 = bArr4;
                    }
                    boolean z = bArr3 != null;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i5) {
                        if (z) {
                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
                            byte[] bArr5 = getInputSizeshNQ4ISI;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
                        } else {
                            short[] sArr = getOutputFormats;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        }
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        meVar.f2645++;
                    }
                }
                java.lang.String obj = sb.toString();
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 49;
                getHighSpeedVideoFpsRangesFor = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                objArr[0] = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = getOutputSizes;
                int i2 = i + 93;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 != 0) {
                    if (walletSecureEnrollmentListener != null) {
                        getOutputMinFrameDuration = (i + 9) % 128;
                        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                        short tapTimeout = (short) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                        getOutputSizes = (getOutputMinFrameDuration + 11) % 128;
                        try {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(1467338554 - (pressedStateDuration >> 16), tapTimeout, (byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 3, (-1095151724) - android.view.KeyEvent.keyCodeFromString(""), objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(1467338557 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (short) android.view.View.resolveSize(0, 0), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.text.TextUtils.indexOf("", "", 0, 0) + 5, (-1095151713) - android.view.KeyEvent.normalizeMetaState(0), objArr2);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                            walletSecureEnrollmentListener.onError(walletSecureEnrollmentError);
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
                throw null;
            }
        });
        int i = getOutputFormats + 95;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i) throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(util.h.xy.al.b.f183, util.h.xy.ar.b.m25093(i));
        throw new com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes.DEVICE_SUSPICIOUS, 0, 0, util.h.xy.ar.b.m25093(i), hashMap);
    }

    /* renamed from: util.h.xy.ca.a$7, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass7 {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[util.h.xy.v.ma.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[util.h.xy.v.ma.f2549.ordinal()] = 1;
                int i = getHighResolutionOutputSizeshNQ4ISI + 97;
                Camera2StreamConfigurationMap = i % 128;
                int i2 = i % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[util.h.xy.v.ma.f2552.ordinal()] = 2;
                int i3 = Camera2StreamConfigurationMap;
                int i4 = (i3 & 63) + (i3 | 63);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int i6 = Camera2StreamConfigurationMap;
            int i7 = ((i6 | 81) << 1) - (i6 ^ 81);
            getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
            if (i7 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    static void Camera2StreamConfigurationMap() {
        getOutputStallDurationlomOqCM = 2726736602568637197L;
        getOutputSizes = new char[]{64326, 64309, 64323, 64305, 64308, 64334, 64373, 64320, 64307, 64322, 64352, 64319, 64332, 64343, 64328, 64362, 64311, 64330, 64366, 64333, 64329, 64317, 64304, 64306, 64318, 64365, 64351, 64370, 64375, 64382, 64321, 64331, 64360};
        getHighSpeedVideoSizesFor = -1074857049;
        getOutputStallDuration = true;
        getInputFormats = true;
    }

    static void getHighSpeedVideoFpsRanges() {
        char[] cArr = new char[1429];
        java.nio.ByteBuffer.wrap("¬ìó\u0017\u0013'³F\u001f\u009d@~ A\u0000=`\u0005À\u0000 \u008e\u0080ÒAq\u001e\u0092þ\u00ad^Ñ>é\u009eì~bÞ%\u009cVÃµ#\u008a\u0083öãÎCË£E\u0003\u0003cnÃM#B\u0082 \u009cVÃµ#\u008a\u0083öãÎCË£E\u0003\u0003cnÃM#B\u009cVÃµ#\u008a\u0083öãÎCË£E\u0003\u0017cj\u009c1ñ,®ÝNÿî\u008e\u008e¦.®Ðé\u008f\u001do7\u009c`Ã\u0085#»\u0083ÝãòCì,^sª\u0093\u00803\u0092SÆóû\u0013\u0003³\u0002Ó@sz\u0093o2³R¦òË\u0012Ò²õÒ\u0003r.S&\fÍìåL\u0086,¼\u008c´l\\Ìu¬\t\f3ì,MÆ-Ø\u008d\u009a+\u001ctÌ\u0094î4\u009eT¥ô¬\u0014H´?Ô\u0011t4\u0094<5íUÿõ\u008d\u0015\u0098µ\u0084ÕQut\u0095\u001d5\nU,öÙ\u0016´¶ÛÖ\u008fv¬\u0096]6|V\u007fö\u0011\u009crÃ\u0087#©\u0083ÇãêCç£\r\u00034\u009ciÃ\u0083#¿\u0083ÀãîCæ£\f\u00034\u009ctÃ\u0087#©\u0083ÂãûCû£\f\u0003\"cTÃo#o\u0082\u0086â°BÍ¢Ú\u0002é\u009c@Ã\u0088#ï\u0083ÑãïCð£\u0004\u0003\"c\u0019Ãq#d\u0082\u008fâ BÈ¢Ñ\u0002íb\u0015Âv\"\u0005\u0082\u0004\u009ceÃ\u0091#½\u0083ÀãùCè£\u0019\u0003$c]Ãg#e\u0082\u0082â·BÉ¢Ó\u0002ìÔ\u0018\u008bìkÆËÎ«\u0089\u000b·ëEK*+\n\u008b*k4ÊÂªæ\n\u0081ê\u0095J»*Q\u008aij\u0001}É\"\fÂ(bX\u0002t¢bB©â´\u0082È\"þÂõc\b\u0003)£\u001fChãb\u0083\u0080#óÃÓcÏ\u0003á \u0003@7à$\u0080@ bÀ\u0088`¼\u0000¤\u009cTÃ\u0088#¼\u0083ÁãíCò£\u0004\u0003\"cMÃ{#c\u0082Ìâ\u0090BÔ¢À\u0002çb\u0015Â?\"Q\u0082Cþm¡\u00adA\u009aáä\u0081Ì!\u0087Á\"a\u001c\u0001o¡OA\u0002à¬\u0080\u0082 íÀé`ß\u009ceÃ\u009f#¡\u0083ÕãðCë£\b\u0003\u0006cXÃr#r\u0082\u0089\u009cLÃ\u008f#¼\u0083ÇãôCì£\f\u0003pc]Ãg#i\u0082\u008dâ¸BÓ¢À\u0002Þb\u0010Â:\"J\u0082Aâ#\u009c!ÃÜ#ï\u009cBÃ\u0089#¢\u0083ÄãèCö£\u0002\u0003>c^Ã>#F\u0082\u0099â¡BÒ¢\u0083\u0002Þb\u0010Â:\"J\u0082Aâ-A\u0094¡º\u0001©aÅÁë!\u0013\u0081|á!A_¡v\u0000Ø`\u0095À© \u008f\u0080÷à\u0018@\u0010 ?\u0000Y`\u007fÇ\u0097'\u0084\u0087\u00adçÁGÿ§£\u0007\rg)ÇU'z\u0087tæ\u0099F»¦Ô\u0006Îf©ÆT&w\u0099iÆ\u009c&µ\u0086ØæàFø\u009cLÃ\u008f#¼\u0083ÇãôCì£\f\u0003pcXÃm#t\u0082\u0089â¡BÉ¢\u0083\u0002áb\u001fÂv\"K\u0082LâhAÒ¡©\u0001¥aÚÁþ!\u0018\u00812á6AO¡=\fåS\u000f³/\u0013A\u0092\u0081Íc-K\u008d,í\u0017M\u0004\u00adï\r¤\u009c[Ã #\u009c\u0083ëãÊCÀ£(\u0003\u000fcxÃ[#TxN'®Ç\u0099\u009cLÃ\u008f#¼\u0083ÇãôCì£\f\u0003pcXÃm#t\u0082\u0089â¡B\u009a¢Ö\u0002úb\u001dÂv\"V\u0082Jâ-A\u0086¡³\u0001¥a\u0089Áü!\u0012\u0081/á5AE¡}\u0000\u008b`\u0084Àè\u009crÃ\u008e#®\u0083\u0086ã¨C´\u0018\u0012GÑ§â\u0007\u0099gªÇ²'R\u0087.ç\u0006G3§*\u0006×fÿÆÄ&\u009e\u0086¾æJFk¦\n\u0006\tf&ÅÁ%¥\u0085÷å\u0099Eð¥]\u0005je~ÅT%?\u0084ÃäÌDè¤\u009e\u0004¤dPÄY$;\u001ckC\u0081£·\u0003ßcáÃÿ#\f\u00838ã^Cu£{¹\u001bæØ\u0006ë¦\u0090Æ£f»\u0086[&'F\næ \u0006&§ÞÇðg\u009e\u0087\u009d'¹GOçd\u0007\u001a§SÇ3dË\u0084¬$ãD\u0096ä¼\u0004\u0000¤yÄwd\u000e\u00844%ÀEØåâ\u0005\u009d¥í\u009cjÃ\u0085#¹Çö\u0098\u0015x*Ø\"¸`\u0018wø\u008bXÆ8Ã\u0098ÍxßÙ=¹\u0017\u0019dù5YW9´\u0099ÀyàÙü¹Í\u001a%ú\u0001Z\u001f:{P(\u000fÃïèOð/²\u008f¥oYÏ\u0014¯\u0011\u000f\u001fï\rNï.Å\u008e¶nçÎ\u0085®f\u000e\u0012î2N..\u001f\u008d÷mÓÍÍ\u00ad©\u009c@Ã£#\u009c\u0083\u0094ãÖCÁ£=\u0003pctÃW#T\u0082¡â\u0094Bî¢à\u0002À\u009c@Ã£#\u009c\u0083\u0094ãÖCÁ£=\u0003p\u009cLÃ§#\u008c\u0083\u0094ãÖCÁ£=\u0003pctÃW#T\u0082¡â\u0094Bî¢à\u0002À\u009cLÃ§#\u008c\u0083\u0094ãÖCÁ£=\u0003p\u009cRÃ\u0093#¬\u0083×ãøCñ£\u0018¨\u008b÷\u007f\u0017U·]×\u0006w.\u0097Ñ7éW\u009f÷¹\u0017½¶@Ö<v\u001a\u0096\u00196aVÖöê\u0016\u009a¶\u0081\u0016\tIÙ©û\t\u008bi°É¹)]\u0089*é\u0005I%©4\bÚh¯È\u0097(\u0090\u0088¦èCH,¨\u0006\b\u0011h3ËÍ+¡\u008b¬ëÄKå\u009c@Ã\u0088#ï\u0083ÑãïCð£\u0004\u0003\"c\u0019Ãq#d\u0082\u008fâ BÈ¢Ñ\u0002íb\u0015Âv\"H\u0082LâdA\u009e¡¾\u0001àaÙÁü!\u0018\u0081?á AY¡`\u0000\u0091`\u008fÀ¡ \u008f\u0080óà\u0018@\u0016 \u0005\u0000U`aÇ½'\u0088\u0087¡çØGû§í\u0007\fgqÇ_'q\u0087$æ\u009fF·¦Õ\u0006ÅfþÆ\u000f&;\u0086\u001cæ\u001fF*ÞL\u0081\u0084aãÁÝ¡ã\u0001üá\bA.!\u0015\u0081}ahÀ\u0083 ¬\u0000ÄàÝ@á \u0019\u0080z`DÀ@ h\u0003\u0092ã²Cì#Ð\u0083òc\u001fÃ1£=\u0003OãqB\u0093\"Í\u0082¸bÆÂö¢\u0014\u0002\u0019â&BP\"5\u0085\u0081e\u009fÅ¡¥Í\u0005óå¯E^%}\u0010YO\u0091¯ö\u000fÈoöÏé/\u001d\u008f;ï\u0000Oh¯}\u000e\u0096n¹ÎÑ.È\u008eôî\fNo®Q\u000eUn}Í\u0087-§\u008dùíÀMå\u00ad\u0001\r&m9Í@-y\u008c\u0088ì\u0096L¸¬\u0096\fúl\u0006Ì),7\u008cGìeK\u0090«\u009f\u000b¹\u009chÃ\u0088#»\u0083ÑãïCì£\n\u0003<ckÃ{#i\u0082\u0089â¢BÛ¢Ï\u0002¨b\\Âv\"Z\u0082Vâ\u007fA\u009d¡©\u0001àaÍÁû!\u0005\u00815á+AM¡3\u0000\u008f`\u0088À¶ Æ\u0080úà\u001a@B (\u0000B`|Ç\u009a'\u0094\u0087ìç\u008fGºc\u0086<cÜ[|'5\u0093j[\u008a<*\u0002J<ê#\n×ªñÊÊj¢\u008a·+\\Ksë\u001b\u000b\u0002«>ËÆk¥\u008b\u009b+\u009fK·èM\bm¨3È\bh8\u0088Ô(ãH÷è\u009a\b¥©\u000bÉSif\u0089\u000f)\"IÚéÂ\t¸©ÙÉê\u0005&ZÜºç\u001a\u008fz²\u009cOÃµ#\u009d\u0083ò¹Kæ®\u0006\u0080¦÷ÆÎfÚ\u00866&\u0013FuæP\u0006R§¦Ç\u0096gí\u0087ú'ÍGMç/\u0007[§HÇtd\u008d\u0084³$¹DÑä²\u0004\t¤5Ä-d\u0016\u0084b%\u008dE\u008eå©\u0005Ú¥æÅ\u0006pE/¥Ï\u0096oü\u000fÂ¯ÁO'ï\u0011\u008fF/VÏDn¤\u000e\u008f®öNâî\u0085\u008eq.[Î`nl\u000eP\u00ad³M\u0097í\u008e\u008dá-ÇÍzm\u0001\r\u001a\u00adhMXì¼\u008c ,\u008eÌ¢lÉ\f\"¬&L\u0010ìV\u008cQ+ªËðkÁ\u000bè«ÅKÇë3\u008b7+~ËKk\t\n©ª\u008cJ¶êã\u008aË*7ÊZjp\n(ªDI±é\u0087\u0089\u009e)îÉÁi-\tP©%IUér\u0088\u009a(ÓÈ\u0085hã\bÒ¨2H-è\u0011\u00880(\u001b\u009cnÃ\u0082#®\u0083äãïCë£ \u00035c@Ã_#+\u0082¿â¥B\u0096¢ð\u0002ùb]Â\u0006\"\u0013\u0082uâ-A\u0097¡£\u0001°aÌÁí!\u0003\u00819á!A\n¡q\u0000\u008d`\u0095Àæ Â\u0080ýà\u000e@\u0011 \"\u0000^`~[®\u0004Nä}D\u0017$)\u0084*dÌÄú¤\u00ad\u0004½ä¯EO%d\u0085\u001de\tÅn¥\u009a\u0005°å\u008bE\u0087%»\u0086Xf|Æe¦\n\u0006,æ\u0091Fê&ñ\u0086\u0083f³ÇW§K\u0007eçIG3'Ò\u0087Àg·ÇÖ§¾\u0000QàE@* \u001a\u0080/`eÀÀ ø\u0000\u0084àù@£!\u000b\u0081wa\u0012Á\u0014¡=\u0001ÍáòA\u008e!Ã\u0081\u0086bfÂQ¢I\u0002@â&BÐ\"ñ\u0082áb\u008eÂ¢£\u0013\u00038\u009cSÃ¥#\u009f\u0083úãÛ;>dÀ\u0084õ$\u008fDÈä§\u0004\u007f¤WÄ?d\u0002\u0084\u001c%þE\u0080åª\u0005¤¥\u008fÅkeQ\u0085j%\"E\u001dæó\u0006Ú¦ÜÆ²f\u009c\u0086\"&YFBæ0\u0006\u0000§äÇøgÖ\u0087ú'\u0095Ggç7\u0007p§$Ç\u0018`â\u0080ä Ü@úàÏ\u0015\u0097JlªG\n;j\u001fùO¦ÞFìæ\u0092\u0086²6$iä\u0089Ê)¬IÑé½\tb©OÉ&i\u001b\u0089\u0004(îH\u0099è³\b½¨\u0096ÈrhH\u0088 \u009cBÃ\u0089#¢\u0083ÄãèCö£\u0002\u0003>c^Ã>#F\u0082\u0099â¡BÒ¢\u0083\u0002Þb\u0010Â:\"J\u0082Aâ-A\u0094¡º\u0001©aÅÁë!\u0013\u0081|á!A_¡v\u0000Ø`\u0095À© \u008f\u0080÷à\u0018@\u0010 ?\u0000Y`\u007fÇ\u0097'\u0084\u0087\u00adçÁGÿ§£\u0007\rg)ÇU'z\u0087tæ\u0099F»¦Ô\u0006Î\u009cBÃ\u0089#¢\u0083ÄãèCö£\u0002\u0003>c^Ã>#F\u0082\u0099â¡BÒ¢\u0083\u0002Þb\u0010Â:\"J\u0082Aâ-A\u0094¡º\u0001©aÅÁë!\u0013\u0081|á!A_¡v\u0000Ø`\u0095À© \u008f\u0080äà\u001c@\u0001  \u0000Q`~Ç\u009b'Ç\u0087¢çÔG÷§æ\u0007Hg?ÇY'k\u0087$æ\u008bF½¦Î\u0006ÎfíÆN&2\u0086DæFFo¥\u0083\u0005¬e¨ÅÉ%á\u009ctÃ\u0088#¤\u0083ÚãòCõ£\u0005\u0003pczÃN#T\u0082Ìâ\u0090BÈ¢Ñ\u0002çb\u0003".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1429);
        getHighSpeedVideoSizes = cArr;
        getOutputMinFrameDuration = -8584751720574368794L;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        int i = getInputSizeshNQ4ISI;
        getOutputFormats = (i + 27) % 128;
        Camera2StreamConfigurationMap = new byte[]{9, 80, com.google.common.base.Ascii.SYN, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
        getHighSpeedVideoFpsRanges = 80;
        getOutputFormats = (i + 23) % 128;
    }
}
