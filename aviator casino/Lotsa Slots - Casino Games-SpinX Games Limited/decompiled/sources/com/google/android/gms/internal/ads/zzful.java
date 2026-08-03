package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzful {
    private final com.google.android.gms.internal.ads.zzfux zza;
    private final com.google.android.gms.internal.ads.zzfux zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.ads.zzfup zzd;
    private final com.google.android.gms.internal.ads.zzfus zze;

    private zzful(com.google.android.gms.internal.ads.zzfup zzfupVar, com.google.android.gms.internal.ads.zzfus zzfusVar, com.google.android.gms.internal.ads.zzfux zzfuxVar, com.google.android.gms.internal.ads.zzfux zzfuxVar2, boolean z) {
        this.zzd = zzfupVar;
        this.zze = zzfusVar;
        this.zza = zzfuxVar;
        if (zzfuxVar2 == null) {
            this.zzb = com.google.android.gms.internal.ads.zzfux.NONE;
        } else {
            this.zzb = zzfuxVar2;
        }
        this.zzc = z;
    }

    public static com.google.android.gms.internal.ads.zzful zza(com.google.android.gms.internal.ads.zzfup zzfupVar, com.google.android.gms.internal.ads.zzfus zzfusVar, com.google.android.gms.internal.ads.zzfux zzfuxVar, com.google.android.gms.internal.ads.zzfux zzfuxVar2, boolean z) {
        com.google.android.gms.internal.ads.zzfwi.zzb(zzfupVar, "CreativeType is null");
        com.google.android.gms.internal.ads.zzfwi.zzb(zzfusVar, "ImpressionType is null");
        com.google.android.gms.internal.ads.zzfwi.zzb(zzfuxVar, "Impression owner is null");
        if (zzfuxVar == com.google.android.gms.internal.ads.zzfux.NONE) {
            throw new java.lang.IllegalArgumentException("Impression owner is none");
        }
        if (zzfupVar == com.google.android.gms.internal.ads.zzfup.DEFINED_BY_JAVASCRIPT && zzfuxVar == com.google.android.gms.internal.ads.zzfux.NATIVE) {
            throw new java.lang.IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfusVar == com.google.android.gms.internal.ads.zzfus.DEFINED_BY_JAVASCRIPT && zzfuxVar == com.google.android.gms.internal.ads.zzfux.NATIVE) {
            throw new java.lang.IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new com.google.android.gms.internal.ads.zzful(zzfupVar, zzfusVar, zzfuxVar, zzfuxVar2, z);
    }

    public final org.json.JSONObject zzb() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject, "impressionOwner", this.zza);
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject, "mediaEventsOwner", this.zzb);
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject, "creativeType", this.zzd);
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject, "impressionType", this.zze);
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject, "isolateVerificationScripts", java.lang.Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
