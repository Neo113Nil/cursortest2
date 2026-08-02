package org.betup.ui.dialogs.interstitial;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.B5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.model.remote.entity.interstitial.InterstitialCampaignDto;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialDismissPolicy;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeImpl;
import org.betup.ui.dialogs.presentation.PresentationHtmlLocale;
import org.betup.utils.WebViewDialogStateGuard;
import org.json.JSONObject;

/* compiled from: InterstitialWebViewDialogFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a>\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0003\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002\u001a \u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u0017"}, d2 = {"configureNativeSkipButton", "", "skipButton", "Landroid/widget/Button;", "configureWebView", "webView", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "campaign", "Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "handler", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;", "dismissPolicy", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;", "onClicked", "Lkotlin/Function0;", "injectInterstitialConfigScript", "", "buildInterstitialConfigAssignment", "normalizeInterstitialHtml", "html", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterstitialWebViewDialogFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureNativeSkipButton(Button button) {
        button.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureWebView(WebView webView, Context context, final InterstitialCampaignDto interstitialCampaignDto, final InterstitialWebViewBridgeHandler interstitialWebViewBridgeHandler, InterstitialDismissPolicy interstitialDismissPolicy, final Function0<Unit> function0) {
        String resolve = PresentationHtmlLocale.INSTANCE.resolve(context);
        String jSONObject = new JSONObject(interstitialCampaignDto.getTemplateMeta()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        Integer skipAfterSeconds = interstitialCampaignDto.getSkipAfterSeconds();
        int coerceAtLeast = RangesKt.coerceAtLeast(skipAfterSeconds != null ? skipAfterSeconds.intValue() : 0, 0);
        WebViewDialogStateGuard.INSTANCE.applyStateless(webView);
        webView.setBackgroundColor(-16777216);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setOverScrollMode(2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.getSettings().setMixedContentMode(2);
        webView.getSettings().setCacheMode(-1);
        String str = null;
        webView.setLayerType(2, null);
        webView.addJavascriptInterface(new InterstitialWebViewBridgeImpl(new InterstitialWebViewBridgeHandler(function0) { // from class: org.betup.ui.dialogs.interstitial.InterstitialWebViewDialogFragmentKt$configureWebView$1
            private final /* synthetic */ InterstitialWebViewBridgeHandler $$delegate_0;
            final /* synthetic */ Function0<Unit> $onClicked;

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public boolean canSkip() {
                return this.$$delegate_0.canSkip();
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onClose() {
                this.$$delegate_0.onClose();
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onPresentationStarted() {
                this.$$delegate_0.onPresentationStarted();
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onSkip() {
                this.$$delegate_0.onSkip();
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onVideoComplete() {
                this.$$delegate_0.onVideoComplete();
            }

            {
                this.$onClicked = function0;
                this.$$delegate_0 = InterstitialWebViewBridgeHandler.this;
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onClick(String targetUrl) {
                this.$onClicked.invoke();
                InterstitialWebViewBridgeHandler.this.onClick(targetUrl);
            }
        }, interstitialDismissPolicy, resolve, interstitialCampaignDto.getAllowSkip(), interstitialCampaignDto.getRequireClickToClose(), coerceAtLeast, jSONObject), "Android");
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() { // from class: org.betup.ui.dialogs.interstitial.InterstitialWebViewDialogFragmentKt$configureWebView$2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                String injectInterstitialConfigScript;
                super.onPageFinished(view, url);
                if (view != null) {
                    injectInterstitialConfigScript = InterstitialWebViewDialogFragmentKt.injectInterstitialConfigScript(InterstitialCampaignDto.this);
                    view.evaluateJavascript(injectInterstitialConfigScript, null);
                }
                if (view != null) {
                    view.evaluateJavascript("window.dispatchEvent(new Event('interstitial:config'));", null);
                }
            }
        });
        String htmlContent = interstitialCampaignDto.getHtmlContent();
        if (htmlContent == null || StringsKt.isBlank(htmlContent)) {
            htmlContent = null;
        }
        String remoteUrl = interstitialCampaignDto.getRemoteUrl();
        if (remoteUrl != null && !StringsKt.isBlank(remoteUrl)) {
            str = remoteUrl;
        }
        if (htmlContent != null) {
            webView.loadDataWithBaseURL("https://betup.app/", normalizeInterstitialHtml(htmlContent, resolve, interstitialCampaignDto), "text/html", B5.O, null);
        } else if (str != null) {
            webView.loadUrl(str);
        } else {
            interstitialWebViewBridgeHandler.onClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String injectInterstitialConfigScript(InterstitialCampaignDto interstitialCampaignDto) {
        return "(function(){ " + buildInterstitialConfigAssignment(interstitialCampaignDto) + " })();";
    }

    private static final String buildInterstitialConfigAssignment(InterstitialCampaignDto interstitialCampaignDto) {
        String obj;
        String replace$default;
        Integer skipAfterSeconds = interstitialCampaignDto.getSkipAfterSeconds();
        int coerceAtLeast = RangesKt.coerceAtLeast(skipAfterSeconds != null ? skipAfterSeconds.intValue() : 0, 0);
        String videoUrl = interstitialCampaignDto.getVideoUrl();
        String str = null;
        if (videoUrl != null && (obj = StringsKt.trim((CharSequence) videoUrl).toString()) != null) {
            String str2 = !StringsKt.isBlank(obj) ? obj : null;
            if (str2 != null && (replace$default = StringsKt.replace$default(str2, "\\", "\\\\", false, 4, (Object) null)) != null) {
                str = StringsKt.replace$default(replace$default, "'", "\\'", false, 4, (Object) null);
            }
        }
        return StringsKt.trimIndent("\n        window.__INTERSTITIAL_CONFIG__ = {\n          allowSkip: " + interstitialCampaignDto.getAllowSkip() + ",\n          requireClickToClose: " + interstitialCampaignDto.getRequireClickToClose() + ",\n          skipAfterSeconds: " + coerceAtLeast + ",\n          videoUrl: " + (str != null ? "'" + str + "'" : AbstractJsonLexerKt.NULL) + "\n        };\n    ");
    }

    private static final String normalizeInterstitialHtml(String str, String str2, InterstitialCampaignDto interstitialCampaignDto) {
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(str2, "\\", "\\\\", false, 4, (Object) null), "'", "\\'", false, 4, (Object) null);
        String str3 = "<script>" + buildInterstitialConfigAssignment(interstitialCampaignDto) + "</script>";
        String str4 = "<script>window.__INTERSTITIAL_LANG__='" + replace$default + "';</script>";
        String str5 = str;
        if (StringsKt.contains((CharSequence) str5, (CharSequence) "</head>", true)) {
            return new Regex("</head>", RegexOption.IGNORE_CASE).replaceFirst(str5, str3 + str4 + "<style>\n  html,body{margin:0;padding:0;width:100%;height:100%;min-height:100dvh;background:#000;}\n</style></head>");
        }
        if (StringsKt.contains((CharSequence) str5, (CharSequence) "<html", true)) {
            return new Regex("(<html[^>]*>)", RegexOption.IGNORE_CASE).replaceFirst(str5, "$1<head>" + str3 + str4 + "<style>\n  html,body{margin:0;padding:0;width:100%;height:100%;min-height:100dvh;background:#000;}\n</style></head>");
        }
        return "<!doctype html><html><head>" + str3 + str4 + "<style>\n  html,body{margin:0;padding:0;width:100%;height:100%;min-height:100dvh;background:#000;}\n</style></head><body>" + str + "</body></html>";
    }
}
