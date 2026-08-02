package util.h.xy.bf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class d {
    private static byte[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static short[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static final /* synthetic */ util.h.xy.bf.d[] getOutputFormats;
    private static int getOutputMinFrameDuration;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.bf.d f935;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.bf.d f936;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.bf.d f937;
    private java.lang.String getOutputStallDuration;

    public static util.h.xy.bf.d valueOf(java.lang.String str) {
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 61) % 128;
        util.h.xy.bf.d dVar = (util.h.xy.bf.d) java.lang.Enum.valueOf(util.h.xy.bf.d.class, str);
        int i = getInputSizeshNQ4ISI + 117;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    public static util.h.xy.bf.d[] values() {
        int i = getOutputMinFrameDuration + 25;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.bf.d[] dVarArr = (util.h.xy.bf.d[]) getOutputFormats.clone();
        int i2 = getInputSizeshNQ4ISI + 111;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return dVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRanges();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 49579, (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (byte) (android.view.ViewConfiguration.getTapTimeout() >> 16), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() - 102, android.graphics.Color.blue(0) - 1789585666, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.alpha(0) - 67092859, (short) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 103, (-1789585667) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
            util.h.xy.bf.d dVar = new util.h.xy.bf.d(intern, 0, ((java.lang.String) objArr2[0]).intern());
            f937 = dVar;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 67092856, (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) android.graphics.Color.green(0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 103, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1789585680, objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((-67092856) - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (short) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (-104) - android.view.MotionEvent.axisFromString(""), (-1789585678) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
            util.h.xy.bf.d dVar2 = new util.h.xy.bf.d(intern2, 1, ((java.lang.String) objArr4[0]).intern());
            f935 = dVar2;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((-67092845) - android.view.View.MeasureSpec.getMode(0), (short) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.graphics.Color.alpha(0) - 103, (-1789585668) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 67092845, (short) (android.view.MotionEvent.axisFromString("") + 1), (byte) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-103) - android.view.Gravity.getAbsoluteGravity(0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1789585667, objArr6);
            util.h.xy.bf.d dVar3 = new util.h.xy.bf.d(intern3, 2, ((java.lang.String) objArr6[0]).intern());
            f936 = dVar3;
            int i = (getOutputMinFrameDuration + 99) % 128;
            getInputSizeshNQ4ISI = i;
            util.h.xy.bf.d[] dVarArr = {dVar, dVar2, dVar3};
            int i2 = i + 27;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 == 0) {
                getOutputFormats = dVarArr;
                return;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private d(java.lang.String str, int i, java.lang.String str2) {
        this.getOutputStallDuration = str2;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = getOutputMinFrameDuration;
        int i2 = i + 11;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.getOutputStallDuration;
        int i3 = i + 65;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
        boolean z2 = i5 == -1;
        if (z2) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 43) % 128;
            byte[] bArr = Camera2StreamConfigurationMap;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            i5 = bArr != null ? (byte) (((byte) (Camera2StreamConfigurationMap[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoSizes[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
        }
        if (i5 > 0) {
            int i7 = (int) (getInputFormats ^ (-2689713159175858216L));
            if (z2) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 115) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i7 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = Camera2StreamConfigurationMap;
            if (bArr3 != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 61) % 128;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i8 = 0; i8 < length2; i8++) {
                    bArr4[i8] = (byte) (bArr3[i8] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
                z = true;
            } else {
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z) {
                    byte[] bArr5 = Camera2StreamConfigurationMap;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoSizes;
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

    static void getHighSpeedVideoFpsRanges() {
        getInputFormats = -463546717;
        getHighSpeedVideoSizesFor = -408873026;
        getHighSpeedVideoFpsRanges = -1928593782;
        Camera2StreamConfigurationMap = new byte[]{69, -46, 46, 125, -40, -42, 33, 32, -55, -38, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -34, 39, -44, 70, 47, 39, -39};
    }
}
