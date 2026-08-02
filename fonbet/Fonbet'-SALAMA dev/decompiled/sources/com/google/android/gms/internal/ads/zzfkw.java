package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfkw extends zzfks {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfkw(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfks
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfkv(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfks
    public final void zzi(zzfjl zzfjlVar, zzfjj zzfjjVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfjjVar.zzi();
        Iterator it = zzi.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzj(zzfjlVar, zzfjjVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfks
    public final void zzo() {
        WebView webView = new WebView(zzfkh.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfku(this));
        zzn(this.zza);
        zzfkj.zzk(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
