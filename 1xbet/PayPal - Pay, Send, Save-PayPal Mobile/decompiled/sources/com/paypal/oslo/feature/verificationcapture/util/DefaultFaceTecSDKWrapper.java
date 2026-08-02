package com.paypal.oslo.feature.verificationcapture.util;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ3\u0010\u0010\u001a\u00020\u00062\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/util/DefaultFaceTecSDKWrapper;", "Lcom/paypal/oslo/feature/verificationcapture/util/FaceTecSDKWrapper;", "<init>", "()V", "Lcom/facetec/sdk/FaceTecCustomization;", "customization", "", "setCustomization", "(Lcom/facetec/sdk/FaceTecCustomization;)V", "setLowLightCustomization", "setDynamicDimmingCustomization", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "strings", "setDynamicStrings", "(Ljava/util/HashMap;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultFaceTecSDKWrapper implements com.paypal.oslo.feature.verificationcapture.util.FaceTecSDKWrapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.util.DefaultFaceTecSDKWrapper INSTANCE = new com.paypal.oslo.feature.verificationcapture.util.DefaultFaceTecSDKWrapper();

    private DefaultFaceTecSDKWrapper() {
    }

    @Override // com.paypal.oslo.feature.verificationcapture.util.FaceTecSDKWrapper
    public final void setCustomization(com.facetec.sdk.FaceTecCustomization customization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customization, "");
        com.facetec.sdk.FaceTecSDK.setCustomization(customization);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.util.FaceTecSDKWrapper
    public final void setLowLightCustomization(com.facetec.sdk.FaceTecCustomization customization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customization, "");
        com.facetec.sdk.FaceTecSDK.setLowLightCustomization(customization);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.util.FaceTecSDKWrapper
    public final void setDynamicDimmingCustomization(com.facetec.sdk.FaceTecCustomization customization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customization, "");
        com.facetec.sdk.FaceTecSDK.setDynamicDimmingCustomization(customization);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.util.FaceTecSDKWrapper
    public final void setDynamicStrings(java.util.HashMap<java.lang.Integer, java.lang.String> strings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "");
        com.facetec.sdk.FaceTecSDK.setDynamicStrings(strings);
    }
}
