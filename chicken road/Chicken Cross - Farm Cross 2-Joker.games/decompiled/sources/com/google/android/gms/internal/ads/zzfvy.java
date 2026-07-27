package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfvy {
    private final zzfwa zza;
    private final WebView zzb;
    private zzfyb zzc;
    private final HashMap zzd;
    private final zzfwo zze;

    private zzfvy(zzfwa zzfwaVar, WebView webView, boolean z) {
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        this.zze = new zzfwo();
        zzfxk.zza();
        this.zza = zzfwaVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((zzfvm) it.next()).zzb(webView);
            }
            this.zzc = new zzfyb(webView);
        }
        if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        WebViewCompat.addWebMessageListener(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfvw(this));
    }

    public static zzfvy zza(zzfwa zzfwaVar, WebView webView, boolean z) {
        return new zzfvy(zzfwaVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        WebViewCompat.removeWebMessageListener(this.zzb, "omidJsSessionService");
    }

    public final void zzb(zzfvx zzfvxVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfvm) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfvv(this, zzfvxVar, timer), 1000L);
    }

    final View zzc() {
        zzfyb zzfybVar = this.zzc;
        if (zzfybVar == null) {
            return null;
        }
        return (View) zzfybVar.get();
    }

    public final void zzd(View view, zzfvt zzfvtVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfvm) it.next()).zzd(view, zzfvtVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfvtVar, "Ad overlay");
    }

    final /* synthetic */ void zzf(String str) {
        zzfvr zzfvrVar = zzfvr.DEFINED_BY_JAVASCRIPT;
        zzfvu zzfvuVar = zzfvu.DEFINED_BY_JAVASCRIPT;
        zzfvz zzfvzVar = zzfvz.JAVASCRIPT;
        zzfvq zzfvqVar = new zzfvq(zzfvn.zza(zzfvrVar, zzfvuVar, zzfvzVar, zzfvzVar, false), zzfvo.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzfvqVar);
        zzfvqVar.zzb(zzc());
        for (zzfwn zzfwnVar : this.zze.zza()) {
            zzfvqVar.zzd((View) zzfwnVar.zza().get(), zzfwnVar.zzc(), zzfwnVar.zzd());
        }
        zzfvqVar.zza();
    }

    final /* synthetic */ void zzg(String str) {
        HashMap hashMap = this.zzd;
        zzfvm zzfvmVar = (zzfvm) hashMap.get(str);
        if (zzfvmVar != null) {
            zzfvmVar.zzc();
            hashMap.remove(str);
        }
    }
}
