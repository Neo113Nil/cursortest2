package com.google.android.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public class MediaCodecDecoderException extends com.google.android.exoplayer2.decoder.DecoderException {
    public final com.google.android.exoplayer2.mediacodec.MediaCodecInfo codecInfo;
    public final java.lang.String diagnosticInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecDecoderException(java.lang.Throwable th, com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        super(r0.toString(), th);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Decoder failed: ");
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        this.codecInfo = mediaCodecInfo;
        this.diagnosticInfo = com.google.android.exoplayer2.util.Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null;
    }

    private static java.lang.String getDiagnosticInfoV21(java.lang.Throwable th) {
        if (th instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
