package v1;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;
import z1.C1262a;

/* loaded from: classes.dex */
public final class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10411a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10412b;

    public c(WebViewClient webViewClient) {
        this.f10411a = 2;
        this.f10412b = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z3) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).doUpdateVisitedHistory(webView, str, z3);
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onFormResubmission(webView, message, message2);
                break;
            default:
                super.onFormResubmission(webView, message, message2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onLoadResource(webView, str);
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onPageCommitVisible(webView, str);
                break;
            default:
                super.onPageCommitVisible(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onPageFinished(webView, str);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onPageStarted(webView, str, bitmap);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onReceivedClientCertRequest(webView, clientCertRequest);
                break;
            default:
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i3, String str, String str2) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onReceivedError(webView, i3, str, str2);
                break;
            default:
                super.onReceivedError(webView, i3, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
            default:
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onReceivedLoginRequest(webView, str, str2, str3);
                break;
            default:
                super.onReceivedLoginRequest(webView, str, str2, str3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        switch (this.f10411a) {
            case 0:
                d dVar = (d) this.f10412b;
                dVar.getClass();
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                if (dVar.g() == webView) {
                    dVar.f10407b = new C1262a(null);
                }
                if (webView == null) {
                    return true;
                }
                webView.destroy();
                return true;
            case 1:
                d dVar2 = (d) this.f10412b;
                dVar2.getClass();
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                if (dVar2.g() == webView) {
                    dVar2.f10407b = new C1262a(null);
                }
                if (webView == null) {
                    return true;
                }
                webView.destroy();
                return true;
            default:
                onRenderProcessGone = ((WebViewClient) this.f10412b).onRenderProcessGone(webView, renderProcessGoneDetail);
                return onRenderProcessGone;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i3, SafeBrowsingResponse safeBrowsingResponse) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onSafeBrowsingHit(webView, webResourceRequest, i3, safeBrowsingResponse);
                break;
            default:
                super.onSafeBrowsingHit(webView, webResourceRequest, i3, safeBrowsingResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f3) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onScaleChanged(webView, f, f3);
                break;
            default:
                super.onScaleChanged(webView, f, f3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onUnhandledKeyEvent(webView, keyEvent);
                break;
            default:
                super.onUnhandledKeyEvent(webView, keyEvent);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f10411a) {
            case 2:
                return ((WebViewClient) this.f10412b).shouldInterceptRequest(webView, webResourceRequest);
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.f10411a) {
            case 2:
                return ((WebViewClient) this.f10412b).shouldOverrideKeyEvent(webView, keyEvent);
            default:
                return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f10411a) {
            case 0:
                return F2.b.b(webResourceRequest.getUrl().toString());
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            case 2:
                if (F2.b.b(webResourceRequest.getUrl().toString())) {
                    return true;
                }
                return ((WebViewClient) this.f10412b).shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public /* synthetic */ c(d dVar, int i3) {
        this.f10411a = i3;
        this.f10412b = dVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f10411a) {
            case 2:
                ((WebViewClient) this.f10412b).onReceivedError(webView, webResourceRequest, webResourceError);
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        switch (this.f10411a) {
            case 2:
                return ((WebViewClient) this.f10412b).shouldInterceptRequest(webView, str);
            default:
                return super.shouldInterceptRequest(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f10411a) {
            case 0:
                return F2.b.b(str);
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (F2.b.b(str)) {
                    return true;
                }
                return ((WebViewClient) this.f10412b).shouldOverrideUrlLoading(webView, str);
        }
    }
}
