package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfxc extends WebViewClient {
    final /* synthetic */ zzfxe zza;

    zzfxc(zzfxe zzfxeVar) {
        Objects.requireNonNull(zzfxeVar);
        this.zza = zzfxeVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String obj = renderProcessGoneDetail.toString();
        String valueOf = String.valueOf(webView);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 36 + String.valueOf(valueOf).length());
        sb.append("WebView renderer gone: ");
        sb.append(obj);
        sb.append("for WebView: ");
        sb.append(valueOf);
        Log.w("NativeBridge", sb.toString());
        zzfxe zzfxeVar = this.zza;
        if (zzfxeVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfxeVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
