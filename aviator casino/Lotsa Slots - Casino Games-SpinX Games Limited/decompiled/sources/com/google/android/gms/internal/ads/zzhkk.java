package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhkk {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zzhmy zzc;
    private static final com.google.android.gms.internal.ads.zzhmv zzd;
    private static final com.google.android.gms.internal.ads.zzhlu zze;
    private static final com.google.android.gms.internal.ads.zzhlr zzf;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zza2;
        zzc = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhkj.zza, com.google.android.gms.internal.ads.zzhii.class, com.google.android.gms.internal.ads.zzhnn.class);
        zzd = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhkg.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhkh.zza, com.google.android.gms.internal.ads.zzhic.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzf = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhki.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzc);
        zzhmrVar.zze(zzd);
        zzhmrVar.zzb(zze);
        zzhmrVar.zzc(zzf);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhii zzhiiVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zze2.zzb(com.google.android.gms.internal.ads.zzhuo.zzc().zzaM());
        zze2.zzc(zzf(zzhiiVar.zzc()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhii zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            if (com.google.android.gms.internal.ads.zzhuo.zzb(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza()).zza() == 0) {
                return com.google.android.gms.internal.ads.zzhii.zzb(zzg(zzhnnVar.zzc().zzc()));
            }
            throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzd(com.google.android.gms.internal.ads.zzhic zzhicVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhul zzd2 = com.google.android.gms.internal.ads.zzhum.zzd();
        byte[] zzc2 = zzhicVar.zze().zzc(zzhelVar);
        zzd2.zza(com.google.android.gms.internal.ads.zzida.zzt(zzc2, 0, zzc2.length));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((com.google.android.gms.internal.ads.zzhum) zzd2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, zzf(zzhicVar.zzf().zzc()), zzhicVar.zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhic zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzhum zzc2 = com.google.android.gms.internal.ads.zzhum.zzc(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzc2.zza() == 0) {
                return com.google.android.gms.internal.ads.zzhic.zzd(zzg(zzhnmVar.zzd()), com.google.android.gms.internal.ads.zzibb.zza(zzc2.zzb().zzA(), zzhelVar), zzhnmVar.zze());
            }
            throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.android.gms.internal.ads.zziet unused) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhtm zzf(com.google.android.gms.internal.ads.zzhih zzhihVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhih.zza.equals(zzhihVar)) {
            return com.google.android.gms.internal.ads.zzhtm.TINK;
        }
        if (com.google.android.gms.internal.ads.zzhih.zzb.equals(zzhihVar)) {
            return com.google.android.gms.internal.ads.zzhtm.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzhih.zzc.equals(zzhihVar)) {
            return com.google.android.gms.internal.ads.zzhtm.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(zzhihVar.toString()));
    }

    private static com.google.android.gms.internal.ads.zzhih zzg(com.google.android.gms.internal.ads.zzhtm zzhtmVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhtmVar.ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhih.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return com.google.android.gms.internal.ads.zzhih.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtmVar.zza();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return com.google.android.gms.internal.ads.zzhih.zzb;
    }
}
