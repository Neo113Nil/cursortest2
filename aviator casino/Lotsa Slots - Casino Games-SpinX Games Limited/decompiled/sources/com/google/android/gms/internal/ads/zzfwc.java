package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwc extends com.google.android.gms.internal.ads.zzfvy {
    private android.webkit.WebView zza;
    private java.lang.Long zzb;
    private final java.util.Map zzc;

    public zzfwc(java.lang.String str, java.util.Map map, java.lang.String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza() {
        android.webkit.WebView webView = new android.webkit.WebView(com.google.android.gms.internal.ads.zzfvn.zza().zzb());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new com.google.android.gms.internal.ads.zzfwa(this));
        zzc(this.zza);
        com.google.android.gms.internal.ads.zzfvp.zzk(this.zza, null);
        java.util.Map map = this.zzc;
        java.util.Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.zzb = java.lang.Long.valueOf(java.lang.System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zzb() {
        super.zzb();
        new android.os.Handler().postDelayed(new com.google.android.gms.internal.ads.zzfwb(this), java.lang.Math.max(4000 - (this.zzb == null ? 4000L : java.util.concurrent.TimeUnit.MILLISECONDS.convert(java.lang.System.nanoTime() - this.zzb.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zzk(com.google.android.gms.internal.ads.zzfuo zzfuoVar, com.google.android.gms.internal.ads.zzfum zzfumVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map zze = zzfumVar.zze();
        java.util.Iterator it = zze.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzl(zzfuoVar, zzfumVar, jSONObject);
    }

    final /* synthetic */ android.webkit.WebView zzq() {
        return this.zza;
    }
}
