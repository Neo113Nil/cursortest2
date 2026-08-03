package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqb implements android.app.AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgqd zza;

    zzgqb(com.google.android.gms.internal.ads.zzgqd zzgqdVar) {
        java.util.Objects.requireNonNull(zzgqdVar);
        this.zza = zzgqdVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(java.lang.String str, int i, java.lang.String str2, boolean z) {
        com.google.android.gms.internal.ads.zzgqd zzgqdVar = this.zza;
        synchronized (zzgqdVar) {
            if (z) {
                zzgqdVar.zzg(java.lang.System.currentTimeMillis());
                zzgqdVar.zzj(true);
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (zzgqdVar.zzh() > 0 && currentTimeMillis >= zzgqdVar.zzh()) {
                    zzgqdVar.zzi(currentTimeMillis - zzgqdVar.zzh());
                }
                zzgqdVar.zzj(false);
            }
        }
    }
}
