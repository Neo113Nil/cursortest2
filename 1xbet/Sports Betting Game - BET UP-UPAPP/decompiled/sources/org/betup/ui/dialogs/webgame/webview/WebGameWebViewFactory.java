package org.betup.ui.dialogs.webgame.webview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.betup.ui.dialogs.offer.webview.OfferWebViewConfig;
import org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeHandler;
import org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeImpl;
import org.betup.utils.WebViewDialogStateGuard;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WebGameWebViewFactory.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/dialogs/webgame/webview/WebGameWebViewFactory;", "", "config", "Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;)V", "create", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "url", "", "bridgeHandler", "Lorg/betup/ui/dialogs/webgame/bridge/BetupWebGameBridgeHandler;", "onContentReady", "Lkotlin/Function0;", "", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebGameWebViewFactory {
    public static final int $stable = 0;
    public static final String BRIDGE_OBJECT_NAME = "BetupWebGame";
    private final OfferWebViewConfig config;

    /* JADX WARN: Multi-variable type inference failed */
    public WebGameWebViewFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public WebGameWebViewFactory(OfferWebViewConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    public /* synthetic */ WebGameWebViewFactory(OfferWebViewConfig offerWebViewConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OfferWebViewConfig.INSTANCE.getDEFAULT() : offerWebViewConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebView create$default(WebGameWebViewFactory webGameWebViewFactory, Context context, String str, BetupWebGameBridgeHandler betupWebGameBridgeHandler, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: org.betup.ui.dialogs.webgame.webview.WebGameWebViewFactory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        return webGameWebViewFactory.create(context, str, betupWebGameBridgeHandler, function0);
    }

    public final WebView create(Context context, String url, BetupWebGameBridgeHandler bridgeHandler, final Function0<Unit> onContentReady) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bridgeHandler, "bridgeHandler");
        Intrinsics.checkNotNullParameter(onContentReady, "onContentReady");
        WebView webView = new WebView(context);
        WebViewDialogStateGuard.INSTANCE.applyStateless(webView);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        webView.setBackgroundColor(-16777216);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(this.config.getJavascriptEnabled());
        settings.setDomStorageEnabled(this.config.getDomStorageEnabled());
        settings.setAllowFileAccess(this.config.getAllowFileAccess());
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(false);
        webView.addJavascriptInterface(new BetupWebGameBridgeImpl(bridgeHandler), BRIDGE_OBJECT_NAME);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() { // from class: org.betup.ui.dialogs.webgame.webview.WebGameWebViewFactory$create$2$2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url2) {
                super.onPageFinished(view, url2);
                WebGameWebViewFactory.create$lambda$2$notifyContentReadyOnce(Ref.BooleanRef.this, onContentReady);
            }
        });
        webView.loadUrl(url);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$2$notifyContentReadyOnce(Ref.BooleanRef booleanRef, Function0<Unit> function0) {
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        function0.invoke();
    }
}
