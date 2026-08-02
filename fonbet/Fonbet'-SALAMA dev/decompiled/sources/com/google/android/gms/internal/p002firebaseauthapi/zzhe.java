package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzei;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzhe {
    private static final zzzc zza;
    private static final zzon<zzei, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzee, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zztr.zzb().a_()).zza(zzhe.zza(((zzei) zzchVar).zzb())).zze()));
                return zzb3;
            }
        }, zzei.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzei zzb3;
                zzb3 = zzhe.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzto) ((zzajy) zzto.zzb().zza(zzaip.zza(r1.zzd().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzhe.zza(r1.zzb().zzb()), ((zzee) zzbpVar).zza());
                return zza2;
            }
        }, zzee.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzee zzb3;
                zzb3 = zzhe.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzee zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzto zza2 = zzto.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() == 0) {
                return zzee.zza(zza(zzpcVar.zzb()), zzze.zza(zza2.zzd().zzd(), zzcn.zza(zzcnVar)), zzpcVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzei.zza zza(zzws zzwsVar) {
        int i7 = zzhh.zza[zzwsVar.ordinal()];
        if (i7 == 1) {
            return zzei.zza.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzei.zza.zzb;
        }
        if (i7 == 4) {
            return zzei.zza.zzc;
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzei zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zztr.zza(zzpfVar.zza().zze(), zzajk.zza());
                return zzei.zza(zza(zzpfVar.zza().zzd()));
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzws zza(zzei.zza zzaVar) {
        if (zzei.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzei.zza.zzb.equals(zzaVar)) {
            return zzws.CRUNCHY;
        }
        if (zzei.zza.zzc.equals(zzaVar)) {
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
