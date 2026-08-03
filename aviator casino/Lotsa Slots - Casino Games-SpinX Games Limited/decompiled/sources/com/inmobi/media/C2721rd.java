package com.inmobi.media;

/* renamed from: com.inmobi.media.rd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2721rd {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2748sd f5426a;
    public long b;
    public java.lang.String c;
    public java.lang.String d;
    public final com.inmobi.media.C2325cb e;

    public C2721rd(com.inmobi.media.C2748sd landingPageModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageModel, "landingPageModel");
        this.f5426a = landingPageModel;
        com.inmobi.media.C2670pd c2670pd = new com.inmobi.media.C2670pd(this);
        com.inmobi.media.C2696qd c2696qd = new com.inmobi.media.C2696qd(this);
        this.e = new com.inmobi.media.C2325cb(landingPageModel.f5446a, new com.inmobi.media.C2352db(false, landingPageModel.d.i, landingPageModel.b.f4714a.b.getCctEnabled(), 16), c2670pd, c2696qd, landingPageModel.d, landingPageModel.g, 128);
    }

    public final void a() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.b = elapsedRealtime;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5426a.g;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("PublisherViewClickHandler", "handleLandingPageUrl: viewTouchTimestamp=" + elapsedRealtime + ", lastClickedAssetUrl=" + this.c);
        }
        java.lang.String str = this.c;
        if (str != null) {
            a(str, this.d);
        }
    }

    public final void b(java.lang.String url, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5426a.g;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("PublisherViewClickHandler", "handleNativeAssetClickUrl: url=" + url + ", fallbackUrl=" + str);
        }
        this.c = url;
        this.d = str;
        com.inmobi.media.C2748sd c2748sd = this.f5426a;
        if (c2748sd.b.f4714a.f5382a.f) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c2748sd.g;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("PublisherViewClickHandler", "Lock screen ad clicked, firing callback only");
            }
            ((com.inmobi.media.AbstractC2445h) this.f5426a.f).a(kotlin.collections.MapsKt.emptyMap());
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = c2748sd.g;
        if (interfaceC2772t93 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a("PublisherViewClickHandler", "Firing onAdClicked callback and handling landing page URL");
        }
        ((com.inmobi.media.AbstractC2445h) this.f5426a.f).a(kotlin.collections.MapsKt.emptyMap());
        a();
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5426a.g;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("PublisherViewClickHandler", "handleLandingPageUrl: processing url=" + str + ", isNetworkUrl=" + android.webkit.URLUtil.isNetworkUrl(str));
        }
        com.inmobi.media.C2298bb a2 = com.inmobi.media.C2325cb.a(this.e, "nativeOpen", (java.lang.String) null, str, (com.inmobi.media.C2431gb) null, 24);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f5426a.g;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("PublisherViewClickHandler", "processOpenRequest result: " + a2.f5121a);
        }
        if (a2.f5121a == 1) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f5426a.g;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a("PublisherViewClickHandler", "Redirection resolved successfully");
                return;
            }
            return;
        }
        if (str2 != null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.f5426a.g;
            if (interfaceC2772t94 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t94).a("PublisherViewClickHandler", "Primary URL failed, trying fallback URL: " + str2);
            }
            a(str2, null);
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.f5426a.g;
        if (interfaceC2772t95 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t95).b("PublisherViewClickHandler", "Landing Page Handling Failed - no fallback URL available");
        }
    }

    public final void b() {
        com.inmobi.media.C2748sd c2748sd = this.f5426a;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2748sd.g;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("PublisherViewClickHandler", "takeAction called, isLockScreen=" + c2748sd.b.f4714a.f5382a.f);
        }
        if (this.f5426a.b.f4714a.f5382a.f) {
            a();
        }
    }

    public final void a(android.content.Intent intent) {
        com.inmobi.media.C2748sd c2748sd = this.f5426a;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2748sd.g;
        if (interfaceC2772t9 != null) {
            com.inmobi.media.G g = c2748sd.b;
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("PublisherViewClickHandler", "openEmbeddedBrowser: creativeId=" + g.e + ", placementId=" + g.f4714a.f5382a.f4958a);
        }
        intent.putExtra("creativeId", this.f5426a.b.e);
        intent.putExtra("impressionId", this.f5426a.b.m.b);
        intent.putExtra("placementId", this.f5426a.b.f4714a.f5382a.f4958a);
        intent.putExtra("supportLockScreen", this.f5426a.c);
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        android.content.Context context2 = this.f5426a.f5446a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context2 instanceof android.app.Activity)) {
            intent.setFlags(268435456);
        }
        context2.startActivity(intent);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f5426a.g;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("PublisherViewClickHandler", "Embedded browser activity started");
        }
    }
}
