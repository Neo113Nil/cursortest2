package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class MF extends HD {

    /* renamed from: k, reason: collision with root package name */
    public final int f10610k;

    public MF(IllegalStateException illegalStateException, NF nf) {
        super("Decoder failed: ".concat(String.valueOf(nf == null ? null : nf.f10788a)), illegalStateException);
        boolean z3 = illegalStateException instanceof MediaCodec.CodecException;
        this.f10610k = AbstractC1260lo.f14419a >= 23 ? z3 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : AbstractC1260lo.p(z3 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
