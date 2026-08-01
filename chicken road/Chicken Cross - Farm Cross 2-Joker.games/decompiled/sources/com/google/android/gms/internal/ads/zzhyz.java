package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhyz {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzich zzc;
    private static final zzhod zzd;
    private static final zzhoa zze;
    private static final zzhna zzf;
    private static final zzhmx zzg;
    private static final zzhna zzh;
    private static final zzhmx zzi;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzb = zza2;
        zzich zza3 = zzhpd.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        zzc = zza3;
        zzd = zzhod.zzd(zzhyy.zza, zzhvx.class, zzhot.class);
        zze = zzhoa.zzd(zzhyt.zza, zza2, zzhot.class);
        zzf = zzhna.zzd(zzhyu.zza, zzhwb.class, zzhos.class);
        zzg = zzhmx.zzd(zzhyv.zza, zza3, zzhos.class);
        zzh = zzhna.zzd(zzhyw.zza, zzhvz.class, zzhos.class);
        zzi = zzhmx.zzd(zzhyx.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzd);
        zzhnwVar.zze(zze);
        zzhnwVar.zzb(zzf);
        zzhnwVar.zzc(zzg);
        zzhnwVar.zzb(zzh);
        zzhnwVar.zzc(zzi);
    }

    static /* synthetic */ zzhot zzb(zzhvx zzhvxVar) {
        zzhfm zzh2 = zzh(zzhvxVar.zzf());
        zzhsv zzc2 = zzhsw.zzc();
        zzc2.zza(zzl(zzhvxVar));
        return zzhot.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzh2, ((zzhsw) zzc2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhvx zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            String zza2 = zzhotVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhsw zzb2 = zzhsw.zzb(zzhotVar.zzc().zzb(), zziew.zzb());
            zzhvs zzb3 = zzhvx.zzb();
            zzb3.zzc(zzi(zzb2.zza().zza()));
            zzb3.zza(zzo(zzb2.zza().zzh()));
            zzb3.zzb(zzn(zzb2.zza().zzg()));
            zzb3.zzd(zzj(zzhotVar.zzd()));
            return zzb3.zze();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhwb zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            String zzg2 = zzhosVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhtc zze2 = zzhtc.zze(zzhosVar.zzb(), zziew.zzb());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhvs zzb2 = zzhvx.zzb();
            zzb2.zzc(zzi(zze2.zzb().zza()));
            zzb2.zza(zzo(zze2.zzb().zzh()));
            zzb2.zzb(zzn(zze2.zzb().zzg()));
            zzb2.zzd(zzj(zzhosVar.zzd()));
            zzhvx zze3 = zzb2.zze();
            zzhwa zzc2 = zzhwb.zzc();
            zzc2.zza(zze3);
            zzc2.zzb(new ECPoint(new BigInteger(1, zze2.zzc().zzA()), new BigInteger(1, zze2.zzd().zzA())));
            zzc2.zzc(zzhosVar.zze());
            return zzc2.zzd();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    static /* synthetic */ zzhos zzf(zzhvz zzhvzVar, zzhfr zzhfrVar) {
        int zzk = zzk(zzhvzVar.zzd().zzd());
        zzhsz zze2 = zzhta.zze();
        zze2.zza(zzm(zzhvzVar.zze()));
        byte[] zzb2 = zzhma.zzb(zzhvzVar.zzf().zzb(zzhfrVar), zzk);
        zziei zzieiVar = zziei.zza;
        zze2.zzb(zziei.zzt(zzb2, 0, zzb2.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((zzhta) zze2.zzbu()).zzaM(), zzhfl.zzc, zzh(zzhvzVar.zzd().zzf()), zzhvzVar.zze().zzb());
    }

    static /* synthetic */ zzhvz zzg(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            String zzg2 = zzhosVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhta zzd2 = zzhta.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhtc zzb2 = zzd2.zzb();
            if (zzb2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhvs zzb3 = zzhvx.zzb();
            zzb3.zzc(zzi(zzb2.zzb().zza()));
            zzb3.zza(zzo(zzb2.zzb().zzh()));
            zzb3.zzb(zzn(zzb2.zzb().zzg()));
            zzb3.zzd(zzj(zzhosVar.zzd()));
            zzhvx zze2 = zzb3.zze();
            zzhwa zzc2 = zzhwb.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(new ECPoint(new BigInteger(1, zzb2.zzc().zzA()), new BigInteger(1, zzb2.zzd().zzA())));
            zzc2.zzc(zzhosVar.zze());
            zzhwb zzd3 = zzc2.zzd();
            zzhvy zzc3 = zzhvz.zzc();
            zzc3.zza(zzd3);
            zzc3.zzb(zzici.zza(new BigInteger(1, zzd2.zzc().zzA()), zzhfrVar));
            return zzc3.zzc();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static zzhfm zzh(zzhvw zzhvwVar) throws GeneralSecurityException {
        if (zzhvwVar.equals(zzhvw.zza)) {
            return zzhfm.zzb;
        }
        if (zzhvwVar.equals(zzhvw.zzb)) {
            return zzhfm.zze;
        }
        if (zzhvwVar.equals(zzhvw.zzd)) {
            return zzhfm.zzd;
        }
        if (zzhvwVar.equals(zzhvw.zzc)) {
            return zzhfm.zzc;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhvwVar.toString()));
    }

    private static zzhvu zzi(zzhtl zzhtlVar) throws GeneralSecurityException {
        int ordinal = zzhtlVar.ordinal();
        if (ordinal == 2) {
            return zzhvu.zzb;
        }
        if (ordinal == 3) {
            return zzhvu.zza;
        }
        if (ordinal == 4) {
            return zzhvu.zzc;
        }
        int zza2 = zzhtlVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhvw zzj(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar.equals(zzhfm.zzb)) {
            return zzhvw.zza;
        }
        if (zzhfmVar.equals(zzhfm.zze)) {
            return zzhvw.zzb;
        }
        if (zzhfmVar.equals(zzhfm.zzc)) {
            return zzhvw.zzc;
        }
        if (zzhfmVar.equals(zzhfm.zzd)) {
            return zzhvw.zzd;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static int zzk(zzhvt zzhvtVar) throws GeneralSecurityException {
        if (zzhvtVar.equals(zzhvt.zza)) {
            return 33;
        }
        if (zzhvtVar.equals(zzhvt.zzb)) {
            return 49;
        }
        if (zzhvtVar.equals(zzhvt.zzc)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhvtVar.toString()));
    }

    private static zzhsy zzl(zzhvx zzhvxVar) throws GeneralSecurityException {
        zzhtl zzhtlVar;
        int i;
        zzhsx zzb2 = zzhsy.zzb();
        zzhvu zze2 = zzhvxVar.zze();
        if (zze2.equals(zzhvu.zza)) {
            zzhtlVar = zzhtl.SHA256;
        } else if (zze2.equals(zzhvu.zzb)) {
            zzhtlVar = zzhtl.SHA384;
        } else {
            if (!zze2.equals(zzhvu.zzc)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zze2.toString()));
            }
            zzhtlVar = zzhtl.SHA512;
        }
        zzb2.zza(zzhtlVar);
        zzhvt zzd2 = zzhvxVar.zzd();
        int i2 = 4;
        if (zzd2.equals(zzhvt.zza)) {
            i = 4;
        } else if (zzd2.equals(zzhvt.zzb)) {
            i = 5;
        } else {
            if (!zzd2.equals(zzhvt.zzc)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzd2.toString()));
            }
            i = 6;
        }
        zzb2.zzb(i);
        zzhvv zzc2 = zzhvxVar.zzc();
        if (zzc2.equals(zzhvv.zza)) {
            i2 = 3;
        } else if (!zzc2.equals(zzhvv.zzb)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzc2.toString()));
        }
        zzb2.zzc(i2);
        return (zzhsy) zzb2.zzbu();
    }

    private static zzhtc zzm(zzhwb zzhwbVar) throws GeneralSecurityException {
        int zzk = zzk(zzhwbVar.zzf().zzd());
        ECPoint zzd2 = zzhwbVar.zzd();
        zzhtb zzg2 = zzhtc.zzg();
        zzg2.zza(zzl(zzhwbVar.zzf()));
        byte[] zzb2 = zzhma.zzb(zzd2.getAffineX(), zzk);
        zziei zzieiVar = zziei.zza;
        zzg2.zzb(zziei.zzt(zzb2, 0, zzb2.length));
        byte[] zzb3 = zzhma.zzb(zzd2.getAffineY(), zzk);
        zzg2.zzc(zziei.zzt(zzb3, 0, zzb3.length));
        return (zzhtc) zzg2.zzbu();
    }

    private static zzhvt zzn(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return zzhvt.zza;
        }
        if (i2 == 3) {
            return zzhvt.zzb;
        }
        if (i2 == 4) {
            return zzhvt.zzc;
        }
        int zza2 = zzhtk.zza(i);
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 35);
        sb.append("Unable to parse EllipticCurveType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhvv zzo(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return zzhvv.zza;
        }
        if (i2 == 2) {
            return zzhvv.zzb;
        }
        int zza2 = zzhtd.zza(i);
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 40);
        sb.append("Unable to parse EcdsaSignatureEncoding: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }
}
