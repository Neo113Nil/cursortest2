package sg.bigo.ads.j1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ProgressBar;
import io.ktor.sse.ServerSentEventKt;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class f extends sg.bigo.ads.E1.h {

    /* renamed from: a, reason: collision with root package name */
    public int f13010a;
    public final /* synthetic */ h b;

    public f(h hVar) {
        this.b = hVar;
    }

    @Override // sg.bigo.ads.E1.h
    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
        sg.bigo.ads.s1.b.a(3002, 10105, "The render process was gone.", (sg.bigo.ads.P.c) null);
        this.b.g(0);
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ProgressBar progressBar = this.b.e;
        if (progressBar != null) {
            progressBar.setAlpha(0.0f);
        }
        this.b.b(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ProgressBar progressBar = this.b.e;
        boolean z = false;
        if (progressBar != null) {
            progressBar.animate().alpha(1.0f).setDuration(100L).setListener(null);
            this.b.e.setProgress(0);
        }
        h hVar = this.b;
        if (hVar.j < 0) {
            hVar.j = SystemClock.elapsedRealtime();
            z = true;
        }
        this.b.a(str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AbstractC5496a.b("WebView", "onReceivedError: " + i + ServerSentEventKt.SPACE + str);
        this.b.c(str2);
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        boolean z2;
        h hVar;
        this.f13010a++;
        h hVar2 = this.b;
        boolean z3 = hVar2.j >= 0 && hVar2.l;
        hVar2.r = z3;
        if (hVar2.k) {
            return true;
        }
        hVar2.f(str);
        if (!z3 && this.f13010a > 1) {
            this.b.a(str);
        }
        if (b.a(str)) {
            h hVar3 = this.b;
            sg.bigo.ads.P.f fVar = new sg.bigo.ads.P.f();
            hVar3.p = fVar;
            fVar.e = hVar3.q;
            Uri parse = Uri.parse(str);
            h hVar4 = this.b;
            Activity activity = hVar4.f12687a;
            boolean a2 = b.a(parse, activity, activity, hVar4.p, hVar4.n, hVar4.o, 1, hVar4.q);
            h hVar5 = this.b;
            hVar5.a(hVar5.p);
            if (!a2 || z3) {
                return a2;
            }
            this.b.a(2, str);
            onPageFinished(webView, str);
            this.b.g(0);
            return a2;
        }
        if (str.startsWith("intent://")) {
            try {
                Intent parseUri = Intent.parseUri(str, 1);
                Uri data = parseUri.getData();
                if (data == null || !this.b.a(data, false)) {
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.setComponent(null);
                    parseUri.setSelector(null);
                    try {
                        z = this.b.f12687a.startActivityIfNeeded(parseUri, -1);
                    } catch (Exception unused) {
                        z = false;
                    }
                    if (!z) {
                        AbstractC5496a.b("WebView", "queryIntentActivities: null");
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            if (b.a(stringExtra)) {
                                h hVar6 = this.b;
                                sg.bigo.ads.P.f fVar2 = new sg.bigo.ads.P.f();
                                hVar6.p = fVar2;
                                fVar2.e = hVar6.q;
                                Uri parse2 = Uri.parse(stringExtra);
                                h hVar7 = this.b;
                                Activity activity2 = hVar7.f12687a;
                                z2 = b.a(parse2, activity2, activity2, hVar7.p, hVar7.n, hVar7.o, 1, hVar7.q);
                                h hVar8 = this.b;
                                hVar8.a(hVar8.p);
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                h hVar9 = this.b;
                                hVar9.getClass();
                                z2 = hVar9.a(Uri.parse(stringExtra), true);
                            }
                            if (z2 && !z3) {
                                this.b.a(3, stringExtra);
                                onPageFinished(webView, stringExtra);
                                this.b.g(0);
                            }
                            if (!z2) {
                                webView.loadUrl(stringExtra);
                            }
                            sg.bigo.ads.P.f fVar3 = new sg.bigo.ads.P.f();
                            fVar3.p = stringExtra;
                            this.b.a(fVar3);
                            return true;
                        }
                    } else {
                        if (z3) {
                            return true;
                        }
                        this.b.a(3, str);
                        onPageFinished(webView, str);
                        hVar = this.b;
                    }
                } else {
                    if (z3) {
                        return true;
                    }
                    this.b.a(3, str);
                    onPageFinished(webView, str);
                    hVar = this.b;
                }
                hVar.g(0);
                return true;
            } catch (Exception e) {
                AbstractC5496a.a("WebView", "shouldOverrideUrlLoading: " + e.getMessage());
            }
        } else if (!URLUtil.isValidUrl(str)) {
            h hVar10 = this.b;
            hVar10.getClass();
            if (!hVar10.a(Uri.parse(str), false) || z3) {
                return true;
            }
            this.b.a(3, str);
            onPageFinished(webView, str);
            this.b.g(0);
            return true;
        }
        String d = this.b.d(str);
        if (str.equals(d)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        webView.loadUrl(d);
        return true;
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }
}
