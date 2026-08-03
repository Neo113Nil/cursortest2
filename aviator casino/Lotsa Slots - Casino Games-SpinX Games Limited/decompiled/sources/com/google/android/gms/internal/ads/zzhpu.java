package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhpu {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zziaz zzb;
    private static final com.google.android.gms.internal.ads.zzhli zzc;
    private static final com.google.android.gms.internal.ads.zzhli zzd;
    private static final com.google.android.gms.internal.ads.zzhmy zze;
    private static final com.google.android.gms.internal.ads.zzhmv zzf;
    private static final com.google.android.gms.internal.ads.zzhlu zzg;
    private static final com.google.android.gms.internal.ads.zzhlr zzh;

    static {
        com.google.android.gms.internal.ads.zziaz zza2 = com.google.android.gms.internal.ads.zzhnz.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        com.google.android.gms.internal.ads.zzhlh zza3 = com.google.android.gms.internal.ads.zzhli.zza();
        zza3.zza(com.google.android.gms.internal.ads.zzhtm.RAW, com.google.android.gms.internal.ads.zzhou.zzd);
        zza3.zza(com.google.android.gms.internal.ads.zzhtm.TINK, com.google.android.gms.internal.ads.zzhou.zza);
        zza3.zza(com.google.android.gms.internal.ads.zzhtm.LEGACY, com.google.android.gms.internal.ads.zzhou.zzc);
        zza3.zza(com.google.android.gms.internal.ads.zzhtm.CRUNCHY, com.google.android.gms.internal.ads.zzhou.zzb);
        zzc = zza3.zzb();
        com.google.android.gms.internal.ads.zzhlh zza4 = com.google.android.gms.internal.ads.zzhli.zza();
        zza4.zza(com.google.android.gms.internal.ads.zzhsh.SHA1, com.google.android.gms.internal.ads.zzhot.zza);
        zza4.zza(com.google.android.gms.internal.ads.zzhsh.SHA224, com.google.android.gms.internal.ads.zzhot.zzb);
        zza4.zza(com.google.android.gms.internal.ads.zzhsh.SHA256, com.google.android.gms.internal.ads.zzhot.zzc);
        zza4.zza(com.google.android.gms.internal.ads.zzhsh.SHA384, com.google.android.gms.internal.ads.zzhot.zzd);
        zza4.zza(com.google.android.gms.internal.ads.zzhsh.SHA512, com.google.android.gms.internal.ads.zzhot.zze);
        zzd = zza4.zzb();
        zze = com.google.android.gms.internal.ads.zzhmy.zzd(com.google.android.gms.internal.ads.zzhpt.zza, com.google.android.gms.internal.ads.zzhov.class, com.google.android.gms.internal.ads.zzhnn.class);
        zzf = com.google.android.gms.internal.ads.zzhmv.zzd(com.google.android.gms.internal.ads.zzhpq.zza, zza2, com.google.android.gms.internal.ads.zzhnn.class);
        zzg = com.google.android.gms.internal.ads.zzhlu.zzd(com.google.android.gms.internal.ads.zzhpr.zza, com.google.android.gms.internal.ads.zzhom.class, com.google.android.gms.internal.ads.zzhnm.class);
        zzh = com.google.android.gms.internal.ads.zzhlr.zzd(com.google.android.gms.internal.ads.zzhps.zza, zza2, com.google.android.gms.internal.ads.zzhnm.class);
    }

    public static void zza(com.google.android.gms.internal.ads.zzhmr zzhmrVar) throws java.security.GeneralSecurityException {
        zzhmrVar.zzd(zze);
        zzhmrVar.zze(zzf);
        zzhmrVar.zzb(zzg);
        zzhmrVar.zzc(zzh);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhov zzhovVar) {
        com.google.android.gms.internal.ads.zzhss zze2 = com.google.android.gms.internal.ads.zzhst.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        com.google.android.gms.internal.ads.zzhsk zze3 = com.google.android.gms.internal.ads.zzhsl.zze();
        zze3.zza(zzf(zzhovVar));
        zze3.zzb(zzhovVar.zzc());
        zze2.zzb(((com.google.android.gms.internal.ads.zzhsl) zze3.zzbu()).zzaM());
        zze2.zzc((com.google.android.gms.internal.ads.zzhtm) zzc.zzb(zzhovVar.zzf()));
        return com.google.android.gms.internal.ads.zzhnn.zza((com.google.android.gms.internal.ads.zzhst) zze2.zzbu());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhov zzc(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        if (!zzhnnVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            java.lang.String zza2 = zzhnnVar.zzc().zza();
            java.lang.String.valueOf(zza2);
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zza2)));
        }
        try {
            com.google.android.gms.internal.ads.zzhsl zzd2 = com.google.android.gms.internal.ads.zzhsl.zzd(zzhnnVar.zzc().zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzd2.zzc() != 0) {
                int zzc2 = zzd2.zzc();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc2).length() + 47);
                sb.append("Parsing HmacParameters failed: unknown Version ");
                sb.append(zzc2);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            com.google.android.gms.internal.ads.zzhos zzb2 = com.google.android.gms.internal.ads.zzhov.zzb();
            zzb2.zza(zzd2.zzb());
            zzb2.zzb(zzd2.zza().zzb());
            zzb2.zzd((com.google.android.gms.internal.ads.zzhot) zzd.zzc(zzd2.zza().zza()));
            zzb2.zzc((com.google.android.gms.internal.ads.zzhou) zzc.zzc(zzhnnVar.zzc().zzc()));
            return zzb2.zze();
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.security.GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhnm zzd(com.google.android.gms.internal.ads.zzhom zzhomVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        com.google.android.gms.internal.ads.zzhsi zze2 = com.google.android.gms.internal.ads.zzhsj.zze();
        zze2.zza(zzf(zzhomVar.zzf()));
        byte[] zzc2 = zzhomVar.zzd().zzc(zzhelVar);
        zze2.zzb(com.google.android.gms.internal.ads.zzida.zzt(zzc2, 0, zzc2.length));
        return com.google.android.gms.internal.ads.zzhnm.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((com.google.android.gms.internal.ads.zzhsj) zze2.zzbu()).zzaM(), com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, (com.google.android.gms.internal.ads.zzhtm) zzc.zzb(zzhomVar.zzf().zzf()), zzhomVar.zzb());
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhom zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        if (!zzhnmVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzhsj zzd2 = com.google.android.gms.internal.ads.zzhsj.zzd(zzhnmVar.zzb(), com.google.android.gms.internal.ads.zzido.zza());
            if (zzd2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzhos zzb2 = com.google.android.gms.internal.ads.zzhov.zzb();
            zzb2.zza(zzd2.zzc().zzb());
            zzb2.zzb(zzd2.zzb().zzb());
            zzb2.zzd((com.google.android.gms.internal.ads.zzhot) zzd.zzc(zzd2.zzb().zza()));
            zzb2.zzc((com.google.android.gms.internal.ads.zzhou) zzc.zzc(zzhnmVar.zzd()));
            com.google.android.gms.internal.ads.zzhov zze2 = zzb2.zze();
            com.google.android.gms.internal.ads.zzhol zzc2 = com.google.android.gms.internal.ads.zzhom.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(com.google.android.gms.internal.ads.zzibb.zza(zzd2.zzc().zzA(), zzhelVar));
            zzc2.zzc(zzhnmVar.zze());
            return zzc2.zzd();
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static com.google.android.gms.internal.ads.zzhsn zzf(com.google.android.gms.internal.ads.zzhov zzhovVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhsm zzc2 = com.google.android.gms.internal.ads.zzhsn.zzc();
        zzc2.zzb(zzhovVar.zzd());
        zzc2.zza((com.google.android.gms.internal.ads.zzhsh) zzd.zzb(zzhovVar.zzg()));
        return (com.google.android.gms.internal.ads.zzhsn) zzc2.zzbu();
    }
}
