package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.u5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4671u5 implements InterfaceC4767zb {

    /* renamed from: a, reason: collision with root package name */
    private final RewardedAdRequest f8697a;
    private final Zd b;
    private final InterfaceC4596q1 c;
    private final IronSourceError d;

    public C4671u5(RewardedAdRequest adRequest, Zd adLoadTaskListener, InterfaceC4596q1 analytics, IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8697a = adRequest;
        this.b = adLoadTaskListener;
        this.c = analytics;
        this.d = error;
    }

    public final IronSourceError a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4767zb
    public void start() {
        C4582p5 c4582p5 = new C4582p5(this.c, this.f8697a.getAdId$mediationsdk_release(), this.f8697a.getProviderName$mediationsdk_release());
        c4582p5.a();
        c4582p5.a(this.d);
        this.b.a(this.d);
    }
}
