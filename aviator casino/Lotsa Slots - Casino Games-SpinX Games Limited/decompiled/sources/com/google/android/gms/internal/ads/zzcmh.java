package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzcmh extends com.google.android.gms.internal.ads.zzclf {
    public zzcmh(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzbhp zzbhpVar, boolean z, com.google.android.gms.internal.ads.zzekr zzekrVar) {
        super(zzckuVar, zzbhpVar, z, new com.google.android.gms.internal.ads.zzbyf(zzckuVar, zzckuVar.zzK(), new com.google.android.gms.internal.ads.zzbhx(zzckuVar.getContext())), null, zzekrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final android.webkit.WebResourceResponse zzac(android.webkit.WebView webView, java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        if (!(webView instanceof com.google.android.gms.internal.ads.zzcku)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) webView;
        com.google.android.gms.internal.ads.zzcdn zzcdnVar = this.zzb;
        if (zzcdnVar != null) {
            zzcdnVar.zze(str, map, 1);
        }
        com.google.android.gms.internal.ads.zzfzk.zza();
        com.google.android.gms.internal.ads.zzfzp zzfzpVar = com.google.android.gms.internal.ads.zzfzp.zza;
        if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k.equalsIgnoreCase(new java.io.File(str).getName())) {
            if (map == null) {
                map = java.util.Collections.emptyMap();
            }
            return super.zzL(str, map);
        }
        if (zzckuVar.zzP() != null) {
            zzckuVar.zzP().zzN();
        }
        if (zzckuVar.zzN().zzg()) {
            str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaB);
        } else if (zzckuVar.zzW()) {
            str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaA);
        } else {
            str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaz);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzz(zzckuVar.getContext(), zzckuVar.zzs().afmaVersion, str2);
    }
}
