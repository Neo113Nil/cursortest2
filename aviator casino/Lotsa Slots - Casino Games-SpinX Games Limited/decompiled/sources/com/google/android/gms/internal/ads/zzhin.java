package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhin {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zzhmy zzc;
    private static final com.google.android.gms.internal.ads.zzhmv zzd;
    private static final com.google.android.gms.internal.ads.zzhlu zze;
    private static final com.google.android.gms.internal.ads.zzhlr zzf;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhim.zza, com.google.android.gms.internal.ads.zzhfg.class, com.google.android.gms.internal.ads.zzhnn.class);
        zzd = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhij.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhik.zza, com.google.android.gms.internal.ads.zzhey.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzf = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhil.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzc);
        zzhmrVar.zze(zzd);
        zzhmrVar.zzb(zze);
        zzhmrVar.zzc(zzf);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhfg zzhfgVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        com.google.android.gms.internal.ads.zzhqr zzd2 = com.google.android.gms.internal.ads.zzhqs.zzd();
        com.google.android.gms.internal.ads.zzhqv zzc2 = com.google.android.gms.internal.ads.zzhqw.zzc();
        com.google.android.gms.internal.ads.zzhqx zzb2 = com.google.android.gms.internal.ads.zzhqy.zzb();
        zzb2.zza(zzhfgVar.zzf());
        zzc2.zza((com.google.android.gms.internal.ads.zzhqy) zzb2.zzbu());
        zzc2.zzb(zzhfgVar.zzc());
        zzd2.zza((com.google.android.gms.internal.ads.zzhqw) zzc2.zzbu());
        com.google.android.gms.internal.ads.zzhsk zze3 = com.google.android.gms.internal.ads.zzhsl.zze();
        zze3.zza(zzi(zzhfgVar));
        zze3.zzb(zzhfgVar.zzd());
        zzd2.zzb((com.google.android.gms.internal.ads.zzhsl) zze3.zzbu());
        zze2.zzb(((com.google.android.gms.internal.ads.zzhqs) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhfgVar.zzg()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhfg zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhqs zzc2 = com.google.android.gms.internal.ads.zzhqs.zzc(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzc2.zzb().zzc() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhfd zzb2 = com.google.android.gms.internal.ads.zzhfg.zzb();
            zzb2.zza(zzc2.zza().zzb());
            zzb2.zzb(zzc2.zzb().zzb());
            zzb2.zzc(zzc2.zza().zza().zza());
            zzb2.zzd(zzc2.zzb().zza().zzb());
            zzb2.zzf(zzh(zzc2.zzb().zza().zza()));
            zzb2.zze(zzg(zzhnnVar.zzc().zzc()));
            return zzb2.zzg();
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzd(com.google.android.gms.internal.ads.zzhey zzheyVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhqp zze2 = com.google.android.gms.internal.ads.zzhqq.zze();
        com.google.android.gms.internal.ads.zzhqt zzd2 = com.google.android.gms.internal.ads.zzhqu.zzd();
        com.google.android.gms.internal.ads.zzhqx zzb2 = com.google.android.gms.internal.ads.zzhqy.zzb();
        zzb2.zza(zzheyVar.zzg().zzf());
        zzd2.zza((com.google.android.gms.internal.ads.zzhqy) zzb2.zzbu());
        byte[] zzc2 = zzheyVar.zze().zzc(zzhelVar);
        zzd2.zzb(com.google.android.gms.internal.ads.zzida.zzt(zzc2, 0, zzc2.length));
        zze2.zza((com.google.android.gms.internal.ads.zzhqu) zzd2.zzbu());
        com.google.android.gms.internal.ads.zzhsi zze3 = com.google.android.gms.internal.ads.zzhsj.zze();
        zze3.zza(zzi(zzheyVar.zzg()));
        byte[] zzc3 = zzheyVar.zzf().zzc(zzhelVar);
        zze3.zzb(com.google.android.gms.internal.ads.zzida.zzt(zzc3, 0, zzc3.length));
        zze2.zzb((com.google.android.gms.internal.ads.zzhsj) zze3.zzbu());
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((com.google.android.gms.internal.ads.zzhqq) zze2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, zzf(zzheyVar.zzg().zzg()), zzheyVar.zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhey zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzhqq zzd2 = com.google.android.gms.internal.ads.zzhqq.zzd(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzd2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzb().zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzd2.zzc().zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhfd zzb2 = com.google.android.gms.internal.ads.zzhfg.zzb();
            zzb2.zza(zzd2.zzb().zzc().zzb());
            zzb2.zzb(zzd2.zzc().zzc().zzb());
            zzb2.zzc(zzd2.zzb().zzb().zza());
            zzb2.zzd(zzd2.zzc().zzb().zzb());
            zzb2.zzf(zzh(zzd2.zzc().zzb().zza()));
            zzb2.zze(zzg(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhfg zzg = zzb2.zzg();
            com.google.android.gms.internal.ads.zzhex zzd3 = com.google.android.gms.internal.ads.zzhey.zzd();
            zzd3.zza(zzg);
            zzd3.zzb(com.google.android.gms.internal.ads.zzibb.zza(zzd2.zzb().zzc().zzA(), zzhelVar));
            zzd3.zzc(com.google.android.gms.internal.ads.zzibb.zza(zzd2.zzc().zzc().zzA(), zzhelVar));
            zzd3.zzd(zzhnmVar.zze());
            return zzd3.zze();
        } catch (com.google.android.gms.internal.ads.zziet unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhtm zzf(com.google.android.gms.internal.ads.zzhff zzhffVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhff.zza.equals(zzhffVar)) {
            return com.google.android.gms.internal.ads.zzhtm.TINK;
        }
        if (com.google.android.gms.internal.ads.zzhff.zzb.equals(zzhffVar)) {
            return com.google.android.gms.internal.ads.zzhtm.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzhff.zzc.equals(zzhffVar)) {
            return com.google.android.gms.internal.ads.zzhtm.RAW;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzhffVar);
        java.lang.String.valueOf(valueOf);
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(valueOf)));
    }

    private static com.google.android.gms.internal.ads.zzhff zzg(com.google.android.gms.internal.ads.zzhtm zzhtmVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhtmVar.ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhff.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return com.google.android.gms.internal.ads.zzhff.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtmVar.zza();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return com.google.android.gms.internal.ads.zzhff.zzb;
    }

    private static com.google.android.gms.internal.ads.zzhfe zzh(com.google.android.gms.internal.ads.zzhsh zzhshVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhshVar.ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhfe.zza;
        }
        if (ordinal == 2) {
            return com.google.android.gms.internal.ads.zzhfe.zzd;
        }
        if (ordinal == 3) {
            return com.google.android.gms.internal.ads.zzhfe.zzc;
        }
        if (ordinal == 4) {
            return com.google.android.gms.internal.ads.zzhfe.zze;
        }
        if (ordinal == 5) {
            return com.google.android.gms.internal.ads.zzhfe.zzb;
        }
        int zza2 = zzhshVar.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(zza2);
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.android.gms.internal.ads.zzhsn zzi(com.google.android.gms.internal.ads.zzhfg zzhfgVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhsh zzhshVar;
        com.google.android.gms.internal.ads.zzhsm zzc2 = com.google.android.gms.internal.ads.zzhsn.zzc();
        zzc2.zzb(zzhfgVar.zze());
        com.google.android.gms.internal.ads.zzhfe zzh = zzhfgVar.zzh();
        if (com.google.android.gms.internal.ads.zzhfe.zza.equals(zzh)) {
            zzhshVar = com.google.android.gms.internal.ads.zzhsh.SHA1;
        } else if (com.google.android.gms.internal.ads.zzhfe.zzb.equals(zzh)) {
            zzhshVar = com.google.android.gms.internal.ads.zzhsh.SHA224;
        } else if (com.google.android.gms.internal.ads.zzhfe.zzc.equals(zzh)) {
            zzhshVar = com.google.android.gms.internal.ads.zzhsh.SHA256;
        } else if (com.google.android.gms.internal.ads.zzhfe.zzd.equals(zzh)) {
            zzhshVar = com.google.android.gms.internal.ads.zzhsh.SHA384;
        } else {
            if (!com.google.android.gms.internal.ads.zzhfe.zze.equals(zzh)) {
                java.lang.String valueOf = java.lang.String.valueOf(zzh);
                java.lang.String.valueOf(valueOf);
                throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(valueOf)));
            }
            zzhshVar = com.google.android.gms.internal.ads.zzhsh.SHA512;
        }
        zzc2.zza(zzhshVar);
        return (com.google.android.gms.internal.ads.zzhsn) zzc2.zzbu();
    }
}
