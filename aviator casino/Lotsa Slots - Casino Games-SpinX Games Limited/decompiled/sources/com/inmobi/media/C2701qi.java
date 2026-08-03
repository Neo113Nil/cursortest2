package com.inmobi.media;

/* renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2701qi extends com.inmobi.media.A2 {
    public final com.inmobi.media.C2936zi f;
    public final kotlin.jvm.functions.Function1 g;
    public boolean h;
    public final java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2701qi(com.inmobi.media.C2936zi c2936zi, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, kotlin.jvm.functions.Function1 onRenderViewProcessGone) {
        super(interfaceC2772t9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRenderViewProcessGone, "onRenderViewProcessGone");
        this.f = c2936zi;
        this.g = onRenderViewProcessGone;
        this.i = "redirect";
    }

    public final boolean a(android.webkit.WebView webView, java.lang.String str) {
        boolean z;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewClient", "onShouldOverrideUrlLoading  - url - " + str);
        }
        if (webView instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webView;
            gestureDetectorOnGestureListenerC2675pi.getClass();
            z = true;
            if (!gestureDetectorOnGestureListenerC2675pi.a()) {
                gestureDetectorOnGestureListenerC2675pi.a(this.i);
                return true;
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f4592a;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC2675pi.getPlacementType()) + "  url:" + str);
            }
            a(gestureDetectorOnGestureListenerC2675pi, str);
        } else {
            z = false;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f4592a;
        if (interfaceC2772t93 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a("RenderViewClient", "Override URL loading :" + str + " returned " + z);
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewClient", "Resource loading:" + str);
        }
        if (webView instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webView;
            java.lang.String url = gestureDetectorOnGestureListenerC2675pi.getUrl();
            if (str == null || url == null || kotlin.text.StringsKt.startsWith$default(url, "file:", false, 2, (java.lang.Object) null)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC2675pi);
        }
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        com.inmobi.media.Ph ph;
        com.inmobi.media.C2936zi c2936zi = this.f;
        if (c2936zi != null) {
            java.util.Map a2 = c2936zi.a();
            long j = c2936zi.c;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            a2.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
            java.lang.String a3 = c2936zi.a("WebViewLoadFinished");
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b(a3, a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewClient", "Page load finished:" + str);
        }
        if (webView instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webView;
            a(gestureDetectorOnGestureListenerC2675pi);
            if (kotlin.jvm.internal.Intrinsics.areEqual("Loading", gestureDetectorOnGestureListenerC2675pi.A)) {
                gestureDetectorOnGestureListenerC2675pi.h("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC2675pi.h("window.mraidview.broadcastEvent('ready');");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2594mi(gestureDetectorOnGestureListenerC2675pi, null), 3, null);
            }
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f4592a;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f4592a;
        if (interfaceC2772t93 == null || (ph = ((com.inmobi.media.C2799u9) interfaceC2772t93).f5484a) == null) {
            return;
        }
        ph.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.inmobi.media.Ph ph;
        com.inmobi.media.C2936zi c2936zi = this.f;
        if (c2936zi != null) {
            java.util.Map a2 = c2936zi.a();
            long j = c2936zi.c;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            a2.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
            java.lang.String a3 = c2936zi.a("PageStarted");
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b(a3, a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewClient", "Page load started:" + str);
        }
        if (webView instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f4592a;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("RenderViewClient", "Page load started renderview: " + ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webView).getMarkupType());
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webView;
            a(gestureDetectorOnGestureListenerC2675pi);
            gestureDetectorOnGestureListenerC2675pi.setAndUpdateViewState("Loading");
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f4592a;
        if (interfaceC2772t93 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.f4592a;
        if (interfaceC2772t94 == null || (ph = ((com.inmobi.media.C2799u9) interfaceC2772t94).f5484a) == null) {
            return;
        }
        ph.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView view, int i, java.lang.String description, java.lang.String failingUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("RenderViewClient", "OnReceivedError - errorCode - " + i + ", description - " + description + ", url - " + failingUrl);
        }
        super.onReceivedError(view, i, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("RenderViewClient", "ReceivedHttpError - error - " + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null) + ", statusCode - " + (webResourceResponse != null ? java.lang.Integer.valueOf(webResourceResponse.getStatusCode()) : null) + " url - " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " isMainFrame - " + (webResourceRequest != null ? java.lang.Boolean.valueOf(webResourceRequest.isForMainFrame()) : null));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("RenderViewClient", "onReceivedSSLError - error - " + (sslError != null ? java.lang.Integer.valueOf(sslError.getPrimaryError()) : null) + " - url - " + (sslError != null ? sslError.getUrl() : null));
        }
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "detail");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c("RenderViewClient", "onRenderProcessGone detail did crash- " + detail.didCrash() + " priority - " + detail.rendererPriorityAtExit());
            }
            this.g.invoke(java.lang.Boolean.valueOf(detail.didCrash()));
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f4592a;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(view, detail);
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        android.webkit.WebResourceResponse a2 = com.inmobi.media.AbstractC2840vo.a(request, this.f4592a);
        return a2 == null ? super.shouldInterceptRequest(view, request) : a2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.x()) {
            return false;
        }
        java.lang.String uri = request.getUrl().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return a(view, uri);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.z()) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
            if (interfaceC2772t9 != null) {
                int errorCode = error.getErrorCode();
                java.lang.CharSequence description = error.getDescription();
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("RenderViewClient", "OnReceivedError - errorCode - " + errorCode + ", description - " + ((java.lang.Object) description) + ", url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f4592a;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b("RenderViewClient", "OnReceivedError ");
        }
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        android.webkit.WebResourceResponse a2 = com.inmobi.media.AbstractC2840vo.a(url, this.f4592a);
        return a2 == null ? super.shouldInterceptRequest(view, url) : a2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewClient", "shouldOverrideUrlLoading Called " + url);
        }
        return a(view, url);
    }

    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewClient", "Override URL loading :" + str);
        }
        gestureDetectorOnGestureListenerC2675pi.s();
        com.inmobi.media.C2298bb a2 = com.inmobi.media.C2325cb.a(gestureDetectorOnGestureListenerC2675pi.getLandingPageHandler(), this.i, (java.lang.String) null, str, (com.inmobi.media.C2431gb) null, 24);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f4592a;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("RenderViewClient", "Current Index :" + gestureDetectorOnGestureListenerC2675pi.copyBackForwardList().getCurrentIndex() + " Original Url :" + gestureDetectorOnGestureListenerC2675pi.getOriginalUrl() + " URL: " + str);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f4592a;
        if (interfaceC2772t93 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t93).c("RenderViewClient", "landingPage process result - " + a2.f5121a);
        }
    }

    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        if (this.h || gestureDetectorOnGestureListenerC2675pi.e) {
            return;
        }
        this.h = true;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC2675pi.h(gestureDetectorOnGestureListenerC2675pi.getMraidJsString());
    }
}
