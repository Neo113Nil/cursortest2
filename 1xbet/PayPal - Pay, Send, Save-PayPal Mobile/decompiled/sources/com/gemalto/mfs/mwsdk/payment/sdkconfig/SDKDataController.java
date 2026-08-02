package com.gemalto.mfs.mwsdk.payment.sdkconfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INSTANCE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class SDKDataController {
    private static byte[] Camera2StreamConfigurationMap = null;
    public static final com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController INSTANCE;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static short[] getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static final /* synthetic */ com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController[] getOutputSizeshNQ4ISI;

    private SDKDataController(java.lang.String str) {
    }

    public static com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController valueOf(java.lang.String str) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 91) % 128;
        com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController sDKDataController = (com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController) java.lang.Enum.valueOf(com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController.class, str);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 99) % 128;
        return sDKDataController;
    }

    public static com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController[] values() {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 117) % 128;
        com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController[] sDKDataControllerArr = (com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController[]) getOutputSizeshNQ4ISI.clone();
        int i = getInputSizeshNQ4ISI + 89;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return sDKDataControllerArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.text.TextUtils.getTrimmedLength("") - 56659935, (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 74), (byte) (android.graphics.Color.red(0) - 98), (-76) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (-1449296085) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController sDKDataController = new com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController(((java.lang.String) objArr[0]).intern());
        INSTANCE = sDKDataController;
        int i = getHighSpeedVideoSizes + 91;
        getInputSizeshNQ4ISI = i % 128;
        int i2 = i % 2;
        getOutputSizeshNQ4ISI = new com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController[]{sDKDataController};
        getOutputMinFrameDuration = com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKDataController.class.getName();
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 57) % 128;
    }

    public final void wipeAll(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 67) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((-56659969) - android.text.TextUtils.indexOf("", ""), (short) (81 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 98), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 80, (-1449296082) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.MeasureSpec.getSize(0) - 56659966, (short) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 100), (byte) ((-28) - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), (-79) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.blue(0) - 1449296075, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (util.h.xy.ag.a.m24556().m24558() == null) {
                int i = getInputSizeshNQ4ISI + 33;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    util.h.xy.ag.a.m24556().m24559(context);
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.ag.a.m24556().m24559(context);
                int i2 = getInputSizeshNQ4ISI + 27;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 2;
                }
            }
            util.h.xy.k.a.m26907(true);
            util.h.xy.br.ma.m25605(context);
            util.h.xy.u.e.m27522(context);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes((-56659961) - android.text.TextUtils.getOffsetBefore("", 0), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 70), (byte) ((-105) - android.graphics.Color.argb(0, 0, 0, 0)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 74, (-1449296043) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
            util.h.xy.u.e.m27524(context, ((java.lang.String) objArr3[0]).intern());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes((-56659951) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) (android.view.KeyEvent.getDeadChar(0, 0) + 40), (byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 70), (-72) - android.view.MotionEvent.axisFromString(""), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1449296043, objArr4);
            util.h.xy.u.e.m27524(context, ((java.lang.String) objArr4[0]).intern());
            try {
                com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().shutDown();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void wipeCard(java.lang.String str, android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 81) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((-56659969) - android.view.View.combineMeasuredStates(0, 0), (short) (80 - android.text.TextUtils.getCapsMode("", 0, 0)), (byte) (android.view.View.combineMeasuredStates(0, 0) - 98), (-80) - android.graphics.Color.green(0), (-1449296082) - android.text.TextUtils.indexOf("", ""), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 56659940, (short) ((-49) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 58), (-78) - android.widget.ExpandableListView.getPackedPositionType(0L), android.text.TextUtils.indexOf("", "") - 1449296075, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (util.h.xy.ag.a.m24556().m24558() == null) {
            util.h.xy.ag.a.m24556().m24559(context);
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 53) % 128;
        }
        util.h.xy.k.mb.m26931(util.h.xy.k.ra.f2243.m26950(str).getResult());
    }

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
        if (i5 == -1) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI;
            int i7 = i6 + 29;
            getHighSpeedVideoFpsRangesFor = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            byte[] bArr = Camera2StreamConfigurationMap;
            if (bArr != null) {
                getHighSpeedVideoFpsRangesFor = (i6 + 111) % 128;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i8 = 0; i8 < length; i8++) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 117) % 128;
                    bArr2[i8] = (byte) (bArr[i8] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                int i9 = getHighResolutionOutputSizeshNQ4ISI + 9;
                getHighSpeedVideoFpsRangesFor = i9 % 128;
                i5 = (byte) (i9 % 2 != 0 ? ((byte) (Camera2StreamConfigurationMap[i - ((int) (getInputFormats + 2689713159175858216L))] - 2689713159175858216L)) % ((int) (getHighSpeedVideoSizesFor % (-2689713159175858216L))) : ((byte) (Camera2StreamConfigurationMap[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            } else {
                i5 = (short) (((short) (getHighSpeedVideoFpsRanges[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            meVar.f2647 = ((i + i5) - 2) + ((int) (getInputFormats ^ (-2689713159175858216L))) + i4;
            meVar.f2644 = (char) (i3 + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = Camera2StreamConfigurationMap;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    bArr4[i10] = (byte) (bArr3[i10] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z) {
                    byte[] bArr5 = Camera2StreamConfigurationMap;
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
        java.lang.String obj = sb.toString();
        int i11 = getHighSpeedVideoFpsRangesFor + 85;
        getHighResolutionOutputSizeshNQ4ISI = i11 % 128;
        if (i11 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = obj;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputFormats = -457078823;
        getHighSpeedVideoSizesFor = -408873076;
        getOutputFormats = -1312581946;
        Camera2StreamConfigurationMap = new byte[]{-100, com.visa.cbp.getEncExpo.kernelVersion, -110, -86, -23, -85, -89, -95, 109, com.google.common.base.Ascii.DC4, -40, 5, 64, 5, 5, 0, 117, 85, -59, 77, -57, 76, -14, 76, 78, -8, 72, com.visa.cbp.getEncExpo.startTransaction, 89, -124, -7, -121, -77, -79, -119, -8, -112, com.visa.cbp.getEncExpo.onUnminimized, -116, -120, -120, -40, -40, -40, -40, -40, -40};
    }
}
