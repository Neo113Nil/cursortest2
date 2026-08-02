package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzga;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzie {
    private static final zzzc zza;
    private static final zzon<zzga, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzfv, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzid
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzxk.zzc().a_()).zza(zzie.zza(((zzga) zzchVar).zzb())).zze()));
                return zzb3;
            }
        }, zzga.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzig
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzga zzb3;
                zzb3 = zzie.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzif
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzxh) ((zzajy) zzxh.zzb().zza(zzaip.zza(r1.zzd().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzie.zza(r1.zzb().zzb()), ((zzfv) zzbpVar).zza());
                return zza2;
            }
        }, zzfv.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzii
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzfv zzb3;
                zzb3 = zzie.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfv zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzxh zza2 = zzxh.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() == 0) {
                return zzfv.zza(zza(zzpcVar.zzb()), zzze.zza(zza2.zzd().zzd(), zzcn.zza(zzcnVar)), zzpcVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzga.zza zza(zzws zzwsVar) {
        int i7 = zzih.zza[zzwsVar.ordinal()];
        if (i7 == 1) {
            return zzga.zza.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzga.zza.zzb;
        }
        if (i7 == 4) {
            return zzga.zza.zzc;
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzga zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzxk.zza(zzpfVar.zza().zze(), zzajk.zza()).zza() == 0) {
                    return zzga.zza(zza(zzpfVar.zza().zzd()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzws zza(zzga.zza zzaVar) {
        if (zzga.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzga.zza.zzb.equals(zzaVar)) {
            return zzws.CRUNCHY;
        }
        if (zzga.zza.zzc.equals(zzaVar)) {
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
