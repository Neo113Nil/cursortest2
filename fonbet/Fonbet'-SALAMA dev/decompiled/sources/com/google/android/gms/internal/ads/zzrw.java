package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* loaded from: classes.dex */
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
        String zzt;
        zzt = zzry.zzt(i7, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzt);
    }

    public static /* synthetic */ HandlerThread zzb(int i7) {
        String zzt;
        zzt = zzry.zzt(i7, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzt);
    }

    public final zzry zzc(zzsl zzslVar) {
        MediaCodec mediaCodec;
        zzry zzryVar;
        String str = zzslVar.zza.zza;
        zzry zzryVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzryVar = new zzry(mediaCodec, zza(((zzru) this.zza).zza), new zzsc(mediaCodec, zzb(((zzrv) this.zzb).zza)), zzslVar.zzf, null);
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e8) {
            e = e8;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            Surface surface = zzslVar.zzd;
            int i7 = 0;
            if (surface == null && zzslVar.zza.zzh && zzen.zza >= 35) {
                i7 = 8;
            }
            zzry.zzh(zzryVar, zzslVar.zzb, surface, null, i7);
            return zzryVar;
        } catch (Exception e9) {
            e = e9;
            zzryVar2 = zzryVar;
            if (zzryVar2 != null) {
                zzryVar2.zzm();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final /* bridge */ /* synthetic */ zzso zzd(zzsl zzslVar) {
        throw null;
    }
}
