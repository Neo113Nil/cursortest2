package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes8.dex */
public final class WalletPinManager {
    private static char[] Camera2StreamConfigurationMap = null;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static com.gemalto.mfs.mwsdk.dcm.WalletPinManager getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private com.gemalto.mfs.mwsdk.dcm.AbstractWalletPinService getOutputMinFrameDuration;

    static {
        Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.w.ra.class.getName();
        getHighSpeedVideoFpsRanges = (getOutputFormats + 7) % 128;
    }

    private WalletPinManager() {
    }

    public static com.gemalto.mfs.mwsdk.dcm.WalletPinManager getInstance() {
        com.gemalto.mfs.mwsdk.dcm.WalletPinManager walletPinManager;
        synchronized (com.gemalto.mfs.mwsdk.dcm.WalletPinManager.class) {
            getHighSpeedVideoFpsRanges = (getOutputFormats + 69) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0005\ufffb\u0002\ufffe", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, android.view.MotionEvent.axisFromString("") + 5, android.view.KeyEvent.keyCodeFromString("") + 95, true, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            int rgb = android.graphics.Color.rgb(0, 0, 0);
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            getHighSpeedVideoFpsRanges = (getOutputFormats + 117) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u0005\b\u000f\u0001\uffff￦", (-16777210) - rgb, indexOf + 4, 89 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), true, objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                if (getInputFormats == null) {
                    getInputFormats = new com.gemalto.mfs.mwsdk.dcm.WalletPinManager();
                }
                walletPinManager = getInputFormats;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return walletPinManager;
    }

    public final void bindAbstractWalletPinService(com.gemalto.mfs.mwsdk.dcm.AbstractWalletPinService abstractWalletPinService) {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 43) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0005\ufffb\u0002\ufffe", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, 95 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{0, 9, 0, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (abstractWalletPinService == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{9, 32, 0, 30}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        this.getOutputMinFrameDuration = abstractWalletPinService;
        util.h.xy.w.ra.m27672().m27674(this.getOutputMinFrameDuration);
        getOutputFormats = (getHighSpeedVideoFpsRanges + 1) % 128;
    }

    @util.h.xy.a.a
    public final boolean isWalletPinSet() throws com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0005\ufffb\u0002\ufffe", 3 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, 95 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        getHighSpeedVideoFpsRanges = (getOutputFormats + 1) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u000b\u0007\u0004\u000b�￢\u0001\u0004", mirror - '(', -((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 93, true, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2435) {
                getHighSpeedVideoFpsRanges = (getOutputFormats + 69) % 128;
                if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2433) {
                    throw new com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException(com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_NOT_SUPPORTED.toString());
                }
            }
            boolean m27675 = util.h.xy.w.ra.m27672().m27675();
            getHighSpeedVideoFpsRanges = (getOutputFormats + 65) % 128;
            return m27675;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void invokeSetWalletPin() throws com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0005\ufffb\u0002\ufffe", 5 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, android.widget.ExpandableListView.getPackedPositionType(0L) + 95, true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{41, 8, 145, 0}, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (this.getOutputMinFrameDuration == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ufff0\u000b\u0006￭\u0011\u0002\t\t\ufffe\ufff4\u0011\u0000\ufffe\u000f\u0011\u0010\uffff\uffdeﾽ\u0002\u000f\u0012\u0004\u0006\u0003\u000b\f￠\u0011\u0010\u000f\u0006\u0003ﾽ\u0002\u0000\u0006\u0013\u000f\u0002", 40 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 'L' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 117, true, objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2435) {
            int i = getOutputFormats + 111;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2433) {
                    throw new com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException(com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_NOT_SUPPORTED.toString());
                }
            } else {
                util.h.xy.f.b.f2201.m26775();
                util.h.xy.u.b bVar = util.h.xy.u.b.f2433;
                throw null;
            }
        }
        util.h.xy.w.ra.m27672().m27679();
        getOutputFormats = (getHighSpeedVideoFpsRanges + 103) % 128;
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 77) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
            raVar.f2649++;
            int i5 = getHighSpeedVideoFpsRangesFor + 7;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 4;
            }
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 97) % 128;
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        int i7 = getHighSpeedVideoFpsRangesFor + 3;
        getHighSpeedVideoSizes = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    public final void invokeChangeWalletPin() throws com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0005\ufffb\u0002\ufffe", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, 95 - (android.view.KeyEvent.getMaxKeyCode() >> 16), true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{49, 8, 0, 5}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (this.getOutputMinFrameDuration == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ufff0\u000b\u0006￭\u0011\u0002\t\t\ufffe\ufff4\u0011\u0000\ufffe\u000f\u0011\u0010\uffff\uffdeﾽ\u0002\u000f\u0012\u0004\u0006\u0003\u000b\f￠\u0011\u0010\u000f\u0006\u0003ﾽ\u0002\u0000\u0006\u0013\u000f\u0002", 40 - android.view.KeyEvent.keyCodeFromString(""), android.text.TextUtils.getCapsMode("", 0, 0) + 28, android.text.TextUtils.indexOf("", "", 0) + 116, true, objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2435) {
            int i = getOutputFormats + 35;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2433) {
                    throw new com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException(com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_NOT_SUPPORTED.toString());
                }
            } else {
                util.h.xy.f.b.f2201.m26775();
                util.h.xy.u.b bVar = util.h.xy.u.b.f2433;
                throw null;
            }
        }
        util.h.xy.w.ra.m27672().m27676();
        getOutputFormats = (getHighSpeedVideoFpsRanges + 51) % 128;
    }

    public final void askWalletPinForLVT(boolean z) throws com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0005\ufffb\u0002\ufffe", 4 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777220, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 95, true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{57, 9, 0, 2}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (this.getOutputMinFrameDuration != null) {
            if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2435 && util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2433) {
                throw new com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException(com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_NOT_SUPPORTED.toString());
            }
            util.h.xy.w.ra.m27672().m27677(z);
            return;
        }
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ufff0\u000b\u0006￭\u0011\u0002\t\t\ufffe\ufff4\u0011\u0000\ufffe\u000f\u0011\u0010\uffff\uffdeﾽ\u0002\u000f\u0012\u0004\u0006\u0003\u000b\f￠\u0011\u0010\u000f\u0006\u0003ﾽ\u0002\u0000\u0006\u0013\u000f\u0002", 40 - android.view.View.MeasureSpec.getMode(0), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 29, 116 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), true, objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final boolean isAskWalletPinForLVT() throws com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 53) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0005\ufffb\u0002\ufffe", 4 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, 95 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0006\u0003￤\uffff\ufff7\r\u0006￼\u0002\r", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10, android.view.KeyEvent.normalizeMetaState(0) + 9, android.view.View.combineMeasuredStates(0, 0) + 91, false, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2435 && util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2433) {
            throw new com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException(com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_NOT_SUPPORTED.toString());
        }
        boolean m27678 = util.h.xy.w.ra.m27672().m27678();
        getOutputFormats = (getHighSpeedVideoFpsRanges + 93) % 128;
        return m27678;
    }

    public final int getRemainingRetries() throws com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0005\ufffb\u0002\ufffe", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, 3 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 96, true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{66, 7, 0, 4}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2435) {
            getHighSpeedVideoFpsRanges = (getOutputFormats + 65) % 128;
            if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2433) {
                throw new com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException(com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_NOT_SUPPORTED.toString());
            }
        }
        int m27673 = util.h.xy.w.ra.m27672().m27673();
        getHighSpeedVideoFpsRanges = (getOutputFormats + 39) % 128;
        return m27673;
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighSpeedVideoFpsRangesFor + 61;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        byte[] bArr = bytes;
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i3) {
                if (bArr[maVar.f2631] == 1) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 5) % 128;
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 25) % 128;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i7 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i7);
        }
        char[] cArr6 = new char[i3];
        maVar.f2631 = 0;
        while (maVar.f2631 < i3) {
            cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
            maVar.f2631++;
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr6);
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = -1231763833;
        Camera2StreamConfigurationMap = new char[]{42356, 42252, 42254, 42257, 42268, 42341, 42336, 42259, 42254, 42343, 42284, 42266, 42260, 42291, 42265, 42271, 42297, 42299, 42290, 42281, 42294, 42241, 42301, 42294, 42241, 42303, 42289, 42293, 42289, 42299, 42241, 42296, 42294, 42303, 42292, 42286, 42286, 42295, 42252, 42251, 42289, 42285, 42425, 42427, 42370, 42385, 42387, 42370, 42425, 42361, 42342, 42336, 42259, 42254, 42254, 42254, 42256, 42357, 42254, 42252, 42260, 42262, 42254, 42257, 42346, 42336, 42314, 42336, 42259, 42254, 42249, 42255, 42257};
    }
}
