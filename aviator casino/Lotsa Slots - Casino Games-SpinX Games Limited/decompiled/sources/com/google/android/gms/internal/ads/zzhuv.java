package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhuv {
    private com.google.android.gms.internal.ads.zzhuy zza = null;
    private com.google.android.gms.internal.ads.zziba zzb = null;

    private zzhuv() {
    }

    /* synthetic */ zzhuv(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhuv zza(com.google.android.gms.internal.ads.zzhuy zzhuyVar) {
        this.zza = zzhuyVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhuv zzb(com.google.android.gms.internal.ads.zziba zzibaVar) {
        this.zzb = zzibaVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhuw zzc() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhuy zzhuyVar = this.zza;
        if (zzhuyVar == null) {
            throw new java.security.GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        com.google.android.gms.internal.ads.zziba zzibaVar = this.zzb;
        if (zzibaVar == null) {
            throw new java.security.GeneralSecurityException("Cannot build without a private value");
        }
        java.math.BigInteger zzb = zzibaVar.zzb(com.google.android.gms.internal.ads.zzhdo.zza());
        java.security.spec.ECPoint zzd = zzhuyVar.zzd();
        com.google.android.gms.internal.ads.zzhuq zzd2 = zzhuyVar.zzf().zzd();
        java.math.BigInteger order = zzd2.zza().getOrder();
        if (zzb.signum() <= 0 || zzb.compareTo(order) >= 0) {
            throw new java.security.GeneralSecurityException("Invalid private value");
        }
        if (com.google.android.gms.internal.ads.zzhlg.zzd(zzb, zzd2.zza()).equals(zzd)) {
            return new com.google.android.gms.internal.ads.zzhuw(this.zza, this.zzb, null);
        }
        throw new java.security.GeneralSecurityException("Invalid private value");
    }
}
