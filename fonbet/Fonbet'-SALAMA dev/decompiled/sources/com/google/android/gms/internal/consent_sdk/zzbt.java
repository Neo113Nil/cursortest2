package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
final class zzbt extends WebViewClient {
    final /* synthetic */ zzbv zza;

    public /* synthetic */ zzbt(zzbv zzbvVar, zzbu zzbuVar) {
        this.zza = zzbvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzcb zzcbVar;
        zzbv zzbvVar = this.zza;
        if (zzbv.zzf(zzbvVar, str)) {
            zzcbVar = zzbvVar.zzb;
            zzcbVar.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z4;
        zzbv zzbvVar = this.zza;
        z4 = zzbvVar.zzc;
        if (z4) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbvVar.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        zzcb zzcbVar;
        zzcbVar = this.zza.zzb;
        zzcbVar.zzf(i7, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zzcb zzcbVar;
        String uri = webResourceRequest.getUrl().toString();
        zzbv zzbvVar = this.zza;
        if (!zzbv.zzf(zzbvVar, uri)) {
            return false;
        }
        zzcbVar = zzbvVar.zzb;
        zzcbVar.zze(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzcb zzcbVar;
        zzbv zzbvVar = this.zza;
        if (!zzbv.zzf(zzbvVar, str)) {
            return false;
        }
        zzcbVar = zzbvVar.zzb;
        zzcbVar.zze(str);
        return true;
    }
}
