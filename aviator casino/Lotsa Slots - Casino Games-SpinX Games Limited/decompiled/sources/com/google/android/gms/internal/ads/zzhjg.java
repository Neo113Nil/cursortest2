package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhjg {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zzhmy zzc;
    private static final com.google.android.gms.internal.ads.zzhmv zzd;
    private static final com.google.android.gms.internal.ads.zzhlu zze;
    private static final com.google.android.gms.internal.ads.zzhlr zzf;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhjf.zza, com.google.android.gms.internal.ads.zzhgg.class, com.google.android.gms.internal.ads.zzhnn.class);
        zzd = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhjc.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhjd.zza, com.google.android.gms.internal.ads.zzhfz.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzf = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhje.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzc);
        zzhmrVar.zze(zzd);
        zzhmrVar.zzb(zze);
        zzhmrVar.zzc(zzf);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhgg zzhggVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        com.google.android.gms.internal.ads.zzhrl zzd2 = com.google.android.gms.internal.ads.zzhrm.zzd();
        zzd2.zza(zzhggVar.zzc());
        zze2.zzb(((com.google.android.gms.internal.ads.zzhrm) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhggVar.zzd()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhgg zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhrm zzc2 = com.google.android.gms.internal.ads.zzhrm.zzc(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzc2.zzb() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            com.google.android.gms.internal.ads.zzhge zzb2 = com.google.android.gms.internal.ads.zzhgg.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzg(zzhnnVar.zzc().zzc()));
            return zzb2.zzc();
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzd(com.google.android.gms.internal.ads.zzhfz zzhfzVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhrj zzd2 = com.google.android.gms.internal.ads.zzhrk.zzd();
        byte[] zzc2 = zzhfzVar.zze().zzc(zzhelVar);
        zzd2.zza(com.google.android.gms.internal.ads.zzida.zzt(zzc2, 0, zzc2.length));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((com.google.android.gms.internal.ads.zzhrk) zzd2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, zzf(zzhfzVar.zzf().zzd()), zzhfzVar.zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhfz zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzhrk zzc2 = com.google.android.gms.internal.ads.zzhrk.zzc(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzc2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhge zzb2 = com.google.android.gms.internal.ads.zzhgg.zzb();
            zzb2.zza(zzc2.zzb().zzb());
            zzb2.zzb(zzg(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhgg zzc3 = zzb2.zzc();
            com.google.android.gms.internal.ads.zzhfy zzd2 = com.google.android.gms.internal.ads.zzhfz.zzd();
            zzd2.zza(zzc3);
            zzd2.zzb(com.google.android.gms.internal.ads.zzibb.zza(zzc2.zzb().zzA(), zzhelVar));
            zzd2.zzc(zzhnmVar.zze());
            return zzd2.zzd();
        } catch (com.google.android.gms.internal.ads.zziet unused) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhtm zzf(com.google.android.gms.internal.ads.zzhgf zzhgfVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhgf.zza.equals(zzhgfVar)) {
            return com.google.android.gms.internal.ads.zzhtm.TINK;
        }
        if (com.google.android.gms.internal.ads.zzhgf.zzb.equals(zzhgfVar)) {
            return com.google.android.gms.internal.ads.zzhtm.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzhgf.zzc.equals(zzhgfVar)) {
            return com.google.android.gms.internal.ads.zzhtm.RAW;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzhgfVar);
        java.lang.String.valueOf(valueOf);
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(valueOf)));
    }

    private static com.google.android.gms.internal.ads.zzhgf zzg(com.google.android.gms.internal.ads.zzhtm zzhtmVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhtmVar.ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhgf.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return com.google.android.gms.internal.ads.zzhgf.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtmVar.zza();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return com.google.android.gms.internal.ads.zzhgf.zzb;
    }
}
