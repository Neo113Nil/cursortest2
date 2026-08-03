package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class ExternalOfferReportingDetails {
    private final java.lang.String externalTransactionToken;

    ExternalOfferReportingDetails(java.lang.String str) throws org.json.JSONException {
        this.externalTransactionToken = new org.json.JSONObject(str).optString("externalTransactionToken");
    }

    public java.lang.String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
