package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import I2.x;
import J2.j;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class zzcfj extends zzcej {
    public zzcfj(zzceb zzcebVar, zzbaw zzbawVar, boolean z4, zzeaq zzeaqVar) {
        super(zzcebVar, zzbawVar, z4, new zzbrr(zzcebVar, zzcebVar.zzE(), new zzbbg(zzcebVar.getContext())), null, zzeaqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzW(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzceb)) {
            int i7 = J.f3546b;
            j.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzceb zzcebVar = (zzceb) webView;
        zzbwy zzbwyVar = this.zza;
        if (zzbwyVar != null) {
            zzbwyVar.zze(str, map, 1);
        }
        zzfom.zza();
        zzfos zzfosVar = zzfos.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return zzc(str, map);
        }
        if (zzcebVar.zzN() != null) {
            zzcebVar.zzN().zzH();
        }
        if (zzcebVar.zzO().zzi()) {
            str2 = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzac);
        } else if (zzcebVar.zzaF()) {
            str2 = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzab);
        } else {
            str2 = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzaa);
        }
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        Context context = zzcebVar.getContext();
        String str3 = zzcebVar.zzm().f10834a;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", oVar.f1957c.x(context, str3));
            hashMap.put("Cache-Control", "max-stale=3600");
            new x(context);
            String str4 = (String) x.a(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str4 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e7) {
            int i8 = J.f3546b;
            j.h("Could not fetch MRAID JS.", e7);
            return null;
        }
    }
}
