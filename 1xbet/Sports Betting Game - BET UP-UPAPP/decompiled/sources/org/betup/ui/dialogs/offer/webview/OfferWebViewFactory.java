package org.betup.ui.dialogs.offer.webview;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler;
import org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeImpl;
import org.betup.ui.dialogs.offer.webview.OfferWebLoadSpec;
import org.betup.ui.fragment.shop.compose.ShopHtmlAssetCache;
import org.betup.utils.WebViewDialogStateGuard;
import org.json.JSONArray;
import org.json.JSONObject;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferWebViewFactory.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JF\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0012H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/dialogs/offer/webview/OfferWebViewFactory;", "", "config", "Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;)V", "create", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "loadSpec", "Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec;", "bridgeHandler", "Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;", "onContentReady", "Lkotlin/Function0;", "", "webViewProvider", "Lkotlin/Function1;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferWebViewFactory {
    public static final int $stable = 0;
    public static final String BRIDGE_OBJECT_NAME = "Android";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final OfferWebViewConfig config;

    /* JADX WARN: Multi-variable type inference failed */
    public OfferWebViewFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OfferWebViewFactory(OfferWebViewConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    public /* synthetic */ OfferWebViewFactory(OfferWebViewConfig offerWebViewConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OfferWebViewConfig.INSTANCE.getDEFAULT() : offerWebViewConfig);
    }

    public static /* synthetic */ WebView create$default(OfferWebViewFactory offerWebViewFactory, Context context, OfferWebLoadSpec offerWebLoadSpec, OfferWebViewBridgeHandler offerWebViewBridgeHandler, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: org.betup.ui.dialogs.offer.webview.OfferWebViewFactory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function02 = function0;
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: org.betup.ui.dialogs.offer.webview.OfferWebViewFactory$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    WebView create$lambda$1;
                    create$lambda$1 = OfferWebViewFactory.create$lambda$1((Context) obj2);
                    return create$lambda$1;
                }
            };
        }
        return offerWebViewFactory.create(context, offerWebLoadSpec, offerWebViewBridgeHandler, function02, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView create$lambda$1(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new WebView(it);
    }

    public final WebView create(Context context, OfferWebLoadSpec loadSpec, OfferWebViewBridgeHandler bridgeHandler, final Function0<Unit> onContentReady, Function1<? super Context, ? extends WebView> webViewProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loadSpec, "loadSpec");
        Intrinsics.checkNotNullParameter(bridgeHandler, "bridgeHandler");
        Intrinsics.checkNotNullParameter(onContentReady, "onContentReady");
        Intrinsics.checkNotNullParameter(webViewProvider, "webViewProvider");
        WebView invoke = webViewProvider.invoke(context);
        WebViewDialogStateGuard.INSTANCE.applyStateless(invoke);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        invoke.setBackgroundColor(0);
        WebSettings settings = invoke.getSettings();
        settings.setJavaScriptEnabled(this.config.getJavascriptEnabled());
        settings.setDomStorageEnabled(this.config.getDomStorageEnabled());
        settings.setAllowFileAccess(this.config.getAllowFileAccess());
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        if (this.config.getCacheRemoteResources()) {
            settings.setCacheMode(-1);
        }
        invoke.addJavascriptInterface(new OfferWebViewBridgeImpl(bridgeHandler), "Android");
        invoke.setWebChromeClient(new WebChromeClient());
        final Context applicationContext = context.getApplicationContext();
        if (loadSpec instanceof OfferWebLoadSpec.InlineHtml) {
            invoke.setWebViewClient(new WebViewClient() { // from class: org.betup.ui.dialogs.offer.webview.OfferWebViewFactory$create$3$2
                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                    WebResourceResponse create$lambda$4$interceptIfNeeded;
                    create$lambda$4$interceptIfNeeded = OfferWebViewFactory.create$lambda$4$interceptIfNeeded(OfferWebViewFactory.this, applicationContext, request);
                    return create$lambda$4$interceptIfNeeded == null ? super.shouldInterceptRequest(view, request) : create$lambda$4$interceptIfNeeded;
                }

                @Override // android.webkit.WebViewClient
                public void onPageCommitVisible(WebView view, String url) {
                    super.onPageCommitVisible(view, url);
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    OfferWebViewFactory.create$lambda$4$notifyContentReadyOnce(booleanRef, onContentReady);
                }
            });
            invoke.loadDataWithBaseURL(this.config.getBaseUrl(), ((OfferWebLoadSpec.InlineHtml) loadSpec).getHtml(), this.config.getMimeType(), this.config.getCharset(), null);
        } else {
            if (!(loadSpec instanceof OfferWebLoadSpec.RemoteUrl)) {
                throw new NoWhenBranchMatchedException();
            }
            OfferWebLoadSpec.RemoteUrl remoteUrl = (OfferWebLoadSpec.RemoteUrl) loadSpec;
            final OfferWebPriceInjection priceInjection = remoteUrl.getPriceInjection();
            invoke.setWebViewClient(new WebViewClient() { // from class: org.betup.ui.dialogs.offer.webview.OfferWebViewFactory$create$3$3
                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                    WebResourceResponse create$lambda$4$interceptIfNeeded;
                    create$lambda$4$interceptIfNeeded = OfferWebViewFactory.create$lambda$4$interceptIfNeeded(OfferWebViewFactory.this, applicationContext, request);
                    return create$lambda$4$interceptIfNeeded == null ? super.shouldInterceptRequest(view, request) : create$lambda$4$interceptIfNeeded;
                }

                @Override // android.webkit.WebViewClient
                public void onPageCommitVisible(WebView view, String url) {
                    super.onPageCommitVisible(view, url);
                    OfferWebViewFactory.create$lambda$4$injectIfNeeded(priceInjection, view);
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    OfferWebViewFactory.create$lambda$4$notifyContentReadyOnce(booleanRef, onContentReady);
                    OfferWebViewFactory.create$lambda$4$injectIfNeeded(priceInjection, view);
                }
            });
            String prefetchedDocumentHtml = remoteUrl.getPrefetchedDocumentHtml();
            String str = (prefetchedDocumentHtml == null || StringsKt.isBlank(prefetchedDocumentHtml)) ? null : prefetchedDocumentHtml;
            String url = remoteUrl.getUrl();
            if (str != null) {
                invoke.loadDataWithBaseURL(url, str, this.config.getMimeType(), this.config.getCharset(), null);
            } else {
                invoke.loadUrl(url);
            }
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$4$notifyContentReadyOnce(Ref.BooleanRef booleanRef, Function0<Unit> function0) {
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebResourceResponse create$lambda$4$interceptIfNeeded(OfferWebViewFactory offerWebViewFactory, Context context, WebResourceRequest webResourceRequest) {
        if (!offerWebViewFactory.config.getCacheRemoteResources() || webResourceRequest == null) {
            return null;
        }
        Uri url = webResourceRequest.getUrl();
        String uri = url != null ? url.toString() : null;
        if (uri == null) {
            uri = "";
        }
        ShopHtmlAssetCache shopHtmlAssetCache = ShopHtmlAssetCache.INSTANCE;
        Intrinsics.checkNotNull(context);
        return shopHtmlAssetCache.intercept(context, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$4$injectIfNeeded(OfferWebPriceInjection offerWebPriceInjection, WebView webView) {
        if (webView == null || offerWebPriceInjection == null) {
            return;
        }
        if (offerWebPriceInjection.getOldPriceElementIds().isEmpty() && offerWebPriceInjection.getNewPriceElementIds().isEmpty()) {
            return;
        }
        webView.evaluateJavascript(INSTANCE.buildPriceInjectionScript(offerWebPriceInjection), null);
    }

    /* compiled from: OfferWebViewFactory.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/offer/webview/OfferWebViewFactory$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "BRIDGE_OBJECT_NAME", "", "buildPriceInjectionScript", "injection", "Lorg/betup/ui/dialogs/offer/webview/OfferWebPriceInjection;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String buildPriceInjectionScript(OfferWebPriceInjection injection) {
            Intrinsics.checkNotNullParameter(injection, "injection");
            String jSONArray = new JSONArray((Collection) injection.getOldPriceElementIds()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            String jSONArray2 = new JSONArray((Collection) injection.getNewPriceElementIds()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
            String formattedOldPrice = injection.getFormattedOldPrice();
            if (formattedOldPrice == null) {
                formattedOldPrice = "";
            }
            return StringsKt.replace$default(StringsKt.trimIndent("\n                (function(){\n                  var oids=" + jSONArray + ";\n                  var nids=" + jSONArray2 + ";\n                  var op=" + JSONObject.quote(formattedOldPrice) + ";\n                  var np=" + JSONObject.quote(injection.getFormattedNewPrice()) + ";\n                  oids.forEach(function(id){var e=document.getElementById(id);if(e)e.textContent=op;});\n                  nids.forEach(function(id){var e=document.getElementById(id);if(e)e.textContent=np;});\n                })();\n            "), "\n", "", false, 4, (Object) null);
        }
    }
}
