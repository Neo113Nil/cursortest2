package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhis {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zzhmy zzc;
    private static final com.google.android.gms.internal.ads.zzhmv zzd;
    private static final com.google.android.gms.internal.ads.zzhlu zze;
    private static final com.google.android.gms.internal.ads.zzhlr zzf;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhir.zza, com.google.android.gms.internal.ads.zzhfo.class, com.google.android.gms.internal.ads.zzhnn.class);
        zzd = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhio.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhip.zza, com.google.android.gms.internal.ads.zzhfi.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzf = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhiq.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzc);
        zzhmrVar.zze(zzd);
        zzhmrVar.zzb(zze);
        zzhmrVar.zzc(zzf);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhfo zzhfoVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        com.google.android.gms.internal.ads.zzhrb zzd2 = com.google.android.gms.internal.ads.zzhrc.zzd();
        zzd2.zza(zzh(zzhfoVar));
        zzd2.zzb(zzhfoVar.zzc());
        zze2.zzb(((com.google.android.gms.internal.ads.zzhrc) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhfoVar.zze()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhfo zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhrc zzc2 = com.google.android.gms.internal.ads.zzhrc.zzc(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza());
            com.google.android.gms.internal.ads.zzhfm zzb2 = com.google.android.gms.internal.ads.zzhfo.zzb();
            zzb2.zza(zzc2.zzb());
            zzb2.zzb(zzc2.zza().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhnnVar.zzc().zzc()));
            return zzb2.zze();
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzd(com.google.android.gms.internal.ads.zzhfi zzhfiVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhqz zze2 = com.google.android.gms.internal.ads.zzhra.zze();
        zze2.zza(zzh(zzhfiVar.zzf()));
        byte[] zzc2 = zzhfiVar.zze().zzc(zzhelVar);
        zze2.zzb(com.google.android.gms.internal.ads.zzida.zzt(zzc2, 0, zzc2.length));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((com.google.android.gms.internal.ads.zzhra) zze2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, zzf(zzhfiVar.zzf().zze()), zzhfiVar.zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhfi zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzhra zzd2 = com.google.android.gms.internal.ads.zzhra.zzd(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzd2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhfm zzb2 = com.google.android.gms.internal.ads.zzhfo.zzb();
            zzb2.zza(zzd2.zzc().zzb());
            zzb2.zzb(zzd2.zzb().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhfo zze2 = zzb2.zze();
            com.google.android.gms.internal.ads.zzhfh zzd3 = com.google.android.gms.internal.ads.zzhfi.zzd();
            zzd3.zza(zze2);
            zzd3.zzb(com.google.android.gms.internal.ads.zzibb.zza(zzd2.zzc().zzA(), zzhelVar));
            zzd3.zzc(zzhnmVar.zze());
            return zzd3.zzd();
        } catch (com.google.android.gms.internal.ads.zziet unused) {
            throw new java.security.GeneralSecurityException("Parsing AesEaxKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhtm zzf(com.google.android.gms.internal.ads.zzhfn zzhfnVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhfn.zza.equals(zzhfnVar)) {
            return com.google.android.gms.internal.ads.zzhtm.TINK;
        }
        if (com.google.android.gms.internal.ads.zzhfn.zzb.equals(zzhfnVar)) {
            return com.google.android.gms.internal.ads.zzhtm.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzhfn.zzc.equals(zzhfnVar)) {
            return com.google.android.gms.internal.ads.zzhtm.RAW;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzhfnVar);
        java.lang.String.valueOf(valueOf);
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(valueOf)));
    }

    private static com.google.android.gms.internal.ads.zzhfn zzg(com.google.android.gms.internal.ads.zzhtm zzhtmVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhtmVar.ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhfn.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return com.google.android.gms.internal.ads.zzhfn.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtmVar.zza();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return com.google.android.gms.internal.ads.zzhfn.zzb;
    }

    private static com.google.android.gms.internal.ads.zzhre zzh(com.google.android.gms.internal.ads.zzhfo zzhfoVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhrd zzb2 = com.google.android.gms.internal.ads.zzhre.zzb();
        zzb2.zza(zzhfoVar.zzd());
        return (com.google.android.gms.internal.ads.zzhre) zzb2.zzbu();
    }
}
