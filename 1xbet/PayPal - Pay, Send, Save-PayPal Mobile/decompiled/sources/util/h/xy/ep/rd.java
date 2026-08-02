package util.h.xy.ep;

/* loaded from: classes18.dex */
public final class rd extends util.h.xy.ep.mc {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m26678() {
        int i = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return this.getHighSpeedVideoSizes;
        }
        throw null;
    }

    public rd(byte[] bArr, int i) {
        super(bArr);
        this.getHighSpeedVideoSizes = i;
    }
}
