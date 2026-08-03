package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzex {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfc zza;
    private final int zzb;
    private java.lang.Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public zzex(com.google.android.gms.internal.ads.zzfc zzfcVar, int i) {
        java.util.Objects.requireNonNull(zzfcVar);
        this.zza = zzfcVar;
        this.zzb = i;
    }

    public final void zza() {
        com.google.android.gms.internal.ads.zzfc zzfcVar = this.zza;
        if (zzfcVar.zzd().zzh() != 2 || !zzfcVar.zzd().zzk() || zzfcVar.zzd().zzi() != 0) {
            if (this.zzh) {
                zzfcVar.zzg().zzk(1);
            }
            this.zzh = false;
            return;
        }
        com.google.android.gms.internal.ads.zzbf zzq = zzfcVar.zzd().zzq();
        java.lang.Object zzf = zzq.zzg() ? null : zzq.zzf(zzfcVar.zzd().zzr());
        com.google.android.gms.internal.ads.zzbb zzd = zzfcVar.zzd();
        com.google.android.gms.internal.ads.zzbb zzd2 = zzfcVar.zzd();
        com.google.android.gms.internal.ads.zzbb zzd3 = zzfcVar.zzd();
        com.google.android.gms.internal.ads.zzbb zzd4 = zzfcVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzv = zzd3.zzv();
        long max = java.lang.Math.max(0L, zzfcVar.zzd().zzw() - java.lang.Math.max(0L, zzv - zzd4.zzu()));
        if (zzf != null && zzy == -1) {
            zzq.zzo(zzf, zzfcVar.zzf());
            zzv -= com.google.android.gms.internal.ads.zzfl.zzr(0L);
            zzy = -1;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.zzh && java.util.Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze && zzv == this.zzf && max == this.zzg) {
            long j = elapsedRealtime - this.zzi;
            int i = this.zzb;
            if (j >= i) {
                zzfcVar.zze().zza(new com.google.android.gms.internal.ads.zzfd(1, i));
                return;
            }
            return;
        }
        this.zzh = true;
        this.zzi = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        this.zzf = zzv;
        this.zzg = max;
        zzfcVar.zzg().zzk(1);
        zzfcVar.zzg().zzi(1, this.zzb);
    }
}
