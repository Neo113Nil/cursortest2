package com.ironsource;

import com.ironsource.C4524m1;
import com.ironsource.InterfaceC4470j1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4582p5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4596q1 f8477a;

    public C4582p5(InterfaceC4596q1 analytics, String adRequestAdId, Dd adRequestProviderName) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.f8477a = analytics;
        analytics.a(new C4524m1.s(adRequestProviderName.value()), new C4524m1.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC4470j1.c.f8258a.a().a(this.f8477a);
    }

    public final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC4470j1.c.f8258a.a(new C4524m1.j(error.getErrorCode()), new C4524m1.k(error.getErrorMessage()), new C4524m1.f(0L)).a(this.f8477a);
    }
}
