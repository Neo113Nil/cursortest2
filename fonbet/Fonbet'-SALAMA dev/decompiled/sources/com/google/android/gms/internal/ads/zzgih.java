package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgih {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgmd zzc;
    private static final zzglz zzd;
    private static final zzgkp zze;
    private static final zzgkl zzf;

    static {
        zzgvd zzb2 = zzgni.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
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
        }, zzb2, zzgmx.class);
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
        }, zzb2, zzgmw.class);
    }

    public static /* synthetic */ zzger zza(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgqo zzd2 = zzgqo.zzd(zzgmwVar.zze(), zzgwq.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgev zzd3 = zzgey.zzd();
            zzd3.zzb(zzd2.zzg().zzd());
            zzd3.zza(zzd2.zzf().zza());
            zzd3.zzc(16);
            zzd3.zzd(zzf(zzgmwVar.zzc()));
            zzgey zze2 = zzd3.zze();
            zzgep zzc2 = zzger.zzc();
            zzc2.zzc(zze2);
            zzc2.zzb(zzgve.zzb(zzd2.zzg().zzA(), zzgdjVar));
            zzc2.zza(zzgmwVar.zzf());
            return zzc2.zzd();
        } catch (zzgxv unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzgey zzb(zzgmx zzgmxVar) {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgqr zzd2 = zzgqr.zzd(zzgmxVar.zzc().zzh(), zzgwq.zza());
            zzgev zzd3 = zzgey.zzd();
            zzd3.zzb(zzd2.zza());
            zzd3.zza(zzd2.zzf().zza());
            zzd3.zzc(16);
            zzd3.zzd(zzf(zzgmxVar.zzc().zzg()));
            return zzd3.zze();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzgmw zzc(zzger zzgerVar, zzgdj zzgdjVar) {
        zzgqm zzb2 = zzgqo.zzb();
        zzb2.zzb(zzg(zzgerVar.zzd()));
        byte[] zzd2 = zzgerVar.zze().zzd(zzgdjVar);
        zzb2.zza(zzgvy.zzv(zzd2, 0, zzd2.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgqo) zzb2.zzbr()).zzaN(), zzgry.SYMMETRIC, zzh(zzgerVar.zzd().zze()), zzgerVar.zzf());
    }

    public static /* synthetic */ zzgmx zzd(zzgey zzgeyVar) {
        zzgsc zza2 = zzgse.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgqp zzb2 = zzgqr.zzb();
        zzb2.zzb(zzg(zzgeyVar));
        zzb2.zza(zzgeyVar.zzc());
        zza2.zzc(((zzgqr) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzgeyVar.zze()));
        return zzgmx.zzb((zzgse) zza2.zzbr());
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zzc);
        zzgluVar.zzh(zzd);
        zzgluVar.zzg(zze);
        zzgluVar.zzf(zzf);
    }

    private static zzgew zzf(zzgte zzgteVar) {
        int ordinal = zzgteVar.ordinal();
        if (ordinal == 1) {
            return zzgew.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgew.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(k.d(zzgteVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgew.zzb;
    }

    private static zzgqu zzg(zzgey zzgeyVar) {
        zzgqs zzb2 = zzgqu.zzb();
        zzb2.zza(zzgeyVar.zzb());
        return (zzgqu) zzb2.zzbr();
    }

    private static zzgte zzh(zzgew zzgewVar) {
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
