package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhhb {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zzhmy zzc;
    private static final com.google.android.gms.internal.ads.zzhmv zzd;
    private static final com.google.android.gms.internal.ads.zzhlu zze;
    private static final com.google.android.gms.internal.ads.zzhlr zzf;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zza2;
        zzc = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhha.zza, com.google.android.gms.internal.ads.zzhgw.class, com.google.android.gms.internal.ads.zzhnn.class);
        zzd = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhgx.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhgy.zza, com.google.android.gms.internal.ads.zzhgu.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzf = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhgz.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzc);
        zzhmrVar.zze(zzd);
        zzhmrVar.zzb(zze);
        zzhmrVar.zzc(zzf);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhgw zzhgwVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        com.google.android.gms.internal.ads.zzhtg zzc2 = com.google.android.gms.internal.ads.zzhth.zzc();
        zzc2.zza(zzhgwVar.zzc());
        zze2.zzb(((com.google.android.gms.internal.ads.zzhth) zzc2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhgwVar.zzd()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhgw zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return com.google.android.gms.internal.ads.zzhgw.zzb(com.google.android.gms.internal.ads.zzhth.zzb(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza()).zza(), zzg(zzhnnVar.zzc().zzc()));
            } catch (com.google.android.gms.internal.ads.zziet e) {
                throw new java.security.GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
            }
        }
        java.lang.String zza2 = zzhnnVar.zzc().zza();
        java.lang.String.valueOf(zza2);
        throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzd(com.google.android.gms.internal.ads.zzhgu zzhguVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhte zzd2 = com.google.android.gms.internal.ads.zzhtf.zzd();
        com.google.android.gms.internal.ads.zzhtg zzc2 = com.google.android.gms.internal.ads.zzhth.zzc();
        zzc2.zza(zzhguVar.zze().zzc());
        zzd2.zza((com.google.android.gms.internal.ads.zzhth) zzc2.zzbu());
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((com.google.android.gms.internal.ads.zzhtf) zzd2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.REMOTE, zzf(zzhguVar.zze().zzd()), zzhguVar.zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhgu zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzhtf zzc2 = com.google.android.gms.internal.ads.zzhtf.zzc(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzc2.zza() == 0) {
                return com.google.android.gms.internal.ads.zzhgu.zzd(com.google.android.gms.internal.ads.zzhgw.zzb(zzc2.zzb().zza(), zzg(zzhnmVar.zzd())), zzhnmVar.zze());
            }
            java.lang.String valueOf = java.lang.String.valueOf(zzc2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    private static com.google.android.gms.internal.ads.zzhtm zzf(com.google.android.gms.internal.ads.zzhgv zzhgvVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhgv.zza.equals(zzhgvVar)) {
            return com.google.android.gms.internal.ads.zzhtm.TINK;
        }
        if (com.google.android.gms.internal.ads.zzhgv.zzb.equals(zzhgvVar)) {
            return com.google.android.gms.internal.ads.zzhtm.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(zzhgvVar.toString()));
    }

    private static com.google.android.gms.internal.ads.zzhgv zzg(com.google.android.gms.internal.ads.zzhtm zzhtmVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhtmVar.ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhgv.zza;
        }
        if (ordinal == 3) {
            return com.google.android.gms.internal.ads.zzhgv.zzb;
        }
        int zza2 = zzhtmVar.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new java.security.GeneralSecurityException(sb.toString());
    }
}
