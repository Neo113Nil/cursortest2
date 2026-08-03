package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzbyg {
    private final com.google.android.gms.internal.ads.zzcku zza;
    private final java.lang.String zzb;

    public zzbyg(com.google.android.gms.internal.ads.zzcku zzckuVar, java.lang.String str) {
        this.zza = zzckuVar;
        this.zzb = str;
    }

    public final void zzg(java.lang.String str) {
        try {
            org.json.JSONObject put = new org.json.JSONObject().put("message", str).put("action", this.zzb);
            com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
            if (zzckuVar != null) {
                zzckuVar.zzd("onError", put);
            }
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzh(java.lang.String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new org.json.JSONObject().put("js", str));
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onSizeChanged", new org.json.JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (org.json.JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new org.json.JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (org.json.JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzk(java.lang.String str) {
        try {
            this.zza.zzd("onStateChanged", new org.json.JSONObject().put("state", str));
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching state change.", e);
        }
    }

    public final void zzl(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zzd("onScreenInfoChanged", new org.json.JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (org.json.JSONException e) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining screen information.", e);
        }
    }
}
