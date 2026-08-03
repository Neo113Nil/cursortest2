package androidx.media3.exoplayer.mediacodec;

/* loaded from: classes2.dex */
public class MediaCodecDecoderException extends androidx.media3.decoder.DecoderException {
    public final androidx.media3.exoplayer.mediacodec.MediaCodecInfo codecInfo;
    public final java.lang.String diagnosticInfo;
    public final int errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecDecoderException(java.lang.Throwable th, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        super(r0.toString(), th);
        int errorCodeFromPlatformDiagnosticsInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Decoder failed: ");
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        this.codecInfo = mediaCodecInfo;
        java.lang.String diagnosticInfoV21 = androidx.media3.common.util.Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null;
        this.diagnosticInfo = diagnosticInfoV21;
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
            errorCodeFromPlatformDiagnosticsInfo = getErrorCodeV23(th);
        } else {
            errorCodeFromPlatformDiagnosticsInfo = androidx.media3.common.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(diagnosticInfoV21);
        }
        this.errorCode = errorCodeFromPlatformDiagnosticsInfo;
    }

    private static java.lang.String getDiagnosticInfoV21(java.lang.Throwable th) {
        if (th instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    private static int getErrorCodeV23(java.lang.Throwable th) {
        if (th instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
