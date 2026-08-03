package com.unity3d.scar.adapter.v2100.requests;

/* loaded from: classes5.dex */
public class AdRequestFactory {
    private com.unity3d.scar.adapter.common.requests.RequestExtras _requestExtras;

    public AdRequestFactory(com.unity3d.scar.adapter.common.requests.RequestExtras requestExtras) {
        this._requestExtras = requestExtras;
    }

    public com.google.android.gms.ads.AdRequest.Builder getAdRequest() {
        return new com.google.android.gms.ads.AdRequest.Builder().setRequestAgent(this._requestExtras.getVersionName()).addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, this._requestExtras.getExtras());
    }

    public com.google.android.gms.ads.AdRequest buildAdRequest() {
        return getAdRequest().build();
    }

    public com.google.android.gms.ads.AdRequest buildAdRequestWithAdString(java.lang.String str) {
        if (str.isEmpty()) {
            return buildAdRequest();
        }
        return getAdRequest().setAdString(str).build();
    }
}
