package sg.bigo.ads.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class E0 extends sg.bigo.ads.E1.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12815a = false;
    public final /* synthetic */ Context b;
    public final /* synthetic */ sg.bigo.ads.C.l c;
    public final /* synthetic */ sg.bigo.ads.P.c d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Y0 f;

    public E0(Y0 y0, Context context, sg.bigo.ads.C.l lVar, sg.bigo.ads.P.c cVar, boolean z) {
        this.f = y0;
        this.b = context;
        this.c = lVar;
        this.d = cVar;
        this.e = z;
    }

    @Override // sg.bigo.ads.E1.h
    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
        sg.bigo.ads.s1.b.a(3002, 10105, "[MidPage] The render process was gone.", (sg.bigo.ads.P.c) null);
        if (this.f12815a) {
            return;
        }
        this.f12815a = true;
        Y0 y0 = this.f;
        Context context = this.b;
        sg.bigo.ads.C.l lVar = this.c;
        sg.bigo.ads.P.c cVar = this.d;
        y0.x = 1;
        AbstractC5446j.b(new G0(y0, context, lVar, cVar));
        this.f.L.a(this.d, this.e, -1, "onRenderProcessGone");
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f12815a) {
            return;
        }
        this.f12815a = true;
        this.f.a(1, this.e);
        X0 x0 = this.f.L;
        sg.bigo.ads.P.c cVar = this.d;
        boolean z = this.e;
        if (x0.b || x0.f12862a <= 0) {
            return;
        }
        x0.b = true;
        sg.bigo.ads.s1.b.a(cVar, X0.a(1, z), 3, (String) null, SystemClock.elapsedRealtime() - x0.f12862a, false, 0, (String) null);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f12815a) {
            return;
        }
        this.f12815a = true;
        Y0 y0 = this.f;
        Context context = this.b;
        sg.bigo.ads.C.l lVar = this.c;
        sg.bigo.ads.P.c cVar = this.d;
        y0.x = 1;
        AbstractC5446j.b(new G0(y0, context, lVar, cVar));
        if (webResourceError == null) {
            this.f.L.a(this.d, this.e, -1, "onReceivedError");
        } else {
            CharSequence description = webResourceError.getDescription();
            this.f.L.a(this.d, this.e, webResourceError.getErrorCode(), description == null ? "null" : description.toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return true;
    }
}
