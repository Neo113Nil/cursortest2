package util.h.xy.w;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Camera2StreamConfigurationMap' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
final class mb {
    public static final util.h.xy.w.mb Camera2StreamConfigurationMap;
    public static final util.h.xy.w.mb getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    public static final util.h.xy.w.mb getHighSpeedVideoSizes;
    private static char getHighSpeedVideoSizesFor = 0;
    private static final /* synthetic */ util.h.xy.w.mb[] getInputFormats;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static char[] getOutputMinFrameDuration;

    private mb(java.lang.String str, int i) {
    }

    public static util.h.xy.w.mb valueOf(java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 87;
        getOutputFormats = i % 128;
        util.h.xy.w.mb mbVar = (util.h.xy.w.mb) java.lang.Enum.valueOf(util.h.xy.w.mb.class, str);
        if (i % 2 != 0) {
            return mbVar;
        }
        throw null;
    }

    public static util.h.xy.w.mb[] values() {
        getInputSizeshNQ4ISI = (getOutputFormats + 85) % 128;
        util.h.xy.w.mb[] mbVarArr = (util.h.xy.w.mb[]) getInputFormats.clone();
        getOutputFormats = (getInputSizeshNQ4ISI + 61) % 128;
        return mbVarArr;
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (android.graphics.Color.rgb(0, 0, 0) + 16777286), "\u000b\u0005\u0010\u0017\u0005\u0011㘜㘜\b\u0010\u0016\u0001\u0005\u0018", 15 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        util.h.xy.w.mb mbVar = new util.h.xy.w.mb(((java.lang.String) objArr[0]).intern(), 0);
        Camera2StreamConfigurationMap = mbVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33), "\u0010\u0007\t\u000e\u0016\u000e\u0016\u0006\u0010\u0011\u0015\u000b\u0010\u0017\u0004\u0007㗴", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16, objArr2);
        util.h.xy.w.mb mbVar2 = new util.h.xy.w.mb(((java.lang.String) objArr2[0]).intern(), 1);
        getHighSpeedVideoSizes = mbVar2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (51 - android.view.MotionEvent.axisFromString("")), "\u0004\n\u0014\u0000\u0006\u000b\u0016\u0006\u0010\u0011\u0015\u000b\u0010\u0017\u0004\u0007㘈", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, objArr3);
        util.h.xy.w.mb mbVar3 = new util.h.xy.w.mb(((java.lang.String) objArr3[0]).intern(), 2);
        getHighResolutionOutputSizeshNQ4ISI = mbVar3;
        int i = (getInputSizeshNQ4ISI + 41) % 128;
        getOutputFormats = i;
        getInputSizeshNQ4ISI = (i + 65) % 128;
        getInputFormats = new util.h.xy.w.mb[]{mbVar, mbVar2, mbVar3};
        int i2 = i + 117;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputMinFrameDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizesFor);
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
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i4 = mcVar.f2639;
                        int i5 = mcVar.f2640;
                        int i6 = mcVar.f2637;
                        int i7 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                        cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 109) % 128;
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoSizes() {
        getOutputMinFrameDuration = new char[]{41887, 41883, 41868, 41891, 41870, 41894, 41881, 41867, 41884, 41877, 41871, 41880, 41861, 41890, 41876, 41885, 41872, 41866, 41864, 41895, 41874, 41859, 41892, 41893, 41882};
        getHighSpeedVideoSizesFor = (char) 38467;
    }
}
