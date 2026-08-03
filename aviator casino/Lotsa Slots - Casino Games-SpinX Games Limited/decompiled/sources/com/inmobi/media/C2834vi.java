package com.inmobi.media;

/* renamed from: com.inmobi.media.vi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2834vi extends android.webkit.WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.InterfaceC2772t9 f5513a;
    public final com.inmobi.media.C2936zi b;

    public C2834vi(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, com.inmobi.media.C2936zi c2936zi) {
        this.f5513a = interfaceC2772t9;
        this.b = c2936zi;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessResponsive(android.webkit.WebView view, android.webkit.WebViewRenderProcess webViewRenderProcess) {
        com.inmobi.media.Ph ph;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5513a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + io.ktor.sse.ServerSentEventKt.SPACE + webViewRenderProcess);
        }
        com.inmobi.media.C2936zi c2936zi = this.b;
        if (c2936zi != null) {
            java.util.Map a2 = c2936zi.a();
            a2.put("creativeId", c2936zi.f5594a.g);
            int i = c2936zi.e + 1;
            c2936zi.e = i;
            a2.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, java.lang.Integer.valueOf(i));
            java.lang.String a3 = c2936zi.a("RenderProcessResponsive");
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b(a3, a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f5513a;
        if (interfaceC2772t92 == null || (ph = ((com.inmobi.media.C2799u9) interfaceC2772t92).f5484a) == null) {
            return;
        }
        ph.a();
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessUnresponsive(android.webkit.WebView view, android.webkit.WebViewRenderProcess webViewRenderProcess) {
        com.inmobi.media.Ph ph;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5513a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + io.ktor.sse.ServerSentEventKt.SPACE + webViewRenderProcess);
        }
        com.inmobi.media.C2936zi c2936zi = this.b;
        if (c2936zi != null) {
            java.util.Map a2 = c2936zi.a();
            a2.put("creativeId", c2936zi.f5594a.g);
            int i = c2936zi.d + 1;
            c2936zi.d = i;
            a2.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, java.lang.Integer.valueOf(i));
            java.lang.String a3 = c2936zi.a("RenderProcessUnResponsive");
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b(a3, a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f5513a;
        if (interfaceC2772t92 == null || (ph = ((com.inmobi.media.C2799u9) interfaceC2772t92).f5484a) == null) {
            return;
        }
        ph.a();
    }
}
