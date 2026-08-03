package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcua implements com.google.android.gms.internal.ads.zzbpq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcub zza;

    zzcua(com.google.android.gms.internal.ads.zzcub zzcubVar) {
        java.util.Objects.requireNonNull(zzcubVar);
        this.zza = zzcubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcub zzcubVar = this.zza;
        if (zzcubVar.zze(map)) {
            zzcubVar.zzf().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzctz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcua.this.zza.zzg().zzm();
                }
            });
        }
    }
}
