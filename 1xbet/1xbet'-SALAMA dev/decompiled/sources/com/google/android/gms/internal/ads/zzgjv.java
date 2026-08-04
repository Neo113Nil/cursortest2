package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgjv {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzgvdVarZzb;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgjr
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgjv.zzd((zzghx) zzgdfVar);
            }
        }, zzghx.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgjv.zzb((zzgmx) zzgnaVar);
            }
        }, zzgvdVarZzb, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgjv.zzc((zzghr) zzgcsVar, zzgdjVar);
            }
        }, zzghr.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgju
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgjv.zza((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzghr zza(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgtt zzgttVarZzd = zzgtt.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgttVarZzd.zza() == 0) {
                return zzghr.zzc(zzf(zzgmwVar.zzc()), zzgve.zzb(zzgttVarZzd.zzf().zzA(), zzgdjVar), zzgmwVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzghx zzb(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            if (zzgtw.zzd(zzgmxVar.zzc().zzh(), zzgwq.zza()).zza() == 0) {
                return zzghx.zzc(zzf(zzgmxVar.zzc().zzg()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzghr zzghrVar, zzgdj zzgdjVar) {
        zzgtr zzgtrVarZzb = zzgtt.zzb();
        byte[] bArrZzd = zzghrVar.zze().zzd(zzgdjVar);
        zzgtrVarZzb.zza(zzgvy.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgtt) zzgtrVarZzb.zzbr()).zzaN(), zzgry.SYMMETRIC, zzg(zzghrVar.zzd().zzb()), zzghrVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzghx zzghxVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgscVarZza.zzc(zzgtw.zzc().zzaN());
        zzgscVarZza.zza(zzg(zzghxVar.zzb()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzghw zzf(zzgte zzgteVar) throws GeneralSecurityException {
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            return zzghw.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzghw.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzghw.zzb;
    }

    private static zzgte zzg(zzghw zzghwVar) throws GeneralSecurityException {
        if (zzghw.zza.equals(zzghwVar)) {
            return zzgte.TINK;
        }
        if (zzghw.zzb.equals(zzghwVar)) {
            return zzgte.CRUNCHY;
        }
        if (zzghw.zzc.equals(zzghwVar)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghwVar.toString()));
    }
}
