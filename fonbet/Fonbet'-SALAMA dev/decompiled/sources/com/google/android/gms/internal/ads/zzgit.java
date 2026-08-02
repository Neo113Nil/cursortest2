package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgit {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzb2 = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzb2;
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
        }, zzb2, zzgmx.class);
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
        }, zzb2, zzgmw.class);
    }

    public static /* synthetic */ zzgfm zza(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgrd zzd2 = zzgrd.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgfr zzc2 = zzgfu.zzc();
            zzc2.zza(zzd2.zzf().zzd());
            zzc2.zzb(zzf(zzgmwVar.zzc()));
            zzgfu zzc3 = zzc2.zzc();
            zzgfk zzc4 = zzgfm.zzc();
            zzc4.zzc(zzc3);
            zzc4.zzb(zzgve.zzb(zzd2.zzf().zzA(), zzgdjVar));
            zzc4.zza(zzgmwVar.zzf());
            return zzc4.zzd();
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzgfu zzb(zzgmx zzgmxVar) {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgrg zzf2 = zzgrg.zzf(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzf2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgfr zzc2 = zzgfu.zzc();
            zzc2.zza(zzf2.zza());
            zzc2.zzb(zzf(zzgmxVar.zzc().zzg()));
            return zzc2.zzc();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzgfm zzgfmVar, zzgdj zzgdjVar) {
        zzgrb zzb2 = zzgrd.zzb();
        byte[] zzd2 = zzgfmVar.zze().zzd(zzgdjVar);
        zzb2.zza(zzgvy.zzv(zzd2, 0, zzd2.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgrd) zzb2.zzbr()).zzaN(), zzgry.SYMMETRIC, zzg(zzgfmVar.zzd().zzd()), zzgfmVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzgfu zzgfuVar) {
        zzgsc zza2 = zzgse.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgre zzc2 = zzgrg.zzc();
        zzc2.zza(zzgfuVar.zzb());
        zza2.zzc(((zzgrg) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzgfuVar.zzd()));
        return zzgmx.zzb((zzgse) zza2.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgfs zzf(zzgte zzgteVar) {
        int ordinal = zzgteVar.ordinal();
        if (ordinal == 1) {
            return zzgfs.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgfs.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgfs.zzb;
    }

    private static zzgte zzg(zzgfs zzgfsVar) {
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
