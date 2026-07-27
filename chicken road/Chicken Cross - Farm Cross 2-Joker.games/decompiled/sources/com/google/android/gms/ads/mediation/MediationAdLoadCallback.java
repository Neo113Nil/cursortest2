package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(AdError adError);

    MediationAdCallbackT onSuccess(MediationAdT mediationadt);
}
