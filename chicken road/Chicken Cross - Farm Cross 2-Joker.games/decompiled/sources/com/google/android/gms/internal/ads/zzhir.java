package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhir {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zza2;
        zzc = zzhod.zzd(zzhiq.zza, zzhim.class, zzhot.class);
        zzd = zzhoa.zzd(zzhin.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhio.zza, zzhii.class, zzhos.class);
        zzf = zzhmx.zzd(zzhip.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhim zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            String zza2 = zzhotVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            return zzh(zzhuo.zzc(zzhotVar.zzc().zzb(), zziew.zzb()), zzhotVar.zzd());
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhii zzhiiVar, zzhfr zzhfrVar) {
        zzhul zzd2 = zzhum.zzd();
        zzd2.zza(zzg(zzhiiVar.zze()));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhum) zzd2.zzbu()).zzaM(), zzhfl.zze, zzf(zzhiiVar.zze().zzc()), zzhiiVar.zzb());
    }

    static /* synthetic */ zzhii zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhum zzc2 = zzhum.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzc2.zza() != 0) {
                String valueOf = String.valueOf(zzc2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
                sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhuo zzb2 = zzc2.zzb();
            zzhfm zzd2 = zzhosVar.zzd();
            zzhfm zzhfmVar = zzhfm.zzb;
            if (zzd2 != zzhfmVar && zzd2 != (zzhfmVar = zzhfm.zzd)) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzd2.toString()));
            }
            return zzhii.zzd(zzh(zzb2, zzhfmVar), zzhosVar.zze());
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    private static zzhfm zzf(zzhil zzhilVar) throws GeneralSecurityException {
        if (zzhil.zza.equals(zzhilVar)) {
            return zzhfm.zzb;
        }
        if (zzhil.zzb.equals(zzhilVar)) {
            return zzhfm.zzd;
        }
        String valueOf = String.valueOf(zzhilVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhuo zzg(zzhim zzhimVar) throws GeneralSecurityException {
        try {
            zzhtw zzc2 = zzhtw.zzc(zzhft.zza(zzhimVar.zzd()), zziew.zzb());
            zzhun zzd2 = zzhuo.zzd();
            zzd2.zza(zzhimVar.zzb());
            zzd2.zzb(zzc2);
            return (zzhuo) zzd2.zzbu();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzhim zzh(zzhuo zzhuoVar, zzhfm zzhfmVar) throws GeneralSecurityException {
        zzhik zzhikVar;
        zzhil zzhilVar;
        zzhtv zzd2 = zzhtw.zzd();
        zzd2.zza(zzhuoVar.zzb().zza());
        zzd2.zzb(zzhuoVar.zzb().zzb());
        zzd2.zzc(5);
        zzhfj zzb2 = zzhft.zzb(((zzhtw) zzd2.zzbu()).zzaN());
        if (zzb2 instanceof zzhhd) {
            zzhikVar = zzhik.zza;
        } else if (zzb2 instanceof zzhhs) {
            zzhikVar = zzhik.zzc;
        } else if (zzb2 instanceof zzhjo) {
            zzhikVar = zzhik.zzb;
        } else if (zzb2 instanceof zzhgm) {
            zzhikVar = zzhik.zzd;
        } else if (zzb2 instanceof zzhgu) {
            zzhikVar = zzhik.zze;
        } else {
            if (!(zzb2 instanceof zzhhm)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzb2.toString()));
            }
            zzhikVar = zzhik.zzf;
        }
        zzhij zzhijVar = new zzhij(null);
        if (zzhfmVar.equals(zzhfm.zzb)) {
            zzhilVar = zzhil.zza;
        } else {
            if (!zzhfmVar.equals(zzhfm.zzd)) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
            }
            zzhilVar = zzhil.zzb;
        }
        zzhijVar.zza(zzhilVar);
        zzhijVar.zzb(zzhuoVar.zza());
        zzhijVar.zzd((zzhga) zzb2);
        zzhijVar.zzc(zzhikVar);
        return zzhijVar.zze();
    }
}
