package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgu extends com.google.android.gms.internal.ads.zzhet {
    private final com.google.android.gms.internal.ads.zzhgw zza;
    private final com.google.android.gms.internal.ads.zziaz zzb;

    @javax.annotation.Nullable
    private final java.lang.Integer zzc;

    private zzhgu(com.google.android.gms.internal.ads.zzhgw zzhgwVar, com.google.android.gms.internal.ads.zziaz zziazVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzhgwVar;
        this.zzb = zziazVar;
        this.zzc = num;
    }

    public static com.google.android.gms.internal.ads.zzhgu zzd(com.google.android.gms.internal.ads.zzhgw zzhgwVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zza;
        if (zzhgwVar.zzd() == com.google.android.gms.internal.ads.zzhgv.zza) {
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zza = com.google.android.gms.internal.ads.zziaz.zza(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhgwVar.zzd() != com.google.android.gms.internal.ads.zzhgv.zzb) {
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(zzhgwVar.zzd().toString()));
            }
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zza = com.google.android.gms.internal.ads.zziaz.zza(new byte[0]);
        }
        return new com.google.android.gms.internal.ads.zzhgu(zzhgwVar, zza, num);
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

    public final com.google.android.gms.internal.ads.zzhgw zze() {
        return this.zza;
    }
}
