package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzggp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzgvdVarZzb;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzggl
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzggp.zzd((zzggk) zzgdfVar);
            }
        }, zzggk.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzggm
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzggp.zzb((zzgmx) zzgnaVar);
            }
        }, zzgvdVarZzb, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzggn
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzggp.zzc((zzggi) zzgcsVar, zzgdjVar);
            }
        }, zzggi.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzggo
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzggp.zza((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzggi zza(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzgsu zzgsuVarZzd = zzgsu.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgsuVarZzd.zza() == 0) {
                return zzggi.zzc(zzggk.zzc(zzgsuVarZzd.zzf().zzf(), zzf(zzgmwVar.zzc())), zzgmwVar.zzf());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zzgsuVarZzd)));
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e7);
        }
    }

    public static /* synthetic */ zzggk zzb(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            return zzggk.zzc(zzgsx.zzd(zzgmxVar.zzc().zzh(), zzgwq.zza()).zzf(), zzf(zzgmxVar.zzc().zzg()));
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzggi zzggiVar, zzgdj zzgdjVar) {
        zzgss zzgssVarZzb = zzgsu.zzb();
        zzgsv zzgsvVarZza = zzgsx.zza();
        zzgsvVarZza.zza(zzggiVar.zzd().zzd());
        zzgssVarZzb.zza((zzgsx) zzgsvVarZza.zzbr());
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgsu) zzgssVarZzb.zzbr()).zzaN(), zzgry.REMOTE, zzg(zzggiVar.zzd().zzb()), zzggiVar.zze());
    }

    public static /* synthetic */ zzgmx zzd(zzggk zzggkVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzgsv zzgsvVarZza = zzgsx.zza();
        zzgsvVarZza.zza(zzggkVar.zzd());
        zzgscVarZza.zzc(((zzgsx) zzgsvVarZza.zzbr()).zzaN());
        zzgscVarZza.zza(zzg(zzggkVar.zzb()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzggj zzf(zzgte zzgteVar) throws GeneralSecurityException {
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            return zzggj.zza;
        }
        if (iOrdinal == 3) {
            return zzggj.zzb;
        }
        throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgte zzg(zzggj zzggjVar) throws GeneralSecurityException {
        if (zzggj.zza.equals(zzggjVar)) {
            return zzgte.TINK;
        }
        if (zzggj.zzb.equals(zzggjVar)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzggjVar.toString()));
    }
}
