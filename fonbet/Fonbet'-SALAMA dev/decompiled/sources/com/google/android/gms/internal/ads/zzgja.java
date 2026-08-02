package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgja {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzb2 = zzgni.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzb2;
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
        }, zzb2, zzgmx.class);
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
        }, zzb2, zzgmw.class);
    }

    public static /* synthetic */ zzgfv zza(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgrj zzd2 = zzgrj.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzd2.zza() == 0) {
                return zzgfv.zzc(zzf(zzgmwVar.zzc()), zzgve.zzb(zzd2.zzf().zzA(), zzgdjVar), zzgmwVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgga zzb(zzgmx zzgmxVar) {
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
        zzgrh zzb2 = zzgrj.zzb();
        byte[] zzd2 = zzgfvVar.zze().zzd(zzgdjVar);
        zzb2.zza(zzgvy.zzv(zzd2, 0, zzd2.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgrj) zzb2.zzbr()).zzaN(), zzgry.SYMMETRIC, zzg(zzgfvVar.zzd().zzb()), zzgfvVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzgga zzggaVar) {
        zzgsc zza2 = zzgse.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza2.zzc(zzgrm.zzb().zzaN());
        zza2.zza(zzg(zzggaVar.zzb()));
        return zzgmx.zzb((zzgse) zza2.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgfz zzf(zzgte zzgteVar) {
        int ordinal = zzgteVar.ordinal();
        if (ordinal == 1) {
            return zzgfz.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgfz.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgfz.zzb;
    }

    private static zzgte zzg(zzgfz zzgfzVar) {
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
