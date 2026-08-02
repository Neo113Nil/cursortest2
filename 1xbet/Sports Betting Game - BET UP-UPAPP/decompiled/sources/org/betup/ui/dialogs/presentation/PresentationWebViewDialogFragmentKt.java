package org.betup.ui.dialogs.presentation;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.B5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.presentation.PresentationCampaignDto;
import org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeHandler;
import org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeImpl;
import org.betup.utils.WebViewDialogStateGuard;

/* compiled from: PresentationWebViewDialogFragment.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0013"}, d2 = {"configureWebView", "", "webView", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "campaign", "Lorg/betup/model/remote/entity/presentation/PresentationCampaignDto;", "handler", "Lorg/betup/ui/dialogs/presentation/bridge/PresentationWebViewBridgeHandler;", "injectPresentationLanguageScript", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "injectPresentationConfigScript", "allowRemindLater", "", "allowSkip", "normalizePresentationHtml", "html", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationWebViewDialogFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureWebView(WebView webView, Context context, final PresentationCampaignDto presentationCampaignDto, PresentationWebViewBridgeHandler presentationWebViewBridgeHandler) {
        final String resolve = PresentationHtmlLocale.INSTANCE.resolve(context);
        WebViewDialogStateGuard.INSTANCE.applyStateless(webView);
        webView.setBackgroundColor(0);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setOverScrollMode(2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setSupportZoom(false);
        webView.addJavascriptInterface(new PresentationWebViewBridgeImpl(presentationWebViewBridgeHandler, resolve, presentationCampaignDto.getAllowRemindLater(), presentationCampaignDto.getAllowSkip()), "Android");
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() { // from class: org.betup.ui.dialogs.presentation.PresentationWebViewDialogFragmentKt$configureWebView$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                String injectPresentationConfigScript;
                String injectPresentationLanguageScript;
                super.onPageFinished(view, url);
                if (view != null) {
                    injectPresentationLanguageScript = PresentationWebViewDialogFragmentKt.injectPresentationLanguageScript(resolve);
                    view.evaluateJavascript(injectPresentationLanguageScript, null);
                }
                if (view != null) {
                    injectPresentationConfigScript = PresentationWebViewDialogFragmentKt.injectPresentationConfigScript(presentationCampaignDto.getAllowRemindLater(), presentationCampaignDto.getAllowSkip());
                    view.evaluateJavascript(injectPresentationConfigScript, null);
                }
            }
        });
        String htmlContent = presentationCampaignDto.getHtmlContent();
        String str = null;
        if (htmlContent == null || StringsKt.isBlank(htmlContent)) {
            htmlContent = null;
        }
        String remoteUrl = presentationCampaignDto.getRemoteUrl();
        if (remoteUrl != null && !StringsKt.isBlank(remoteUrl)) {
            str = remoteUrl;
        }
        if (htmlContent != null) {
            webView.loadDataWithBaseURL("https://betup.app/", normalizePresentationHtml(htmlContent, resolve), "text/html", B5.O, null);
        } else if (str != null) {
            webView.loadUrl(str);
        } else {
            presentationWebViewBridgeHandler.onClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String injectPresentationLanguageScript(String str) {
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(str, "\\", "\\\\", false, 4, (Object) null), "'", "\\'", false, 4, (Object) null);
        return StringsKt.trimIndent("\n        (function(){\n          window.__PRESENTATION_LANG__ = '" + replace$default + "';\n          if (typeof window.applyPresentationLanguage === 'function') {\n            window.applyPresentationLanguage('" + replace$default + "');\n          }\n        })();\n    ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String injectPresentationConfigScript(boolean z, boolean z2) {
        return StringsKt.trimIndent("\n        (function(){\n          window.__PRESENTATION_CONFIG__ = {\n            allowRemindLater: " + z + ",\n            allowSkip: " + z2 + "\n          };\n          if (typeof window.applyPresentationConfig === 'function') {\n            window.applyPresentationConfig(window.__PRESENTATION_CONFIG__);\n          }\n        })();\n    ");
    }

    private static final String normalizePresentationHtml(String str, String str2) {
        String str3;
        String trimIndent = StringsKt.trimIndent("\n        <script>\n          window.__PRESENTATION_LANG__ = '" + StringsKt.replace$default(StringsKt.replace$default(str2, "\\", "\\\\", false, 4, (Object) null), "'", "\\'", false, 4, (Object) null) + "';\n        </script>\n    ");
        Regex regex = new Regex("<body([^>]*)>", RegexOption.IGNORE_CASE);
        String str4 = str;
        if (regex.containsMatchIn(str4)) {
            final String str5 = "margin:0;min-height:100dvh;min-height:calc(var(--app-vh,1vh)*100);height:auto;background:transparent;";
            str3 = regex.replace(str4, new Function1() { // from class: org.betup.ui.dialogs.presentation.PresentationWebViewDialogFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence normalizePresentationHtml$lambda$2;
                    normalizePresentationHtml$lambda$2 = PresentationWebViewDialogFragmentKt.normalizePresentationHtml$lambda$2(str5, (MatchResult) obj);
                    return normalizePresentationHtml$lambda$2;
                }
            });
        } else {
            str3 = "<body style=\"margin:0;min-height:100dvh;min-height:calc(var(--app-vh,1vh)*100);height:auto;background:transparent;\">" + str + "</body>";
        }
        String str6 = str3;
        if (StringsKt.contains((CharSequence) str6, (CharSequence) "</head>", true)) {
            return new Regex("</head>", RegexOption.IGNORE_CASE).replaceFirst(str6, trimIndent + "<style>\n  html,body{\n    margin:0;\n    padding:0;\n    width:100%;\n    min-height:100%;\n    min-height:100dvh;\n    min-height:calc(var(--app-vh,1vh)*100);\n    background:transparent;\n  }\n</style>\n<script>\n  (function(){\n    function setAppVh(){\n      var vh = window.innerHeight * 0.01;\n      document.documentElement.style.setProperty('--app-vh', vh + 'px');\n    }\n    setAppVh();\n    window.addEventListener('resize', setAppVh);\n  })();\n</script></head>");
        }
        if (StringsKt.contains((CharSequence) str6, (CharSequence) "<html", true)) {
            return new Regex("(<html[^>]*>)", RegexOption.IGNORE_CASE).replaceFirst(str6, "$1<head>" + trimIndent + "<style>\n  html,body{\n    margin:0;\n    padding:0;\n    width:100%;\n    min-height:100%;\n    min-height:100dvh;\n    min-height:calc(var(--app-vh,1vh)*100);\n    background:transparent;\n  }\n</style>\n<script>\n  (function(){\n    function setAppVh(){\n      var vh = window.innerHeight * 0.01;\n      document.documentElement.style.setProperty('--app-vh', vh + 'px');\n    }\n    setAppVh();\n    window.addEventListener('resize', setAppVh);\n  })();\n</script></head>");
        }
        return "<!doctype html><html><head>" + trimIndent + "<style>\n  html,body{\n    margin:0;\n    padding:0;\n    width:100%;\n    min-height:100%;\n    min-height:100dvh;\n    min-height:calc(var(--app-vh,1vh)*100);\n    background:transparent;\n  }\n</style>\n<script>\n  (function(){\n    function setAppVh(){\n      var vh = window.innerHeight * 0.01;\n      document.documentElement.style.setProperty('--app-vh', vh + 'px');\n    }\n    setAppVh();\n    window.addEventListener('resize', setAppVh);\n  })();\n</script></head>" + str3 + "</html>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence normalizePresentationHtml$lambda$2(String str, MatchResult match) {
        Intrinsics.checkNotNullParameter(match, "match");
        String str2 = match.getGroupValues().get(1);
        if (StringsKt.contains((CharSequence) str2, (CharSequence) "style=", true)) {
            return "<body" + str2 + ">";
        }
        return "<body" + str2 + " style=\"" + str + "\">";
    }
}
