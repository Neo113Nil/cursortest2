package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zztn implements zzso {
    private final MediaCodec zza;
    private final zzsk zzb;

    public /* synthetic */ zztn(MediaCodec mediaCodec, zzsk zzskVar, zztm zztmVar) {
        this.zza = mediaCodec;
        this.zzb = zzskVar;
        if (zzen.zza < 35 || zzskVar == null) {
            return;
        }
        zzskVar.zza(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final ByteBuffer zzf(int i7) {
        return this.zza.getInputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final ByteBuffer zzg(int i7) {
        return this.zza.getOutputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzk(int i7, int i8, int i9, long j, int i10) {
        this.zza.queueInputBuffer(i7, 0, i9, j, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzl(int i7, int i8, zzhd zzhdVar, long j, int i9) {
        this.zza.queueSecureInputBuffer(i7, 0, zzhdVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzm() {
        zzsk zzskVar;
        zzsk zzskVar2;
        try {
            int i7 = zzen.zza;
            if (i7 >= 30 && i7 < 33) {
                this.zza.stop();
            }
            if (i7 >= 35 && (zzskVar2 = this.zzb) != null) {
                zzskVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (zzen.zza >= 35 && (zzskVar = this.zzb) != null) {
                zzskVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzn(int i7, long j) {
        this.zza.releaseOutputBuffer(i7, j);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzo(int i7, boolean z4) {
        this.zza.releaseOutputBuffer(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzq(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzr(int i7) {
        this.zza.setVideoScalingMode(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final /* synthetic */ boolean zzs(zzsn zzsnVar) {
        return false;
    }
}
