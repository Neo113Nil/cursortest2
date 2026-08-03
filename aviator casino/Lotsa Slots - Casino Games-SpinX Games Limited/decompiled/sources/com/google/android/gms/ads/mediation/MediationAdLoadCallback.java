package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(com.google.android.gms.ads.AdError adError);

    MediationAdCallbackT onSuccess(MediationAdT mediationadt);
}
