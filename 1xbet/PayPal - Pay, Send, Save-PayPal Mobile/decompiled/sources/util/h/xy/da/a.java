package util.h.xy.da;

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
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final /* synthetic */ util.h.xy.da.a[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 1;
    private static char[] getInputSizeshNQ4ISI;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.da.a f1151;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.da.a f1152;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.da.a f1153;

    private a(java.lang.String str, int i) {
    }

    public static util.h.xy.da.a valueOf(java.lang.String str) {
        int i = getHighSpeedVideoSizesFor + 17;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.da.a aVar = (util.h.xy.da.a) java.lang.Enum.valueOf(util.h.xy.da.a.class, str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getHighSpeedVideoSizesFor + 5;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    public static util.h.xy.da.a[] values() {
        getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 23) % 128;
        util.h.xy.da.a[] aVarArr = (util.h.xy.da.a[]) getHighSpeedVideoFpsRangesFor.clone();
        int i = getHighSpeedVideoSizesFor + 95;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return aVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (78 - android.view.View.MeasureSpec.getSize(0)), "\t\n㘛", 3 - android.view.KeyEvent.getDeadChar(0, 0), objArr);
        util.h.xy.da.a aVar = new util.h.xy.da.a(((java.lang.String) objArr[0]).intern(), 0);
        f1151 = aVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (10 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "\u0001\u0000\n\u000e\u0003\u0001", android.view.View.MeasureSpec.getSize(0) + 6, objArr2);
        util.h.xy.da.a aVar2 = new util.h.xy.da.a(((java.lang.String) objArr2[0]).intern(), 1);
        f1153 = aVar2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (67 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), "\u0002\t\u0001\u0005", 4 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        util.h.xy.da.a aVar3 = new util.h.xy.da.a(((java.lang.String) objArr3[0]).intern(), 2);
        f1152 = aVar3;
        getHighSpeedVideoFpsRangesFor = new util.h.xy.da.a[]{aVar, aVar2, aVar3};
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 69) % 128;
    }

    private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 17) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getInputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 93) % 128;
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighResolutionOutputSizeshNQ4ISI);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i4 = getHighSpeedVideoFpsRanges + 107;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 == 0) {
                i2 = i + 61;
                cArr3[i2] = (char) (charArray[i2] * b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 111) % 128;
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 1) % 128;
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i5 = mcVar.f2639;
                        int i6 = mcVar.f2640;
                        int i7 = mcVar.f2637;
                        int i8 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i5 * c) + i6];
                        cArr3[mcVar.f2638 + 1] = cArr[(i7 * c) + i8];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i9 = mcVar.f2639;
                        int i10 = mcVar.f2640;
                        int i11 = mcVar.f2637;
                        int i12 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i9 * c) + i10];
                        cArr3[mcVar.f2638 + 1] = cArr[(i11 * c) + i12];
                    } else {
                        int i13 = mcVar.f2639;
                        int i14 = mcVar.f2635;
                        int i15 = mcVar.f2637;
                        int i16 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i13 * c) + i14];
                        cArr3[mcVar.f2638 + 1] = cArr[(i15 * c) + i16];
                    }
                }
                mcVar.f2638 += 2;
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 69) % 128;
            }
        }
        int i17 = getHighSpeedVideoSizes + 23;
        getHighSpeedVideoFpsRanges = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 2 / 3;
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr3[i19] = (char) (cArr3[i19] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputSizeshNQ4ISI = new char[]{41873, 41876, 41865, 41881, 41882, 41887, 41880, 41867, 41872, 41875, 41877, 41894, 41884, 41883, 41885, 41886};
        getHighResolutionOutputSizeshNQ4ISI = (char) 38466;
    }
}
