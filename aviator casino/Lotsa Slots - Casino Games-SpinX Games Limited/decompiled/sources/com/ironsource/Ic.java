package com.ironsource;

/* loaded from: classes5.dex */
public final class Ic implements com.ironsource.Hc {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.E2 f5757a;
    private java.lang.ref.WeakReference<com.ironsource.G2> b = new java.lang.ref.WeakReference<>(null);

    public final void a(com.ironsource.E2 loadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f5757a = loadListener;
    }

    @Override // com.ironsource.Hc
    public void onBannerClick() {
        com.ironsource.G2 g2 = this.b.get();
        if (g2 != null) {
            g2.onBannerClick();
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerInitFailed(java.lang.String str) {
    }

    @Override // com.ironsource.Hc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadFail(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        com.ironsource.E2 e2 = this.f5757a;
        if (e2 != null) {
            e2.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadSuccess(com.ironsource.J9 adInstance, com.ironsource.C3041f8 adContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        com.ironsource.E2 e2 = this.f5757a;
        if (e2 != null) {
            e2.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerShowSuccess() {
        com.ironsource.G2 g2 = this.b.get();
        if (g2 != null) {
            g2.onBannerShowSuccess();
        }
    }

    public final void a(com.ironsource.G2 showListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new java.lang.ref.WeakReference<>(showListener);
    }
}
