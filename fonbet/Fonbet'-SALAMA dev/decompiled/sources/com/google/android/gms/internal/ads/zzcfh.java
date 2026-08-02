package com.google.android.gms.internal.ads;

import I2.J;
import I2.P;
import J2.j;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* loaded from: classes.dex */
public final class zzcfh {
    private final zzcfi zza;
    private final zzcfg zzb;

    public zzcfh(zzcfi zzcfiVar, zzcfg zzcfgVar) {
        this.zzb = zzcfgVar;
        this.zza = zzcfiVar;
    }

    public static /* synthetic */ void zza(zzcfh zzcfhVar, String str) {
        Uri parse = Uri.parse(str);
        zzcej zzaO = ((zzcfa) zzcfhVar.zzb.zza).zzaO();
        if (zzaO != null) {
            zzaO.zzn(parse);
        } else {
            int i7 = J.f3546b;
            j.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            J.k("Click string is empty, not proceeding.");
            return "";
        }
        zzauo zzI = ((zzcfo) this.zza).zzI();
        if (zzI == null) {
            J.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzauj zzc = zzI.zzc();
        if (zzc == null) {
            J.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            J.k("Context is null, ignoring.");
            return "";
        }
        zzcfi zzcfiVar = this.zza;
        return zzc.zze(zzcfiVar.getContext(), str, ((zzcfq) zzcfiVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzauo zzI = ((zzcfo) this.zza).zzI();
        if (zzI == null) {
            J.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzauj zzc = zzI.zzc();
        if (zzc == null) {
            J.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            J.k("Context is null, ignoring.");
            return "";
        }
        zzcfi zzcfiVar = this.zza;
        return zzc.zzh(zzcfiVar.getContext(), ((zzcfq) zzcfiVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfh.zza(zzcfh.this, str);
                }
            });
        } else {
            int i7 = J.f3546b;
            j.g("URL is empty, ignoring message");
        }
    }
}
