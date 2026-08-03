package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfdx implements com.google.android.gms.internal.ads.zzfck {
    final com.google.android.gms.internal.ads.zzhcg zza;

    public zzfdx(com.google.android.gms.internal.ads.zzbhe zzbheVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context) {
        this.zza = zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.zzfdw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return new com.google.android.gms.internal.ads.zzfdy(new org.json.JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 45;
    }
}
