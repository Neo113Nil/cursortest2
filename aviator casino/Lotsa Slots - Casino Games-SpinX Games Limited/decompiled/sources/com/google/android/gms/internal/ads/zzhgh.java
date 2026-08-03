package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgh extends com.google.android.gms.internal.ads.zzhet {
    private final com.google.android.gms.internal.ads.zzhgm zza;
    private final com.google.android.gms.internal.ads.zzibb zzb;
    private final com.google.android.gms.internal.ads.zziaz zzc;

    @javax.annotation.Nullable
    private final java.lang.Integer zzd;

    private zzhgh(com.google.android.gms.internal.ads.zzhgm zzhgmVar, com.google.android.gms.internal.ads.zzibb zzibbVar, com.google.android.gms.internal.ads.zziaz zziazVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzhgmVar;
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

    public final com.google.android.gms.internal.ads.zzhgm zzf() {
        return this.zza;
    }

    public static com.google.android.gms.internal.ads.zzhgh zzd(com.google.android.gms.internal.ads.zzhgl zzhglVar, com.google.android.gms.internal.ads.zzibb zzibbVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zzb;
        com.google.android.gms.internal.ads.zzhgl zzhglVar2 = com.google.android.gms.internal.ads.zzhgl.zzc;
        if (zzhglVar != zzhglVar2 && num == null) {
            java.lang.String obj = zzhglVar.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (zzhglVar == zzhglVar2 && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibbVar.zzd() != 32) {
            int zzd = zzibbVar.zzd();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzd).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        com.google.android.gms.internal.ads.zzhgm zzb2 = com.google.android.gms.internal.ads.zzhgm.zzb(zzhglVar);
        if (zzb2.zzc() == zzhglVar2) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (zzb2.zzc() == com.google.android.gms.internal.ads.zzhgl.zzb) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza(num.intValue());
        } else {
            if (zzb2.zzc() != com.google.android.gms.internal.ads.zzhgl.zza) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(zzb2.zzc().toString()));
            }
            zzb = com.google.android.gms.internal.ads.zzhms.zzb(num.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhgh(zzb2, zzibbVar, zzb, num);
    }
}
