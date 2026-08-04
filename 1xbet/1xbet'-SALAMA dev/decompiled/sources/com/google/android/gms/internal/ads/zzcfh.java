package com.google.android.gms.internal.ads;

import I2.J;
import I2.P;
import J2.j;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes.dex */
public final class zzcfh {
    private final zzcfi zza;
    private final zzcfg zzb;

    public zzcfh(zzcfi zzcfiVar, zzcfg zzcfgVar) {
        this.zzb = zzcfgVar;
        this.zza = zzcfiVar;
    }

    public static /* synthetic */ void zza(zzcfh zzcfhVar, String str) {
        Uri uri = Uri.parse(str);
        zzcej zzcejVarZzaO = ((zzcfa) zzcfhVar.zzb.zza).zzaO();
        if (zzcejVarZzaO != null) {
            zzcejVarZzaO.zzn(uri);
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
        zzauo zzauoVarZzI = ((zzcfo) this.zza).zzI();
        if (zzauoVarZzI == null) {
            J.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzauj zzaujVarZzc = zzauoVarZzI.zzc();
        if (zzaujVarZzc == null) {
            J.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            J.k("Context is null, ignoring.");
            return "";
        }
        zzcfi zzcfiVar = this.zza;
        return zzaujVarZzc.zze(zzcfiVar.getContext(), str, ((zzcfq) zzcfiVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzauo zzauoVarZzI = ((zzcfo) this.zza).zzI();
        if (zzauoVarZzI == null) {
            J.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzauj zzaujVarZzc = zzauoVarZzI.zzc();
        if (zzaujVarZzc == null) {
            J.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            J.k("Context is null, ignoring.");
            return "";
        }
        zzcfi zzcfiVar = this.zza;
        return zzaujVarZzc.zzh(zzcfiVar.getContext(), ((zzcfq) zzcfiVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfh.zza(this.zza, str);
                }
            });
        } else {
            int i7 = J.f3546b;
            j.g("URL is empty, ignoring message");
        }
    }
}
