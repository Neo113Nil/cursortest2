package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbca implements android.app.AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbcb zza;

    zzbca(com.google.android.gms.internal.ads.zzbcb zzbcbVar) {
        java.util.Objects.requireNonNull(zzbcbVar);
        this.zza = zzbcbVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(java.lang.String str, int i, java.lang.String str2, boolean z) {
        if (z) {
            com.google.android.gms.internal.ads.zzbcb zzbcbVar = this.zza;
            zzbcbVar.zze(java.lang.System.currentTimeMillis());
            zzbcbVar.zzh(true);
            return;
        }
        com.google.android.gms.internal.ads.zzbcb zzbcbVar2 = this.zza;
        long zzf = zzbcbVar2.zzf();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (zzf > 0 && currentTimeMillis >= zzbcbVar2.zzf()) {
            zzbcbVar2.zzg(currentTimeMillis - zzbcbVar2.zzf());
        }
        zzbcbVar2.zzh(false);
    }
}
