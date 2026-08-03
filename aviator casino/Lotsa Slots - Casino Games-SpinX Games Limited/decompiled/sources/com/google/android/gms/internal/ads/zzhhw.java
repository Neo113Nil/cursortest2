package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhhw extends com.google.android.gms.internal.ads.zzhet {
    private final com.google.android.gms.internal.ads.zzhib zza;
    private final com.google.android.gms.internal.ads.zzibb zzb;
    private final com.google.android.gms.internal.ads.zziaz zzc;

    @javax.annotation.Nullable
    private final java.lang.Integer zzd;

    private zzhhw(com.google.android.gms.internal.ads.zzhib zzhibVar, com.google.android.gms.internal.ads.zzibb zzibbVar, com.google.android.gms.internal.ads.zziaz zziazVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzhibVar;
        this.zzb = zzibbVar;
        this.zzc = zziazVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.ads.zzhet, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ com.google.android.gms.internal.ads.zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    @javax.annotation.Nullable
    public final java.lang.Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final com.google.android.gms.internal.ads.zziaz zzc() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzibb zze() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhib zzf() {
        return this.zza;
    }

    public static com.google.android.gms.internal.ads.zzhhw zzd(com.google.android.gms.internal.ads.zzhib zzhibVar, com.google.android.gms.internal.ads.zzibb zzibbVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zzb;
        com.google.android.gms.internal.ads.zzhia zzc = zzhibVar.zzc();
        com.google.android.gms.internal.ads.zzhia zzhiaVar = com.google.android.gms.internal.ads.zzhia.zzb;
        if (zzc != zzhiaVar && num == null) {
            java.lang.String obj = zzhibVar.zzc().toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (zzhibVar.zzc() == zzhiaVar && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibbVar.zzd() != 32) {
            int zzd = zzibbVar.zzd();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzd).length() + 68);
            sb2.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        if (zzhibVar.zzc() == zzhiaVar) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza;
        } else {
            if (zzhibVar.zzc() != com.google.android.gms.internal.ads.zzhia.zza) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(zzhibVar.zzc().toString()));
            }
            zzb = com.google.android.gms.internal.ads.zzhms.zzb(num.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhhw(zzhibVar, zzibbVar, zzb, num);
    }
}
