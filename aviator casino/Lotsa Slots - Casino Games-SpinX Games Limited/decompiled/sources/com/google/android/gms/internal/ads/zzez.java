package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzez {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfc zza;
    private final int zzb;
    private java.lang.Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private boolean zzg;
    private long zzh;

    public zzez(com.google.android.gms.internal.ads.zzfc zzfcVar, int i) {
        java.util.Objects.requireNonNull(zzfcVar);
        this.zza = zzfcVar;
        this.zzb = i;
    }

    public final void zza() {
        com.google.android.gms.internal.ads.zzfc zzfcVar = this.zza;
        if (!zzfcVar.zzd().zza()) {
            if (this.zzg) {
                zzfcVar.zzg().zzk(2);
            }
            this.zzg = false;
            return;
        }
        com.google.android.gms.internal.ads.zzbf zzq = zzfcVar.zzd().zzq();
        java.lang.Object zzf = zzq.zzg() ? null : zzq.zzf(zzfcVar.zzd().zzr());
        com.google.android.gms.internal.ads.zzbb zzd = zzfcVar.zzd();
        com.google.android.gms.internal.ads.zzbb zzd2 = zzfcVar.zzd();
        com.google.android.gms.internal.ads.zzbb zzd3 = zzfcVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzu = zzd3.zzu();
        if (zzf != null && zzy == -1) {
            zzq.zzo(zzf, zzfcVar.zzf());
            zzu -= com.google.android.gms.internal.ads.zzfl.zzr(0L);
            zzy = -1;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.zzg && java.util.Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze && zzu == this.zzf) {
            long j = elapsedRealtime - this.zzh;
            int i = this.zzb;
            if (j >= i) {
                zzfcVar.zze().zza(new com.google.android.gms.internal.ads.zzfd(2, i));
                return;
            }
            return;
        }
        this.zzg = true;
        this.zzh = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        this.zzf = zzu;
        zzfcVar.zzg().zzk(2);
        zzfcVar.zzg().zzi(2, this.zzb);
    }
}
