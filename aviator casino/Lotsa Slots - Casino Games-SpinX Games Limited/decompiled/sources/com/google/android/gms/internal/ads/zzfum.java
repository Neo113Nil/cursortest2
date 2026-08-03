package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfum {
    private final com.google.android.gms.internal.ads.zzfuy zza;
    private final android.webkit.WebView zzb;
    private final java.util.List zzc = new java.util.ArrayList();
    private final java.util.Map zzd = new java.util.HashMap();
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final com.google.android.gms.internal.ads.zzfun zzg;

    private zzfum(com.google.android.gms.internal.ads.zzfuy zzfuyVar, android.webkit.WebView webView, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzfun zzfunVar) {
        this.zza = zzfuyVar;
        this.zzb = webView;
        this.zzg = zzfunVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static com.google.android.gms.internal.ads.zzfum zza(com.google.android.gms.internal.ads.zzfuy zzfuyVar, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.google.android.gms.internal.ads.zzfwi.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new com.google.android.gms.internal.ads.zzfum(zzfuyVar, webView, null, null, str, str2, com.google.android.gms.internal.ads.zzfun.HTML);
    }

    public static com.google.android.gms.internal.ads.zzfum zzb(com.google.android.gms.internal.ads.zzfuy zzfuyVar, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfwi.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new com.google.android.gms.internal.ads.zzfum(zzfuyVar, webView, null, null, str, "", com.google.android.gms.internal.ads.zzfun.JAVASCRIPT);
    }

    public final com.google.android.gms.internal.ads.zzfuy zzc() {
        return this.zza;
    }

    public final java.util.List zzd() {
        return java.util.Collections.unmodifiableList(this.zzc);
    }

    public final java.util.Map zze() {
        return java.util.Collections.unmodifiableMap(this.zzd);
    }

    public final android.webkit.WebView zzf() {
        return this.zzb;
    }

    public final java.lang.String zzg() {
        return this.zzf;
    }

    public final java.lang.String zzh() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzfun zzi() {
        return this.zzg;
    }
}
