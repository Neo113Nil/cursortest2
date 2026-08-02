package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class zzsq extends zzhe {
    public final int zza;

    public zzsq(Throwable th, zzsr zzsrVar) {
        super("Decoder failed: ".concat(String.valueOf(zzsrVar == null ? null : zzsrVar.zza)), th);
        boolean z4 = th instanceof MediaCodec.CodecException;
        if (z4) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        int i7 = zzen.zza;
        this.zza = z4 ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
