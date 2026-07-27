package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzblm;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbf extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    zzbf(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        Objects.requireNonNull(taggingLibraryJsInterface);
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        String.valueOf(str);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String concat = ((Boolean) zzblm.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zze().zzb().toString()) : "";
        String str2 = this.zza;
        Locale locale = Locale.getDefault();
        zzbkq zzbkqVar = zzblm.zze;
        final String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) zzbkqVar.zze()).booleanValue() ? ((Long) zzblm.zzh.zze()).longValue() : 0L), concat);
        if (((Boolean) zzbkqVar.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbf.this.zzb.zzc().evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(format, null);
        }
        if (((Boolean) zzblm.zzc.zze()).booleanValue() && ((Boolean) zzblm.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        final String format;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            if (((Boolean) zzblm.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzb.zze().zzb());
            }
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzblm.zze.zze()).booleanValue() ? ((Long) zzblm.zzh.zze()).longValue() : 0L);
            jSONObject.put("signal", query);
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String concat = ((Boolean) zzblm.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zze().zzb().toString()) : "";
            format = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.zza, queryInfo.getQuery(), Long.valueOf(((Boolean) zzblm.zze.zze()).booleanValue() ? ((Long) zzblm.zzh.zze()).longValue() : 0L), concat);
        }
        if (((Boolean) zzblm.zze.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbf.this.zzb.zzc().evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(format, null);
        }
        if (((Boolean) zzblm.zzc.zze()).booleanValue() && ((Boolean) zzblm.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zzb();
        }
    }
}
