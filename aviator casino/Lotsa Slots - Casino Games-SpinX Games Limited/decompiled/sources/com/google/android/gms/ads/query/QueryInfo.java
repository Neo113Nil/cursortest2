package com.google.android.gms.ads.query;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class QueryInfo {
    private final com.google.android.gms.ads.internal.client.zzex zza;

    public QueryInfo(com.google.android.gms.ads.internal.client.zzex zzexVar) {
        this.zza = zzexVar;
    }

    public static void generate(android.content.Context context, com.google.android.gms.ads.AdFormat adFormat, com.google.android.gms.ads.AdRequest adRequest, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    private static void zza(final android.content.Context context, final com.google.android.gms.ads.AdFormat adFormat, final com.google.android.gms.ads.AdRequest adRequest, final java.lang.String str, final com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzj.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.AdRequest adRequest2 = adRequest;
                        com.google.android.gms.ads.internal.client.zzeh zza = adRequest2 == null ? null : adRequest2.zza();
                        new com.google.android.gms.internal.ads.zzbzs(context, adFormat, zza, str).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.zzbzs(context, adFormat, adRequest == null ? null : adRequest.zza(), str).zzb(queryInfoGenerationCallback);
    }

    public java.lang.String getQuery() {
        return this.zza.zza();
    }

    public android.os.Bundle getQueryBundle() {
        return this.zza.zzc();
    }

    public java.lang.String getRequestId() {
        return this.zza.zzb();
    }

    public static void generate(android.content.Context context, com.google.android.gms.ads.AdFormat adFormat, com.google.android.gms.ads.AdRequest adRequest, java.lang.String str, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
