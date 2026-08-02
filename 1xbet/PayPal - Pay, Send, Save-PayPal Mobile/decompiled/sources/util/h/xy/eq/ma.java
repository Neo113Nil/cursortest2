package util.h.xy.eq;

/* loaded from: classes18.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    static final util.h.xy.dh.i getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    static final util.h.xy.dh.i getHighSpeedVideoSizes;
    private static int getInputFormats;
    private static final short[] getInputSizeshNQ4ISI;
    private static int getOutputFormats;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 11;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getInputFormats ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\u0003�\u0000�\u0000\u0007\u0007�\u0006�\u0000�\u0000�\u0001\u0000�\u0002�\u0005�\u0000�", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24, 15 - android.text.TextUtils.getTrimmedLength(""), 179 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
        getHighSpeedVideoSizes = new util.h.xy.dh.i(((java.lang.String) objArr[0]).intern()).m26300();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\u0002\u0004\u0002\u0002�\u0006�\u0005\u0005�\u0000\uffff\u0000�\u0001�\u0007\u0003\uffff�\u0000\u0000", 22 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 12, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, objArr2);
        getHighSpeedVideoFpsRanges = new util.h.xy.dh.i(((java.lang.String) objArr2[0]).intern()).m26300();
        getInputSizeshNQ4ISI = new short[]{189, 86, 234, 242, 162, 241, 172, 42, 176, com.visa.cbp.setDeviceName.isOutputSupportedFor, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM, com.visa.cbp.getEncExpo.ResultReceiverMyResultReceiver, 114, 140, 8, 21, 110, 134, 0, com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, com.visa.cbp.setDeviceName.coroutineBoundary, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, com.visa.cbp.getEncExpo.invoke, com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, com.visa.cbp.setDeviceName.unwrapAs, 151, 37, 84, 177, 40, 170, 152, 157, com.visa.cbp.setDeviceName._CREATION, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        Camera2StreamConfigurationMap = (getOutputFormats + 121) % 128;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputFormats = -1231763948;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ed.a m26688(util.h.xy.dh.i iVar, int i, java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
        Camera2StreamConfigurationMap = (getOutputFormats + 107) % 128;
        if (iVar.m26325(util.h.xy.dq.mb.f1479) || iVar.m26325(util.h.xy.dq.mb.f1516) || iVar.m26325(util.h.xy.dq.mb.f1492) || iVar.m26325(util.h.xy.ds.b.f1534) || iVar.m26325(util.h.xy.ds.b.f1535) || iVar.m26325(util.h.xy.ds.b.f1532) || iVar.m26325(util.h.xy.dn.mb.f1386)) {
            byte[] bArr = new byte[16];
            secureRandom.nextBytes(bArr);
            return new util.h.xy.ed.a(iVar, new util.h.xy.dh.mz(bArr));
        }
        if (iVar.m26325(util.h.xy.dq.mb.f1507) || iVar.m26325(util.h.xy.dq.mb.f1457) || iVar.m26325(util.h.xy.dq.mb.f1490)) {
            byte[] bArr2 = new byte[12];
            secureRandom.nextBytes(bArr2);
            util.h.xy.ed.a aVar = new util.h.xy.ed.a(iVar, new util.h.xy.es.mb(bArr2, 16));
            int i2 = Camera2StreamConfigurationMap + 37;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                return aVar;
            }
            throw null;
        }
        if (iVar.m26325(util.h.xy.dq.mb.f1503) || iVar.m26325(util.h.xy.dq.mb.f1476) || iVar.m26325(util.h.xy.dq.mb.f1511)) {
            byte[] bArr3 = new byte[8];
            secureRandom.nextBytes(bArr3);
            return new util.h.xy.ed.a(iVar, new util.h.xy.es.a(bArr3, 16));
        }
        if (!iVar.m26325(util.h.xy.du.ra.f1735) && !iVar.m26325(getHighSpeedVideoSizes)) {
            int i3 = getOutputFormats + 71;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                iVar.m26325(util.h.xy.dr.mb.f1524);
                throw null;
            }
            if (!iVar.m26325(util.h.xy.dr.mb.f1524)) {
                if (iVar.m26325(getHighSpeedVideoFpsRanges)) {
                    byte[] bArr4 = new byte[8];
                    secureRandom.nextBytes(bArr4);
                    return new util.h.xy.ed.a(iVar, new util.h.xy.dt.ra(bArr4, i));
                }
                if (iVar.m26325(util.h.xy.du.ra.f1723)) {
                    return new util.h.xy.ed.a(iVar, util.h.xy.dh.ry.f1213);
                }
                if (iVar.m26325(util.h.xy.du.ra.f1726)) {
                    byte[] bArr5 = new byte[8];
                    secureRandom.nextBytes(bArr5);
                    return new util.h.xy.ed.a(iVar, new util.h.xy.du.b(getInputSizeshNQ4ISI[128], bArr5));
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\u0013\u000e\uffbf\f\u0000\u0013\u0002\u0007\uffbf\u0000\u000b\u0006\u000e\u0011\b\u0013\u0007\f\u0014\r\u0000\u0001\u000b\u0004\uffbf", 25 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 17 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 226, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
        }
        byte[] bArr6 = new byte[8];
        secureRandom.nextBytes(bArr6);
        return new util.h.xy.ed.a(iVar, new util.h.xy.dh.mz(bArr6));
    }
}
