package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzjz {
    private static final zzzc zza;
    private static final zzzc zzb;
    private static final zzon<zzju, zzpf> zzc;
    private static final zzoj<zzpf> zzd;
    private static final zzmw<zzke, zzpc> zze;
    private static final zzms<zzpc> zzf;
    private static final zzmw<zzjw, zzpc> zzg;
    private static final zzms<zzpc> zzh;
    private static final zzmm<zzws, zzju.zze> zzi;
    private static final zzmm<zzvf, zzju.zzf> zzj;
    private static final zzmm<zzvc, zzju.zzc> zzk;
    private static final zzmm<zzvd, zzju.zzb> zzl;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzb2;
        zzzc zzb3 = zzpr.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzb3;
        zzc = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb4;
                zzb4 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey").zza(((zzve) ((zzajy) zzve.zza().zza(zzjz.zzb(r1)).zze())).a_()).zza(zzjz.zzi.zza((zzmm<zzws, zzju.zze>) ((zzju) zzchVar).zzf())).zze()));
                return zzb4;
            }
        }, zzju.class, zzpf.class);
        zzd = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzju zzb4;
                zzb4 = zzjz.zzb((zzpf) zzpjVar);
                return zzb4;
            }
        }, zzb2, zzpf.class);
        zze = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzka
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzjz.zza(r1).a_(), zzvq.zzb.ASYMMETRIC_PUBLIC, zzjz.zzi.zza((zzmm<zzws, zzju.zze>) r1.zzb().zzf()), ((zzke) zzbpVar).zza());
                return zza2;
            }
        }, zzke.class, zzpc.class);
        zzf = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzke zzd2;
                zzd2 = zzjz.zzd((zzpc) zzpjVar, zzcnVar);
                return zzd2;
            }
        }, zzb3, zzpc.class);
        zzg = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((zzvk) ((zzajy) zzvk.zzb().zza(0).zza(zzjz.zza((zzke) ((zzkr) r1.zzb()))).zza(zzaip.zza(r1.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.ASYMMETRIC_PRIVATE, zzjz.zzi.zza((zzmm<zzws, zzju.zze>) r1.zzc().zzf()), ((zzjw) zzbpVar).zza());
                return zza2;
            }
        }, zzjw.class, zzpc.class);
        zzh = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzjw zzc2;
                zzc2 = zzjz.zzc((zzpc) zzpjVar, zzcnVar);
                return zzc2;
            }
        }, zzb2, zzpc.class);
        zzmp zza2 = zzmm.zza().zza(zzws.RAW, zzju.zze.zzc).zza(zzws.TINK, zzju.zze.zza);
        zzws zzwsVar = zzws.LEGACY;
        zzju.zze zzeVar = zzju.zze.zzb;
        zzi = zza2.zza(zzwsVar, zzeVar).zza(zzws.CRUNCHY, zzeVar).zza();
        zzj = zzmm.zza().zza(zzvf.DHKEM_P256_HKDF_SHA256, zzju.zzf.zza).zza(zzvf.DHKEM_P384_HKDF_SHA384, zzju.zzf.zzb).zza(zzvf.DHKEM_P521_HKDF_SHA512, zzju.zzf.zzc).zza(zzvf.DHKEM_X25519_HKDF_SHA256, zzju.zzf.zzd).zza();
        zzk = zzmm.zza().zza(zzvc.HKDF_SHA256, zzju.zzc.zza).zza(zzvc.HKDF_SHA384, zzju.zzc.zzb).zza(zzvc.HKDF_SHA512, zzju.zzc.zzc).zza();
        zzl = zzmm.zza().zza(zzvd.AES_128_GCM, zzju.zzb.zza).zza(zzvd.AES_256_GCM, zzju.zzb.zzb).zza(zzvd.CHACHA20_POLY1305, zzju.zzb.zzc).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjw zzc(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException(L.i("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", zzpcVar.zzf()));
        }
        try {
            zzvk zza2 = zzvk.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzvn zzd2 = zza2.zzd();
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzju zza3 = zza(zzpcVar.zzb(), zzd2.zzb());
            return zzjw.zza(zzke.zza(zza3, zza(zza3.zze(), zzd2.zzf().zzd()), zzpcVar.zze()), zzze.zza(zzmj.zza(zzmj.zza(zza2.zze().zzd()), zzlq.zza(zza3.zze())), zzcn.zza(zzcnVar)));
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzke zzd(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            throw new IllegalArgumentException(L.i("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", zzpcVar.zzf()));
        }
        try {
            zzvn zza2 = zzvn.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzju zza3 = zza(zzpcVar.zzb(), zza2.zzb());
            return zzke.zza(zza3, zza(zza3.zze(), zza2.zzf().zzd()), zzpcVar.zze());
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzju zzb(zzpf zzpfVar) {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException(L.i("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
        }
        try {
            return zza(zzpfVar.zza().zzd(), zzve.zza(zzpfVar.zza().zze(), zzajk.zza()).zzc());
        } catch (zzakf e7) {
            throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e7);
        }
    }

    private static zzju zza(zzws zzwsVar, zzvh zzvhVar) {
        return zzju.zzc().zza(zzi.zza((zzmm<zzws, zzju.zze>) zzwsVar)).zza(zzj.zza((zzmm<zzvf, zzju.zzf>) zzvhVar.zzc())).zza(zzk.zza((zzmm<zzvc, zzju.zzc>) zzvhVar.zzb())).zza(zzl.zza((zzmm<zzvd, zzju.zzb>) zzvhVar.zza())).zza();
    }

    private static zzvh zzb(zzju zzjuVar) {
        return (zzvh) ((zzajy) zzvh.zzd().zza(zzj.zza((zzmm<zzvf, zzju.zzf>) zzjuVar.zze())).zza(zzk.zza((zzmm<zzvc, zzju.zzc>) zzjuVar.zzd())).zza(zzl.zza((zzmm<zzvd, zzju.zzb>) zzjuVar.zzb())).zze());
    }

    private static zzvn zza(zzke zzkeVar) {
        return (zzvn) ((zzajy) zzvn.zzc().zza(0).zza(zzb(zzkeVar.zzb())).zza(zzaip.zza(zzkeVar.zzd().zzb())).zze());
    }

    private static zzzc zza(zzju.zzf zzfVar, byte[] bArr) {
        return zzzc.zza(zzmj.zza(zzmj.zza(bArr), zzlq.zzb(zzfVar)));
    }

    public static void zza() {
        zzof zza2 = zzof.zza();
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
        zza2.zza(zzh);
    }
}
