package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgio {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgvdVarZzb;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgik
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgio.zzd((zzgfj) zzgdfVar);
            }
        }, zzgfj.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzgil
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgio.zzb((zzgmx) zzgnaVar);
            }
        }, zzgvdVarZzb, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgim
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgio.zzc((zzgfb) zzgcsVar, zzgdjVar);
            }
        }, zzgfb.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgin
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgio.zza((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzgfb zza(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgqx zzgqxVarZzd = zzgqx.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgqxVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgfg zzgfgVarZzc = zzgfj.zzc();
            zzgfgVarZzc.zzb(zzgqxVarZzd.zzf().zzd());
            zzgfgVarZzc.zza(12);
            zzgfgVarZzc.zzc(16);
            zzgfgVarZzc.zzd(zzf(zzgmwVar.zzc()));
            zzgfj zzgfjVarZze = zzgfgVarZzc.zze();
            zzgez zzgezVarZzc = zzgfb.zzc();
            zzgezVarZzc.zzc(zzgfjVarZze);
            zzgezVarZzc.zzb(zzgve.zzb(zzgqxVarZzd.zzf().zzA(), zzgdjVar));
            zzgezVarZzc.zza(zzgmwVar.zzf());
            return zzgezVarZzc.zzd();
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgfj zzb(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgra zzgraVarZzf = zzgra.zzf(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzgraVarZzf.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgfg zzgfgVarZzc = zzgfj.zzc();
            zzgfgVarZzc.zzb(zzgraVarZzf.zza());
            zzgfgVarZzc.zza(12);
            zzgfgVarZzc.zzc(16);
            zzgfgVarZzc.zzd(zzf(zzgmxVar.zzc().zzg()));
            return zzgfgVarZzc.zze();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzgfb zzgfbVar, zzgdj zzgdjVar) {
        zzgqv zzgqvVarZzb = zzgqx.zzb();
        byte[] bArrZzd = zzgfbVar.zze().zzd(zzgdjVar);
        zzgqvVarZzb.zza(zzgvy.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgqx) zzgqvVarZzb.zzbr()).zzaN(), zzgry.SYMMETRIC, zzg(zzgfbVar.zzd().zzd()), zzgfbVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzgfj zzgfjVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgqy zzgqyVarZzc = zzgra.zzc();
        zzgqyVarZzc.zza(zzgfjVar.zzb());
        zzgscVarZza.zzc(((zzgra) zzgqyVarZzc.zzbr()).zzaN());
        zzgscVarZza.zza(zzg(zzgfjVar.zzd()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgfh zzf(zzgte zzgteVar) throws GeneralSecurityException {
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            return zzgfh.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgfh.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgfh.zzb;
    }

    private static zzgte zzg(zzgfh zzgfhVar) throws GeneralSecurityException {
        if (zzgfh.zza.equals(zzgfhVar)) {
            return zzgte.TINK;
        }
        if (zzgfh.zzb.equals(zzgfhVar)) {
            return zzgte.CRUNCHY;
        }
        if (zzgfh.zzc.equals(zzgfhVar)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgfhVar)));
    }
}
