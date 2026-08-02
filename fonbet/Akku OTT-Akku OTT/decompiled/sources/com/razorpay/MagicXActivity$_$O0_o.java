package com.razorpay;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;

@Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0011"}, d2 = {"com/razorpay/MagicXActivity$setWebViewClientForMagicX$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "request", "Landroid/webkit/WebResourceRequest;", "shouldOverrideUrlLoading", "", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MagicXActivity$_$O0_o extends WebViewClient {
    final /* synthetic */ MagicXActivity this$0;

    public MagicXActivity$_$O0_o(MagicXActivity magicXActivity) {
        this.this$0 = magicXActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPageFinished$lambda-0, reason: not valid java name */
    public static final void m1700onPageFinished$lambda0(MagicXActivity this$0) {
        WebView webView;
        JSONArray jSONArray;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        webView = this$0.webView;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView = null;
        }
        StringBuilder sb = new StringBuilder("\n                            fetch(window.Shopify.routes.root + 'cart/clear.js')\n                              .then(res => {res.json()}).then(data => {\n                                const stringifiedFormData = { 'items': ");
        jSONArray = this$0.itemsToBeAddedToCart;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemsToBeAddedToCart");
            jSONArray = null;
        }
        sb.append(jSONArray);
        sb.append("}\n\n\n                                fetch(window.Shopify.routes.root + 'cart/add.js', {\n                                  method: 'POST',\n                                  headers: {\n                                    'Content-Type': 'application/json'\n                                  },\n                                  body: JSON.stringify(stringifiedFormData)\n                                })\n                                .then(response => {\n                                  openRzpLogin();\n                                  return response.json();\n                                }).then(data=>{\n\n                                })\n                                .catch((error) => {\n                                  MagicXBridge.errorFromJs(JSON.stringify(error));\n                                });\n                              }).catch((error)=>{\n                                MagicXBridge.errorFromJs(JSON.stringify(error));\n                              });\n                        ");
        webView.evaluateJavascript(StringsKt.trimIndent(sb.toString()), null);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        String str;
        boolean equals;
        str = this.this$0.storefrontUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storefrontUrl");
            str = null;
        }
        equals = StringsKt__StringsJVMKt.equals(str, url, true);
        if (equals) {
            MagicXActivity magicXActivity = this.this$0;
            magicXActivity.runOnUiThread(new n(magicXActivity, 0));
        }
        super.onPageFinished(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        boolean z;
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        if (request == null) {
            return super.shouldInterceptRequest(view, request);
        }
        MagicXActivity magicXActivity = this.this$0;
        z = magicXActivity.magicxLoaded;
        if (z) {
            String uri = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "it.url.toString()");
            startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(uri, "https://api.razorpay.com/v1/checkout/public?", false, 2, null);
            if (startsWith$default3) {
                magicXActivity.magicxLoaded = false;
                magicXActivity.finish();
                return null;
            }
        }
        String uri2 = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "it.url.toString()");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(uri2, "https://api.razorpay.com/v1/magic/order?", false, 2, null);
        if (startsWith$default) {
            magicXActivity.dismissHalfTransparentPage();
        }
        String uri3 = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "it.url.toString()");
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(uri3, "https://checkout.razorpay.com/app/shopify/v1/payment/", false, 2, null);
        if (!startsWith$default2) {
            return super.shouldInterceptRequest(view, request);
        }
        Intent intent = new Intent();
        intent.putExtra("checkout_url", request.getUrl().toString());
        Unit unit = Unit.INSTANCE;
        magicXActivity.setResult(99002, intent);
        magicXActivity.finish();
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        String.valueOf(request != null ? request.getUrl() : null);
        return super.shouldOverrideUrlLoading(view, request);
    }
}
