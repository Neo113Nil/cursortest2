package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhxr {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zziaz zzc;
    private static final com.google.android.gms.internal.ads.zzhmy zzd;
    private static final com.google.android.gms.internal.ads.zzhmv zze;
    private static final com.google.android.gms.internal.ads.zzhlu zzf;
    private static final com.google.android.gms.internal.ads.zzhlr zzg;
    private static final com.google.android.gms.internal.ads.zzhlu zzh;
    private static final com.google.android.gms.internal.ads.zzhlr zzi;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzb = zza2;
        com.google.android.gms.internal.ads.zziaz zza3 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        zzc = zza3;
        zzd = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhxq.zza, com.google.android.gms.internal.ads.zzhuu.class, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhxl.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zzf = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhxm.zza, com.google.android.gms.internal.ads.zzhuy.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzg = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhxn.zza, zza3, com.google.android.gms.internal.ads.zzhnm.class);
        zzh = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhxo.zza, com.google.android.gms.internal.ads.zzhuw.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzi = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhxp.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzd);
        zzhmrVar.zze(zze);
        zzhmrVar.zzb(zzf);
        zzhmrVar.zzc(zzg);
        zzhmrVar.zzb(zzh);
        zzhmrVar.zzc(zzi);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhuu zzhuuVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        com.google.android.gms.internal.ads.zzhrr zzc2 = com.google.android.gms.internal.ads.zzhrs.zzc();
        zzc2.zza(zzl(zzhuuVar));
        zze2.zzb(((com.google.android.gms.internal.ads.zzhrs) zzc2.zzbu()).zzaM());
        zze2.zzc(zzh(zzhuuVar.zzf()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhuu zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhrs zzb2 = com.google.android.gms.internal.ads.zzhrs.zzb(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza());
            com.google.android.gms.internal.ads.zzhup zzb3 = com.google.android.gms.internal.ads.zzhuu.zzb();
            zzb3.zzc(zzi(zzb2.zza().zza()));
            zzb3.zza(zzo(zzb2.zza().zzh()));
            zzb3.zzb(zzn(zzb2.zza().zzg()));
            zzb3.zzd(zzj(zzhnnVar.zzc().zzc()));
            return zzb3.zze();
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhuy zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            java.lang.String zzg2 = zzhnmVar.zzg();
            java.lang.String.valueOf(zzg2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(java.lang.String.valueOf(zzg2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhry zze2 = com.google.android.gms.internal.ads.zzhry.zze(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zze2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhup zzb2 = com.google.android.gms.internal.ads.zzhuu.zzb();
            zzb2.zzc(zzi(zze2.zzb().zza()));
            zzb2.zza(zzo(zze2.zzb().zzh()));
            zzb2.zzb(zzn(zze2.zzb().zzg()));
            zzb2.zzd(zzj(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhuu zze3 = zzb2.zze();
            com.google.android.gms.internal.ads.zzhux zzc2 = com.google.android.gms.internal.ads.zzhuy.zzc();
            zzc2.zza(zze3);
            zzc2.zzb(new java.security.spec.ECPoint(new java.math.BigInteger(1, zze2.zzc().zzA()), new java.math.BigInteger(1, zze2.zzd().zzA())));
            zzc2.zzc(zzhnmVar.zze());
            return zzc2.zzd();
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzf(com.google.android.gms.internal.ads.zzhuw zzhuwVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        int zzk = zzk(zzhuwVar.zzd().zzd());
        com.google.android.gms.internal.ads.zzhrv zze2 = com.google.android.gms.internal.ads.zzhrw.zze();
        zze2.zza(zzm(zzhuwVar.zze()));
        byte[] zzb2 = com.google.android.gms.internal.ads.zzhku.zzb(zzhuwVar.zzf().zzb(zzhelVar), zzk);
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zze2.zzb(com.google.android.gms.internal.ads.zzida.zzt(zzb2, 0, zzb2.length));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((com.google.android.gms.internal.ads.zzhrw) zze2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PRIVATE, zzh(zzhuwVar.zzd().zzf()), zzhuwVar.zze().zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhuw zzg(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            java.lang.String zzg2 = zzhnmVar.zzg();
            java.lang.String.valueOf(zzg2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(java.lang.String.valueOf(zzg2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhrw zzd2 = com.google.android.gms.internal.ads.zzhrw.zzd(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzd2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhry zzb2 = zzd2.zzb();
            if (zzb2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhup zzb3 = com.google.android.gms.internal.ads.zzhuu.zzb();
            zzb3.zzc(zzi(zzb2.zzb().zza()));
            zzb3.zza(zzo(zzb2.zzb().zzh()));
            zzb3.zzb(zzn(zzb2.zzb().zzg()));
            zzb3.zzd(zzj(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhuu zze2 = zzb3.zze();
            com.google.android.gms.internal.ads.zzhux zzc2 = com.google.android.gms.internal.ads.zzhuy.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(new java.security.spec.ECPoint(new java.math.BigInteger(1, zzb2.zzc().zzA()), new java.math.BigInteger(1, zzb2.zzd().zzA())));
            zzc2.zzc(zzhnmVar.zze());
            com.google.android.gms.internal.ads.zzhuy zzd3 = zzc2.zzd();
            com.google.android.gms.internal.ads.zzhuv zzc3 = com.google.android.gms.internal.ads.zzhuw.zzc();
            zzc3.zza(zzd3);
            zzc3.zzb(com.google.android.gms.internal.ads.zziba.zza(new java.math.BigInteger(1, zzd2.zzc().zzA()), zzhelVar));
            return zzc3.zzc();
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhtm zzh(com.google.android.gms.internal.ads.zzhut zzhutVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhut.zza.equals(zzhutVar)) {
            return com.google.android.gms.internal.ads.zzhtm.TINK;
        }
        if (com.google.android.gms.internal.ads.zzhut.zzb.equals(zzhutVar)) {
            return com.google.android.gms.internal.ads.zzhtm.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzhut.zzd.equals(zzhutVar)) {
            return com.google.android.gms.internal.ads.zzhtm.RAW;
        }
        if (com.google.android.gms.internal.ads.zzhut.zzc.equals(zzhutVar)) {
            return com.google.android.gms.internal.ads.zzhtm.LEGACY;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(zzhutVar.toString()));
    }

    private static com.google.android.gms.internal.ads.zzhur zzi(com.google.android.gms.internal.ads.zzhsh zzhshVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhshVar.ordinal();
        if (ordinal == 2) {
            return com.google.android.gms.internal.ads.zzhur.zzb;
        }
        if (ordinal == 3) {
            return com.google.android.gms.internal.ads.zzhur.zza;
        }
        if (ordinal == 4) {
            return com.google.android.gms.internal.ads.zzhur.zzc;
        }
        int zza2 = zzhshVar.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(zza2);
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.android.gms.internal.ads.zzhut zzj(com.google.android.gms.internal.ads.zzhtm zzhtmVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhtmVar.ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhut.zza;
        }
        if (ordinal == 2) {
            return com.google.android.gms.internal.ads.zzhut.zzc;
        }
        if (ordinal == 3) {
            return com.google.android.gms.internal.ads.zzhut.zzd;
        }
        if (ordinal == 4) {
            return com.google.android.gms.internal.ads.zzhut.zzb;
        }
        int zza2 = zzhtmVar.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static int zzk(com.google.android.gms.internal.ads.zzhuq zzhuqVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhuq.zza.equals(zzhuqVar)) {
            return 33;
        }
        if (com.google.android.gms.internal.ads.zzhuq.zzb.equals(zzhuqVar)) {
            return 49;
        }
        if (com.google.android.gms.internal.ads.zzhuq.zzc.equals(zzhuqVar)) {
            return 67;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize CurveType ".concat(zzhuqVar.toString()));
    }

    private static com.google.android.gms.internal.ads.zzhru zzl(com.google.android.gms.internal.ads.zzhuu zzhuuVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhsh zzhshVar;
        int i;
        com.google.android.gms.internal.ads.zzhrt zzb2 = com.google.android.gms.internal.ads.zzhru.zzb();
        com.google.android.gms.internal.ads.zzhur zze2 = zzhuuVar.zze();
        if (com.google.android.gms.internal.ads.zzhur.zza.equals(zze2)) {
            zzhshVar = com.google.android.gms.internal.ads.zzhsh.SHA256;
        } else if (com.google.android.gms.internal.ads.zzhur.zzb.equals(zze2)) {
            zzhshVar = com.google.android.gms.internal.ads.zzhsh.SHA384;
        } else {
            if (!com.google.android.gms.internal.ads.zzhur.zzc.equals(zze2)) {
                throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(zze2.toString()));
            }
            zzhshVar = com.google.android.gms.internal.ads.zzhsh.SHA512;
        }
        zzb2.zza(zzhshVar);
        com.google.android.gms.internal.ads.zzhuq zzd2 = zzhuuVar.zzd();
        int i2 = 4;
        if (com.google.android.gms.internal.ads.zzhuq.zza.equals(zzd2)) {
            i = 4;
        } else if (com.google.android.gms.internal.ads.zzhuq.zzb.equals(zzd2)) {
            i = 5;
        } else {
            if (!com.google.android.gms.internal.ads.zzhuq.zzc.equals(zzd2)) {
                throw new java.security.GeneralSecurityException("Unable to serialize CurveType ".concat(zzd2.toString()));
            }
            i = 6;
        }
        zzb2.zzb(i);
        com.google.android.gms.internal.ads.zzhus zzc2 = zzhuuVar.zzc();
        if (com.google.android.gms.internal.ads.zzhus.zza.equals(zzc2)) {
            i2 = 3;
        } else if (!com.google.android.gms.internal.ads.zzhus.zzb.equals(zzc2)) {
            throw new java.security.GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzc2.toString()));
        }
        zzb2.zzc(i2);
        return (com.google.android.gms.internal.ads.zzhru) zzb2.zzbu();
    }

    private static com.google.android.gms.internal.ads.zzhry zzm(com.google.android.gms.internal.ads.zzhuy zzhuyVar) throws java.security.GeneralSecurityException {
        int zzk = zzk(zzhuyVar.zzf().zzd());
        java.security.spec.ECPoint zzd2 = zzhuyVar.zzd();
        com.google.android.gms.internal.ads.zzhrx zzg2 = com.google.android.gms.internal.ads.zzhry.zzg();
        zzg2.zza(zzl(zzhuyVar.zzf()));
        byte[] zzb2 = com.google.android.gms.internal.ads.zzhku.zzb(zzd2.getAffineX(), zzk);
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zzg2.zzb(com.google.android.gms.internal.ads.zzida.zzt(zzb2, 0, zzb2.length));
        byte[] zzb3 = com.google.android.gms.internal.ads.zzhku.zzb(zzd2.getAffineY(), zzk);
        zzg2.zzc(com.google.android.gms.internal.ads.zzida.zzt(zzb3, 0, zzb3.length));
        return (com.google.android.gms.internal.ads.zzhry) zzg2.zzbu();
    }

    private static com.google.android.gms.internal.ads.zzhuq zzn(int i) throws java.security.GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return com.google.android.gms.internal.ads.zzhuq.zza;
        }
        if (i2 == 3) {
            return com.google.android.gms.internal.ads.zzhuq.zzb;
        }
        if (i2 == 4) {
            return com.google.android.gms.internal.ads.zzhuq.zzc;
        }
        int zza2 = com.google.android.gms.internal.ads.zzhsg.zza(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 35);
        sb.append("Unable to parse EllipticCurveType: ");
        sb.append(zza2);
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.android.gms.internal.ads.zzhus zzo(int i) throws java.security.GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return com.google.android.gms.internal.ads.zzhus.zza;
        }
        if (i2 == 2) {
            return com.google.android.gms.internal.ads.zzhus.zzb;
        }
        int zza2 = com.google.android.gms.internal.ads.zzhrz.zza(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 40);
        sb.append("Unable to parse EcdsaSignatureEncoding: ");
        sb.append(zza2);
        throw new java.security.GeneralSecurityException(sb.toString());
    }
}
