package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import com.google.android.gms.internal.p002firebaseauthapi.zzva;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzgc {
    private static final zzzc zza;
    private static final zzon<zzdg, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzcz, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zza(((zzsb) ((zzajy) zzsb.zza().zza((zzsh) ((zzajy) zzsh.zzb().zza((zzsk) ((zzajy) zzsk.zzb().zza(r1.zzd()).zze())).zza(r1.zzb()).zze())).zza((zzux) ((zzajy) zzux.zzc().zza(zzgc.zzb(r1)).zza(r1.zzc()).zze())).zze())).a_()).zza(zzgc.zza(((zzdg) zzchVar).zzh())).zze()));
                return zzb3;
            }
        }, zzdg.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzge
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzdg zzb3;
                zzb3 = zzgc.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzry) ((zzajy) zzry.zzb().zza((zzse) ((zzajy) zzse.zzb().zza((zzsk) ((zzajy) zzsk.zzb().zza(r1.zzc().zzd()).zze())).zza(zzaip.zza(r1.zze().zza(zzcn.zza(zzcnVar)))).zze())).zza((zzuu) ((zzajy) zzuu.zzb().zza(zzgc.zzb(r1.zzc())).zza(zzaip.zza(r1.zzf().zza(zzcn.zza(zzcnVar)))).zze())).zze())).a_(), zzvq.zzb.SYMMETRIC, zzgc.zza(r1.zzc().zzh()), ((zzcz) zzbpVar).zza());
                return zza2;
            }
        }, zzcz.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzcz zzb3;
                zzb3 = zzgc.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcz zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzry zza2 = zzry.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zza2.zzd().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zza2.zze().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return zzcz.zzb().zza(zzdg.zzf().zza(zza2.zzd().zzf().zzb()).zzb(zza2.zze().zzf().zzb()).zzc(zza2.zzd().zze().zza()).zzd(zza2.zze().zze().zza()).zza(zza(zza2.zze().zze().zzb())).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zza2.zzd().zzf().zzd(), zzcn.zza(zzcnVar))).zzb(zzze.zza(zza2.zze().zzf().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzdg.zzc zza(zzur zzurVar) {
        int i7 = zzgf.zzb[zzurVar.ordinal()];
        if (i7 == 1) {
            return zzdg.zzc.zza;
        }
        if (i7 == 2) {
            return zzdg.zzc.zzb;
        }
        if (i7 == 3) {
            return zzdg.zzc.zzc;
        }
        if (i7 == 4) {
            return zzdg.zzc.zzd;
        }
        if (i7 == 5) {
            return zzdg.zzc.zze;
        }
        throw new GeneralSecurityException(k.d(zzurVar.zza(), "Unable to parse HashType: "));
    }

    private static zzdg.zzb zza(zzws zzwsVar) {
        int i7 = zzgf.zza[zzwsVar.ordinal()];
        if (i7 == 1) {
            return zzdg.zzb.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzdg.zzb.zzb;
        }
        if (i7 == 4) {
            return zzdg.zzb.zzc;
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdg zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzsb zza2 = zzsb.zza(zzpfVar.zza().zze(), zzajk.zza());
                if (zza2.zzd().zzb() == 0) {
                    return zzdg.zzf().zza(zza2.zzc().zza()).zzb(zza2.zzd().zza()).zzc(zza2.zzc().zze().zza()).zzd(zza2.zzd().zzf().zza()).zza(zza(zza2.zzd().zzf().zzb())).zza(zza(zzpfVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzva zzb(zzdg zzdgVar) {
        zzur zzurVar;
        zzva.zza zza2 = zzva.zzc().zza(zzdgVar.zze());
        zzdg.zzc zzg = zzdgVar.zzg();
        if (zzdg.zzc.zza.equals(zzg)) {
            zzurVar = zzur.SHA1;
        } else if (zzdg.zzc.zzb.equals(zzg)) {
            zzurVar = zzur.SHA224;
        } else if (zzdg.zzc.zzc.equals(zzg)) {
            zzurVar = zzur.SHA256;
        } else if (zzdg.zzc.zzd.equals(zzg)) {
            zzurVar = zzur.SHA384;
        } else if (zzdg.zzc.zze.equals(zzg)) {
            zzurVar = zzur.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzg)));
        }
        return (zzva) ((zzajy) zza2.zza(zzurVar).zze());
    }

    private static zzws zza(zzdg.zzb zzbVar) {
        if (zzdg.zzb.zza.equals(zzbVar)) {
            return zzws.TINK;
        }
        if (zzdg.zzb.zzb.equals(zzbVar)) {
            return zzws.CRUNCHY;
        }
        if (zzdg.zzb.zzc.equals(zzbVar)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static void zza() {
        zzof zza2 = zzof.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
