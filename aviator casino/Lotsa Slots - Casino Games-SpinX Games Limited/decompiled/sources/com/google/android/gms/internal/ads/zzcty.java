package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcty implements com.google.android.gms.internal.ads.zzbpq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcub zza;

    zzcty(com.google.android.gms.internal.ads.zzcub zzcubVar) {
        java.util.Objects.requireNonNull(zzcubVar);
        this.zza = zzcubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcub zzcubVar = this.zza;
        if (zzcubVar.zze(map)) {
            zzcubVar.zzf().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzctx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcty.this.zza.zzg().zzl();
                }
            });
        }
    }
}
