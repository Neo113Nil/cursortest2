package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzaau {
    private final zzaat zza;
    private final zzaay zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzcz zzk = zzcz.zza;

    public zzaau(Context context, zzaat zzaatVar, long j) {
        this.zza = zzaatVar;
        this.zzb = new zzaay(context);
    }

    private final void zzq(int i7) {
        this.zzd = Math.min(this.zzd, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
    
        if (r16 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0085, code lost:
    
        if (r23 >= r27) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008a, code lost:
    
        if (r20.zzc != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(long j, long j3, long j7, long j8, boolean z4, zzaas zzaasVar) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        zzaas.zzg(zzaasVar);
        if (this.zze == -9223372036854775807L) {
            this.zze = j3;
        }
        if (this.zzg != j) {
            this.zzb.zzd(j);
            this.zzg = j;
        }
        long j15 = (long) ((j - j3) / this.zzj);
        if (this.zzc) {
            j15 -= zzen.zzs(this.zzk.zzb()) - j7;
        }
        zzaasVar.zza = j15;
        j9 = zzaasVar.zza;
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i7 = this.zzd;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException();
                        }
                        long zzs = zzen.zzs(this.zzk.zzb()) - this.zzf;
                        if (this.zzc) {
                            if (j9 < -30000) {
                            }
                        }
                    }
                }
                return 0;
            }
        }
        if (!this.zzc || j3 == this.zze) {
            return 5;
        }
        long zzc = this.zzk.zzc();
        zzaay zzaayVar = this.zzb;
        j10 = zzaasVar.zza;
        zzaasVar.zzb = zzaayVar.zza((j10 * 1000) + zzc);
        j11 = zzaasVar.zzb;
        zzaasVar.zza = (j11 - zzc) / 1000;
        boolean z7 = (this.zzh == -9223372036854775807L || this.zzi) ? false : true;
        zzaat zzaatVar = this.zza;
        j12 = zzaasVar.zza;
        if (zzaatVar.zzaR(j12, j3, j7, z4, z7)) {
            return 4;
        }
        j13 = zzaasVar.zza;
        if (j13 < -30000 && !z4) {
            return z7 ? 3 : 2;
        }
        j14 = zzaasVar.zza;
        return j14 > 50000 ? 5 : 1;
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z4) {
        this.zzi = z4;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z4) {
        this.zzd = z4 ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzen.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzq(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzj(int i7) {
        this.zzb.zzj(i7);
    }

    public final void zzk(zzcz zzczVar) {
        this.zzk = zzczVar;
    }

    public final void zzl(float f7) {
        this.zzb.zzc(f7);
    }

    public final void zzm(Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(float f7) {
        zzcv.zzd(f7 > 0.0f);
        if (f7 == this.zzj) {
            return;
        }
        this.zzj = f7;
        this.zzb.zze(f7);
    }

    public final boolean zzo(boolean z4) {
        if (!z4 || this.zzd != 3) {
            if (this.zzh == -9223372036854775807L) {
                return false;
            }
            r2 = this.zzk.zzb() < this.zzh;
            return r2;
        }
        this.zzh = -9223372036854775807L;
        return r2;
    }

    public final boolean zzp() {
        int i7 = this.zzd;
        this.zzd = 3;
        this.zzf = zzen.zzs(this.zzk.zzb());
        return i7 != 3;
    }
}
