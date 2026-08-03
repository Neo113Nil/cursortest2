package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeiz {
    private final com.google.android.gms.internal.ads.zzeiv zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;

    public zzeiz(com.google.android.gms.internal.ads.zzeiv zzeivVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        this.zza = zzeivVar;
        this.zzb = zzhcgVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzfok zzfokVar) {
        final com.google.android.gms.internal.ads.zzeiv zzeivVar = this.zza;
        java.util.Objects.requireNonNull(zzeivVar);
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzeiv.this.getWritableDatabase();
            }
        };
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzb;
        com.google.android.gms.internal.ads.zzhbw.zzr(zzhcgVar.zzc(callable), new com.google.android.gms.internal.ads.zzeix(this, zzfokVar), zzhcgVar);
    }
}
