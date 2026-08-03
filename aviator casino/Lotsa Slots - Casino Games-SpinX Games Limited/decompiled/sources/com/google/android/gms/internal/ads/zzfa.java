package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfa {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfc zza;
    private final int zzb;
    private java.lang.Object zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    public zzfa(com.google.android.gms.internal.ads.zzfc zzfcVar, int i) {
        java.util.Objects.requireNonNull(zzfcVar);
        this.zza = zzfcVar;
        this.zzb = i;
    }

    public final void zza() {
        long zzt;
        com.google.android.gms.internal.ads.zzfc zzfcVar = this.zza;
        com.google.android.gms.internal.ads.zzbf zzq = zzfcVar.zzd().zzq();
        java.lang.Object zzf = zzq.zzg() ? null : zzq.zzf(zzfcVar.zzd().zzr());
        com.google.android.gms.internal.ads.zzbb zzd = zzfcVar.zzd();
        com.google.android.gms.internal.ads.zzbb zzd2 = zzfcVar.zzd();
        com.google.android.gms.internal.ads.zzbb zzd3 = zzfcVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzu = zzd3.zzu();
        if (zzf == null || zzy != -1) {
            zzt = zzy != -1 ? zzfcVar.zzd().zzt() : -9223372036854775807L;
        } else {
            zzq.zzo(zzf, zzfcVar.zzf());
            zzu -= com.google.android.gms.internal.ads.zzfl.zzr(0L);
            zzt = com.google.android.gms.internal.ads.zzfl.zzr(zzfcVar.zzf().zzd);
            zzy = -1;
        }
        boolean zza = zzfcVar.zzd().zza();
        if (!zza || zzt == -9223372036854775807L || zzu < zzt) {
            zzfcVar.zzg().zzk(3);
            if (zza && zzt != -9223372036854775807L) {
                zzfcVar.zzg().zzi(3, (int) java.lang.Math.ceil((zzt - zzu) / zzfcVar.zzd().zzn().zzb));
            }
            this.zzf = false;
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.zzf && java.util.Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze) {
            long j = elapsedRealtime - this.zzg;
            int i = this.zzb;
            if (j >= i) {
                zzfcVar.zze().zza(new com.google.android.gms.internal.ads.zzfd(3, i));
                return;
            }
            return;
        }
        this.zzf = true;
        this.zzg = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        zzfcVar.zzg().zzk(3);
        zzfcVar.zzg().zzi(3, this.zzb);
    }
}
