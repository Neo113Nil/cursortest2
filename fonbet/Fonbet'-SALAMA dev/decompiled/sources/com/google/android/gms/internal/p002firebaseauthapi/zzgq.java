package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzgq {
    private static final zzzc zza;
    private static final zzon<zzdv, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzdo, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                return zzgq.zza((zzdv) zzchVar);
            }
        }, zzdv.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgs
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzdv zzb3;
                zzb3 = zzgq.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                return zzgq.zza((zzdo) zzbpVar, zzcnVar);
            }
        }, zzdo.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzdo zzb3;
                zzb3 = zzgq.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdo zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzsw zza2 = zzsw.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdo.zzb().zza(zzdv.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zza2.zzd().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzdv.zzb zza(zzws zzwsVar) {
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

    public static /* synthetic */ zzpc zza(zzdo zzdoVar, zzcn zzcnVar) {
        zzb(zzdoVar.zzc());
        return zzpc.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzsw) ((zzajy) zzsw.zzb().zza(zzaip.zza(zzdoVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zza(zzdoVar.zzc().zzf()), zzdoVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdv zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzsz zza2 = zzsz.zza(zzpfVar.zza().zze(), zzajk.zza());
                if (zza2.zzb() == 0) {
                    return zzdv.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzpfVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    public static /* synthetic */ zzpf zza(zzdv zzdvVar) {
        zzb(zzdvVar);
        return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzsz) ((zzajy) zzsz.zzc().zza(zzdvVar.zzc()).zze())).a_()).zza(zza(zzdvVar.zzf())).zze()));
    }

    private static zzws zza(zzdv.zzb zzbVar) {
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

    private static void zzb(zzdv zzdvVar) {
        if (zzdvVar.zzd() == 16) {
            if (zzdvVar.zzb() != 12) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzdvVar.zzb())));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzdvVar.zzd())));
    }

    public static void zza() {
        zzof zza2 = zzof.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
