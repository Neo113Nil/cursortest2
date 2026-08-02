package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpx;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzra {
    private static final zzzc zza;
    private static final zzon<zzpx, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzpq, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzrs) ((zzajy) zzrs.zzb().zza(zzra.zzb(r1)).zza(r1.zzc()).zze())).a_()).zza(zzra.zza(((zzpx) zzchVar).zze())).zze()));
                return zzb3;
            }
        }, zzpx.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzpx zzb3;
                zzb3 = zzra.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzrp) ((zzajy) zzrp.zzb().zza(zzra.zzb(r1.zzc())).zza(zzaip.zza(r1.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzra.zza(r1.zzc().zze()), ((zzpq) zzbpVar).zza());
                return zza2;
            }
        }, zzpq.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzre
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzpq zzb3;
                zzb3 = zzra.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzpq zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzrp zza2 = zzrp.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzpq.zzb().zza(zzpx.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zza2.zze().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzpx zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzrs zza2 = zzrs.zza(zzpfVar.zza().zze(), zzajk.zza());
                return zzpx.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzpfVar.zza().zzd())).zza();
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzpx.zzb zza(zzws zzwsVar) {
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

    private static zzws zza(zzpx.zzb zzbVar) {
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
        zzof zza2 = zzof.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
