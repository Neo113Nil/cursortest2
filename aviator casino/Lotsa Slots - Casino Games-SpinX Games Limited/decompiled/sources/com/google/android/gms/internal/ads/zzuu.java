package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzuu implements com.google.android.gms.internal.ads.zzvj {
    private final android.media.MediaCodec zza;
    private final com.google.android.gms.internal.ads.zzuz zzb;
    private final com.google.android.gms.internal.ads.zzvk zzc;
    private final com.google.android.gms.internal.ads.zzvf zzd;
    private boolean zze;
    private int zzf = 0;

    /* synthetic */ zzuu(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, com.google.android.gms.internal.ads.zzvk zzvkVar, com.google.android.gms.internal.ads.zzvf zzvfVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = new com.google.android.gms.internal.ads.zzuz(handlerThread);
        this.zzc = zzvkVar;
        this.zzd = zzvfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String zzw(int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zza(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzb(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzb(int i, int i2, com.google.android.gms.internal.ads.zzis zzisVar, long j, int i3) {
        this.zzc.zzc(i, 0, zzisVar, j, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzc(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzd(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zze() {
        this.zzc.zzg();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zzf(android.media.MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzg();
        return this.zzb.zze(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final android.media.MediaFormat zzg() {
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final java.nio.ByteBuffer zzh(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzi(final java.lang.Runnable runnable) {
        this.zzb.zzc(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzuq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzuu.this.zzs(runnable);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final java.nio.ByteBuffer zzj(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzk() {
        this.zzc.zze();
        android.media.MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zzg();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzl() {
        com.google.android.gms.internal.ads.zzvf zzvfVar;
        com.google.android.gms.internal.ads.zzvf zzvfVar2;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzf();
                    this.zzb.zzb();
                }
                this.zzf = 2;
            } finally {
                if (!this.zze) {
                    if (android.os.Build.VERSION.SDK_INT >= 30 && android.os.Build.VERSION.SDK_INT < 33) {
                        this.zza.stop();
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 35 && (zzvfVar2 = this.zzd) != null) {
                        zzvfVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
            }
        } catch (java.lang.Throwable th) {
            if (android.os.Build.VERSION.SDK_INT >= 35 && (zzvfVar = this.zzd) != null) {
                zzvfVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final boolean zzm(com.google.android.gms.internal.ads.zzvi zzviVar) {
        this.zzb.zzh(zzviVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzn(android.view.Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzp(android.os.Bundle bundle) {
        this.zzc.zzd(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzr(java.util.List list) {
        this.zza.subscribeToVendorParameters(list);
    }

    final /* synthetic */ void zzs(java.lang.Runnable runnable) {
        this.zzc.zzg();
        this.zzb.zzc(runnable);
    }

    final /* synthetic */ void zzt(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i) {
        com.google.android.gms.internal.ads.zzvf zzvfVar;
        com.google.android.gms.internal.ads.zzuz zzuzVar = this.zzb;
        android.media.MediaCodec mediaCodec = this.zza;
        zzuzVar.zza(mediaCodec);
        android.os.Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (android.media.MediaCrypto) null, i);
        android.os.Trace.endSection();
        this.zzc.zza();
        android.os.Trace.beginSection("startCodec");
        mediaCodec.start();
        android.os.Trace.endSection();
        if (android.os.Build.VERSION.SDK_INT >= 35 && (zzvfVar = this.zzd) != null) {
            zzvfVar.zzb(mediaCodec);
        }
        this.zzf = 1;
    }
}
