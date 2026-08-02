package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgpd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzb2 = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
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
        }, zzb2, zzgmx.class);
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
        }, zzb2, zzgmw.class);
    }

    public static /* synthetic */ zzgmw zza(zzgnl zzgnlVar, zzgdj zzgdjVar) {
        zzgpo zzb2 = zzgpq.zzb();
        zzb2.zzb(zzg(zzgnlVar.zzc()));
        byte[] zzd2 = zzgnlVar.zze().zzd(zzgdjVar);
        zzb2.zza(zzgvy.zzv(zzd2, 0, zzd2.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgpq) zzb2.zzbr()).zzaN(), zzgry.SYMMETRIC, zzh(zzgnlVar.zzc().zzf()), zzgnlVar.zzf());
    }

    public static /* synthetic */ zzgmx zzb(zzgnt zzgntVar) {
        zzgsc zza2 = zzgse.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgpr zzb2 = zzgpt.zzb();
        zzb2.zzb(zzg(zzgntVar));
        zzb2.zza(zzgntVar.zzc());
        zza2.zzc(((zzgpt) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzgntVar.zzf()));
        return zzgmx.zzb((zzgse) zza2.zzbr());
    }

    public static /* synthetic */ zzgnl zzc(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgpq zzd2 = zzgpq.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgnq zze2 = zzgnt.zze();
            zze2.zza(zzd2.zzg().zzd());
            zze2.zzb(zzd2.zzf().zza());
            zze2.zzc(zzf(zzgmwVar.zzc()));
            zzgnt zzd3 = zze2.zzd();
            zzgnj zzb2 = zzgnl.zzb();
            zzb2.zzc(zzd3);
            zzb2.zza(zzgve.zzb(zzd2.zzg().zzA(), zzgdjVar));
            zzb2.zzb(zzgmwVar.zzf());
            return zzb2.zzd();
        } catch (zzgxv | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgnt zzd(zzgmx zzgmxVar) {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgpt zzd2 = zzgpt.zzd(zzgmxVar.zzc().zzh(), zzgwq.zza());
            zzgnq zze2 = zzgnt.zze();
            zze2.zza(zzd2.zza());
            zze2.zzb(zzd2.zzf().zza());
            zze2.zzc(zzf(zzgmxVar.zzc().zzg()));
            return zze2.zzd();
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

    private static zzgnr zzf(zzgte zzgteVar) {
        int ordinal = zzgteVar.ordinal();
        if (ordinal == 1) {
            return zzgnr.zza;
        }
        if (ordinal == 2) {
            return zzgnr.zzc;
        }
        if (ordinal == 3) {
            return zzgnr.zzd;
        }
        if (ordinal == 4) {
            return zzgnr.zzb;
        }
        throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgpw zzg(zzgnt zzgntVar) {
        zzgpu zzb2 = zzgpw.zzb();
        zzb2.zza(zzgntVar.zzb());
        return (zzgpw) zzb2.zzbr();
    }

    private static zzgte zzh(zzgnr zzgnrVar) {
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
