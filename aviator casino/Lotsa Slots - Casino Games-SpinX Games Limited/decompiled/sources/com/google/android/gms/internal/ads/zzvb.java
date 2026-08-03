package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzvb implements com.google.android.gms.internal.ads.zzvh {
    private final android.content.Context zza;

    @java.lang.Deprecated
    public zzvb() {
        this.zza = null;
    }

    public zzvb(android.content.Context context, com.google.android.gms.internal.ads.zzgub zzgubVar, com.google.android.gms.internal.ads.zzgub zzgubVar2) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final com.google.android.gms.internal.ads.zzvj zzc(com.google.android.gms.internal.ads.zzvg zzvgVar) throws java.io.IOException {
        android.content.Context context;
        com.google.android.gms.internal.ads.zzvm zzvmVar;
        android.media.MediaCodec createByCodecName;
        if (android.os.Build.VERSION.SDK_INT >= 31 || ((context = this.zza) != null && android.os.Build.VERSION.SDK_INT >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int zzf = com.google.android.gms.internal.ads.zzas.zzf(zzvgVar.zzc.zzp);
            com.google.android.gms.internal.ads.zzeg.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(com.google.android.gms.internal.ads.zzfl.zzS(zzf)));
            com.google.android.gms.internal.ads.zzut zzutVar = new com.google.android.gms.internal.ads.zzut(zzf);
            zzutVar.zza(true);
            return zzutVar.zzb(zzvgVar);
        }
        android.media.MediaCodec mediaCodec = null;
        try {
            zzvmVar = zzvgVar.zza;
            java.lang.String str = zzvmVar.zza;
            android.os.Trace.beginSection("createCodec:".concat(str));
            createByCodecName = android.media.MediaCodec.createByCodecName(str);
            android.os.Trace.endSection();
        } catch (java.io.IOException e) {
            e = e;
        } catch (java.lang.RuntimeException e2) {
            e = e2;
        }
        try {
            android.os.Trace.beginSection("configureCodec");
            android.view.Surface surface = zzvgVar.zzd;
            int i = 0;
            if (surface == null && zzvmVar.zzh && android.os.Build.VERSION.SDK_INT >= 35) {
                i = 8;
            }
            createByCodecName.configure(zzvgVar.zzb, surface, (android.media.MediaCrypto) null, i);
            android.os.Trace.endSection();
            android.os.Trace.beginSection("startCodec");
            createByCodecName.start();
            android.os.Trace.endSection();
            return new com.google.android.gms.internal.ads.zzwg(createByCodecName, zzvgVar.zzf, null);
        } catch (java.io.IOException | java.lang.RuntimeException e3) {
            e = e3;
            mediaCodec = createByCodecName;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
