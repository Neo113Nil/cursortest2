package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhvl extends com.google.android.gms.internal.ads.zzhxk {
    private final com.google.android.gms.internal.ads.zzhve zza;
    private final com.google.android.gms.internal.ads.zziaz zzb;
    private final com.google.android.gms.internal.ads.zziaz zzc;

    @javax.annotation.Nullable
    private final java.lang.Integer zzd;

    private zzhvl(com.google.android.gms.internal.ads.zzhve zzhveVar, com.google.android.gms.internal.ads.zziaz zziazVar, com.google.android.gms.internal.ads.zziaz zziazVar2, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzhveVar;
        this.zzb = zziazVar;
        this.zzc = zziazVar2;
        this.zzd = num;
    }

    public static com.google.android.gms.internal.ads.zzhvl zzc(com.google.android.gms.internal.ads.zzhvd zzhvdVar, com.google.android.gms.internal.ads.zziaz zziazVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zza;
        com.google.android.gms.internal.ads.zzhve zzb = com.google.android.gms.internal.ads.zzhve.zzb(zzhvdVar);
        com.google.android.gms.internal.ads.zzhvd zzhvdVar2 = com.google.android.gms.internal.ads.zzhvd.zzd;
        if (!zzhvdVar.equals(zzhvdVar2) && num == null) {
            java.lang.String obj = zzhvdVar.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (zzhvdVar.equals(zzhvdVar2) && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zziazVar.zzd() != 32) {
            int zzd = zziazVar.zzd();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzd).length() + 65);
            sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        if (zzb.zzc() == zzhvdVar2) {
            zza = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (zzb.zzc() == com.google.android.gms.internal.ads.zzhvd.zzb || zzb.zzc() == com.google.android.gms.internal.ads.zzhvd.zzc) {
            zza = com.google.android.gms.internal.ads.zzhms.zza(num.intValue());
        } else {
            if (zzb.zzc() != com.google.android.gms.internal.ads.zzhvd.zza) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(zzb.zzc().toString()));
            }
            zza = com.google.android.gms.internal.ads.zzhms.zzb(num.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhvl(zzb, zziazVar, zza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhxk, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ com.google.android.gms.internal.ads.zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    @javax.annotation.Nullable
    public final java.lang.Integer zzb() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zziaz zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxk
    public final com.google.android.gms.internal.ads.zziaz zze() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhve zzf() {
        return this.zza;
    }
}
