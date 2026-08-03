package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Df extends com.inmobi.media.Vn {
    public static final /* synthetic */ int g = 0;
    public final com.inmobi.media.Wn d;
    public com.inmobi.media.InterfaceC2394f1 e;
    public final com.inmobi.media.InterfaceC2772t9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Df(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adContainer, com.inmobi.media.Wn mViewableAd, com.inmobi.media.InterfaceC2394f1 interfaceC2394f1, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(adContainer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        this.d = mViewableAd;
        this.e = interfaceC2394f1;
        this.f = interfaceC2772t9;
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose obstructionCode) {
        com.iab.omid.library.inmobi.adsession.AdSession adSession;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("Df", "addFriendlyView with obstruction code: " + obstructionCode);
        }
        com.inmobi.media.InterfaceC2394f1 interfaceC2394f1 = this.e;
        if (interfaceC2394f1 != null) {
            com.inmobi.media.C2723rf c2723rf = (com.inmobi.media.C2723rf) interfaceC2394f1;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
            if (com.inmobi.media.C2723rf.a(c2723rf.e) && (adSession = c2723rf.f) != null) {
                adSession.addFriendlyObstruction(childView, obstructionCode, null);
            }
        }
        this.d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Wn
    public final android.view.View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.Wn
    public final android.view.View c() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("Df", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
        try {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
            if (interfaceC2772t9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("Df", "stopTrackingForImpression");
            }
            com.inmobi.media.InterfaceC2394f1 interfaceC2394f1 = this.e;
            if (interfaceC2394f1 != null) {
                com.inmobi.media.C2723rf c2723rf = (com.inmobi.media.C2723rf) interfaceC2394f1;
                com.iab.omid.library.inmobi.adsession.AdSession adSession = c2723rf.f;
                if (adSession != null) {
                    adSession.finish();
                }
                c2723rf.f = null;
                c2723rf.e = (byte) 3;
                c2723rf.c = null;
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b("Df", "Exception in stopTrackingForImpression with message : " + e.getMessage());
            }
        } finally {
            this.d.d();
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView) {
        com.iab.omid.library.inmobi.adsession.AdSession adSession;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        com.inmobi.media.InterfaceC2394f1 interfaceC2394f1 = this.e;
        if (interfaceC2394f1 != null) {
            com.inmobi.media.C2723rf c2723rf = (com.inmobi.media.C2723rf) interfaceC2394f1;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
            if (com.inmobi.media.C2723rf.a(c2723rf.e) && (adSession = c2723rf.f) != null) {
                adSession.removeFriendlyObstruction(childView);
            }
        }
        this.d.a(childView);
    }

    @Override // com.inmobi.media.Wn
    public final void a(java.util.Map map) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("Df", "startTrackingForImpression");
        }
        try {
            if (this.c.getViewability().getOmidConfig().isOmidEnabled()) {
                com.inmobi.media.Jf.f4781a.getClass();
                if (com.iab.omid.library.inmobi.Omid.isActive()) {
                    android.view.View b = this.d.b();
                    android.webkit.WebView webView = b instanceof android.webkit.WebView ? (android.webkit.WebView) b : null;
                    if (webView != null) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
                        if (interfaceC2772t92 != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "TAG");
                            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("Df", "creating OMSDK session");
                        }
                        com.inmobi.media.InterfaceC2394f1 interfaceC2394f1 = this.e;
                        if (interfaceC2394f1 != null) {
                            ((com.inmobi.media.C2723rf) interfaceC2394f1).a(webView, map);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f;
            if (interfaceC2772t93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b("Df", "Exception in startTrackingForImpression with message : " + e.getMessage());
            }
        } finally {
            this.d.a(map);
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.content.Context context, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.Wn
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("Df", "destroy");
        }
        java.lang.ref.WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        try {
            this.e = null;
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("Df", "Exception in destroy with message", e);
            }
        } finally {
            this.d.a();
        }
    }
}
