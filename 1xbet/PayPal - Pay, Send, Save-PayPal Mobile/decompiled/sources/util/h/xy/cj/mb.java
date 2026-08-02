package util.h.xy.cj;

/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private final org.json.JSONArray getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    public mb(int i, java.lang.String str, org.json.JSONArray jSONArray) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = jSONArray;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m25938() {
        int i = getHighSpeedVideoFpsRangesFor + 45;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return this.getHighSpeedVideoSizes;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.String m25937() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 27) << 1) - (i ^ 27);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw null;
    }
}
