package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0879zi extends io.appmetrica.analytics.impl.A4 {
    public C0879zi(io.appmetrica.analytics.impl.C0813x4 c0813x4) {
        super(c0813x4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0735u4 c0735u4) {
        android.os.Bundle bundle = p5.f4825m;
        this.f4031a.f7092k.a(new io.appmetrica.analytics.impl.C0787w4(bundle != null ? (android.os.ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
