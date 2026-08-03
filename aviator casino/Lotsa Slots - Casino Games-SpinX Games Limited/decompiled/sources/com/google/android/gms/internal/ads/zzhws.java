package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzhws implements com.google.android.gms.internal.ads.zzhln {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzhws zza = new com.google.android.gms.internal.ads.zzhws();

    private /* synthetic */ zzhws() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ com.google.android.gms.internal.ads.zzhdq zza(com.google.android.gms.internal.ads.zzheh zzhehVar, java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzhwm zzhwmVar = (com.google.android.gms.internal.ads.zzhwm) zzhehVar;
        int i = com.google.android.gms.internal.ads.zzhwu.zza;
        java.security.KeyPairGenerator keyPairGenerator = (java.security.KeyPairGenerator) com.google.android.gms.internal.ads.zzhzz.zze.zzb("RSA");
        keyPairGenerator.initialize(new java.security.spec.RSAKeyGenParameterSpec(zzhwmVar.zzc(), new java.math.BigInteger(1, zzhwmVar.zzd().toByteArray())));
        java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) generateKeyPair.getPublic();
        java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) generateKeyPair.getPrivate();
        com.google.android.gms.internal.ads.zzhwp zzhwpVar = new com.google.android.gms.internal.ads.zzhwp(null);
        zzhwpVar.zza(zzhwmVar);
        zzhwpVar.zzb(rSAPublicKey.getModulus());
        zzhwpVar.zzc(num);
        com.google.android.gms.internal.ads.zzhwq zzd = zzhwpVar.zzd();
        com.google.android.gms.internal.ads.zzhwn zzhwnVar = new com.google.android.gms.internal.ads.zzhwn(null);
        zzhwnVar.zza(zzd);
        zzhwnVar.zzb(com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrimeP(), com.google.android.gms.internal.ads.zzhdo.zza()), com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrimeQ(), com.google.android.gms.internal.ads.zzhdo.zza()));
        zzhwnVar.zzc(com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrivateExponent(), com.google.android.gms.internal.ads.zzhdo.zza()));
        zzhwnVar.zzd(com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrimeExponentP(), com.google.android.gms.internal.ads.zzhdo.zza()), com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getPrimeExponentQ(), com.google.android.gms.internal.ads.zzhdo.zza()));
        zzhwnVar.zze(com.google.android.gms.internal.ads.zziba.zza(rSAPrivateCrtKey.getCrtCoefficient(), com.google.android.gms.internal.ads.zzhdo.zza()));
        return zzhwnVar.zzf();
    }
}
