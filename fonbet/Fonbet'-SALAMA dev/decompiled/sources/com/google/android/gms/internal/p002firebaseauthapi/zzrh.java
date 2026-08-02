package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqk;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzrh {
    private static final zzzc zza;
    private static final zzmm<zzws, zzqk.zzb> zzb;
    private static final zzmm<zzur, zzqk.zzc> zzc;
    private static final zzon<zzqk, zzpf> zzd;
    private static final zzoj<zzpf> zze;
    private static final zzmw<zzqd, zzpc> zzf;
    private static final zzms<zzpc> zzg;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzb2;
        zzb = zzmm.zza().zza(zzws.RAW, zzqk.zzb.zzd).zza(zzws.TINK, zzqk.zzb.zza).zza(zzws.LEGACY, zzqk.zzb.zzc).zza(zzws.CRUNCHY, zzqk.zzb.zzb).zza();
        zzc = zzmm.zza().zza(zzur.SHA1, zzqk.zzc.zza).zza(zzur.SHA224, zzqk.zzc.zzb).zza(zzur.SHA256, zzqk.zzc.zzc).zza(zzur.SHA384, zzqk.zzc.zzd).zza(zzur.SHA512, zzqk.zzc.zze).zza();
        zzd = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.HmacKey").zza(((zzux) ((zzajy) zzux.zzc().zza(zzrh.zzb(r1)).zza(r1.zzc()).zze())).a_()).zza(zzrh.zzb.zza((zzmm<zzws, zzqk.zzb>) ((zzqk) zzchVar).zzf())).zze()));
                return zzb3;
            }
        }, zzqk.class, zzpf.class);
        zze = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzqk zzb3;
                zzb3 = zzrh.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzf = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzuu) ((zzajy) zzuu.zzb().zza(zzrh.zzb(r1.zzc())).zza(zzaip.zza(r1.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzrh.zzb.zza((zzmm<zzws, zzqk.zzb>) r1.zzc().zzf()), ((zzqd) zzbpVar).zza());
                return zza2;
            }
        }, zzqd.class, zzpc.class);
        zzg = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzqd zzb3;
                zzb3 = zzrh.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqd zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzuu zza2 = zzuu.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqd.zzb().zza(zzqk.zzd().zza(zza2.zzf().zzb()).zzb(zza2.zze().zza()).zza(zzc.zza((zzmm<zzur, zzqk.zzc>) zza2.zze().zzb())).zza(zzb.zza((zzmm<zzws, zzqk.zzb>) zzpcVar.zzb())).zza()).zza(zzze.zza(zza2.zzf().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqk zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzux zza2 = zzux.zza(zzpfVar.zza().zze(), zzajk.zza());
                if (zza2.zzb() == 0) {
                    return zzqk.zzd().zza(zza2.zza()).zzb(zza2.zzf().zza()).zza(zzc.zza((zzmm<zzur, zzqk.zzc>) zza2.zzf().zzb())).zza(zzb.zza((zzmm<zzws, zzqk.zzb>) zzpfVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException(k.d(zza2.zzb(), "Parsing HmacParameters failed: unknown Version "));
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
    }

    public static void zza() {
        zzof zza2 = zzof.zza();
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
    }

    private static zzva zzb(zzqk zzqkVar) {
        return (zzva) ((zzajy) zzva.zzc().zza(zzqkVar.zzb()).zza(zzc.zza((zzmm<zzur, zzqk.zzc>) zzqkVar.zze())).zze());
    }
}
