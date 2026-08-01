package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C4352c8;
import com.ironsource.U3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcuu implements zzbut {
    private final Context zza;
    private final zzbfd zzb;
    private final PowerManager zzc;

    public zzcuu(Context context, zzbfd zzbfdVar) {
        this.zza = context;
        this.zzb = zzbfdVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcux zzcuxVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbff zzbffVar = zzcuxVar.zzf;
        if (zzbffVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbfd zzbfdVar = this.zzb;
            if (zzbfdVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzbffVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", zzbfdVar.zzb()).put("activeViewJSON", zzbfdVar.zzc()).put("timestamp", zzcuxVar.zzd).put("adFormat", zzbfdVar.zza()).put("hashCode", zzbfdVar.zzd()).put("isMraid", false);
            boolean z2 = zzcuxVar.zzc;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcuxVar.zzb).put("isNative", zzbfdVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.zza;
            put2.put(U3.j.P, com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject put3 = jSONObject3.put("windowVisibility", zzbffVar.zzb).put("isAttachedToWindow", z);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbffVar.zzc;
            JSONObject put4 = put3.put("viewBox", jSONObject4.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbffVar.zzd;
            JSONObject put5 = put4.put("adBox", jSONObject5.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbffVar.zze;
            JSONObject put6 = put5.put("globalVisibleBox", jSONObject6.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzbffVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbffVar.zzg;
            JSONObject put7 = put6.put("localVisibleBox", jSONObject7.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzbffVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbffVar.zzi;
            put7.put("hitBox", jSONObject8.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(C4352c8.k, zzcuxVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcg)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbffVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcuxVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
