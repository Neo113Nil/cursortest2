package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgha {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzgvdVarZzb;
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
        }, zzgvdVarZzb, zzgmx.class);
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
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzggq zza(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgta zzgtaVarZzd = zzgta.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgtaVarZzd.zza() == 0) {
                return zzggq.zzc(zzf(zzgtaVarZzd.zzf(), zzgmwVar.zzc()), zzgmwVar.zzf());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zzgtaVarZzd)));
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e7);
        }
    }

    public static /* synthetic */ zzggv zzb(zzgmx zzgmxVar) throws GeneralSecurityException {
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
        zzgsy zzgsyVarZzb = zzgta.zzb();
        zzgsyVarZzb.zza(zzg(zzggqVar.zzd()));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgta) zzgsyVarZzb.zzbr()).zzaN(), zzgry.REMOTE, zzh(zzggqVar.zzd().zzc()), zzggqVar.zze());
    }

    public static /* synthetic */ zzgmx zzd(zzggv zzggvVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzgscVarZza.zzc(zzg(zzggvVar).zzaN());
        zzgscVarZza.zza(zzh(zzggvVar.zzc()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzggv zzf(zzgtd zzgtdVar, zzgte zzgteVar) throws GeneralSecurityException {
        zzggs zzggsVar;
        zzggt zzggtVar;
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb(zzgtdVar.zza().zzi());
        zzgscVarZza.zzc(zzgtdVar.zza().zzh());
        zzgscVarZza.zza(zzgte.RAW);
        zzgdf zzgdfVarZza = zzgdl.zza(((zzgse) zzgscVarZza.zzbr()).zzaV());
        if (zzgdfVarZza instanceof zzgfj) {
            zzggsVar = zzggs.zza;
        } else if (zzgdfVarZza instanceof zzgga) {
            zzggsVar = zzggs.zzc;
        } else if (zzgdfVarZza instanceof zzghx) {
            zzggsVar = zzggs.zzb;
        } else if (zzgdfVarZza instanceof zzgeo) {
            zzggsVar = zzggs.zzd;
        } else if (zzgdfVarZza instanceof zzgey) {
            zzggsVar = zzggs.zze;
        } else {
            if (!(zzgdfVarZza instanceof zzgfu)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzgdfVarZza.toString()));
            }
            zzggsVar = zzggs.zzf;
        }
        zzggr zzggrVar = new zzggr(null);
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            zzggtVar = zzggt.zza;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            zzggtVar = zzggt.zzb;
        }
        zzggrVar.zzd(zzggtVar);
        zzggrVar.zzc(zzgtdVar.zzg());
        zzggrVar.zza((zzgdx) zzgdfVarZza);
        zzggrVar.zzb(zzggsVar);
        return zzggrVar.zze();
    }

    private static zzgtd zzg(zzggv zzggvVar) throws GeneralSecurityException {
        try {
            zzgse zzgseVarZzf = zzgse.zzf(zzgdl.zzb(zzggvVar.zzb()), zzgwq.zza());
            zzgtb zzgtbVarZzb = zzgtd.zzb();
            zzgtbVarZzb.zzb(zzggvVar.zzd());
            zzgtbVarZzb.zza(zzgseVarZzf);
            return (zzgtd) zzgtbVarZzb.zzbr();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e7);
        }
    }

    private static zzgte zzh(zzggt zzggtVar) throws GeneralSecurityException {
        if (zzggt.zza.equals(zzggtVar)) {
            return zzgte.TINK;
        }
        if (zzggt.zzb.equals(zzggtVar)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggtVar)));
    }
}
