package com.google.android.recaptcha.internal;

import D6.C0136t;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import t6.h;

/* loaded from: classes.dex */
public final class zzgp extends WebViewClient {
    final /* synthetic */ zzgv zza;

    public zzgp(zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzgz zzgzVar;
        zzgzVar = this.zza.zzj;
        long zza = zzgzVar.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbq.zza;
        zzbq.zza(zzbr.zzg.zza(), zza);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        Map map;
        super.onReceivedError(webView, i7, str, str2);
        zzbh zzbhVar = zzbh.zzc;
        map = this.zza.zzh;
        zzbg zzbgVar = (zzbg) map.get(Integer.valueOf(i7));
        if (zzbgVar == null) {
            zzbgVar = zzbg.zzM;
        }
        zzbj zzbjVar = new zzbj(zzbhVar, zzbgVar, null);
        this.zza.zzu().hashCode();
        zzbjVar.getMessage();
        ((C0136t) this.zza.zzu()).O(zzbjVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        int i7 = zzdt.zza;
        h.b(parse);
        if (!zzdt.zzc(parse) || zzdt.zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzQ, null);
        this.zza.zzu().hashCode();
        parse.toString();
        ((C0136t) this.zza.zzu()).O(zzbjVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
