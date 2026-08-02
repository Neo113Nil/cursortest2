package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgio {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzb2 = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
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
        }, zzb2, zzgmx.class);
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
        }, zzb2, zzgmw.class);
    }

    public static /* synthetic */ zzgfb zza(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgqx zzd2 = zzgqx.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgfg zzc2 = zzgfj.zzc();
            zzc2.zzb(zzd2.zzf().zzd());
            zzc2.zza(12);
            zzc2.zzc(16);
            zzc2.zzd(zzf(zzgmwVar.zzc()));
            zzgfj zze2 = zzc2.zze();
            zzgez zzc3 = zzgfb.zzc();
            zzc3.zzc(zze2);
            zzc3.zzb(zzgve.zzb(zzd2.zzf().zzA(), zzgdjVar));
            zzc3.zza(zzgmwVar.zzf());
            return zzc3.zzd();
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgfj zzb(zzgmx zzgmxVar) {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgra zzf2 = zzgra.zzf(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzf2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgfg zzc2 = zzgfj.zzc();
            zzc2.zzb(zzf2.zza());
            zzc2.zza(12);
            zzc2.zzc(16);
            zzc2.zzd(zzf(zzgmxVar.zzc().zzg()));
            return zzc2.zze();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzgfb zzgfbVar, zzgdj zzgdjVar) {
        zzgqv zzb2 = zzgqx.zzb();
        byte[] zzd2 = zzgfbVar.zze().zzd(zzgdjVar);
        zzb2.zza(zzgvy.zzv(zzd2, 0, zzd2.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgqx) zzb2.zzbr()).zzaN(), zzgry.SYMMETRIC, zzg(zzgfbVar.zzd().zzd()), zzgfbVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzgfj zzgfjVar) {
        zzgsc zza2 = zzgse.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgqy zzc2 = zzgra.zzc();
        zzc2.zza(zzgfjVar.zzb());
        zza2.zzc(((zzgra) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzgfjVar.zzd()));
        return zzgmx.zzb((zzgse) zza2.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgfh zzf(zzgte zzgteVar) {
        int ordinal = zzgteVar.ordinal();
        if (ordinal == 1) {
            return zzgfh.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgfh.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgfh.zzb;
    }

    private static zzgte zzg(zzgfh zzgfhVar) {
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
