package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import io.sentry.TransactionOptions;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class zzqb {
    private long zzA;
    private boolean zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private zzcz zzG;
    private final zzqa zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzpz zze;
    private int zzf;
    private long zzg;
    private float zzh;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private Method zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private int zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzqb(zzqa zzqaVar) {
        this.zza = zzqaVar;
        try {
            this.zzl = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzG = zzcz.zza;
    }

    private final long zzl() {
        long zzb = this.zzG.zzb();
        if (this.zzv != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzx;
            }
            return Math.min(this.zzy, this.zzx + zzen.zzp(zzen.zzq(zzen.zzs(zzb) - this.zzv, this.zzh), this.zzf));
        }
        if (zzb - this.zzq >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (zzen.zza <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzr <= 0 || playState != 3) {
                            playbackHeadPosition = 0;
                        } else if (this.zzw == -9223372036854775807L) {
                            this.zzw = zzb;
                        }
                    }
                    this.zzw = -9223372036854775807L;
                }
                if (this.zzr > playbackHeadPosition) {
                    this.zzs++;
                }
                this.zzr = playbackHeadPosition;
            }
            this.zzq = zzb;
        }
        return this.zzr + this.zzF + (this.zzs << 32);
    }

    private final long zzm() {
        return zzen.zzt(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzj = 0L;
        this.zzu = 0;
        this.zzt = 0;
        this.zzk = 0L;
        this.zzA = 0L;
        this.zzD = 0L;
        this.zzi = false;
    }

    public final long zza(boolean z4) {
        long zzm;
        AudioTrack audioTrack;
        Method method;
        AudioTrack audioTrack2;
        AudioTrack audioTrack3 = this.zzc;
        audioTrack3.getClass();
        if (audioTrack3.getPlayState() == 3) {
            long zzc = this.zzG.zzc() / 1000;
            if (zzc - this.zzk >= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
                long zzm2 = zzm();
                if (zzm2 != 0) {
                    this.zzb[this.zzt] = zzen.zzr(zzm2, this.zzh) - zzc;
                    this.zzt = (this.zzt + 1) % 10;
                    int i7 = this.zzu;
                    if (i7 < 10) {
                        this.zzu = i7 + 1;
                    }
                    this.zzk = zzc;
                    this.zzj = 0L;
                    int i8 = 0;
                    while (true) {
                        int i9 = this.zzu;
                        if (i8 >= i9) {
                            break;
                        }
                        this.zzj = (this.zzb[i8] / i9) + this.zzj;
                        i8++;
                    }
                }
            }
            zzpz zzpzVar = this.zze;
            zzpzVar.getClass();
            if (zzpzVar.zzg(zzc)) {
                long zzb = zzpzVar.zzb();
                long zza = zzpzVar.zza();
                long zzm3 = zzm();
                if (Math.abs(zzb - zzc) > 5000000) {
                    this.zza.zzd(zza, zzb, zzc, zzm3);
                    zzpzVar.zzd();
                } else if (Math.abs(zzen.zzt(zza, this.zzf) - zzm3) > 5000000) {
                    this.zza.zzc(zza, zzb, zzc, zzm3);
                    zzpzVar.zzd();
                } else {
                    zzpzVar.zzc();
                }
            }
            if (this.zzo && (method = this.zzl) != null && zzc - this.zzp >= 500000) {
                try {
                    audioTrack2 = this.zzc;
                } catch (Exception unused) {
                    this.zzl = null;
                }
                if (audioTrack2 == null) {
                    throw null;
                }
                Integer num = (Integer) method.invoke(audioTrack2, null);
                int i10 = zzen.zza;
                long intValue = (num.intValue() * 1000) - this.zzg;
                this.zzm = intValue;
                long max = Math.max(intValue, 0L);
                this.zzm = max;
                if (max > 5000000) {
                    this.zza.zza(max);
                    this.zzm = 0L;
                }
                this.zzp = zzc;
            }
        }
        long zzc2 = this.zzG.zzc() / 1000;
        zzpz zzpzVar2 = this.zze;
        zzpzVar2.getClass();
        boolean zzf = zzpzVar2.zzf();
        if (zzf) {
            zzm = zzen.zzq(zzc2 - zzpzVar2.zzb(), this.zzh) + zzen.zzt(zzpzVar2.zza(), this.zzf);
        } else {
            zzm = this.zzu == 0 ? zzm() : zzen.zzq(this.zzj + zzc2, this.zzh);
            if (!z4) {
                zzm = Math.max(0L, zzm - this.zzm);
            }
        }
        if (this.zzB != zzf) {
            this.zzD = this.zzA;
            this.zzC = this.zzz;
        }
        long j = zzc2 - this.zzD;
        if (j < 1000000) {
            audioTrack = audioTrack3;
            long zzq = zzen.zzq(j, this.zzh) + this.zzC;
            long j3 = (j * 1000) / 1000000;
            zzm = (((1000 - j3) * zzq) + (zzm * j3)) / 1000;
        } else {
            audioTrack = audioTrack3;
        }
        if (!this.zzi && zzm > this.zzz && audioTrack.getPlayState() == 3) {
            this.zzi = true;
            long j7 = zzm - this.zzz;
            int i11 = zzen.zza;
            this.zza.zzb(this.zzG.zza() - zzen.zzv(zzen.zzr(zzen.zzv(j7), this.zzh)));
        }
        this.zzA = zzc2;
        this.zzz = zzm;
        this.zzB = zzf;
        return zzm;
    }

    public final void zzb(long j) {
        this.zzx = zzl();
        this.zzv = zzen.zzs(this.zzG.zzb());
        this.zzy = j;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    public final void zzd(AudioTrack audioTrack, boolean z4, int i7, int i8, int i9) {
        this.zzc = audioTrack;
        this.zzd = i9;
        this.zze = new zzpz(audioTrack);
        this.zzf = audioTrack.getSampleRate();
        if (z4) {
            int i10 = zzen.zza;
        }
        boolean zzK = zzen.zzK(i7);
        this.zzo = zzK;
        this.zzg = zzK ? zzen.zzt(i9 / i8, this.zzf) : -9223372036854775807L;
        this.zzr = 0L;
        this.zzs = 0L;
        this.zzE = false;
        this.zzF = 0L;
        this.zzn = false;
        this.zzv = -9223372036854775807L;
        this.zzw = -9223372036854775807L;
        this.zzp = 0L;
        this.zzm = 0L;
        this.zzh = 1.0f;
    }

    public final void zze(zzcz zzczVar) {
        this.zzG = zzczVar;
    }

    public final void zzf() {
        if (this.zzv != -9223372036854775807L) {
            this.zzv = zzen.zzs(this.zzG.zzb());
        }
        zzpz zzpzVar = this.zze;
        zzpzVar.getClass();
        zzpzVar.zze();
    }

    public final boolean zzg(long j) {
        return this.zzv != -9223372036854775807L ? j > zzl() : j > zzen.zzp(zza(false), this.zzf);
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzw != -9223372036854775807L && j > 0 && this.zzG.zzb() - this.zzw >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        boolean z4 = this.zzn;
        boolean zzg = zzg(j);
        this.zzn = zzg;
        if (z4 && !zzg && playState != 1) {
            this.zza.zze(this.zzd, zzen.zzv(this.zzg));
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzv != -9223372036854775807L) {
            this.zzx = zzl();
            return false;
        }
        zzpz zzpzVar = this.zze;
        zzpzVar.getClass();
        zzpzVar.zze();
        return true;
    }
}
