package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzqx implements zzpx {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private long zzI;
    private float zzJ;
    private ByteBuffer zzK;
    private int zzL;
    private ByteBuffer zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private zzf zzS;
    private zzoz zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private Looper zzX;
    private long zzY;
    private long zzZ;
    private Handler zzaa;
    private final zzqn zzab;
    private final zzqd zzac;
    private final Context zzd;
    private final zzqc zze;
    private final zzrh zzf;
    private final zzfwh zzg;
    private final zzfwh zzh;
    private final zzqb zzi;
    private final ArrayDeque zzj;
    private zzqv zzk;
    private final zzqr zzl;
    private final zzqr zzm;
    private zzor zzn;
    private zzpu zzo;
    private zzqm zzp;
    private zzqm zzq;
    private zzcd zzr;
    private AudioTrack zzs;
    private zzot zzt;
    private zzoy zzu;
    private zzqq zzv;
    private zze zzw;
    private zzqo zzx;
    private zzqo zzy;
    private zzbb zzz;

    public /* synthetic */ zzqx(zzql zzqlVar, zzqw zzqwVar) {
        Context context = zzqlVar.zza;
        this.zzd = context;
        this.zzw = zze.zza;
        zzqw zzqwVar2 = null;
        this.zzt = context != null ? null : zzqlVar.zzb;
        this.zzab = zzqlVar.zzf;
        int i7 = zzen.zza;
        zzqd zzqdVar = zzqlVar.zzg;
        zzqdVar.getClass();
        this.zzac = zzqdVar;
        this.zzi = new zzqb(new zzqs(this, zzqwVar2));
        zzqc zzqcVar = new zzqc();
        this.zze = zzqcVar;
        zzrh zzrhVar = new zzrh();
        this.zzf = zzrhVar;
        this.zzg = zzfwh.zzq(new zzck(), zzqcVar, zzrhVar);
        this.zzh = zzfwh.zzo(new zzrg());
        this.zzJ = 1.0f;
        this.zzR = 0;
        this.zzS = new zzf(0, 0.0f);
        zzbb zzbbVar = zzbb.zza;
        this.zzy = new zzqo(zzbbVar, 0L, 0L, null);
        this.zzz = zzbbVar;
        this.zzA = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqr();
        this.zzm = new zzqr();
    }

    public static /* synthetic */ void zzG(zzqx zzqxVar) {
        if (zzqxVar.zzZ >= 300000) {
            ((zzrb) zzqxVar.zzo).zza.zzn = true;
            zzqxVar.zzZ = 0L;
        }
    }

    public static /* synthetic */ void zzI(AudioTrack audioTrack, final zzpu zzpuVar, Handler handler, final zzpr zzprVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpuVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzrb) zzpuVar).zza.zzc.zzp(zzprVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i7 = zzc - 1;
                    zzc = i7;
                    if (i7 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (zzpuVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzrb) zzpuVar).zza.zzc.zzp(zzprVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i8 = zzc - 1;
                    zzc = i8;
                    if (i8 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzK() {
        boolean z4;
        synchronized (zza) {
            z4 = zzc > 0;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        zzqm zzqmVar = this.zzq;
        return zzqmVar.zzc == 0 ? this.zzB / ((long) zzqmVar.zzb) : this.zzC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzM() {
        zzqm zzqmVar = this.zzq;
        if (zzqmVar.zzc != 0) {
            return this.zzE;
        }
        long j = this.zzD;
        long j3 = zzqmVar.zzd;
        int i7 = zzen.zza;
        return ((j + j3) - 1) / j3;
    }

    private final AudioTrack zzN(zzqm zzqmVar) throws zzpt {
        try {
            return zzac(zzqmVar.zza(), this.zzw, this.zzR, zzqmVar.zza);
        } catch (zzpt e7) {
            zzpu zzpuVar = this.zzo;
            if (zzpuVar != null) {
                zzpuVar.zza(e7);
            }
            throw e7;
        }
    }

    private final void zzO(long j) {
        zzbb zzbbVar;
        boolean z4;
        if (zzab()) {
            zzqn zzqnVar = this.zzab;
            zzbbVar = this.zzz;
            zzqnVar.zzc(zzbbVar);
        } else {
            zzbbVar = zzbb.zza;
        }
        zzbb zzbbVar2 = zzbbVar;
        this.zzz = zzbbVar2;
        if (zzab()) {
            zzqn zzqnVar2 = this.zzab;
            z4 = this.zzA;
            zzqnVar2.zzd(z4);
        } else {
            z4 = false;
        }
        this.zzA = z4;
        this.zzj.add(new zzqo(zzbbVar2, Math.max(0L, j), zzen.zzt(zzM(), this.zzq.zze), null));
        zzX();
        zzpu zzpuVar = this.zzo;
        if (zzpuVar != null) {
            ((zzrb) zzpuVar).zza.zzc.zzw(this.zzA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    private final void zzP(long j) throws zzpw {
        zzpu zzpuVar;
        if (this.zzM == null || this.zzm.zzc()) {
            return;
        }
        int iRemaining = this.zzM.remaining();
        boolean z4 = true;
        int iWrite = this.zzs.write(this.zzM, iRemaining, 1);
        this.zzU = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((zzen.zza < 24 || iWrite != -6) && iWrite != -32) {
                z4 = false;
            } else if (zzM() <= 0) {
                if (zzaa(this.zzs)) {
                    zzQ();
                } else {
                    z4 = false;
                }
            }
            zzpw zzpwVar = new zzpw(iWrite, this.zzq.zza, z4);
            zzpu zzpuVar2 = this.zzo;
            if (zzpuVar2 != null) {
                zzpuVar2.zza(zzpwVar);
            }
            if (zzpwVar.zzb) {
                this.zzt = zzot.zza;
                throw zzpwVar;
            }
            this.zzm.zzb(zzpwVar);
            return;
        }
        this.zzm.zza();
        if (zzaa(this.zzs)) {
            if (this.zzE > 0) {
                this.zzW = false;
            }
            if (this.zzQ && (zzpuVar = this.zzo) != null && iWrite < iRemaining) {
            }
        }
        int i7 = this.zzq.zzc;
        if (i7 == 0) {
            this.zzD += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i7 != 0) {
                zzcv.zzf(this.zzM == this.zzK);
                this.zzE = (((long) this.zzF) * ((long) this.zzL)) + this.zzE;
            }
            this.zzM = null;
        }
    }

    private final void zzQ() {
        if (this.zzq.zzc == 1) {
            this.zzV = true;
        }
    }

    private final void zzR() {
        if (this.zzu == null && this.zzd != null) {
            this.zzX = Looper.myLooper();
            zzoy zzoyVar = new zzoy(this.zzd, new zzqh(this), this.zzw, this.zzT);
            this.zzu = zzoyVar;
            this.zzt = zzoyVar.zzc();
        }
        this.zzt.getClass();
    }

    private final void zzS() {
        if (this.zzO) {
            return;
        }
        this.zzO = true;
        this.zzi.zzb(zzM());
        if (zzaa(this.zzs)) {
            this.zzP = false;
        }
        this.zzs.stop();
    }

    private final void zzT(long j) throws zzpw {
        zzP(j);
        if (this.zzM != null) {
            return;
        }
        if (!this.zzr.zzh()) {
            ByteBuffer byteBuffer = this.zzK;
            if (byteBuffer != null) {
                zzV(byteBuffer);
                zzP(j);
                return;
            }
            return;
        }
        while (!this.zzr.zzg()) {
            do {
                ByteBuffer byteBufferZzb = this.zzr.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzV(byteBufferZzb);
                    zzP(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzK;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzr.zze(this.zzK);
                    }
                }
            } while (this.zzM == null);
            return;
        }
    }

    private final void zzU(zzbb zzbbVar) {
        zzqo zzqoVar = new zzqo(zzbbVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzZ()) {
            this.zzx = zzqoVar;
        } else {
            this.zzy = zzqoVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0153  */
    /* JADX WARN: Code duplicated, block: B:57:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX WARN: Code duplicated, block: B:62:0x0195  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x004b A[SYNTHETIC] */
    private final void zzV(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i7;
        int i8;
        int i9;
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        zzcv.zzf(this.zzM == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzq.zzc == 0) {
                int iZzp = (int) zzen.zzp(zzen.zzs(20L), this.zzq.zze);
                long jZzM = zzM();
                long j = iZzp;
                if (jZzM < j) {
                    zzqm zzqmVar = this.zzq;
                    int i18 = zzqmVar.zzg;
                    int i19 = zzqmVar.zzd;
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i20 = (int) jZzM;
                    while (byteBuffer.hasRemaining() && i20 < iZzp) {
                        if (i18 != 2) {
                            if (i18 == 3) {
                                i9 = (byteBuffer.get() & 255) << 24;
                            } else if (i18 != 4) {
                                if (i18 != 21) {
                                    if (i18 == 22) {
                                        i14 = byteBuffer.get() & 255;
                                        i15 = (byteBuffer.get() & 255) << 8;
                                        i16 = (byteBuffer.get() & 255) << 16;
                                        i17 = (byteBuffer.get() & 255) << 24;
                                    } else if (i18 == 268435456) {
                                        i7 = (byteBuffer.get() & 255) << 24;
                                        i8 = (byteBuffer.get() & 255) << 16;
                                    } else if (i18 == 1342177280) {
                                        i11 = (byteBuffer.get() & 255) << 24;
                                        i12 = (byteBuffer.get() & 255) << 16;
                                        i13 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i18 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i14 = (byteBuffer.get() & 255) << 24;
                                        i15 = (byteBuffer.get() & 255) << 16;
                                        i16 = (byteBuffer.get() & 255) << 8;
                                        i17 = byteBuffer.get() & 255;
                                    }
                                    i9 = i14 | i15 | i16 | i17;
                                } else {
                                    i11 = (byteBuffer.get() & 255) << 8;
                                    i12 = (byteBuffer.get() & 255) << 16;
                                    i13 = (byteBuffer.get() & 255) << 24;
                                }
                                i9 = i11 | i12 | i13;
                            } else {
                                float fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                if (fMax < 0.0f) {
                                    fMax = -fMax;
                                    f7 = -2.1474836E9f;
                                } else {
                                    f7 = 2.1474836E9f;
                                }
                                i9 = (int) (fMax * f7);
                            }
                            i10 = (int) ((((long) i9) * ((long) i20)) / j);
                            if (i18 != 2) {
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 24));
                            } else if (i18 != 3) {
                                byteBufferOrder.put((byte) (i10 >> 24));
                            } else if (i18 != 4) {
                                if (i18 != 21) {
                                    byteBufferOrder.put((byte) (i10 >> 8));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                } else if (i18 != 22) {
                                    byteBufferOrder.put((byte) i10);
                                    byteBufferOrder.put((byte) (i10 >> 8));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                } else if (i18 != 268435456) {
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                } else if (i18 != 1342177280) {
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                    byteBufferOrder.put((byte) (i10 >> 8));
                                } else {
                                    if (i18 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                    byteBufferOrder.put((byte) (i10 >> 8));
                                    byteBufferOrder.put((byte) i10);
                                }
                            } else if (i10 < 0) {
                                byteBufferOrder.putFloat((-i10) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i10 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i19) {
                                i20++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i7 = (byteBuffer.get() & 255) << 16;
                            i8 = (byteBuffer.get() & 255) << 24;
                        }
                        i9 = i7 | i8;
                        i10 = (int) ((((long) i9) * ((long) i20)) / j);
                        if (i18 != 2) {
                            byteBufferOrder.put((byte) (i10 >> 16));
                            byteBufferOrder.put((byte) (i10 >> 24));
                        } else if (i18 != 3) {
                            byteBufferOrder.put((byte) (i10 >> 24));
                        } else if (i18 != 4) {
                            if (i18 != 21) {
                                byteBufferOrder.put((byte) (i10 >> 8));
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 24));
                            } else if (i18 != 22) {
                                byteBufferOrder.put((byte) i10);
                                byteBufferOrder.put((byte) (i10 >> 8));
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 24));
                            } else if (i18 != 268435456) {
                                byteBufferOrder.put((byte) (i10 >> 24));
                                byteBufferOrder.put((byte) (i10 >> 16));
                            } else if (i18 != 1342177280) {
                                byteBufferOrder.put((byte) (i10 >> 24));
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 8));
                            } else {
                                if (i18 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i10 >> 24));
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 8));
                                byteBufferOrder.put((byte) i10);
                            }
                        } else if (i10 < 0) {
                            byteBufferOrder.putFloat((-i10) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i10 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i19) {
                            i20++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.zzM = byteBuffer2;
        }
    }

    private final void zzW() {
        if (zzZ()) {
            this.zzs.setVolume(this.zzJ);
        }
    }

    private final void zzX() {
        zzcd zzcdVar = this.zzq.zzi;
        this.zzr = zzcdVar;
        zzcdVar.zzc();
    }

    private final boolean zzY() throws zzpw {
        if (!this.zzr.zzh()) {
            zzP(Long.MIN_VALUE);
            return this.zzM == null;
        }
        this.zzr.zzd();
        zzT(Long.MIN_VALUE);
        if (!this.zzr.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzM;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private final boolean zzZ() {
        return this.zzs != null;
    }

    private static boolean zzaa(AudioTrack audioTrack) {
        return zzen.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzab() {
        zzqm zzqmVar = this.zzq;
        if (zzqmVar.zzc != 0) {
            return false;
        }
        int i7 = zzqmVar.zza.zzG;
        return true;
    }

    private static final AudioTrack zzac(zzpr zzprVar, zze zzeVar, int i7, zzz zzzVar) throws zzpt {
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzeVar.zza().zza).setAudioFormat(zzen.zzx(zzprVar.zzb, zzprVar.zzc, zzprVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzprVar.zze).setSessionId(i7);
            if (zzen.zza >= 29) {
                sessionId.setOffloadedPlayback(zzprVar.zzd);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzpt(state, zzprVar.zzb, zzprVar.zzc, zzprVar.zza, zzzVar, zzprVar.zzd, null);
        } catch (IllegalArgumentException e7) {
            e = e7;
            throw new zzpt(0, zzprVar.zzb, zzprVar.zzc, zzprVar.zza, zzzVar, zzprVar.zzd, e);
        } catch (UnsupportedOperationException e8) {
            e = e8;
            throw new zzpt(0, zzprVar.zzb, zzprVar.zzc, zzprVar.zza, zzzVar, zzprVar.zzd, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final boolean zzA(zzz zzzVar) {
        return zza(zzzVar) != 0;
    }

    public final void zzJ(zzot zzotVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzX;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(L.j("Current looper (", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null", ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        zzot zzotVar2 = this.zzt;
        if (zzotVar2 == null || zzotVar.equals(zzotVar2)) {
            return;
        }
        this.zzt = zzotVar;
        zzpu zzpuVar = this.zzo;
        if (zzpuVar != null) {
            ((zzrb) zzpuVar).zza.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final int zza(zzz zzzVar) {
        zzR();
        if (!"audio/raw".equals(zzzVar.zzo)) {
            return this.zzt.zzb(zzzVar, this.zzw) != null ? 2 : 0;
        }
        if (zzen.zzK(zzzVar.zzG)) {
            return zzzVar.zzG != 2 ? 1 : 2;
        }
        AbstractC0486a1.k(zzzVar.zzG, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final long zzb(boolean z4) {
        long j;
        if (!zzZ() || this.zzH) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzi.zza(z4), zzen.zzt(zzM(), this.zzq.zze));
        while (!this.zzj.isEmpty() && jMin >= ((zzqo) this.zzj.getFirst()).zzc) {
            this.zzy = (zzqo) this.zzj.remove();
        }
        zzqo zzqoVar = this.zzy;
        long j3 = jMin - zzqoVar.zzc;
        long jZzq = zzen.zzq(j3, zzqoVar.zza.zzb);
        if (this.zzj.isEmpty()) {
            long jZza = this.zzab.zza(j3);
            zzqo zzqoVar2 = this.zzy;
            j = zzqoVar2.zzb + jZza;
            zzqoVar2.zzd = jZza - jZzq;
        } else {
            zzqo zzqoVar3 = this.zzy;
            j = zzqoVar3.zzb + jZzq + zzqoVar3.zzd;
        }
        long jZzb = this.zzab.zzb();
        long jZzt = zzen.zzt(jZzb, this.zzq.zze) + j;
        long j7 = this.zzY;
        if (jZzb > j7) {
            long jZzt2 = zzen.zzt(jZzb - j7, this.zzq.zze);
            this.zzY = jZzb;
            this.zzZ += jZzt2;
            if (this.zzaa == null) {
                this.zzaa = new Handler(Looper.myLooper());
            }
            this.zzaa.removeCallbacksAndMessages(null);
            this.zzaa.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqf
                @Override // java.lang.Runnable
                public final void run() {
                    zzqx.zzG(this.zza);
                }
            }, 100L);
        }
        return jZzt;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final zzbb zzc() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final zzpc zzd(zzz zzzVar) {
        return this.zzV ? zzpc.zza : this.zzac.zza(zzzVar, this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zze(zzz zzzVar, int i7, int[] iArr) throws zzps {
        int iIntValue;
        zzcd zzcdVar;
        int iZzk;
        int iIntValue2;
        int iZzk2;
        int i8;
        int i9;
        int iMax;
        zzR();
        if ("audio/raw".equals(zzzVar.zzo)) {
            zzcv.zzd(zzen.zzK(zzzVar.zzG));
            iZzk = zzen.zzk(zzzVar.zzG) * zzzVar.zzE;
            zzfwe zzfweVar = new zzfwe();
            zzfweVar.zzh(this.zzg);
            zzfweVar.zzg(this.zzab.zze());
            zzcd zzcdVar2 = new zzcd(zzfweVar.zzi());
            if (zzcdVar2.equals(this.zzr)) {
                zzcdVar2 = this.zzr;
            }
            this.zzf.zzq(zzzVar.zzH, zzzVar.zzI);
            this.zze.zzo(iArr);
            try {
                zzce zzceVarZza = zzcdVar2.zza(new zzce(zzzVar.zzF, zzzVar.zzE, zzzVar.zzG));
                iIntValue = zzceVarZza.zzd;
                i8 = zzceVarZza.zzb;
                int i10 = zzceVarZza.zzc;
                iIntValue2 = zzen.zzi(i10);
                zzcdVar = zzcdVar2;
                iZzk2 = zzen.zzk(iIntValue) * i10;
                i9 = 0;
            } catch (zzcf e7) {
                throw new zzps(e7, zzzVar);
            }
        } else {
            zzcd zzcdVar3 = new zzcd(zzfwh.zzn());
            int i11 = zzzVar.zzF;
            zzpc zzpcVar = zzpc.zza;
            Pair pairZzb = this.zzt.zzb(zzzVar, this.zzw);
            if (pairZzb == null) {
                throw new zzps("Unable to configure passthrough for: ".concat(String.valueOf(zzzVar)), zzzVar);
            }
            iIntValue = ((Integer) pairZzb.first).intValue();
            zzcdVar = zzcdVar3;
            iZzk = -1;
            iIntValue2 = ((Integer) pairZzb.second).intValue();
            iZzk2 = -1;
            i8 = i11;
            i9 = 2;
        }
        if (iIntValue == 0) {
            throw new zzps("Invalid output encoding (mode=" + i9 + ") for: " + String.valueOf(zzzVar), zzzVar);
        }
        if (iIntValue2 == 0) {
            throw new zzps("Invalid output channel config (mode=" + i9 + ") for: " + String.valueOf(zzzVar), zzzVar);
        }
        int i12 = zzzVar.zzj;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzzVar.zzo) && i12 == -1) {
            i12 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i8, iIntValue2, iIntValue);
        zzcv.zzf(minBufferSize != -2);
        int i13 = iZzk2 != -1 ? iZzk2 : 1;
        int i14 = 250000;
        if (i9 == 0) {
            int iZza = zzqz.zza(250000, i8, i13);
            int iZza2 = zzqz.zza(750000, i8, i13);
            int i15 = zzen.zza;
            iMax = Math.max(iZza, Math.min(minBufferSize * 4, iZza2));
        } else if (i9 != 1) {
            if (iIntValue == 5) {
                i14 = 500000;
            } else if (iIntValue == 8) {
                i14 = 1000000;
                iIntValue = 8;
            }
            iMax = zzfzk.zzb((((long) i14) * ((long) (i12 != -1 ? zzfzd.zzb(i12, 8, RoundingMode.CEILING) : zzqz.zzb(iIntValue)))) / 1000000);
        } else {
            iMax = zzfzk.zzb((((long) zzqz.zzb(iIntValue)) * 50000000) / 1000000);
        }
        int i16 = iIntValue;
        int iMax2 = (((Math.max(minBufferSize, iMax) + i13) - 1) / i13) * i13;
        this.zzV = false;
        zzqm zzqmVar = new zzqm(zzzVar, iZzk, i9, iZzk2, i8, iIntValue2, i16, iMax2, zzcdVar, false, false, false);
        if (zzZ()) {
            this.zzp = zzqmVar;
        } else {
            this.zzq = zzqmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzf() {
        zzqq zzqqVar;
        if (zzZ()) {
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzW = false;
            this.zzF = 0;
            this.zzy = new zzqo(this.zzz, 0L, 0L, null);
            this.zzI = 0L;
            this.zzx = null;
            this.zzj.clear();
            this.zzK = null;
            this.zzL = 0;
            this.zzM = null;
            this.zzO = false;
            this.zzN = false;
            this.zzP = false;
            this.zzf.zzp();
            zzX();
            if (this.zzi.zzh()) {
                this.zzs.pause();
            }
            if (zzaa(this.zzs)) {
                zzqv zzqvVar = this.zzk;
                zzqvVar.getClass();
                zzqvVar.zzb(this.zzs);
            }
            final zzpr zzprVarZza = this.zzq.zza();
            zzqm zzqmVar = this.zzp;
            if (zzqmVar != null) {
                this.zzq = zzqmVar;
                this.zzp = null;
            }
            this.zzi.zzc();
            if (zzen.zza >= 24 && (zzqqVar = this.zzv) != null) {
                zzqqVar.zzb();
                this.zzv = null;
            }
            final AudioTrack audioTrack = this.zzs;
            final zzpu zzpuVar = this.zzo;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        final String str = "ExoPlayer:AudioTrackReleaseThread";
                        zzb = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.zzem
                            public final /* synthetic */ String zza = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                int i7 = zzen.zza;
                                return new Thread(runnable, this.zza);
                            }
                        });
                    }
                    zzc++;
                    zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqe
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzqx.zzI(audioTrack, zzpuVar, handler, zzprVarZza);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.zzs = null;
        }
        this.zzm.zza();
        this.zzl.zza();
        this.zzY = 0L;
        this.zzZ = 0L;
        Handler handler2 = this.zzaa;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzg() {
        this.zzG = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzh() {
        this.zzQ = false;
        if (zzZ()) {
            if (this.zzi.zzk() || zzaa(this.zzs)) {
                this.zzs.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzi() {
        this.zzQ = true;
        if (zzZ()) {
            this.zzi.zzf();
            this.zzs.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzj() {
        if (!this.zzN && zzZ() && zzY()) {
            zzS();
            this.zzN = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzk() {
        zzoy zzoyVar = this.zzu;
        if (zzoyVar != null) {
            zzoyVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzl() {
        zzf();
        zzfwh zzfwhVar = this.zzg;
        int size = zzfwhVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((zzcg) zzfwhVar.get(i7)).zzf();
        }
        zzfwh zzfwhVar2 = this.zzh;
        int size2 = zzfwhVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((zzcg) zzfwhVar2.get(i8)).zzf();
        }
        zzcd zzcdVar = this.zzr;
        if (zzcdVar != null) {
            zzcdVar.zzf();
        }
        this.zzQ = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzm(zze zzeVar) {
        if (this.zzw.equals(zzeVar)) {
            return;
        }
        this.zzw = zzeVar;
        zzoy zzoyVar = this.zzu;
        if (zzoyVar != null) {
            zzoyVar.zzg(zzeVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzn(int i7) {
        if (this.zzR != i7) {
            this.zzR = i7;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzo(zzf zzfVar) {
        if (this.zzS.equals(zzfVar)) {
            return;
        }
        if (this.zzs != null) {
            int i7 = this.zzS.zza;
        }
        this.zzS = zzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzp(zzcz zzczVar) {
        this.zzi.zze(zzczVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzq(zzpu zzpuVar) {
        this.zzo = zzpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzr(int i7, int i8) {
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzaa(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzs(zzbb zzbbVar) {
        float f7 = zzbbVar.zzb;
        int i7 = zzen.zza;
        this.zzz = new zzbb(Math.max(0.1f, Math.min(f7, 8.0f)), Math.max(0.1f, Math.min(zzbbVar.zzc, 8.0f)));
        zzU(zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzt(zzor zzorVar) {
        this.zzn = zzorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzT = audioDeviceInfo == null ? null : new zzoz(audioDeviceInfo);
        zzoy zzoyVar = this.zzu;
        if (zzoyVar != null) {
            zzoyVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzqi.zza(audioTrack, this.zzT);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzv(boolean z4) {
        this.zzA = z4;
        zzU(this.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzw(float f7) {
        if (this.zzJ != f7) {
            this.zzJ = f7;
            zzW();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:132:0x0255  */
    /* JADX WARN: Code duplicated, block: B:133:0x0257  */
    /* JADX WARN: Code duplicated, block: B:136:0x0265  */
    /* JADX WARN: Code duplicated, block: B:139:0x0270  */
    /* JADX WARN: Code duplicated, block: B:141:0x0279  */
    /* JADX WARN: Code duplicated, block: B:142:0x027d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0287 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0289 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x028b  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:214:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzpx
    public final boolean zzx(ByteBuffer byteBuffer, long j, int i7) throws zzpw, zzpt {
        AudioTrack audioTrackZzN;
        zzoy zzoyVar;
        zzor zzorVar;
        boolean z4;
        int iZzb;
        int iPosition;
        byte b7;
        int i8;
        int i9;
        int i10;
        byte b8;
        int i11;
        int i12;
        ByteBuffer byteBuffer2 = this.zzK;
        zzcv.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzp != null) {
            if (!zzY()) {
                return false;
            }
            zzqm zzqmVar = this.zzp;
            zzqm zzqmVar2 = this.zzq;
            if (zzqmVar2.zzc == zzqmVar.zzc && zzqmVar2.zzg == zzqmVar.zzg && zzqmVar2.zze == zzqmVar.zze && zzqmVar2.zzf == zzqmVar.zzf && zzqmVar2.zzd == zzqmVar.zzd) {
                this.zzq = zzqmVar;
                this.zzp = null;
                AudioTrack audioTrack = this.zzs;
                if (audioTrack != null && zzaa(audioTrack)) {
                    boolean z7 = this.zzq.zzk;
                }
            } else {
                zzS();
                if (zzy()) {
                    return false;
                }
                zzf();
            }
            zzO(j);
        }
        if (!zzZ()) {
            try {
                if (this.zzl.zzc()) {
                    return false;
                }
                try {
                    zzqm zzqmVar3 = this.zzq;
                    if (zzqmVar3 == null) {
                        throw null;
                    }
                    audioTrackZzN = zzN(zzqmVar3);
                    this.zzs = audioTrackZzN;
                    if (zzaa(audioTrackZzN)) {
                        AudioTrack audioTrack2 = this.zzs;
                        if (this.zzk == null) {
                            this.zzk = new zzqv(this);
                        }
                        this.zzk.zza(audioTrack2);
                        boolean z8 = this.zzq.zzk;
                    }
                    int i13 = zzen.zza;
                    if (i13 >= 31 && (zzorVar = this.zzn) != null) {
                        AudioTrack audioTrack3 = this.zzs;
                        LogSessionId logSessionIdZza = zzorVar.zza();
                        if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                            audioTrack3.setLogSessionId(logSessionIdZza);
                        }
                    }
                    this.zzR = this.zzs.getAudioSessionId();
                    zzqb zzqbVar = this.zzi;
                    AudioTrack audioTrack4 = this.zzs;
                    zzqm zzqmVar4 = this.zzq;
                    zzqbVar.zzd(audioTrack4, zzqmVar4.zzc == 2, zzqmVar4.zzg, zzqmVar4.zzd, zzqmVar4.zzh);
                    zzW();
                    int i14 = this.zzS.zza;
                    zzoz zzozVar = this.zzT;
                    if (zzozVar != null) {
                        zzqi.zza(this.zzs, zzozVar);
                        zzoy zzoyVar2 = this.zzu;
                        if (zzoyVar2 != null) {
                            zzoyVar2.zzh(this.zzT.zza);
                        }
                    }
                    if (i13 >= 24 && (zzoyVar = this.zzu) != null) {
                        this.zzv = new zzqq(this.zzs, zzoyVar);
                    }
                    this.zzH = true;
                    zzpu zzpuVar = this.zzo;
                    if (zzpuVar != null) {
                        ((zzrb) zzpuVar).zza.zzc.zzo(this.zzq.zza());
                    }
                } catch (zzpt e7) {
                    zzqm zzqmVar5 = this.zzq;
                    if (zzqmVar5.zzh > 1000000) {
                        zzqm zzqmVar6 = new zzqm(zzqmVar5.zza, zzqmVar5.zzb, zzqmVar5.zzc, zzqmVar5.zzd, zzqmVar5.zze, zzqmVar5.zzf, zzqmVar5.zzg, 1000000, zzqmVar5.zzi, false, false, false);
                        try {
                            audioTrackZzN = zzN(zzqmVar6);
                            this.zzq = zzqmVar6;
                        } catch (zzpt e8) {
                            e7.addSuppressed(e8);
                            zzQ();
                            throw e7;
                        }
                    }
                    zzQ();
                    throw e7;
                }
            } catch (zzpt e9) {
                if (e9.zzb) {
                    throw e9;
                }
                this.zzl.zzb(e9);
                return false;
            }
        }
        this.zzl.zza();
        if (this.zzH) {
            this.zzI = Math.max(0L, j);
            this.zzG = false;
            this.zzH = false;
            zzO(j);
            if (this.zzQ) {
                zzi();
            }
        }
        this.zzi.zzj(zzM());
        if (this.zzK == null) {
            zzcv.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzqm zzqmVar7 = this.zzq;
            if (zzqmVar7.zzc != 0 && this.zzF == 0) {
                int i15 = zzqmVar7.zzg;
                if (i15 == 20) {
                    z4 = true;
                    iZzb = zzadq.zzb(byteBuffer);
                } else if (i15 != 30) {
                    switch (i15) {
                        case 5:
                        case 6:
                            iZzb = zzabu.zza(byteBuffer);
                            z4 = true;
                            break;
                        case 7:
                        case 8:
                            if (byteBuffer.getInt(0) == -233094848) {
                                z4 = true;
                                iZzb = 1024;
                            } else {
                                if (byteBuffer.getInt(0) == -398277519) {
                                    iZzb = 1024;
                                } else if (byteBuffer.getInt(0) != 622876772) {
                                    iPosition = byteBuffer.position();
                                    b7 = byteBuffer.get(iPosition);
                                    if (b7 != -2) {
                                        if (b7 != -1) {
                                            if (b7 != 31) {
                                                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                                i11 = byteBuffer.get(iPosition + 5) & 252;
                                                i9 = 2;
                                            } else {
                                                i9 = 2;
                                                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                                b8 = byteBuffer.get(iPosition + 6);
                                            }
                                            i8 = (i11 >> i9) | i10;
                                            z4 = true;
                                        } else {
                                            i9 = 2;
                                            i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                            b8 = byteBuffer.get(iPosition + 7);
                                        }
                                        i11 = b8 & 60;
                                        i8 = (i11 >> i9) | i10;
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                        i8 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                    }
                                    iZzb = (i8 + (z4 ? 1 : 0)) * 32;
                                } else {
                                    iZzb = 4096;
                                }
                                z4 = true;
                            }
                            break;
                        case 9:
                            iZzb = zzado.zzc(zzen.zzj(byteBuffer, byteBuffer.position()));
                            if (iZzb == -1) {
                                throw new IllegalArgumentException();
                            }
                            z4 = true;
                            break;
                        case 10:
                            iZzb = 1024;
                            z4 = true;
                            break;
                        case 11:
                        case 12:
                            iZzb = 2048;
                            z4 = true;
                            break;
                        default:
                            switch (i15) {
                                case 14:
                                    int iPosition2 = byteBuffer.position();
                                    int iLimit = byteBuffer.limit() - 10;
                                    int i16 = iPosition2;
                                    while (true) {
                                        if (i16 > iLimit) {
                                            i12 = -1;
                                        } else if ((zzen.zzj(byteBuffer, i16 + 4) & (-2)) == -126718022) {
                                            i12 = i16 - iPosition2;
                                        } else {
                                            i16++;
                                        }
                                    }
                                    if (i12 != -1) {
                                        iZzb = (40 << ((byteBuffer.get((byteBuffer.position() + i12) + ((byteBuffer.get((byteBuffer.position() + i12) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    } else {
                                        iZzb = 0;
                                    }
                                    break;
                                case 15:
                                    iZzb = 512;
                                    break;
                                case 16:
                                    iZzb = 1024;
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int iPosition3 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(iPosition3);
                                    iZzb = zzaby.zzb(new zzec(bArr, 16)).zzc;
                                    break;
                                case 18:
                                    iZzb = zzabu.zza(byteBuffer);
                                    break;
                                default:
                                    throw new IllegalStateException(k.d(i15, "Unexpected audio encoding: "));
                            }
                            z4 = true;
                            break;
                    }
                } else if (byteBuffer.getInt(0) == -233094848) {
                    if (byteBuffer.getInt(0) == -398277519) {
                        iZzb = 1024;
                    } else if (byteBuffer.getInt(0) != 622876772) {
                        iZzb = 4096;
                    } else {
                        iPosition = byteBuffer.position();
                        b7 = byteBuffer.get(iPosition);
                        if (b7 != -2) {
                            if (b7 != -1) {
                                if (b7 != 31) {
                                    i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                    i11 = byteBuffer.get(iPosition + 5) & 252;
                                    i9 = 2;
                                } else {
                                    i9 = 2;
                                    i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                    b8 = byteBuffer.get(iPosition + 6);
                                }
                                i8 = (i11 >> i9) | i10;
                                z4 = true;
                            } else {
                                i9 = 2;
                                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                b8 = byteBuffer.get(iPosition + 7);
                            }
                            i11 = b8 & 60;
                            i8 = (i11 >> i9) | i10;
                            z4 = true;
                        } else {
                            z4 = true;
                            i8 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                        }
                        iZzb = (i8 + (z4 ? 1 : 0)) * 32;
                    }
                    z4 = true;
                } else {
                    z4 = true;
                    iZzb = 1024;
                }
                this.zzF = iZzb;
                if (iZzb == 0) {
                    return z4;
                }
            }
            if (this.zzx != null) {
                if (!zzY()) {
                    return false;
                }
                zzO(j);
                this.zzx = null;
            }
            long jZzt = zzen.zzt(zzL() - this.zzf.zzo(), this.zzq.zza.zzF) + this.zzI;
            if (!this.zzG && Math.abs(jZzt - j) > 200000) {
                zzpu zzpuVar2 = this.zzo;
                if (zzpuVar2 != null) {
                    zzpuVar2.zza(new zzpv(j, jZzt));
                }
                this.zzG = true;
            }
            if (this.zzG) {
                if (!zzY()) {
                    return false;
                }
                long j3 = j - jZzt;
                this.zzI += j3;
                this.zzG = false;
                zzO(j);
                zzpu zzpuVar3 = this.zzo;
                if (zzpuVar3 != null && j3 != 0) {
                    ((zzrb) zzpuVar3).zza.zzao();
                }
            }
            if (this.zzq.zzc == 0) {
                this.zzB += (long) byteBuffer.remaining();
            } else {
                this.zzC = (((long) this.zzF) * ((long) i7)) + this.zzC;
            }
            this.zzK = byteBuffer;
            this.zzL = i7;
        }
        zzT(j);
        if (!this.zzK.hasRemaining()) {
            this.zzK = null;
            this.zzL = 0;
            return true;
        }
        if (!this.zzi.zzi(zzM())) {
            return false;
        }
        zzdq.zzf("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final boolean zzy() {
        if (zzZ()) {
            return !(zzen.zza >= 29 && this.zzs.isOffloadedPlayback() && this.zzP) && this.zzi.zzg(zzM());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final boolean zzz() {
        if (zzZ()) {
            return this.zzN && !zzy();
        }
        return true;
    }
}
