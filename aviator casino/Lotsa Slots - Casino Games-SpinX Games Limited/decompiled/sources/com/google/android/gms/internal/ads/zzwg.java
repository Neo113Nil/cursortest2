package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzwg implements com.google.android.gms.internal.ads.zzvj {
    private final android.media.MediaCodec zza;
    private final com.google.android.gms.internal.ads.zzvf zzb;

    /* synthetic */ zzwg(android.media.MediaCodec mediaCodec, com.google.android.gms.internal.ads.zzvf zzvfVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzvfVar;
        if (android.os.Build.VERSION.SDK_INT < 35 || zzvfVar == null) {
            return;
        }
        zzvfVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zza(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzb(int i, int i2, com.google.android.gms.internal.ads.zzis zzisVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzisVar.zzb(), j, i3);
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
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zzf(android.media.MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final android.media.MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final java.nio.ByteBuffer zzh(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public /* synthetic */ void zzi(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final java.nio.ByteBuffer zzj(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzl() {
        com.google.android.gms.internal.ads.zzvf zzvfVar;
        com.google.android.gms.internal.ads.zzvf zzvfVar2;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 30 && android.os.Build.VERSION.SDK_INT < 33) {
                this.zza.stop();
            }
            if (android.os.Build.VERSION.SDK_INT >= 35 && (zzvfVar2 = this.zzb) != null) {
                zzvfVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (java.lang.Throwable th) {
            if (android.os.Build.VERSION.SDK_INT >= 35 && (zzvfVar = this.zzb) != null) {
                zzvfVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzvi zzviVar) {
        return com.google.android.gms.internal.ads.zzvj.CC.$default$zzm(this, zzviVar);
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
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzr(java.util.List list) {
        this.zza.subscribeToVendorParameters(list);
    }
}
