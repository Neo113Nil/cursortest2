package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxt implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbxv zza;

    /* synthetic */ zzbxt(com.google.android.libraries.places.internal.zzbxv zzbxvVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbxvVar);
        this.zza = zzbxvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbxv zzbxvVar = this.zza;
        byte[] bArr = null;
        if (!zzbxvVar.zzh()) {
            zzbxvVar.zzj(null);
            return;
        }
        long zzg = zzbxvVar.zzg();
        long zzc = zzbxvVar.zzc();
        if (zzg - zzc > 0) {
            zzbxvVar.zzj(zzbxvVar.zzd().schedule(new com.google.android.libraries.places.internal.zzbxu(zzbxvVar, bArr), zzbxvVar.zzg() - zzc, java.util.concurrent.TimeUnit.NANOSECONDS));
        } else {
            zzbxvVar.zzi(false);
            zzbxvVar.zzj(null);
            zzbxvVar.zzf().run();
        }
    }
}
