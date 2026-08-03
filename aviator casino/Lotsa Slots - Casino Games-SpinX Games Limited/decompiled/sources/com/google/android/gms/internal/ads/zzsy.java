package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzsy implements com.google.android.gms.internal.ads.zzqv {
    private static final java.lang.Object zza = new java.lang.Object();
    private static java.util.concurrent.ScheduledExecutorService zzb;
    private static int zzc;
    private final android.media.AudioTrack zzd;
    private final com.google.android.gms.internal.ads.zzre zze;
    private final float zzf;
    private com.google.android.gms.internal.ads.zzsp zzg;
    private final com.google.android.gms.internal.ads.zztf zzh;
    private final boolean zzi;
    private final int zzj;
    private final com.google.android.gms.internal.ads.zzsx zzk;
    private final com.google.android.gms.internal.ads.zzef zzl = new com.google.android.gms.internal.ads.zzef(java.lang.Thread.currentThread());
    private boolean zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private final com.google.android.gms.internal.ads.zztc zzs;

    /* JADX WARN: Multi-variable type inference failed */
    public zzsy(android.media.AudioTrack audioTrack, com.google.android.gms.internal.ads.zzre zzreVar, com.google.android.gms.internal.ads.zztc zztcVar, float f, com.google.android.gms.internal.ads.zzdo zzdoVar) {
        this.zzd = audioTrack;
        this.zze = zzreVar;
        this.zzf = f;
        this.zzs = zztcVar;
        boolean zzD = com.google.android.gms.internal.ads.zzfl.zzD(zzreVar.zza);
        this.zzi = zzD;
        if (zzD) {
            this.zzj = com.google.android.gms.internal.ads.zzfl.zzG(zzreVar.zza) * java.lang.Integer.bitCount(zzreVar.zzc);
        } else {
            this.zzj = -1;
        }
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        this.zzh = new com.google.android.gms.internal.ads.zztf(new com.google.android.gms.internal.ads.zzsr(this, null), zzdoVar, audioTrack, zzreVar.zza, this.zzj, zzreVar.zze);
        if (android.os.Build.VERSION.SDK_INT >= 24 && zztcVar != null) {
            this.zzg = new com.google.android.gms.internal.ads.zzsp(audioTrack, zztcVar, objArr2 == true ? 1 : 0);
        }
        this.zzk = zzg() ? new com.google.android.gms.internal.ads.zzsx(this, objArr == true ? 1 : 0) : null;
    }

    static /* synthetic */ void zzp(android.media.AudioTrack audioTrack, android.os.Handler handler, final com.google.android.gms.internal.ads.zzef zzefVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzsj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzsy.zzw(com.google.android.gms.internal.ads.zzef.this);
                    }
                });
            }
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorService = zzb;
                    scheduledExecutorService.getClass();
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                    scheduledExecutorService.shutdown();
                    zzb = null;
                }
            }
        } catch (java.lang.Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzsk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzsy.zzw(com.google.android.gms.internal.ads.zzef.this);
                    }
                });
            }
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorService3 = zzb;
                    scheduledExecutorService3.getClass();
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = scheduledExecutorService3;
                    scheduledExecutorService3.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final long zzs() {
        if (!this.zzi) {
            return this.zzo;
        }
        long j = this.zzn;
        int i = this.zzj;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return ((j + r2) - 1) / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzw(com.google.android.gms.internal.ads.zzef zzefVar) {
        if (zzefVar.zzb()) {
            zzefVar.zze(-1, com.google.android.gms.internal.ads.zzsh.zza);
            zzefVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zza() {
        this.zzh.zzb();
        if (!this.zzm || zzg()) {
            this.zzd.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzb() {
        this.zzh.zzf();
        if (!this.zzm || zzg()) {
            this.zzd.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final boolean zzc(java.nio.ByteBuffer byteBuffer, int i, long j) throws com.google.android.gms.internal.ads.zzqu {
        boolean z;
        com.google.android.gms.internal.ads.zztc zztcVar;
        int i2;
        boolean z2 = this.zzi;
        if (!z2 && this.zzp == 0) {
            this.zzp = com.google.android.gms.internal.ads.zztr.zzE(this.zze.zza, byteBuffer);
        }
        com.google.android.gms.internal.ads.zzef zzefVar = this.zzl;
        if (zzefVar.zzb()) {
            long zzs = zzs();
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                i2 = this.zzd.getUnderrunCount();
            } else {
                boolean z3 = this.zzr;
                com.google.android.gms.internal.ads.zztf zztfVar = this.zzh;
                android.media.AudioTrack audioTrack = this.zzd;
                boolean z4 = zzs > com.google.android.gms.internal.ads.zzfl.zzu(zztfVar.zza(), audioTrack.getSampleRate());
                this.zzr = z4;
                i2 = (!z3 || z4 || audioTrack.getPlayState() == 1) ? this.zzq : this.zzq + 1;
            }
            int i3 = this.zzq;
            this.zzq = i2;
            if (i2 > i3) {
                zzefVar.zze(-1, com.google.android.gms.internal.ads.zzsi.zza);
                zzefVar.zzf();
            }
        }
        int remaining = byteBuffer.remaining();
        int write = this.zzd.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write >= 0) {
            z = write == remaining;
            if (z2) {
                this.zzn += write;
            } else if (z) {
                this.zzo += this.zzp * i;
            }
            return z;
        }
        z = (android.os.Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32;
        if (z && (zztcVar = this.zzs) != null) {
            com.google.android.gms.internal.ads.zztd zztdVar = zztcVar.zza;
            if (zztdVar.zzj() != null) {
                com.google.android.gms.internal.ads.zzqh zzqhVar = com.google.android.gms.internal.ads.zzqh.zza;
                zztdVar.zzi(zzqhVar);
                zztdVar.zzj().zza(zzqhVar);
            }
        }
        throw new com.google.android.gms.internal.ads.zzqu(write, z);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzd() {
        if (this.zzm) {
            return;
        }
        this.zzm = true;
        this.zzh.zze(zzs());
        this.zzd.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zze() {
        com.google.android.gms.internal.ads.zzsp zzspVar;
        if (this.zzh.zzc()) {
            this.zzd.pause();
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && zzg()) {
            com.google.android.gms.internal.ads.zzsx zzsxVar = this.zzk;
            zzsxVar.getClass();
            zzsxVar.zza();
        }
        if (android.os.Build.VERSION.SDK_INT >= 24 && (zzspVar = this.zzg) != null) {
            zzspVar.zzd();
            this.zzg = null;
        }
        final android.media.AudioTrack audioTrack = this.zzd;
        final com.google.android.gms.internal.ads.zzef zzefVar = this.zzl;
        final android.os.Handler zzd = com.google.android.gms.internal.ads.zzfl.zzd(null);
        synchronized (zza) {
            if (zzb == null) {
                zzb = com.google.android.gms.internal.ads.zzfl.zzh("ExoPlayer:AudioTrackReleaseThread");
            }
            zzc++;
            zzb.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzsl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzsy.zzp(audioTrack, zzd, zzefVar);
                }
            }, 20L, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzf(float f) {
        this.zzd.setVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final boolean zzg() {
        return android.os.Build.VERSION.SDK_INT >= 29 && this.zzd.isOffloadedPlayback();
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final int zzh() {
        return this.zzd.getAudioSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final int zzi() {
        return this.zzd.getSampleRate();
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final long zzj() {
        return this.zzd.getBufferSizeInFrames();
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final long zzk() {
        return this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final boolean zzl() {
        return this.zzh.zzd(zzs());
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzm(com.google.android.gms.internal.ads.zzqt zzqtVar) {
        this.zzl.zzc(zzqtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzn(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        android.media.metrics.LogSessionId zza2 = zzqfVar.zza();
        if (zza2.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.zzd.setLogSessionId(zza2);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzo(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.zzd.setPreferredDevice(audioDeviceInfo);
    }

    final /* synthetic */ android.media.AudioTrack zzt() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzef zzu() {
        return this.zzl;
    }
}
