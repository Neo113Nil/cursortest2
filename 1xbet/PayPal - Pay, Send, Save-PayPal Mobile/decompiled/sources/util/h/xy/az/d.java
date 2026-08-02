package util.h.xy.az;

/* loaded from: classes18.dex */
public final class d {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private util.h.xy.az.b Camera2StreamConfigurationMap;
    private util.h.xy.az.d.b getHighSpeedVideoFpsRangesFor;

    public interface b {
        /* renamed from: ᐝ, reason: contains not printable characters */
        void mo25269(util.h.xy.az.ma maVar);

        /* renamed from: ᐝ, reason: contains not printable characters */
        void mo25270(util.h.xy.az.ra raVar);
    }

    private d() {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.az.b m25267() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 47) + (i | 47);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.az.b bVar = this.Camera2StreamConfigurationMap;
        int i3 = i + 105;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.az.d.b m25268() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 115) << 1) - (i ^ 115);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.az.d.b bVar = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 95) + ((i3 & 95) << 1)) % 128;
        return bVar;
    }

    public d(util.h.xy.az.b bVar, util.h.xy.az.d.b bVar2) {
        this.Camera2StreamConfigurationMap = bVar;
        this.getHighSpeedVideoFpsRangesFor = bVar2;
    }
}
