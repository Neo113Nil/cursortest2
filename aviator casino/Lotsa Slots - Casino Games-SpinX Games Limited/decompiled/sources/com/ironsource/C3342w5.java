package com.ironsource;

/* renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3342w5 implements com.ironsource.Ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.unity3d.ironsourceads.rewarded.RewardedAdRequest f6801a;
    private final com.ironsource.C2957ae b;
    private final com.ironsource.InterfaceC3266s1 c;
    private final com.ironsource.mediationsdk.logger.IronSourceError d;

    public C3342w5(com.unity3d.ironsourceads.rewarded.RewardedAdRequest adRequest, com.ironsource.C2957ae adLoadTaskListener, com.ironsource.InterfaceC3266s1 analytics, com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6801a = adRequest;
        this.b = adLoadTaskListener;
        this.c = analytics;
        this.d = error;
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError a() {
        return this.d;
    }

    @Override // com.ironsource.Ab
    public void start() {
        com.ironsource.C3252r5 c3252r5 = new com.ironsource.C3252r5(this.c, this.f6801a.getAdId$mediationsdk_release(), this.f6801a.getProviderName$mediationsdk_release());
        c3252r5.a();
        c3252r5.a(this.d);
        this.b.b(this.d);
    }
}
