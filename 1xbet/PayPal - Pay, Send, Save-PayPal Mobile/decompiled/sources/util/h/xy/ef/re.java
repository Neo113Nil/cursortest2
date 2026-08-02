package util.h.xy.ef;

/* loaded from: classes18.dex */
public final class re {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m26567() {
        int i = getHighSpeedVideoSizes + 101;
        getHighSpeedVideoFpsRangesFor = i % 128;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.security.SecureRandom m26566() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i + 95) % 128;
        java.security.SecureRandom secureRandom = this.Camera2StreamConfigurationMap;
        int i2 = i + 121;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return secureRandom;
        }
        throw null;
    }

    public re(java.security.SecureRandom secureRandom, int i) {
        this.Camera2StreamConfigurationMap = util.h.xy.ef.rb.m26559(secureRandom);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
