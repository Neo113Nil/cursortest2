package com.inmobi.ads.listeners;

/* loaded from: classes5.dex */
public abstract class AdEventListener<T> {
    public void onAdClicked(T t, java.util.Map<java.lang.Object, java.lang.Object> map) {
    }

    public void onAdFetchSuccessful(T t, com.inmobi.ads.AdMetaInfo adMetaInfo) {
    }

    public void onAdImpression(T t) {
    }

    public void onAdLoadFailed(T t, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdLoadSucceeded(T t, com.inmobi.ads.AdMetaInfo adMetaInfo) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
    }
}
