package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgjp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzgvdVarZzb;
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
        }, zzgvdVarZzb, zzgmx.class);
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
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzghl zza(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzgtk zzgtkVarZzd = zzgtk.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgtkVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgtkVarZzd.zzg().zzd() == 32) {
                return zzghl.zzc(zzghq.zzd(zzf(zzgmwVar.zzc()), zzgtkVarZzd.zzf().zza()), zzgve.zzb(zzgtkVarZzd.zzg().zzA(), zzgdjVar), zzgmwVar.zzf());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static /* synthetic */ zzghq zzb(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgtn zzgtnVarZzd = zzgtn.zzd(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzgtnVarZzd.zza() == 0) {
                return zzghq.zzd(zzf(zzgmxVar.zzc().zzg()), zzgtnVarZzd.zzf().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzghl zzghlVar, zzgdj zzgdjVar) {
        zzgti zzgtiVarZzb = zzgtk.zzb();
        byte[] bArrZzd = zzghlVar.zze().zzd(zzgdjVar);
        zzgtiVarZzb.zza(zzgvy.zzv(bArrZzd, 0, bArrZzd.length));
        zzgto zzgtoVarZzb = zzgtq.zzb();
        zzgtoVarZzb.zza(zzghlVar.zzd().zzb());
        zzgtiVarZzb.zzb((zzgtq) zzgtoVarZzb.zzbr());
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzgtk) zzgtiVarZzb.zzbr()).zzaN(), zzgry.SYMMETRIC, zzg(zzghlVar.zzd().zzc()), zzghlVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzghq zzghqVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzgtl zzgtlVarZzb = zzgtn.zzb();
        zzgto zzgtoVarZzb = zzgtq.zzb();
        zzgtoVarZzb.zza(zzghqVar.zzb());
        zzgtlVarZzb.zza((zzgtq) zzgtoVarZzb.zzbr());
        zzgscVarZza.zzc(((zzgtn) zzgtlVarZzb.zzbr()).zzaN());
        zzgscVarZza.zza(zzg(zzghqVar.zzc()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzghp zzf(zzgte zzgteVar) throws GeneralSecurityException {
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            return zzghp.zza;
        }
        if (iOrdinal == 3) {
            return zzghp.zzb;
        }
        throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgte zzg(zzghp zzghpVar) throws GeneralSecurityException {
        if (Objects.equals(zzghpVar, zzghp.zza)) {
            return zzgte.TINK;
        }
        if (Objects.equals(zzghpVar, zzghp.zzb)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghpVar.toString()));
    }
}
