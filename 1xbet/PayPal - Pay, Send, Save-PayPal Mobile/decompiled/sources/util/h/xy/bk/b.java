package util.h.xy.bk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class b {
    private static final /* synthetic */ util.h.xy.bk.b[] Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static byte[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static short[] getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static int getOutputSizes;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f971;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f972;

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f973;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f974;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f975;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f976;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f977;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f978;

    /* renamed from: ͺ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f979;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.bk.b f980;

    /* renamed from: ι, reason: contains not printable characters */
    public static final util.h.xy.bk.b f981;

    private b(java.lang.String str, int i) {
    }

    public static util.h.xy.bk.b valueOf(java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 103;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.bk.b bVar = (util.h.xy.bk.b) java.lang.Enum.valueOf(util.h.xy.bk.b.class, str);
        if (i % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    public static util.h.xy.bk.b[] values() {
        int i = getHighSpeedVideoSizesFor + 71;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.bk.b[] bVarArr = (util.h.xy.bk.b[]) Camera2StreamConfigurationMap.clone();
        int i2 = getHighSpeedVideoSizesFor + 11;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return bVarArr;
        }
        throw null;
    }

    static {
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufff9\u0002\u0005\u0003\u0012\ufff7\u0005\ufff4\ufff6\ufff8\u0003\f\u0007\u0012\ufff8\uffff￼", android.widget.ExpandableListView.getPackedPositionChild(0L) + 18, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 9, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 99, true, objArr);
        util.h.xy.bk.b bVar = new util.h.xy.bk.b(((java.lang.String) objArr[0]).intern(), 0);
        f980 = bVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufffa�\ufff7\ufff5\b�\u0003\u0002\u0013\u0001\ufff9\b￼\u0003\ufff8\u000b\ufff5\u0000\u0000\ufff9\b\u0013\ufff7￼\u0013\n\ufff9\u0006�", android.graphics.Color.alpha(0) + 29, 16 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 98, false, objArr2);
        util.h.xy.bk.b bVar2 = new util.h.xy.bk.b(((java.lang.String) objArr2[0]).intern(), 1);
        f975 = bVar2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufff8\uffff\ufff2\u0005\u0006\u0003\ufff6\u0010\u0004\u0005\ufff2\u0005\u0006\u0004\b\ufff2��\ufff6\u0005\u0010\ufff2￼\u0004\u0010\u0004\ufffa", 27 - android.text.TextUtils.getOffsetAfter("", 0), 14 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 101, false, objArr3);
        util.h.xy.bk.b bVar3 = new util.h.xy.bk.b(((java.lang.String) objArr3[0]).intern(), 2);
        f978 = bVar3;
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((-2107330886) - android.text.TextUtils.indexOf("", ""), (short) android.view.KeyEvent.normalizeMetaState(0), (byte) ((-77) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (-32) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 62661546, objArr4);
            util.h.xy.bk.b bVar4 = new util.h.xy.bk.b(((java.lang.String) objArr4[0]).intern(), 3);
            f977 = bVar4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((-2107330862) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (short) android.text.TextUtils.getTrimmedLength(""), (byte) (android.view.KeyEvent.getDeadChar(0, 0) + 51), android.text.TextUtils.getOffsetAfter("", 0) - 32, android.text.TextUtils.indexOf("", "", 0) + 62661541, objArr5);
            util.h.xy.bk.b bVar5 = new util.h.xy.bk.b(((java.lang.String) objArr5[0]).intern(), 4);
            f976 = bVar5;
            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(mirror - 20802, (short) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) - 104), android.graphics.Color.alpha(0) - 32, 62661534 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr6);
            util.h.xy.bk.b bVar6 = new util.h.xy.bk.b(((java.lang.String) objArr6[0]).intern(), 5);
            f973 = bVar6;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((-2107330813) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (byte) (55 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-31) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 62661547, objArr7);
            util.h.xy.bk.b bVar7 = new util.h.xy.bk.b(((java.lang.String) objArr7[0]).intern(), 6);
            f972 = bVar7;
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0000\u0005\u0007\u0006\ufff3\u0006\u0005\u0011\ufffa\ufff5\u0006\ufff7\ufff8\u0011\ufff7\ufff5\u0000\u0001", 19 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1 - android.widget.ExpandableListView.getPackedPositionType(0L), android.graphics.Color.green(0) + 100, true, objArr8);
            util.h.xy.bk.b bVar8 = new util.h.xy.bk.b(((java.lang.String) objArr8[0]).intern(), 7);
            f971 = bVar8;
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) - 2107330809, (short) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 9), android.text.TextUtils.getCapsMode("", 0, 0) - 32, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 62661536, objArr9);
            util.h.xy.bk.b bVar9 = new util.h.xy.bk.b(((java.lang.String) objArr9[0]).intern(), 8);
            f979 = bVar9;
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0007\ufff3\ufff9\u000b\ufff7�\u0011\ufff5\ufffb\u0004\u0006\ufff7\uffff\u0001\ufffb\ufff4\u0005\u0007\u0006\ufff3\u0006\u0005\u0011\u0006\ufff7\u0005\u0011\ufff6\u0004", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 29, 16 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 100, true, objArr10);
            util.h.xy.bk.b bVar10 = new util.h.xy.bk.b(((java.lang.String) objArr10[0]).intern(), 9);
            f981 = bVar10;
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0001\u0002\u0001\ufff6\ufff8\ufff4\b\u000b￼\u0012", android.text.TextUtils.getOffsetBefore("", 0) + 10, 5 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 100, false, objArr11);
            util.h.xy.bk.b bVar11 = new util.h.xy.bk.b(((java.lang.String) objArr11[0]).intern(), 10);
            f974 = bVar11;
            int i = (getHighSpeedVideoSizesFor + 29) % 128;
            getInputSizeshNQ4ISI = i;
            getHighSpeedVideoSizesFor = (i + 25) % 128;
            Camera2StreamConfigurationMap = new util.h.xy.bk.b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11};
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getHighSpeedVideoFpsRanges ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                int i5 = getHighSpeedVideoSizes + 91;
                getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = raVar.f2649;
                    int i7 = i / raVar.f2649;
                    throw new java.lang.ArithmeticException();
                }
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 73) % 128;
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5;
        int length2;
        byte[] bArr2;
        int i6;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i7 = i2 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
        if (i7 == -1) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 19) % 128;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            byte[] bArr3 = getInputFormats;
            if (bArr3 != null) {
                int i8 = getHighSpeedVideoSizes + 19;
                getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                if (i8 % 2 == 0) {
                    length2 = bArr3.length;
                    bArr2 = new byte[length2];
                    i6 = 1;
                } else {
                    length2 = bArr3.length;
                    bArr2 = new byte[length2];
                    i6 = 0;
                }
                while (i6 < length2) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 75) % 128;
                    bArr2[i6] = (byte) (bArr3[i6] ^ (-2689713159175858216L));
                    i6++;
                }
                bArr3 = bArr2;
            }
            i7 = bArr3 != null ? (byte) (((byte) (getInputFormats[((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)))) : (short) (((short) (getOutputFormats[((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
        }
        if (i7 > 0) {
            meVar.f2647 = ((i + i7) - 2) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))) + i4;
            meVar.f2644 = (char) (i3 + ((int) (getOutputSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getInputFormats;
            if (bArr4 != null) {
                int i9 = getHighResolutionOutputSizeshNQ4ISI + 3;
                getHighSpeedVideoSizes = i9 % 128;
                if (i9 % 2 != 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    bArr[i5] = (byte) (bArr4[i5] ^ (-2689713159175858216L));
                    i5++;
                }
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                z = true;
            } else {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i7) {
                if (z) {
                    byte[] bArr5 = getInputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 77) % 128;
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
        objArr[0] = sb.toString();
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoFpsRanges = -1231763840;
        getHighSpeedVideoFpsRangesFor = -1707456866;
        getOutputMinFrameDuration = -408873017;
        getOutputSizes = 467848060;
        getInputFormats = new byte[]{33, -110, 109, Byte.MAX_VALUE, -127, 109, -104, 125, -109, 106, com.visa.cbp.getEncExpo.registerForActivityResult, Byte.MAX_VALUE, -121, 97, com.visa.cbp.getEncExpo.registerForActivityResult, 125, 110, -114, 118, -125, 97, com.visa.cbp.getEncExpo.registerForActivityResult, Byte.MAX_VALUE, -97, 37, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SYN, -18, -23, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SI, -25, -28, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.CAN, -28, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.EM, -6, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SI, -32, -29, com.google.common.base.Ascii.FS, -1, 16, -22, -22, 14, -25, -31, 45, 71, -73, 64, 77, -71, 69, -92, 75, 70, 73, -72, -76, 88, -79, -79, 91, -78, 81, -66, 62, -20, com.google.common.base.Ascii.ESC, 17, -17, 62, 45, -45, 46, 35};
    }
}
