package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzafk {
    protected final com.google.android.gms.internal.ads.zzafe zza;
    protected final com.google.android.gms.internal.ads.zzafj zzb;
    protected com.google.android.gms.internal.ads.zzafg zzc;
    private final int zzd;

    protected zzafk(com.google.android.gms.internal.ads.zzafh zzafhVar, com.google.android.gms.internal.ads.zzafj zzafjVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzafjVar;
        this.zzd = i;
        this.zza = new com.google.android.gms.internal.ads.zzafe(zzafhVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(com.google.android.gms.internal.ads.zzafz zzafzVar, long j, com.google.android.gms.internal.ads.zzagy zzagyVar) {
        if (j == zzafzVar.zzn()) {
            return 0;
        }
        zzagyVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(com.google.android.gms.internal.ads.zzafz zzafzVar, long j) throws java.io.IOException {
        long zzn = j - zzafzVar.zzn();
        if (zzn < 0 || zzn > android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        zzafzVar.zzf((int) zzn);
        return true;
    }

    public final com.google.android.gms.internal.ads.zzahb zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        com.google.android.gms.internal.ads.zzafg zzafgVar = this.zzc;
        if (zzafgVar == null || zzafgVar.zze() != j) {
            com.google.android.gms.internal.ads.zzafe zzafeVar = this.zza;
            this.zzc = new com.google.android.gms.internal.ads.zzafg(j, zzafeVar.zzd(j), 0L, zzafeVar.zze(), zzafeVar.zzf(), zzafeVar.zzg(), zzafeVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        while (true) {
            com.google.android.gms.internal.ads.zzafg zzafgVar = this.zzc;
            zzafgVar.getClass();
            long zzb = zzafgVar.zzb();
            long zzc = zzafgVar.zzc();
            long zzh = zzafgVar.zzh();
            if (zzc - zzb <= this.zzd) {
                zze(false, zzb);
                return zzf(zzafzVar, zzb, zzagyVar);
            }
            if (!zzg(zzafzVar, zzh)) {
                return zzf(zzafzVar, zzh, zzagyVar);
            }
            zzafzVar.zzl();
            com.google.android.gms.internal.ads.zzafi zza = this.zzb.zza(zzafzVar, zzafgVar.zzd());
            int zzd = zza.zzd();
            if (zzd == -3) {
                zze(false, zzh);
                return zzf(zzafzVar, zzh, zzagyVar);
            }
            if (zzd == -2) {
                zzafgVar.zzf(zza.zze(), zza.zzf());
            } else {
                if (zzd != -1) {
                    zzg(zzafzVar, zza.zzf());
                    zze(true, zza.zzf());
                    return zzf(zzafzVar, zza.zzf(), zzagyVar);
                }
                zzafgVar.zzg(zza.zze(), zza.zzf());
            }
        }
    }

    protected final void zze(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
