package com.google.android.gms.internal.ads;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzhwd implements zzhmt {
    static final /* synthetic */ zzhwd zza = new zzhwd();

    private /* synthetic */ zzhwd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmt
    public final /* synthetic */ zzhes zza(zzhfj zzhfjVar, Integer num) {
        zzhvx zzhvxVar = (zzhvx) zzhfjVar;
        int i = zzhwf.zza;
        ECParameterSpec zza2 = zzhvxVar.zzd().zza();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzibh.zze.zzb("EC");
        keyPairGenerator.initialize(zza2);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        zzhwa zzhwaVar = new zzhwa(null);
        zzhwaVar.zza(zzhvxVar);
        zzhwaVar.zzc(num);
        zzhwaVar.zzb(eCPublicKey.getW());
        zzhwb zzd = zzhwaVar.zzd();
        zzhvy zzhvyVar = new zzhvy(null);
        zzhvyVar.zza(zzd);
        zzhvyVar.zzb(zzici.zza(eCPrivateKey.getS(), zzheq.zza()));
        return zzhvyVar.zzc();
    }
}
