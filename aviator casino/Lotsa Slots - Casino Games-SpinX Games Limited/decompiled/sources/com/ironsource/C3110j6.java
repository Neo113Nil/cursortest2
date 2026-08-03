package com.ironsource;

/* renamed from: com.ironsource.j6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3110j6 implements com.ironsource.K {

    /* renamed from: a, reason: collision with root package name */
    private final android.app.Activity f6323a;

    public C3110j6(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f6323a = activity;
    }

    @Override // com.ironsource.K
    public /* synthetic */ void a(com.ironsource.B2 b2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b2, "bannerAdInstance");
    }

    @Override // com.ironsource.K
    public /* synthetic */ void a(com.ironsource.Vb vb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vb, "nativeAdInstance");
    }

    @Override // com.ironsource.K
    public void a(com.ironsource.C3075h6 fullscreenAdInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.f6323a);
    }
}
