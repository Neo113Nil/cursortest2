package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgic {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzb2 = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzb2;
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
        }, zzb2, zzgmx.class);
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
        }, zzb2, zzgmw.class);
    }

    public static /* synthetic */ zzgef zza(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgpz zzd2 = zzgpz.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzd2.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgek zzf2 = zzgeo.zzf();
            zzf2.zza(zzd2.zzf().zzg().zzd());
            zzf2.zzc(zzd2.zzg().zzh().zzd());
            zzf2.zzd(zzd2.zzf().zzf().zza());
            zzf2.zze(zzd2.zzg().zzg().zza());
            zzf2.zzb(zzf(zzd2.zzg().zzg().zzb()));
            zzf2.zzf(zzg(zzgmwVar.zzc()));
            zzgeo zzg = zzf2.zzg();
            zzged zzc2 = zzgef.zzc();
            zzc2.zzd(zzg);
            zzc2.zza(zzgve.zzb(zzd2.zzf().zzg().zzA(), zzgdjVar));
            zzc2.zzb(zzgve.zzb(zzd2.zzg().zzh().zzA(), zzgdjVar));
            zzc2.zzc(zzgmwVar.zzf());
            return zzc2.zze();
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzgeo zzb(zzgmx zzgmxVar) {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgqc zzc2 = zzgqc.zzc(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzc2.zzf().zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgek zzf2 = zzgeo.zzf();
            zzf2.zza(zzc2.zzd().zza());
            zzf2.zzc(zzc2.zzf().zza());
            zzf2.zzd(zzc2.zzd().zzf().zza());
            zzf2.zze(zzc2.zzf().zzh().zza());
            zzf2.zzb(zzf(zzc2.zzf().zzh().zzb()));
            zzf2.zzf(zzg(zzgmxVar.zzc().zzg()));
            return zzf2.zzg();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzgef zzgefVar, zzgdj zzgdjVar) {
        zzgpx zzb2 = zzgpz.zzb();
        zzgqd zzb3 = zzgqf.zzb();
        zzgqj zzb4 = zzgql.zzb();
        zzb4.zza(zzgefVar.zzd().zzd());
        zzb3.zzb((zzgql) zzb4.zzbr());
        byte[] zzd2 = zzgefVar.zze().zzd(zzgdjVar);
        zzb3.zza(zzgvy.zzv(zzd2, 0, zzd2.length));
        zzb2.zza((zzgqf) zzb3.zzbr());
        zzgro zzb5 = zzgrq.zzb();
        zzb5.zzb(zzh(zzgefVar.zzd()));
        byte[] zzd3 = zzgefVar.zzf().zzd(zzgdjVar);
        zzb5.zza(zzgvy.zzv(zzd3, 0, zzd3.length));
        zzb2.zzb((zzgrq) zzb5.zzbr());
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgpz) zzb2.zzbr()).zzaN(), zzgry.SYMMETRIC, zzi(zzgefVar.zzd().zzh()), zzgefVar.zzg());
    }

    public static /* synthetic */ zzgmx zzd(zzgeo zzgeoVar) {
        zzgsc zza2 = zzgse.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgqa zza3 = zzgqc.zza();
        zzgqg zzb2 = zzgqi.zzb();
        zzgqj zzb3 = zzgql.zzb();
        zzb3.zza(zzgeoVar.zzd());
        zzb2.zzb((zzgql) zzb3.zzbr());
        zzb2.zza(zzgeoVar.zzb());
        zza3.zza((zzgqi) zzb2.zzbr());
        zzgrr zzc2 = zzgrt.zzc();
        zzc2.zzb(zzh(zzgeoVar));
        zzc2.zza(zzgeoVar.zzc());
        zza3.zzb((zzgrt) zzc2.zzbr());
        zza2.zzc(((zzgqc) zza3.zzbr()).zzaN());
        zza2.zza(zzi(zzgeoVar.zzh()));
        return zzgmx.zzb((zzgse) zza2.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgel zzf(zzgrn zzgrnVar) {
        int ordinal = zzgrnVar.ordinal();
        if (ordinal == 1) {
            return zzgel.zza;
        }
        if (ordinal == 2) {
            return zzgel.zzd;
        }
        if (ordinal == 3) {
            return zzgel.zzc;
        }
        if (ordinal == 4) {
            return zzgel.zze;
        }
        if (ordinal == 5) {
            return zzgel.zzb;
        }
        throw new GeneralSecurityException(k.d(zzgrnVar.zza(), "Unable to parse HashType: "));
    }

    private static zzgem zzg(zzgte zzgteVar) {
        int ordinal = zzgteVar.ordinal();
        if (ordinal == 1) {
            return zzgem.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgem.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgem.zzb;
    }

    private static zzgrw zzh(zzgeo zzgeoVar) {
        zzgrn zzgrnVar;
        zzgru zzc2 = zzgrw.zzc();
        zzc2.zzb(zzgeoVar.zze());
        zzgel zzg = zzgeoVar.zzg();
        if (zzgel.zza.equals(zzg)) {
            zzgrnVar = zzgrn.SHA1;
        } else if (zzgel.zzb.equals(zzg)) {
            zzgrnVar = zzgrn.SHA224;
        } else if (zzgel.zzc.equals(zzg)) {
            zzgrnVar = zzgrn.SHA256;
        } else if (zzgel.zzd.equals(zzg)) {
            zzgrnVar = zzgrn.SHA384;
        } else {
            if (!zzgel.zze.equals(zzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzg)));
            }
            zzgrnVar = zzgrn.SHA512;
        }
        zzc2.zza(zzgrnVar);
        return (zzgrw) zzc2.zzbr();
    }

    private static zzgte zzi(zzgem zzgemVar) {
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
