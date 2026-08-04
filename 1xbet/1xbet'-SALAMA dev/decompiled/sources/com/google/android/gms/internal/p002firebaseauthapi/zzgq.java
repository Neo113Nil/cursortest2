package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzgq {
    private static final zzzc zza;
    private static final zzon<zzdv, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzdo, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzzcVarZzb;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                return zzgq.zza((zzdv) zzchVar);
            }
        }, zzdv.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgs
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzgq.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                return zzgq.zza((zzdo) zzbpVar, zzcnVar);
            }
        }, zzdo.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzgq.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdo zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzsw zzswVarZza = zzsw.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzswVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdo.zzb().zza(zzdv.zze().zzb(zzswVarZza.zzd().zzb()).zza(12).zzc(16).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zzswVarZza.zzd().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzdv.zzb zza(zzws zzwsVar) throws GeneralSecurityException {
        int i7 = zzgt.zza[zzwsVar.ordinal()];
        if (i7 == 1) {
            return zzdv.zzb.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzdv.zzb.zzb;
        }
        if (i7 == 4) {
            return zzdv.zzb.zzc;
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static /* synthetic */ zzpc zza(zzdo zzdoVar, zzcn zzcnVar) throws GeneralSecurityException {
        zzb(zzdoVar.zzc());
        return zzpc.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzsw) ((zzajy) zzsw.zzb().zza(zzaip.zza(zzdoVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zza(zzdoVar.zzc().zzf()), zzdoVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdv zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzsz zzszVarZza = zzsz.zza(zzpfVar.zza().zze(), zzajk.zza());
                if (zzszVarZza.zzb() == 0) {
                    return zzdv.zze().zzb(zzszVarZza.zza()).zza(12).zzc(16).zza(zza(zzpfVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    public static /* synthetic */ zzpf zza(zzdv zzdvVar) throws GeneralSecurityException {
        zzb(zzdvVar);
        return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzsz) ((zzajy) zzsz.zzc().zza(zzdvVar.zzc()).zze())).a_()).zza(zza(zzdvVar.zzf())).zze()));
    }

    private static zzws zza(zzdv.zzb zzbVar) throws GeneralSecurityException {
        if (zzdv.zzb.zza.equals(zzbVar)) {
            return zzws.TINK;
        }
        if (zzdv.zzb.zzb.equals(zzbVar)) {
            return zzws.CRUNCHY;
        }
        if (zzdv.zzb.zzc.equals(zzbVar)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    private static void zzb(zzdv zzdvVar) throws GeneralSecurityException {
        if (zzdvVar.zzd() == 16) {
            if (zzdvVar.zzb() != 12) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzdvVar.zzb())));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzdvVar.zzd())));
    }

    public static void zza() {
        zzof zzofVarZza = zzof.zza();
        zzofVarZza.zza(zzb);
        zzofVarZza.zza(zzc);
        zzofVarZza.zza(zzd);
        zzofVarZza.zza(zze);
    }
}
