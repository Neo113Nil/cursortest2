package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzec;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzgw {
    private static final zzzc zza;
    private static final zzon<zzec, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzdx, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((zztf) ((zzajy) zztf.zzc().zza(r1.zzb()).zze())).a_()).zza(zzgw.zza(((zzec) zzchVar).zzd())).zze()));
                return zzb3;
            }
        }, zzec.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzec zzb3;
                zzb3 = zzgw.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zztc) ((zzajy) zztc.zzb().zza(zzaip.zza(r1.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzgw.zza(r1.zzc().zzd()), ((zzdx) zzbpVar).zza());
                return zza2;
            }
        }, zzdx.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzha
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzdx zzb3;
                zzb3 = zzgw.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdx zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zztc zza2 = zztc.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdx.zzb().zza(zzec.zzc().zza(zza2.zzd().zzb()).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zza2.zzd().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzec.zza zza(zzws zzwsVar) {
        int i7 = zzgz.zza[zzwsVar.ordinal()];
        if (i7 == 1) {
            return zzec.zza.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzec.zza.zzb;
        }
        if (i7 == 4) {
            return zzec.zza.zzc;
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzec zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zztf zza2 = zztf.zza(zzpfVar.zza().zze(), zzajk.zza());
                if (zza2.zzb() == 0) {
                    return zzec.zzc().zza(zza2.zza()).zza(zza(zzpfVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzws zza(zzec.zza zzaVar) {
        if (zzec.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzec.zza.zzb.equals(zzaVar)) {
            return zzws.CRUNCHY;
        }
        if (zzec.zza.zzc.equals(zzaVar)) {
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
