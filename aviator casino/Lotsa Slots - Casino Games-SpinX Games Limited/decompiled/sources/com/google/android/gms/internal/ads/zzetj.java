package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzetj implements com.google.android.gms.internal.ads.zzetr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzetk zza;

    zzetj(com.google.android.gms.internal.ads.zzetk zzetkVar) {
        java.util.Objects.requireNonNull(zzetkVar);
        this.zza = zzetkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        com.google.android.gms.internal.ads.zzetk zzetkVar = this.zza;
        synchronized (zzetkVar) {
            zzetkVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzetk zzetkVar = this.zza;
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = (com.google.android.gms.internal.ads.zzdlz) obj;
        synchronized (zzetkVar) {
            zzetkVar.zzN(zzdlzVar);
            zzetkVar.zzM().zzj();
        }
    }
}
