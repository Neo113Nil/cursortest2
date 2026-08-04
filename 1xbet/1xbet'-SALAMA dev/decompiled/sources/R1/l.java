package R1;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class l extends D1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5924a;

    public l(IllegalStateException illegalStateException, m mVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(mVar == null ? null : mVar.f5925a);
        super(sb.toString(), illegalStateException);
        if (p151v2.t.f17159a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f5924a = diagnosticInfo;
    }
}
