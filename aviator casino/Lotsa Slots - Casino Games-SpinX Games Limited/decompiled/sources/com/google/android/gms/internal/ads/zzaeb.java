package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaeb {
    private final android.content.Context zzb;
    private com.google.android.gms.internal.ads.zzadx zzc;
    private boolean zzd;
    private android.view.Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final com.google.android.gms.internal.ads.zzacx zza = new com.google.android.gms.internal.ads.zzacx();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzaeb(android.content.Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    private final void zzk() {
        if (android.os.Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzacx zzacxVar = this.zza;
        float zzg = zzacxVar.zzc() ? zzacxVar.zzg() : this.zzf;
        float f = this.zzg;
        if (zzg != f) {
            if (zzg != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (zzacxVar.zzc() && zzacxVar.zze() >= 5000000000L) {
                    f2 = 0.1f;
                }
                if (java.lang.Math.abs(zzg - this.zzg) < f2) {
                    return;
                }
            } else if (zzg == -1.0f && zzacxVar.zzd() < 30) {
                return;
            }
            this.zzg = zzg;
            zzl(false);
        }
    }

    private final void zzl(boolean z) {
        android.view.Surface surface;
        if (android.os.Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            com.google.android.gms.internal.ads.zzadw.zza(this.zze, f);
        }
    }

    private final void zzm() {
        android.view.Surface surface;
        if (android.os.Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        com.google.android.gms.internal.ads.zzadw.zza(this.zze, 0.0f);
    }

    public final void zza(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzl(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        int i = com.google.android.gms.internal.ads.zzadx.zze;
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) this.zzb.getSystemService("display");
        com.google.android.gms.internal.ads.zzadx zzadxVar = null;
        if (displayManager != null) {
            try {
                android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
                zzadxVar = android.os.Build.VERSION.SDK_INT >= 33 ? new com.google.android.gms.internal.ads.zzaea(choreographer, displayManager, null) : new com.google.android.gms.internal.ads.zzady(choreographer, displayManager, null);
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.internal.ads.zzeg.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        this.zzc = zzadxVar;
        if (zzadxVar != null) {
            zzadxVar.zza();
        }
        zzl(false);
    }

    public final void zzc(android.view.Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zzd() {
        zzj();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl(false);
    }

    public final void zzf(float f) {
        this.zzf = f;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzq = j2;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j * 1000);
        zzk();
    }

    public final void zzh() {
        this.zzd = false;
        com.google.android.gms.internal.ads.zzadx zzadxVar = this.zzc;
        if (zzadxVar != null) {
            zzadxVar.zzb();
        }
        zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzi(long j, long j2) {
        long j3;
        com.google.android.gms.internal.ads.zzadx zzadxVar;
        long j4;
        long j5;
        long j6;
        float f;
        long j7;
        if (this.zzq != -1) {
            com.google.android.gms.internal.ads.zzacx zzacxVar = this.zza;
            if (zzacxVar.zzc()) {
                j7 = zzacxVar.zzf() * (this.zzm - this.zzq);
                f = this.zzi;
            } else {
                long j8 = j2 - this.zzs;
                f = this.zzi;
                j7 = j8 * 1000;
            }
            j3 = this.zzr + ((long) (j7 / f));
            if (java.lang.Math.abs(j - j3) > 20000000) {
                zzj();
            }
            this.zzn = this.zzm;
            this.zzo = j3;
            this.zzp = j2;
            zzadxVar = this.zzc;
            if (zzadxVar != null) {
                long j9 = zzadxVar.zzc;
                long j10 = this.zzc.zzd;
                if (j9 != -9223372036854775807L && j10 != -9223372036854775807L) {
                    long j11 = j9 + (((j3 - j9) / j10) * j10);
                    if (j3 <= j11) {
                        j4 = j11 - j10;
                    } else {
                        j11 += j10;
                        j4 = j11;
                    }
                    long j12 = j10 / 2;
                    long j13 = j11 - j3;
                    long j14 = j3 - j4;
                    long abs = java.lang.Math.abs(j13 - j14);
                    if (abs < j12) {
                        long j15 = j10 / 4;
                        j5 = j11;
                        j6 = 0;
                        if (abs < j15) {
                            long j16 = this.zzk;
                            if (j16 != 0) {
                                this.zzl = j16;
                                j6 = j16;
                            } else {
                                if (j13 < j14) {
                                    j15 = -j15;
                                }
                                this.zzl = j15;
                                j6 = j15;
                            }
                            return (j13 + j6 >= j14 ? j5 : j4) - ((j10 * 80) / 100);
                        }
                    } else {
                        j5 = j11;
                        j6 = this.zzk;
                    }
                    this.zzl = j6;
                    return (j13 + j6 >= j14 ? j5 : j4) - ((j10 * 80) / 100);
                }
            }
            return j3;
        }
        j3 = j;
        this.zzn = this.zzm;
        this.zzo = j3;
        this.zzp = j2;
        zzadxVar = this.zzc;
        if (zzadxVar != null) {
        }
        return j3;
    }
}
