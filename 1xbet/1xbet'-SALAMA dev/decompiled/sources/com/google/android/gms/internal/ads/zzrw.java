package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class zzrw implements zzsm {
    private final zzftz zza;
    private final zzftz zzb;

    public zzrw(int i7) {
        zzru zzruVar = new zzru(i7);
        zzrv zzrvVar = new zzrv(i7);
        this.zza = zzruVar;
        this.zzb = zzrvVar;
    }

    public static /* synthetic */ HandlerThread zza(int i7) {
        return new HandlerThread(zzry.zzt(i7, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    public static /* synthetic */ HandlerThread zzb(int i7) {
        return new HandlerThread(zzry.zzt(i7, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    public final zzry zzc(zzsl zzslVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = zzslVar.zza.zza;
        zzry zzryVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zzry zzryVar2 = new zzry(mediaCodecCreateByCodecName, zza(((zzru) this.zza).zza), new zzsc(mediaCodecCreateByCodecName, zzb(((zzrv) this.zzb).zza)), zzslVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzslVar.zzd;
                    int i7 = 0;
                    if (surface == null && zzslVar.zza.zzh && zzen.zza >= 35) {
                        i7 = 8;
                    }
                    zzry.zzh(zzryVar2, zzslVar.zzb, surface, null, i7);
                    return zzryVar2;
                } catch (Exception e7) {
                    e = e7;
                    zzryVar = zzryVar2;
                    if (zzryVar != null) {
                        zzryVar.zzm();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final /* bridge */ /* synthetic */ zzso zzd(zzsl zzslVar) {
        throw null;
    }
}
