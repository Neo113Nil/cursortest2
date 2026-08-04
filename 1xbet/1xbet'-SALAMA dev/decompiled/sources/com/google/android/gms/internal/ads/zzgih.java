package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgih {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgvdVarZzb;
        zzc = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgid
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgih.zzd((zzgey) zzgdfVar);
            }
        }, zzgey.class, zzgmx.class);
        zzd = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzgie
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgih.zzb((zzgmx) zzgnaVar);
            }
        }, zzgvdVarZzb, zzgmx.class);
        zze = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgif
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgih.zzc((zzger) zzgcsVar, zzgdjVar);
            }
        }, zzger.class, zzgmw.class);
        zzf = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgih.zza((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzger zza(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgqo zzgqoVarZzd = zzgqo.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzgqoVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgev zzgevVarZzd = zzgey.zzd();
            zzgevVarZzd.zzb(zzgqoVarZzd.zzg().zzd());
            zzgevVarZzd.zza(zzgqoVarZzd.zzf().zza());
            zzgevVarZzd.zzc(16);
            zzgevVarZzd.zzd(zzf(zzgmwVar.zzc()));
            zzgey zzgeyVarZze = zzgevVarZzd.zze();
            zzgep zzgepVarZzc = zzger.zzc();
            zzgepVarZzc.zzc(zzgeyVarZze);
            zzgepVarZzc.zzb(zzgve.zzb(zzgqoVarZzd.zzg().zzA(), zzgdjVar));
            zzgepVarZzc.zza(zzgmwVar.zzf());
            return zzgepVarZzc.zzd();
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzgey zzb(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgqr zzgqrVarZzd = zzgqr.zzd(zzgmxVar.zzc().zzh(), zzgwq.zza());
            zzgev zzgevVarZzd = zzgey.zzd();
            zzgevVarZzd.zzb(zzgqrVarZzd.zza());
            zzgevVarZzd.zza(zzgqrVarZzd.zzf().zza());
            zzgevVarZzd.zzc(16);
            zzgevVarZzd.zzd(zzf(zzgmxVar.zzc().zzg()));
            return zzgevVarZzd.zze();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzger zzgerVar, zzgdj zzgdjVar) {
        zzgqm zzgqmVarZzb = zzgqo.zzb();
        zzgqmVarZzb.zzb(zzg(zzgerVar.zzd()));
        byte[] bArrZzd = zzgerVar.zze().zzd(zzgdjVar);
        zzgqmVarZzb.zza(zzgvy.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgqo) zzgqmVarZzb.zzbr()).zzaN(), zzgry.SYMMETRIC, zzh(zzgerVar.zzd().zze()), zzgerVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzgey zzgeyVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgqp zzgqpVarZzb = zzgqr.zzb();
        zzgqpVarZzb.zzb(zzg(zzgeyVar));
        zzgqpVarZzb.zza(zzgeyVar.zzc());
        zzgscVarZza.zzc(((zzgqr) zzgqpVarZzb.zzbr()).zzaN());
        zzgscVarZza.zza(zzh(zzgeyVar.zze()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgew zzf(zzgte zzgteVar) throws GeneralSecurityException {
        int iOrdinal = zzgteVar.ordinal();
        if (iOrdinal == 1) {
            return zzgew.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgew.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgew.zzb;
    }

    private static zzgqu zzg(zzgey zzgeyVar) {
        zzgqs zzgqsVarZzb = zzgqu.zzb();
        zzgqsVarZzb.zza(zzgeyVar.zzb());
        return (zzgqu) zzgqsVarZzb.zzbr();
    }

    private static zzgte zzh(zzgew zzgewVar) throws GeneralSecurityException {
        if (zzgew.zza.equals(zzgewVar)) {
            return zzgte.TINK;
        }
        if (zzgew.zzb.equals(zzgewVar)) {
            return zzgte.CRUNCHY;
        }
        if (zzgew.zzc.equals(zzgewVar)) {
            return zzgte.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgewVar)));
    }
}
