package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Wb implements K {

    /* renamed from: a, reason: collision with root package name */
    private final Ob f7995a;

    public Wb(Ob nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        this.f7995a = nativeAdBinder;
    }

    @Override // com.ironsource.K
    public void a(Vb nativeAdInstance) {
        Intrinsics.checkNotNullParameter(nativeAdInstance, "nativeAdInstance");
        nativeAdInstance.a(this.f7995a);
    }
}
