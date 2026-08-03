package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhyl {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zziaz zzc;
    private static final com.google.android.gms.internal.ads.zzhmy zzd;
    private static final com.google.android.gms.internal.ads.zzhmv zze;
    private static final com.google.android.gms.internal.ads.zzhlu zzf;
    private static final com.google.android.gms.internal.ads.zzhlr zzg;
    private static final com.google.android.gms.internal.ads.zzhlu zzh;
    private static final com.google.android.gms.internal.ads.zzhlr zzi;
    private static final com.google.android.gms.internal.ads.zzhli zzj;
    private static final com.google.android.gms.internal.ads.zzhli zzk;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zza2;
        com.google.android.gms.internal.ads.zziaz zza3 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zza3;
        zzd = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhyk.zza, com.google.android.gms.internal.ads.zzhwm.class, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhyf.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zzf = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhyg.zza, com.google.android.gms.internal.ads.zzhwq.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzg = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhyh.zza, zza3, com.google.android.gms.internal.ads.zzhnm.class);
        zzh = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhyi.zza, com.google.android.gms.internal.ads.zzhwo.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzi = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhyj.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
        com.google.android.gms.internal.ads.zzhlh zza4 = com.google.android.gms.internal.ads.zzhli.zza();
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.RAW, com.google.android.gms.internal.ads.zzhwl.zzd);
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.TINK, com.google.android.gms.internal.ads.zzhwl.zza);
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.CRUNCHY, com.google.android.gms.internal.ads.zzhwl.zzb);
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.LEGACY, com.google.android.gms.internal.ads.zzhwl.zzc);
        zzj = zza4.zzb();
        com.google.android.gms.internal.ads.zzhlh zza5 = com.google.android.gms.internal.ads.zzhli.zza();
        zza5.zza(com.google.android.gms.internal.ads.zzhsh.SHA256, com.google.android.gms.internal.ads.zzhwk.zza);
        zza5.zza(com.google.android.gms.internal.ads.zzhsh.SHA384, com.google.android.gms.internal.ads.zzhwk.zzb);
        zza5.zza(com.google.android.gms.internal.ads.zzhsh.SHA512, com.google.android.gms.internal.ads.zzhwk.zzc);
        zzk = zza5.zzb();
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzd);
        zzhmrVar.zze(zze);
        zzhmrVar.zzb(zzf);
        zzhmrVar.zzc(zzg);
        zzhmrVar.zzb(zzh);
        zzhmrVar.zzc(zzi);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhwm zzhwmVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        com.google.android.gms.internal.ads.zzhtp zze3 = com.google.android.gms.internal.ads.zzhtq.zze();
        zze3.zza(zzh(zzhwmVar));
        zze3.zzb(zzhwmVar.zzc());
        byte[] zza2 = com.google.android.gms.internal.ads.zzhku.zza(zzhwmVar.zzd());
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zze3.zzc(com.google.android.gms.internal.ads.zzida.zzt(zza2, 0, zza2.length));
        zze2.zzb(((com.google.android.gms.internal.ads.zzhtq) zze3.zzbu()).zzaM());
        zze2.zzc((com.google.android.gms.internal.ads.zzhtm) zzj.zzb(zzhwmVar.zze()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhwm zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhtq zzd2 = com.google.android.gms.internal.ads.zzhtq.zzd(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza());
            com.google.android.gms.internal.ads.zzhwj zzb2 = com.google.android.gms.internal.ads.zzhwm.zzb();
            zzb2.zzd((com.google.android.gms.internal.ads.zzhwk) zzk.zzc(zzd2.zza().zza()));
            zzb2.zzb(new java.math.BigInteger(1, zzd2.zzc().zzA()));
            zzb2.zza(zzd2.zzb());
            zzb2.zzc((com.google.android.gms.internal.ads.zzhwl) zzj.zzc(zzhnnVar.zzc().zzc()));
            return zzb2.zze();
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhwq zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            java.lang.String zzg2 = zzhnmVar.zzg();
            java.lang.String.valueOf(zzg2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(java.lang.String.valueOf(zzg2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhtw zze2 = com.google.android.gms.internal.ads.zzhtw.zze(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zze2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, zze2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            com.google.android.gms.internal.ads.zzhwj zzb2 = com.google.android.gms.internal.ads.zzhwm.zzb();
            zzb2.zzd((com.google.android.gms.internal.ads.zzhwk) zzk.zzc(zze2.zzb().zza()));
            zzb2.zzb(new java.math.BigInteger(1, zze2.zzd().zzA()));
            zzb2.zza(bitLength);
            zzb2.zzc((com.google.android.gms.internal.ads.zzhwl) zzj.zzc(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhwm zze3 = zzb2.zze();
            com.google.android.gms.internal.ads.zzhwp zzc2 = com.google.android.gms.internal.ads.zzhwq.zzc();
            zzc2.zza(zze3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhnmVar.zze());
            return zzc2.zzd();
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzf(com.google.android.gms.internal.ads.zzhwo zzhwoVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhtt zzk2 = com.google.android.gms.internal.ads.zzhtu.zzk();
        zzk2.zza(0);
        zzk2.zzb(zzi(zzhwoVar.zze()));
        byte[] zza2 = com.google.android.gms.internal.ads.zzhku.zza(zzhwoVar.zzi().zzb(zzhelVar));
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zzk2.zzc(com.google.android.gms.internal.ads.zzida.zzt(zza2, 0, zza2.length));
        byte[] zza3 = com.google.android.gms.internal.ads.zzhku.zza(zzhwoVar.zzf().zzb(zzhelVar));
        zzk2.zzd(com.google.android.gms.internal.ads.zzida.zzt(zza3, 0, zza3.length));
        byte[] zza4 = com.google.android.gms.internal.ads.zzhku.zza(zzhwoVar.zzh().zzb(zzhelVar));
        zzk2.zze(com.google.android.gms.internal.ads.zzida.zzt(zza4, 0, zza4.length));
        byte[] zza5 = com.google.android.gms.internal.ads.zzhku.zza(zzhwoVar.zzj().zzb(zzhelVar));
        zzk2.zzf(com.google.android.gms.internal.ads.zzida.zzt(zza5, 0, zza5.length));
        byte[] zza6 = com.google.android.gms.internal.ads.zzhku.zza(zzhwoVar.zzk().zzb(zzhelVar));
        zzk2.zzg(com.google.android.gms.internal.ads.zzida.zzt(zza6, 0, zza6.length));
        byte[] zza7 = com.google.android.gms.internal.ads.zzhku.zza(zzhwoVar.zzl().zzb(zzhelVar));
        zzk2.zzh(com.google.android.gms.internal.ads.zzida.zzt(zza7, 0, zza7.length));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((com.google.android.gms.internal.ads.zzhtu) zzk2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PRIVATE, (com.google.android.gms.internal.ads.zzhtm) zzj.zzb(zzhwoVar.zzd().zze()), zzhwoVar.zze().zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhwo zzg(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            java.lang.String zzg2 = zzhnmVar.zzg();
            java.lang.String.valueOf(zzg2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(java.lang.String.valueOf(zzg2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhtu zzj2 = com.google.android.gms.internal.ads.zzhtu.zzj(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzj2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhtw zzb2 = zzj2.zzb();
            if (zzb2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, zzb2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, zzb2.zzd().zzA());
            com.google.android.gms.internal.ads.zzhwj zzb3 = com.google.android.gms.internal.ads.zzhwm.zzb();
            zzb3.zzd((com.google.android.gms.internal.ads.zzhwk) zzk.zzc(zzb2.zzb().zza()));
            zzb3.zzb(bigInteger2);
            zzb3.zza(bitLength);
            zzb3.zzc((com.google.android.gms.internal.ads.zzhwl) zzj.zzc(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhwm zze2 = zzb3.zze();
            com.google.android.gms.internal.ads.zzhwp zzc2 = com.google.android.gms.internal.ads.zzhwq.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhnmVar.zze());
            com.google.android.gms.internal.ads.zzhwq zzd2 = zzc2.zzd();
            com.google.android.gms.internal.ads.zzhwn zzc3 = com.google.android.gms.internal.ads.zzhwo.zzc();
            zzc3.zza(zzd2);
            zzc3.zzb(zzj(zzj2.zzd(), zzhelVar), zzj(zzj2.zze(), zzhelVar));
            zzc3.zzc(zzj(zzj2.zzc(), zzhelVar));
            zzc3.zzd(zzj(zzj2.zzg(), zzhelVar), zzj(zzj2.zzh(), zzhelVar));
            zzc3.zze(zzj(zzj2.zzi(), zzhelVar));
            return zzc3.zzf();
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhts zzh(com.google.android.gms.internal.ads.zzhwm zzhwmVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhtr zzb2 = com.google.android.gms.internal.ads.zzhts.zzb();
        zzb2.zza((com.google.android.gms.internal.ads.zzhsh) zzk.zzb(zzhwmVar.zzf()));
        return (com.google.android.gms.internal.ads.zzhts) zzb2.zzbu();
    }

    private static com.google.android.gms.internal.ads.zzhtw zzi(com.google.android.gms.internal.ads.zzhwq zzhwqVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhtv zzg2 = com.google.android.gms.internal.ads.zzhtw.zzg();
        zzg2.zza(zzh(zzhwqVar.zzf()));
        byte[] zza2 = com.google.android.gms.internal.ads.zzhku.zza(zzhwqVar.zzd());
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zzg2.zzb(com.google.android.gms.internal.ads.zzida.zzt(zza2, 0, zza2.length));
        byte[] zza3 = com.google.android.gms.internal.ads.zzhku.zza(zzhwqVar.zzf().zzd());
        zzg2.zzc(com.google.android.gms.internal.ads.zzida.zzt(zza3, 0, zza3.length));
        return (com.google.android.gms.internal.ads.zzhtw) zzg2.zzbu();
    }

    private static com.google.android.gms.internal.ads.zziba zzj(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        return com.google.android.gms.internal.ads.zziba.zza(new java.math.BigInteger(1, zzidaVar.zzA()), zzhelVar);
    }
}
