package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import io.sentry.protocol.SentryThread;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzbrs {
    private final zzceb zza;
    private final String zzb;

    public zzbrs(zzceb zzcebVar, String str) {
        this.zza = zzcebVar;
        this.zzb = str;
    }

    public final void zzg(int i7, int i8, int i9, int i10) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i7).put("y", i8).put("width", i9).put("height", i10));
        } catch (JSONException e7) {
            int i11 = J.f3546b;
            j.e("Error occurred while dispatching default position.", e7);
        }
    }

    public final void zzh(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzceb zzcebVar = this.zza;
            if (zzcebVar != null) {
                zzcebVar.zze("onError", put);
            }
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("Error occurred while dispatching error event.", e7);
        }
    }

    public final void zzi(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("Error occurred while dispatching ready Event.", e7);
        }
    }

    public final void zzj(int i7, int i8, int i9, int i10, float f7, int i11) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i7).put("height", i8).put("maxSizeWidth", i9).put("maxSizeHeight", i10).put("density", f7).put("rotation", i11));
        } catch (JSONException e7) {
            int i12 = J.f3546b;
            j.e("Error occurred while obtaining screen information.", e7);
        }
    }

    public final void zzk(int i7, int i8, int i9, int i10) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i7).put("y", i8).put("width", i9).put("height", i10));
        } catch (JSONException e7) {
            int i11 = J.f3546b;
            j.e("Error occurred while dispatching size change.", e7);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put(SentryThread.JsonKeys.STATE, str));
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("Error occurred while dispatching state change.", e7);
        }
    }
}
