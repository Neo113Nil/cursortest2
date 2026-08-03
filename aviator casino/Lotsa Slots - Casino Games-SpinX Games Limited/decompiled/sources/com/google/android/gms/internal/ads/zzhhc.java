package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhhc extends com.google.android.gms.internal.ads.zzhet {
    private final com.google.android.gms.internal.ads.zzhhg zza;
    private final com.google.android.gms.internal.ads.zziaz zzb;

    @javax.annotation.Nullable
    private final java.lang.Integer zzc;

    private zzhhc(com.google.android.gms.internal.ads.zzhhg zzhhgVar, com.google.android.gms.internal.ads.zziaz zziazVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzhhgVar;
        this.zzb = zziazVar;
        this.zzc = num;
    }

    public static com.google.android.gms.internal.ads.zzhhc zzd(com.google.android.gms.internal.ads.zzhhg zzhhgVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zzb;
        if (zzhhgVar.zzc() == com.google.android.gms.internal.ads.zzhhf.zzb) {
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzb = com.google.android.gms.internal.ads.zzhms.zza;
        } else {
            if (zzhhgVar.zzc() != com.google.android.gms.internal.ads.zzhhf.zza) {
                java.lang.String valueOf = java.lang.String.valueOf(zzhhgVar.zzc());
                java.lang.String.valueOf(valueOf);
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(java.lang.String.valueOf(valueOf)));
            }
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzb = com.google.android.gms.internal.ads.zzhms.zzb(num.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhhc(zzhhgVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhet, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ com.google.android.gms.internal.ads.zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    public final java.lang.Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final com.google.android.gms.internal.ads.zziaz zzc() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhhg zze() {
        return this.zza;
    }
}
