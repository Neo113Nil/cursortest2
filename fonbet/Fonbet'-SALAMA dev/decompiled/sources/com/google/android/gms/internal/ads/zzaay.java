package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzaay {
    private final zzzy zza = new zzzy();
    private final zzaaw zzb;
    private final zzaax zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzaay(Context context) {
        DisplayManager displayManager;
        zzaaw zzaawVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new zzaaw(this, displayManager);
        this.zzb = zzaawVar;
        this.zzc = zzaawVar != null ? zzaax.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaay zzaayVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzaayVar.zzk = refreshRate;
            zzaayVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzdq.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzaayVar.zzk = -9223372036854775807L;
            zzaayVar.zzl = -9223372036854775807L;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzen.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzaav.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        if (zzen.zza < 30 || this.zze == null) {
            return;
        }
        float zza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f7 = this.zzg;
        if (zza != f7) {
            if (zza != -1.0f && f7 != -1.0f) {
                float f8 = 1.0f;
                if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                    f8 = 0.02f;
                }
                if (Math.abs(zza - this.zzg) < f8) {
                    return;
                }
            } else if (zza == -1.0f && this.zza.zzb() < 30) {
                return;
            }
            this.zzg = zza;
            zzn(false);
        }
    }

    private final void zzn(boolean z4) {
        Surface surface;
        if (zzen.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f7 = 0.0f;
        if (this.zzd) {
            float f8 = this.zzg;
            if (f8 != -1.0f) {
                f7 = this.zzi * f8;
            }
        }
        if (z4 || this.zzh != f7) {
            this.zzh = f7;
            zzaav.zza(surface, f7);
        }
    }

    public final long zza(long j) {
        long j3;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j7 = this.zzq + ((long) (((this.zzm - this.zzp) * zzc) / this.zzi));
            if (Math.abs(j - j7) > 20000000) {
                zzl();
            } else {
                j = j7;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzaax zzaaxVar = this.zzc;
        if (zzaaxVar != null && this.zzk != -9223372036854775807L) {
            long j8 = zzaaxVar.zza;
            if (j8 != -9223372036854775807L) {
                long j9 = this.zzk;
                long j10 = (((j - j8) / j9) * j9) + j8;
                if (j <= j10) {
                    j3 = j10 - j9;
                } else {
                    j3 = j10;
                    j10 = j9 + j10;
                }
                long j11 = this.zzl;
                if (j10 - j >= j - j3) {
                    j10 = j3;
                }
                return j10 - j11;
            }
        }
        return j;
    }

    public final void zzc(float f7) {
        this.zzf = f7;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j3 = this.zzn;
        if (j3 != -1) {
            this.zzp = j3;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f7) {
        this.zzi = f7;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzaax zzaaxVar = this.zzc;
            zzaaxVar.getClass();
            zzaaxVar.zzb();
            this.zzb.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzaaw zzaawVar = this.zzb;
        if (zzaawVar != null) {
            zzaawVar.zzb();
            zzaax zzaaxVar = this.zzc;
            zzaaxVar.getClass();
            zzaaxVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i7) {
        if (this.zzj == i7) {
            return;
        }
        this.zzj = i7;
        zzn(true);
    }
}
