package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Y5 implements Jc {

    /* renamed from: a, reason: collision with root package name */
    private Z5 f8022a;
    private WeakReference<InterfaceC4289a6> b = new WeakReference<>(null);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8023a = new a();
        public static final String b = "impressions";

        private a() {
        }
    }

    public final void a(Z5 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f8022a = loadListener;
    }

    @Override // com.ironsource.Jc
    public void onInterstitialAdRewarded(String str, int i) {
        InterfaceC4289a6 interfaceC4289a6 = this.b.get();
        if (interfaceC4289a6 != null) {
            interfaceC4289a6.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClick() {
        InterfaceC4289a6 interfaceC4289a6 = this.b.get();
        if (interfaceC4289a6 != null) {
            interfaceC4289a6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClose() {
        InterfaceC4289a6 interfaceC4289a6 = this.b.get();
        if (interfaceC4289a6 != null) {
            interfaceC4289a6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterfaceC4289a6 interfaceC4289a6;
        if (!Intrinsics.areEqual(str, "impressions") || (interfaceC4289a6 = this.b.get()) == null) {
            return;
        }
        interfaceC4289a6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitFailed(String str) {
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadFailed(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        Z5 z5 = this.f8022a;
        if (z5 != null) {
            z5.a(description);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadSuccess(J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Z5 z5 = this.f8022a;
        if (z5 != null) {
            z5.a(adInstance);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialOpen() {
        InterfaceC4289a6 interfaceC4289a6 = this.b.get();
        if (interfaceC4289a6 != null) {
            interfaceC4289a6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowFailed(String str) {
        InterfaceC4289a6 interfaceC4289a6 = this.b.get();
        if (interfaceC4289a6 != null) {
            interfaceC4289a6.a(str);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowSuccess() {
    }

    public final void a(InterfaceC4289a6 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new WeakReference<>(showListener);
    }
}
