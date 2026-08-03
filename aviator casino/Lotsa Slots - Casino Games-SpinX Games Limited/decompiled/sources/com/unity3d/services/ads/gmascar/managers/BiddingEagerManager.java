package com.unity3d.services.ads.gmascar.managers;

/* loaded from: classes5.dex */
public class BiddingEagerManager extends com.unity3d.services.ads.gmascar.managers.BiddingBaseManager {
    public BiddingEagerManager(com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider iScarAdFormatProvider, com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener) {
        super(iScarAdFormatProvider, iUnityAdsTokenListener);
    }

    @Override // com.unity3d.services.ads.gmascar.managers.BiddingBaseManager
    public void start() {
        permitSignalsUpload();
        fetchSignals();
    }
}
