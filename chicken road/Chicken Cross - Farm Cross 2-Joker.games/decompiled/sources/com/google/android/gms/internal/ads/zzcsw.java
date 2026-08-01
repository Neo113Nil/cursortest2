package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcsw implements zzcsm {
    private final zzedp zza;

    zzcsw(zzedp zzedpVar) {
        this.zza = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsm
    public final void zza(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkL)).booleanValue()) {
            this.zza.zzp(jSONObject);
        }
    }
}
