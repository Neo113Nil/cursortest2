package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D2 implements K {

    /* renamed from: a, reason: collision with root package name */
    private final Bg f7591a;

    public D2(Bg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.f7591a = viewBinder;
    }

    @Override // com.ironsource.K
    public void a(C4758z2 bannerAdInstance) {
        Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
        bannerAdInstance.a(this.f7591a);
    }
}
