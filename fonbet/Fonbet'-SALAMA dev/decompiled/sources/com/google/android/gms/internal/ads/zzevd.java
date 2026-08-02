package com.google.android.gms.internal.ads;

import F2.C0252s;
import I2.J;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzevd implements zzesg {
    private final Map zza;

    public zzevd(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", C0252s.f2717f.f2718a.k(this.zza));
        } catch (JSONException e7) {
            J.k("Could not encode video decoder properties: ".concat(String.valueOf(e7.getMessage())));
        }
    }
}
