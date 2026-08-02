package com.visa.cbp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BuildConfig' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class setEncryptionScheme {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final com.visa.cbp.setEncryptionScheme AidInfo;
    public static final com.visa.cbp.setEncryptionScheme BuildConfig;
    private static int Camera2StreamConfigurationMap;
    public static final com.visa.cbp.setEncryptionScheme ConfirmReplenishRequest;
    public static final com.visa.cbp.setEncryptionScheme ReplenishAckRequest;
    public static final com.visa.cbp.setEncryptionScheme ReplenishRequest;
    public static final com.visa.cbp.setEncryptionScheme ReplenishResponse;
    public static final com.visa.cbp.setEncryptionScheme Signature;
    public static final com.visa.cbp.setEncryptionScheme getAid;
    public static final com.visa.cbp.setEncryptionScheme getApplicationLabel;
    public static final com.visa.cbp.setEncryptionScheme getCap;
    public static final com.visa.cbp.setEncryptionScheme getEncryptionMetaData;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static boolean getHighSpeedVideoFpsRanges;
    private static boolean getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static byte[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    public static final com.visa.cbp.setEncryptionScheme getIssuerApplicationDiscretionaryData;
    public static final com.visa.cbp.setEncryptionScheme getIssuerDiscretionaryData;
    public static final com.visa.cbp.setEncryptionScheme getMac;
    private static int getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static final /* synthetic */ com.visa.cbp.setEncryptionScheme[] getOutputMinFrameDurationlomOqCM;
    private static short[] getOutputSizeshNQ4ISI;
    private static char[] getOutputStallDuration;
    private static int getOutputStallDurationlomOqCM;
    public static final com.visa.cbp.setEncryptionScheme getSignature;
    public static final com.visa.cbp.setEncryptionScheme getTokenInfo;
    public static final com.visa.cbp.setEncryptionScheme getTvls;
    public static final com.visa.cbp.setEncryptionScheme setApplicationLabel;
    public static final com.visa.cbp.setEncryptionScheme setEncryptionMetaData;
    public static final com.visa.cbp.setEncryptionScheme setIssuerApplicationDiscretionaryData;
    public static final com.visa.cbp.setEncryptionScheme setIssuerDiscretionaryData;
    public static final com.visa.cbp.setEncryptionScheme setMac;
    public static final com.visa.cbp.setEncryptionScheme setSignature;
    public static final com.visa.cbp.setEncryptionScheme setTokenInfo;
    public static final com.visa.cbp.setEncryptionScheme setTvls;
    public static final com.visa.cbp.setEncryptionScheme valueOf;
    public static final com.visa.cbp.setEncryptionScheme values;
    private java.lang.String getOutputSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoSizes(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = i + 111;
        byte[] bArr = $$a;
        int i6 = i3 + 4;
        int i7 = i2 * 3;
        byte[] bArr2 = new byte[1 - i7];
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            i5 = (-i5) + i6;
            i6 = i8;
            i4 = i9;
            bArr2[i4] = (byte) i5;
            int i10 = i6 + 1;
            if (i4 == 0 - i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b = bArr[i10];
            i6 = i5;
            i5 = b;
            i9 = i4 + 1;
            i8 = i10;
            i5 = (-i5) + i6;
            i6 = i8;
            i4 = i9;
            bArr2[i4] = (byte) i5;
            int i102 = i6 + 1;
            if (i4 == 0 - i7) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            int i1022 = i6 + 1;
            if (i4 == 0 - i7) {
            }
        }
    }

    public static com.visa.cbp.setEncryptionScheme valueOf(java.lang.String str) {
        int i = getOutputMinFrameDuration + 121;
        getOutputStallDurationlomOqCM = i % 128;
        com.visa.cbp.setEncryptionScheme setencryptionscheme = (com.visa.cbp.setEncryptionScheme) java.lang.Enum.valueOf(com.visa.cbp.setEncryptionScheme.class, str);
        if (i % 2 == 0) {
            return setencryptionscheme;
        }
        throw null;
    }

    public static com.visa.cbp.setEncryptionScheme[] values() {
        getOutputStallDurationlomOqCM = (getOutputMinFrameDuration + 121) % 128;
        com.visa.cbp.setEncryptionScheme[] setencryptionschemeArr = (com.visa.cbp.setEncryptionScheme[]) getOutputMinFrameDurationlomOqCM.clone();
        getOutputStallDurationlomOqCM = (getOutputMinFrameDuration + 93) % 128;
        return setencryptionschemeArr;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI = 0;
        getHighSpeedVideoSizes = 1;
        getOutputStallDurationlomOqCM = 0;
        getOutputMinFrameDuration = 1;
        getHighSpeedVideoSizes();
        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
        float minVolume = android.media.AudioTrack.getMinVolume();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((longPressTimeout >> 16) + 404320140, 743901141 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-18) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (byte) ((-101) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u008a\u0083\u0084\u0082\u0089\u0084\u0085\u0088\u0084\u0086\u0085\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr2);
        com.visa.cbp.setEncryptionScheme setencryptionscheme = new com.visa.cbp.setEncryptionScheme(intern, 0, ((java.lang.String) objArr2[0]).intern());
        BuildConfig = setencryptionscheme;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, "\u0083\u0084\u0082\u0089\u0084\u0085\u0088\u0084\u0086\u0083\u0085\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        int touchSlop = android.view.ViewConfiguration.getTouchSlop();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((touchSlop >> 8) + 404320140, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 743901159, (short) android.text.TextUtils.getCapsMode("", 0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 17, (byte) ((-44) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr4);
        com.visa.cbp.setEncryptionScheme setencryptionscheme2 = new com.visa.cbp.setEncryptionScheme(intern2, 1, ((java.lang.String) objArr4[0]).intern());
        ConfirmReplenishRequest = setencryptionscheme2;
        int defaultSize = android.view.View.getDefaultSize(0, 0);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320140 - defaultSize, android.view.View.resolveSize(0, 0) + 743901177, (short) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 21, (byte) ((android.os.Process.myPid() >> 22) + 12), objArr5);
        java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(packedPositionType + 404320140, 743901192 - android.text.TextUtils.indexOf("", "", 0), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (-14) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((-127) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr6);
        com.visa.cbp.setEncryptionScheme setencryptionscheme3 = new com.visa.cbp.setEncryptionScheme(intern3, 2, ((java.lang.String) objArr6[0]).intern());
        ReplenishAckRequest = setencryptionscheme3;
        int indexOf = android.text.TextUtils.indexOf("", "");
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(indexOf + 404320140, android.os.Process.getGidForName("") + 743901215, (short) android.text.TextUtils.getCapsMode("", 0, 0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 19, (byte) ((-63) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr7);
        java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
        int indexOf2 = android.text.TextUtils.indexOf("", "", 0, 0);
        short minimumFlingVelocity = (short) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
        int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320140 - deadChar, indexOf2 + 743901230, minimumFlingVelocity, (minimumFlingVelocity2 >> 16) - 12, (byte) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 16), objArr8);
        com.visa.cbp.setEncryptionScheme setencryptionscheme4 = new com.visa.cbp.setEncryptionScheme(intern4, 3, ((java.lang.String) objArr8[0]).intern());
        valueOf = setencryptionscheme4;
        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320140 - packedPositionGroup, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 743901253, (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-20) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (100 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr9);
        java.lang.String intern5 = ((java.lang.String) objArr9[0]).intern();
        int longPressTimeout2 = android.view.ViewConfiguration.getLongPressTimeout();
        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320140 - (longPressTimeout2 >> 16), 743901269 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), (short) android.view.View.MeasureSpec.getMode(0), android.graphics.Color.red(0) - 13, (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 68), objArr10);
        com.visa.cbp.setEncryptionScheme setencryptionscheme5 = new com.visa.cbp.setEncryptionScheme(intern5, 4, ((java.lang.String) objArr10[0]).intern());
        values = setencryptionscheme5;
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(lastIndexOf + 404320141, (fadingEdgeLength >> 16) + 743901290, (short) android.text.TextUtils.getOffsetBefore("", 0), (-19) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) ((-16777134) - android.graphics.Color.rgb(0, 0, 0)), objArr11);
        java.lang.String intern6 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), "\u008a\u0083\u0084\u0082\u0089\u0084\u0085\u0083\u0084\u0086\u0085\u0086\u0082\u0086\u0087\u0085\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr12);
        com.visa.cbp.setEncryptionScheme setencryptionscheme6 = new com.visa.cbp.setEncryptionScheme(intern6, 5, ((java.lang.String) objArr12[0]).intern());
        getTvls = setencryptionscheme6;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320128 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), 743901306 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (-5) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 9), objArr13);
        java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
        int touchSlop2 = android.view.ViewConfiguration.getTouchSlop();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((touchSlop2 >> 8) + 404320159, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 743901335, (short) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-9) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-1) - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr14);
        com.visa.cbp.setEncryptionScheme setencryptionscheme7 = new com.visa.cbp.setEncryptionScheme(intern7, 6, ((java.lang.String) objArr14[0]).intern());
        getTokenInfo = setencryptionscheme7;
        int myPid = android.os.Process.myPid();
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320140 - (myPid >> 22), 743901362 - android.text.TextUtils.getTrimmedLength(""), (short) android.view.KeyEvent.normalizeMetaState(0), android.graphics.ImageFormat.getBitsPerPixel(0) - 18, (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 67), objArr15);
        java.lang.String intern8 = ((java.lang.String) objArr15[0]).intern();
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "", 0) + 127, "\u008d\u008c\u008b", objArr16);
        com.visa.cbp.setEncryptionScheme setencryptionscheme8 = new com.visa.cbp.setEncryptionScheme(intern8, 7, ((java.lang.String) objArr16[0]).intern());
        setTokenInfo = setencryptionscheme8;
        float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 404320140, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 743901378, (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-17) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (108 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr17);
        java.lang.String intern9 = ((java.lang.String) objArr17[0]).intern();
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u008d\u008c\u008b\u008e", objArr18);
        com.visa.cbp.setEncryptionScheme setencryptionscheme9 = new com.visa.cbp.setEncryptionScheme(intern9, 8, ((java.lang.String) objArr18[0]).intern());
        setTvls = setencryptionscheme9;
        int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
        java.lang.Object[] objArr19 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((maximumFlingVelocity >> 16) + 404320136, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 743901395, (short) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) - 21, (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 39), objArr19);
        java.lang.String intern10 = ((java.lang.String) objArr19[0]).intern();
        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
        java.lang.Object[] objArr20 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320136 - (maxKeyCode >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 743901409, (short) (android.view.MotionEvent.axisFromString("") + 1), (-16) - android.graphics.Color.red(0), (byte) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 46), objArr20);
        com.visa.cbp.setEncryptionScheme setencryptionscheme10 = new com.visa.cbp.setEncryptionScheme(intern10, 9, ((java.lang.String) objArr20[0]).intern());
        ReplenishRequest = setencryptionscheme10;
        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((edgeSlop >> 16) + 404320121, android.widget.ExpandableListView.getPackedPositionChild(0L) + 743901429, (short) android.view.KeyEvent.getDeadChar(0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 26, (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) - 47), objArr21);
        java.lang.String intern11 = ((java.lang.String) objArr21[0]).intern();
        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320120 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), 743901439 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (-19) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (102 - android.graphics.Color.green(0)), objArr22);
        com.visa.cbp.setEncryptionScheme setencryptionscheme11 = new com.visa.cbp.setEncryptionScheme(intern11, 10, ((java.lang.String) objArr22[0]).intern());
        setEncryptionMetaData = setencryptionscheme11;
        int indexOf3 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        java.lang.Object[] objArr23 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320118 - indexOf3, 743901454 - (maximumDrawingCacheSize >> 24), (short) android.view.Gravity.getAbsoluteGravity(0, 0), (-20) - android.os.Process.getGidForName(""), (byte) (android.graphics.Color.red(0) + 66), objArr23);
        java.lang.String intern12 = ((java.lang.String) objArr23[0]).intern();
        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320119 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 743901470, (short) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-21) - (android.os.Process.myPid() >> 22), (byte) (105 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), objArr24);
        com.visa.cbp.setEncryptionScheme setencryptionscheme12 = new com.visa.cbp.setEncryptionScheme(intern12, 11, ((java.lang.String) objArr24[0]).intern());
        setSignature = setencryptionscheme12;
        char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int indexOf4 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(28501 + mirror, indexOf4 + 743901485, (short) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (-17) - android.text.TextUtils.indexOf("", "", 0), (byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23), objArr25);
        java.lang.String intern13 = ((java.lang.String) objArr25[0]).intern();
        java.lang.Object[] objArr26 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.view.View.getDefaultSize(0, 0), "\u0092\u0091\u0087\u0084\u0083\u0088\u0090\u008f", objArr26);
        com.visa.cbp.setEncryptionScheme setencryptionscheme13 = new com.visa.cbp.setEncryptionScheme(intern13, 12, ((java.lang.String) objArr26[0]).intern());
        getEncryptionMetaData = setencryptionscheme13;
        java.lang.Object[] objArr27 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.text.TextUtils.getTrimmedLength("") + 127, "\u0087\u0086\u0083\u0085\u0090\u0094\u0093\u0085\u0084\u0083\u0082\u0081", objArr27);
        java.lang.String intern14 = ((java.lang.String) objArr27[0]).intern();
        java.lang.Object[] objArr28 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.view.View.MeasureSpec.getSize(0), "\u0095\u0087\u0086\u0083\u0090\u0094\u0093\u008c\u008e\u0096\u0081\u0095", objArr28);
        com.visa.cbp.setEncryptionScheme setencryptionscheme14 = new com.visa.cbp.setEncryptionScheme(intern14, 13, ((java.lang.String) objArr28[0]).intern());
        ReplenishResponse = setencryptionscheme14;
        java.lang.Object[] objArr29 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.view.View.MeasureSpec.getMode(0), "\u0083\u0099\u0083\u0082\u0098\u0091\u0085\u0083\u0083\u0091\u0093\u0093\u0084\u0085\u0088\u0091\u0083\u0097\u0085\u0088\u0091\u0090\u0097\u0083", objArr29);
        java.lang.String intern15 = ((java.lang.String) objArr29[0]).intern();
        java.lang.Object[] objArr30 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "", 0) + 127, "\u0083\u0099\u0083\u0082\u0098\u0091\u0085\u0083\u0083\u0091\u0093\u0093\u0084\u0085\u0088\u0091\u0083\u0097\u0085\u0088\u0091\u0090\u0097\u0083", objArr30);
        com.visa.cbp.setEncryptionScheme setencryptionscheme15 = new com.visa.cbp.setEncryptionScheme(intern15, 14, ((java.lang.String) objArr30[0]).intern());
        getSignature = setencryptionscheme15;
        int touchSlop3 = android.view.ViewConfiguration.getTouchSlop();
        java.lang.Object[] objArr31 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((touchSlop3 >> 8) + 404320124, 743901502 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (short) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) - 17, (byte) ((-96) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr31);
        java.lang.String intern16 = ((java.lang.String) objArr31[0]).intern();
        int green = android.graphics.Color.green(0);
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(green + 404320124, 743901502 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-17) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((-95) - android.graphics.Color.green(0)), objArr32);
        com.visa.cbp.setEncryptionScheme setencryptionscheme16 = new com.visa.cbp.setEncryptionScheme(intern16, 15, ((java.lang.String) objArr32[0]).intern());
        setMac = setencryptionscheme16;
        java.lang.Object[] objArr33 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.view.KeyEvent.normalizeMetaState(0), "\u0091\u009c\u0084\u009b\u0085\u009a\u0091\u0088\u0090", objArr33);
        java.lang.String intern17 = ((java.lang.String) objArr33[0]).intern();
        int argb = android.graphics.Color.argb(0, 0, 0, 0);
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320169 - argb, 743901520 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 28, (byte) ((-29) - (android.os.Process.myPid() >> 22)), objArr34);
        com.visa.cbp.setEncryptionScheme setencryptionscheme17 = new com.visa.cbp.setEncryptionScheme(intern17, 16, ((java.lang.String) objArr34[0]).intern());
        AidInfo = setencryptionscheme17;
        java.lang.Object[] objArr35 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u009c\u008f\u0093\u0091\u0085\u0090\u0090\u0084\u009b\u0082", objArr35);
        java.lang.String intern18 = ((java.lang.String) objArr35[0]).intern();
        java.lang.Object[] objArr36 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.view.View.getDefaultSize(0, 0) + 127, "\u009c\u008f\u0093\u0091", objArr36);
        com.visa.cbp.setEncryptionScheme setencryptionscheme18 = new com.visa.cbp.setEncryptionScheme(intern18, 17, ((java.lang.String) objArr36[0]).intern());
        getIssuerApplicationDiscretionaryData = setencryptionscheme18;
        java.lang.Object[] objArr37 = new java.lang.Object[1];
        getHighSpeedVideoSizes(126 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), "\u009d\u009b\u0082\u0088\u0088\u0097\u0093\u0091\u0088\u0085\u0090\u0090\u0084\u009b\u0082", objArr37);
        java.lang.String intern19 = ((java.lang.String) objArr37[0]).intern();
        int mode = android.view.View.MeasureSpec.getMode(0);
        java.lang.Object[] objArr38 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320136 - mode, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 743901527, (short) android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 27, (byte) (95 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), objArr38);
        com.visa.cbp.setEncryptionScheme setencryptionscheme19 = new com.visa.cbp.setEncryptionScheme(intern19, 18, ((java.lang.String) objArr38[0]).intern());
        getMac = setencryptionscheme19;
        int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
        java.lang.Object[] objArr39 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320122 - (scrollDefaultDelay >> 16), 743901534 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (short) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 22, (byte) ((-77) - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr39);
        java.lang.String intern20 = ((java.lang.String) objArr39[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(setencryptionscheme14);
        java.lang.Object[] objArr40 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "¤\u008c\u008b£\u009e¢\u0096¡\u0085\u008b\u0096\u0085\u009e \u0096\u009f\u009e\u008b", objArr40);
        sb.append(((java.lang.String) objArr40[0]).intern());
        com.visa.cbp.setEncryptionScheme setencryptionscheme20 = new com.visa.cbp.setEncryptionScheme(intern20, 19, sb.toString());
        Signature = setencryptionscheme20;
        int alpha = android.graphics.Color.alpha(0);
        int green2 = android.graphics.Color.green(0);
        java.lang.Object[] objArr41 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320126 - alpha, green2 + 743901548, (short) android.view.View.resolveSizeAndState(0, 0, 0), (-24) - android.text.TextUtils.indexOf("", ""), (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 98), objArr41);
        java.lang.String intern21 = ((java.lang.String) objArr41[0]).intern();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(setencryptionscheme14);
        int blue = android.graphics.Color.blue(0);
        java.lang.Object[] objArr42 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(blue + 404320158, 743901559 - android.text.TextUtils.getCapsMode("", 0, 0), (short) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 20, (byte) (65487 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr42);
        sb2.append(((java.lang.String) objArr42[0]).intern());
        com.visa.cbp.setEncryptionScheme setencryptionscheme21 = new com.visa.cbp.setEncryptionScheme(intern21, 20, sb2.toString());
        setApplicationLabel = setencryptionscheme21;
        int scrollDefaultDelay2 = android.view.ViewConfiguration.getScrollDefaultDelay();
        int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
        short s = (short) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
        long elapsedCpuTime2 = android.os.Process.getElapsedCpuTime();
        java.lang.Object[] objArr43 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((scrollDefaultDelay2 >> 16) + 404320122, (jumpTapTimeout >> 16) + 743901574, s, (elapsedCpuTime2 > 0L ? 1 : (elapsedCpuTime2 == 0L ? 0 : -1)) - 24, (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 48), objArr43);
        java.lang.String intern22 = ((java.lang.String) objArr43[0]).intern();
        java.lang.Object[] objArr44 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.view.Gravity.getAbsoluteGravity(0, 0) + 127, "¥\u008b£¢\u0096\u008d¦\u008c\u0085¦¥ ", objArr44);
        com.visa.cbp.setEncryptionScheme setencryptionscheme22 = new com.visa.cbp.setEncryptionScheme(intern22, 21, ((java.lang.String) objArr44[0]).intern());
        setIssuerApplicationDiscretionaryData = setencryptionscheme22;
        java.lang.Object[] objArr45 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.view.View.getDefaultSize(0, 0), "\u0088\u0082\u0086\u0085\u0091\u0083\u0084\u0094\u0084\u0099\u0084\u0086", objArr45);
        java.lang.String intern23 = ((java.lang.String) objArr45[0]).intern();
        int indexOf5 = android.text.TextUtils.indexOf("", "", 0);
        java.lang.Object[] objArr46 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320154 - indexOf5, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 743901586, (short) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 27, (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 62), objArr46);
        com.visa.cbp.setEncryptionScheme setencryptionscheme23 = new com.visa.cbp.setEncryptionScheme(intern23, 22, ((java.lang.String) objArr46[0]).intern());
        setIssuerDiscretionaryData = setencryptionscheme23;
        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
        java.lang.Object[] objArr47 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(trimmedLength + 404320138, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 743901594, (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-32) - android.view.View.MeasureSpec.getSize(0), (byte) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 89), objArr47);
        java.lang.String intern24 = ((java.lang.String) objArr47[0]).intern();
        java.lang.Object[] objArr48 = new java.lang.Object[1];
        getHighSpeedVideoSizes(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, "\u009e§\u008d¤", objArr48);
        com.visa.cbp.setEncryptionScheme setencryptionscheme24 = new com.visa.cbp.setEncryptionScheme(intern24, 23, ((java.lang.String) objArr48[0]).intern());
        getIssuerDiscretionaryData = setencryptionscheme24;
        java.lang.Object[] objArr49 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0091\u0083\u0089\u0084\u009a", objArr49);
        java.lang.String intern25 = ((java.lang.String) objArr49[0]).intern();
        java.lang.Object[] objArr50 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\u009e\u008e¢\u008c¡", objArr50);
        com.visa.cbp.setEncryptionScheme setencryptionscheme25 = new com.visa.cbp.setEncryptionScheme(intern25, 24, ((java.lang.String) objArr50[0]).intern());
        getApplicationLabel = setencryptionscheme25;
        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
        java.lang.Object[] objArr51 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320141 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), 743901597 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (short) android.graphics.Color.blue(0), (-22) - android.graphics.Color.green(0), (byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 46), objArr51);
        java.lang.String intern26 = ((java.lang.String) objArr51[0]).intern();
        char mirror2 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int alpha2 = android.graphics.Color.alpha(0);
        java.lang.Object[] objArr52 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(28604 - mirror2, alpha2 + 743901610, (short) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-24) - android.view.MotionEvent.axisFromString(""), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 78), objArr52);
        com.visa.cbp.setEncryptionScheme setencryptionscheme26 = new com.visa.cbp.setEncryptionScheme(intern26, 25, ((java.lang.String) objArr52[0]).intern());
        getAid = setencryptionscheme26;
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        int gidForName = android.os.Process.getGidForName("");
        java.lang.Object[] objArr53 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)) + 404320139, 743901621 - gidForName, (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.view.View.resolveSize(0, 0) - 18, (byte) (55 - android.text.TextUtils.indexOf("", "")), objArr53);
        java.lang.String intern27 = ((java.lang.String) objArr53[0]).intern();
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
        java.lang.Object[] objArr54 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(404320140 - makeMeasureSpec, 743901639 - capsMode, (short) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-19) - (android.os.Process.myPid() >> 22), (byte) ((-47) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr54);
        com.visa.cbp.setEncryptionScheme setencryptionscheme27 = new com.visa.cbp.setEncryptionScheme(intern27, 26, ((java.lang.String) objArr54[0]).intern());
        getCap = setencryptionscheme27;
        getOutputMinFrameDurationlomOqCM = new com.visa.cbp.setEncryptionScheme[]{setencryptionscheme, setencryptionscheme2, setencryptionscheme3, setencryptionscheme4, setencryptionscheme5, setencryptionscheme6, setencryptionscheme7, setencryptionscheme8, setencryptionscheme9, setencryptionscheme10, setencryptionscheme11, setencryptionscheme12, setencryptionscheme13, setencryptionscheme14, setencryptionscheme15, setencryptionscheme16, setencryptionscheme17, setencryptionscheme18, setencryptionscheme19, setencryptionscheme20, setencryptionscheme21, setencryptionscheme22, setencryptionscheme23, setencryptionscheme24, setencryptionscheme25, setencryptionscheme26, setencryptionscheme27};
        int i = getOutputMinFrameDuration + 9;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private setEncryptionScheme(java.lang.String str, int i, java.lang.String str2) {
        this.getOutputSizes = str2;
    }

    public final java.lang.String BuildConfig() {
        int i = getOutputStallDurationlomOqCM + 121;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            return this.getOutputSizes;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(int i, int i2, short s, int i3, byte b, java.lang.Object[] objArr) {
        long j;
        boolean z;
        com.visa.cbp.getEncryptionMetaData getencryptionmetadata = new com.visa.cbp.getEncryptionMetaData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getInputSizeshNQ4ISI)};
            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
            long j2 = 0;
            if (obj == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 205 - android.graphics.Color.red(0), 19 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                byte b2 = $$a[3];
                byte b3 = (byte) (b2 - 2);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(b2, b3, (byte) (b3 - 1), objArr3);
                obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            int i4 = intValue == -1 ? 1 : 0;
            if (i4 != 0) {
                byte[] bArr = getInputFormats;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i5 = 0;
                    while (i5 < length) {
                        try {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr[i5])};
                            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1365177175);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getOffsetAfter("", 0), 1838 - (android.os.SystemClock.uptimeMillis() > j2 ? 1 : (android.os.SystemClock.uptimeMillis() == j2 ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 25)).getMethod(lib.android.paypal.com.magnessdk.g.n2, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1365177175, obj2);
                            }
                            bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).byteValue();
                            i5++;
                            j2 = 0;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getInputFormats;
                    try {
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getHighSpeedVideoSizesFor)};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
                        if (obj3 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 205 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18);
                            byte b4 = $$a[3];
                            byte b5 = (byte) (b4 - 2);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(b4, b5, (byte) (b5 - 1), objArr6);
                            obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj3);
                        }
                        intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue()] ^ 2302704661859114486L)) + ((int) (getInputSizeshNQ4ISI ^ 2302704661859114486L)));
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = 2302704661859114486L;
                    intValue = (short) (((short) (getOutputSizeshNQ4ISI[i2 + ((int) (getHighSpeedVideoSizesFor ^ 2302704661859114486L))] ^ 2302704661859114486L)) + ((int) (getInputSizeshNQ4ISI ^ 2302704661859114486L)));
                    if (intValue > 0) {
                        getencryptionmetadata.values = ((i2 + intValue) - 2) + ((int) (getHighSpeedVideoSizesFor ^ j)) + i4;
                        try {
                            java.lang.Object[] objArr7 = {getencryptionmetadata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(Camera2StreamConfigurationMap), sb};
                            java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-437174028);
                            if (obj4 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1170 - android.view.View.MeasureSpec.getMode(0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 20);
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(10, 0, -1, objArr8);
                                obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-437174028, obj4);
                            }
                            ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).append(getencryptionmetadata.valueOf);
                            getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                            byte[] bArr4 = getInputFormats;
                            if (bArr4 != null) {
                                int length2 = bArr4.length;
                                byte[] bArr5 = new byte[length2];
                                int i6 = 0;
                                while (i6 < length2) {
                                    int i7 = (getHighSpeedVideoSizes + 43) % 128;
                                    getHighResolutionOutputSizeshNQ4ISI = i7;
                                    bArr5[i6] = (byte) (bArr4[i6] ^ 2302704661859114486L);
                                    i6++;
                                    int i8 = i7 + 53;
                                    getHighSpeedVideoSizes = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        int i9 = 4 / 4;
                                    }
                                }
                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 81) % 128;
                                bArr4 = bArr5;
                            }
                            if (bArr4 != null) {
                                z = true;
                            } else {
                                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
                                z = false;
                            }
                            getencryptionmetadata.ReplenishAckRequest = 1;
                            while (getencryptionmetadata.ReplenishAckRequest < intValue) {
                                if (z) {
                                    byte[] bArr6 = getInputFormats;
                                    getencryptionmetadata.values = getencryptionmetadata.values - 1;
                                    getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((byte) (((byte) (bArr6[r7] ^ 2302704661859114486L)) + s)) ^ b));
                                } else {
                                    short[] sArr = getOutputSizeshNQ4ISI;
                                    getencryptionmetadata.values = getencryptionmetadata.values - 1;
                                    getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((short) (((short) (sArr[r7] ^ 2302704661859114486L)) + s)) ^ b));
                                }
                                sb.append(getencryptionmetadata.valueOf);
                                getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                                getencryptionmetadata.ReplenishAckRequest++;
                            }
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    objArr[0] = sb.toString();
                }
            }
            j = 2302704661859114486L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        com.visa.cbp.setMac setmac = new com.visa.cbp.setMac();
        char[] cArr = getOutputStallDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 71) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.os.Process.getGidForName("") + 30833), 1971 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("m", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1013896520, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        try {
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getOutputFormats)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892366433);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 958 - android.graphics.ImageFormat.getBitsPerPixel(0), 20 - (android.view.ViewConfiguration.getTouchSlop() >> 8));
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(0, 0, -1, objArr4);
                obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892366433, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            if (!getHighSpeedVideoFpsRanges) {
                if (!getHighSpeedVideoFpsRangesFor) {
                    throw null;
                }
                throw null;
            }
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
            setmac.BuildConfig = bytes.length;
            char[] cArr3 = new char[setmac.BuildConfig];
            setmac.valueOf = 0;
            int i3 = getHighSpeedVideoSizes + 95;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            int i4 = i3 % 2;
            while (setmac.valueOf < setmac.BuildConfig) {
                cArr3[setmac.valueOf] = (char) (cArr[bytes[(setmac.BuildConfig - 1) - setmac.valueOf] + i] - intValue);
                try {
                    java.lang.Object[] objArr5 = {setmac, setmac};
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 257, 25 - (android.view.ViewConfiguration.getTouchSlop() >> 8));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(5, 0, -1, objArr6);
                        obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = 1125606877;
        getInputSizeshNQ4ISI = -1866490414;
        Camera2StreamConfigurationMap = 2002324796;
        byte[] bArr = new byte[547];
        java.lang.System.arraycopy("~\u0094\u0091g\u008ea}\u0091\u0089xk\u009d\u0098r\u0082f\u009fü0Úß)À/3ßÓÖ6%ÓÖ<Ì(Ñ\u0005\u0004\r÷\u0004ó\u0016îý\u000b\u000eä\u0014ð\t©e\u008f\u008a|\u0095{\u0088\u0089\u0080z\u0089~\u009bcp\u0086\u0083i\u0099}\u0084ÈÉÀ,Ì2ÎÛ#0ÆÃ)Ù=ÄØ\u0014þû\rä\nùøñ\u001dý\u0003ÿê\u0012\u0001÷ò\u0018è\fõ\u0087hp\u0098k\u009cy\u0081\u0092da\u008b{\u009ff\u0095Y³¶@©GY¶®FµB§_Lº¿U¥A¸¶YA¿_¡]H°£UPºJ®W\u0006õþ\nü÷\u0014ê\u001då\fü\u0004þ\u000bùë\u0005\u0013å\fî\u0015ì\rî\u0006\u0016óõð\u0003\bü\n\u0001â<Õú\nò(Ó\u001d\u0013ïú\u0018ã\u001aû\u0018\u0010Ü\u0003K±±U¿£OW¦µCF¬\\¸Ad\u009e\u009ez\u0090\u008c`li\u0089\u009ali\u0083s\u0097nÙÛ)Ù!!ÑÔ+*È2Â-!ÝÝØÛÉÇ\u0006È #ù5'&Î66ÙÒÐ\"Ò**Úß !i\u0095\u0095\u0090\u0093\u0081q±\u008fr\u009al\u0088L\u009e\u0094G·Oµ@² NX¯ONIºB¹l\u009cd¾E\u008b\u0085xdeb\u0091i²õ\u001b\rêçè\u0019\u0015ù\u0010\u0010û\u0016ä\u001cçá\u0016¨V]¦D±ZZ¸SZ¥£Iª¬ [\u0014æ\u0017\u0004á\u0012äP¬^©T»WZ¼FF¢^¾¯_G¿¶TDl\u0096\u0096r\u008en\u007f\u009e\u0094\u0091\u0092z\u0094_ \u0090jjn\u0092\u0092c\u0082hmn>ÄÄ Ý5Õ8Æ*Ô:Æ:Ú7É%Û5_¬QÙ-ÚØ/Ë'Ù<Æ6Ò+D°GE²VºDG«O¶>=Â<6Ì.È6Ò>À%ß/Ë2ØÛ$ÚÐ*È.Ð4Ø&%É-Ôööööööööööööööööööööööööööööööööö".getBytes("ISO-8859-1"), 0, bArr, 0, 547);
        getInputFormats = bArr;
        getHighSpeedVideoFpsRangesFor = true;
        getHighSpeedVideoFpsRanges = true;
        getOutputFormats = 514420647;
        getOutputStallDuration = new char[]{28237, 28254, 28232, 28262, 28228, 28251, 28240, 28233, 28243, 28278, 28219, 28230, 28201, 28200, 28244, 28247, 28250, 28238, 28248, 28249, 28276, 28222, 28234, 28239, 28235, 28253, 28245, 28242, 28252, 28218, 28205, 28216, 28221, 28211, 28277, 28203, 28217, 28215, 28202};
    }

    static void getHighSpeedVideoFpsRangesFor() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 36, -82, 2};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
    }
}
