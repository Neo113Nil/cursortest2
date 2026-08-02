package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgha {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzb2 = zzgni.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzb2;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzggw
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgha.zzd((zzggv) zzgdfVar);
            }
        }, zzggv.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzggx
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgha.zzb((zzgmx) zzgnaVar);
            }
        }, zzb2, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzggy
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgha.zzc((zzggq) zzgcsVar, zzgdjVar);
            }
        }, zzggq.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzggz
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgha.zza((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzb2, zzgmw.class);
    }

    public static /* synthetic */ zzggq zza(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgta zzd2 = zzgta.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzd2.zza() == 0) {
                return zzggq.zzc(zzf(zzd2.zzf(), zzgmwVar.zzc()), zzgmwVar.zzf());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zzd2)));
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e7);
        }
    }

    public static /* synthetic */ zzggv zzb(zzgmx zzgmxVar) {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            return zzf(zzgtd.zzf(zzgmxVar.zzc().zzh(), zzgwq.zza()), zzgmxVar.zzc().zzg());
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzggq zzggqVar, zzgdj zzgdjVar) {
        zzgsy zzb2 = zzgta.zzb();
        zzb2.zza(zzg(zzggqVar.zzd()));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgta) zzb2.zzbr()).zzaN(), zzgry.REMOTE, zzh(zzggqVar.zzd().zzc()), zzggqVar.zze());
    }

    public static /* synthetic */ zzgmx zzd(zzggv zzggvVar) {
        zzgsc zza2 = zzgse.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza2.zzc(zzg(zzggvVar).zzaN());
        zza2.zza(zzh(zzggvVar.zzc()));
        return zzgmx.zzb((zzgse) zza2.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzggv zzf(zzgtd zzgtdVar, zzgte zzgteVar) {
        zzggs zzggsVar;
        zzggt zzggtVar;
        zzgsc zza2 = zzgse.zza();
        zza2.zzb(zzgtdVar.zza().zzi());
        zza2.zzc(zzgtdVar.zza().zzh());
        zza2.zza(zzgte.RAW);
        zzgdf zza3 = zzgdl.zza(((zzgse) zza2.zzbr()).zzaV());
        if (zza3 instanceof zzgfj) {
            zzggsVar = zzggs.zza;
        } else if (zza3 instanceof zzgga) {
            zzggsVar = zzggs.zzc;
        } else if (zza3 instanceof zzghx) {
            zzggsVar = zzggs.zzb;
        } else if (zza3 instanceof zzgeo) {
            zzggsVar = zzggs.zzd;
        } else if (zza3 instanceof zzgey) {
            zzggsVar = zzggs.zze;
        } else {
            if (!(zza3 instanceof zzgfu)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
            }
            zzggsVar = zzggs.zzf;
        }
        zzggr zzggrVar = new zzggr(null);
        int ordinal = zzgteVar.ordinal();
        if (ordinal == 1) {
            zzggtVar = zzggt.zza;
        } else {
            if (ordinal != 3) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            zzggtVar = zzggt.zzb;
        }
        zzggrVar.zzd(zzggtVar);
        zzggrVar.zzc(zzgtdVar.zzg());
        zzggrVar.zza((zzgdx) zza3);
        zzggrVar.zzb(zzggsVar);
        return zzggrVar.zze();
    }

    private static zzgtd zzg(zzggv zzggvVar) {
        try {
            zzgse zzf2 = zzgse.zzf(zzgdl.zzb(zzggvVar.zzb()), zzgwq.zza());
            zzgtb zzb2 = zzgtd.zzb();
            zzb2.zzb(zzggvVar.zzd());
            zzb2.zza(zzf2);
            return (zzgtd) zzb2.zzbr();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e7);
        }
    }

    private static zzgte zzh(zzggt zzggtVar) {
        if (zzggt.zza.equals(zzggtVar)) {
            return zzgte.TINK;
        }
        if (zzggt.zzb.equals(zzggtVar)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggtVar)));
    }
}
