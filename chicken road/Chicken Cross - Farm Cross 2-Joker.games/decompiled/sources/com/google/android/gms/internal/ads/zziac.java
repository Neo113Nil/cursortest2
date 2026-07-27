package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zziac {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzich zzc;
    private static final zzhod zzd;
    private static final zzhoa zze;
    private static final zzhna zzf;
    private static final zzhmx zzg;
    private static final zzhna zzh;
    private static final zzhmx zzi;
    private static final zzhmo zzj;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zza2;
        zzich zza3 = zzhpd.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zza3;
        zzd = zzhod.zzd(zziab.zza, zzhyc.class, zzhot.class);
        zze = zzhoa.zzd(zzhzw.zza, zza2, zzhot.class);
        zzf = zzhna.zzd(zzhzx.zza, zzhyg.class, zzhos.class);
        zzg = zzhmx.zzd(zzhzy.zza, zza3, zzhos.class);
        zzh = zzhna.zzd(zzhzz.zza, zzhye.class, zzhos.class);
        zzi = zzhmx.zzd(zziaa.zza, zza2, zzhos.class);
        zzhmn zza4 = zzhmo.zza();
        zza4.zza(zzhtl.SHA256, zzhya.zza);
        zza4.zza(zzhtl.SHA384, zzhya.zzb);
        zza4.zza(zzhtl.SHA512, zzhya.zzc);
        zzj = zza4.zzb();
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzd);
        zzhnwVar.zze(zze);
        zzhnwVar.zzb(zzf);
        zzhnwVar.zzc(zzg);
        zzhnwVar.zzb(zzh);
        zzhnwVar.zzc(zzi);
    }

    static /* synthetic */ zzhot zzb(zzhyc zzhycVar) {
        zzhfm zzh2 = zzh(zzhycVar.zze());
        zzhva zze2 = zzhvb.zze();
        zze2.zza(zzj(zzhycVar));
        zze2.zzb(zzhycVar.zzc());
        byte[] zza2 = zzhma.zza(zzhycVar.zzd());
        zziei zzieiVar = zziei.zza;
        zze2.zzc(zziei.zzt(zza2, 0, zza2.length));
        return zzhot.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzh2, ((zzhvb) zze2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhyc zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            String zza2 = zzhotVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhvb zzd2 = zzhvb.zzd(zzhotVar.zzc().zzb(), zziew.zzb());
            zzhxz zzb2 = zzhyc.zzb();
            zzhmo zzhmoVar = zzj;
            zzb2.zzd((zzhya) zzhmoVar.zzc(zzd2.zza().zza()));
            zzb2.zze((zzhya) zzhmoVar.zzc(zzd2.zza().zzb()));
            zzb2.zzb(new BigInteger(1, zzd2.zzc().zzA()));
            zzb2.zza(zzd2.zzb());
            zzb2.zzf(zzd2.zza().zzc());
            zzb2.zzc(zzi(zzhotVar.zzd()));
            return zzb2.zzg();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhyg zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            String zzg2 = zzhosVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhvh zze2 = zzhvh.zze(zzhosVar.zzb(), zziew.zzb());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zze2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            zzhxz zzb2 = zzhyc.zzb();
            zzhmo zzhmoVar = zzj;
            zzb2.zzd((zzhya) zzhmoVar.zzc(zze2.zzb().zza()));
            zzb2.zze((zzhya) zzhmoVar.zzc(zze2.zzb().zzb()));
            zzb2.zzb(new BigInteger(1, zze2.zzd().zzA()));
            zzb2.zza(bitLength);
            zzb2.zzf(zze2.zzb().zzc());
            zzb2.zzc(zzi(zzhosVar.zzd()));
            zzhyc zzg3 = zzb2.zzg();
            zzhyf zzc2 = zzhyg.zzc();
            zzc2.zza(zzg3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhosVar.zze());
            return zzc2.zzd();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    static /* synthetic */ zzhos zzf(zzhye zzhyeVar, zzhfr zzhfrVar) {
        zzhve zzk = zzhvf.zzk();
        zzk.zza(0);
        zzk.zzb(zzk(zzhyeVar.zze()));
        byte[] zza2 = zzhma.zza(zzhyeVar.zzi().zzb(zzhfrVar));
        zziei zzieiVar = zziei.zza;
        zzk.zzc(zziei.zzt(zza2, 0, zza2.length));
        byte[] zza3 = zzhma.zza(zzhyeVar.zzf().zzb(zzhfrVar));
        zzk.zzd(zziei.zzt(zza3, 0, zza3.length));
        byte[] zza4 = zzhma.zza(zzhyeVar.zzh().zzb(zzhfrVar));
        zzk.zze(zziei.zzt(zza4, 0, zza4.length));
        byte[] zza5 = zzhma.zza(zzhyeVar.zzj().zzb(zzhfrVar));
        zzk.zzf(zziei.zzt(zza5, 0, zza5.length));
        byte[] zza6 = zzhma.zza(zzhyeVar.zzk().zzb(zzhfrVar));
        zzk.zzg(zziei.zzt(zza6, 0, zza6.length));
        byte[] zza7 = zzhma.zza(zzhyeVar.zzl().zzb(zzhfrVar));
        zzk.zzh(zziei.zzt(zza7, 0, zza7.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzhvf) zzk.zzbu()).zzaM(), zzhfl.zzc, zzh(zzhyeVar.zzd().zze()), zzhyeVar.zze().zzb());
    }

    static /* synthetic */ zzhye zzg(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            String zzg2 = zzhosVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhvf zzj2 = zzhvf.zzj(zzhosVar.zzb(), zziew.zzb());
            if (zzj2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhvh zzb2 = zzj2.zzb();
            if (zzb2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzb2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzb2.zzd().zzA());
            zzhxz zzb3 = zzhyc.zzb();
            zzhmo zzhmoVar = zzj;
            zzb3.zzd((zzhya) zzhmoVar.zzc(zzb2.zzb().zza()));
            zzb3.zze((zzhya) zzhmoVar.zzc(zzb2.zzb().zzb()));
            zzb3.zzb(bigInteger2);
            zzb3.zza(bitLength);
            zzb3.zzf(zzb2.zzb().zzc());
            zzb3.zzc(zzi(zzhosVar.zzd()));
            zzhyc zzg3 = zzb3.zzg();
            zzhyf zzc2 = zzhyg.zzc();
            zzc2.zza(zzg3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhosVar.zze());
            zzhyg zzd2 = zzc2.zzd();
            zzhyd zzc3 = zzhye.zzc();
            zzc3.zza(zzd2);
            zzc3.zzb(zzl(zzj2.zzd(), zzhfrVar), zzl(zzj2.zze(), zzhfrVar));
            zzc3.zzc(zzl(zzj2.zzc(), zzhfrVar));
            zzc3.zzd(zzl(zzj2.zzg(), zzhfrVar), zzl(zzj2.zzh(), zzhfrVar));
            zzc3.zze(zzl(zzj2.zzi(), zzhfrVar));
            return zzc3.zzf();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static zzhfm zzh(zzhyb zzhybVar) throws GeneralSecurityException {
        if (zzhybVar.equals(zzhyb.zzd)) {
            return zzhfm.zzd;
        }
        if (zzhybVar.equals(zzhyb.zza)) {
            return zzhfm.zzb;
        }
        if (zzhybVar.equals(zzhyb.zzb)) {
            return zzhfm.zze;
        }
        if (zzhybVar.equals(zzhyb.zzc)) {
            return zzhfm.zzc;
        }
        String valueOf = String.valueOf(zzhybVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhyb zzi(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzd) {
            return zzhyb.zzd;
        }
        if (zzhfmVar == zzhfm.zzb) {
            return zzhyb.zza;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhyb.zzb;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhyb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhvd zzj(zzhyc zzhycVar) throws GeneralSecurityException {
        zzhvc zzd2 = zzhvd.zzd();
        zzhmo zzhmoVar = zzj;
        zzd2.zza((zzhtl) zzhmoVar.zzb(zzhycVar.zzf()));
        zzd2.zzb((zzhtl) zzhmoVar.zzb(zzhycVar.zzg()));
        zzd2.zzc(zzhycVar.zzh());
        return (zzhvd) zzd2.zzbu();
    }

    private static zzhvh zzk(zzhyg zzhygVar) throws GeneralSecurityException {
        zzhvg zzg2 = zzhvh.zzg();
        zzg2.zzb(zzj(zzhygVar.zzf()));
        byte[] zza2 = zzhma.zza(zzhygVar.zzd());
        zziei zzieiVar = zziei.zza;
        zzg2.zzc(zziei.zzt(zza2, 0, zza2.length));
        byte[] zza3 = zzhma.zza(zzhygVar.zzf().zzd());
        zzg2.zzd(zziei.zzt(zza3, 0, zza3.length));
        zzg2.zza(0);
        return (zzhvh) zzg2.zzbu();
    }

    private static zzici zzl(zziei zzieiVar, zzhfr zzhfrVar) {
        return zzici.zza(new BigInteger(1, zzieiVar.zzA()), zzhfrVar);
    }
}
