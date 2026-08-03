package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XE {
    public static com.facebook.ads.AdError A00(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        if (c1108Vm.A03().isPublicError()) {
            return new com.facebook.ads.AdError(c1108Vm.A03().getErrorCode(), c1108Vm.A04());
        }
        return new com.facebook.ads.AdError(com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR.getErrorCode(), com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
