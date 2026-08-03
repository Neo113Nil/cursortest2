package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzadu {
    private final com.google.android.gms.internal.ads.zzadt zza;
    private final com.google.android.gms.internal.ads.zzaeb zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private com.google.android.gms.internal.ads.zzdo zzk = com.google.android.gms.internal.ads.zzdo.zza;

    public zzadu(android.content.Context context, com.google.android.gms.internal.ads.zzadt zzadtVar, long j) {
        this.zza = zzadtVar;
        this.zzb = new com.google.android.gms.internal.ads.zzaeb(context);
    }

    private final void zzo(int i) {
        this.zzd = java.lang.Math.min(this.zzd, i);
    }

    public final void zza(int i) {
        if (i == 0) {
            this.zzd = 1;
        } else if (i != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
        this.zzb.zzd();
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = com.google.android.gms.internal.ads.zzfl.zzs(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzd(android.view.Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f) {
        this.zzb.zzf(f);
    }

    public final boolean zzf() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = com.google.android.gms.internal.ads.zzfl.zzs(this.zzk.zzb());
        return i != 3;
    }

    public final void zzg(com.google.android.gms.internal.ads.zzdo zzdoVar) {
        this.zzk = zzdoVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z) {
        if (z && (this.zzd == 3 || (this.zzm && !this.zzl))) {
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

    public final void zzj(boolean z) {
        this.zzi = z;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bb, code lost:
    
        if (r12 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c6, code lost:
    
        if (r25 >= r29) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cb, code lost:
    
        if (r22.zzc != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzk(long j, long j2, long j3, long j4, boolean z, boolean z2, com.google.android.gms.internal.ads.zzads zzadsVar) throws com.google.android.gms.internal.ads.zzjk {
        zzadsVar.zzc();
        if (this.zzc && this.zze == -9223372036854775807L) {
            this.zze = j2;
        }
        if (this.zzg != j) {
            this.zzb.zzg(j);
            this.zzg = j;
        }
        long j5 = (long) ((j - j2) / this.zzj);
        if (this.zzc) {
            j5 -= com.google.android.gms.internal.ads.zzfl.zzs(this.zzk.zzb()) - j3;
        }
        zzadsVar.zze(j5);
        if (z && !z2) {
            return 3;
        }
        if (!this.zzl) {
            if (this.zza.zzaq(zzadsVar.zzd(), j2, j3, z2, true)) {
                return 4;
            }
            if (this.zzc && zzadsVar.zzd() < 30000) {
                return 3;
            }
            this.zzm = true;
            return 5;
        }
        long zzd = zzadsVar.zzd();
        boolean z3 = false;
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i = this.zzd;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException();
                        }
                        long zzs = com.google.android.gms.internal.ads.zzfl.zzs(this.zzk.zzb()) - this.zzf;
                        if (this.zzc) {
                            long j6 = this.zze;
                            if (j6 != -9223372036854775807L) {
                                if (j6 != j2) {
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
        if (!this.zzc || j2 == this.zze) {
            return 5;
        }
        long zzc = this.zzk.zzc();
        zzadsVar.zzg(this.zzb.zzi((zzadsVar.zzd() * 1000) + zzc, j));
        zzadsVar.zze((zzadsVar.zzf() - zzc) / 1000);
        if (this.zzh != -9223372036854775807L && !this.zzi) {
            z3 = true;
        }
        if (this.zza.zzaq(zzadsVar.zzd(), j2, j3, z2, z3)) {
            return 4;
        }
        return (zzadsVar.zzd() >= -30000 || z2) ? zzadsVar.zzd() > com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT ? 5 : 1 : z3 ? 3 : 2;
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
        this.zzm = false;
    }

    public final void zzm(int i) {
        this.zzb.zza(i);
    }

    public final void zzn(float f) {
        com.google.android.gms.internal.ads.zzgtj.zza(f > 0.0f);
        if (f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzb.zze(f);
    }
}
