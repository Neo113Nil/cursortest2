package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.C0294b;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzcmg implements zzbnj {
    private final Context zza;
    private final zzaxt zzb;
    private final PowerManager zzc;

    public zzcmg(Context context, zzaxt zzaxtVar) {
        this.zza = context;
        this.zzb = zzaxtVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00c4  */
    @Override // com.google.android.gms.internal.ads.zzbnj
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcmj zzcmjVar) throws JSONException {
        boolean z4;
        float f7;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzaxw zzaxwVar = zzcmjVar.zzf;
        if (zzaxwVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.zzb.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z7 = zzaxwVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcmjVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcmjVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive());
            o oVar = o.f1952C;
            C0294b c0294b = oVar.f1962h;
            synchronized (c0294b) {
                z4 = c0294b.f3591a;
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appMuted", z4).put("appVolume", oVar.f1962h.a());
            AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
            if (audioManager == null) {
                f7 = 0.0f;
            } else {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = audioManager.getStreamVolume(3);
                if (streamMaxVolume != 0) {
                    f7 = streamVolume / streamMaxVolume;
                } else {
                    f7 = 0.0f;
                }
            }
            jSONObjectPut2.put("deviceVolume", f7);
            jSONObject3.put("windowVisibility", zzaxwVar.zzb).put("isAttachedToWindow", z7).put("viewBox", new JSONObject().put(RRWebVideoEvent.JsonKeys.TOP, zzaxwVar.zzc.top).put("bottom", zzaxwVar.zzc.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, zzaxwVar.zzc.left).put("right", zzaxwVar.zzc.right)).put("adBox", new JSONObject().put(RRWebVideoEvent.JsonKeys.TOP, zzaxwVar.zzd.top).put("bottom", zzaxwVar.zzd.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, zzaxwVar.zzd.left).put("right", zzaxwVar.zzd.right)).put("globalVisibleBox", new JSONObject().put(RRWebVideoEvent.JsonKeys.TOP, zzaxwVar.zze.top).put("bottom", zzaxwVar.zze.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, zzaxwVar.zze.left).put("right", zzaxwVar.zze.right)).put("globalVisibleBoxVisible", zzaxwVar.zzf).put("localVisibleBox", new JSONObject().put(RRWebVideoEvent.JsonKeys.TOP, zzaxwVar.zzg.top).put("bottom", zzaxwVar.zzg.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, zzaxwVar.zzg.left).put("right", zzaxwVar.zzg.right)).put("localVisibleBoxVisible", zzaxwVar.zzh).put("hitBox", new JSONObject().put(RRWebVideoEvent.JsonKeys.TOP, zzaxwVar.zzi.top).put("bottom", zzaxwVar.zzi.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, zzaxwVar.zzi.left).put("right", zzaxwVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcmjVar.zza);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbB)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzaxwVar.zzk;
                if (list != null) {
                    for (Rect rect : list) {
                        jSONArray2.put(new JSONObject().put(RRWebVideoEvent.JsonKeys.TOP, rect.top).put("bottom", rect.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, rect.left).put("right", rect.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcmjVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
