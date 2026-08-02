package com.microblink.blinkid.entities.recognizers.templating.dewarpPolicies;

/* loaded from: classes10.dex */
public final class FixedDewarpPolicy extends com.microblink.blinkid.entities.recognizers.templating.DewarpPolicy {
    public static final int DEFAULT_DEWARP_HEIGHT = 100;
    private final int getHighSpeedVideoFpsRanges;

    public FixedDewarpPolicy() {
        this(100);
    }

    private static native void fixedPolicyNativeSet(long j, int i);

    public final int getDewarpHeight() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.microblink.blinkid.entities.recognizers.templating.DewarpPolicy
    public final void llIIlIlIIl(long j) {
        fixedPolicyNativeSet(j, this.getHighSpeedVideoFpsRanges);
    }

    public FixedDewarpPolicy(int i) {
        if (i <= 0 || i > 65535) {
            throw new java.lang.IllegalArgumentException("Invalid dewarp height");
        }
        this.getHighSpeedVideoFpsRanges = i;
    }
}
