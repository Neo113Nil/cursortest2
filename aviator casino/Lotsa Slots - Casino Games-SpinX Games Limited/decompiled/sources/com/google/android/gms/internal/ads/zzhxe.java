package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzhxe implements com.google.android.gms.internal.ads.zzhln {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzhxe zza = new com.google.android.gms.internal.ads.zzhxe();

    private /* synthetic */ zzhxe() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ com.google.android.gms.internal.ads.zzhdq zza(com.google.android.gms.internal.ads.zzheh zzhehVar, java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzhwy zzhwyVar = (com.google.android.gms.internal.ads.zzhwy) zzhehVar;
        int i = com.google.android.gms.internal.ads.zzhxg.zza;
        java.security.KeyPairGenerator keyPairGenerator = (java.security.KeyPairGenerator) com.google.android.gms.internal.ads.zzhzz.zze.zzb("RSA");
        keyPairGenerator.initialize(new java.security.spec.RSAKeyGenParameterSpec(zzhwyVar.zzc(), new java.math.BigInteger(1, zzhwyVar.zzd().toByteArray())));
        java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) generateKeyPair.getPublic();
        java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) generateKeyPair.getPrivate();
        com.google.android.gms.internal.ads.zzhxb zzhxbVar = new com.google.android.gms.internal.ads.zzhxb(null);
        zzhxbVar.zza(zzhwyVar);
        zzhxbVar.zzb(rSAPublicKey.getModulus());
        zzhxbVar.zzc(num);
        com.google.android.gms.internal.ads.zzhxc zzd = zzhxbVar.zzd();
        com.google.android.gms.internal.ads.zzhwz zzhwzVar = new com.google.android.gms.internal.ads.zzhwz(null);
        zzhwzVar.zza(zzd);
        zzhwzVar.zzb(com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrimeP(), com.google.android.gms.internal.ads.zzhdo.zza()), com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrimeQ(), com.google.android.gms.internal.ads.zzhdo.zza()));
        zzhwzVar.zzc(com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrivateExponent(), com.google.android.gms.internal.ads.zzhdo.zza()));
        zzhwzVar.zzd(com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrimeExponentP(), com.google.android.gms.internal.ads.zzhdo.zza()), com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrimeExponentQ(), com.google.android.gms.internal.ads.zzhdo.zza()));
        zzhwzVar.zze(com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getCrtCoefficient(), com.google.android.gms.internal.ads.zzhdo.zza()));
        return zzhwzVar.zzf();
    }
}
