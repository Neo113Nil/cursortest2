package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436ig implements io.appmetrica.analytics.impl.Oa {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f6099a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.installreferrer.api.InstallReferrerClient f6100b;

    public C0436ig(android.content.Context context, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor) {
        this.f6099a = iCommonExecutor;
        this.f6100b = com.android.installreferrer.api.InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(io.appmetrica.analytics.impl.InterfaceC0695sg interfaceC0695sg, java.lang.Throwable th) {
        interfaceC0695sg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(io.appmetrica.analytics.impl.InterfaceC0695sg interfaceC0695sg) {
        this.f6100b.startConnection(new io.appmetrica.analytics.impl.C0411hg(this, interfaceC0695sg));
    }

    public final void a(io.appmetrica.analytics.impl.InterfaceC0695sg interfaceC0695sg, java.lang.Throwable th) {
        this.f6099a.execute(new F0.c(8, interfaceC0695sg, th));
    }
}
