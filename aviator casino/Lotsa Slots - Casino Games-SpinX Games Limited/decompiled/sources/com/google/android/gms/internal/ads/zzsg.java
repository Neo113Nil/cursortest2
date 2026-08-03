package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzsg {
    private final com.google.android.gms.internal.ads.zzsf zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzte zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzsg(android.media.AudioTrack audioTrack, com.google.android.gms.internal.ads.zzte zzteVar) {
        this.zza = new com.google.android.gms.internal.ads.zzsf(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzteVar;
        zzf(0);
    }

    private final void zzf(int i) {
        this.zzd = i;
        long j = 10000;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = java.lang.System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzf = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    private final long zzg(long j, float f) {
        com.google.android.gms.internal.ads.zzsf zzsfVar = this.zza;
        return zzh(zzsfVar.zzc(), zzsfVar.zzb(), j, f);
    }

    private final long zzh(long j, long j2, long j3, float f) {
        return com.google.android.gms.internal.ads.zzfl.zzt(j, this.zzb) + com.google.android.gms.internal.ads.zzfl.zzx(j3 - j2, f);
    }

    public final void zza(long j, float f, long j2, boolean z) {
        boolean z2;
        if (z || j - this.zzg >= this.zzf) {
            this.zzg = j;
            com.google.android.gms.internal.ads.zzsf zzsfVar = this.zza;
            boolean zza = zzsfVar.zza();
            if (zza) {
                long zzb = zzsfVar.zzb();
                long zzg = zzg(j, f);
                if (java.lang.Math.abs(zzb - j) > 5000000) {
                    com.google.android.gms.internal.ads.zzte zzteVar = this.zzc;
                    long zzc = zzsfVar.zzc();
                    long zzs = ((com.google.android.gms.internal.ads.zzsr) zzteVar).zza.zzs();
                    int length = java.lang.String.valueOf(zzc).length();
                    int length2 = java.lang.String.valueOf(zzb).length();
                    int length3 = java.lang.String.valueOf(j).length();
                    int length4 = length + 52 + length2 + 2 + length3 + 2 + java.lang.String.valueOf(j2).length() + 2;
                    z2 = zza;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(length4 + java.lang.String.valueOf(zzs).length());
                    sb.append("Spurious audio timestamp (system clock mismatch): ");
                    sb.append(zzc);
                    sb.append(", ");
                    sb.append(zzb);
                    sb.append(", ");
                    sb.append(j);
                    sb.append(", ");
                    sb.append(j2);
                    sb.append(", ");
                    sb.append(zzs);
                    com.google.android.gms.internal.ads.zzeg.zzc("AudioTrackAudioOutput", sb.toString());
                    zzf(4);
                } else {
                    z2 = zza;
                    if (java.lang.Math.abs(zzg - j2) > 5000000) {
                        com.google.android.gms.internal.ads.zzte zzteVar2 = this.zzc;
                        long zzc2 = zzsfVar.zzc();
                        long zzs2 = ((com.google.android.gms.internal.ads.zzsr) zzteVar2).zza.zzs();
                        int length5 = java.lang.String.valueOf(zzc2).length();
                        int length6 = java.lang.String.valueOf(zzb).length();
                        int length7 = java.lang.String.valueOf(j).length();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length5 + 54 + length6 + 2 + length7 + 2 + java.lang.String.valueOf(j2).length() + 2 + java.lang.String.valueOf(zzs2).length());
                        sb2.append("Spurious audio timestamp (frame position mismatch): ");
                        sb2.append(zzc2);
                        sb2.append(", ");
                        sb2.append(zzb);
                        sb2.append(", ");
                        sb2.append(j);
                        sb2.append(", ");
                        sb2.append(j2);
                        sb2.append(", ");
                        sb2.append(zzs2);
                        com.google.android.gms.internal.ads.zzeg.zzc("AudioTrackAudioOutput", sb2.toString());
                        zzf(4);
                    } else if (this.zzd == 4) {
                        zzf(0);
                    }
                }
            } else {
                z2 = zza;
            }
            int i = this.zzd;
            if (i == 0) {
                if (!z2) {
                    if (j - this.zze > 500000) {
                        zzf(3);
                        return;
                    }
                    return;
                } else {
                    if (zzsfVar.zzb() >= this.zze) {
                        this.zzh = zzsfVar.zzc();
                        this.zzi = zzsfVar.zzb();
                        zzf(1);
                        return;
                    }
                    return;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    if (z2) {
                        return;
                    }
                    zzf(0);
                    return;
                } else {
                    if (i == 3 && z2) {
                        zzf(0);
                        return;
                    }
                    return;
                }
            }
            if (!z2) {
                zzf(0);
                return;
            }
            long zzc3 = zzsfVar.zzc();
            long j3 = this.zzh;
            if (zzc3 > j3) {
                if (java.lang.Math.abs(zzg(j, f) - zzh(j3, this.zzi, j, f)) < 1000) {
                    zzf(2);
                    return;
                }
            }
            if (j - this.zze > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US) {
                zzf(3);
            } else {
                this.zzh = zzsfVar.zzc();
                this.zzi = zzsfVar.zzb();
            }
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j, float f) {
        return zzg(j, f);
    }
}
