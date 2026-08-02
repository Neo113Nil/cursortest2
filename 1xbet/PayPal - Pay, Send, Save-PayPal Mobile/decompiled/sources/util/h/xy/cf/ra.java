package util.h.xy.cf;

/* loaded from: classes5.dex */
public class ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static int getInputFormats;

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizesFor = util.h.xy.cf.ra.class.getName();
        getInputFormats = (getHighSpeedVideoFpsRanges + 17) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.cf.b m25902(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getInputFormats + 41) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 121), "\u000e\u0006\u0003\b\u000b\u0003\u0006\u0000\f\u000b", android.graphics.Color.rgb(0, 0, 0) + 16777226, objArr);
        if (((java.lang.String) objArr[0]).intern().equalsIgnoreCase(str)) {
            util.h.xy.cf.mb mbVar = new util.h.xy.cf.mb(str);
            getHighSpeedVideoFpsRanges = (getInputFormats + 19) % 128;
            return mbVar;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (37 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), "\r\u0005\u0001\u0003", 4 - android.text.TextUtils.getTrimmedLength(""), objArr2);
        if (((java.lang.String) objArr2[0]).intern().equalsIgnoreCase(str)) {
            util.h.xy.cf.ma maVar = new util.h.xy.cf.ma(str);
            getInputFormats = (getHighSpeedVideoFpsRanges + 21) % 128;
            return maVar;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (android.text.TextUtils.getTrimmedLength("") + 90), "\u0007\u0001\u0003\u000b", 3 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
        if (!((java.lang.String) objArr3[0]).intern().equalsIgnoreCase(str)) {
            return null;
        }
        util.h.xy.cf.a aVar = new util.h.xy.cf.a(str);
        int i = getInputFormats + 51;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = Camera2StreamConfigurationMap + 43;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 39) % 128;
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRangesFor);
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
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 39) % 128;
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    int i5 = Camera2StreamConfigurationMap + 15;
                    getHighSpeedVideoSizes = i5 % 128;
                    if (i5 % 2 != 0) {
                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 + b);
                        cArr3[mcVar.f2638] = (char) (mcVar.f2636 % b);
                    } else {
                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                        cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                    }
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i6 = mcVar.f2639;
                        int i7 = mcVar.f2640;
                        int i8 = mcVar.f2637;
                        int i9 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i6 * c) + i7];
                        cArr3[mcVar.f2638 + 1] = cArr[(i8 * c) + i9];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i10 = mcVar.f2639;
                        int i11 = mcVar.f2640;
                        int i12 = mcVar.f2637;
                        int i13 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i10 * c) + i11];
                        cArr3[mcVar.f2638 + 1] = cArr[(i12 * c) + i13];
                    } else {
                        int i14 = mcVar.f2639;
                        int i15 = mcVar.f2635;
                        int i16 = mcVar.f2637;
                        int i17 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i14 * c) + i15];
                        cArr3[mcVar.f2638 + 1] = cArr[(i16 * c) + i17];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr3[i18] = (char) (cArr3[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighResolutionOutputSizeshNQ4ISI = new char[]{41871, 41877, 41885, 41865, 41887, 41868, 41878, 41881, 41880, 41866, 41873, 41864, 41869, 41867, 41879, 41870};
        getHighSpeedVideoFpsRangesFor = (char) 38466;
    }
}
