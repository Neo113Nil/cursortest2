package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhks {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzhod.zzd(zzhkr.zza, zzhhs.class, zzhot.class);
        zzd = zzhoa.zzd(zzhko.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhkp.zza, zzhhn.class, zzhos.class);
        zzf = zzhmx.zzd(zzhkq.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhhs zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            String zza2 = zzhotVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhsu.zza(zzhotVar.zzc().zzb(), zziew.zzb());
            return zzhhs.zzb(zzg(zzhotVar.zzd()));
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhhn zzhhnVar, zzhfr zzhfrVar) {
        zzhsr zzd2 = zzhss.zzd();
        byte[] zzc2 = zzhhnVar.zze().zzc(zzhfrVar);
        zzd2.zza(zziei.zzt(zzc2, 0, zzc2.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhss) zzd2.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhhnVar.zzf().zzc()), zzhhnVar.zzb());
    }

    static /* synthetic */ zzhhn zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhss zzc2 = zzhss.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzc2.zza() == 0) {
                return zzhhn.zzd(zzg(zzhosVar.zzd()), zzicj.zza(zzc2.zzb().zzA(), zzhfrVar), zzhosVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzhfm zzf(zzhhr zzhhrVar) throws GeneralSecurityException {
        if (zzhhrVar.equals(zzhhr.zza)) {
            return zzhfm.zzb;
        }
        if (zzhhrVar.equals(zzhhr.zzb)) {
            return zzhfm.zze;
        }
        if (zzhhrVar.equals(zzhhr.zzc)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhhrVar.toString()));
    }

    private static zzhhr zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhhr.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhhr.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhhr.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
