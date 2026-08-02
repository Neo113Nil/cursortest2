package util.h.xy.ci;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static final /* synthetic */ util.h.xy.ci.b[] getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static char getHighSpeedVideoSizes = 0;
    private static long getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.ci.b f1099;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.ci.b f1100;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.ci.b f1101;

    private b(java.lang.String str, int i) {
    }

    public static util.h.xy.ci.b valueOf(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getInputFormats + 3) % 128;
        util.h.xy.ci.b bVar = (util.h.xy.ci.b) java.lang.Enum.valueOf(util.h.xy.ci.b.class, str);
        int i = getInputFormats + 61;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    public static util.h.xy.ci.b[] values() {
        int i = getHighSpeedVideoFpsRanges + 77;
        getInputFormats = i % 128;
        util.h.xy.ci.b[] bVarArr = getHighResolutionOutputSizeshNQ4ISI;
        if (i % 2 != 0) {
            return (util.h.xy.ci.b[]) bVarArr.clone();
        }
        throw null;
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("⤶浪仯厩ꦻÏ츇斢馰퍘旽짓糖띠屽瓒퇒欻剸\ue87a⑼ꨐ༣ᒤ\ue6c2\ud95c귰", (char) (57655 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-77670845) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "䌊廖㟻槡", "덃镫ꋏꩀ", objArr);
        util.h.xy.ci.b bVar = new util.h.xy.ci.b(((java.lang.String) objArr[0]).intern(), 0);
        f1101 = bVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ಋ솚뗬\uf701ꕀ뫗⋎ǹ\u0e3e檴奪聍牨뾮넊뿡ᜂ켹㛢龜㉑\udf52\uda58獰۹劐㌑뙢牷ꬭ후榞", (char) (android.view.View.MeasureSpec.getMode(0) + 54141), android.view.View.getDefaultSize(0, 0), "抪ꄥ緆㛓", "덃镫ꋏꩀ", objArr2);
        util.h.xy.ci.b bVar2 = new util.h.xy.ci.b(((java.lang.String) objArr2[0]).intern(), 1);
        f1099 = bVar2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("罯쟔㾩좼ĺƔﻅ懵\u0b5b籎뻙ㄊ朶鲨\uf2b8뎓뗁薋쨐粖䟚⫶䮩哨႖텡", (char) (android.view.View.MeasureSpec.getSize(0) + 42131), android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, "蟏ಃ鍾삤", "덃镫ꋏꩀ", objArr3);
        util.h.xy.ci.b bVar3 = new util.h.xy.ci.b(((java.lang.String) objArr3[0]).intern(), 2);
        f1100 = bVar3;
        int i = (getInputFormats + 31) % 128;
        getHighSpeedVideoFpsRanges = i;
        util.h.xy.ci.b[] bVarArr = {bVar, bVar2, bVar3};
        int i2 = i + 89;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            getHighResolutionOutputSizeshNQ4ISI = bVarArr;
            int i3 = i + 15;
            getInputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        int i2 = getHighSpeedVideoFpsRangesFor + 31;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 3;
        }
        while (rcVar.f2652 < length3) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 21) % 128;
            int i4 = (rcVar.f2652 + 2) % 4;
            int i5 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i4]) % 65535);
            cArr2[i5] = (char) (((cArr[i5] * 32718) + cArr2[i4]) / 65535);
            cArr[i5] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i5] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getInputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizes ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        java.lang.String str4 = new java.lang.String(cArr3);
        int i6 = Camera2StreamConfigurationMap + 43;
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str4;
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = -8621340606112759799L;
        getInputSizeshNQ4ISI = 294925130;
        getHighSpeedVideoSizes = (char) 13130;
    }
}
