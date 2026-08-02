package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgjp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzb2 = zzgni.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzb2;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgjl
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgjp.zzd((zzghq) zzgdfVar);
            }
        }, zzghq.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzgjm
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgjp.zzb((zzgmx) zzgnaVar);
            }
        }, zzb2, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgjn
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgjp.zzc((zzghl) zzgcsVar, zzgdjVar);
            }
        }, zzghl.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgjo
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgjp.zza((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzb2, zzgmw.class);
    }

    public static /* synthetic */ zzghl zza(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzgtk zzd2 = zzgtk.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzg().zzd() == 32) {
                return zzghl.zzc(zzghq.zzd(zzf(zzgmwVar.zzc()), zzd2.zzf().zza()), zzgve.zzb(zzd2.zzg().zzA(), zzgdjVar), zzgmwVar.zzf());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static /* synthetic */ zzghq zzb(zzgmx zzgmxVar) {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgtn zzd2 = zzgtn.zzd(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzd2.zza() == 0) {
                return zzghq.zzd(zzf(zzgmxVar.zzc().zzg()), zzd2.zzf().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzghl zzghlVar, zzgdj zzgdjVar) {
        zzgti zzb2 = zzgtk.zzb();
        byte[] zzd2 = zzghlVar.zze().zzd(zzgdjVar);
        zzb2.zza(zzgvy.zzv(zzd2, 0, zzd2.length));
        zzgto zzb3 = zzgtq.zzb();
        zzb3.zza(zzghlVar.zzd().zzb());
        zzb2.zzb((zzgtq) zzb3.zzbr());
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzgtk) zzb2.zzbr()).zzaN(), zzgry.SYMMETRIC, zzg(zzghlVar.zzd().zzc()), zzghlVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzghq zzghqVar) {
        zzgsc zza2 = zzgse.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzgtl zzb2 = zzgtn.zzb();
        zzgto zzb3 = zzgtq.zzb();
        zzb3.zza(zzghqVar.zzb());
        zzb2.zza((zzgtq) zzb3.zzbr());
        zza2.zzc(((zzgtn) zzb2.zzbr()).zzaN());
        zza2.zza(zzg(zzghqVar.zzc()));
        return zzgmx.zzb((zzgse) zza2.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzghp zzf(zzgte zzgteVar) {
        int ordinal = zzgteVar.ordinal();
        if (ordinal == 1) {
            return zzghp.zza;
        }
        if (ordinal == 3) {
            return zzghp.zzb;
        }
        throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgte zzg(zzghp zzghpVar) {
        if (Objects.equals(zzghpVar, zzghp.zza)) {
            return zzgte.TINK;
        }
        if (Objects.equals(zzghpVar, zzghp.zzb)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghpVar.toString()));
    }
}
