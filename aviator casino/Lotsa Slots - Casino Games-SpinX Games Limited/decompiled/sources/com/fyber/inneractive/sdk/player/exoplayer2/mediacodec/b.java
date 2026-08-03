package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public final class b extends java.lang.Exception {
    public b(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f fVar, int i) {
        super("Decoder init failed: [" + i + "], " + oVar, fVar);
        java.lang.String str = oVar.f;
        java.lang.Math.abs(i);
    }

    public b(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, java.lang.Exception exc, java.lang.String str) {
        super("Decoder init failed: " + str + ", " + oVar, exc);
        java.lang.String str2 = oVar.f;
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 21 || !(exc instanceof android.media.MediaCodec.CodecException)) {
            return;
        }
        ((android.media.MediaCodec.CodecException) exc).getDiagnosticInfo();
    }
}
