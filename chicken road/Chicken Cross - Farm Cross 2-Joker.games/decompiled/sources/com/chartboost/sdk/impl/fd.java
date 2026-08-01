package com.chartboost.sdk.impl;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class fd extends WebViewClient {
    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4769a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public fd(String mraidVersion) {
        Intrinsics.checkNotNullParameter(mraidVersion, "mraidVersion");
        this.f4769a = mraidVersion;
    }

    public final WebResourceResponse a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt.endsWith$default(url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k, false, 2, (Object) null)) {
            return null;
        }
        byte[] bytes = xc.f5080a.a(this.f4769a).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        WebResourceResponse a2 = a(uri);
        return a2 == null ? super.shouldInterceptRequest(view, request) : a2;
    }
}
