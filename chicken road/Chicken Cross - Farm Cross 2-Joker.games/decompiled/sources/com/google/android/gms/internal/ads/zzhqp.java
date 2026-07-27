package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhqp {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzhod.zzd(zzhqo.zza, zzhpm.class, zzhot.class);
        zzd = zzhoa.zzd(zzhql.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhqm.zza, zzhpf.class, zzhos.class);
        zzf = zzhmx.zzd(zzhqn.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhot zzb(zzhpm zzhpmVar) {
        zzhfm zzf2 = zzf(zzhpmVar.zzf());
        zzhrp zzd2 = zzhrq.zzd();
        zzd2.zzb(zzh(zzhpmVar));
        zzd2.zza(zzhpmVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", zzf2, ((zzhrq) zzd2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhpm zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            String zza2 = zzhotVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhrq zzc2 = zzhrq.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            zzhpk zzb2 = zzhpm.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzc2.zzb().zza());
            zzb2.zzc(zzg(zzhotVar.zzd()));
            return zzb2.zzd();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhpf zzhpfVar, zzhfr zzhfrVar) {
        zzhrn zze2 = zzhro.zze();
        zze2.zzb(zzh(zzhpfVar.zzf()));
        byte[] zzc2 = zzhpfVar.zzd().zzc(zzhfrVar);
        zze2.zza(zziei.zzt(zzc2, 0, zzc2.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhro) zze2.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhpfVar.zzf().zzf()), zzhpfVar.zzb());
    }

    static /* synthetic */ zzhpf zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhro zzd2 = zzhro.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhpk zzb2 = zzhpm.zzb();
            zzb2.zza(zzd2.zzb().zzb());
            zzb2.zzb(zzd2.zzc().zza());
            zzb2.zzc(zzg(zzhosVar.zzd()));
            zzhpm zzd3 = zzb2.zzd();
            zzhpe zzc2 = zzhpf.zzc();
            zzc2.zza(zzd3);
            zzc2.zzb(zzicj.zza(zzd2.zzb().zzA(), zzhfrVar));
            zzc2.zzc(zzhosVar.zze());
            return zzc2.zzd();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhfm zzf(zzhpl zzhplVar) throws GeneralSecurityException {
        if (zzhplVar.equals(zzhpl.zza)) {
            return zzhfm.zzb;
        }
        if (zzhplVar.equals(zzhpl.zzb)) {
            return zzhfm.zze;
        }
        if (zzhplVar.equals(zzhpl.zzd)) {
            return zzhfm.zzd;
        }
        if (zzhplVar.equals(zzhpl.zzc)) {
            return zzhfm.zzc;
        }
        String valueOf = String.valueOf(zzhplVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhpl zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhpl.zza;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhpl.zzb;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhpl.zzc;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhpl.zzd;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhrs zzh(zzhpm zzhpmVar) {
        zzhrr zzb2 = zzhrs.zzb();
        zzb2.zza(zzhpmVar.zzd());
        return (zzhrs) zzb2.zzbu();
    }
}
