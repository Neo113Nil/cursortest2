package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhjy {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = zzhod.zzd(zzhjx.zza, zzhgu.class, zzhot.class);
        zzd = zzhoa.zzd(zzhju.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhjv.zza, zzhgo.class, zzhos.class);
        zzf = zzhmx.zzd(zzhjw.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhot zzb(zzhgu zzhguVar) {
        zzhfm zzf2 = zzf(zzhguVar.zze());
        zzhsf zzd2 = zzhsg.zzd();
        zzd2.zza(zzh(zzhguVar));
        zzd2.zzb(zzhguVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzf2, ((zzhsg) zzd2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhgu zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            String zza2 = zzhotVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhsg zzc2 = zzhsg.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            zzhgs zzb2 = zzhgu.zzb();
            zzb2.zza(zzc2.zzb());
            zzb2.zzb(zzc2.zza().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhotVar.zzd()));
            return zzb2.zze();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhgo zzhgoVar, zzhfr zzhfrVar) {
        zzhsd zze2 = zzhse.zze();
        zze2.zza(zzh(zzhgoVar.zzf()));
        byte[] zzc2 = zzhgoVar.zze().zzc(zzhfrVar);
        zze2.zzb(zziei.zzt(zzc2, 0, zzc2.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhse) zze2.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhgoVar.zzf().zze()), zzhgoVar.zzb());
    }

    static /* synthetic */ zzhgo zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzhse zzd2 = zzhse.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhgs zzb2 = zzhgu.zzb();
            zzb2.zza(zzd2.zzc().zzb());
            zzb2.zzb(zzd2.zzb().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhosVar.zzd()));
            zzhgu zze2 = zzb2.zze();
            zzhgn zzd3 = zzhgo.zzd();
            zzd3.zza(zze2);
            zzd3.zzb(zzicj.zza(zzd2.zzc().zzA(), zzhfrVar));
            zzd3.zzc(zzhosVar.zze());
            return zzd3.zzd();
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing AesEaxKey failed");
        }
    }

    private static zzhfm zzf(zzhgt zzhgtVar) throws GeneralSecurityException {
        if (zzhgtVar.equals(zzhgt.zza)) {
            return zzhfm.zzb;
        }
        if (zzhgtVar.equals(zzhgt.zzb)) {
            return zzhfm.zze;
        }
        if (zzhgtVar.equals(zzhgt.zzc)) {
            return zzhfm.zzd;
        }
        String valueOf = String.valueOf(zzhgtVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhgt zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhgt.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhgt.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhgt.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhsi zzh(zzhgu zzhguVar) throws GeneralSecurityException {
        zzhsh zzb2 = zzhsi.zzb();
        zzb2.zza(zzhguVar.zzd());
        return (zzhsi) zzb2.zzbu();
    }
}
