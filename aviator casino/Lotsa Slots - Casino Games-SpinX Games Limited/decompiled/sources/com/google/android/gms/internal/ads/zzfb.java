package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfc zza;
    private final int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    public zzfb(com.google.android.gms.internal.ads.zzfc zzfcVar, int i) {
        java.util.Objects.requireNonNull(zzfcVar);
        this.zza = zzfcVar;
        this.zzb = i;
    }

    public final void zza() {
        com.google.android.gms.internal.ads.zzfc zzfcVar = this.zza;
        int zzi = zzfcVar.zzd().zzi();
        if (!zzfcVar.zzd().zzk() || zzfcVar.zzd().zzh() == 1 || zzfcVar.zzd().zzh() == 4 || zzi == 0 || zzi == 1) {
            if (this.zzd) {
                zzfcVar.zzg().zzk(4);
            }
            this.zzd = false;
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.zzd && this.zzc == zzi) {
            long j = elapsedRealtime - this.zze;
            int i = this.zzb;
            if (j >= i) {
                zzfcVar.zze().zza(new com.google.android.gms.internal.ads.zzfd(4, i));
                return;
            }
            return;
        }
        this.zzd = true;
        this.zze = elapsedRealtime;
        this.zzc = zzi;
        zzfcVar.zzg().zzk(4);
        zzfcVar.zzg().zzi(4, this.zzb);
    }
}
