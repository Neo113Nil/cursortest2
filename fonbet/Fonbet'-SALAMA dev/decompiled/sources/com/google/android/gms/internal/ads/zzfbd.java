package com.google.android.gms.internal.ads;

import F2.C0254t;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfbd {
    private final JSONObject zza;

    public zzfbd(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        return this.zza.optBoolean((String) C0254t.f2723d.f2726c.zzb(zzbby.zzfp), true);
    }

    public final int zzc() {
        int optInt = this.zza.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
