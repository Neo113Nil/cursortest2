package com.ironsource;

/* renamed from: com.ironsource.t5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3288t5 implements com.ironsource.Ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.logger.IronSourceError f6731a;
    private final com.ironsource.C2982c3 b;
    private final com.ironsource.InterfaceC3266s1 c;

    public C3288t5(com.ironsource.mediationsdk.logger.IronSourceError error, com.ironsource.C2982c3 adLoadTaskListener, com.ironsource.InterfaceC3266s1 analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f6731a = error;
        this.b = adLoadTaskListener;
        this.c = analytics;
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError a() {
        return this.f6731a;
    }

    @Override // com.ironsource.Ab
    public void start() {
        com.ironsource.InterfaceC3141l1.c.a aVar = com.ironsource.InterfaceC3141l1.c.f6356a;
        aVar.a().a(this.c);
        aVar.a(new com.ironsource.C3195o1.j(this.f6731a.getErrorCode()), new com.ironsource.C3195o1.k(this.f6731a.getErrorMessage()), new com.ironsource.C3195o1.f(0L)).a(this.c);
        this.b.b(this.f6731a);
    }
}
