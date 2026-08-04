package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgit {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgvdVarZzb;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgip
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgit.zzd((zzgfu) zzgdfVar);
            }
        }, zzgfu.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzgiq
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgit.zzb((zzgmx) zzgnaVar);
            }
        }, zzgvdVarZzb, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgir
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgit.zzc((zzgfm) zzgcsVar, zzgdjVar);
            }
        }, zzgfm.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgis
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgit.zza((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzgfm zza(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgrd zzgrdVarZzd = zzgrd.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgrdVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgfr zzgfrVarZzc = zzgfu.zzc();
            zzgfrVarZzc.zza(zzgrdVarZzd.zzf().zzd());
            zzgfrVarZzc.zzb(zzf(zzgmwVar.zzc()));
            zzgfu zzgfuVarZzc = zzgfrVarZzc.zzc();
            zzgfk zzgfkVarZzc = zzgfm.zzc();
            zzgfkVarZzc.zzc(zzgfuVarZzc);
            zzgfkVarZzc.zzb(zzgve.zzb(zzgrdVarZzd.zzf().zzA(), zzgdjVar));
            zzgfkVarZzc.zza(zzgmwVar.zzf());
            return zzgfkVarZzc.zzd();
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzgfu zzb(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgrg zzgrgVarZzf = zzgrg.zzf(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzgrgVarZzf.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgfr zzgfrVarZzc = zzgfu.zzc();
            zzgfrVarZzc.zza(zzgrgVarZzf.zza());
            zzgfrVarZzc.zzb(zzf(zzgmxVar.zzc().zzg()));
            return zzgfrVarZzc.zzc();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzgfm zzgfmVar, zzgdj zzgdjVar) {
        zzgrb zzgrbVarZzb = zzgrd.zzb();
        byte[] bArrZzd = zzgfmVar.zze().zzd(zzgdjVar);
        zzgrbVarZzb.zza(zzgvy.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgrd) zzgrbVarZzb.zzbr()).zzaN(), zzgry.SYMMETRIC, zzg(zzgfmVar.zzd().zzd()), zzgfmVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzgfu zzgfuVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgre zzgreVarZzc = zzgrg.zzc();
        zzgreVarZzc.zza(zzgfuVar.zzb());
        zzgscVarZza.zzc(((zzgrg) zzgreVarZzc.zzbr()).zzaN());
        zzgscVarZza.zza(zzg(zzgfuVar.zzd()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgfs zzf(zzgte zzgteVar) throws GeneralSecurityException {
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            return zzgfs.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgfs.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgfs.zzb;
    }

    private static zzgte zzg(zzgfs zzgfsVar) throws GeneralSecurityException {
        if (zzgfs.zza.equals(zzgfsVar)) {
            return zzgte.TINK;
        }
        if (zzgfs.zzb.equals(zzgfsVar)) {
            return zzgte.CRUNCHY;
        }
        if (zzgfs.zzc.equals(zzgfsVar)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgfsVar)));
    }
}
