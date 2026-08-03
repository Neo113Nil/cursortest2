package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhpl {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zzhmy zzc;
    private static final com.google.android.gms.internal.ads.zzhmv zzd;
    private static final com.google.android.gms.internal.ads.zzhlu zze;
    private static final com.google.android.gms.internal.ads.zzhlr zzf;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhpk.zza, com.google.android.gms.internal.ads.zzhoi.class, com.google.android.gms.internal.ads.zzhnn.class);
        zzd = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhph.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhpi.zza, com.google.android.gms.internal.ads.zzhob.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzf = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhpj.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzc);
        zzhmrVar.zze(zzd);
        zzhmrVar.zzb(zze);
        zzhmrVar.zzc(zzf);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhoi zzhoiVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        com.google.android.gms.internal.ads.zzhql zzd2 = com.google.android.gms.internal.ads.zzhqm.zzd();
        zzd2.zzb(zzh(zzhoiVar));
        zzd2.zza(zzhoiVar.zzc());
        zze2.zzb(((com.google.android.gms.internal.ads.zzhqm) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhoiVar.zzf()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhoi zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhqm zzc2 = com.google.android.gms.internal.ads.zzhqm.zzc(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza());
            com.google.android.gms.internal.ads.zzhog zzb2 = com.google.android.gms.internal.ads.zzhoi.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzc2.zzb().zza());
            zzb2.zzc(zzg(zzhnnVar.zzc().zzc()));
            return zzb2.zzd();
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzd(com.google.android.gms.internal.ads.zzhob zzhobVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhqj zze2 = com.google.android.gms.internal.ads.zzhqk.zze();
        zze2.zzb(zzh(zzhobVar.zzf()));
        byte[] zzc2 = zzhobVar.zzd().zzc(zzhelVar);
        zze2.zza(com.google.android.gms.internal.ads.zzida.zzt(zzc2, 0, zzc2.length));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((com.google.android.gms.internal.ads.zzhqk) zze2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, zzf(zzhobVar.zzf().zzf()), zzhobVar.zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhob zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzhqk zzd2 = com.google.android.gms.internal.ads.zzhqk.zzd(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzd2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhog zzb2 = com.google.android.gms.internal.ads.zzhoi.zzb();
            zzb2.zza(zzd2.zzb().zzb());
            zzb2.zzb(zzd2.zzc().zza());
            zzb2.zzc(zzg(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhoi zzd3 = zzb2.zzd();
            com.google.android.gms.internal.ads.zzhoa zzc2 = com.google.android.gms.internal.ads.zzhob.zzc();
            zzc2.zza(zzd3);
            zzc2.zzb(com.google.android.gms.internal.ads.zzibb.zza(zzd2.zzb().zzA(), zzhelVar));
            zzc2.zzc(zzhnmVar.zze());
            return zzc2.zzd();
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhtm zzf(com.google.android.gms.internal.ads.zzhoh zzhohVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhoh.zza.equals(zzhohVar)) {
            return com.google.android.gms.internal.ads.zzhtm.TINK;
        }
        if (com.google.android.gms.internal.ads.zzhoh.zzb.equals(zzhohVar)) {
            return com.google.android.gms.internal.ads.zzhtm.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzhoh.zzd.equals(zzhohVar)) {
            return com.google.android.gms.internal.ads.zzhtm.RAW;
        }
        if (com.google.android.gms.internal.ads.zzhoh.zzc.equals(zzhohVar)) {
            return com.google.android.gms.internal.ads.zzhtm.LEGACY;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzhohVar);
        java.lang.String.valueOf(valueOf);
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(valueOf)));
    }

    private static com.google.android.gms.internal.ads.zzhoh zzg(com.google.android.gms.internal.ads.zzhtm zzhtmVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhtmVar.ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhoh.zza;
        }
        if (ordinal == 2) {
            return com.google.android.gms.internal.ads.zzhoh.zzc;
        }
        if (ordinal == 3) {
            return com.google.android.gms.internal.ads.zzhoh.zzd;
        }
        if (ordinal == 4) {
            return com.google.android.gms.internal.ads.zzhoh.zzb;
        }
        int zza2 = zzhtmVar.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.android.gms.internal.ads.zzhqo zzh(com.google.android.gms.internal.ads.zzhoi zzhoiVar) {
        com.google.android.gms.internal.ads.zzhqn zzb2 = com.google.android.gms.internal.ads.zzhqo.zzb();
        zzb2.zza(zzhoiVar.zzd());
        return (com.google.android.gms.internal.ads.zzhqo) zzb2.zzbu();
    }
}
