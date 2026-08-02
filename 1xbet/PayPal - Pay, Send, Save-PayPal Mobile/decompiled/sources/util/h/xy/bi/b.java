package util.h.xy.bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static long Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 1;
    private static final /* synthetic */ util.h.xy.bi.b[] getInputSizeshNQ4ISI;
    private static char[] getOutputMinFrameDuration;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.bi.b f957;
    private util.h.xy.g.b getInputFormats;

    private b(java.lang.String str) {
    }

    public static util.h.xy.bi.b valueOf(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.bi.b bVar = (util.h.xy.bi.b) java.lang.Enum.valueOf(util.h.xy.bi.b.class, str);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
        return bVar;
    }

    public static util.h.xy.bi.b[] values() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.bi.b[] bVarArr = (util.h.xy.bi.b[]) getInputSizeshNQ4ISI.clone();
        int i2 = getHighSpeedVideoSizesFor + 57;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return bVarArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        util.h.xy.bi.b[] bVarArr;
        getHighSpeedVideoFpsRanges();
        int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
        char c = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        int i = indexOf + 8;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 53) % 128;
            jArr[rbVar.f2651] = (((char) (getOutputMinFrameDuration[rbVar.f2651 + packedPositionType] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ Camera2StreamConfigurationMap))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 53) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 89) % 128;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 9) % 128;
        util.h.xy.bi.b bVar = new util.h.xy.bi.b(str.intern());
        f957 = bVar;
        int i2 = getHighSpeedVideoSizesFor + 33;
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            bVarArr = new util.h.xy.bi.b[1];
            bVarArr[1] = bVar;
        } else {
            bVarArr = new util.h.xy.bi.b[]{bVar};
        }
        getHighSpeedVideoSizesFor = (i3 + 1) % 128;
        getInputSizeshNQ4ISI = bVarArr;
        getHighSpeedVideoFpsRangesFor = util.h.xy.bi.b.class.getCanonicalName();
        int i4 = getHighSpeedVideoSizesFor + 103;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25494() throws com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException {
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
        this.getInputFormats = util.h.xy.g.c.m26869();
        int i = getHighSpeedVideoSizesFor + 49;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.bi.ra m25493(util.h.xy.bf.a aVar) throws com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 41) % 128;
        m25494();
        util.h.xy.g.b bVar = this.getInputFormats;
        if (bVar != null) {
            int i = getHighSpeedVideoSizesFor + 85;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                bVar.mo26865();
                throw null;
            }
            if (bVar.mo26865() != null) {
                this.getInputFormats.mo26865();
                if (this.getInputFormats.mo26865() == util.h.xy.s.a.b.f2298) {
                    return new util.h.xy.bi.a(this.getInputFormats, aVar);
                }
                if (this.getInputFormats.mo26865() != util.h.xy.s.a.b.f2296) {
                    if (this.getInputFormats.mo26865() == util.h.xy.s.a.b.f2297) {
                        return new util.h.xy.bi.ma(this.getInputFormats, aVar);
                    }
                    return null;
                }
                util.h.xy.bi.rb rbVar = new util.h.xy.bi.rb(this.getInputFormats, aVar);
                int i2 = getHighSpeedVideoSizesFor + 43;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    return rbVar;
                }
                throw null;
            }
        }
        return null;
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputMinFrameDuration = new char[]{40008, 47304, 54620, 61888, 3676, 10988, 18280, 25589};
        Camera2StreamConfigurationMap = 5738691215867230342L;
    }
}
