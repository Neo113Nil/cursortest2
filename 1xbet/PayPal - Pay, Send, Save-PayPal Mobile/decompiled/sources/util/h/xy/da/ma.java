package util.h.xy.da;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˎ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ma {
    private static final /* synthetic */ util.h.xy.da.ma[] Camera2StreamConfigurationMap;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static int getInputSizeshNQ4ISI;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.da.ma f1154;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.da.ma f1155;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.da.ma f1156;

    private ma(java.lang.String str, int i) {
    }

    public static util.h.xy.da.ma valueOf(java.lang.String str) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 89) % 128;
        util.h.xy.da.ma maVar = (util.h.xy.da.ma) java.lang.Enum.valueOf(util.h.xy.da.ma.class, str);
        int i = getInputSizeshNQ4ISI + 13;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return maVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.da.ma[] values() {
        int i = getInputSizeshNQ4ISI + 19;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.da.ma[] maVarArr = Camera2StreamConfigurationMap;
        if (i % 2 != 0) {
            return (util.h.xy.da.ma[]) maVarArr.clone();
        }
        throw null;
    }

    static {
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(true, new int[]{0, 8, 96, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", objArr);
        util.h.xy.da.ma maVar = new util.h.xy.da.ma(((java.lang.String) objArr[0]).intern(), 0);
        f1155 = maVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{8, 12, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", objArr2);
        util.h.xy.da.ma maVar2 = new util.h.xy.da.ma(((java.lang.String) objArr2[0]).intern(), 1);
        f1154 = maVar2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{20, 6, 0, 1}, "\u0000\u0001\u0000\u0000\u0001\u0001", objArr3);
        util.h.xy.da.ma maVar3 = new util.h.xy.da.ma(((java.lang.String) objArr3[0]).intern(), 2);
        f1156 = maVar3;
        Camera2StreamConfigurationMap = new util.h.xy.da.ma[]{maVar, maVar2, maVar3};
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 13) % 128;
    }

    private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        util.h.xz.b.ma maVar;
        util.h.xz.b.ma maVar2;
        util.h.xz.b.ma maVar3;
        int i = getHighSpeedVideoSizes + 109;
        getHighSpeedVideoFpsRanges = i % 128;
        int i2 = 2;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar4 = new util.h.xz.b.ma();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = getHighSpeedVideoSizes + 99;
                getHighSpeedVideoFpsRanges = i8 % 128;
                if (i8 % i2 == 0) {
                    maVar3 = maVar4;
                    cArr2[i7] = (char) (cArr[i7] * (-8125198844289309347L));
                    i7 %= 1;
                } else {
                    maVar3 = maVar4;
                    cArr2[i7] = (char) (cArr[i7] ^ (-8125198844289309347L));
                    i7++;
                }
                maVar4 = maVar3;
                i2 = 2;
            }
            maVar = maVar4;
            cArr = cArr2;
        } else {
            maVar = maVar4;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bytes != null) {
            char[] cArr4 = new char[i4];
            maVar2 = maVar;
            maVar2.f2631 = 0;
            char c = 0;
            while (maVar2.f2631 < i4) {
                if (bytes[maVar2.f2631] == 1) {
                    cArr4[maVar2.f2631] = (char) (((cArr3[maVar2.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar2.f2631] = (char) ((cArr3[maVar2.f2631] * 2) - c);
                }
                c = cArr4[maVar2.f2631];
                maVar2.f2631++;
            }
            cArr3 = cArr4;
        } else {
            maVar2 = maVar;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i9 = i4 - i6;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i6);
            java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            maVar2.f2631 = 0;
            while (maVar2.f2631 < i4) {
                cArr6[maVar2.f2631] = cArr3[(i4 - maVar2.f2631) - 1];
                maVar2.f2631++;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 69) % 128;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            loop3: while (true) {
                maVar2.f2631 = 0;
                while (maVar2.f2631 < i4) {
                    int i10 = getHighSpeedVideoFpsRanges + 29;
                    getHighSpeedVideoSizes = i10 % 128;
                    if (i10 % 2 != 0) {
                        break;
                    }
                    cArr3[maVar2.f2631] = (char) (cArr3[maVar2.f2631] - iArr[2]);
                    maVar2.f2631++;
                }
                cArr3[maVar2.f2631] = (char) (cArr3[maVar2.f2631] * iArr[2]);
                int i11 = maVar2.f2631;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void Camera2StreamConfigurationMap() {
        getHighResolutionOutputSizeshNQ4ISI = new char[]{42255, 42486, 42484, 42495, 42484, 42490, 42487, 42478, 42364, 42260, 42259, 42263, 42266, 42267, 42265, 42260, 42252, 42259, 42264, 42267, 42359, 42254, 42257, 42265, 42263, 42262};
    }
}
