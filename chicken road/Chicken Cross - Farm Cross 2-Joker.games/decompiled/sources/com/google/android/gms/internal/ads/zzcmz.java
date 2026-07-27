package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzcmz extends zzclx {
    public zzcmz(zzclm zzclmVar, zzbif zzbifVar, boolean z, zzelp zzelpVar) {
        super(zzclmVar, zzbifVar, z, new zzbyx(zzclmVar, zzclmVar.zzK(), new zzbin(zzclmVar.getContext())), null, zzelpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzac(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzclm)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzclm zzclmVar = (zzclm) webView;
        zzcef zzcefVar = this.zzb;
        if (zzcefVar != null) {
            zzcefVar.zze(str, map, 1);
        }
        zzgam.zza();
        zzgar zzgarVar = zzgar.zza;
        if (!w.k.equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzL(str, map);
        }
        if (zzclmVar.zzP() != null) {
            zzclmVar.zzP().zzN();
        }
        if (zzclmVar.zzN().zzg()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaG);
        } else if (zzclmVar.zzW()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaF);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaE);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzz(zzclmVar.getContext(), zzclmVar.zzs().afmaVersion, str2);
    }
}
