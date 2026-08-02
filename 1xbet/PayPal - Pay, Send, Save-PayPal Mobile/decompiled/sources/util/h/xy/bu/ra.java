package util.h.xy.bu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ra {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final /* synthetic */ util.h.xy.bu.ra[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputSizeshNQ4ISI = 1;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.bu.ra f1054;

    private ra(java.lang.String str) {
    }

    public static util.h.xy.bu.ra valueOf(java.lang.String str) {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 105) % 128;
        util.h.xy.bu.ra raVar = (util.h.xy.bu.ra) java.lang.Enum.valueOf(util.h.xy.bu.ra.class, str);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 37) % 128;
        return raVar;
    }

    public static util.h.xy.bu.ra[] values() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 57) % 128;
        util.h.xy.bu.ra[] raVarArr = (util.h.xy.bu.ra[]) getHighSpeedVideoFpsRanges.clone();
        int i = getInputSizeshNQ4ISI + 63;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            return raVarArr;
        }
        throw null;
    }

    static {
        util.h.xy.bu.ra[] raVarArr;
        getHighResolutionOutputSizeshNQ4ISI();
        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
        int i = getHighSpeedVideoFpsRangesFor + 39;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        char[] charArray = "쵸촱\uf299\u0001爕韪幄١蚒빡⚭┍".toCharArray();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 111) % 128;
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, maxKeyCode);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        util.h.xy.bu.ra raVar = new util.h.xy.bu.ra(new java.lang.String(m27721, 4, m27721.length - 4).intern());
        f1054 = raVar;
        int i2 = getInputSizeshNQ4ISI;
        int i3 = i2 + 19;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 != 0) {
            raVarArr = new util.h.xy.bu.ra[0];
            raVarArr[0] = raVar;
        } else {
            raVarArr = new util.h.xy.bu.ra[]{raVar};
        }
        int i4 = (i2 + 109) % 128;
        getHighSpeedVideoSizesFor = i4;
        getHighSpeedVideoFpsRanges = raVarArr;
        Camera2StreamConfigurationMap = "ra";
        int i5 = i4 + 93;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void Camera2StreamConfigurationMap() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 71;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.p.a.m27019(util.h.xy.k.ma.m26925());
            int i2 = getHighSpeedVideoSizesFor + 125;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        util.h.xy.p.a.m27019(util.h.xy.k.ma.m26925());
        throw null;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighResolutionOutputSizeshNQ4ISI = -4526448988110714114L;
    }
}
