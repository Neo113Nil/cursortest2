package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class zzsg implements zzsm {
    private final Context zza;

    @Deprecated
    public zzsg() {
        this.zza = null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.zztm] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.google.android.gms.internal.ads.zzsm
    public final zzso zzd(zzsl zzslVar) throws Throwable {
        Context context;
        int i7 = zzen.zza;
        if (i7 >= 31 || ((context = this.zza) != null && i7 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int iZzb = zzay.zzb(zzslVar.zzc.zzo);
            zzdq.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzen.zzD(iZzb)));
            return new zzrw(iZzb).zzc(zzslVar);
        }
        MediaCodec mediaCodec = 0;
        mediaCodec = 0;
        try {
            String str = zzslVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzslVar.zzd;
                int i8 = 0;
                if (surface == null && zzslVar.zza.zzh && i7 >= 35) {
                    i8 = 8;
                }
                mediaCodecCreateByCodecName.configure(zzslVar.zzb, surface, (MediaCrypto) null, i8);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zztn(mediaCodecCreateByCodecName, zzslVar.zzf, mediaCodec);
            } catch (IOException e7) {
                e = e7;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e8) {
                e = e8;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e9) {
            e = e9;
        } catch (RuntimeException e10) {
            e = e10;
        }
    }

    public zzsg(Context context, zzftz zzftzVar, zzftz zzftzVar2) {
        this.zza = context;
    }
}
