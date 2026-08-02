package B3;

import android.media.MediaCodec;

/* loaded from: classes8.dex */
public class s extends s3.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2367a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2368b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(IllegalStateException illegalStateException, t tVar) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(tVar == null ? null : tVar.f2369a);
        boolean z11 = illegalStateException instanceof MediaCodec.CodecException;
        this.f2367a = z11 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        this.f2368b = z11 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
