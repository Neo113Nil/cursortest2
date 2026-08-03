package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzcsb implements com.google.android.gms.internal.ads.zzhbe {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzcsb zza = new com.google.android.gms.internal.ads.zzcsb();

    private /* synthetic */ zzcsb() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
        java.lang.Throwable th = (java.lang.Throwable) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlQ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse(com.google.android.gms.internal.ads.zzgwm.zzi()));
    }
}
