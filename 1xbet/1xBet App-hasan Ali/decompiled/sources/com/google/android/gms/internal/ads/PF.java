package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class PF extends Exception {

    /* renamed from: k, reason: collision with root package name */
    public final String f11074k;

    /* renamed from: l, reason: collision with root package name */
    public final NF f11075l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11076m;

    public PF(C1407p c1407p, UF uf, int i) {
        this("Decoder init failed: [" + i + "], " + c1407p.toString(), uf, c1407p.f14904m, null, AbstractC2107A.q("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", Math.abs(i)));
    }

    public PF(C1407p c1407p, Exception exc, NF nf) {
        this("Decoder init failed: " + nf.f10788a + ", " + c1407p.toString(), exc, c1407p.f14904m, nf, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
    }

    public PF(String str, Throwable th, String str2, NF nf, String str3) {
        super(str, th);
        this.f11074k = str2;
        this.f11075l = nf;
        this.f11076m = str3;
    }
}
