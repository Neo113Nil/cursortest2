package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzedz implements zzebt {
    private final zzdog zza;

    public zzedz(zzdog zzdogVar) {
        this.zza = zzdogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebt
    public final zzebu zza(String str, JSONObject jSONObject) {
        return new zzebu(this.zza.zzc(str, jSONObject), new zzedi(), str);
    }
}
