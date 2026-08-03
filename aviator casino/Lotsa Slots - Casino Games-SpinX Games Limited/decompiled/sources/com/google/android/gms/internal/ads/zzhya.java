package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhya {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zziaz zzc;
    private static final com.google.android.gms.internal.ads.zzhmy zzd;
    private static final com.google.android.gms.internal.ads.zzhmv zze;
    private static final com.google.android.gms.internal.ads.zzhlu zzf;
    private static final com.google.android.gms.internal.ads.zzhlr zzg;
    private static final com.google.android.gms.internal.ads.zzhlu zzh;
    private static final com.google.android.gms.internal.ads.zzhlr zzi;
    private static final com.google.android.gms.internal.ads.zzhli zzj;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zza2;
        com.google.android.gms.internal.ads.zziaz zza3 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zza3;
        zzd = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhxz.zza, com.google.android.gms.internal.ads.zzhve.class, com.google.android.gms.internal.ads.zzhnn.class);
        zze = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhxu.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zzf = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhxv.zza, com.google.android.gms.internal.ads.zzhvl.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzg = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhxw.zza, zza3, com.google.android.gms.internal.ads.zzhnm.class);
        zzh = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhxx.zza, com.google.android.gms.internal.ads.zzhvf.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzi = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhxy.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
        com.google.android.gms.internal.ads.zzhlh zza4 = com.google.android.gms.internal.ads.zzhli.zza();
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.RAW, com.google.android.gms.internal.ads.zzhvd.zzd);
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.TINK, com.google.android.gms.internal.ads.zzhvd.zza);
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.CRUNCHY, com.google.android.gms.internal.ads.zzhvd.zzb);
        zza4.zza(com.google.android.gms.internal.ads.zzhtm.LEGACY, com.google.android.gms.internal.ads.zzhvd.zzc);
        zzj = zza4.zzb();
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zzd);
        zzhmrVar.zze(zze);
        zzhmrVar.zzb(zzf);
        zzhmrVar.zzc(zzg);
        zzhmrVar.zzb(zzh);
        zzhmrVar.zzc(zzi);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhve zzhveVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zze2.zzb(com.google.android.gms.internal.ads.zzhsb.zzc().zzaM());
        zze2.zzc((com.google.android.gms.internal.ads.zzhtm) zzj.zzb(zzhveVar.zzc()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhve zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            if (com.google.android.gms.internal.ads.zzhsb.zzb(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza()).zza() == 0) {
                return com.google.android.gms.internal.ads.zzhve.zzb((com.google.android.gms.internal.ads.zzhvd) zzj.zzc(zzhnnVar.zzc().zzc()));
            }
            throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing Ed25519Parameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhvl zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            java.lang.String zzg2 = zzhnmVar.zzg();
            java.lang.String.valueOf(zzg2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(java.lang.String.valueOf(zzg2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhsf zzc2 = com.google.android.gms.internal.ads.zzhsf.zzc(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzc2.zza() == 0) {
                return com.google.android.gms.internal.ads.zzhvl.zzc((com.google.android.gms.internal.ads.zzhvd) zzj.zzc(zzhnmVar.zzd()), com.google.android.gms.internal.ads.zziaz.zza(zzc2.zzb().zzA()), zzhnmVar.zze());
            }
            throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.android.gms.internal.ads.zziet unused) {
            throw new java.security.GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzf(com.google.android.gms.internal.ads.zzhvf zzhvfVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhsc zze2 = com.google.android.gms.internal.ads.zzhsd.zze();
        zze2.zzb(zzh(zzhvfVar.zze()));
        byte[] zzc2 = zzhvfVar.zzf().zzc(zzhelVar);
        zze2.zza(com.google.android.gms.internal.ads.zzida.zzt(zzc2, 0, zzc2.length));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((com.google.android.gms.internal.ads.zzhsd) zze2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PRIVATE, (com.google.android.gms.internal.ads.zzhtm) zzj.zzb(zzhvfVar.zzd().zzc()), zzhvfVar.zze().zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhvf zzg(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            java.lang.String zzg2 = zzhnmVar.zzg();
            java.lang.String.valueOf(zzg2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(java.lang.String.valueOf(zzg2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhsd zzd2 = com.google.android.gms.internal.ads.zzhsd.zzd(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzd2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhsf zzc2 = zzd2.zzc();
            if (zzc2.zza() == 0) {
                return com.google.android.gms.internal.ads.zzhvf.zzc(com.google.android.gms.internal.ads.zzhvl.zzc((com.google.android.gms.internal.ads.zzhvd) zzj.zzc(zzhnmVar.zzd()), com.google.android.gms.internal.ads.zziaz.zza(zzc2.zzb().zzA()), zzhnmVar.zze()), com.google.android.gms.internal.ads.zzibb.zza(zzd2.zzb().zzA(), zzhelVar));
            }
            throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.android.gms.internal.ads.zziet unused) {
            throw new java.security.GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhsf zzh(com.google.android.gms.internal.ads.zzhvl zzhvlVar) {
        com.google.android.gms.internal.ads.zzhse zzd2 = com.google.android.gms.internal.ads.zzhsf.zzd();
        byte[] zzc2 = zzhvlVar.zzd().zzc();
        zzd2.zza(com.google.android.gms.internal.ads.zzida.zzt(zzc2, 0, zzc2.length));
        return (com.google.android.gms.internal.ads.zzhsf) zzd2.zzbu();
    }
}
