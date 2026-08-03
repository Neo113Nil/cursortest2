package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfuw {
    private final com.google.android.gms.internal.ads.zzfuy zza;
    private final android.webkit.WebView zzb;
    private com.google.android.gms.internal.ads.zzfwz zzc;
    private final java.util.HashMap zzd;
    private final com.google.android.gms.internal.ads.zzfvm zze;

    private zzfuw(com.google.android.gms.internal.ads.zzfuy zzfuyVar, android.webkit.WebView webView, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.zzd = hashMap;
        this.zze = new com.google.android.gms.internal.ads.zzfvm();
        com.google.android.gms.internal.ads.zzfwi.zza();
        this.zza = zzfuyVar;
        this.zzb = webView;
        if (zzc() != webView) {
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzfuk) it.next()).zzb(webView);
            }
            this.zzc = new com.google.android.gms.internal.ads.zzfwz(webView);
        }
        if (!androidx.webkit.WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            throw new java.lang.UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        androidx.webkit.WebViewCompat.addWebMessageListener(this.zzb, "omidJsSessionService", new java.util.HashSet(java.util.Arrays.asList("*")), new com.google.android.gms.internal.ads.zzfuu(this));
    }

    public static com.google.android.gms.internal.ads.zzfuw zza(com.google.android.gms.internal.ads.zzfuy zzfuyVar, android.webkit.WebView webView, boolean z) {
        return new com.google.android.gms.internal.ads.zzfuw(zzfuyVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        androidx.webkit.WebViewCompat.removeWebMessageListener(this.zzb, "omidJsSessionService");
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfuv zzfuvVar) {
        java.util.Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfuk) it.next()).zzc();
        }
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new com.google.android.gms.internal.ads.zzfut(this, zzfuvVar, timer), 1000L);
    }

    final android.view.View zzc() {
        com.google.android.gms.internal.ads.zzfwz zzfwzVar = this.zzc;
        if (zzfwzVar == null) {
            return null;
        }
        return (android.view.View) zzfwzVar.get();
    }

    public final void zzd(android.view.View view, com.google.android.gms.internal.ads.zzfur zzfurVar, java.lang.String str) {
        java.util.Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfuk) it.next()).zzd(view, zzfurVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfurVar, "Ad overlay");
    }

    final /* synthetic */ void zzf(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfup zzfupVar = com.google.android.gms.internal.ads.zzfup.DEFINED_BY_JAVASCRIPT;
        com.google.android.gms.internal.ads.zzfus zzfusVar = com.google.android.gms.internal.ads.zzfus.DEFINED_BY_JAVASCRIPT;
        com.google.android.gms.internal.ads.zzfux zzfuxVar = com.google.android.gms.internal.ads.zzfux.JAVASCRIPT;
        com.google.android.gms.internal.ads.zzfuo zzfuoVar = new com.google.android.gms.internal.ads.zzfuo(com.google.android.gms.internal.ads.zzful.zza(zzfupVar, zzfusVar, zzfuxVar, zzfuxVar, false), com.google.android.gms.internal.ads.zzfum.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzfuoVar);
        zzfuoVar.zzb(zzc());
        for (com.google.android.gms.internal.ads.zzfvl zzfvlVar : this.zze.zza()) {
            zzfuoVar.zzd((android.view.View) zzfvlVar.zza().get(), zzfvlVar.zzc(), zzfvlVar.zzd());
        }
        zzfuoVar.zza();
    }

    final /* synthetic */ void zzg(java.lang.String str) {
        java.util.HashMap hashMap = this.zzd;
        com.google.android.gms.internal.ads.zzfuk zzfukVar = (com.google.android.gms.internal.ads.zzfuk) hashMap.get(str);
        if (zzfukVar != null) {
            zzfukVar.zzc();
            hashMap.remove(str);
        }
    }
}
