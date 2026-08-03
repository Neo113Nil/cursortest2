package com.ironsource;

/* loaded from: classes5.dex */
public final class Z5 implements com.ironsource.Jc {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.InterfaceC2949a6 f6112a;
    private java.lang.ref.WeakReference<com.ironsource.InterfaceC2967b6> b = new java.lang.ref.WeakReference<>(null);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Z5.a f6113a = new com.ironsource.Z5.a();
        public static final java.lang.String b = "impressions";

        private a() {
        }
    }

    public final void a(com.ironsource.InterfaceC2949a6 loadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f6112a = loadListener;
    }

    @Override // com.ironsource.Jc
    public void onInterstitialAdRewarded(java.lang.String str, int i) {
        com.ironsource.InterfaceC2967b6 interfaceC2967b6 = this.b.get();
        if (interfaceC2967b6 != null) {
            interfaceC2967b6.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClick() {
        com.ironsource.InterfaceC2967b6 interfaceC2967b6 = this.b.get();
        if (interfaceC2967b6 != null) {
            interfaceC2967b6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClose() {
        com.ironsource.InterfaceC2967b6 interfaceC2967b6 = this.b.get();
        if (interfaceC2967b6 != null) {
            interfaceC2967b6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialEventNotificationReceived(java.lang.String str, org.json.JSONObject jSONObject) {
        com.ironsource.InterfaceC2967b6 interfaceC2967b6;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, "impressions") || (interfaceC2967b6 = this.b.get()) == null) {
            return;
        }
        interfaceC2967b6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitFailed(java.lang.String str) {
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadFailed(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        com.ironsource.InterfaceC2949a6 interfaceC2949a6 = this.f6112a;
        if (interfaceC2949a6 != null) {
            interfaceC2949a6.a(description);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadSuccess(com.ironsource.J9 adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        com.ironsource.InterfaceC2949a6 interfaceC2949a6 = this.f6112a;
        if (interfaceC2949a6 != null) {
            interfaceC2949a6.a(adInstance);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialOpen() {
        com.ironsource.InterfaceC2967b6 interfaceC2967b6 = this.b.get();
        if (interfaceC2967b6 != null) {
            interfaceC2967b6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowFailed(java.lang.String str) {
        com.ironsource.InterfaceC2967b6 interfaceC2967b6 = this.b.get();
        if (interfaceC2967b6 != null) {
            interfaceC2967b6.a(str);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowSuccess() {
    }

    public final void a(com.ironsource.InterfaceC2967b6 showListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new java.lang.ref.WeakReference<>(showListener);
    }
}
