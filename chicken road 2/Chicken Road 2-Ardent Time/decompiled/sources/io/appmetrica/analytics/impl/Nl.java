package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Nl implements io.appmetrica.analytics.impl.A6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.StartupParamsCallback f4743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Ol f4744b;

    public Nl(io.appmetrica.analytics.impl.Ol ol, io.appmetrica.analytics.StartupParamsCallback startupParamsCallback) {
        this.f4744b = ol;
        this.f4743a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.A6
    public final void a(int i2, android.os.Bundle bundle) {
        this.f4744b.b(bundle, this.f4743a);
    }
}
