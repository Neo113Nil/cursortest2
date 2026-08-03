package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zza {
    private final android.content.Context zza;
    private final android.content.pm.ApplicationInfo zzb;
    private final java.util.List zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final org.json.JSONObject zze = new org.json.JSONObject();
    private final java.util.concurrent.atomic.AtomicBoolean zzf = new java.util.concurrent.atomic.AtomicBoolean(false);

    zza(android.content.Context context, com.google.android.gms.internal.ads.zzbia zzbiaVar, java.util.List list, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        this.zzc = list;
        this.zzd = versionInfoParcel;
    }

    public final void zza(android.webkit.WebView webView) {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        android.content.pm.PackageInfo packageInfo = null;
        try {
            android.content.pm.ApplicationInfo applicationInfo = this.zzb;
            if (applicationInfo != null) {
                packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zza).getPackageInfo(applicationInfo.packageName, 0);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            try {
                org.json.JSONObject jSONObject = this.zze;
                jSONObject.put("vc", packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PawAppSignalGenerator.initialize");
            }
        }
        android.content.pm.ApplicationInfo applicationInfo2 = this.zzb;
        if (applicationInfo2 != null) {
            this.zze.put("pn", applicationInfo2.packageName);
        }
        org.json.JSONObject jSONObject2 = this.zze;
        java.util.List list = this.zzc;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : ((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlj)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject2.put("eid", arrayList);
        jSONObject2.put("js", this.zzd.afmaVersion);
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject2.get(next);
            if (obj != null) {
                jSONObject2.put(next, android.util.Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzb.zze()).booleanValue() && androidx.webkit.WebViewFeature.isFeatureSupported(androidx.webkit.WebViewFeature.DOCUMENT_START_SCRIPT) && webView != null) {
            androidx.webkit.WebViewCompat.addDocumentStartJavaScript(webView, java.lang.String.format(java.util.Locale.getDefault(), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzli), zzb()), com.google.android.gms.internal.ads.zzgww.zzi("*"));
        }
    }

    public final org.json.JSONObject zzb() {
        if (!this.zzf.get()) {
            zza(null);
        }
        return this.zze;
    }
}
