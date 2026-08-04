package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzsu extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzsr zzc;
    public final String zzd;

    public zzsu(zzz zzzVar, Throwable th, boolean z4, int i7) {
        this("Decoder init failed: [" + i7 + "], " + zzzVar.toString(), th, zzzVar.zzo, false, null, k.d(Math.abs(i7), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_"), null);
    }

    public static /* bridge */ /* synthetic */ zzsu zza(zzsu zzsuVar, zzsu zzsuVar2) {
        return new zzsu(zzsuVar.getMessage(), zzsuVar.getCause(), zzsuVar.zza, false, zzsuVar.zzc, zzsuVar.zzd, zzsuVar2);
    }

    public zzsu(zzz zzzVar, Throwable th, boolean z4, zzsr zzsrVar) {
        this(p150v0.a.f("Decoder init failed: ", zzsrVar.zza, ", ", zzzVar.toString()), th, zzzVar.zzo, false, zzsrVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzsu(String str, Throwable th, String str2, boolean z4, zzsr zzsrVar, String str3, zzsu zzsuVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsrVar;
        this.zzd = str3;
    }
}
