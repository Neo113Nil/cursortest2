package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import R0.d;
import R0.f;
import R0.p;
import S0.B;
import S0.C0431b;
import S0.k;
import S0.s;
import S0.w;
import S0.x;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import t.e;
import w1.L;

/* loaded from: classes2.dex */
public class InAppWebViewClientCompat extends WebViewClientCompat {
    protected static final String LOG_TAG = "IAWebViewClientCompat";
    private static List<URLCredential> credentialsProposed;
    private static int previousAuthRequestFailureCount;
    private InAppBrowserDelegate inAppBrowserDelegate;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy;

        static {
            int[] iArr = new int[NavigationActionPolicy.values().length];
            $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy = iArr;
            try {
                iArr[NavigationActionPolicy.ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy[NavigationActionPolicy.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public InAppWebViewClientCompat(InAppBrowserDelegate inAppBrowserDelegate) {
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void allowShouldOverrideUrlLoading(WebView webView, String str, Map<String, String> map, boolean z4) {
        if (z4) {
            if (map != null) {
                webView.loadUrl(str, map);
            } else {
                webView.loadUrl(str);
            }
        }
    }

    private boolean allowSyncUrlLoading(InAppWebView inAppWebView, String str) {
        Pattern pattern = inAppWebView.customSettings.regexToAllowSyncUrlLoading;
        if (pattern == null || !pattern.matcher(str).matches()) {
            return false;
        }
        Log.d(LOG_TAG, "Request '" + str + "' automatically allowed as it is a match for 'regexToAllowSyncUrlLoading'.");
        return true;
    }

    public void dispose() {
        if (this.inAppBrowserDelegate != null) {
            this.inAppBrowserDelegate = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        super.doUpdateVisitedHistory(webView, str, z4);
        String url = webView.getUrl();
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didUpdateVisitedHistory(url);
        }
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onUpdateVisitedHistory(url, z4);
        }
    }

    public void loadCustomJavaScriptOnPageFinished(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (d.a("DOCUMENT_START_SCRIPT")) {
            return;
        }
        inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentEnd(), null);
    }

    public void loadCustomJavaScriptOnPageStarted(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (d.a("DOCUMENT_START_SCRIPT")) {
            return;
        }
        inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentStart(), null);
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        WebViewChannelDelegate.FormResubmissionCallback formResubmissionCallback = new WebViewChannelDelegate.FormResubmissionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.6
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str, String str2, Object obj) {
                StringBuilder d7 = e.d(str, ", ");
                if (str2 == null) {
                    str2 = "";
                }
                L.m(d7, str2, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((Integer) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(Integer num) {
                InAppWebViewClientCompat.super.onFormResubmission(webView, message, message2);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(Integer num) {
                if (num.intValue() != 0) {
                    message.sendToTarget();
                    return false;
                }
                message2.sendToTarget();
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onFormResubmission(inAppWebView.getUrl(), formResubmissionCallback);
        } else {
            formResubmissionCallback.defaultBehaviour(null);
        }
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onPageCommitVisible(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = false;
        loadCustomJavaScriptOnPageFinished(inAppWebView);
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        super.onPageFinished(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFinishNavigation(str);
        }
        CookieManager.getInstance().flush();
        inAppWebView.evaluateJavascript(JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE(), null);
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onLoadStop(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = true;
        inAppWebView.disposeWebMessageChannels();
        inAppWebView.userContentController.resetContentWorlds();
        loadCustomJavaScriptOnPageStarted(inAppWebView);
        super.onPageStarted(webView, str, bitmap);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didStartNavigation(str);
        }
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onLoadStart(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
        String scheme;
        WebViewChannelDelegate webViewChannelDelegate;
        String url = webView.getUrl();
        String host = clientCertRequest.getHost();
        int port = clientCertRequest.getPort();
        if (url != null) {
            try {
                scheme = new URI(url).getScheme();
            } catch (URISyntaxException e7) {
                Log.e(LOG_TAG, "", e7);
            }
            ClientCertChallenge clientCertChallenge = new ClientCertChallenge(new URLProtectionSpace(host, scheme, null, port, webView.getCertificate(), null), clientCertRequest.getPrincipals(), clientCertRequest.getKeyTypes());
            final InAppWebView inAppWebView = (InAppWebView) webView;
            WebViewChannelDelegate.ReceivedClientCertRequestCallback receivedClientCertRequestCallback = new WebViewChannelDelegate.ReceivedClientCertRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.4
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
                public void error(String str, String str2, Object obj) {
                    StringBuilder d7 = e.d(str, ", ");
                    if (str2 == null) {
                        str2 = "";
                    }
                    L.m(d7, str2, InAppWebViewClientCompat.LOG_TAG);
                    defaultBehaviour((ClientCertResponse) null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public void defaultBehaviour(ClientCertResponse clientCertResponse) {
                    InAppWebViewClientCompat.super.onReceivedClientCertRequest(webView, clientCertRequest);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public boolean nonNullSuccess(ClientCertResponse clientCertResponse) {
                    Integer action = clientCertResponse.getAction();
                    if (action == null || inAppWebView.plugin == null) {
                        return true;
                    }
                    int intValue = action.intValue();
                    if (intValue != 1) {
                        if (intValue != 2) {
                            clientCertRequest.cancel();
                            return false;
                        }
                        clientCertRequest.ignore();
                        return false;
                    }
                    Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(inAppWebView.plugin, clientCertResponse.getCertificatePath(), clientCertResponse.getCertificatePassword(), clientCertResponse.getKeyStoreType());
                    if (loadPrivateKeyAndCertificate != null) {
                        clientCertRequest.proceed(loadPrivateKeyAndCertificate.privateKey, loadPrivateKeyAndCertificate.certificates);
                        return false;
                    }
                    clientCertRequest.cancel();
                    return false;
                }
            };
            webViewChannelDelegate = inAppWebView.channelDelegate;
            if (webViewChannelDelegate == null) {
                webViewChannelDelegate.onReceivedClientCertRequest(clientCertChallenge, receivedClientCertRequestCallback);
                return;
            } else {
                receivedClientCertRequestCallback.defaultBehaviour(null);
                return;
            }
        }
        scheme = "https";
        ClientCertChallenge clientCertChallenge2 = new ClientCertChallenge(new URLProtectionSpace(host, scheme, null, port, webView.getCertificate(), null), clientCertRequest.getPrincipals(), clientCertRequest.getKeyTypes());
        final InAppWebView inAppWebView2 = (InAppWebView) webView;
        WebViewChannelDelegate.ReceivedClientCertRequestCallback receivedClientCertRequestCallback2 = new WebViewChannelDelegate.ReceivedClientCertRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.4
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str, String str2, Object obj) {
                StringBuilder d7 = e.d(str, ", ");
                if (str2 == null) {
                    str2 = "";
                }
                L.m(d7, str2, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((ClientCertResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(ClientCertResponse clientCertResponse) {
                InAppWebViewClientCompat.super.onReceivedClientCertRequest(webView, clientCertRequest);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(ClientCertResponse clientCertResponse) {
                Integer action = clientCertResponse.getAction();
                if (action == null || inAppWebView2.plugin == null) {
                    return true;
                }
                int intValue = action.intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        clientCertRequest.cancel();
                        return false;
                    }
                    clientCertRequest.ignore();
                    return false;
                }
                Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(inAppWebView2.plugin, clientCertResponse.getCertificatePath(), clientCertResponse.getCertificatePassword(), clientCertResponse.getKeyStoreType());
                if (loadPrivateKeyAndCertificate != null) {
                    clientCertRequest.proceed(loadPrivateKeyAndCertificate.privateKey, loadPrivateKeyAndCertificate.certificates);
                    return false;
                }
                clientCertRequest.cancel();
                return false;
            }
        };
        webViewChannelDelegate = inAppWebView2.channelDelegate;
        if (webViewChannelDelegate == null) {
        }
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, p pVar) {
        int i7;
        String str;
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (webResourceRequest.isForMainFrame()) {
            if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
                inAppWebView.stopLoading();
                inAppWebView.loadUrl("about:blank");
            }
            inAppWebView.isLoading = false;
            previousAuthRequestFailureCount = 0;
            credentialsProposed = null;
            if (this.inAppBrowserDelegate != null) {
                if (d.a("WEB_RESOURCE_ERROR_GET_CODE")) {
                    s sVar = (s) pVar;
                    sVar.getClass();
                    w.f6299o.getClass();
                    if (sVar.f6263a == null) {
                        B b7 = x.f6311a;
                        sVar.f6263a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) b7.f6229b).convertWebResourceError(Proxy.getInvocationHandler(sVar.f6264b));
                    }
                    i7 = sVar.f6263a.getErrorCode();
                } else {
                    i7 = -1;
                }
                if (d.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
                    s sVar2 = (s) pVar;
                    sVar2.getClass();
                    w.f6298n.getClass();
                    if (sVar2.f6263a == null) {
                        B b8 = x.f6311a;
                        sVar2.f6263a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) b8.f6229b).convertWebResourceError(Proxy.getInvocationHandler(sVar2.f6264b));
                    }
                    str = sVar2.f6263a.getDescription().toString();
                } else {
                    str = "";
                }
                this.inAppBrowserDelegate.didFailNavigation(webResourceRequest.getUrl().toString(), i7, str);
            }
        }
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceErrorExt.fromWebResourceError(pVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
        int port;
        WebViewChannelDelegate webViewChannelDelegate;
        String url = webView.getUrl();
        String str3 = "https";
        if (url != null) {
            try {
                URI uri = new URI(url);
                str3 = uri.getScheme();
                port = uri.getPort();
            } catch (URISyntaxException e7) {
                Log.e(LOG_TAG, "", e7);
            }
            previousAuthRequestFailureCount++;
            if (credentialsProposed != null) {
                credentialsProposed = CredentialDatabase.getInstance(webView.getContext()).getHttpAuthCredentials(str, str3, str2, Integer.valueOf(port));
            }
            List<URLCredential> list = credentialsProposed;
            HttpAuthenticationChallenge httpAuthenticationChallenge = new HttpAuthenticationChallenge(new URLProtectionSpace(str, str3, str2, port, webView.getCertificate(), null), previousAuthRequestFailureCount, (list != null || list.isEmpty()) ? null : credentialsProposed.get(0));
            final String str4 = str3;
            final int i7 = port;
            WebViewChannelDelegate.ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback = new WebViewChannelDelegate.ReceivedHttpAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.2
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
                public void error(String str5, String str6, Object obj) {
                    StringBuilder d7 = e.d(str5, ", ");
                    if (str6 == null) {
                        str6 = "";
                    }
                    L.m(d7, str6, InAppWebViewClientCompat.LOG_TAG);
                    defaultBehaviour((HttpAuthResponse) null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public void defaultBehaviour(HttpAuthResponse httpAuthResponse) {
                    InAppWebViewClientCompat.super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public boolean nonNullSuccess(HttpAuthResponse httpAuthResponse) {
                    Integer action = httpAuthResponse.getAction();
                    if (action == null) {
                        return true;
                    }
                    int intValue = action.intValue();
                    if (intValue == 1) {
                        String username = httpAuthResponse.getUsername();
                        String password = httpAuthResponse.getPassword();
                        if (httpAuthResponse.isPermanentPersistence()) {
                            CredentialDatabase.getInstance(webView.getContext()).setHttpAuthCredential(str, str4, str2, Integer.valueOf(i7), username, password);
                        }
                        httpAuthHandler.proceed(username, password);
                    } else if (intValue != 2) {
                        List unused = InAppWebViewClientCompat.credentialsProposed = null;
                        int unused2 = InAppWebViewClientCompat.previousAuthRequestFailureCount = 0;
                        httpAuthHandler.cancel();
                    } else if (InAppWebViewClientCompat.credentialsProposed.isEmpty()) {
                        httpAuthHandler.cancel();
                    } else {
                        URLCredential uRLCredential = (URLCredential) InAppWebViewClientCompat.credentialsProposed.remove(0);
                        httpAuthHandler.proceed(uRLCredential.getUsername(), uRLCredential.getPassword());
                    }
                    return false;
                }
            };
            webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
            if (webViewChannelDelegate == null) {
                webViewChannelDelegate.onReceivedHttpAuthRequest(httpAuthenticationChallenge, receivedHttpAuthRequestCallback);
                return;
            } else {
                receivedHttpAuthRequestCallback.defaultBehaviour(null);
                return;
            }
        }
        port = 0;
        previousAuthRequestFailureCount++;
        if (credentialsProposed != null) {
        }
        List<URLCredential> list2 = credentialsProposed;
        HttpAuthenticationChallenge httpAuthenticationChallenge2 = new HttpAuthenticationChallenge(new URLProtectionSpace(str, str3, str2, port, webView.getCertificate(), null), previousAuthRequestFailureCount, (list2 != null || list2.isEmpty()) ? null : credentialsProposed.get(0));
        final String str42 = str3;
        final int i72 = port;
        WebViewChannelDelegate.ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback2 = new WebViewChannelDelegate.ReceivedHttpAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.2
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str5, String str6, Object obj) {
                StringBuilder d7 = e.d(str5, ", ");
                if (str6 == null) {
                    str6 = "";
                }
                L.m(d7, str6, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((HttpAuthResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(HttpAuthResponse httpAuthResponse) {
                InAppWebViewClientCompat.super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(HttpAuthResponse httpAuthResponse) {
                Integer action = httpAuthResponse.getAction();
                if (action == null) {
                    return true;
                }
                int intValue = action.intValue();
                if (intValue == 1) {
                    String username = httpAuthResponse.getUsername();
                    String password = httpAuthResponse.getPassword();
                    if (httpAuthResponse.isPermanentPersistence()) {
                        CredentialDatabase.getInstance(webView.getContext()).setHttpAuthCredential(str, str42, str2, Integer.valueOf(i72), username, password);
                    }
                    httpAuthHandler.proceed(username, password);
                } else if (intValue != 2) {
                    List unused = InAppWebViewClientCompat.credentialsProposed = null;
                    int unused2 = InAppWebViewClientCompat.previousAuthRequestFailureCount = 0;
                    httpAuthHandler.cancel();
                } else if (InAppWebViewClientCompat.credentialsProposed.isEmpty()) {
                    httpAuthHandler.cancel();
                } else {
                    URLCredential uRLCredential = (URLCredential) InAppWebViewClientCompat.credentialsProposed.remove(0);
                    httpAuthHandler.proceed(uRLCredential.getUsername(), uRLCredential.getPassword());
                }
                return false;
            }
        };
        webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate == null) {
        }
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedHttpError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceResponseExt.fromWebResourceResponse(webResourceResponse));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedLoginRequest(str, str2, str3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        String str;
        int i7;
        WebViewChannelDelegate webViewChannelDelegate;
        URI uri;
        String str2 = "https";
        try {
            uri = new URI(sslError.getUrl());
            str = uri.getHost();
        } catch (URISyntaxException e7) {
            e = e7;
            str = "";
        }
        try {
            str2 = uri.getScheme();
            i7 = uri.getPort();
        } catch (URISyntaxException e8) {
            e = e8;
            Log.e(LOG_TAG, "", e);
            i7 = 0;
            ServerTrustChallenge serverTrustChallenge = new ServerTrustChallenge(new URLProtectionSpace(str, str2, null, i7, sslError.getCertificate(), sslError));
            WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback = new WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.3
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
                public void error(String str3, String str4, Object obj) {
                    StringBuilder d7 = e.d(str3, ", ");
                    if (str4 == null) {
                        str4 = "";
                    }
                    L.m(d7, str4, InAppWebViewClientCompat.LOG_TAG);
                    defaultBehaviour((ServerTrustAuthResponse) null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public void defaultBehaviour(ServerTrustAuthResponse serverTrustAuthResponse) {
                    InAppWebViewClientCompat.super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public boolean nonNullSuccess(ServerTrustAuthResponse serverTrustAuthResponse) {
                    Integer action = serverTrustAuthResponse.getAction();
                    if (action == null) {
                        return true;
                    }
                    if (action.intValue() != 1) {
                        sslErrorHandler.cancel();
                        return false;
                    }
                    sslErrorHandler.proceed();
                    return false;
                }
            };
            webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
            if (webViewChannelDelegate == null) {
            }
        }
        ServerTrustChallenge serverTrustChallenge2 = new ServerTrustChallenge(new URLProtectionSpace(str, str2, null, i7, sslError.getCertificate(), sslError));
        WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback2 = new WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.3
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str3, String str4, Object obj) {
                StringBuilder d7 = e.d(str3, ", ");
                if (str4 == null) {
                    str4 = "";
                }
                L.m(d7, str4, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((ServerTrustAuthResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(ServerTrustAuthResponse serverTrustAuthResponse) {
                InAppWebViewClientCompat.super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(ServerTrustAuthResponse serverTrustAuthResponse) {
                Integer action = serverTrustAuthResponse.getAction();
                if (action == null) {
                    return true;
                }
                if (action.intValue() != 1) {
                    sslErrorHandler.cancel();
                    return false;
                }
                sslErrorHandler.proceed();
                return false;
            }
        };
        webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate == null) {
            webViewChannelDelegate.onReceivedServerTrustAuthRequest(serverTrustChallenge2, receivedServerTrustAuthRequestCallback2);
        } else {
            receivedServerTrustAuthRequestCallback2.defaultBehaviour(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.customSettings.useOnRenderProcessGone.booleanValue() || inAppWebView.channelDelegate == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        inAppWebView.channelDelegate.onRenderProcessGone(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
        return true;
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onSafeBrowsingHit(final WebView webView, final WebResourceRequest webResourceRequest, final int i7, final f fVar) {
        WebViewChannelDelegate.SafeBrowsingHitCallback safeBrowsingHitCallback = new WebViewChannelDelegate.SafeBrowsingHitCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.5
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str, String str2, Object obj) {
                StringBuilder d7 = e.d(str, ", ");
                if (str2 == null) {
                    str2 = "";
                }
                L.m(d7, str2, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((SafeBrowsingResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(SafeBrowsingResponse safeBrowsingResponse) {
                InAppWebViewClientCompat.super.onSafeBrowsingHit(webView, webResourceRequest, i7, fVar);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(SafeBrowsingResponse safeBrowsingResponse) {
                Integer action = safeBrowsingResponse.getAction();
                if (action != null) {
                    boolean isReport = safeBrowsingResponse.isReport();
                    int intValue = action.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (!d.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
                                return true;
                            }
                            fVar.a(isReport);
                            return false;
                        }
                        if (!d.a("SAFE_BROWSING_RESPONSE_PROCEED")) {
                            return true;
                        }
                        k kVar = (k) fVar;
                        kVar.getClass();
                        C0431b c0431b = w.f6301q;
                        if (c0431b.a()) {
                            kVar.c().proceed(isReport);
                            return false;
                        }
                        if (!c0431b.b()) {
                            throw w.a();
                        }
                        kVar.b().proceed(isReport);
                        return false;
                    }
                    if (d.a("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY")) {
                        k kVar2 = (k) fVar;
                        kVar2.getClass();
                        C0431b c0431b2 = w.f6300p;
                        if (c0431b2.a()) {
                            kVar2.c().backToSafety(isReport);
                            return false;
                        }
                        if (!c0431b2.b()) {
                            throw w.a();
                        }
                        kVar2.b().backToSafety(isReport);
                        return false;
                    }
                }
                return true;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onSafeBrowsingHit(webResourceRequest.getUrl().toString(), i7, safeBrowsingHitCallback);
        } else {
            safeBrowsingHitCallback.defaultBehaviour(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f7, float f8) {
        super.onScaleChanged(webView, f7, f8);
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.zoomScale = f8 / Util.getPixelDensity(inAppWebView.getContext());
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onZoomScaleChanged(f7, f8);
        }
    }

    public void onShouldOverrideUrlLoading(final InAppWebView inAppWebView, final String str, String str2, final Map<String, String> map, final boolean z4, boolean z7, boolean z8) {
        NavigationAction navigationAction = new NavigationAction(new URLRequest(str, str2, null, map), z4, z7, z8);
        WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback = new WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.1
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str3, String str4, Object obj) {
                StringBuilder d7 = e.d(str3, ", ");
                if (str4 == null) {
                    str4 = "";
                }
                L.m(d7, str4, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((NavigationActionPolicy) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(NavigationActionPolicy navigationActionPolicy) {
                InAppWebViewClientCompat.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z4);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(NavigationActionPolicy navigationActionPolicy) {
                if (AnonymousClass7.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy[navigationActionPolicy.ordinal()] != 1) {
                    return false;
                }
                InAppWebViewClientCompat.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z4);
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.shouldOverrideUrlLoading(navigationAction, shouldOverrideUrlLoadingCallback);
        } else {
            shouldOverrideUrlLoadingCallback.defaultBehaviour(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequestExt webResourceRequestExt) {
        CustomSchemeResponse onLoadResourceWithCustomScheme;
        WebResourceResponseExt shouldInterceptRequest;
        InAppWebView inAppWebView = (InAppWebView) webView;
        WebViewAssetLoaderExt webViewAssetLoaderExt = inAppWebView.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt != null && webViewAssetLoaderExt.loader != null) {
            try {
                WebResourceResponse a2 = inAppWebView.webViewAssetLoaderExt.loader.a(Uri.parse(webResourceRequestExt.getUrl()));
                if (a2 != null) {
                    return a2;
                }
            } catch (Exception e7) {
                Log.e(LOG_TAG, "", e7);
            }
        }
        WebResourceResponse webResourceResponse = null;
        if (inAppWebView.customSettings.useShouldInterceptRequest.booleanValue()) {
            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
            if (webViewChannelDelegate != null) {
                try {
                    shouldInterceptRequest = webViewChannelDelegate.shouldInterceptRequest(webResourceRequestExt);
                } catch (InterruptedException e8) {
                    Log.e(LOG_TAG, "", e8);
                    return null;
                }
            } else {
                shouldInterceptRequest = null;
            }
            if (shouldInterceptRequest == null) {
                return null;
            }
            String contentType = shouldInterceptRequest.getContentType();
            String contentEncoding = shouldInterceptRequest.getContentEncoding();
            byte[] data = shouldInterceptRequest.getData();
            Map<String, String> headers = shouldInterceptRequest.getHeaders();
            Integer statusCode = shouldInterceptRequest.getStatusCode();
            String reasonPhrase = shouldInterceptRequest.getReasonPhrase();
            ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
            return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
        }
        String lowerCase = webResourceRequestExt.getUrl().split(":")[0].toLowerCase();
        try {
            lowerCase = Uri.parse(webResourceRequestExt.getUrl()).getScheme();
        } catch (Exception unused) {
        }
        List<String> list = inAppWebView.customSettings.resourceCustomSchemes;
        if (list != null && list.contains(lowerCase)) {
            WebViewChannelDelegate webViewChannelDelegate2 = inAppWebView.channelDelegate;
            if (webViewChannelDelegate2 != null) {
                try {
                    onLoadResourceWithCustomScheme = webViewChannelDelegate2.onLoadResourceWithCustomScheme(webResourceRequestExt);
                } catch (InterruptedException e9) {
                    Log.e(LOG_TAG, "", e9);
                    return null;
                }
            } else {
                onLoadResourceWithCustomScheme = null;
            }
            if (onLoadResourceWithCustomScheme != null) {
                try {
                    webResourceResponse = inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, webResourceRequestExt, onLoadResourceWithCustomScheme.getContentType());
                } catch (Exception e10) {
                    Log.e(LOG_TAG, "", e10);
                }
                return webResourceResponse != null ? webResourceResponse : new WebResourceResponse(onLoadResourceWithCustomScheme.getContentType(), onLoadResourceWithCustomScheme.getContentType(), new ByteArrayInputStream(onLoadResourceWithCustomScheme.getData()));
            }
        }
        if (inAppWebView.contentBlockerHandler.getRuleList().isEmpty()) {
            return null;
        }
        try {
            return inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, webResourceRequestExt);
        } catch (Exception e11) {
            Log.e(LOG_TAG, "", e11);
            return null;
        }
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean isRedirect;
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (allowSyncUrlLoading(inAppWebView, webResourceRequest.getUrl().toString())) {
            return false;
        }
        if (inAppWebView.customSettings.useShouldOverrideUrlLoading.booleanValue()) {
            if (d.a("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
                w.f6297m.getClass();
                isRedirect = webResourceRequest.isRedirect();
            } else {
                isRedirect = webResourceRequest.isRedirect();
            }
            onShouldOverrideUrlLoading(inAppWebView, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.isForMainFrame(), webResourceRequest.hasGesture(), isRedirect);
        }
        if (inAppWebView.customSettings.regexToCancelSubFramesLoading != null && !webResourceRequest.isForMainFrame()) {
            return inAppWebView.customSettings.regexToCancelSubFramesLoading.matcher(webResourceRequest.getUrl().toString()).matches();
        }
        if (inAppWebView.customSettings.useShouldOverrideUrlLoading.booleanValue()) {
            return webResourceRequest.isForMainFrame();
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (allowSyncUrlLoading(inAppWebView, str) || !inAppWebView.customSettings.useShouldOverrideUrlLoading.booleanValue()) {
            return false;
        }
        onShouldOverrideUrlLoading(inAppWebView, str, "GET", null, true, false, false);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return shouldInterceptRequest(webView, new WebResourceRequestExt(str, null, false, false, true, "GET"));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, WebResourceRequestExt.fromWebResourceRequest(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i7, String str, String str2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
            inAppWebView.stopLoading();
            inAppWebView.loadUrl("about:blank");
        }
        inAppWebView.isLoading = false;
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFailNavigation(str2, i7, str);
        }
        WebResourceRequestExt webResourceRequestExt = new WebResourceRequestExt(str2, null, false, false, true, "GET");
        WebResourceErrorExt webResourceErrorExt = new WebResourceErrorExt(i7, str);
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedError(webResourceRequestExt, webResourceErrorExt);
        }
        super.onReceivedError(webView, i7, str, str2);
    }
}
