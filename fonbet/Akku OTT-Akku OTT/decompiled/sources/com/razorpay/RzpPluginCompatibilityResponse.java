package com.razorpay;

import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;

@Keep
@KeepClassMembers
/* loaded from: classes4.dex */
public class RzpPluginCompatibilityResponse {
    private String __l1_;
    private boolean l$1_I$l$;

    public RzpPluginCompatibilityResponse(boolean z, String str) {
        this.l$1_I$l$ = z;
        this.__l1_ = str;
    }

    public String getErrorMessage() {
        String str = this.__l1_;
        return str == null ? "" : str;
    }

    public boolean isCompatible() {
        return this.l$1_I$l$;
    }
}
