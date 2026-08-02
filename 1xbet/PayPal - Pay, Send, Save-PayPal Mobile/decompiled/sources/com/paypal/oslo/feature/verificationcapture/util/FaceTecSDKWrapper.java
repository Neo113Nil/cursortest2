package com.paypal.oslo.feature.verificationcapture.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J3\u0010\u000e\u001a\u00020\u00042\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fH&¢\u0006\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/util/FaceTecSDKWrapper;", "", "Lcom/facetec/sdk/FaceTecCustomization;", "customization", "", "setCustomization", "(Lcom/facetec/sdk/FaceTecCustomization;)V", "setLowLightCustomization", "setDynamicDimmingCustomization", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "strings", "setDynamicStrings", "(Ljava/util/HashMap;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface FaceTecSDKWrapper {
    void setCustomization(com.facetec.sdk.FaceTecCustomization customization);

    void setDynamicDimmingCustomization(com.facetec.sdk.FaceTecCustomization customization);

    void setDynamicStrings(java.util.HashMap<java.lang.Integer, java.lang.String> strings);

    void setLowLightCustomization(com.facetec.sdk.FaceTecCustomization customization);
}
