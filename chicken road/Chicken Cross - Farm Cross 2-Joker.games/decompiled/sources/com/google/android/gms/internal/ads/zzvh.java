package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzvh implements zzvn {
    private final Context zza;
    private boolean zzb;

    @Deprecated
    public zzvh() {
        this.zza = null;
    }

    public zzvh(Context context, zzgvc zzgvcVar, zzgvc zzgvcVar2) {
        this.zza = context;
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final zzvp zzc(zzvm zzvmVar) throws IOException {
        Context context;
        zzvs zzvsVar;
        MediaCodec createByCodecName;
        if (Build.VERSION.SDK_INT >= 31 || ((context = this.zza) != null && Build.VERSION.SDK_INT >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int zzf = zzas.zzf(zzvmVar.zzc.zzp);
            zzeh.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfm.zzU(zzf)));
            zzuz zzuzVar = new zzuz(zzf);
            zzuzVar.zza(this.zzb);
            return zzuzVar.zzb(zzvmVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzvsVar = zzvmVar.zza;
            String str = zzvsVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
        } catch (IOException e) {
            e = e;
        } catch (RuntimeException e2) {
            e = e2;
        }
        try {
            Trace.beginSection("configureCodec");
            Surface surface = zzvmVar.zzd;
            int i = 0;
            if (surface == null && zzvsVar.zzh && Build.VERSION.SDK_INT >= 35) {
                i = 8;
            }
            createByCodecName.configure(zzvmVar.zzb, surface, (MediaCrypto) null, i);
            Trace.endSection();
            Trace.beginSection("startCodec");
            createByCodecName.start();
            Trace.endSection();
            return new zzwm(createByCodecName, zzvmVar.zzf, null);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            mediaCodec = createByCodecName;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
