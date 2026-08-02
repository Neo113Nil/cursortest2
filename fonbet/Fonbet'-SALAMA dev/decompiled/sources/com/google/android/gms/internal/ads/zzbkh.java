package com.google.android.gms.internal.ads;

import J2.j;
import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class zzbkh extends zzbju {
    public static final /* synthetic */ int zza = 0;
    private WebViewClient zzb;
    private final C2.a zzc;
    private final WebView zzd;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.zzbkg] */
    public zzbkh(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzfth.zzf(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new C2.a(context, new C2.b() { // from class: com.google.android.gms.internal.ads.zzbkg
            @Override // C2.b
            public final void onH5AdsEvent(String str) {
                int i7 = zzbkh.zza;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        j.d("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (zzc(webView) && !this.zzc.f1567a.zzb(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.f1567a.zzb(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.zzc.f1567a.zza();
    }

    public final void zzb(WebViewClient webViewClient) {
        zzfth.zzf(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!zzc(webView)) {
            return false;
        }
        if (this.zzc.f1567a.zzb(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
