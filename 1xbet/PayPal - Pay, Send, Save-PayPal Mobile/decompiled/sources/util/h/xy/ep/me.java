package util.h.xy.ep;

/* loaded from: classes5.dex */
public final class me implements util.h.xy.ef.mb {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.ef.mb getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.ef.mb m26666() {
        int i = getHighSpeedVideoSizes + 95;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.security.SecureRandom m26667() {
        int i = (getHighSpeedVideoFpsRangesFor + 5) % 128;
        getHighSpeedVideoSizes = i;
        java.security.SecureRandom secureRandom = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 83) + ((i & 83) << 1)) % 128;
        return secureRandom;
    }

    public me(util.h.xy.ef.mb mbVar, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRanges = util.h.xy.ef.rb.m26559(secureRandom);
        this.getHighResolutionOutputSizeshNQ4ISI = mbVar;
    }
}
