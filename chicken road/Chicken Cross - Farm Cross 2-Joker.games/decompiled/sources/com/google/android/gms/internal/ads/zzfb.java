package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfb {
    final /* synthetic */ zzfd zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    public zzfb(zzfd zzfdVar, int i) {
        Objects.requireNonNull(zzfdVar);
        this.zza = zzfdVar;
        this.zzb = i;
    }

    public final void zza() {
        long zzt;
        zzfd zzfdVar = this.zza;
        zzbf zzq = zzfdVar.zzd().zzq();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzfdVar.zzd().zzr());
        zzbb zzd = zzfdVar.zzd();
        zzbb zzd2 = zzfdVar.zzd();
        zzbb zzd3 = zzfdVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzu = zzd3.zzu();
        if (zzf == null || zzy != -1) {
            zzt = zzy != -1 ? zzfdVar.zzd().zzt() : -9223372036854775807L;
        } else {
            zzq.zzo(zzf, zzfdVar.zzf());
            zzu -= zzfm.zzs(0L);
            zzt = zzfm.zzs(zzfdVar.zzf().zzd);
            zzy = -1;
        }
        boolean zza = zzfdVar.zzd().zza();
        if (!zza || zzt == -9223372036854775807L || zzu < zzt) {
            zzfdVar.zzg().zzk(3);
            if (zza && zzt != -9223372036854775807L) {
                zzfdVar.zzg().zzi(3, (int) Math.ceil((zzt - zzu) / zzfdVar.zzd().zzn().zzb));
            }
            this.zzf = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzf && Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze) {
            long j = elapsedRealtime - this.zzg;
            int i = this.zzb;
            if (j >= i) {
                zzfdVar.zze().zza(new zzfe(3, i));
                return;
            }
            return;
        }
        this.zzf = true;
        this.zzg = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        zzfdVar.zzg().zzk(3);
        zzfdVar.zzg().zzi(3, this.zzb);
    }
}
