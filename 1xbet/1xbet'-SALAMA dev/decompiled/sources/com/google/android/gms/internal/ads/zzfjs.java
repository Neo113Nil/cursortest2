package com.google.android.gms.internal.ads;

import R0.d;
import R0.w;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class zzfjs {
    private final zzfju zza;
    private final WebView zzb;
    private zzflt zzc;
    private final HashMap zzd;
    private final zzfkg zze;

    private zzfjs(zzfju zzfjuVar, WebView webView, boolean z4) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzfkg();
        zzflc.zza();
        this.zza = zzfjuVar;
        this.zzb = webView;
        if (zza() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfjh) it.next()).zzd(webView);
            }
            this.zzc = new zzflt(webView);
        }
        if (!d.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zzh();
        w.b(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfjr(this));
    }

    public static zzfjs zzb(zzfju zzfjuVar, WebView webView, boolean z4) {
        return new zzfjs(zzfjuVar, webView, true);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzfjs zzfjsVar, String str) {
        zzfjh zzfjhVar = (zzfjh) zzfjsVar.zzd.get(str);
        if (zzfjhVar != null) {
            zzfjhVar.zzc();
            zzfjsVar.zzd.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ void zze(zzfjs zzfjsVar, String str) {
        zzfjm zzfjmVar = zzfjm.DEFINED_BY_JAVASCRIPT;
        zzfjp zzfjpVar = zzfjp.DEFINED_BY_JAVASCRIPT;
        zzfjt zzfjtVar = zzfjt.JAVASCRIPT;
        zzfjl zzfjlVar = new zzfjl(zzfji.zza(zzfjmVar, zzfjpVar, zzfjtVar, zzfjtVar, false), zzfjj.zzb(zzfjsVar.zza, zzfjsVar.zzb, null, null), str);
        zzfjsVar.zzd.put(str, zzfjlVar);
        zzfjlVar.zzd(zzfjsVar.zza());
        for (zzfkf zzfkfVar : zzfjsVar.zze.zza()) {
            zzfjlVar.zzb((View) zzfkfVar.zzb().get(), zzfkfVar.zza(), zzfkfVar.zzc());
        }
        zzfjlVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        WebView webView = this.zzb;
        Uri uri = w.f5874a;
        if (!S0.w.f6276J.b()) {
            throw S0.w.a();
        }
        w.f(webView).f6313a.removeWebMessageListener("omidJsSessionService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() {
        zzflt zzfltVar = this.zzc;
        if (zzfltVar == null) {
            return null;
        }
        return (View) zzfltVar.get();
    }

    public final void zzf(View view, zzfjo zzfjoVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfjh) it.next()).zzb(view, zzfjoVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfjoVar, "Ad overlay");
    }

    public final void zzg(zzces zzcesVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfjh) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfjq(this, zzcesVar, timer), 1000L);
    }
}
