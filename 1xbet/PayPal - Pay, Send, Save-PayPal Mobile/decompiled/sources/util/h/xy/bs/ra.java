package util.h.xy.bs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ra {
    private static final /* synthetic */ util.h.xy.bs.ra[] Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static char[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputMinFrameDuration;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.bs.ra f1036;

    private ra(java.lang.String str) {
    }

    public static util.h.xy.bs.ra valueOf(java.lang.String str) {
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
        util.h.xy.bs.ra raVar = (util.h.xy.bs.ra) java.lang.Enum.valueOf(util.h.xy.bs.ra.class, str);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 105) % 128;
        return raVar;
    }

    public static util.h.xy.bs.ra[] values() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 11;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.bs.ra[] raVarArr = Camera2StreamConfigurationMap;
        if (i % 2 != 0) {
            return (util.h.xy.bs.ra[]) raVarArr.clone();
        }
        throw null;
    }

    static {
        util.h.xy.bs.ra[] raVarArr;
        Camera2StreamConfigurationMap();
        int i = 0;
        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
        char keyCodeFromString = (char) android.view.KeyEvent.keyCodeFromString("");
        int i2 = 8 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1));
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i2];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i2) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 111) % 128;
            jArr[rbVar.f2651] = (((char) (getInputSizeshNQ4ISI[rbVar.f2651 + trimmedLength] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRanges))) ^ keyCodeFromString;
            rbVar.f2651++;
        }
        char[] cArr = new char[i2];
        while (true) {
            rbVar.f2651 = i;
            if (rbVar.f2651 >= i2) {
                break;
            }
            int i3 = getHighSpeedVideoFpsRangesFor + 67;
            getHighSpeedVideoSizes = i3 % 128;
            int i4 = i3 % 2;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            i = rbVar.f2651 + 1;
        }
        util.h.xy.bs.ra raVar = new util.h.xy.bs.ra(new java.lang.String(cArr).intern());
        f1036 = raVar;
        int i5 = getHighSpeedVideoSizesFor + 93;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            raVarArr = new util.h.xy.bs.ra[1];
            raVarArr[1] = raVar;
        } else {
            raVarArr = new util.h.xy.bs.ra[]{raVar};
        }
        Camera2StreamConfigurationMap = raVarArr;
        getOutputMinFrameDuration = util.h.xy.bs.ra.class.getName();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 99) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25620() throws util.h.xy.ci.ma {
        synchronized (this) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 79) % 128;
            util.h.xy.ci.ra.m25931().m25936(util.h.xy.ag.a.m24556().m24558());
            util.h.xy.ci.ra.m25931().m25935();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 51) % 128;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25621() {
        synchronized (this) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 17;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 != 0) {
                util.h.xy.ci.ra.m25931().m25932();
            } else {
                util.h.xy.ci.ra.m25931().m25932();
                throw null;
            }
        }
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = new char[]{40008, 41968, 58156, 9064, 25276, 41716, 57912, 8829};
        getHighSpeedVideoFpsRanges = -5948376044753869890L;
    }
}
