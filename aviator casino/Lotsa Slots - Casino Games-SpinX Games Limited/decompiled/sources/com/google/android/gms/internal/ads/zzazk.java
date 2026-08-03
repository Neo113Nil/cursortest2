package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzazk implements android.content.pm.PackageManager.OnChecksumsReadyListener {
    final com.google.android.gms.internal.ads.zzhcp zza = com.google.android.gms.internal.ads.zzhcp.zze();

    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
    public final void onChecksumsReady(java.util.List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                android.content.pm.ApkChecksum apkChecksum = (android.content.pm.ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    com.google.android.gms.internal.ads.zzhcp zzhcpVar = this.zza;
                    com.google.android.gms.internal.ads.zzgzh zzi = com.google.android.gms.internal.ads.zzgzh.zzn().zzi();
                    byte[] value = apkChecksum.getValue();
                    zzhcpVar.zza(zzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        this.zza.zza("");
    }
}
