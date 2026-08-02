package R1;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class l extends D1.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f5924a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(IllegalStateException illegalStateException, m mVar) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String str = null;
        sb.append(mVar == null ? null : mVar.f5925a);
        if (v2.t.f17153a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f5924a = str;
    }
}
