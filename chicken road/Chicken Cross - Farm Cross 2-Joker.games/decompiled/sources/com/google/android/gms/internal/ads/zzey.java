package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzey {
    final /* synthetic */ zzfd zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public zzey(zzfd zzfdVar, int i) {
        Objects.requireNonNull(zzfdVar);
        this.zza = zzfdVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfd zzfdVar = this.zza;
        if (zzfdVar.zzd().zzh() != 2 || !zzfdVar.zzd().zzk() || zzfdVar.zzd().zzi() != 0) {
            if (this.zzh) {
                zzfdVar.zzg().zzk(1);
            }
            this.zzh = false;
            return;
        }
        zzbf zzq = zzfdVar.zzd().zzq();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzfdVar.zzd().zzr());
        zzbb zzd = zzfdVar.zzd();
        zzbb zzd2 = zzfdVar.zzd();
        zzbb zzd3 = zzfdVar.zzd();
        zzbb zzd4 = zzfdVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzv = zzd3.zzv();
        long max = Math.max(0L, zzfdVar.zzd().zzw() - Math.max(0L, zzv - zzd4.zzu()));
        if (zzf != null && zzy == -1) {
            zzq.zzo(zzf, zzfdVar.zzf());
            zzv -= zzfm.zzs(0L);
            zzy = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh && Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze && zzv == this.zzf && max == this.zzg) {
            long j = elapsedRealtime - this.zzi;
            int i = this.zzb;
            if (j >= i) {
                zzfdVar.zze().zza(new zzfe(1, i));
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
        zzfdVar.zzg().zzk(1);
        zzfdVar.zzg().zzi(1, this.zzb);
    }
}
