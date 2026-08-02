package com.microblink.blinkid.entities.recognizers.templating.dewarpPolicies;

/* loaded from: classes10.dex */
public final class NoUpScalingDewarpPolicy extends com.microblink.blinkid.entities.recognizers.templating.DewarpPolicy {
    public static final int DEFAULT_MAX_ALLOWED_DEWARPED_HEIGHT = 400;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public NoUpScalingDewarpPolicy() {
        this(400);
    }

    private static native void noUpScalingPolicyNativeSet(long j, int i);

    public final int getMaxAllowedDewarpHeight() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.microblink.blinkid.entities.recognizers.templating.DewarpPolicy
    public final void llIIlIlIIl(long j) {
        noUpScalingPolicyNativeSet(j, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public NoUpScalingDewarpPolicy(int i) {
        if (i <= 0 || i > 65535) {
            throw new java.lang.IllegalArgumentException("Invalid max dewarp height");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
