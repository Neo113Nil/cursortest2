package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhke {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zzhmy zzc;
    private static final com.google.android.gms.internal.ads.zzhmv zzd;
    private static final com.google.android.gms.internal.ads.zzhlu zze;
    private static final com.google.android.gms.internal.ads.zzhlr zzf;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zza2;
        zzc = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhkd.zza, com.google.android.gms.internal.ads.zzhib.class, com.google.android.gms.internal.ads.zzhnn.class);
        zzd = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhka.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhkb.zza, com.google.android.gms.internal.ads.zzhhw.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzf = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhkc.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzc);
        zzhmrVar.zze(zzd);
        zzhmrVar.zzb(zze);
        zzhmrVar.zzc(zzf);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhib zzhibVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        com.google.android.gms.internal.ads.zzhuh zzd2 = com.google.android.gms.internal.ads.zzhui.zzd();
        com.google.android.gms.internal.ads.zzhuj zzb2 = com.google.android.gms.internal.ads.zzhuk.zzb();
        zzb2.zza(zzhibVar.zzd());
        zzd2.zza((com.google.android.gms.internal.ads.zzhuk) zzb2.zzbu());
        zze2.zzb(((com.google.android.gms.internal.ads.zzhui) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhibVar.zzc()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhib zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhui zzc2 = com.google.android.gms.internal.ads.zzhui.zzc(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzc2.zza() == 0) {
                return com.google.android.gms.internal.ads.zzhib.zzb(zzg(zzhnnVar.zzc().zzc()), zzc2.zzb().zza());
            }
            throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzd(com.google.android.gms.internal.ads.zzhhw zzhhwVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhuf zze2 = com.google.android.gms.internal.ads.zzhug.zze();
        byte[] zzc2 = zzhhwVar.zze().zzc(zzhelVar);
        zze2.zzb(com.google.android.gms.internal.ads.zzida.zzt(zzc2, 0, zzc2.length));
        com.google.android.gms.internal.ads.zzhuj zzb2 = com.google.android.gms.internal.ads.zzhuk.zzb();
        zzb2.zza(zzhhwVar.zzf().zzd());
        zze2.zza((com.google.android.gms.internal.ads.zzhuk) zzb2.zzbu());
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((com.google.android.gms.internal.ads.zzhug) zze2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, zzf(zzhhwVar.zzf().zzc()), zzhhwVar.zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhhw zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzhug zzd2 = com.google.android.gms.internal.ads.zzhug.zzd(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzd2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzc().zzb() == 32) {
                return com.google.android.gms.internal.ads.zzhhw.zzd(com.google.android.gms.internal.ads.zzhib.zzb(zzg(zzhnmVar.zzd()), zzd2.zzb().zza()), com.google.android.gms.internal.ads.zzibb.zza(zzd2.zzc().zzA(), zzhelVar), zzhnmVar.zze());
            }
            throw new java.security.GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (com.google.android.gms.internal.ads.zziet unused) {
            throw new java.security.GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhtm zzf(com.google.android.gms.internal.ads.zzhia zzhiaVar) throws java.security.GeneralSecurityException {
        if (java.util.Objects.equals(zzhiaVar, com.google.android.gms.internal.ads.zzhia.zza)) {
            return com.google.android.gms.internal.ads.zzhtm.TINK;
        }
        if (java.util.Objects.equals(zzhiaVar, com.google.android.gms.internal.ads.zzhia.zzb)) {
            return com.google.android.gms.internal.ads.zzhtm.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(zzhiaVar.toString()));
    }

    private static com.google.android.gms.internal.ads.zzhia zzg(com.google.android.gms.internal.ads.zzhtm zzhtmVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhtmVar.ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhia.zza;
        }
        if (ordinal == 3) {
            return com.google.android.gms.internal.ads.zzhia.zzb;
        }
        int zza2 = zzhtmVar.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new java.security.GeneralSecurityException(sb.toString());
    }
}
