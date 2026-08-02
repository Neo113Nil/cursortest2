package util.h.xy.s;

/* loaded from: classes5.dex */
public class rd {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static char[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private util.h.xy.s.mc ArtificialStackFrames;
    private byte[] CoroutineDebuggingKt;
    private byte[] _BOUNDARY;
    private byte[] _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f7082a;
    private byte[] accessartificialFrame;
    private byte[] b;
    private byte[] c;
    private byte[] coroutineBoundary;
    private byte[] coroutineCreation;
    private byte[][] getARTIFICIAL_FRAME_PACKAGE_NAME;
    private byte[] getHighSpeedVideoSizesFor;
    private byte[] getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI = 0;
    private byte[] isOutputSupportedFor;
    private byte[] isOutputSupportedForhNQ4ISI;
    private byte[][] toString;
    private int unwrapAs;

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoSizes = util.h.xy.s.rd.class.getName();
        int i = getHighSpeedVideoFpsRangesFor + 13;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] m27349() {
        byte[] bArr;
        byte[] m25024 = util.h.xy.al.rd.m25024(new byte[][]{new byte[]{42}}, new byte[][]{getHighSpeedVideoFpsRanges()});
        util.h.xy.s.mc mcVar = this.ArtificialStackFrames;
        if (mcVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 65) % 128;
            bArr = util.h.xy.al.rd.m25024(new byte[][]{new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE}}, new byte[][]{mcVar.m27222()});
        } else {
            bArr = null;
        }
        byte[] m25090 = util.h.xy.ar.b.m25090(m25024, bArr);
        if (m25090 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 23) % 128;
            int length = m25090.length;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 35;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return m25090;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 115) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 103) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 83) % 128;
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private byte[] getHighSpeedVideoFpsRanges() {
        int i = this.unwrapAs;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = new byte[i][];
        this.toString = new byte[i][];
        if (i > 0) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
            this.getValidOutputFormatsForInputhNQ4ISI = 0;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\ufff6\u0014\ufff9\u0005\ufff8\u0014￼\ufff6\t\ufff9\ufffe", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 11, 8 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 80, true, objArr);
            ((java.lang.String) objArr[0]).intern();
            getHighSpeedVideoFpsRangesFor(new byte[]{1}, this.getHighSpeedVideoSizesFor);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{0, 7, 15, 5}, "\u0000\u0000\u0000\u0000\u0001\u0000\u0001", objArr2);
            ((java.lang.String) objArr2[0]).intern();
            getHighSpeedVideoFpsRangesFor(new byte[]{com.visa.cbp.getEncExpo.startTransaction}, this.getOutputFormats);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{7, 22, 84, 1}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr3);
            ((java.lang.String) objArr3[0]).intern();
            getHighSpeedVideoFpsRangesFor(new byte[]{-63}, this.getOutputStallDurationlomOqCM);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0005\u0014\u0001\ufff6\ufff7\ufffa\u0001\t\ufff6￼\u0014\ufff6\u0005", 13 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 7 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 80 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), false, objArr4);
            ((java.lang.String) objArr4[0]).intern();
            getHighSpeedVideoFpsRangesFor(new byte[]{-62}, this.coroutineCreation);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{29, 22, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 9}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000", objArr5);
            ((java.lang.String) objArr5[0]).intern();
            getHighSpeedVideoFpsRangesFor(new byte[]{-61}, this.b);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0012\ufff6\t\u0000\u0012\u0000\u0002\ufff7\ufff8\uffff\u0007\ufff4\ufffa", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 13, ':' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 82, false, objArr6);
            ((java.lang.String) objArr6[0]).intern();
            getHighSpeedVideoFpsRangesFor(new byte[]{-107}, this.getOutputSizes);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\ufff7\u0013\ufff9\u0002�\u0000\ufff7\ufff9\ufff8\u0013\ufffb\ufff5\b\u0007\u0002\u0003�\b�\ufff8\u0002\u0003", 22 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 13 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 81 - android.view.View.MeasureSpec.getMode(0), true, objArr7);
            ((java.lang.String) objArr7[0]).intern();
            getHighSpeedVideoFpsRangesFor(new byte[]{-101}, this.getOutputStallDuration);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0007\ufffa\ufffe\ufffb\ufffe\t\u0003\ufffa\ufff9\ufffe\u0014\u0003\ufffe\ufff6\u0002\u0004\ufff9\u0014￼\ufff6\t", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 21, 22 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 81, true, objArr8);
            ((java.lang.String) objArr8[0]).intern();
            getHighSpeedVideoFpsRangesFor(new byte[]{-60}, this.getOutputSizeshNQ4ISI);
            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 13;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 5;
            }
            try {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\ufff8\u0007\ufff4\ufff7\u0012\u0001\u0002￼\u0007\ufff4\u0005￼\u0003\u000b\ufff8\u0012\ufffa\ufff4\u0007", resolveSizeAndState + 19, (jumpTapTimeout >> 16) + 19, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 82, true, objArr9);
                ((java.lang.String) objArr9[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-111}, this.getOutputMinFrameDurationlomOqCM);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0005\u0007\ufff7\u0004\u0011\ufff3\u0002\u0002\u0011\ufff6\ufff3\u0006\ufff3\u0006\ufff3\ufff9\u0011\ufff5\u0002\ufff6\u0011\ufffb\u0005", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 13, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 83, false, objArr10);
                ((java.lang.String) objArr10[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{19}, this.isOutputSupportedForhNQ4ISI);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\ufff5\u0005\u0003\u0003\ufff9\u000f\ufff7\ufff1\u0004￼\u0002\u0005\u000f\u0002", 15 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 10, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 85, true, objArr11);
                ((java.lang.String) objArr11[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-59}, this._BOUNDARY);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(true, new int[]{51, 23, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", objArr12);
                ((java.lang.String) objArr12[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-58}, this.accessartificialFrame);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\ufffb\ufff9\ufffb\ufff6\u0011￦\u0011\u0006\u0005\ufff3\ufffe\u0011\ufff9\ufff3\u0006\u0000\ufff3\u0002\u0011\ufff8\u0001\u0011\u0005\u0006", 23 - android.widget.ExpandableListView.getPackedPositionChild(0L), 15 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.graphics.Color.alpha(0) + 83, true, objArr13);
                ((java.lang.String) objArr13[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-57}, this.f7082a);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\b\ufff8\u0001\ufff6\ufff8\u0012\u0001\b\u0000\ufff5\ufff8\u0005\u0007\ufff4\ufffa\u0012\u0003\ufff4\u0001\u0012\u0006\ufff8\u0004", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 23, 12 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 82, false, objArr14);
                ((java.lang.String) objArr14[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-110}, this.coroutineBoundary);
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0012\ufffa\ufff4\u0007\u0005\ufff4\u0003", android.graphics.ImageFormat.getBitsPerPixel(0) + 8, 4 - android.view.KeyEvent.getDeadChar(0, 0), android.view.View.getDefaultSize(0, 0) + 82, true, objArr15);
                ((java.lang.String) objArr15[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-102}, this.isOutputSupportedFor);
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0011\ufff9\ufff3\u0006\ufff3\u0006\ufff3\ufff6\u0011\u000b\u0006\u0004\ufff3\u0002\u0011\ufff6\u0004\ufffb\ufffa\u0006", android.text.TextUtils.getCapsMode("", 0, 0) + 20, android.text.TextUtils.getCapsMode("", 0, 0) + 4, 83 - android.view.View.MeasureSpec.getSize(0), true, objArr16);
                ((java.lang.String) objArr16[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-56}, this.CoroutineDebuggingKt);
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(true, new int[]{74, 28, 142, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001", objArr17);
                ((java.lang.String) objArr17[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-109}, this.getOutputMinFrameDuration);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\ufff6\ufffb\u0011\u0004\ufff7\u0006\u0005\ufff7\u0007\u0003\ufff7\u0004\u0011\u0000\ufff7�\u0001\u0006\u0011\ufff9\ufff3\u0006", 22 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), 22 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 83 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), true, objArr18);
                ((java.lang.String) objArr18[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-55}, this._CREATION);
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(false, new int[]{102, 18, 131, 0}, "\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", objArr19);
                ((java.lang.String) objArr19[0]).intern();
                getHighSpeedVideoFpsRangesFor(new byte[]{-104}, this.c);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        byte[] m25024 = util.h.xy.al.rd.m25024(this.getARTIFICIAL_FRAME_PACKAGE_NAME, this.toString);
        if (m25024 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 125) % 128;
            int length = m25024.length;
        }
        return m25024;
    }

    private void getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 65;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr2 != null && bArr2.length > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (i + 53) % 128;
            byte[][] bArr3 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            int i3 = this.getValidOutputFormatsForInputhNQ4ISI;
            bArr3[i3] = bArr;
            byte[][] bArr4 = this.toString;
            this.getValidOutputFormatsForInputhNQ4ISI = i3 + 1;
            bArr4[i3] = bArr2;
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m27354() {
        int i = getHighSpeedVideoFpsRangesFor + 83;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        byte[] bArr = this.getOutputFormats;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27360(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 1;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        int i3 = i % 2;
        if (i3 != 0) {
            this.getOutputFormats = bArr;
            if (bArr != null && bArr.length > 0) {
                getHighSpeedVideoFpsRangesFor = i2;
                this.unwrapAs = i3 == 0 ? this.unwrapAs : this.unwrapAs + 1;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 25) % 128;
            return;
        }
        this.getOutputFormats = bArr;
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] m27356() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 105) % 128;
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        int i2 = i + 53;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m27353(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor + 113;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 == 0) {
            this.getHighSpeedVideoSizesFor = bArr;
            if (bArr != null && bArr.length > 0) {
                this.unwrapAs++;
            }
            int i3 = i2 + 47;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.getHighSpeedVideoSizesFor = bArr;
        throw new java.lang.ArithmeticException();
    }

    private static void Camera2StreamConfigurationMap(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 75) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getInputFormats;
        if (cArr != null) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 113) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 23) % 128;
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
                if (bytes[maVar.f2631] == 1) {
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 77) % 128;
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 83) % 128;
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 117) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27355(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 105;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            this.isOutputSupportedFor = bArr;
            if (bArr != null && bArr.length > 0) {
                this.unwrapAs++;
                getHighSpeedVideoFpsRangesFor = (i + 83) % 128;
            }
            int i3 = getHighSpeedVideoFpsRangesFor + 61;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.isOutputSupportedFor = bArr;
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public byte[] m27361() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 43;
        getHighSpeedVideoFpsRangesFor = i % 128;
        byte[] bArr = this.getOutputStallDurationlomOqCM;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27348(byte[] bArr) {
        this.getOutputStallDurationlomOqCM = bArr;
        if (bArr != null && bArr.length > 0) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (i + 67) % 128;
            this.unwrapAs++;
            getHighSpeedVideoFpsRangesFor = (i + 5) % 128;
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 69;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] m27346() {
        int i = (getHighSpeedVideoFpsRangesFor + 13) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        byte[] bArr = this.coroutineCreation;
        int i2 = i + 33;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27345(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 1) % 128;
        this.coroutineCreation = bArr;
        if (bArr != null) {
            getHighSpeedVideoFpsRangesFor = (i + 105) % 128;
            if (bArr.length > 0) {
                int i2 = i + 57;
                int i3 = i2 % 128;
                getHighSpeedVideoFpsRangesFor = i3;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                this.unwrapAs++;
                getHighResolutionOutputSizeshNQ4ISI = (i3 + 121) % 128;
            }
        }
        int i4 = getHighSpeedVideoFpsRangesFor + 5;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public void m27362(byte[] bArr) {
        this.b = bArr;
        if (bArr != null) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 91;
            int i2 = i % 128;
            getHighSpeedVideoFpsRangesFor = i2;
            if (i % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length > 0) {
                this.unwrapAs++;
                getHighResolutionOutputSizeshNQ4ISI = (i2 + 55) % 128;
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m27335() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 49;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 != 0) {
            this.getOutputSizes = new byte[]{com.google.common.base.Ascii.ETB};
            this.unwrapAs++;
            int i3 = i2 + 27;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.getOutputSizes = new byte[]{com.google.common.base.Ascii.ETB};
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public void m27357(byte[] bArr) {
        this.getOutputStallDuration = bArr;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 33;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        this.unwrapAs = i2 % 2 == 0 ? this.unwrapAs - 1 : this.unwrapAs + 1;
        getHighSpeedVideoFpsRangesFor = (i + 49) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m27339(byte[] bArr) {
        this.getOutputSizeshNQ4ISI = bArr;
        if (bArr != null) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
            if (bArr.length > 0) {
                this.unwrapAs++;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public byte[] m27338() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        getHighResolutionOutputSizeshNQ4ISI = (i + 13) % 128;
        return bArr;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m27337(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor + 75;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 == 0) {
            this.getOutputMinFrameDurationlomOqCM = bArr;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            int i3 = i2 + 119;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            this.unwrapAs = i3 % 2 == 0 ? this.unwrapAs : this.unwrapAs + 1;
            return;
        }
        this.getOutputMinFrameDurationlomOqCM = bArr;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] m27340() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        byte[] bArr = this.isOutputSupportedForhNQ4ISI;
        int i2 = i + 101;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m27336(byte[] bArr) {
        this.isOutputSupportedForhNQ4ISI = bArr;
        if (bArr != null) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 11;
            int i2 = i % 128;
            getHighSpeedVideoFpsRangesFor = i2;
            if (i % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length > 0) {
                this.unwrapAs++;
                getHighResolutionOutputSizeshNQ4ISI = (i2 + 117) % 128;
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m27344(byte[] bArr) {
        this._BOUNDARY = bArr;
        if (bArr != null) {
            int i = getHighSpeedVideoFpsRangesFor + 39;
            int i2 = i % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            if (i % 2 == 0) {
                if (bArr.length > 0) {
                    getHighSpeedVideoFpsRangesFor = (i2 + 43) % 128;
                    this.unwrapAs++;
                    return;
                }
                return;
            }
            int length = bArr.length;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m27342(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 75;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            this.accessartificialFrame = bArr;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            getHighSpeedVideoFpsRangesFor = (i + 29) % 128;
            this.unwrapAs++;
            return;
        }
        this.accessartificialFrame = bArr;
        throw null;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public void m27350(byte[] bArr) {
        this.f7082a = bArr;
        if (bArr != null) {
            int i = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
            getHighSpeedVideoFpsRangesFor = i;
            if (bArr.length > 0) {
                this.unwrapAs++;
                getHighResolutionOutputSizeshNQ4ISI = (i + 59) % 128;
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m27341(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor + 33;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 == 0) {
            this.coroutineBoundary = bArr;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            this.unwrapAs++;
            getHighSpeedVideoFpsRangesFor = (i2 + 97) % 128;
            return;
        }
        this.coroutineBoundary = bArr;
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public byte[] m27363() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 11;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return this.CoroutineDebuggingKt;
        }
        throw null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m27343(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 != 0) {
            this.CoroutineDebuggingKt = bArr;
            if (bArr != null && bArr.length > 0) {
                getHighResolutionOutputSizeshNQ4ISI = (i2 + 79) % 128;
                this.unwrapAs++;
                getHighResolutionOutputSizeshNQ4ISI = (i2 + 7) % 128;
            }
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
            return;
        }
        this.CoroutineDebuggingKt = bArr;
        throw null;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m27359(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 11;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this._CREATION = bArr;
            if (bArr != null) {
                int i3 = i + 9;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    if (bArr.length > 0) {
                        this.unwrapAs++;
                    }
                } else {
                    int length = bArr.length;
                    throw null;
                }
            }
            getHighResolutionOutputSizeshNQ4ISI = (i + 93) % 128;
            return;
        }
        this._CREATION = bArr;
        throw null;
    }

    /* renamed from: ˍ, reason: contains not printable characters */
    public void m27351(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 11) % 128;
        this.getOutputMinFrameDuration = bArr;
        if (bArr != null) {
            getHighResolutionOutputSizeshNQ4ISI = (i + 109) % 128;
            if (bArr.length > 0) {
                this.unwrapAs++;
            }
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 85;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public byte[] m27358() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        getHighSpeedVideoFpsRangesFor = i % 128;
        byte[] bArr = this.c;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m27352(byte b) {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 77;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 == 0) {
            this.c = new byte[]{b};
            i = this.unwrapAs >> 1;
        } else {
            this.c = new byte[]{b};
            i = this.unwrapAs + 1;
        }
        this.unwrapAs = i;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 105) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27347(util.h.xy.s.mc mcVar) {
        this.ArtificialStackFrames = mcVar;
        if (mcVar != null) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
            this.unwrapAs++;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 125;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void getHighSpeedVideoSizes() {
        getInputSizeshNQ4ISI = -1231763821;
        getInputFormats = new char[]{42358, 42303, 42242, 42249, 42246, 42300, 42244, 42257, 42493, 42435, 42437, 42490, 42489, 42433, 42489, 42486, 42491, 42436, 42439, 42436, 42437, 42434, 42495, 42494, 42492, 42491, 42488, 42443, 42435, 42461, 42402, 42074, 42074, 42079, 42079, 42405, 42409, 42401, 42073, 42406, 42408, 42073, 42076, 42404, 42076, 42069, 42070, 42403, 42401, 42078, 42402, 42367, 42265, 42261, 42260, 42262, 42262, 42264, 42264, 42262, 42252, 42250, 42255, 42267, 42265, 42262, 42259, 42263, 42266, 42267, 42248, 42254, 42265, 42263, 42298, 42373, 42373, 42381, 42370, 42426, 42370, 42378, 42379, 42377, 42372, 42368, 42368, 42428, 42372, 42429, 42424, 42370, 42426, 42430, 42376, 42381, 42378, 42428, 42426, 42428, 42383, 42373, 42294, 42384, 42394, 42379, 42368, 42377, 42390, 42377, 42379, 42388, 42385, 42385, 42387, 42385, 42384, 42380, 42386, 42380};
    }
}
