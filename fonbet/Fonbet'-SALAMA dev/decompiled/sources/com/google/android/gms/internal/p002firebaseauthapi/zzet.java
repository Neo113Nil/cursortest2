package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzer;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
final class zzet {
    private static final zzzc zza;
    private static final zzon<zzer, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzes, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzev
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzwj) ((zzajy) zzwj.zza().zza(r1.zzc()).zze())).a_()).zza(zzet.zza(((zzer) zzchVar).zzb())).zze()));
                return zzb3;
            }
        }, zzer.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzer zzb3;
                zzb3 = zzet.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzex
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzwg) ((zzajy) zzwg.zzb().zza((zzwj) ((zzajy) zzwj.zza().zza(r1.zzb().zzc()).zze())).zze())).a_(), zzvq.zzb.REMOTE, zzet.zza(r1.zzb().zzb()), ((zzes) zzbpVar).zza());
                return zza2;
            }
        }, zzes.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzew
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzes zzb3;
                zzb3 = zzet.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzes zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzwg zza2 = zzwg.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() == 0) {
                return zzes.zza(zzer.zza(zza2.zzd().zzd(), zza(zzpcVar.zzb())), zzpcVar.zze());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zza2)));
        } catch (zzakf e7) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e7);
        }
    }

    private static zzer.zza zza(zzws zzwsVar) {
        int i7 = zzez.zza[zzwsVar.ordinal()];
        if (i7 == 1) {
            return zzer.zza.zza;
        }
        if (i7 == 2) {
            return zzer.zza.zzb;
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzer zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzer.zza(zzwj.zza(zzpfVar.zza().zze(), zzajk.zza()).zzd(), zza(zzpfVar.zza().zzd()));
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzws zza(zzer.zza zzaVar) {
        if (zzer.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzer.zza.zzb.equals(zzaVar)) {
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
