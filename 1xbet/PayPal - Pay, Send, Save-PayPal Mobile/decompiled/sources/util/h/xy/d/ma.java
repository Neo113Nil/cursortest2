package util.h.xy.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ma {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 1;
    private static char getInputFormats;
    private static final /* synthetic */ util.h.xy.d.ma[] getInputSizeshNQ4ISI;
    private static char getOutputFormats;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.d.ma f1140;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.d.ma f1141;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.d.ma f1142;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.d.ma f1143;

    private ma(java.lang.String str, int i) {
    }

    public static util.h.xy.d.ma valueOf(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 93;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.d.ma maVar = (util.h.xy.d.ma) java.lang.Enum.valueOf(util.h.xy.d.ma.class, str);
        if (i % 2 != 0) {
            return maVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.d.ma[] values() {
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
        util.h.xy.d.ma[] maVarArr = (util.h.xy.d.ma[]) getInputSizeshNQ4ISI.clone();
        int i = getHighSpeedVideoSizesFor + 27;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return maVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("┍ꝣ⛏ﳇ鷇湎㨪嫙埰\uf4e0ᡈᠡ", 12 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        util.h.xy.d.ma maVar = new util.h.xy.d.ma(((java.lang.String) objArr[0]).intern(), 0);
        f1140 = maVar;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("邐⻗睏吮潬裫υ蠪或\uf2d9艋颲횺缽盳蒏騄↿芨\ue343", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 19, objArr2);
            util.h.xy.d.ma maVar2 = new util.h.xy.d.ma(((java.lang.String) objArr2[0]).intern(), 1);
            f1142 = maVar2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("邐⻗睏吮潬裫υ蠪ᕣ幣或\uf2d9虉道", 14 - android.text.TextUtils.getTrimmedLength(""), objArr3);
            util.h.xy.d.ma maVar3 = new util.h.xy.d.ma(((java.lang.String) objArr3[0]).intern(), 2);
            f1141 = maVar3;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("邐⻗睏吮潬裫υ蠪䞝\ud8be믶⫫", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, objArr4);
            util.h.xy.d.ma maVar4 = new util.h.xy.d.ma(((java.lang.String) objArr4[0]).intern(), 3);
            f1143 = maVar4;
            int i = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
            getHighSpeedVideoSizesFor = i;
            getHighResolutionOutputSizeshNQ4ISI = (i + 119) % 128;
            getInputSizeshNQ4ISI = new util.h.xy.d.ma[]{maVar, maVar2, maVar3, maVar4};
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor + 43;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i3 = getHighSpeedVideoFpsRangesFor + 107;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                cArr2[1] = charArray[eVar.f2630];
                int i4 = eVar.f2630;
                throw new java.lang.ArithmeticException();
            }
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (getInputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L))) ^ (c3 + i5)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                i5 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 87) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRanges = (char) 9676;
        getOutputFormats = (char) 50968;
        getInputFormats = (char) 63563;
        Camera2StreamConfigurationMap = (char) 64322;
    }
}
