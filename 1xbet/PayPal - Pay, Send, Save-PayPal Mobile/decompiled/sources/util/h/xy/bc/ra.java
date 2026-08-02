package util.h.xy.bc;

/* loaded from: classes5.dex */
final class ra extends javax.net.ssl.SSLSocketFactory {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static short[] getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static byte[] getOutputMinFrameDuration;
    private static final java.util.List<java.lang.String> getOutputStallDuration;
    private static int getOutputStallDurationlomOqCM;
    private final javax.net.ssl.SSLSocketFactory getOutputSizeshNQ4ISI;

    static {
        getHighSpeedVideoSizes();
        java.lang.String[] strArr = new java.lang.String[25];
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (75 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0012\u001b\b\u0005 \u0002\b\u0005#\r\u000e\b \u0011 \u0000\u0006\n\u001d\u000e\u0010\u0011", 22 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr);
            strArr[0] = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (67 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u0012\u001b\b\u0005 \u0002\b\u0005\f\u0010\u000e\u0004 \u0011 \u0000\u0006\n\u0018\u000e\u000b\u001a", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 22, objArr2);
            strArr[1] = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1770118921, (short) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), (byte) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-33) - android.widget.ExpandableListView.getPackedPositionGroup(0L), (-2002292140) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
            strArr[2] = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770118949 - android.view.View.resolveSize(0, 0), (short) android.graphics.Color.red(0), (byte) android.text.TextUtils.getTrimmedLength(""), (-33) - android.graphics.Color.alpha(0), (-2002292140) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
            strArr[3] = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1770118989, (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.widget.ExpandableListView.getPackedPositionType(0L) - 33, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() - 2002292139, objArr5);
            strArr[4] = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119027 - android.text.TextUtils.getOffsetAfter("", 0), (short) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-33) - android.view.KeyEvent.normalizeMetaState(0), (-2002292140) - android.view.Gravity.getAbsoluteGravity(0, 0), objArr6);
            strArr[5] = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (78 - android.widget.ExpandableListView.getPackedPositionType(0L)), "\u0012\u001b\b\u0005\u0002\u0014\u0015\b\u0002\b\u0011\u0007 \b\u001c\u0013\u001b\u000f\b #\b\u0005\u000e\u0010\u0011\u0005 \f \u0005\b\b\u001b\u000e\u0006㗼", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, objArr7);
            strArr[6] = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (android.graphics.Color.red(0) + 23), "\u0012\u001b\b\u0005\u0002\u0014\u0015\b\u0002\b\u0002\u0014\u0017\b \b\u001c\u0013\u001b\u000f\b\u0014\b\u001b\u000f\b\u001d\u000e\b\u0004\u0015\u0005\u001c\u0000\u001e\r\t\u0010\u0005\b\b\u001b\f\u0010㗃", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45, objArr8);
            strArr[7] = ((java.lang.String) objArr8[0]).intern();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (32 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), "\u0012\u001b\b\u0005\u0002\u0014\u0015\b\u0002\b\u0011\u0007 \b\u001c\u0013\u001b\u000f\b\u0014\b\u001b\u000f\b\u001d\u000e\b\u0004\u0015\u0005\u001c\u0000\u001e\r\t\u0010\u0005\b\b\u001b\f\u0010㗍", 43 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
            strArr[8] = ((java.lang.String) objArr9[0]).intern();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119064 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (short) android.text.TextUtils.getTrimmedLength(""), (byte) (android.view.ViewConfiguration.getTapTimeout() >> 16), (-32) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.graphics.Color.alpha(0) - 2002292140, objArr10);
            strArr[9] = ((java.lang.String) objArr10[0]).intern();
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1770119099, (short) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 33, (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 2002292140, objArr11);
            strArr[10] = ((java.lang.String) objArr11[0]).intern();
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (3 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0012\u001b\b\u0005\u0015\b\u0002\b\u0011\u0007 \b\u001c\u0013\u001b\u000f\b #\b\u0001 \u000e\u000b\u0005 \f \u0005\b\b\u001b\f\u0010㖯", 35 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr12);
            strArr[11] = ((java.lang.String) objArr12[0]).intern();
            getOutputStallDurationlomOqCM = (getInputFormats + 79) % 128;
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119135 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (short) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 34, (-2002292140) - android.text.TextUtils.getTrimmedLength(""), objArr13);
            strArr[12] = ((java.lang.String) objArr13[0]).intern();
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (71 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0012\u001b\b\u0005\u0015\b\u0002\b\u0011\u0007 \b\u001c\u0013\u001b\u000f\b\u0014\u0018 \u001e\u001a\u001c\u0012 \b#\r\u000e\b\u000f\u001a\u0014\b\u0006\n\u001d\u000e\u0010\u0011", 40 - android.view.View.resolveSizeAndState(0, 0, 0), objArr14);
            strArr[13] = ((java.lang.String) objArr14[0]).intern();
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1770119170, (short) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 34, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 2002292140, objArr15);
            strArr[14] = ((java.lang.String) objArr15[0]).intern();
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119209 - android.view.View.resolveSizeAndState(0, 0, 0), (short) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 33, android.text.TextUtils.getCapsMode("", 0, 0) - 2002292140, objArr16);
            strArr[15] = ((java.lang.String) objArr16[0]).intern();
            getInputFormats = (getOutputStallDurationlomOqCM + 83) % 128;
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119254 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (-33) - android.graphics.Color.alpha(0), android.view.View.MeasureSpec.getSize(0) - 2002292140, objArr17);
            strArr[16] = ((java.lang.String) objArr17[0]).intern();
            getOutputStallDurationlomOqCM = (getInputFormats + 109) % 128;
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
            short maximumDrawingCacheSize = (short) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte axisFromString = (byte) (android.view.MotionEvent.axisFromString("") + 1);
            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
            getOutputStallDurationlomOqCM = (getInputFormats + 91) % 128;
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119297 - (intValue >> 22), maximumDrawingCacheSize, axisFromString, (maxKeyCode >> 16) - 33, (-2002292140) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr18);
            strArr[17] = ((java.lang.String) objArr18[0]).intern();
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119338 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) android.text.TextUtils.getTrimmedLength(""), (-33) - android.graphics.Color.red(0), (-2002292140) - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr19);
            strArr[18] = ((java.lang.String) objArr19[0]).intern();
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (android.view.View.MeasureSpec.getSize(0) + 70), "\u0012\u001b\b\u0005\u0015\b\u0002\b\u0011\u0007 \b\u001c\u0013\u001b\u000f\b\u0014\u0018 \u001e\u001a\u001c\u0012 \b#\r\u000e\b \u0011 \u0000\u0006\n\u001d\u000e\u0010\u0011", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, objArr20);
            strArr[19] = ((java.lang.String) objArr20[0]).intern();
            getOutputStallDurationlomOqCM = (getInputFormats + 3) % 128;
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119381 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (short) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) android.text.TextUtils.getCapsMode("", 0, 0), (-33) - android.text.TextUtils.getOffsetBefore("", 0), (-2002292140) - android.graphics.Color.argb(0, 0, 0, 0), objArr21);
            strArr[20] = ((java.lang.String) objArr21[0]).intern();
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119421 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (short) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 34, (-2002292140) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr22);
            strArr[21] = ((java.lang.String) objArr22[0]).intern();
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770119465 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 33, (-2002292139) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr23);
            strArr[22] = ((java.lang.String) objArr23[0]).intern();
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.getOffsetAfter("", 0) + 1770119509, (short) android.widget.ExpandableListView.getPackedPositionGroup(0L), (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 33, (-2002292139) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr24);
            strArr[23] = ((java.lang.String) objArr24[0]).intern();
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1770119551, (short) android.view.KeyEvent.normalizeMetaState(0), (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), android.graphics.Color.argb(0, 0, 0, 0) - 33, (-2002292140) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr25);
            strArr[24] = ((java.lang.String) objArr25[0]).intern();
            getOutputStallDuration = java.util.Arrays.asList(strArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public ra(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        this.getOutputSizeshNQ4ISI = sSLSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i, boolean z) throws java.io.IOException {
        getInputFormats = (getOutputStallDurationlomOqCM + 67) % 128;
        java.net.Socket createSocket = this.getOutputSizeshNQ4ISI.createSocket(socket, str, i, z);
        getHighSpeedVideoFpsRangesFor(createSocket);
        int i2 = getInputFormats + 27;
        getOutputStallDurationlomOqCM = i2 % 128;
        if (i2 % 2 == 0) {
            return createSocket;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoFpsRangesFor(java.net.Socket socket) {
        javax.net.ssl.SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) socket;
        sSLSocket.setEnabledCipherSuites(getHighResolutionOutputSizeshNQ4ISI(sSLSocket.getEnabledCipherSuites()));
        java.util.List asList = java.util.Arrays.asList(sSLSocket.getSupportedProtocols());
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1770118914 - android.view.View.combineMeasuredStates(0, 0), (short) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), (byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 33, android.widget.ExpandableListView.getPackedPositionChild(0L) - 2002292139, objArr);
            if (!asList.contains(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (android.view.View.resolveSize(0, 0) + 113), "\u0012\u001b\n\u001d #㘙", android.graphics.Color.alpha(0) + 7, objArr2);
                sSLSocket.setEnabledProtocols(new java.lang.String[]{((java.lang.String) objArr2[0]).intern()});
                getOutputStallDurationlomOqCM = (getInputFormats + 115) % 128;
                return;
            }
            getInputFormats = (getOutputStallDurationlomOqCM + 59) % 128;
            java.lang.String[] strArr = new java.lang.String[2];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (113 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0012\u001b\n\u001d #㘙", 7 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
            strArr[0] = ((java.lang.String) objArr3[0]).intern();
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
            short modifierMetaStateMask = (short) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1);
            byte rgb = (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
            int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
            getInputFormats = (getOutputStallDurationlomOqCM + 93) % 128;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((intValue >> 22) + 1770118914, modifierMetaStateMask, rgb, capsMode - 33, (-2002292140) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr4);
            strArr[1] = ((java.lang.String) objArr4[0]).intern();
            sSLSocket.setEnabledProtocols(strArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static java.lang.String[] getHighResolutionOutputSizeshNQ4ISI(java.lang.String[] strArr) {
        java.util.LinkedList linkedList = new java.util.LinkedList(java.util.Arrays.asList(strArr));
        linkedList.retainAll(getOutputStallDuration);
        java.lang.String[] strArr2 = (java.lang.String[]) linkedList.toArray(new java.lang.String[linkedList.size()]);
        getOutputStallDurationlomOqCM = (getInputFormats + 21) % 128;
        return strArr2;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        getOutputStallDurationlomOqCM = (getInputFormats + 65) % 128;
        java.lang.String[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getOutputSizeshNQ4ISI.getDefaultCipherSuites());
        int i = getInputFormats + 107;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        int i = getOutputStallDurationlomOqCM + 33;
        getInputFormats = i % 128;
        java.lang.String[] supportedCipherSuites = this.getOutputSizeshNQ4ISI.getSupportedCipherSuites();
        if (i % 2 != 0) {
            return getHighResolutionOutputSizeshNQ4ISI(supportedCipherSuites);
        }
        getHighResolutionOutputSizeshNQ4ISI(supportedCipherSuites);
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i, java.net.InetAddress inetAddress, int i2) throws java.io.IOException {
        int i3 = getInputFormats + 95;
        getOutputStallDurationlomOqCM = i3 % 128;
        if (i3 % 2 == 0) {
            java.net.Socket createSocket = this.getOutputSizeshNQ4ISI.createSocket(str, i, inetAddress, i2);
            getHighSpeedVideoFpsRangesFor(createSocket);
            int i4 = getOutputStallDurationlomOqCM + 73;
            getInputFormats = i4 % 128;
            if (i4 % 2 != 0) {
                return createSocket;
            }
            throw null;
        }
        getHighSpeedVideoFpsRangesFor(this.getOutputSizeshNQ4ISI.createSocket(str, i, inetAddress, i2));
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i, java.net.InetAddress inetAddress2, int i2) throws java.io.IOException {
        int i3 = getInputFormats + 91;
        getOutputStallDurationlomOqCM = i3 % 128;
        if (i3 % 2 == 0) {
            java.net.Socket createSocket = this.getOutputSizeshNQ4ISI.createSocket(inetAddress, i, inetAddress2, i2);
            getHighSpeedVideoFpsRangesFor(createSocket);
            return createSocket;
        }
        getHighSpeedVideoFpsRangesFor(this.getOutputSizeshNQ4ISI.createSocket(inetAddress, i, inetAddress2, i2));
        throw new java.lang.ArithmeticException();
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i) throws java.io.IOException {
        int i2 = getOutputStallDurationlomOqCM + 57;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            java.net.Socket createSocket = this.getOutputSizeshNQ4ISI.createSocket(inetAddress, i);
            getHighSpeedVideoFpsRangesFor(createSocket);
            return createSocket;
        }
        getHighSpeedVideoFpsRangesFor(this.getOutputSizeshNQ4ISI.createSocket(inetAddress, i));
        throw new java.lang.ArithmeticException();
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i) throws java.io.IOException {
        getInputFormats = (getOutputStallDurationlomOqCM + 21) % 128;
        java.net.Socket createSocket = this.getOutputSizeshNQ4ISI.createSocket(str, i);
        getHighSpeedVideoFpsRangesFor(createSocket);
        getOutputStallDurationlomOqCM = (getInputFormats + 107) % 128;
        return createSocket;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        util.h.xy.bc.ra.getHighSpeedVideoFpsRangesFor = (r8 + 107) % 128;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
        if (i6 == -1) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = getOutputMinFrameDuration;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i6 = (byte) (((byte) (getOutputMinFrameDuration[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            } else {
                i6 = (short) (((short) (getHighSpeedVideoFpsRanges[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                int i8 = getHighSpeedVideoFpsRangesFor + 71;
                getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        if (i6 > 0) {
            int i10 = getHighResolutionOutputSizeshNQ4ISI;
            int i11 = i10 + 49;
            getHighSpeedVideoFpsRangesFor = i11 % 128;
            if (i11 % 2 == 0) {
                i4 = ((i + i6) >> 2) >>> ((int) (getHighSpeedVideoSizesFor + 2689713159175858216L));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputMinFrameDuration;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i12 = 0; i12 < length2; i12++) {
                    bArr4[i12] = (byte) (bArr3[i12] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoFpsRanges;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r0.f2641 == r0.f2636) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        r0.f2639 = r0.f2641 / r2;
        r0.f2640 = r0.f2641 % r2;
        r0.f2637 = r0.f2636 / r2;
        r0.f2635 = r0.f2636 % r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if (r0.f2640 != r0.f2635) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        r0.f2639 = ((r0.f2639 + r2) - 1) % r2;
        r0.f2637 = ((r0.f2637 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if (r0.f2639 != r0.f2637) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        util.h.xy.bc.ra.getHighSpeedVideoFpsRangesFor = (util.h.xy.bc.ra.getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
        r0.f2640 = ((r0.f2640 + r2) - 1) % r2;
        r0.f2635 = ((r0.f2635 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0103, code lost:
    
        r7 = r0.f2639;
        r8 = r0.f2635;
        r9 = r0.f2637;
        r10 = r0.f2640;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        r3[r0.f2638] = (char) (r0.f2641 - r12);
        r3[r0.f2638 + 1] = (char) (r0.f2636 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0.f2641 == r0.f2636) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizes);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 119;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638];
                } else {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            cArr3[i5] = (char) (cArr3[i5] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = 1910454054;
        getInputSizeshNQ4ISI = -408872968;
        getOutputFormats = -1862690344;
        byte[] bArr = new byte[679];
        java.lang.System.arraycopy("?Ý%cûß $ÙÛ)!-,òÝ%Ú\u0000Õ%')÷&)!ÝÚ!Ý<Ôß ßÙÛ)!-,ÊÒ$0ÿÞÙ\nÔÖÜ:Ï,Ó* Æ6×Ù&>Â%ÜÙ&>Ôß ß$Ý*!-,ÊÒ$0ñÙÛ\u000bÔÖÜ:Ï,Ó* Æ6×Ù&>Â%ÜÙ&>Ôß ÝÙÛ)!-,ÊÒ$0ÿÞÙ\nÔÖÜ:Ï,Ó* Æ6Ù+Â%ÜÙ&>Ôß ÛÙÛ)!-,ÄÙ'<ÿÞÙ\nÔÖÜ:Ï,Ó* Æ6Ù+Â%Ü=Ôß ÛÙÛ)!-,ÄÙ'<ñÙÛ\u000bÔÖÜ:Ï,Ó* Æ6Ù+Â%Ü=Ôß Û$Ý*!-,ÊÒ$0ñÙÛ\u000bÔÖÜ:Ï,Ó* Æ6Ù+Â%Ü=Ôß ÐÙÛ)!-,ÄÙ'<ñÙÛ\u000bÆ %Øß Ô&<Ï,Ó* Æ6Ù+Â%Ü=Ôß ÔÙÛ)!-,ÄÙ'<ÿÞÙ\nÆ %Øß Ô&<Ï,Ó* Æ6×Ù&>Â%ÜÙ&>Ôß Ô$Ý*!-,ÄÙ'<ñÙÛ\u000bÆ %Øß Ô&<Ï,Ó* Æ6×Ù&>Â%ÜÙ&>Ôß ÒÙÛ)!-,ÄÙ'<ÿÞÙ\nÆ %Øß Ô&<Ï,Ó* Æ6Ù+Â%ÜÙ&>Ôß Ò$Ý*!-,ÄÙ'<ñÙÛ\u000bÆ %Øß Ô&<Ï,Ó* Æ6Ù+Â%ÜÙ&>Ôß Ð$Ý*!-,ÊÒ$0ñÙÛ\u000bÆ %Øß Ô&<Ï,Ó* Æ6Ù+Â%Ü=Ôß ÔÙÛ)!-,ÊÒ$0ÿÞÙ\nÆ %Øß Ô&<Ï,Ó* Æ6×Ù&>Â%ÜÙ&>Ôß Ô$Ý*!-,ÊÒ$0ñÙÛ\u000bÆ %Øß Ô&<Ï,Ó* Æ6×Ù&>Â%ÜÙ&>Ôß ÒÙÛ)!-,ÊÒ$0ÿÞÙ\nÆ %Øß Ô&<Ï,Ó* Æ6Ù+Â%ÜÙ&>Ôß Ò$Ý*!-,ÊÒ$0ñÙÛ\u000bÆ %Øß Ô&<Ï,Ó* Æ6Ù+Â%ÜÙ&>Ôß ".getBytes("ISO-8859-1"), 0, bArr, 0, 679);
        getOutputMinFrameDuration = bArr;
        Camera2StreamConfigurationMap = new char[]{38478, 38469, 41859, 41875, 41861, 38464, 38466, 38465, 41956, 41876, 41964, 41871, 41967, 41870, 41887, 41961, 41962, 41966, 38467, 38471, 41880, 41864, 41877, 41868, 41872, 41867, 41885, 41886, 41898, 41960, 41873, 41965, 41881, 38468, 41970, 41883};
        getHighSpeedVideoSizes = (char) 38464;
    }
}
