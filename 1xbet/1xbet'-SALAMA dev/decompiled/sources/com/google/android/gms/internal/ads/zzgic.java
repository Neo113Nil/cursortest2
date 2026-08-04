package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgic {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzgvdVarZzb;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzghy
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgic.zzd((zzgeo) zzgdfVar);
            }
        }, zzgeo.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzghz
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgic.zzb((zzgmx) zzgnaVar);
            }
        }, zzgvdVarZzb, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgia
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgic.zzc((zzgef) zzgcsVar, zzgdjVar);
            }
        }, zzgef.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgib
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgic.zza((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzgef zza(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgpz zzgpzVarZzd = zzgpz.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgpzVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgpzVarZzd.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzgpzVarZzd.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgek zzgekVarZzf = zzgeo.zzf();
            zzgekVarZzf.zza(zzgpzVarZzd.zzf().zzg().zzd());
            zzgekVarZzf.zzc(zzgpzVarZzd.zzg().zzh().zzd());
            zzgekVarZzf.zzd(zzgpzVarZzd.zzf().zzf().zza());
            zzgekVarZzf.zze(zzgpzVarZzd.zzg().zzg().zza());
            zzgekVarZzf.zzb(zzf(zzgpzVarZzd.zzg().zzg().zzb()));
            zzgekVarZzf.zzf(zzg(zzgmwVar.zzc()));
            zzgeo zzgeoVarZzg = zzgekVarZzf.zzg();
            zzged zzgedVarZzc = zzgef.zzc();
            zzgedVarZzc.zzd(zzgeoVarZzg);
            zzgedVarZzc.zza(zzgve.zzb(zzgpzVarZzd.zzf().zzg().zzA(), zzgdjVar));
            zzgedVarZzc.zzb(zzgve.zzb(zzgpzVarZzd.zzg().zzh().zzA(), zzgdjVar));
            zzgedVarZzc.zzc(zzgmwVar.zzf());
            return zzgedVarZzc.zze();
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzgeo zzb(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgqc zzgqcVarZzc = zzgqc.zzc(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzgqcVarZzc.zzf().zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgek zzgekVarZzf = zzgeo.zzf();
            zzgekVarZzf.zza(zzgqcVarZzc.zzd().zza());
            zzgekVarZzf.zzc(zzgqcVarZzc.zzf().zza());
            zzgekVarZzf.zzd(zzgqcVarZzc.zzd().zzf().zza());
            zzgekVarZzf.zze(zzgqcVarZzc.zzf().zzh().zza());
            zzgekVarZzf.zzb(zzf(zzgqcVarZzc.zzf().zzh().zzb()));
            zzgekVarZzf.zzf(zzg(zzgmxVar.zzc().zzg()));
            return zzgekVarZzf.zzg();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzgef zzgefVar, zzgdj zzgdjVar) {
        zzgpx zzgpxVarZzb = zzgpz.zzb();
        zzgqd zzgqdVarZzb = zzgqf.zzb();
        zzgqj zzgqjVarZzb = zzgql.zzb();
        zzgqjVarZzb.zza(zzgefVar.zzd().zzd());
        zzgqdVarZzb.zzb((zzgql) zzgqjVarZzb.zzbr());
        byte[] bArrZzd = zzgefVar.zze().zzd(zzgdjVar);
        zzgqdVarZzb.zza(zzgvy.zzv(bArrZzd, 0, bArrZzd.length));
        zzgpxVarZzb.zza((zzgqf) zzgqdVarZzb.zzbr());
        zzgro zzgroVarZzb = zzgrq.zzb();
        zzgroVarZzb.zzb(zzh(zzgefVar.zzd()));
        byte[] bArrZzd2 = zzgefVar.zzf().zzd(zzgdjVar);
        zzgroVarZzb.zza(zzgvy.zzv(bArrZzd2, 0, bArrZzd2.length));
        zzgpxVarZzb.zzb((zzgrq) zzgroVarZzb.zzbr());
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgpz) zzgpxVarZzb.zzbr()).zzaN(), zzgry.SYMMETRIC, zzi(zzgefVar.zzd().zzh()), zzgefVar.zzg());
    }

    public static /* synthetic */ zzgmx zzd(zzgeo zzgeoVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgqa zzgqaVarZza = zzgqc.zza();
        zzgqg zzgqgVarZzb = zzgqi.zzb();
        zzgqj zzgqjVarZzb = zzgql.zzb();
        zzgqjVarZzb.zza(zzgeoVar.zzd());
        zzgqgVarZzb.zzb((zzgql) zzgqjVarZzb.zzbr());
        zzgqgVarZzb.zza(zzgeoVar.zzb());
        zzgqaVarZza.zza((zzgqi) zzgqgVarZzb.zzbr());
        zzgrr zzgrrVarZzc = zzgrt.zzc();
        zzgrrVarZzc.zzb(zzh(zzgeoVar));
        zzgrrVarZzc.zza(zzgeoVar.zzc());
        zzgqaVarZza.zzb((zzgrt) zzgrrVarZzc.zzbr());
        zzgscVarZza.zzc(((zzgqc) zzgqaVarZza.zzbr()).zzaN());
        zzgscVarZza.zza(zzi(zzgeoVar.zzh()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgel zzf(zzgrn zzgrnVar) throws GeneralSecurityException {
        int iOrdinal = zzgrnVar.ordinal();
        if (iOrdinal == 1) {
            return zzgel.zza;
        }
        if (iOrdinal == 2) {
            return zzgel.zzd;
        }
        if (iOrdinal == 3) {
            return zzgel.zzc;
        }
        if (iOrdinal == 4) {
            return zzgel.zze;
        }
        if (iOrdinal == 5) {
            return zzgel.zzb;
        }
        throw new GeneralSecurityException(k.d(zzgrnVar.zza(), "Unable to parse HashType: "));
    }

    private static zzgem zzg(zzgte zzgteVar) throws GeneralSecurityException {
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            return zzgem.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgem.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgem.zzb;
    }

    private static zzgrw zzh(zzgeo zzgeoVar) throws GeneralSecurityException {
        zzgrn zzgrnVar;
        zzgru zzgruVarZzc = zzgrw.zzc();
        zzgruVarZzc.zzb(zzgeoVar.zze());
        zzgel zzgelVarZzg = zzgeoVar.zzg();
        if (zzgel.zza.equals(zzgelVarZzg)) {
            zzgrnVar = zzgrn.SHA1;
        } else if (zzgel.zzb.equals(zzgelVarZzg)) {
            zzgrnVar = zzgrn.SHA224;
        } else if (zzgel.zzc.equals(zzgelVarZzg)) {
            zzgrnVar = zzgrn.SHA256;
        } else if (zzgel.zzd.equals(zzgelVarZzg)) {
            zzgrnVar = zzgrn.SHA384;
        } else {
            if (!zzgel.zze.equals(zzgelVarZzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzgelVarZzg)));
            }
            zzgrnVar = zzgrn.SHA512;
        }
        zzgruVarZzc.zza(zzgrnVar);
        return (zzgrw) zzgruVarZzc.zzbr();
    }

    private static zzgte zzi(zzgem zzgemVar) throws GeneralSecurityException {
        if (zzgem.zza.equals(zzgemVar)) {
            return zzgte.TINK;
        }
        if (zzgem.zzb.equals(zzgemVar)) {
            return zzgte.CRUNCHY;
        }
        if (zzgem.zzc.equals(zzgemVar)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgemVar)));
    }
}
