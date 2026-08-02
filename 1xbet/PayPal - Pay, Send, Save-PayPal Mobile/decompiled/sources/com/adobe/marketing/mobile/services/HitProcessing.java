package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
public interface HitProcessing {
    void processHit(com.adobe.marketing.mobile.services.DataEntity dataEntity, com.adobe.marketing.mobile.services.HitProcessingResult hitProcessingResult);

    int retryInterval(com.adobe.marketing.mobile.services.DataEntity dataEntity);
}
