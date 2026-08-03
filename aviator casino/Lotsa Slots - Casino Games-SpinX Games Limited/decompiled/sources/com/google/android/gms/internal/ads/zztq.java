package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zztq {
    private java.lang.Exception zza;
    private long zzb = -9223372036854775807L;
    private long zzc = -9223372036854775807L;

    public final void zza(java.lang.Exception exc) throws java.lang.Exception {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
        }
        if (this.zzb == -9223372036854775807L && !com.google.android.gms.internal.ads.zztr.zzH()) {
            this.zzb = 200 + elapsedRealtime;
        }
        long j = this.zzb;
        if (j == -9223372036854775807L || elapsedRealtime < j) {
            this.zzc = elapsedRealtime + 50;
            return;
        }
        java.lang.Exception exc2 = this.zza;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        java.lang.Exception exc3 = this.zza;
        zzc();
        throw exc3;
    }

    public final boolean zzb() {
        if (this.zza == null) {
            return false;
        }
        return com.google.android.gms.internal.ads.zztr.zzH() || android.os.SystemClock.elapsedRealtime() < this.zzc;
    }

    public final void zzc() {
        this.zza = null;
        this.zzb = -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }
}
