package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdgc implements zzheg {
    private final zzdga zza;

    public zzdgc(zzdga zzdgaVar) {
        this.zza = zzdgaVar;
    }

    public static JSONObject zza(zzdga zzdgaVar) {
        JSONObject zzb = zzdgaVar.zzb();
        zzheo.zzb(zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* synthetic */ Object zzb() {
        return zza(this.zza);
    }

    public final JSONObject zzc() {
        return zza(this.zza);
    }
}
