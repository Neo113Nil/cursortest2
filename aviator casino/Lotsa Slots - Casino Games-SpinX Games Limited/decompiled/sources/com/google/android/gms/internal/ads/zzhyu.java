package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhyu {
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
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zza2;
        com.google.android.gms.internal.ads.zziaz zza3 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zza3;
        zzd = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhyt.zza, com.google.android.gms.internal.ads.zzhwy.class, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhyo.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zzf = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhyp.zza, com.google.android.gms.internal.ads.zzhxc.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzg = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhyq.zza, zza3, com.google.android.gms.internal.ads.zzhnm.class);
        zzh = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhyr.zza, com.google.android.gms.internal.ads.zzhxa.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzi = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhys.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
        com.google.android.gms.internal.ads.zzhlh zza4 = com.google.android.gms.internal.ads.zzhli.zza();
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.RAW, com.google.android.gms.internal.ads.zzhwx.zzd);
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.TINK, com.google.android.gms.internal.ads.zzhwx.zza);
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.CRUNCHY, com.google.android.gms.internal.ads.zzhwx.zzb);
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.LEGACY, com.google.android.gms.internal.ads.zzhwx.zzc);
        zzj = zza4.zzb();
        com.google.android.gms.internal.ads.zzhlh zza5 = com.google.android.gms.internal.ads.zzhli.zza();
        zza5.zza(com.google.android.gms.internal.ads.zzhsh.SHA256, com.google.android.gms.internal.ads.zzhww.zza);
        zza5.zza(com.google.android.gms.internal.ads.zzhsh.SHA384, com.google.android.gms.internal.ads.zzhww.zzb);
        zza5.zza(com.google.android.gms.internal.ads.zzhsh.SHA512, com.google.android.gms.internal.ads.zzhww.zzc);
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

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhwy zzhwyVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        com.google.android.gms.internal.ads.zzhtx zze3 = com.google.android.gms.internal.ads.zzhty.zze();
        zze3.zza(zzh(zzhwyVar));
        zze3.zzb(zzhwyVar.zzc());
        byte[] zza2 = com.google.android.gms.internal.ads.zzhku.zza(zzhwyVar.zzd());
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zze3.zzc(com.google.android.gms.internal.ads.zzida.zzt(zza2, 0, zza2.length));
        zze2.zzb(((com.google.android.gms.internal.ads.zzhty) zze3.zzbu()).zzaM());
        zze2.zzc((com.google.android.gms.internal.ads.zzhtm) zzj.zzb(zzhwyVar.zze()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhwy zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhty zzd2 = com.google.android.gms.internal.ads.zzhty.zzd(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza());
            com.google.android.gms.internal.ads.zzhwv zzb2 = com.google.android.gms.internal.ads.zzhwy.zzb();
            com.google.android.gms.internal.ads.zzhli zzhliVar = zzk;
            zzb2.zzd((com.google.android.gms.internal.ads.zzhww) zzhliVar.zzc(zzd2.zza().zza()));
            zzb2.zze((com.google.android.gms.internal.ads.zzhww) zzhliVar.zzc(zzd2.zza().zzb()));
            zzb2.zzb(new java.math.BigInteger(1, zzd2.zzc().zzA()));
            zzb2.zza(zzd2.zzb());
            zzb2.zzf(zzd2.zza().zzc());
            zzb2.zzc((com.google.android.gms.internal.ads.zzhwx) zzj.zzc(zzhnnVar.zzc().zzc()));
            return zzb2.zzg();
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhxc zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            java.lang.String zzg2 = zzhnmVar.zzg();
            java.lang.String.valueOf(zzg2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(java.lang.String.valueOf(zzg2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhue zze2 = com.google.android.gms.internal.ads.zzhue.zze(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zze2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, zze2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            com.google.android.gms.internal.ads.zzhwv zzb2 = com.google.android.gms.internal.ads.zzhwy.zzb();
            com.google.android.gms.internal.ads.zzhli zzhliVar = zzk;
            zzb2.zzd((com.google.android.gms.internal.ads.zzhww) zzhliVar.zzc(zze2.zzb().zza()));
            zzb2.zze((com.google.android.gms.internal.ads.zzhww) zzhliVar.zzc(zze2.zzb().zzb()));
            zzb2.zzb(new java.math.BigInteger(1, zze2.zzd().zzA()));
            zzb2.zza(bitLength);
            zzb2.zzf(zze2.zzb().zzc());
            zzb2.zzc((com.google.android.gms.internal.ads.zzhwx) zzj.zzc(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhwy zzg3 = zzb2.zzg();
            com.google.android.gms.internal.ads.zzhxb zzc2 = com.google.android.gms.internal.ads.zzhxc.zzc();
            zzc2.zza(zzg3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhnmVar.zze());
            return zzc2.zzd();
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzf(com.google.android.gms.internal.ads.zzhxa zzhxaVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhub zzk2 = com.google.android.gms.internal.ads.zzhuc.zzk();
        zzk2.zza(0);
        zzk2.zzb(zzi(zzhxaVar.zze()));
        byte[] zza2 = com.google.android.gms.internal.ads.zzhku.zza(zzhxaVar.zzi().zzb(zzhelVar));
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zzk2.zzc(com.google.android.gms.internal.ads.zzida.zzt(zza2, 0, zza2.length));
        byte[] zza3 = com.google.android.gms.internal.ads.zzhku.zza(zzhxaVar.zzf().zzb(zzhelVar));
        zzk2.zzd(com.google.android.gms.internal.ads.zzida.zzt(zza3, 0, zza3.length));
        byte[] zza4 = com.google.android.gms.internal.ads.zzhku.zza(zzhxaVar.zzh().zzb(zzhelVar));
        zzk2.zze(com.google.android.gms.internal.ads.zzida.zzt(zza4, 0, zza4.length));
        byte[] zza5 = com.google.android.gms.internal.ads.zzhku.zza(zzhxaVar.zzj().zzb(zzhelVar));
        zzk2.zzf(com.google.android.gms.internal.ads.zzida.zzt(zza5, 0, zza5.length));
        byte[] zza6 = com.google.android.gms.internal.ads.zzhku.zza(zzhxaVar.zzk().zzb(zzhelVar));
        zzk2.zzg(com.google.android.gms.internal.ads.zzida.zzt(zza6, 0, zza6.length));
        byte[] zza7 = com.google.android.gms.internal.ads.zzhku.zza(zzhxaVar.zzl().zzb(zzhelVar));
        zzk2.zzh(com.google.android.gms.internal.ads.zzida.zzt(zza7, 0, zza7.length));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((com.google.android.gms.internal.ads.zzhuc) zzk2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PRIVATE, (com.google.android.gms.internal.ads.zzhtm) zzj.zzb(zzhxaVar.zzd().zze()), zzhxaVar.zze().zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhxa zzg(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            java.lang.String zzg2 = zzhnmVar.zzg();
            java.lang.String.valueOf(zzg2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(java.lang.String.valueOf(zzg2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhuc zzj2 = com.google.android.gms.internal.ads.zzhuc.zzj(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzj2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhue zzb2 = zzj2.zzb();
            if (zzb2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, zzb2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, zzb2.zzd().zzA());
            com.google.android.gms.internal.ads.zzhwv zzb3 = com.google.android.gms.internal.ads.zzhwy.zzb();
            com.google.android.gms.internal.ads.zzhli zzhliVar = zzk;
            zzb3.zzd((com.google.android.gms.internal.ads.zzhww) zzhliVar.zzc(zzb2.zzb().zza()));
            zzb3.zze((com.google.android.gms.internal.ads.zzhww) zzhliVar.zzc(zzb2.zzb().zzb()));
            zzb3.zzb(bigInteger2);
            zzb3.zza(bitLength);
            zzb3.zzf(zzb2.zzb().zzc());
            zzb3.zzc((com.google.android.gms.internal.ads.zzhwx) zzj.zzc(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhwy zzg3 = zzb3.zzg();
            com.google.android.gms.internal.ads.zzhxb zzc2 = com.google.android.gms.internal.ads.zzhxc.zzc();
            zzc2.zza(zzg3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhnmVar.zze());
            com.google.android.gms.internal.ads.zzhxc zzd2 = zzc2.zzd();
            com.google.android.gms.internal.ads.zzhwz zzc3 = com.google.android.gms.internal.ads.zzhxa.zzc();
            zzc3.zza(zzd2);
            zzc3.zzb(zzj(zzj2.zzd(), zzhelVar), zzj(zzj2.zze(), zzhelVar));
            zzc3.zzc(zzj(zzj2.zzc(), zzhelVar));
            zzc3.zzd(zzj(zzj2.zzg(), zzhelVar), zzj(zzj2.zzh(), zzhelVar));
            zzc3.zze(zzj(zzj2.zzi(), zzhelVar));
            return zzc3.zzf();
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhua zzh(com.google.android.gms.internal.ads.zzhwy zzhwyVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhtz zzd2 = com.google.android.gms.internal.ads.zzhua.zzd();
        com.google.android.gms.internal.ads.zzhli zzhliVar = zzk;
        zzd2.zza((com.google.android.gms.internal.ads.zzhsh) zzhliVar.zzb(zzhwyVar.zzf()));
        zzd2.zzb((com.google.android.gms.internal.ads.zzhsh) zzhliVar.zzb(zzhwyVar.zzg()));
        zzd2.zzc(zzhwyVar.zzh());
        return (com.google.android.gms.internal.ads.zzhua) zzd2.zzbu();
    }

    private static com.google.android.gms.internal.ads.zzhue zzi(com.google.android.gms.internal.ads.zzhxc zzhxcVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhud zzg2 = com.google.android.gms.internal.ads.zzhue.zzg();
        zzg2.zzb(zzh(zzhxcVar.zzf()));
        byte[] zza2 = com.google.android.gms.internal.ads.zzhku.zza(zzhxcVar.zzd());
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zzg2.zzc(com.google.android.gms.internal.ads.zzida.zzt(zza2, 0, zza2.length));
        byte[] zza3 = com.google.android.gms.internal.ads.zzhku.zza(zzhxcVar.zzf().zzd());
        zzg2.zzd(com.google.android.gms.internal.ads.zzida.zzt(zza3, 0, zza3.length));
        zzg2.zza(0);
        return (com.google.android.gms.internal.ads.zzhue) zzg2.zzbu();
    }

    private static com.google.android.gms.internal.ads.zziba zzj(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        return com.google.android.gms.internal.ads.zziba.zza(new java.math.BigInteger(1, zzidaVar.zzA()), zzhelVar);
    }
}
