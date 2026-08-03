package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzetm implements com.google.android.gms.internal.ads.zzetr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzetn zza;

    zzetm(com.google.android.gms.internal.ads.zzetn zzetnVar) {
        java.util.Objects.requireNonNull(zzetnVar);
        this.zza = zzetnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcxt zzcxtVar = (com.google.android.gms.internal.ads.zzcxt) obj;
        com.google.android.gms.internal.ads.zzetn zzetnVar = this.zza;
        synchronized (zzetnVar) {
            zzetnVar.zze(zzcxtVar.zzn());
            zzcxtVar.zzj();
        }
    }
}
