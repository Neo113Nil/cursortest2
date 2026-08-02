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
import e1.k;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import w1.L;

/* loaded from: classes.dex */
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
        Context context;
        zzqn zzqnVar;
        zzqd zzqdVar;
        context = zzqlVar.zza;
        this.zzd = context;
        this.zzw = zze.zza;
        zzqw zzqwVar2 = null;
        this.zzt = context != null ? null : zzqlVar.zzb;
        zzqnVar = zzqlVar.zzf;
        this.zzab = zzqnVar;
        int i7 = zzen.zza;
        zzqdVar = zzqlVar.zzg;
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
                        zzpp zzppVar;
                        zzppVar = ((zzrb) zzpu.this).zza.zzc;
                        zzppVar.zzp(zzprVar);
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
                } finally {
                }
            }
        } catch (Throwable th) {
            if (zzpuVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpp zzppVar;
                        zzppVar = ((zzrb) zzpu.this).zza.zzc;
                        zzppVar.zzp(zzprVar);
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
                    throw th;
                } finally {
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
        return this.zzq.zzc == 0 ? this.zzB / r0.zzb : this.zzC;
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

    private final AudioTrack zzN(zzqm zzqmVar) {
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
        zzpp zzppVar;
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
            boolean z7 = this.zzA;
            zzppVar = ((zzrb) zzpuVar).zza.zzc;
            zzppVar.zzw(z7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzP(long j) {
        zzpu zzpuVar;
        zzpw zzpwVar;
        zzpu zzpuVar2;
        if (this.zzM == null || this.zzm.zzc()) {
            return;
        }
        int remaining = this.zzM.remaining();
        int write = this.zzs.write(this.zzM, remaining, 1);
        this.zzU = SystemClock.elapsedRealtime();
        if (write >= 0) {
            this.zzm.zza();
            if (zzaa(this.zzs)) {
                if (this.zzE > 0) {
                    this.zzW = false;
                }
                if (this.zzQ && (zzpuVar = this.zzo) != null && write < remaining) {
                }
            }
            int i7 = this.zzq.zzc;
            if (i7 == 0) {
                this.zzD += write;
            }
            if (write == remaining) {
                if (i7 != 0) {
                    zzcv.zzf(this.zzM == this.zzK);
                    this.zzE = (this.zzF * this.zzL) + this.zzE;
                }
                this.zzM = null;
                return;
            }
            return;
        }
        if ((zzen.zza >= 24 && write == -6) || write == -32) {
            if (zzM() <= 0) {
                if (zzaa(this.zzs)) {
                    zzQ();
                }
            }
            zzpwVar = new zzpw(write, this.zzq.zza, r1);
            zzpuVar2 = this.zzo;
            if (zzpuVar2 != null) {
                zzpuVar2.zza(zzpwVar);
            }
            if (zzpwVar.zzb) {
                this.zzm.zzb(zzpwVar);
                return;
            } else {
                this.zzt = zzot.zza;
                throw zzpwVar;
            }
        }
        r1 = false;
        zzpwVar = new zzpw(write, this.zzq.zza, r1);
        zzpuVar2 = this.zzo;
        if (zzpuVar2 != null) {
        }
        if (zzpwVar.zzb) {
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

    private final void zzT(long j) {
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
                ByteBuffer zzb2 = this.zzr.zzb();
                if (zzb2.hasRemaining()) {
                    zzV(zzb2);
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

    /* JADX WARN: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzV(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i7;
        int i8;
        int i9;
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zzcv.zzf(this.zzM == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzq.zzc == 0) {
                int zzp = (int) zzen.zzp(zzen.zzs(20L), this.zzq.zze);
                long zzM = zzM();
                long j = zzp;
                if (zzM < j) {
                    zzqm zzqmVar = this.zzq;
                    int i17 = zzqmVar.zzg;
                    int i18 = zzqmVar.zzd;
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i19 = (int) zzM;
                    while (byteBuffer.hasRemaining() && i19 < zzp) {
                        if (i17 != 2) {
                            if (i17 == 3) {
                                i9 = (byteBuffer.get() & 255) << 24;
                            } else if (i17 != 4) {
                                if (i17 != 21) {
                                    if (i17 == 22) {
                                        i13 = byteBuffer.get() & 255;
                                        i14 = (byteBuffer.get() & 255) << 8;
                                        i15 = (byteBuffer.get() & 255) << 16;
                                        i16 = (byteBuffer.get() & 255) << 24;
                                    } else if (i17 == 268435456) {
                                        i7 = (byteBuffer.get() & 255) << 24;
                                        i8 = (byteBuffer.get() & 255) << 16;
                                    } else if (i17 == 1342177280) {
                                        i10 = (byteBuffer.get() & 255) << 24;
                                        i11 = (byteBuffer.get() & 255) << 16;
                                        i12 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i17 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i13 = (byteBuffer.get() & 255) << 24;
                                        i14 = (byteBuffer.get() & 255) << 16;
                                        i15 = (byteBuffer.get() & 255) << 8;
                                        i16 = byteBuffer.get() & 255;
                                    }
                                    i9 = i13 | i14 | i15 | i16;
                                } else {
                                    i10 = (byteBuffer.get() & 255) << 8;
                                    i11 = (byteBuffer.get() & 255) << 16;
                                    i12 = (byteBuffer.get() & 255) << 24;
                                }
                                i9 = i10 | i11 | i12;
                            } else {
                                float max = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                if (max < 0.0f) {
                                    max = -max;
                                    f7 = -2.1474836E9f;
                                } else {
                                    f7 = 2.1474836E9f;
                                }
                                i9 = (int) (max * f7);
                            }
                            int i20 = (int) ((i9 * i19) / j);
                            if (i17 != 2) {
                                order.put((byte) (i20 >> 16));
                                order.put((byte) (i20 >> 24));
                            } else if (i17 == 3) {
                                order.put((byte) (i20 >> 24));
                            } else if (i17 != 4) {
                                if (i17 == 21) {
                                    order.put((byte) (i20 >> 8));
                                    order.put((byte) (i20 >> 16));
                                    order.put((byte) (i20 >> 24));
                                } else if (i17 == 22) {
                                    order.put((byte) i20);
                                    order.put((byte) (i20 >> 8));
                                    order.put((byte) (i20 >> 16));
                                    order.put((byte) (i20 >> 24));
                                } else if (i17 == 268435456) {
                                    order.put((byte) (i20 >> 24));
                                    order.put((byte) (i20 >> 16));
                                } else if (i17 == 1342177280) {
                                    order.put((byte) (i20 >> 24));
                                    order.put((byte) (i20 >> 16));
                                    order.put((byte) (i20 >> 8));
                                } else {
                                    if (i17 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    order.put((byte) (i20 >> 24));
                                    order.put((byte) (i20 >> 16));
                                    order.put((byte) (i20 >> 8));
                                    order.put((byte) i20);
                                }
                            } else if (i20 < 0) {
                                order.putFloat((-i20) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i20 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i18) {
                                i19++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i7 = (byteBuffer.get() & 255) << 16;
                            i8 = (byteBuffer.get() & 255) << 24;
                        }
                        i9 = i7 | i8;
                        int i202 = (int) ((i9 * i19) / j);
                        if (i17 != 2) {
                        }
                        if (byteBuffer.position() != position + i18) {
                        }
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.zzM = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
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

    private final boolean zzY() {
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
        boolean isOffloadedPlayback;
        if (zzen.zza < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    private final boolean zzab() {
        zzqm zzqmVar = this.zzq;
        if (zzqmVar.zzc != 0) {
            return false;
        }
        int i7 = zzqmVar.zza.zzG;
        return true;
    }

    private static final AudioTrack zzac(zzpr zzprVar, zze zzeVar, int i7, zzz zzzVar) {
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzeVar.zza().zza).setAudioFormat(zzen.zzx(zzprVar.zzb, zzprVar.zzc, zzprVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzprVar.zze).setSessionId(i7);
            if (zzen.zza >= 29) {
                sessionId.setOffloadedPlayback(zzprVar.zzd);
            }
            AudioTrack build = sessionId.build();
            int state = build.getState();
            if (state == 1) {
                return build;
            }
            try {
                build.release();
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
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzX;
        if (looper != myLooper) {
            throw new IllegalStateException(L.j("Current looper (", myLooper != null ? myLooper.getThread().getName() : "null", ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
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
        long min = Math.min(this.zzi.zza(z4), zzen.zzt(zzM(), this.zzq.zze));
        while (!this.zzj.isEmpty() && min >= ((zzqo) this.zzj.getFirst()).zzc) {
            this.zzy = (zzqo) this.zzj.remove();
        }
        zzqo zzqoVar = this.zzy;
        long j3 = min - zzqoVar.zzc;
        long zzq = zzen.zzq(j3, zzqoVar.zza.zzb);
        if (this.zzj.isEmpty()) {
            long zza2 = this.zzab.zza(j3);
            zzqo zzqoVar2 = this.zzy;
            j = zzqoVar2.zzb + zza2;
            zzqoVar2.zzd = zza2 - zzq;
        } else {
            zzqo zzqoVar3 = this.zzy;
            j = zzqoVar3.zzb + zzq + zzqoVar3.zzd;
        }
        long zzb2 = this.zzab.zzb();
        long zzt = zzen.zzt(zzb2, this.zzq.zze) + j;
        long j7 = this.zzY;
        if (zzb2 > j7) {
            long zzt2 = zzen.zzt(zzb2 - j7, this.zzq.zze);
            this.zzY = zzb2;
            this.zzZ += zzt2;
            if (this.zzaa == null) {
                this.zzaa = new Handler(Looper.myLooper());
            }
            this.zzaa.removeCallbacksAndMessages(null);
            this.zzaa.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqf
                @Override // java.lang.Runnable
                public final void run() {
                    zzqx.zzG(zzqx.this);
                }
            }, 100L);
        }
        return zzt;
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
    public final void zze(zzz zzzVar, int i7, int[] iArr) {
        int intValue;
        zzcd zzcdVar;
        int i8;
        int intValue2;
        int i9;
        int i10;
        int i11;
        int i12;
        int max;
        zzR();
        if ("audio/raw".equals(zzzVar.zzo)) {
            zzcv.zzd(zzen.zzK(zzzVar.zzG));
            i8 = zzen.zzk(zzzVar.zzG) * zzzVar.zzE;
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
                zzce zza2 = zzcdVar2.zza(new zzce(zzzVar.zzF, zzzVar.zzE, zzzVar.zzG));
                intValue = zza2.zzd;
                i10 = zza2.zzb;
                int i13 = zza2.zzc;
                intValue2 = zzen.zzi(i13);
                zzcdVar = zzcdVar2;
                i9 = zzen.zzk(intValue) * i13;
                i11 = 0;
            } catch (zzcf e7) {
                throw new zzps(e7, zzzVar);
            }
        } else {
            zzcd zzcdVar3 = new zzcd(zzfwh.zzn());
            int i14 = zzzVar.zzF;
            zzpc zzpcVar = zzpc.zza;
            Pair zzb2 = this.zzt.zzb(zzzVar, this.zzw);
            if (zzb2 == null) {
                throw new zzps("Unable to configure passthrough for: ".concat(String.valueOf(zzzVar)), zzzVar);
            }
            intValue = ((Integer) zzb2.first).intValue();
            zzcdVar = zzcdVar3;
            i8 = -1;
            intValue2 = ((Integer) zzb2.second).intValue();
            i9 = -1;
            i10 = i14;
            i11 = 2;
        }
        if (intValue == 0) {
            throw new zzps("Invalid output encoding (mode=" + i11 + ") for: " + String.valueOf(zzzVar), zzzVar);
        }
        if (intValue2 == 0) {
            throw new zzps("Invalid output channel config (mode=" + i11 + ") for: " + String.valueOf(zzzVar), zzzVar);
        }
        int i15 = zzzVar.zzj;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzzVar.zzo) && i15 == -1) {
            i15 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i10, intValue2, intValue);
        zzcv.zzf(minBufferSize != -2);
        int i16 = i9 != -1 ? i9 : 1;
        int i17 = 250000;
        if (i11 == 0) {
            i12 = i11;
            int zza3 = zzqz.zza(250000, i10, i16);
            int zza4 = zzqz.zza(750000, i10, i16);
            int i18 = zzen.zza;
            max = Math.max(zza3, Math.min(minBufferSize * 4, zza4));
        } else if (i11 != 1) {
            if (intValue == 5) {
                i17 = 500000;
            } else if (intValue == 8) {
                i17 = 1000000;
                intValue = 8;
            }
            i12 = i11;
            max = zzfzk.zzb((i17 * (i15 != -1 ? zzfzd.zzb(i15, 8, RoundingMode.CEILING) : zzqz.zzb(intValue))) / 1000000);
        } else {
            i12 = i11;
            max = zzfzk.zzb((zzqz.zzb(intValue) * 50000000) / 1000000);
        }
        int i19 = intValue;
        this.zzV = false;
        zzqm zzqmVar = new zzqm(zzzVar, i8, i12, i9, i10, intValue2, i19, (((Math.max(minBufferSize, max) + i16) - 1) / i16) * i16, zzcdVar, false, false, false);
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
            final zzpr zza2 = this.zzq.zza();
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
                            zzqx.zzI(audioTrack, zzpuVar, handler, zza2);
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0257  */
    @Override // com.google.android.gms.internal.ads.zzpx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzx(ByteBuffer byteBuffer, long j, int i7) {
        AudioTrack zzN;
        zzpp zzppVar;
        zzoy zzoyVar;
        zzor zzorVar;
        LogSessionId logSessionId;
        boolean equals;
        zzqm zzqmVar;
        boolean z4;
        int zzb2;
        int i8;
        int i9;
        int i10;
        byte b7;
        int i11;
        int i12;
        ByteBuffer byteBuffer2 = this.zzK;
        zzcv.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzp != null) {
            if (!zzY()) {
                return false;
            }
            zzqm zzqmVar2 = this.zzp;
            zzqm zzqmVar3 = this.zzq;
            if (zzqmVar3.zzc == zzqmVar2.zzc && zzqmVar3.zzg == zzqmVar2.zzg && zzqmVar3.zze == zzqmVar2.zze && zzqmVar3.zzf == zzqmVar2.zzf && zzqmVar3.zzd == zzqmVar2.zzd) {
                this.zzq = zzqmVar2;
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
                    zzqmVar = this.zzq;
                } catch (zzpt e7) {
                    zzqm zzqmVar4 = this.zzq;
                    if (zzqmVar4.zzh > 1000000) {
                        zzqm zzqmVar5 = new zzqm(zzqmVar4.zza, zzqmVar4.zzb, zzqmVar4.zzc, zzqmVar4.zzd, zzqmVar4.zze, zzqmVar4.zzf, zzqmVar4.zzg, 1000000, zzqmVar4.zzi, false, false, false);
                        try {
                            zzN = zzN(zzqmVar5);
                            this.zzq = zzqmVar5;
                        } catch (zzpt e8) {
                            e7.addSuppressed(e8);
                            zzQ();
                            throw e7;
                        }
                    }
                    zzQ();
                    throw e7;
                }
                if (zzqmVar == null) {
                    throw null;
                }
                zzN = zzN(zzqmVar);
                this.zzs = zzN;
                if (zzaa(zzN)) {
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
                    LogSessionId zza2 = zzorVar.zza();
                    logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                    equals = zza2.equals(logSessionId);
                    if (!equals) {
                        audioTrack3.setLogSessionId(zza2);
                    }
                }
                this.zzR = this.zzs.getAudioSessionId();
                zzqb zzqbVar = this.zzi;
                AudioTrack audioTrack4 = this.zzs;
                zzqm zzqmVar6 = this.zzq;
                zzqbVar.zzd(audioTrack4, zzqmVar6.zzc == 2, zzqmVar6.zzg, zzqmVar6.zzd, zzqmVar6.zzh);
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
                    zzpr zza3 = this.zzq.zza();
                    zzppVar = ((zzrb) zzpuVar).zza.zzc;
                    zzppVar.zzo(zza3);
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
                if (i15 != 20) {
                    if (i15 != 30) {
                        switch (i15) {
                            case 5:
                            case 6:
                                zzb2 = zzabu.zza(byteBuffer);
                                z4 = true;
                                break;
                            case 7:
                            case 8:
                                break;
                            case 9:
                                zzb2 = zzado.zzc(zzen.zzj(byteBuffer, byteBuffer.position()));
                                if (zzb2 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                z4 = true;
                                break;
                            case 10:
                                zzb2 = 1024;
                                z4 = true;
                                break;
                            case 11:
                            case 12:
                                zzb2 = 2048;
                                z4 = true;
                                break;
                            default:
                                switch (i15) {
                                    case 14:
                                        int position = byteBuffer.position();
                                        int limit = byteBuffer.limit() - 10;
                                        int i16 = position;
                                        while (true) {
                                            if (i16 > limit) {
                                                i12 = -1;
                                            } else if ((zzen.zzj(byteBuffer, i16 + 4) & (-2)) == -126718022) {
                                                i12 = i16 - position;
                                            } else {
                                                i16++;
                                            }
                                        }
                                        if (i12 != -1) {
                                            zzb2 = (40 << ((byteBuffer.get((byteBuffer.position() + i12) + ((byteBuffer.get((byteBuffer.position() + i12) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                            break;
                                        } else {
                                            zzb2 = 0;
                                            break;
                                        }
                                    case 15:
                                        zzb2 = 512;
                                        break;
                                    case 16:
                                        break;
                                    case 17:
                                        byte[] bArr = new byte[16];
                                        int position2 = byteBuffer.position();
                                        byteBuffer.get(bArr);
                                        byteBuffer.position(position2);
                                        zzb2 = zzaby.zzb(new zzec(bArr, 16)).zzc;
                                        break;
                                    case 18:
                                        break;
                                    default:
                                        throw new IllegalStateException(k.d(i15, "Unexpected audio encoding: "));
                                }
                                z4 = true;
                                break;
                        }
                    }
                    if (byteBuffer.getInt(0) != -233094848) {
                        if (byteBuffer.getInt(0) != -398277519) {
                            if (byteBuffer.getInt(0) == 622876772) {
                                zzb2 = 4096;
                                z4 = true;
                            } else {
                                int position3 = byteBuffer.position();
                                byte b8 = byteBuffer.get(position3);
                                if (b8 != -2) {
                                    if (b8 == -1) {
                                        i9 = 2;
                                        i10 = (byteBuffer.get(position3 + 4) & 7) << 4;
                                        b7 = byteBuffer.get(position3 + 7);
                                    } else if (b8 != 31) {
                                        i10 = (byteBuffer.get(position3 + 4) & 1) << 6;
                                        i11 = byteBuffer.get(position3 + 5) & 252;
                                        i9 = 2;
                                        i8 = (i11 >> i9) | i10;
                                        z4 = true;
                                    } else {
                                        i9 = 2;
                                        i10 = (byteBuffer.get(position3 + 5) & 7) << 4;
                                        b7 = byteBuffer.get(position3 + 6);
                                    }
                                    i11 = b7 & 60;
                                    i8 = (i11 >> i9) | i10;
                                    z4 = true;
                                } else {
                                    z4 = true;
                                    i8 = ((byteBuffer.get(position3 + 5) & 1) << 6) | ((byteBuffer.get(position3 + 4) & 252) >> 2);
                                }
                                zzb2 = (i8 + (z4 ? 1 : 0)) * 32;
                            }
                        }
                        zzb2 = 1024;
                        z4 = true;
                    } else {
                        z4 = true;
                        zzb2 = 1024;
                    }
                } else {
                    z4 = true;
                    zzb2 = zzadq.zzb(byteBuffer);
                }
                this.zzF = zzb2;
                if (zzb2 == 0) {
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
            long zzt = zzen.zzt(zzL() - this.zzf.zzo(), this.zzq.zza.zzF) + this.zzI;
            if (!this.zzG && Math.abs(zzt - j) > 200000) {
                zzpu zzpuVar2 = this.zzo;
                if (zzpuVar2 != null) {
                    zzpuVar2.zza(new zzpv(j, zzt));
                }
                this.zzG = true;
            }
            if (this.zzG) {
                if (!zzY()) {
                    return false;
                }
                long j3 = j - zzt;
                this.zzI += j3;
                this.zzG = false;
                zzO(j);
                zzpu zzpuVar3 = this.zzo;
                if (zzpuVar3 != null && j3 != 0) {
                    ((zzrb) zzpuVar3).zza.zzao();
                }
            }
            if (this.zzq.zzc == 0) {
                this.zzB += byteBuffer.remaining();
            } else {
                this.zzC = (this.zzF * i7) + this.zzC;
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
        boolean isOffloadedPlayback;
        if (!zzZ()) {
            return false;
        }
        if (zzen.zza >= 29) {
            isOffloadedPlayback = this.zzs.isOffloadedPlayback();
            if (isOffloadedPlayback && this.zzP) {
                return false;
            }
        }
        return this.zzi.zzg(zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final boolean zzz() {
        if (zzZ()) {
            return this.zzN && !zzy();
        }
        return true;
    }
}
