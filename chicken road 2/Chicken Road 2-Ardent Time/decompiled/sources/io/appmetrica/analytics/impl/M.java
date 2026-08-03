package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M implements io.appmetrica.analytics.coreapi.internal.backport.Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Gi f4631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.N f4632c;

    public M(io.appmetrica.analytics.impl.N n2, android.content.Context context, io.appmetrica.analytics.impl.Gi gi) {
        this.f4632c = n2;
        this.f4630a = context;
        this.f4631b = gi;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final java.lang.Object get() {
        return this.f4632c.f4698a.a(this.f4630a, this.f4631b);
    }
}
