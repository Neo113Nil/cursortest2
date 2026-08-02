package com.microblink.blinkid.entities.recognizers.templating.dewarpPolicies;

/* loaded from: classes10.dex */
public final class DPIBasedDewarpPolicy extends com.microblink.blinkid.entities.recognizers.templating.DewarpPolicy {
    public static final int DEFAULT_DPI = 250;
    private final int getHighSpeedVideoSizes;

    public DPIBasedDewarpPolicy() {
        this(250);
    }

    private static native void dpiPolicyNativeSet(long j, int i);

    public final int getDPI() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.microblink.blinkid.entities.recognizers.templating.DewarpPolicy
    public final void llIIlIlIIl(long j) {
        dpiPolicyNativeSet(j, this.getHighSpeedVideoSizes);
    }

    public DPIBasedDewarpPolicy(int i) {
        if (i >= 100 && i <= 400) {
            this.getHighSpeedVideoSizes = i;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DPI value must be in range [100, 400], you are trying to set DPI to: ");
        sb.append(i);
        sb.append(".");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
