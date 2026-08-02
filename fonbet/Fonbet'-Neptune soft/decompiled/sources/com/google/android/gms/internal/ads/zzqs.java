package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzqs {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private zzdj zzG;
    boolean zza;
    private final zzqr zzb;
    private final long[] zzc;
    private AudioTrack zzd;
    private int zze;
    private zzqq zzf;
    private int zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private Method zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzqs(zzqr zzqrVar) {
        this.zzb = zzqrVar;
        try {
            this.zzo = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzD = -9223372036854775807L;
        this.zzC = -9223372036854775807L;
        this.zzG = zzdj.zza;
    }

    private final long zzl() {
        if (this.zzy != -9223372036854775807L) {
            return Math.min(this.zzB, zzo());
        }
        long zzb = this.zzG.zzb();
        if (zzb - this.zzt >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzu <= 0 || playState != 3) {
                            playbackHeadPosition = 0;
                        } else if (this.zzz == -9223372036854775807L) {
                            this.zzz = zzb;
                        }
                    }
                    this.zzz = -9223372036854775807L;
                }
                if (this.zzu > playbackHeadPosition) {
                    this.zzv++;
                }
                this.zzu = playbackHeadPosition;
            }
            this.zzt = zzb;
        }
        return this.zzu + this.zzF + (this.zzv << 32);
    }

    private final long zzm(long j) {
        long max = Math.max(0L, (this.zzx == 0 ? this.zzy != -9223372036854775807L ? zzex.zzt(zzo(), this.zzg) : zzn() : zzex.zzq(j + this.zzm, this.zzi)) - this.zzp);
        return this.zzy != -9223372036854775807L ? Math.min(zzex.zzt(this.zzB, this.zzg), max) : max;
    }

    private final long zzn() {
        return zzex.zzt(zzl(), this.zzg);
    }

    private final long zzo() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzA;
        }
        return this.zzA + zzex.zzp(zzex.zzq(zzex.zzs(this.zzG.zzb()) - this.zzy, this.zzi), this.zzg);
    }

    private final void zzp() {
        this.zzm = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzn = 0L;
        this.zzC = -9223372036854775807L;
        this.zzD = -9223372036854775807L;
        this.zzj = false;
    }

    public final long zza() {
        Method method;
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = this.zzd;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long zzc = this.zzG.zzc() / 1000;
            if (zzc - this.zzn >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long zzn = zzn();
                if (zzn != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzw] = zzex.zzr(zzn, this.zzi) - zzc;
                    this.zzw = (this.zzw + 1) % 10;
                    int i = this.zzx;
                    if (i < 10) {
                        this.zzx = i + 1;
                    }
                    this.zzn = zzc;
                    this.zzm = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzx;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzm += jArr[i2] / i3;
                        i2++;
                    }
                }
            }
            if (this.zzr && (method = this.zzo) != null && zzc - this.zzs >= 500000) {
                try {
                    audioTrack = this.zzd;
                } catch (Exception unused) {
                    this.zzo = null;
                }
                if (audioTrack == null) {
                    throw null;
                }
                Integer num = (Integer) method.invoke(audioTrack, null);
                String str = zzex.zza;
                Integer num2 = num;
                long intValue = (num.intValue() * 1000) - this.zzh;
                this.zzp = intValue;
                long max = Math.max(intValue, 0L);
                this.zzp = max;
                if (max > 5000000) {
                    this.zzb.zza(max);
                    this.zzp = 0L;
                }
                this.zzs = zzc;
            }
            zzqq zzqqVar = this.zzf;
            zzqqVar.getClass();
            zzqqVar.zzb(zzc, this.zzi, zzm(zzc));
        }
        long zzc2 = this.zzG.zzc() / 1000;
        zzqq zzqqVar2 = this.zzf;
        zzqqVar2.getClass();
        boolean zzd = zzqqVar2.zzd();
        long zza = zzd ? zzqqVar2.zza(zzc2, this.zzi) : zzm(zzc2);
        if (audioTrack2.getPlayState() == 3) {
            if (this.zza) {
                long j = this.zzk;
                if (j != -9223372036854775807L && zza >= j && (zzd || !zzqqVar2.zze())) {
                    long zza2 = this.zzG.zza() - zzex.zzv(zzex.zzr(zza - j, this.zzi));
                    this.zzk = -9223372036854775807L;
                    this.zzb.zzb(zza2);
                }
            }
            long j2 = this.zzD;
            if (j2 != -9223372036854775807L) {
                long j3 = zza - this.zzC;
                long zzq = zzex.zzq(zzc2 - j2, this.zzi);
                long j4 = this.zzC + zzq;
                long abs = Math.abs(j4 - zza);
                if (j3 != 0 && abs < 1000000) {
                    long j5 = (zzq * 10) / 100;
                    zza = Math.max(j4 - j5, Math.min(zza, j4 + j5));
                }
            }
            if (!this.zza && !this.zzj) {
                long j6 = this.zzC;
                if (j6 != -9223372036854775807L && zza > j6) {
                    this.zzj = true;
                    String str2 = zzex.zza;
                    this.zzb.zzb(this.zzG.zza() - zzex.zzv(zzex.zzr(zzex.zzv(zza - j6), this.zzi)));
                }
            }
            this.zzD = zzc2;
            this.zzC = zza;
        }
        return zza;
    }

    public final void zzb(long j) {
        this.zzA = zzl();
        this.zzy = zzex.zzs(this.zzG.zzb());
        this.zzB = j;
    }

    public final void zzc() {
        zzp();
        this.zzd = null;
        this.zzf = null;
    }

    public final void zzd(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        this.zzd = audioTrack;
        this.zze = i3;
        this.zzf = new zzqq(audioTrack, this.zzb);
        this.zzg = audioTrack.getSampleRate();
        boolean zzK = zzex.zzK(i);
        this.zzr = zzK;
        this.zzh = zzK ? zzex.zzt(i3 / i2, this.zzg) : -9223372036854775807L;
        this.zzu = 0L;
        this.zzv = 0L;
        this.zzE = false;
        this.zzF = 0L;
        this.zzq = false;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzs = 0L;
        this.zzp = 0L;
        this.zzi = 1.0f;
        this.zzl = 0;
        this.zzk = -9223372036854775807L;
        this.zza = z2;
    }

    public final void zze(zzdj zzdjVar) {
        this.zzG = zzdjVar;
    }

    public final void zzf() {
        if (this.zzy != -9223372036854775807L) {
            this.zzy = zzex.zzs(this.zzG.zzb());
        }
        this.zzk = zzn();
        zzqq zzqqVar = this.zzf;
        zzqqVar.getClass();
        zzqqVar.zzc();
    }

    public final boolean zzg(long j) {
        return j > zzex.zzp(zza(), this.zzg);
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzz != -9223372036854775807L && j > 0 && this.zzG.zzb() - this.zzz >= 200;
    }

    public final boolean zzj(long j) {
        int underrunCount;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (Build.VERSION.SDK_INT >= 24) {
            AudioTrack audioTrack2 = this.zzd;
            audioTrack2.getClass();
            underrunCount = audioTrack2.getUnderrunCount();
            r4 = underrunCount > this.zzl;
            this.zzl = underrunCount;
        } else {
            boolean z = this.zzq;
            boolean zzg = zzg(j);
            this.zzq = zzg;
            if (z && !zzg && playState != 1) {
                r4 = true;
            }
        }
        if (r4) {
            this.zzb.zze(this.zze, zzex.zzv(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzp();
        if (this.zzy != -9223372036854775807L) {
            this.zzA = zzl();
            return false;
        }
        zzqq zzqqVar = this.zzf;
        zzqqVar.getClass();
        zzqqVar.zzc();
        return true;
    }
}
