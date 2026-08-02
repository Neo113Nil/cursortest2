package util.h.xy.ak;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˊ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class rc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static final /* synthetic */ util.h.xy.ak.rc[] getHighSpeedVideoSizesFor;
    private static byte[] getInputFormats = null;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    private static short[] getOutputMinFrameDurationlomOqCM;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.ak.rc f89;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.da.ra f90;

    private rc(java.lang.String str) {
    }

    public static util.h.xy.ak.rc valueOf(java.lang.String str) {
        Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 69) % 128;
        util.h.xy.ak.rc rcVar = (util.h.xy.ak.rc) java.lang.Enum.valueOf(util.h.xy.ak.rc.class, str);
        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 113) % 128;
        return rcVar;
    }

    public static util.h.xy.ak.rc[] values() {
        Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 1) % 128;
        util.h.xy.ak.rc[] rcVarArr = (util.h.xy.ak.rc[]) getHighSpeedVideoSizesFor.clone();
        int i = getOutputMinFrameDuration + 91;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return rcVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoSizes();
        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((-416071671) - (windowTouchSlop >> 8), (short) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (98 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, android.widget.ExpandableListView.getPackedPositionChild(0L) + 1297784123, objArr);
        util.h.xy.ak.rc rcVar = new util.h.xy.ak.rc(((java.lang.String) objArr[0]).intern());
        f89 = rcVar;
        int i = getOutputMinFrameDuration + 107;
        Camera2StreamConfigurationMap = i % 128;
        int i2 = i % 2;
        getHighSpeedVideoSizesFor = new util.h.xy.ak.rc[]{rcVar};
        getInputSizeshNQ4ISI = util.h.xy.ak.ra.class.getName();
        int i3 = Camera2StreamConfigurationMap + 73;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25000() {
        int i = Camera2StreamConfigurationMap + 107;
        getOutputMinFrameDuration = i % 128;
        try {
            if (i % 2 != 0) {
                getHighSpeedVideoFpsRangesFor();
                util.h.xy.ak.d.m24967(this.f90);
                Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 125) % 128;
            } else {
                getHighSpeedVideoFpsRangesFor();
                util.h.xy.ak.d.m24967(this.f90);
                throw null;
            }
        } catch (util.h.xy.da.b unused) {
        }
    }

    private void getHighSpeedVideoFpsRangesFor() throws util.h.xy.da.b {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 35;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.f90 == null) {
                getOutputMinFrameDuration = (i + 45) % 128;
                util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
                int argb = android.graphics.Color.argb(0, 0, 0, 0);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((-416071679) - argb, (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 52), 5 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.MeasureSpec.getMode(0) + 1297784171, objArr);
                this.f90 = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
            }
            Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 13) % 128;
            return;
        }
        throw null;
    }

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L)));
        if (i5 == -1) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            byte[] bArr = getInputFormats;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i5 = (byte) (((byte) (getInputFormats[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))));
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 91) % 128;
            } else {
                i5 = (short) (((short) (getOutputMinFrameDurationlomOqCM[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 85) % 128;
            meVar.f2647 = ((i + i5) - 2) + ((int) (getOutputFormats ^ (-2689713159175858216L))) + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getInputFormats;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 1) % 128;
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z) {
                    byte[] bArr5 = getInputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputMinFrameDurationlomOqCM;
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

    static void getHighSpeedVideoSizes() {
        getOutputFormats = -9590745;
        getHighSpeedVideoFpsRangesFor = -408872996;
        getHighSpeedVideoSizes = 1426355415;
        getInputFormats = new byte[]{-19, -19, 0, -24, com.google.common.base.Ascii.ETB, -21, -4, com.google.common.base.Ascii.VT, -72, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -73, 87, -69, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -40, -40};
    }
}
