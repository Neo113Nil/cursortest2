package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzelq {
    private final android.content.Context zza;

    zzelq(android.content.Context context) {
        this.zza = context;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(boolean z) {
        try {
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest build = new androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest.Builder().setAdsSdkName(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z).build();
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures from = androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.from(this.zza);
            return from != null ? from.getTopicsAsync(build) : com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.IllegalStateException());
        } catch (java.lang.Exception e) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(e);
        }
    }
}
