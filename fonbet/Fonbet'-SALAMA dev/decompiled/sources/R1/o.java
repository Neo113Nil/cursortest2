package R1;

import A1.X;

/* loaded from: classes.dex */
public final class o extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f5933a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5934b;

    /* renamed from: c, reason: collision with root package name */
    public final m f5935c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5936d;

    public o(X x4, t tVar, boolean z4, int i7) {
        this("Decoder init failed: [" + i7 + "], " + x4, tVar, x4.f283C, z4, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public o(String str, Throwable th, String str2, boolean z4, m mVar, String str3) {
        super(str, th);
        this.f5933a = str2;
        this.f5934b = z4;
        this.f5935c = mVar;
        this.f5936d = str3;
    }
}
