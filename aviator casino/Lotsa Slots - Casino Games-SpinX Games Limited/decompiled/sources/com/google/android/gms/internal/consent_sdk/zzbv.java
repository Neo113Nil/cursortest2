package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzbv extends android.webkit.WebViewClient {
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzbx zza;

    /* synthetic */ zzbv(com.google.android.gms.internal.consent_sdk.zzbx zzbxVar, com.google.android.gms.internal.consent_sdk.zzbw zzbwVar) {
        java.util.Objects.requireNonNull(zzbxVar);
        this.zza = zzbxVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        com.google.android.gms.internal.consent_sdk.zzcd zzcdVar;
        com.google.android.gms.internal.consent_sdk.zzbx zzbxVar = this.zza;
        if (com.google.android.gms.internal.consent_sdk.zzbx.zzf(zzbxVar, str)) {
            zzcdVar = zzbxVar.zzb;
            zzcdVar.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        boolean z;
        com.google.android.gms.internal.consent_sdk.zzbx zzbxVar = this.zza;
        z = zzbxVar.zzc;
        if (z) {
            return;
        }
        android.util.Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbxVar.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.consent_sdk.zzcd zzcdVar;
        zzcdVar = this.zza.zzb;
        zzcdVar.zzf(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            return true;
        }
        java.lang.String str = true != renderProcessGoneDetail.didCrash() ? "was stopped by system" : "crashed";
        android.util.Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + renderProcessGoneDetail.rendererPriorityAtExit());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        com.google.android.gms.internal.consent_sdk.zzcd zzcdVar;
        java.lang.String uri = webResourceRequest.getUrl().toString();
        com.google.android.gms.internal.consent_sdk.zzbx zzbxVar = this.zza;
        if (!com.google.android.gms.internal.consent_sdk.zzbx.zzf(zzbxVar, uri)) {
            return false;
        }
        zzcdVar = zzbxVar.zzb;
        zzcdVar.zze(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.google.android.gms.internal.consent_sdk.zzcd zzcdVar;
        com.google.android.gms.internal.consent_sdk.zzbx zzbxVar = this.zza;
        if (!com.google.android.gms.internal.consent_sdk.zzbx.zzf(zzbxVar, str)) {
            return false;
        }
        zzcdVar = zzbxVar.zzb;
        zzcdVar.zze(str);
        return true;
    }
}
