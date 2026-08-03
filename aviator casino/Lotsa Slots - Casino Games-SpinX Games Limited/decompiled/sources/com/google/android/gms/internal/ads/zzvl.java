package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzvl extends com.google.android.gms.internal.ads.zzit {
    public final int zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvl(java.lang.Throwable th, com.google.android.gms.internal.ads.zzvm zzvmVar) {
        super("Decoder failed: ".concat(java.lang.String.valueOf(r3)), th);
        java.lang.String str = zzvmVar == null ? null : zzvmVar.zza;
        java.lang.String.valueOf(str);
        boolean z = th instanceof android.media.MediaCodec.CodecException;
        if (z) {
            ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zza = z ? ((android.media.MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
