package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzry implements zzso {
    private final MediaCodec zza;
    private final zzse zzb;
    private final zzsp zzc;
    private final zzsk zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zzry(MediaCodec mediaCodec, HandlerThread handlerThread, zzsp zzspVar, zzsk zzskVar, zzrx zzrxVar) {
        this.zza = mediaCodec;
        this.zzb = new zzse(handlerThread);
        this.zzc = zzspVar;
        this.zzd = zzskVar;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzry zzryVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        zzsk zzskVar;
        zzryVar.zzb.zzf(zzryVar.zza);
        Trace.beginSection("configureCodec");
        zzryVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, i7);
        Trace.endSection();
        zzryVar.zzc.zzh();
        Trace.beginSection("startCodec");
        zzryVar.zza.start();
        Trace.endSection();
        if (zzen.zza >= 35 && (zzskVar = zzryVar.zzd) != null) {
            zzskVar.zza(zzryVar.zza);
        }
        zzryVar.zzf = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i7, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            sb.append("Audio");
        } else if (i7 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final MediaFormat zzc() {
        return this.zzb.zzc();
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
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzk(int i7, int i8, int i9, long j, int i10) {
        this.zzc.zzd(i7, 0, i9, j, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzl(int i7, int i8, zzhd zzhdVar, long j, int i9) {
        this.zzc.zze(i7, 0, zzhdVar, j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzm() {
        zzsk zzskVar;
        zzsk zzskVar2;
        zzsk zzskVar3;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzg();
                    this.zzb.zzh();
                }
                this.zzf = 2;
                if (this.zze) {
                    return;
                }
                int i7 = zzen.zza;
                if (i7 >= 30 && i7 < 33) {
                    this.zza.stop();
                }
                if (i7 >= 35 && (zzskVar3 = this.zzd) != null) {
                    zzskVar3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            } catch (Throwable th) {
                if (!this.zze) {
                    int i8 = zzen.zza;
                    if (i8 >= 30 && i8 < 33) {
                        this.zza.stop();
                    }
                    if (i8 >= 35 && (zzskVar2 = this.zzd) != null) {
                        zzskVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (zzen.zza >= 35 && (zzskVar = this.zzd) != null) {
                zzskVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th2;
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
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzr(int i7) {
        this.zza.setVideoScalingMode(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final boolean zzs(zzsn zzsnVar) {
        this.zzb.zzg(zzsnVar);
        return true;
    }
}
