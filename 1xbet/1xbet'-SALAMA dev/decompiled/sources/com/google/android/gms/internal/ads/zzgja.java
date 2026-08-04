package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgja {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzgvdVarZzb;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgiw
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgja.zzd((zzgga) zzgdfVar);
            }
        }, zzgga.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzgix
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgja.zzb((zzgmx) zzgnaVar);
            }
        }, zzgvdVarZzb, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgiy
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgja.zzc((zzgfv) zzgcsVar, zzgdjVar);
            }
        }, zzgfv.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgiz
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgja.zza((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzgfv zza(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgrj zzgrjVarZzd = zzgrj.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgrjVarZzd.zza() == 0) {
                return zzgfv.zzc(zzf(zzgmwVar.zzc()), zzgve.zzb(zzgrjVarZzd.zzf().zzA(), zzgdjVar), zzgmwVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgga zzb(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgrm.zzc(zzgmxVar.zzc().zzh(), zzgwq.zza());
            return zzgga.zzc(zzf(zzgmxVar.zzc().zzg()));
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzgfv zzgfvVar, zzgdj zzgdjVar) {
        zzgrh zzgrhVarZzb = zzgrj.zzb();
        byte[] bArrZzd = zzgfvVar.zze().zzd(zzgdjVar);
        zzgrhVarZzb.zza(zzgvy.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgrj) zzgrhVarZzb.zzbr()).zzaN(), zzgry.SYMMETRIC, zzg(zzgfvVar.zzd().zzb()), zzgfvVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzgga zzggaVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzgscVarZza.zzc(zzgrm.zzb().zzaN());
        zzgscVarZza.zza(zzg(zzggaVar.zzb()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgfz zzf(zzgte zzgteVar) throws GeneralSecurityException {
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            return zzgfz.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgfz.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgfz.zzb;
    }

    private static zzgte zzg(zzgfz zzgfzVar) throws GeneralSecurityException {
        if (zzgfz.zza.equals(zzgfzVar)) {
            return zzgte.TINK;
        }
        if (zzgfz.zzb.equals(zzgfzVar)) {
            return zzgte.CRUNCHY;
        }
        if (zzgfz.zzc.equals(zzgfzVar)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgfzVar.toString()));
    }
}
