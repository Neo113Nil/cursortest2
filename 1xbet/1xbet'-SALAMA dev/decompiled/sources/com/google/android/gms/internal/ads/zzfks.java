package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.App;
import io.sentry.protocol.OperatingSystem;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzfks {
    private final String zza;
    private zzflu zzb;
    private long zzc;
    private int zzd;

    public zzfks(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzflu(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfkj.zza().zzh(zza(), this.zza, str);
    }

    public final void zze() {
        zzfkj.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzfji zzfjiVar) {
        zzfkj.zza().zzd(zza(), this.zza, zzfjiVar.zzb());
    }

    public final void zzg(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfky.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfkj.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzfkj.zza().zzh(zza(), this.zza, str);
        }
    }

    public void zzi(zzfjl zzfjlVar, zzfjj zzfjjVar) {
        zzj(zzfjlVar, zzfjjVar, null);
    }

    public final void zzj(zzfjl zzfjlVar, zzfjj zzfjjVar, JSONObject jSONObject) {
        String strZzh = zzfjlVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfky.zze(jSONObject2, "environment", App.TYPE);
        zzfky.zze(jSONObject2, "adSessionType", zzfjjVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfky.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfky.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfky.zze(jSONObject3, OperatingSystem.TYPE, "Android");
        zzfky.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfky.zze(jSONObject2, "deviceCategory", zzfkx.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfky.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfky.zze(jSONObject4, "partnerName", zzfjjVar.zze().zzb());
        zzfky.zze(jSONObject4, "partnerVersion", zzfjjVar.zze().zzc());
        zzfky.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfky.zze(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfky.zze(jSONObject5, "appId", zzfkh.zzb().zza().getApplicationContext().getPackageName());
        zzfky.zze(jSONObject2, App.TYPE, jSONObject5);
        if (zzfjjVar.zzf() != null) {
            zzfky.zze(jSONObject2, "contentUrl", zzfjjVar.zzf());
        }
        if (zzfjjVar.zzg() != null) {
            zzfky.zze(jSONObject2, "customReferenceData", zzfjjVar.zzg());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfjjVar.zzh().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfkj.zza().zzj(zza(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzk(boolean z4) {
        if (zzp()) {
            zzfkj.zza().zzi(zza(), this.zza, true != z4 ? ProfilingTraceData.TRUNCATION_REASON_BACKGROUNDED : "foregrounded");
        }
    }

    public final void zzl(float f7) {
        zzfkj.zza().zze(zza(), this.zza, f7);
    }

    public final void zzm(boolean z4) {
        if (zzp()) {
            zzfkj.zza().zzg(zza(), this.zza, true != z4 ? "unlocked" : "locked");
        }
    }

    public final void zzn(WebView webView) {
        this.zzb = new zzflu(webView);
    }

    public void zzo() {
    }

    public final boolean zzp() {
        return this.zzb.get() != 0;
    }
}
