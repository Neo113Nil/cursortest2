package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzvr extends zziw {
    public final int zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvr(Throwable th, zzvs zzvsVar) {
        super("Decoder failed: ".concat(String.valueOf(r3)), th);
        String str = zzvsVar == null ? null : zzvsVar.zza;
        String.valueOf(str);
        boolean z = th instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zza = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
