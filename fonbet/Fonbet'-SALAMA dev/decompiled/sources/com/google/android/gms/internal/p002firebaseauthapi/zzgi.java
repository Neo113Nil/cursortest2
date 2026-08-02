package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdm;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzgi {
    private static final zzzc zza;
    private static final zzon<zzdm, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzdh, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey").zza(((zzsq) ((zzajy) zzsq.zzb().zza(zzgi.zzb(r1)).zza(r1.zzc()).zze())).a_()).zza(zzgi.zza(((zzdm) zzchVar).zzf())).zze()));
                return zzb3;
            }
        }, zzdm.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzdm zzb3;
                zzb3 = zzgi.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzsn) ((zzajy) zzsn.zzb().zza(zzgi.zzb(r1.zzc())).zza(zzaip.zza(r1.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzgi.zza(r1.zzc().zzf()), ((zzdh) zzbpVar).zza());
                return zza2;
            }
        }, zzdh.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzdh zzb3;
                zzb3 = zzgi.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdh zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzsn zza2 = zzsn.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdh.zzb().zza(zzdm.zze().zzb(zza2.zze().zzb()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zza2.zze().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static zzdm.zza zza(zzws zzwsVar) {
        int i7 = zzgl.zza[zzwsVar.ordinal()];
        if (i7 == 1) {
            return zzdm.zza.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzdm.zza.zzb;
        }
        if (i7 == 4) {
            return zzdm.zza.zzc;
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdm zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzsq zza2 = zzsq.zza(zzpfVar.zza().zze(), zzajk.zza());
                return zzdm.zze().zzb(zza2.zza()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzpfVar.zza().zzd())).zza();
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzws zza(zzdm.zza zzaVar) {
        if (zzdm.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzdm.zza.zzb.equals(zzaVar)) {
            return zzws.CRUNCHY;
        }
        if (zzdm.zza.zzc.equals(zzaVar)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    private static zzst zzb(zzdm zzdmVar) {
        if (zzdmVar.zzd() == 16) {
            return (zzst) ((zzajy) zzst.zzb().zza(zzdmVar.zzb()).zze());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzdmVar.zzd())));
    }

    public static void zza() {
        zzof zza2 = zzof.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
