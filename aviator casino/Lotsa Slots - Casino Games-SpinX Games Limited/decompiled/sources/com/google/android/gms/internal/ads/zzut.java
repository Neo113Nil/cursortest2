package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzut implements com.google.android.gms.internal.ads.zzvh {
    private final com.google.android.gms.internal.ads.zzgub zza;
    private final com.google.android.gms.internal.ads.zzgub zzb;
    private boolean zzc;

    public zzut(final int i) {
        com.google.android.gms.internal.ads.zzgub zzgubVar = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzus
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                java.lang.String zzw;
                zzw = com.google.android.gms.internal.ads.zzuu.zzw(i, "ExoPlayer:MediaCodecAsyncAdapter:");
                return new android.os.HandlerThread(zzw);
            }
        };
        com.google.android.gms.internal.ads.zzgub zzgubVar2 = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzur
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                java.lang.String zzw;
                zzw = com.google.android.gms.internal.ads.zzuu.zzw(i, "ExoPlayer:MediaCodecQueueingThread:");
                return new android.os.HandlerThread(zzw);
            }
        };
        this.zza = zzgubVar;
        this.zzb = zzgubVar2;
        this.zzc = true;
    }

    public final void zza(boolean z) {
        this.zzc = true;
    }

    public final com.google.android.gms.internal.ads.zzuu zzb(com.google.android.gms.internal.ads.zzvg zzvgVar) throws java.io.IOException {
        android.media.MediaCodec mediaCodec;
        com.google.android.gms.internal.ads.zzvk zzwhVar;
        int i;
        com.google.android.gms.internal.ads.zzuu zzuuVar;
        android.view.Surface surface;
        com.google.android.gms.internal.ads.zzvm zzvmVar = zzvgVar.zza;
        java.lang.String str = zzvmVar.zza;
        com.google.android.gms.internal.ads.zzuu zzuuVar2 = null;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            android.os.Trace.beginSection(sb.toString());
            mediaCodec = android.media.MediaCodec.createByCodecName(str);
            try {
            } catch (java.lang.Exception e) {
                e = e;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            if (this.zzc && android.os.Build.VERSION.SDK_INT >= 36) {
                zzwhVar = new com.google.android.gms.internal.ads.zzwh(mediaCodec);
                i = 4;
                zzuuVar = new com.google.android.gms.internal.ads.zzuu(mediaCodec, (android.os.HandlerThread) this.zza.zza(), zzwhVar, zzvgVar.zzf, null);
                android.os.Trace.endSection();
                surface = zzvgVar.zzd;
                if (surface == null && zzvmVar.zzh && android.os.Build.VERSION.SDK_INT >= 35) {
                    i |= 8;
                }
                zzuuVar.zzt(zzvgVar.zzb, surface, null, i);
                return zzuuVar;
            }
            android.os.Trace.endSection();
            surface = zzvgVar.zzd;
            if (surface == null) {
                i |= 8;
            }
            zzuuVar.zzt(zzvgVar.zzb, surface, null, i);
            return zzuuVar;
        } catch (java.lang.Exception e3) {
            e = e3;
            zzuuVar2 = zzuuVar;
            if (zzuuVar2 != null) {
                zzuuVar2.zzl();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
        zzwhVar = new com.google.android.gms.internal.ads.zzux(mediaCodec, (android.os.HandlerThread) this.zzb.zza());
        i = 0;
        zzuuVar = new com.google.android.gms.internal.ads.zzuu(mediaCodec, (android.os.HandlerThread) this.zza.zza(), zzwhVar, zzvgVar.zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzvj zzc(com.google.android.gms.internal.ads.zzvg zzvgVar) throws java.io.IOException {
        throw null;
    }
}
