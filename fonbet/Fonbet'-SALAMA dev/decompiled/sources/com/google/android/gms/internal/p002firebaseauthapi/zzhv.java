package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzft;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import java.util.Objects;
import w1.L;

/* loaded from: classes.dex */
public final class zzhv {
    private static final zzzc zza;
    private static final zzon<zzft, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzfp, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.XAesGcmKey").zza(((zzxb) ((zzajy) zzxb.zzb().zza((zzxe) ((zzajy) zzxe.zzb().zza(r1.zzb()).zze())).zze())).a_()).zza(zzhv.zza(((zzft) zzchVar).zzc())).zze()));
                return zzb3;
            }
        }, zzft.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzft zzb3;
                zzb3 = zzhv.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzia
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzwy) ((zzajy) zzwy.zzb().zza(zzaip.zza(r1.zzd().zza(zzcn.zza(zzcnVar)))).zza((zzxe) ((zzajy) zzxe.zzb().zza(r1.zzb().zzb()).zze())).zze())).a_(), zzvq.zzb.SYMMETRIC, zzhv.zza(r1.zzb().zzc()), ((zzfp) zzbpVar).zza());
                return zza2;
            }
        }, zzfp.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzfp zzb3;
                zzb3 = zzhv.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfp zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzwy zza2 = zzwy.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zza2.zze().zzb() == 32) {
                return zzfp.zza(zzft.zza(zza(zzpcVar.zzb()), zza2.zzd().zza()), zzze.zza(zza2.zze().zzd(), zzcn.zza(zzcnVar)), zzpcVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzft.zza zza(zzws zzwsVar) {
        int i7 = zzic.zza[zzwsVar.ordinal()];
        if (i7 == 1) {
            return zzft.zza.zza;
        }
        if (i7 == 2) {
            return zzft.zza.zzb;
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzft zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzxb zza2 = zzxb.zza(zzpfVar.zza().zze(), zzajk.zza());
                if (zza2.zza() == 0) {
                    return zzft.zza(zza(zzpfVar.zza().zzd()), zza2.zzd().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzws zza(zzft.zza zzaVar) {
        if (Objects.equals(zzaVar, zzft.zza.zza)) {
            return zzws.TINK;
        }
        if (Objects.equals(zzaVar, zzft.zza.zzb)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    public static void zza() {
        zzof zza2 = zzof.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
