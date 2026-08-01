package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeov implements zzems {
    private final zzdya zza;

    public zzeov(zzdya zzdyaVar) {
        this.zza = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final zzemt zza(String str, JSONObject jSONObject) throws zzfmd {
        return new zzemt(this.zza.zza(str, jSONObject), new zzeof(), str);
    }
}
