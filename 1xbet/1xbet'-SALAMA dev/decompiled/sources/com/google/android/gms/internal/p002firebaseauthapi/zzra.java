package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzra {
    private static final zzzc zza;
    private static final zzon<zzpx, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzpq, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzzcVarZzb;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpx zzpxVar = (zzpx) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzrs) ((zzajy) zzrs.zzb().zza(zzra.zzb(zzpxVar)).zza(zzpxVar.zzc()).zze())).a_()).zza(zzra.zza(zzpxVar.zze())).zze()));
            }
        }, zzpx.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzra.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpq zzpqVar = (zzpq) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzrp) ((zzajy) zzrp.zzb().zza(zzra.zzb(zzpqVar.zzc())).zza(zzaip.zza(zzpqVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzra.zza(zzpqVar.zzc().zze()), zzpqVar.zza());
            }
        }, zzpq.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzre
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzra.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzpq zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzrp zzrpVarZza = zzrp.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzrpVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzpq.zzb().zza(zzpx.zzd().zza(zzrpVarZza.zze().zzb()).zzb(zzrpVarZza.zzd().zza()).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zzrpVarZza.zze().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzpx zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzrs zzrsVarZza = zzrs.zza(zzpfVar.zza().zze(), zzajk.zza());
                return zzpx.zzd().zza(zzrsVarZza.zza()).zzb(zzrsVarZza.zzd().zza()).zza(zza(zzpfVar.zza().zzd())).zza();
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzpx.zzb zza(zzws zzwsVar) throws GeneralSecurityException {
        int i7 = zzrd.zza[zzwsVar.ordinal()];
        if (i7 == 1) {
            return zzpx.zzb.zza;
        }
        if (i7 == 2) {
            return zzpx.zzb.zzb;
        }
        if (i7 == 3) {
            return zzpx.zzb.zzc;
        }
        if (i7 == 4) {
            return zzpx.zzb.zzd;
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzrv zzb(zzpx zzpxVar) {
        return (zzrv) ((zzajy) zzrv.zzb().zza(zzpxVar.zzb()).zze());
    }

    private static zzws zza(zzpx.zzb zzbVar) throws GeneralSecurityException {
        if (zzpx.zzb.zza.equals(zzbVar)) {
            return zzws.TINK;
        }
        if (zzpx.zzb.zzb.equals(zzbVar)) {
            return zzws.CRUNCHY;
        }
        if (zzpx.zzb.zzd.equals(zzbVar)) {
            return zzws.RAW;
        }
        if (zzpx.zzb.zzc.equals(zzbVar)) {
            return zzws.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static void zza() {
        zzof zzofVarZza = zzof.zza();
        zzofVarZza.zza(zzb);
        zzofVarZza.zza(zzc);
        zzofVarZza.zza(zzd);
        zzofVarZza.zza(zze);
    }
}
