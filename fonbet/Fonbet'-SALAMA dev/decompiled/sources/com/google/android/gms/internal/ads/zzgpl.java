package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgpl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgkd zzc;
    private static final zzgkd zzd;
    private static final zzgmd zze;
    private static final zzglz zzf;
    private static final zzgkp zzg;
    private static final zzgkl zzh;

    static {
        zzgvd zzb2 = zzgni.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzgkb zza2 = zzgkd.zza();
        zza2.zza(zzgte.RAW, zzgoi.zzd);
        zza2.zza(zzgte.TINK, zzgoi.zza);
        zza2.zza(zzgte.LEGACY, zzgoi.zzc);
        zza2.zza(zzgte.CRUNCHY, zzgoi.zzb);
        zzc = zza2.zzb();
        zzgkb zza3 = zzgkd.zza();
        zza3.zza(zzgrn.SHA1, zzgoh.zza);
        zza3.zza(zzgrn.SHA224, zzgoh.zzb);
        zza3.zza(zzgrn.SHA256, zzgoh.zzc);
        zza3.zza(zzgrn.SHA384, zzgoh.zzd);
        zza3.zza(zzgrn.SHA512, zzgoh.zze);
        zzd = zza3.zzb();
        zze = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgph
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgpl.zzb((zzgok) zzgdfVar);
            }
        }, zzgok.class, zzgmx.class);
        zzf = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzgpi
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgpl.zzd((zzgmx) zzgnaVar);
            }
        }, zzb2, zzgmx.class);
        zzg = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgpj
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgpl.zza((zzgoa) zzgcsVar, zzgdjVar);
            }
        }, zzgoa.class, zzgmw.class);
        zzh = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgpk
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgpl.zzc((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzb2, zzgmw.class);
    }

    public static /* synthetic */ zzgmw zza(zzgoa zzgoaVar, zzgdj zzgdjVar) {
        zzgro zzb2 = zzgrq.zzb();
        zzb2.zzb(zzf(zzgoaVar.zzc()));
        byte[] zzd2 = zzgoaVar.zze().zzd(zzgdjVar);
        zzb2.zza(zzgvy.zzv(zzd2, 0, zzd2.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgrq) zzb2.zzbr()).zzaN(), zzgry.SYMMETRIC, (zzgte) zzc.zzb(zzgoaVar.zzc().zzg()), zzgoaVar.zzf());
    }

    public static /* synthetic */ zzgmx zzb(zzgok zzgokVar) {
        zzgsc zza2 = zzgse.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgrr zzc2 = zzgrt.zzc();
        zzc2.zzb(zzf(zzgokVar));
        zzc2.zza(zzgokVar.zzc());
        zza2.zzc(((zzgrt) zzc2.zzbr()).zzaN());
        zza2.zza((zzgte) zzc.zzb(zzgokVar.zzg()));
        return zzgmx.zzb((zzgse) zza2.zzbr());
    }

    public static /* synthetic */ zzgoa zzc(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgrq zzf2 = zzgrq.zzf(zzgmwVar.zze(), zzgwq.zza());
            if (zzf2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgog zze2 = zzgok.zze();
            zze2.zzb(zzf2.zzh().zzd());
            zze2.zzc(zzf2.zzg().zza());
            zze2.zza((zzgoh) zzd.zzc(zzf2.zzg().zzb()));
            zze2.zzd((zzgoi) zzc.zzc(zzgmwVar.zzc()));
            zzgok zze3 = zze2.zze();
            zzgny zzb2 = zzgoa.zzb();
            zzb2.zzc(zze3);
            zzb2.zzb(zzgve.zzb(zzf2.zzh().zzA(), zzgdjVar));
            zzb2.zza(zzgmwVar.zzf());
            return zzb2.zzd();
        } catch (zzgxv | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgok zzd(zzgmx zzgmxVar) {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgrt zzg2 = zzgrt.zzg(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzg2.zzb() != 0) {
                throw new GeneralSecurityException(k.d(zzg2.zzb(), "Parsing HmacParameters failed: unknown Version "));
            }
            zzgog zze2 = zzgok.zze();
            zze2.zzb(zzg2.zza());
            zze2.zzc(zzg2.zzh().zza());
            zze2.zza((zzgoh) zzd.zzc(zzg2.zzh().zzb()));
            zze2.zzd((zzgoi) zzc.zzc(zzgmxVar.zzc().zzg()));
            return zze2.zze();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e7);
        }
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zze);
        zzgluVar.zzh(zzf);
        zzgluVar.zzg(zzg);
        zzgluVar.zzf(zzh);
    }

    private static zzgrw zzf(zzgok zzgokVar) {
        zzgru zzc2 = zzgrw.zzc();
        zzc2.zzb(zzgokVar.zzb());
        zzc2.zza((zzgrn) zzd.zzb(zzgokVar.zzf()));
        return (zzgrw) zzc2.zzbr();
    }
}
