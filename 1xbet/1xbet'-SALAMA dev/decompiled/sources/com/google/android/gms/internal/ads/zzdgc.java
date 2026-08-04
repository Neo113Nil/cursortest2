package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzdgc implements zzheg {
    private final zzdga zza;

    public zzdgc(zzdga zzdgaVar) {
        this.zza = zzdgaVar;
    }

    public static JSONObject zza(zzdga zzdgaVar) {
        JSONObject jSONObjectZzb = zzdgaVar.zzb();
        zzheo.zzb(jSONObjectZzb);
        return jSONObjectZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* synthetic */ Object zzb() {
        return zza(this.zza);
    }

    public final JSONObject zzc() {
        return zza(this.zza);
    }
}
