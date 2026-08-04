package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzfji {
    private final zzfjt zza;
    private final zzfjt zzb;
    private final boolean zzc;
    private final zzfjm zzd;
    private final zzfjp zze;

    private zzfji(zzfjm zzfjmVar, zzfjp zzfjpVar, zzfjt zzfjtVar, zzfjt zzfjtVar2, boolean z4) {
        this.zzd = zzfjmVar;
        this.zze = zzfjpVar;
        this.zza = zzfjtVar;
        if (zzfjtVar2 == null) {
            this.zzb = zzfjt.NONE;
        } else {
            this.zzb = zzfjtVar2;
        }
        this.zzc = z4;
    }

    public static zzfji zza(zzfjm zzfjmVar, zzfjp zzfjpVar, zzfjt zzfjtVar, zzfjt zzfjtVar2, boolean z4) {
        zzflc.zzc(zzfjmVar, "CreativeType is null");
        zzflc.zzc(zzfjpVar, "ImpressionType is null");
        zzflc.zzc(zzfjtVar, "Impression owner is null");
        if (zzfjtVar == zzfjt.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfjmVar == zzfjm.DEFINED_BY_JAVASCRIPT && zzfjtVar == zzfjt.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfjpVar == zzfjp.DEFINED_BY_JAVASCRIPT && zzfjtVar == zzfjt.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfji(zzfjmVar, zzfjpVar, zzfjtVar, zzfjtVar2, z4);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfky.zze(jSONObject, "impressionOwner", this.zza);
        zzfky.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfky.zze(jSONObject, "creativeType", this.zzd);
        zzfky.zze(jSONObject, "impressionType", this.zze);
        zzfky.zze(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
