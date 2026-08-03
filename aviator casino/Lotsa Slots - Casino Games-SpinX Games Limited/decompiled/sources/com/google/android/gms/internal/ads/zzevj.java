package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzevj implements com.google.android.gms.internal.ads.zzfck {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;

    zzevj(com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context) {
        this.zzb = zzhcgVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzos)).booleanValue()) {
            return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzevk(null, false));
        }
        final android.content.ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzevk(null, false)) : this.zzb.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzevi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                android.content.ContentResolver contentResolver2 = contentResolver;
                return new com.google.android.gms.internal.ads.zzevk(android.provider.Settings.Secure.getString(contentResolver2, "advertising_id"), android.provider.Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 61;
    }
}
