package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import io.sentry.TransactionOptions;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    private final long zzl() {
        long jZzb = this.zzG.zzb();
        if (this.zzv != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzx;
            }
            return Math.min(this.zzy, this.zzx + zzen.zzp(zzen.zzq(zzen.zzs(jZzb) - this.zzv, this.zzh), this.zzf));
        }
        if (jZzb - this.zzq >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                if (zzen.zza > 29) {
                    if (this.zzr > playbackHeadPosition) {
                        this.zzs++;
                    }
                    this.zzr = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition == 0) {
                        if (this.zzr <= 0 || playState != 3) {
                            playbackHeadPosition = 0;
                        } else if (this.zzw == -9223372036854775807L) {
                            this.zzw = jZzb;
                        }
                    }
                    this.zzw = -9223372036854775807L;
                    if (this.zzr > playbackHeadPosition) {
                        this.zzs++;
                    }
                    this.zzr = playbackHeadPosition;
                }
            }
            this.zzq = jZzb;
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

    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[Catch: Exception -> 0x00f2, TryCatch #0 {Exception -> 0x00f2, blocks: (B:33:0x00c6, B:35:0x00ca, B:37:0x00e9, B:38:0x00f1), top: B:67:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e9 A[Catch: Exception -> 0x00f2, TryCatch #0 {Exception -> 0x00f2, blocks: (B:33:0x00c6, B:35:0x00ca, B:37:0x00e9, B:38:0x00f1), top: B:67:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1 A[Catch: Exception -> 0x00f2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f2, blocks: (B:33:0x00c6, B:35:0x00ca, B:37:0x00e9, B:38:0x00f1), top: B:67:0x00c6 }] */
    public final long zza(boolean z4) {
        long jZzm;
        zzpz zzpzVar;
        Method method;
        AudioTrack audioTrack;
        long jMax;
        long jZzb;
        long jZza;
        long jZzm2;
        AudioTrack audioTrack2 = this.zzc;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long jZzc = this.zzG.zzc() / 1000;
            if (jZzc - this.zzk >= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
                long jZzm3 = zzm();
                if (jZzm3 != 0) {
                    this.zzb[this.zzt] = zzen.zzr(jZzm3, this.zzh) - jZzc;
                    this.zzt = (this.zzt + 1) % 10;
                    int i7 = this.zzu;
                    if (i7 < 10) {
                        this.zzu = i7 + 1;
                    }
                    this.zzk = jZzc;
                    this.zzj = 0L;
                    int i8 = 0;
                    while (true) {
                        int i9 = this.zzu;
                        if (i8 >= i9) {
                            break;
                        }
                        this.zzj = (this.zzb[i8] / ((long) i9)) + this.zzj;
                        i8++;
                    }
                    zzpzVar = this.zze;
                    zzpzVar.getClass();
                    if (zzpzVar.zzg(jZzc)) {
                        jZzb = zzpzVar.zzb();
                        jZza = zzpzVar.zza();
                        jZzm2 = zzm();
                        if (Math.abs(jZzb - jZzc) > 5000000) {
                            this.zza.zzd(jZza, jZzb, jZzc, jZzm2);
                            zzpzVar.zzd();
                        } else if (Math.abs(zzen.zzt(jZza, this.zzf) - jZzm2) > 5000000) {
                            this.zza.zzc(jZza, jZzb, jZzc, jZzm2);
                            zzpzVar.zzd();
                        } else {
                            zzpzVar.zzc();
                        }
                    }
                    if (this.zzo && (method = this.zzl) != null && jZzc - this.zzp >= 500000) {
                        try {
                            audioTrack = this.zzc;
                            if (audioTrack != null) {
                                throw null;
                            }
                            Integer num = (Integer) method.invoke(audioTrack, null);
                            int i10 = zzen.zza;
                            long jIntValue = (((long) num.intValue()) * 1000) - this.zzg;
                            this.zzm = jIntValue;
                            jMax = Math.max(jIntValue, 0L);
                            this.zzm = jMax;
                            if (jMax > 5000000) {
                                this.zza.zza(jMax);
                                this.zzm = 0L;
                            }
                            this.zzp = jZzc;
                        } catch (Exception unused) {
                            this.zzl = null;
                        }
                    }
                }
            } else {
                zzpzVar = this.zze;
                zzpzVar.getClass();
                if (zzpzVar.zzg(jZzc)) {
                    jZzb = zzpzVar.zzb();
                    jZza = zzpzVar.zza();
                    jZzm2 = zzm();
                    if (Math.abs(jZzb - jZzc) > 5000000) {
                        this.zza.zzd(jZza, jZzb, jZzc, jZzm2);
                        zzpzVar.zzd();
                    } else if (Math.abs(zzen.zzt(jZza, this.zzf) - jZzm2) > 5000000) {
                        this.zza.zzc(jZza, jZzb, jZzc, jZzm2);
                        zzpzVar.zzd();
                    } else {
                        zzpzVar.zzc();
                    }
                }
                if (this.zzo) {
                    audioTrack = this.zzc;
                    if (audioTrack != null) {
                        throw null;
                    }
                    Integer num2 = (Integer) method.invoke(audioTrack, null);
                    int i11 = zzen.zza;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.zzg;
                    this.zzm = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.zzm = jMax;
                    if (jMax > 5000000) {
                        this.zza.zza(jMax);
                        this.zzm = 0L;
                    }
                    this.zzp = jZzc;
                }
            }
        }
        long jZzc2 = this.zzG.zzc() / 1000;
        zzpz zzpzVar2 = this.zze;
        zzpzVar2.getClass();
        boolean zZzf = zzpzVar2.zzf();
        if (zZzf) {
            jZzm = zzen.zzq(jZzc2 - zzpzVar2.zzb(), this.zzh) + zzen.zzt(zzpzVar2.zza(), this.zzf);
        } else {
            jZzm = this.zzu == 0 ? zzm() : zzen.zzq(this.zzj + jZzc2, this.zzh);
            if (!z4) {
                jZzm = Math.max(0L, jZzm - this.zzm);
            }
        }
        if (this.zzB != zZzf) {
            this.zzD = this.zzA;
            this.zzC = this.zzz;
        }
        long j = jZzc2 - this.zzD;
        if (j < 1000000) {
            long jZzq = zzen.zzq(j, this.zzh) + this.zzC;
            long j3 = (j * 1000) / 1000000;
            jZzm = (((1000 - j3) * jZzq) + (jZzm * j3)) / 1000;
        }
        if (!this.zzi && jZzm > this.zzz && audioTrack2.getPlayState() == 3) {
            this.zzi = true;
            long j7 = jZzm - this.zzz;
            int i12 = zzen.zza;
            this.zza.zzb(this.zzG.zza() - zzen.zzv(zzen.zzr(zzen.zzv(j7), this.zzh)));
        }
        this.zzA = jZzc2;
        this.zzz = jZzm;
        this.zzB = zZzf;
        return jZzm;
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
        boolean zZzK = zzen.zzK(i7);
        this.zzo = zZzK;
        this.zzg = zZzK ? zzen.zzt(i9 / i8, this.zzf) : -9223372036854775807L;
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
        if (this.zzv != -9223372036854775807L) {
            return j > zzl();
        }
        return j > zzen.zzp(zza(false), this.zzf);
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
        boolean zZzg = zzg(j);
        this.zzn = zZzg;
        if (z4 && !zZzg && playState != 1) {
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
