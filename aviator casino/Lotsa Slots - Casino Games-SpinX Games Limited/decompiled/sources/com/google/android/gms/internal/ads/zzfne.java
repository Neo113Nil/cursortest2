package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfne implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfnh zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfnj zzb;

    zzfne(com.google.android.gms.internal.ads.zzfnj zzfnjVar, com.google.android.gms.internal.ads.zzfnh zzfnhVar) {
        this.zza = zzfnhVar;
        java.util.Objects.requireNonNull(zzfnjVar);
        this.zzb = zzfnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfnj zzfnjVar = this.zzb;
        synchronized (zzfnjVar) {
            zzfnjVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfnj zzfnjVar = this.zzb;
        synchronized (zzfnjVar) {
            zzfnjVar.zzf(null);
            zzfnjVar.zze().addFirst(this.zza);
            if (zzfnjVar.zzg() == 1) {
                zzfnjVar.zzd();
            }
        }
    }
}
