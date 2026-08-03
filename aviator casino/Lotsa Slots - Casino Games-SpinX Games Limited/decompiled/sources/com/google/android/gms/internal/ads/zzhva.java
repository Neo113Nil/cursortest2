package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzhva implements com.google.android.gms.internal.ads.zzhln {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzhva zza = new com.google.android.gms.internal.ads.zzhva();

    private /* synthetic */ zzhva() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ com.google.android.gms.internal.ads.zzhdq zza(com.google.android.gms.internal.ads.zzheh zzhehVar, java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzhuu zzhuuVar = (com.google.android.gms.internal.ads.zzhuu) zzhehVar;
        int i = com.google.android.gms.internal.ads.zzhvc.zza;
        java.security.spec.ECParameterSpec zza2 = zzhuuVar.zzd().zza();
        java.security.KeyPairGenerator keyPairGenerator = (java.security.KeyPairGenerator) com.google.android.gms.internal.ads.zzhzz.zze.zzb("EC");
        keyPairGenerator.initialize(zza2);
        java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) generateKeyPair.getPublic();
        java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) generateKeyPair.getPrivate();
        com.google.android.gms.internal.ads.zzhux zzhuxVar = new com.google.android.gms.internal.ads.zzhux(null);
        zzhuxVar.zza(zzhuuVar);
        zzhuxVar.zzc(num);
        zzhuxVar.zzb(eCPublicKey.getW());
        com.google.android.gms.internal.ads.zzhuy zzd = zzhuxVar.zzd();
        com.google.android.gms.internal.ads.zzhuv zzhuvVar = new com.google.android.gms.internal.ads.zzhuv(null);
        zzhuvVar.zza(zzd);
        zzhuvVar.zzb(com.google.android.gms.internal.ads.zziba.zza(eCPrivateKey.getS(), com.google.android.gms.internal.ads.zzhdo.zza()));
        return zzhuvVar.zzc();
    }
}
