package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzsg implements zzsm {
    private final Context zza;

    @Deprecated
    public zzsg() {
        this.zza = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.zztm] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.google.android.gms.internal.ads.zzsm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzso zzd(zzsl zzslVar) {
        Context context;
        MediaCodec createByCodecName;
        int i7 = zzen.zza;
        if (i7 >= 31 || ((context = this.zza) != null && i7 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int zzb = zzay.zzb(zzslVar.zzc.zzo);
            zzdq.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzen.zzD(zzb)));
            return new zzrw(zzb).zzc(zzslVar);
        }
        MediaCodec mediaCodec = 0;
        mediaCodec = 0;
        try {
            String str = zzslVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
        } catch (IOException e7) {
            e = e7;
        } catch (RuntimeException e8) {
            e = e8;
        }
        try {
            Trace.beginSection("configureCodec");
            Surface surface = zzslVar.zzd;
            int i8 = 0;
            if (surface == null && zzslVar.zza.zzh && i7 >= 35) {
                i8 = 8;
            }
            createByCodecName.configure(zzslVar.zzb, surface, (MediaCrypto) null, i8);
            Trace.endSection();
            Trace.beginSection("startCodec");
            createByCodecName.start();
            Trace.endSection();
            return new zztn(createByCodecName, zzslVar.zzf, mediaCodec);
        } catch (IOException e9) {
            e = e9;
            mediaCodec = createByCodecName;
            if (mediaCodec != 0) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e10) {
            e = e10;
            mediaCodec = createByCodecName;
            if (mediaCodec != 0) {
            }
            throw e;
        }
    }

    public zzsg(Context context, zzftz zzftzVar, zzftz zzftzVar2) {
        this.zza = context;
    }
}
