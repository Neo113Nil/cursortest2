package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgpd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgvdVarZzb;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgoz
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgpd.zzb((zzgnt) zzgdfVar);
            }
        }, zzgnt.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzgpa
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgpd.zzd((zzgmx) zzgnaVar);
            }
        }, zzgvdVarZzb, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgpb
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgpd.zza((zzgnl) zzgcsVar, zzgdjVar);
            }
        }, zzgnl.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgpc
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgpd.zzc((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzgmw zza(zzgnl zzgnlVar, zzgdj zzgdjVar) {
        zzgpo zzgpoVarZzb = zzgpq.zzb();
        zzgpoVarZzb.zzb(zzg(zzgnlVar.zzc()));
        byte[] bArrZzd = zzgnlVar.zze().zzd(zzgdjVar);
        zzgpoVarZzb.zza(zzgvy.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgpq) zzgpoVarZzb.zzbr()).zzaN(), zzgry.SYMMETRIC, zzh(zzgnlVar.zzc().zzf()), zzgnlVar.zzf());
    }

    public static /* synthetic */ zzgmx zzb(zzgnt zzgntVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgpr zzgprVarZzb = zzgpt.zzb();
        zzgprVarZzb.zzb(zzg(zzgntVar));
        zzgprVarZzb.zza(zzgntVar.zzc());
        zzgscVarZza.zzc(((zzgpt) zzgprVarZzb.zzbr()).zzaN());
        zzgscVarZza.zza(zzh(zzgntVar.zzf()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static /* synthetic */ zzgnl zzc(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgpq zzgpqVarZzd = zzgpq.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgpqVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgnq zzgnqVarZze = zzgnt.zze();
            zzgnqVarZze.zza(zzgpqVarZzd.zzg().zzd());
            zzgnqVarZze.zzb(zzgpqVarZzd.zzf().zza());
            zzgnqVarZze.zzc(zzf(zzgmwVar.zzc()));
            zzgnt zzgntVarZzd = zzgnqVarZze.zzd();
            zzgnj zzgnjVarZzb = zzgnl.zzb();
            zzgnjVarZzb.zzc(zzgntVarZzd);
            zzgnjVarZzb.zza(zzgve.zzb(zzgpqVarZzd.zzg().zzA(), zzgdjVar));
            zzgnjVarZzb.zzb(zzgmwVar.zzf());
            return zzgnjVarZzb.zzd();
        } catch (zzgxv | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgnt zzd(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgpt zzgptVarZzd = zzgpt.zzd(zzgmxVar.zzc().zzh(), zzgwq.zza());
            zzgnq zzgnqVarZze = zzgnt.zze();
            zzgnqVarZze.zza(zzgptVarZzd.zza());
            zzgnqVarZze.zzb(zzgptVarZzd.zzf().zza());
            zzgnqVarZze.zzc(zzf(zzgmxVar.zzc().zzg()));
            return zzgnqVarZze.zzd();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e7);
        }
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgnr zzf(zzgte zzgteVar) throws GeneralSecurityException {
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            return zzgnr.zza;
        }
        if (iOrdinal == 2) {
            return zzgnr.zzc;
        }
        if (iOrdinal == 3) {
            return zzgnr.zzd;
        }
        if (iOrdinal == 4) {
            return zzgnr.zzb;
        }
        throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgpw zzg(zzgnt zzgntVar) {
        zzgpu zzgpuVarZzb = zzgpw.zzb();
        zzgpuVarZzb.zza(zzgntVar.zzb());
        return (zzgpw) zzgpuVarZzb.zzbr();
    }

    private static zzgte zzh(zzgnr zzgnrVar) throws GeneralSecurityException {
        if (zzgnr.zza.equals(zzgnrVar)) {
            return zzgte.TINK;
        }
        if (zzgnr.zzb.equals(zzgnrVar)) {
            return zzgte.CRUNCHY;
        }
        if (zzgnr.zzd.equals(zzgnrVar)) {
            return zzgte.RAW;
        }
        if (zzgnr.zzc.equals(zzgnrVar)) {
            return zzgte.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgnrVar)));
    }
}
