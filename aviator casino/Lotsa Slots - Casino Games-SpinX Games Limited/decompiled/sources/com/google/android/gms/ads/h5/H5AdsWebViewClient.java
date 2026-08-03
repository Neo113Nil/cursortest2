package com.google.android.gms.ads.h5;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class H5AdsWebViewClient extends com.google.android.gms.internal.ads.zzbqm {
    private final com.google.android.gms.internal.ads.zzbqz zza;

    public H5AdsWebViewClient(android.content.Context context, android.webkit.WebView webView) {
        this.zza = new com.google.android.gms.internal.ads.zzbqz(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    protected android.webkit.WebViewClient getDelegate() {
        return this.zza;
    }

    public android.webkit.WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(android.webkit.WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
