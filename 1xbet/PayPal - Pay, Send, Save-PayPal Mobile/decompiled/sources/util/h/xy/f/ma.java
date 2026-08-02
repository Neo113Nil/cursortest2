package util.h.xy.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ma {
    private static final /* synthetic */ util.h.xy.f.ma[] Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static int[] getHighSpeedVideoSizesFor;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final util.h.xy.f.ma f2202;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final util.h.xy.f.ma f2203;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.f.ma f2204;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.f.ma f2205;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.f.ma f2206;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.f.ma f2207;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.f.ma f2208;

    private ma(java.lang.String str, int i) {
    }

    public static util.h.xy.f.ma valueOf(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 11) % 128;
        util.h.xy.f.ma maVar = (util.h.xy.f.ma) java.lang.Enum.valueOf(util.h.xy.f.ma.class, str);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 95) % 128;
        return maVar;
    }

    public static util.h.xy.f.ma[] values() {
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.f.ma[] maVarArr = (util.h.xy.f.ma[]) Camera2StreamConfigurationMap.clone();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 1) % 128;
        return maVarArr;
    }

    static {
        util.h.xy.f.ma[] maVarArr;
        getHighSpeedVideoFpsRangesFor();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-1483216162, 1840066441, 607599100, -272975400, -1111335025, -396087229, 1979359730, 755084384, -1692584825, -1522416186, 382177478, 903966954}, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 23, objArr);
            util.h.xy.f.ma maVar = new util.h.xy.f.ma(((java.lang.String) objArr[0]).intern(), 0);
            f2204 = maVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-329896788, -120170481, 1333956829, 871520034, -1931819894, 1248291181, 1764205755, 722483628, -1347564125, 1079828578}, 19 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            util.h.xy.f.ma maVar2 = new util.h.xy.f.ma(((java.lang.String) objArr2[0]).intern(), 1);
            f2207 = maVar2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{454053155, 1311041049, 430152077, 847446328, -224744413, 1196011319, -1880256274, 418194096, 2031805656, -1465543093}, 'A' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
            util.h.xy.f.ma maVar3 = new util.h.xy.f.ma(((java.lang.String) objArr3[0]).intern(), 2);
            f2206 = maVar3;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-622518309, 1379059073, 152081826, 2123341477, 441508645, -2096093603, -681094089, -819983319, 174897824, 1022985549, 1225956718, 1523376217, -880445625, 2089493149, 1086064506, 180379432}, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 31, objArr4);
            util.h.xy.f.ma maVar4 = new util.h.xy.f.ma(((java.lang.String) objArr4[0]).intern(), 3);
            f2205 = maVar4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{1043444837, 1065698225, 1764923026, 1495470413, -56682041, 1924804405, -1880256274, 418194096, 2031805656, -1465543093}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 18, objArr5);
            util.h.xy.f.ma maVar5 = new util.h.xy.f.ma(((java.lang.String) objArr5[0]).intern(), 4);
            f2208 = maVar5;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-1448719220, 64076831, 672898662, 1454130919, 454053155, 1311041049, -1116488753, 1661524676, 848093916, 1278535337}, android.view.KeyEvent.normalizeMetaState(0) + 19, objArr6);
            util.h.xy.f.ma maVar6 = new util.h.xy.f.ma(((java.lang.String) objArr6[0]).intern(), 5);
            f2203 = maVar6;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-34650178, -2040811076, 1051252099, 768158486, 1569998655, -1043827503, -1505096435, 1474729629, -1304797927, -1414239806, -1897923072, 1848267198}, 21 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr7);
            util.h.xy.f.ma maVar7 = new util.h.xy.f.ma(((java.lang.String) objArr7[0]).intern(), 6);
            f2202 = maVar7;
            int i = getHighSpeedVideoFpsRanges + 63;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                maVarArr = new util.h.xy.f.ma[60];
                maVarArr[1] = maVar;
                maVarArr[1] = maVar2;
                maVarArr[4] = maVar3;
                maVarArr[5] = maVar4;
                maVarArr[2] = maVar5;
                maVarArr[3] = maVar6;
                maVarArr[4] = maVar7;
            } else {
                maVarArr = new util.h.xy.f.ma[]{maVar, maVar2, maVar3, maVar4, maVar5, maVar6, maVar7};
            }
            Camera2StreamConfigurationMap = maVarArr;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoSizes(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoSizesFor;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoSizesFor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 79) % 128;
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = new int[]{-889833422, -1998383379, 1889083231, 607768832, 1151569651, 1299124439, -789118042, -138454083, 1131665403, 890084006, -21564668, -1604397902, 2133437692, 174202409, -387853047, -420310874, -273575507, 1549017003};
    }
}
