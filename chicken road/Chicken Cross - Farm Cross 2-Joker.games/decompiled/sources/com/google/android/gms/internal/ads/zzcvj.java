package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcvj implements zzinw {
    private final zziof zza;

    private zzcvj(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcvj zza(zziof zziofVar) {
        return new zzcvj(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzczc) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
