package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L implements io.appmetrica.analytics.coreapi.internal.backport.Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.N f4566b;

    public L(io.appmetrica.analytics.impl.N n2, android.content.Context context) {
        this.f4566b = n2;
        this.f4565a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final java.lang.Object get() {
        return this.f4566b.f4698a.a(this.f4565a);
    }
}
