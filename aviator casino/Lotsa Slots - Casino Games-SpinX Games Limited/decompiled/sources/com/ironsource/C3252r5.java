package com.ironsource;

/* renamed from: com.ironsource.r5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3252r5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3266s1 f6580a;

    public C3252r5(com.ironsource.InterfaceC3266s1 analytics, java.lang.String adRequestAdId, com.ironsource.Ed adRequestProviderName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.f6580a = analytics;
        analytics.a(new com.ironsource.C3195o1.s(adRequestProviderName.value()), new com.ironsource.C3195o1.b(adRequestAdId));
    }

    public final void a() {
        com.ironsource.InterfaceC3141l1.c.f6356a.a().a(this.f6580a);
    }

    public final void a(com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.ironsource.InterfaceC3141l1.c.f6356a.a(new com.ironsource.C3195o1.j(error.getErrorCode()), new com.ironsource.C3195o1.k(error.getErrorMessage()), new com.ironsource.C3195o1.f(0L)).a(this.f6580a);
    }
}
