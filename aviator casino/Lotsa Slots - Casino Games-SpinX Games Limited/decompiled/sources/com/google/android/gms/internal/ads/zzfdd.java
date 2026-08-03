package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzfdd implements com.google.android.gms.internal.ads.zzhbe {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzfdd zza = new com.google.android.gms.internal.ads.zzfdd();

    private /* synthetic */ zzfdd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
        androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse getTopicsResponse = (androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfdf("", 1, null));
        }
        com.google.android.gms.internal.ads.zzihy zzc = com.google.android.gms.internal.ads.zzihz.zzc();
        for (androidx.privacysandbox.ads.adservices.topics.Topic topic : getTopicsResponse.getTopics()) {
            com.google.android.gms.internal.ads.zzihw zzc2 = com.google.android.gms.internal.ads.zzihx.zzc();
            zzc2.zza(topic.getTopicId());
            zzc2.zzb(topic.getModelVersion());
            zzc2.zzc(topic.getTaxonomyVersion());
            zzc.zza((com.google.android.gms.internal.ads.zzihx) zzc2.zzbu());
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfdf(android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzihz) zzc.zzbu()).zzaN(), 1), 1, null));
    }
}
