package sg.bigo.ads.E1;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class h extends WebViewClient {
    public abstract void a(RenderProcessGoneDetail renderProcessGoneDetail);

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView instanceof f) {
            f fVar = (f) webView;
            if (fVar.d) {
                return;
            }
            fVar.d = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webView instanceof f) {
            f fVar = (f) webView;
            if (webResourceError != null) {
                webResourceError.getErrorCode();
            }
            CharSequence description = webResourceError == null ? null : webResourceError.getDescription();
            fVar.getClass();
            if (webResourceRequest != null) {
                Objects.toString(webResourceRequest.getUrl());
                Objects.toString(description);
                d dVar = fVar.e;
                String valueOf = String.valueOf(webResourceRequest.getUrl());
                if (dVar.b == null) {
                    dVar.b = new ArrayList();
                }
                dVar.b.add(valueOf);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webView instanceof f) {
            f fVar = (f) webView;
            if (webResourceResponse != null) {
                webResourceResponse.getStatusCode();
            }
            if (webResourceResponse != null) {
                webResourceResponse.getReasonPhrase();
            }
            fVar.getClass();
            if (webResourceRequest != null) {
                Objects.toString(webResourceRequest.getUrl());
                d dVar = fVar.e;
                String valueOf = String.valueOf(webResourceRequest.getUrl());
                if (dVar.b == null) {
                    dVar.b = new ArrayList();
                }
                dVar.b.add(valueOf);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        a(renderProcessGoneDetail);
        return true;
    }
}
