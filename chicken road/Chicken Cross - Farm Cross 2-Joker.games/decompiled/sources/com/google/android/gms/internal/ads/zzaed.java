package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaed {
    private final zzaec zzb;
    private final zzaek zzc;
    private boolean zzd;
    private long zzg;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zze = 0;
    private long zzf = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdp zzk = zzdp.zza;
    private long zza = 50000;

    public zzaed(Context context, zzaec zzaecVar, long j) {
        this.zzb = zzaecVar;
        this.zzc = new zzaek(context);
    }

    private final void zzp(int i) {
        this.zze = Math.min(this.zze, i);
    }

    public final void zza(long j) {
        this.zza = 50000L;
    }

    public final void zzb(int i) {
        if (i == 0) {
            this.zze = 1;
        } else if (i != 1) {
            zzp(2);
        } else {
            this.zze = 0;
        }
        this.zzc.zzd();
    }

    public final void zzc() {
        this.zzd = true;
        this.zzg = zzfm.zzt(this.zzk.zzb());
        this.zzc.zzb();
    }

    public final void zzd() {
        this.zzd = false;
        this.zzh = -9223372036854775807L;
        this.zzc.zzg();
    }

    public final void zze(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzc.zzc(surface);
        zzp(1);
    }

    public final void zzf(float f) {
        this.zzc.zzf(f);
    }

    public final boolean zzg() {
        int i = this.zze;
        this.zze = 3;
        this.zzg = zzfm.zzt(this.zzk.zzb());
        return i != 3;
    }

    public final void zzh(zzdp zzdpVar) {
        this.zzk = zzdpVar;
    }

    public final void zzi() {
        if (this.zze == 0) {
            this.zze = 1;
        }
    }

    public final boolean zzj(boolean z) {
        if (z && (this.zze == 3 || (this.zzm && !this.zzl))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final void zzk(boolean z) {
        this.zzi = z;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ab, code lost:
    
        if (r11 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b6, code lost:
    
        if (r31 >= r35) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00bb, code lost:
    
        if (r28.zzd != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzl(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5, long j6, zzaeb zzaebVar) throws zzjn {
        zzaebVar.zzc();
        boolean z3 = this.zzd;
        if (z3 && this.zzf == -9223372036854775807L) {
            this.zzf = j2;
        }
        long j7 = (long) ((j - j2) / this.zzj);
        if (z3) {
            j7 -= zzfm.zzt(this.zzk.zzb()) - j3;
        }
        zzaebVar.zze(j7);
        if (z && !z2) {
            return 3;
        }
        if (!this.zzl) {
            if (this.zzb.zzar(zzaebVar.zzd(), j2, j3, z2, true)) {
                return 4;
            }
            if (this.zzd && zzaebVar.zzd() < 30000) {
                return 3;
            }
            this.zzm = true;
            return 5;
        }
        long zzd = zzaebVar.zzd();
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i = this.zze;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        long zzt = zzfm.zzt(this.zzk.zzb()) - this.zzg;
                        if (this.zzd) {
                            long j8 = this.zzf;
                            if (j8 != -9223372036854775807L) {
                                if (j8 != j2) {
                                    if (zzd < -30000) {
                                    }
                                }
                            }
                        }
                    }
                }
                return 0;
            }
        }
        if (!this.zzd || j2 == this.zzf) {
            return 5;
        }
        long zzc = this.zzk.zzc();
        zzaebVar.zzg(this.zzc.zzh((zzaebVar.zzd() * 1000) + zzc, j, j5, j6));
        zzaebVar.zze((zzaebVar.zzf() - zzc) / 1000);
        boolean z4 = (this.zzh == -9223372036854775807L || this.zzi) ? false : true;
        if (this.zzb.zzar(zzaebVar.zzd(), j2, j3, z2, z4)) {
            return 4;
        }
        return (zzaebVar.zzd() >= -30000 || z2) ? zzaebVar.zzd() > this.zza ? 5 : 1 : z4 ? 3 : 2;
    }

    public final void zzm() {
        this.zzc.zzd();
        this.zzf = -9223372036854775807L;
        zzp(1);
        this.zzh = -9223372036854775807L;
        this.zzm = false;
    }

    public final void zzn(int i) {
        this.zzc.zza(i);
    }

    public final void zzo(float f) {
        zzguk.zza(f > 0.0f);
        if (f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzc.zze(f);
    }
}
