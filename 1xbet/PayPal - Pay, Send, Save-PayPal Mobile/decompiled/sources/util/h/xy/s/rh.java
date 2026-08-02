package util.h.xy.s;

/* loaded from: classes5.dex */
public final class rh extends util.h.xy.s.ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static long getInputSizeshNQ4ISI;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String f2413;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String f2414;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String f2415;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String f2416;

    static {
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\udd02劑Կ", (char) (23664 - android.text.TextUtils.getOffsetBefore("", 0)), 129214528 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "㼍뎨瀇㥜", "൴낓\ue495夘", objArr);
        f2414 = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("⨰\ud9acᏱ鯜䃸ᯏ녀࠼퓧둘ו㔌⚀뚏謽᫁", (char) (24282 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "讝噕\udabc\u0c5e", "൴낓\ue495夘", objArr2);
        f2413 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("鵔꽅뚀ᗥ䷈豭ੌ庼ୟ뫵黐䁲镤ﰇ", (char) (42049 - android.view.View.MeasureSpec.getSize(0)), android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, "ࠟﶕ䄮喤", "൴낓\ue495夘", objArr3);
        f2415 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("뢤驃ὰ\udd83秫䄷ﶕ柰↥㡬ಾ塠\ueca8", (char) (android.text.TextUtils.getOffsetBefore("", 0) + 48239), 1944774786 + android.graphics.Color.argb(0, 0, 0, 0), "苧\ueae8潳ڼ", "൴낓\ue495夘", objArr4);
        f2416 = ((java.lang.String) objArr4[0]).intern();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 103) % 128;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        int i2 = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        getHighSpeedVideoFpsRanges = i2;
        getHighSpeedVideoFpsRangesFor = (i2 + 85) % 128;
        char[] charArray = str3.toCharArray();
        int i3 = getHighSpeedVideoFpsRanges + 59;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = charArray;
        char[] charArray2 = str2.toCharArray();
        int i5 = getHighSpeedVideoFpsRangesFor + 5;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr2, 0, length);
        java.lang.System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 121) % 128;
            int i6 = (rcVar.f2652 + 2) % 4;
            int i7 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i6]) % 65535);
            cArr3[i7] = (char) (((cArr2[i7] * 32718) + cArr3[i6]) / 65535);
            cArr2[i7] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i7] ^ charArray3[rcVar.f2652]) ^ (getInputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizesFor ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizes ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = 8863821012740292158L;
        getHighSpeedVideoSizesFor = 294925130;
        getHighSpeedVideoSizes = (char) 13130;
    }
}
