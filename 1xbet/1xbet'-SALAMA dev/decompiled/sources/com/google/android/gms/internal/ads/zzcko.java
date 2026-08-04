package com.google.android.gms.internal.ads;

import F2.C0254t;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzcko implements zzcke {
    private final zzdtp zza;

    public zzcko(zzdtp zzdtpVar) {
        this.zza = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcke
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjk)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
