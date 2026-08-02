package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class l extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6883a;

    public l(financial.atomic.muppet.Page page) {
        this.f6883a = page;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6883a.get_scope(), null, null, new financial.atomic.muppet.a.u0(this.f6883a, str, null), 3, null);
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6883a.get_scope(), null, null, new financial.atomic.muppet.a.v0(this.f6883a, str, null), 3, null);
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6883a.get_scope(), null, null, new financial.atomic.muppet.a.w0(this.f6883a, str, null), 3, null);
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6883a.get_scope(), null, null, new financial.atomic.muppet.a.x0(this.f6883a, str, null), 3, null);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, final android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        final java.lang.String str;
        java.lang.CharSequence description;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            if (webResourceError == null || (description = webResourceError.getDescription()) == null || (str = description.toString()) == null) {
                str = "";
            }
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "ERR_CACHE_MISS", false, 2, (java.lang.Object) null)) {
                financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.l$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return financial.atomic.muppet.l.$r8$lambda$hkgZGGqI4Xbaddbmui3AWDqXVe8(webResourceRequest);
                    }
                };
                if (webView != null) {
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return;
                }
                return;
            }
            if (webResourceError != null && webResourceError.getErrorCode() == -10) {
                final java.lang.String obj = webResourceRequest.getUrl().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                if (kotlin.text.StringsKt.startsWith$default(obj, "intent://", false, 2, (java.lang.Object) null)) {
                    financial.atomic.muppet.Page page = this.f6883a;
                    android.net.Uri url = webResourceRequest.getUrl();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "");
                    if (page.Camera2StreamConfigurationMap(url)) {
                        try {
                            financial.atomic.muppet.Page.access$get_wv(this.f6883a).getContext().startActivity(android.content.Intent.parseUri(obj, 1));
                        } catch (java.lang.Exception unused) {
                            financial.atomic.muppet.g.a aVar2 = financial.atomic.muppet.g.f6869a;
                            new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.l$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    java.lang.String concat;
                                    concat = "onReceivedError: no app to handle intent url=".concat(java.lang.String.valueOf(obj));
                                    return concat;
                                }
                            };
                        }
                    }
                }
                if (webView == null || !webView.canGoBack()) {
                    return;
                }
                webView.goBack();
                return;
            }
            final java.lang.String access$mapErrorCodeToMessage = financial.atomic.muppet.Page.access$mapErrorCodeToMessage(this.f6883a, webResourceError != null ? java.lang.Integer.valueOf(webResourceError.getErrorCode()) : null);
            financial.atomic.muppet.g.a aVar3 = financial.atomic.muppet.g.f6869a;
            new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.l$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return financial.atomic.muppet.l.$r8$lambda$GYVDlDHbLTrh8zzIHzqHvBi5Wxw(access$mapErrorCodeToMessage, webResourceRequest, str);
                }
            };
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6883a.get_scope(), null, null, new financial.atomic.muppet.a.y0(this.f6883a, access$mapErrorCodeToMessage, null), 3, null);
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.nio.charset.Charset charset$default;
        java.lang.String str;
        java.io.ByteArrayInputStream byteArrayInputStream;
        java.nio.charset.Charset charset$default2;
        if (this.f6883a.Camera2StreamConfigurationMap.size() != 0 && webResourceRequest != null) {
            java.lang.String method = webResourceRequest.getMethod();
            java.lang.String str2 = "";
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method, "");
            java.lang.String upperCase = method.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "GET")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("<script>");
                sb.append(kotlin.collections.CollectionsKt.joinToString$default(this.f6883a.Camera2StreamConfigurationMap, "</script><script>", null, null, 0, null, null, 62, null));
                sb.append("</script>");
                java.lang.String obj = sb.toString();
                java.lang.AutoCloseable autoCloseable = null;
                r7 = null;
                java.lang.String str3 = null;
                try {
                    java.lang.String obj2 = webResourceRequest.getUrl().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                    final ?? https = financial.atomic.muppet.http.RequestKt.toHttps(obj2);
                    financial.atomic.muppet.Page page = this.f6883a;
                    java.lang.String method2 = webResourceRequest.getMethod();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method2, "");
                    okhttp3.Response access$_request = financial.atomic.muppet.Page.access$_request(page, method2, https, null, webResourceRequest.getRequestHeaders(), !webResourceRequest.isForMainFrame());
                    try {
                        if (webResourceRequest.isForMainFrame()) {
                            final java.lang.String header$default = okhttp3.Response.header$default(access$_request, "Cache-Control", null, 2, null);
                            if (header$default == null) {
                                header$default = "";
                            }
                            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) header$default, (java.lang.CharSequence) io.ktor.client.utils.CacheControl.NO_STORE, true) || kotlin.text.StringsKt.contains((java.lang.CharSequence) header$default, (java.lang.CharSequence) "no-cache", true)) {
                                financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
                                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.l$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return financial.atomic.muppet.l.$r8$lambda$Qpz2jYbS3LN8AfE0GgQlRWjJODw(header$default, https);
                                    }
                                };
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6883a.get_scope(), kotlinx.coroutines.Dispatchers.getMain(), null, new financial.atomic.muppet.a.a1(this.f6883a, null), 2, null);
                            }
                        }
                        try {
                            if (webResourceRequest.isForMainFrame() && access$_request.getIsRedirect()) {
                                java.lang.String method3 = webResourceRequest.getMethod();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method3, "");
                                financial.atomic.muppet.http.Request redirectRequest = financial.atomic.muppet.http.RequestKt.redirectRequest(new financial.atomic.muppet.http.Request(method3, https, null, webResourceRequest.getRequestHeaders(), false, null, 32, null), access$_request.code(), okhttp3.Response.header$default(access$_request, "location", null, 2, null));
                                kotlin.jvm.internal.Intrinsics.checkNotNull(redirectRequest);
                                access$_request.close();
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6883a.get_scope(), kotlinx.coroutines.Dispatchers.getMain(), null, new financial.atomic.muppet.a.b1(this.f6883a, redirectRequest, null), 2, null);
                                return null;
                            }
                            java.lang.String header = access$_request.header("content-type", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                            if (!kotlin.text.StringsKt.startsWith(header, "text/html", true)) {
                                java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(kotlin.collections.MapsKt.toMap(access$_request.headers()));
                                okhttp3.ResponseBody body = access$_request.body();
                                okhttp3.MediaType getHighSpeedVideoFpsRangesFor = body != null ? body.getGetHighSpeedVideoFpsRangesFor() : null;
                                if (getHighSpeedVideoFpsRangesFor != null) {
                                    mutableMap.remove("content-type");
                                    mutableMap.remove("Content-Type");
                                }
                                mutableMap.remove("content-length");
                                mutableMap.remove("Content-Length");
                                if (getHighSpeedVideoFpsRangesFor != null) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(getHighSpeedVideoFpsRangesFor.type());
                                    sb2.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                                    sb2.append(getHighSpeedVideoFpsRangesFor.subtype());
                                    str2 = sb2.toString();
                                }
                                return new android.webkit.WebResourceResponse(str2, (getHighSpeedVideoFpsRangesFor == null || (charset$default = okhttp3.MediaType.charset$default(getHighSpeedVideoFpsRangesFor, null, 1, null)) == null) ? null : charset$default.toString(), access$_request.code(), com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, mutableMap, body != null ? body.byteStream() : null);
                            }
                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                            okhttp3.ResponseBody body2 = access$_request.body();
                            okhttp3.MediaType getHighSpeedVideoFpsRangesFor2 = body2 != null ? body2.getGetHighSpeedVideoFpsRangesFor() : null;
                            if (access$_request.body() != null) {
                                okhttp3.ResponseBody body3 = access$_request.body();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(body3);
                                str = new kotlin.text.Regex("http-equiv\\s*=\\s*\"?\\s*(content-security-policy|x-frame-options)\\s*\"?", kotlin.text.RegexOption.IGNORE_CASE).replace(body3.string(), "");
                                if (kotlin.text.StringsKt.indexOf((java.lang.CharSequence) str, "</head>", 0, true) >= 0) {
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    sb3.append(obj);
                                    sb3.append("</head>");
                                    str = kotlin.text.StringsKt.replace(str, "</head>", sb3.toString(), true);
                                } else if (kotlin.text.StringsKt.indexOf((java.lang.CharSequence) str, "</body>", 0, true) >= 0) {
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                    sb4.append(obj);
                                    sb4.append("</body>");
                                    str = kotlin.text.StringsKt.replace(str, "</body>", sb4.toString(), true);
                                } else if (kotlin.text.StringsKt.indexOf((java.lang.CharSequence) str, "</html>", 0, true) >= 0) {
                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                    sb5.append(obj);
                                    sb5.append("</html>");
                                    str = kotlin.text.StringsKt.replace(str, "</html>", sb5.toString(), true);
                                }
                            } else {
                                str = null;
                            }
                            java.util.Iterator<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> it = access$_request.headers().iterator();
                            while (it.hasNext()) {
                                kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> next = it.next();
                                java.lang.String first = next.getFirst();
                                if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) first, (java.lang.CharSequence) "content-security-policy", true) && !kotlin.text.StringsKt.contains((java.lang.CharSequence) first, (java.lang.CharSequence) "x-frame-options", true) && !kotlin.text.StringsKt.contains((java.lang.CharSequence) first, (java.lang.CharSequence) "content-length", true)) {
                                    linkedHashMap.put(first, next.getSecond());
                                }
                            }
                            if (getHighSpeedVideoFpsRangesFor2 != null && (charset$default2 = okhttp3.MediaType.charset$default(getHighSpeedVideoFpsRangesFor2, null, 1, null)) != null) {
                                str3 = charset$default2.toString();
                            }
                            java.lang.String str4 = str3;
                            int code = access$_request.code();
                            if (str != null) {
                                byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                                byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
                            } else {
                                byte[] bytes2 = "".getBytes(kotlin.text.Charsets.UTF_8);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
                                byteArrayInputStream = new java.io.ByteArrayInputStream(bytes2);
                            }
                            return new android.webkit.WebResourceResponse("", str4, code, com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, linkedHashMap, byteArrayInputStream);
                        } catch (java.lang.Exception unused) {
                            autoCloseable = https;
                            if (autoCloseable != null) {
                                autoCloseable.close();
                            }
                            return super.shouldInterceptRequest(webView, webResourceRequest);
                        }
                    } catch (java.lang.Exception unused2) {
                        https = access$_request;
                    }
                } catch (java.lang.Exception unused3) {
                }
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.net.Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url != null) {
            return this.f6883a.getHighSpeedVideoFpsRangesFor(url);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (str == null) {
            return false;
        }
        financial.atomic.muppet.Page page = this.f6883a;
        android.net.Uri parse = android.net.Uri.parse(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        return page.getHighSpeedVideoFpsRangesFor(parse);
    }

    public static /* synthetic */ java.lang.String $r8$lambda$2ODgHvvRro3sT1DyC0h8vkqHrBY(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onReceivedError: ");
        sb.append(str);
        sb.append(" url=");
        sb.append(str2);
        sb.append(" description=");
        sb.append(str3);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$GYVDlDHbLTrh8zzIHzqHvBi5Wxw(java.lang.String str, android.webkit.WebResourceRequest webResourceRequest, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onReceivedError: ");
        sb.append(str);
        sb.append(" url=");
        sb.append(webResourceRequest.getUrl());
        sb.append(" description=");
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$Qpz2jYbS3LN8AfE0GgQlRWjJODw(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("shouldInterceptRequest: detected ");
        sb.append(str);
        sb.append(" for ");
        sb.append(str2);
        sb.append(", switching to LOAD_NO_CACHE");
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$hkgZGGqI4Xbaddbmui3AWDqXVe8(android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onReceivedError: ERR_CACHE_MISS, reloading url=");
        sb.append(webResourceRequest.getUrl());
        return sb.toString();
    }
}
