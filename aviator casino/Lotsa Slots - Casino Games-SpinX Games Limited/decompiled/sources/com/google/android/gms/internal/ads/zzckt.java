package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzckt extends android.webkit.WebChromeClient {
    private final com.google.android.gms.internal.ads.zzcku zza;

    public zzckt(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zza = zzckuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final android.content.Context zzb(android.webkit.WebView webView) {
        if (!(webView instanceof com.google.android.gms.internal.ads.zzcku)) {
            return webView.getContext();
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) webView;
        android.app.Activity zzj = zzckuVar.zzj();
        return zzj != null ? zzj : zzckuVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(android.webkit.WebView webView) {
        if (!(webView instanceof com.google.android.gms.internal.ads.zzcku)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = ((com.google.android.gms.internal.ads.zzcku) webView).zzL();
        if (zzL != null) {
            zzL.zzb();
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String message = consoleMessage.message();
        java.lang.String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        int length = java.lang.String.valueOf(message).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 6 + java.lang.String.valueOf(sourceId).length() + 1 + java.lang.String.valueOf(lineNumber).length() + 1);
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        java.lang.String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = com.google.android.gms.internal.ads.zzcks.zza[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2);
        } else if (i == 2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        } else if (i == 3 || i == 4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        } else if (i != 5) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        } else {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
        android.webkit.WebView.WebViewTransport webViewTransport = (android.webkit.WebView.WebViewTransport) message.obj;
        android.webkit.WebView webView2 = new android.webkit.WebView(webView.getContext());
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar.zzQ() != null) {
            webView2.setWebViewClient(zzckuVar.zzQ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(java.lang.String str, java.lang.String str2, long j, long j2, long j3, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = java.lang.Math.min(j + java.lang.Math.min(android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4), android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } else {
            if (j2 <= java.lang.Math.min(android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!com.google.android.gms.ads.internal.util.zzs.zzD(zzckuVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (!com.google.android.gms.ads.internal.util.zzs.zzD(zzckuVar.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                z = false;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoI)).booleanValue()) {
                    callback.invoke(str, z, true);
                } else {
                    callback.invoke(str, false, true);
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoJ)).booleanValue()) {
                    return;
                }
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
                return;
            }
        }
        z = true;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoI)).booleanValue()) {
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoJ)).booleanValue()) {
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zza.zzL();
        if (zzL != null) {
            zzL.zzc();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @java.lang.Deprecated
    public final void onShowCustomView(android.view.View view, int i, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zza.zzL();
        if (zzL != null) {
            zzL.zzx(view, customViewCallback);
            zzL.zzw(i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        }
    }

    protected final boolean zza(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.webkit.JsResult jsResult, android.webkit.JsPromptResult jsPromptResult, boolean z) {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        com.google.android.gms.ads.internal.zzb zzh;
        try {
            zzckuVar = this.zza;
        } catch (android.view.WindowManager.BadTokenException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to display Dialog.", e);
        }
        if (zzckuVar != null && zzckuVar.zzP() != null && zzckuVar.zzP().zzh() != null && (zzh = zzckuVar.zzP().zzh()) != null && !zzh.zzb()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 9 + java.lang.String.valueOf(str3).length() + 2);
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzh.zzc(sb.toString());
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        android.app.AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
        zzN.setTitle(str2);
        if (z) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            linearLayout.setOrientation(1);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(str3);
            android.widget.EditText editText = new android.widget.EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            zzN.setView(linearLayout).setPositiveButton(android.R.string.ok, new com.google.android.gms.internal.ads.zzckr(jsPromptResult, editText)).setNegativeButton(android.R.string.cancel, new com.google.android.gms.internal.ads.zzckq(jsPromptResult)).setOnCancelListener(new com.google.android.gms.internal.ads.zzckp(jsPromptResult)).create().show();
        } else {
            zzN.setMessage(str3).setPositiveButton(android.R.string.ok, new com.google.android.gms.internal.ads.zzcko(jsResult)).setNegativeButton(android.R.string.cancel, new com.google.android.gms.internal.ads.zzckn(jsResult)).setOnCancelListener(new com.google.android.gms.internal.ads.zzckm(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
