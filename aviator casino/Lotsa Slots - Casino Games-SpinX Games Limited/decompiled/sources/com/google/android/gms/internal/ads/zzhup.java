package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhup {
    private com.google.android.gms.internal.ads.zzhus zza = null;
    private com.google.android.gms.internal.ads.zzhuq zzb = null;
    private com.google.android.gms.internal.ads.zzhur zzc = null;
    private com.google.android.gms.internal.ads.zzhut zzd = com.google.android.gms.internal.ads.zzhut.zzd;

    private zzhup() {
    }

    /* synthetic */ zzhup(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhup zza(com.google.android.gms.internal.ads.zzhus zzhusVar) {
        this.zza = zzhusVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhup zzb(com.google.android.gms.internal.ads.zzhuq zzhuqVar) {
        this.zzb = zzhuqVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhup zzc(com.google.android.gms.internal.ads.zzhur zzhurVar) {
        this.zzc = zzhurVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhup zzd(com.google.android.gms.internal.ads.zzhut zzhutVar) {
        this.zzd = zzhutVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhuu zze() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhus zzhusVar = this.zza;
        if (zzhusVar == null) {
            throw new java.security.GeneralSecurityException("signature encoding is not set");
        }
        com.google.android.gms.internal.ads.zzhuq zzhuqVar = this.zzb;
        if (zzhuqVar == null) {
            throw new java.security.GeneralSecurityException("EC curve type is not set");
        }
        com.google.android.gms.internal.ads.zzhur zzhurVar = this.zzc;
        if (zzhurVar == null) {
            throw new java.security.GeneralSecurityException("hash type is not set");
        }
        com.google.android.gms.internal.ads.zzhut zzhutVar = this.zzd;
        if (zzhutVar == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        if (zzhuqVar == com.google.android.gms.internal.ads.zzhuq.zza && zzhurVar != com.google.android.gms.internal.ads.zzhur.zza) {
            throw new java.security.GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (zzhuqVar == com.google.android.gms.internal.ads.zzhuq.zzb && zzhurVar != com.google.android.gms.internal.ads.zzhur.zzb && zzhurVar != com.google.android.gms.internal.ads.zzhur.zzc) {
            throw new java.security.GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (zzhuqVar != com.google.android.gms.internal.ads.zzhuq.zzc || zzhurVar == com.google.android.gms.internal.ads.zzhur.zzc) {
            return new com.google.android.gms.internal.ads.zzhuu(zzhusVar, zzhuqVar, zzhurVar, zzhutVar, null);
        }
        throw new java.security.GeneralSecurityException("NIST_P521 requires SHA512");
    }
}
