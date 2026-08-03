package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhhl {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zzhmy zzc;
    private static final com.google.android.gms.internal.ads.zzhmv zzd;
    private static final com.google.android.gms.internal.ads.zzhlu zze;
    private static final com.google.android.gms.internal.ads.zzhlr zzf;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zza2;
        zzc = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhhk.zza, com.google.android.gms.internal.ads.zzhhg.class, com.google.android.gms.internal.ads.zzhnn.class);
        zzd = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhhh.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhhi.zza, com.google.android.gms.internal.ads.zzhhc.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzf = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhhj.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzc);
        zzhmrVar.zze(zzd);
        zzhmrVar.zzb(zze);
        zzhmrVar.zzc(zzf);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhhg zzhhgVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zze2.zzb(zzg(zzhhgVar).zzaM());
        zze2.zzc(zzf(zzhhgVar.zzc()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhhg zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            return zzh(com.google.android.gms.internal.ads.zzhtl.zzc(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza()), zzhnnVar.zzc().zzc());
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzd(com.google.android.gms.internal.ads.zzhhc zzhhcVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhti zzd2 = com.google.android.gms.internal.ads.zzhtj.zzd();
        zzd2.zza(zzg(zzhhcVar.zze()));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((com.google.android.gms.internal.ads.zzhtj) zzd2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.REMOTE, zzf(zzhhcVar.zze().zzc()), zzhhcVar.zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhhc zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzhtj zzc2 = com.google.android.gms.internal.ads.zzhtj.zzc(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzc2.zza() == 0) {
                return com.google.android.gms.internal.ads.zzhhc.zzd(zzh(zzc2.zzb(), zzhnmVar.zzd()), zzhnmVar.zze());
            }
            java.lang.String valueOf = java.lang.String.valueOf(zzc2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    private static com.google.android.gms.internal.ads.zzhtm zzf(com.google.android.gms.internal.ads.zzhhf zzhhfVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhhf.zza.equals(zzhhfVar)) {
            return com.google.android.gms.internal.ads.zzhtm.TINK;
        }
        if (com.google.android.gms.internal.ads.zzhhf.zzb.equals(zzhhfVar)) {
            return com.google.android.gms.internal.ads.zzhtm.RAW;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzhhfVar);
        java.lang.String.valueOf(valueOf);
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(valueOf)));
    }

    private static com.google.android.gms.internal.ads.zzhtl zzg(com.google.android.gms.internal.ads.zzhhg zzhhgVar) throws java.security.GeneralSecurityException {
        try {
            com.google.android.gms.internal.ads.zzhst zzd2 = com.google.android.gms.internal.ads.zzhst.zzd(com.google.android.gms.internal.ads.zzhen.zza(zzhhgVar.zzd()), com.google.android.gms.internal.ads.zzido.zza());
            com.google.android.gms.internal.ads.zzhtk zzd3 = com.google.android.gms.internal.ads.zzhtl.zzd();
            zzd3.zza(zzhhgVar.zzb());
            zzd3.zzb(zzd2);
            return (com.google.android.gms.internal.ads.zzhtl) zzd3.zzbu();
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static com.google.android.gms.internal.ads.zzhhg zzh(com.google.android.gms.internal.ads.zzhtl zzhtlVar, com.google.android.gms.internal.ads.zzhtm zzhtmVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhhe zzhheVar;
        com.google.android.gms.internal.ads.zzhhf zzhhfVar;
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza(zzhtlVar.zzb().zza());
        zze2.zzb(zzhtlVar.zzb().zzb());
        zze2.zzc(com.google.android.gms.internal.ads.zzhtm.RAW);
        com.google.android.gms.internal.ads.zzheh zzb2 = com.google.android.gms.internal.ads.zzhen.zzb(((com.google.android.gms.internal.ads.zzhst) zze2.zzbu()).zzaN());
        if (zzb2 instanceof com.google.android.gms.internal.ads.zzhfx) {
            zzhheVar = com.google.android.gms.internal.ads.zzhhe.zza;
        } else if (zzb2 instanceof com.google.android.gms.internal.ads.zzhgm) {
            zzhheVar = com.google.android.gms.internal.ads.zzhhe.zzc;
        } else if (zzb2 instanceof com.google.android.gms.internal.ads.zzhii) {
            zzhheVar = com.google.android.gms.internal.ads.zzhhe.zzb;
        } else if (zzb2 instanceof com.google.android.gms.internal.ads.zzhfg) {
            zzhheVar = com.google.android.gms.internal.ads.zzhhe.zzd;
        } else if (zzb2 instanceof com.google.android.gms.internal.ads.zzhfo) {
            zzhheVar = com.google.android.gms.internal.ads.zzhhe.zze;
        } else {
            if (!(zzb2 instanceof com.google.android.gms.internal.ads.zzhgg)) {
                throw new java.security.GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzb2.toString()));
            }
            zzhheVar = com.google.android.gms.internal.ads.zzhhe.zzf;
        }
        com.google.android.gms.internal.ads.zzhhd zzhhdVar = new com.google.android.gms.internal.ads.zzhhd(null);
        int ordinal = zzhtmVar.ordinal();
        if (ordinal == 1) {
            zzhhfVar = com.google.android.gms.internal.ads.zzhhf.zza;
        } else {
            if (ordinal != 3) {
                int zza2 = zzhtmVar.zza();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            zzhhfVar = com.google.android.gms.internal.ads.zzhhf.zzb;
        }
        zzhhdVar.zza(zzhhfVar);
        zzhhdVar.zzb(zzhtlVar.zza());
        zzhhdVar.zzd((com.google.android.gms.internal.ads.zzheu) zzb2);
        zzhhdVar.zzc(zzhheVar);
        return zzhhdVar.zze();
    }
}
