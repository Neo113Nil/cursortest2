package com.ironsource;

import com.ironsource.C4524m1;
import com.ironsource.InterfaceC4470j1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.r5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4617r5 implements InterfaceC4767zb {

    /* renamed from: a, reason: collision with root package name */
    private final IronSourceError f8502a;
    private final C4286a3 b;
    private final InterfaceC4596q1 c;

    public C4617r5(IronSourceError error, C4286a3 adLoadTaskListener, InterfaceC4596q1 analytics) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f8502a = error;
        this.b = adLoadTaskListener;
        this.c = analytics;
    }

    public final IronSourceError a() {
        return this.f8502a;
    }

    @Override // com.ironsource.InterfaceC4767zb
    public void start() {
        InterfaceC4470j1.c.a aVar = InterfaceC4470j1.c.f8258a;
        aVar.a().a(this.c);
        aVar.a(new C4524m1.j(this.f8502a.getErrorCode()), new C4524m1.k(this.f8502a.getErrorMessage()), new C4524m1.f(0L)).a(this.c);
        this.b.a(this.f8502a);
    }
}
