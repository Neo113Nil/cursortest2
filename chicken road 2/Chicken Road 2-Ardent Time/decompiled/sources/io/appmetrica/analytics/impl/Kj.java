package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4554b;

    public Kj(java.lang.String str, java.lang.String str2) {
        this.f4553a = str;
        this.f4554b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.putAppEnvironmentValue(this.f4553a, this.f4554b);
    }
}
