package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zztf {
    private boolean zzA;
    private long zzB;
    private final com.google.android.gms.internal.ads.zzte zza;
    private final com.google.android.gms.internal.ads.zzdo zzb;
    private final long[] zzc;
    private final android.media.AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final com.google.android.gms.internal.ads.zzsg zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private java.lang.reflect.Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zztf(com.google.android.gms.internal.ads.zzte zzteVar, com.google.android.gms.internal.ads.zzdo zzdoVar, android.media.AudioTrack audioTrack, int i, int i2, int i3) {
        this.zza = zzteVar;
        this.zzb = zzdoVar;
        this.zzd = audioTrack;
        try {
            this.zzm = android.media.AudioTrack.class.getMethod("getLatency", null);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new com.google.android.gms.internal.ads.zzsg(audioTrack, zzteVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zzD = com.google.android.gms.internal.ads.zzfl.zzD(i);
        this.zzg = zzD;
        this.zzf = zzD ? com.google.android.gms.internal.ads.zzfl.zzt(i3 / i2, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final void zzg(long j) {
        long j2 = this.zzj;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long zzy = com.google.android.gms.internal.ads.zzfl.zzy(j - j2, this.zzi);
        com.google.android.gms.internal.ads.zzdo zzdoVar = this.zzb;
        long zza = zzdoVar.zza() - com.google.android.gms.internal.ads.zzfl.zzr(zzy);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(zza);
    }

    private final long zzh(long j) {
        long max = java.lang.Math.max(0L, (this.zzt == 0 ? this.zzu != -9223372036854775807L ? com.google.android.gms.internal.ads.zzfl.zzt(zzl(), this.zze) : zzj() : com.google.android.gms.internal.ads.zzfl.zzx(j + this.zzk, this.zzi)) - this.zzn);
        return this.zzu != -9223372036854775807L ? java.lang.Math.min(com.google.android.gms.internal.ads.zzfl.zzt(this.zzx, this.zze), max) : max;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final long zzj() {
        return com.google.android.gms.internal.ads.zzfl.zzt(zzk(), this.zze);
    }

    private final long zzk() {
        if (this.zzu != -9223372036854775807L) {
            return java.lang.Math.min(this.zzx, zzl());
        }
        long zzb = this.zzb.zzb();
        if (zzb - this.zzp >= 5) {
            android.media.AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (android.os.Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                        this.zzv = -9223372036854775807L;
                    } else if (this.zzv == -9223372036854775807L) {
                        this.zzv = zzb;
                    }
                }
                if (this.zzq > playbackHeadPosition) {
                    this.zzr++;
                }
                this.zzq = playbackHeadPosition;
            }
            this.zzp = zzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        android.media.AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + com.google.android.gms.internal.ads.zzfl.zzu(com.google.android.gms.internal.ads.zzfl.zzx(com.google.android.gms.internal.ads.zzfl.zzs(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    public final long zza() {
        java.lang.reflect.Method method;
        android.media.AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long zzc = this.zzb.zzc() / 1000;
            if (zzc - this.zzl >= 30000) {
                long zzj = zzj();
                if (zzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = com.google.android.gms.internal.ads.zzfl.zzy(zzj, this.zzi) - zzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i = this.zzt;
                    if (i < 10) {
                        this.zzt = i + 1;
                    }
                    this.zzl = zzc;
                    this.zzk = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzt;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzk += jArr[i2] / i3;
                        i2++;
                    }
                }
            }
            long j = this.zzn;
            if (this.zzg && (method = this.zzm) != null && zzc - this.zzo >= 500000) {
                try {
                    java.lang.Integer num = (java.lang.Integer) method.invoke(audioTrack, new java.lang.Object[0]);
                    java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                    java.lang.Integer num2 = num;
                    long intValue = (num.intValue() * 1000) - this.zzf;
                    this.zzn = intValue;
                    long max = java.lang.Math.max(intValue, 0L);
                    this.zzn = max;
                    if (max > 10000000) {
                        this.zza.zza(max);
                        this.zzn = 0L;
                    }
                } catch (java.lang.Exception unused) {
                    this.zzm = null;
                }
                this.zzo = zzc;
            }
            this.zzh.zza(zzc, this.zzi, zzh(zzc), j != this.zzn);
        }
        long zzc2 = this.zzb.zzc() / 1000;
        com.google.android.gms.internal.ads.zzsg zzsgVar = this.zzh;
        boolean zzb = zzsgVar.zzb();
        long zze = zzb ? zzsgVar.zze(zzc2, this.zzi) : zzh(zzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zzb || !zzsgVar.zzc()) {
                zzg(zze);
            }
            long j2 = this.zzz;
            if (j2 != -9223372036854775807L) {
                long j3 = zze - this.zzy;
                long zzx = com.google.android.gms.internal.ads.zzfl.zzx(zzc2 - j2, this.zzi);
                long j4 = this.zzy + zzx;
                long abs = java.lang.Math.abs(j4 - zze);
                if (j3 != 0 && abs < 1000000) {
                    long j5 = (zzx * 10) / 100;
                    zze = java.lang.Math.max(j4 - j5, java.lang.Math.min(zze, j4 + j5));
                }
            }
            this.zzz = zzc2;
            this.zzy = zze;
        } else if (playState == 1) {
            zzg(zze);
            return zze;
        }
        return zze;
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = com.google.android.gms.internal.ads.zzfl.zzs(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        android.media.AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j) {
        return this.zzv != -9223372036854775807L && j > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j) {
        this.zzw = zzk();
        this.zzu = com.google.android.gms.internal.ads.zzfl.zzs(this.zzb.zzb());
        this.zzx = j;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
