package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzaft {
    protected final zzafn zza;
    protected final zzafs zzb;
    protected zzafp zzc;
    private final int zzd;

    protected zzaft(zzafq zzafqVar, zzafs zzafsVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzafsVar;
        this.zzd = i;
        this.zza = new zzafn(zzafqVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzagi zzagiVar, long j, zzahh zzahhVar) {
        if (j == zzagiVar.zzn()) {
            return 0;
        }
        zzahhVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzagi zzagiVar, long j) throws IOException {
        long zzn = j - zzagiVar.zzn();
        if (zzn < 0 || zzn > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        zzagiVar.zzf((int) zzn);
        return true;
    }

    public final zzahk zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        zzafp zzafpVar = this.zzc;
        if (zzafpVar == null || zzafpVar.zze() != j) {
            zzafn zzafnVar = this.zza;
            this.zzc = new zzafp(j, zzafnVar.zzd(j), 0L, zzafnVar.zze(), zzafnVar.zzf(), zzafnVar.zzg(), zzafnVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        while (true) {
            zzafp zzafpVar = this.zzc;
            zzafpVar.getClass();
            long zzb = zzafpVar.zzb();
            long zzc = zzafpVar.zzc();
            long zzh = zzafpVar.zzh();
            if (zzc - zzb <= this.zzd) {
                zze(false, zzb);
                return zzf(zzagiVar, zzb, zzahhVar);
            }
            if (!zzg(zzagiVar, zzh)) {
                return zzf(zzagiVar, zzh, zzahhVar);
            }
            zzagiVar.zzl();
            zzafr zza = this.zzb.zza(zzagiVar, zzafpVar.zzd());
            int zzd = zza.zzd();
            if (zzd == -3) {
                zze(false, zzh);
                return zzf(zzagiVar, zzh, zzahhVar);
            }
            if (zzd == -2) {
                zzafpVar.zzf(zza.zze(), zza.zzf());
            } else {
                if (zzd != -1) {
                    zzg(zzagiVar, zza.zzf());
                    zze(true, zza.zzf());
                    return zzf(zzagiVar, zza.zzf(), zzahhVar);
                }
                zzafpVar.zzg(zza.zze(), zza.zzf());
            }
        }
    }

    protected final void zze(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
