package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import com.google.android.gms.internal.p002firebaseauthapi.zzug;
import com.google.android.gms.internal.p002firebaseauthapi.zzum;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import w1.L;

/* loaded from: classes.dex */
public final class zzkz {
    private static final zzzc zza;
    private static final zzzc zzb;
    private static final zzon<zzjp, zzpf> zzc;
    private static final zzoj<zzpf> zzd;
    private static final zzmw<zzjv, zzpc> zze;
    private static final zzms<zzpc> zzf;
    private static final zzmw<zzjs, zzpc> zzg;
    private static final zzms<zzpc> zzh;
    private static final zzmm<zzws, zzjp.zzd> zzi;
    private static final zzmm<zzur, zzjp.zzb> zzj;
    private static final zzmm<zzup, zzjp.zzc> zzk;
    private static final zzmm<zztu, zzjp.zze> zzl;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzb2;
        zzzc zzb3 = zzpr.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzb3;
        zzc = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzky
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb4;
                zzb4 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zza(((zzua) ((zzajy) zzua.zza().zza(zzkz.zzb(r1)).zze())).a_()).zza(zzkz.zzi.zza((zzmm<zzws, zzjp.zzd>) ((zzjp) zzchVar).zzg())).zze()));
                return zzb4;
            }
        }, zzjp.class, zzpf.class);
        zzd = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzjp zzb4;
                zzb4 = zzkz.zzb((zzpf) zzpjVar);
                return zzb4;
            }
        }, zzb2, zzpf.class);
        zze = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzla
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzkz.zza(r1).a_(), zzvq.zzb.ASYMMETRIC_PUBLIC, zzkz.zzi.zza((zzmm<zzws, zzjp.zzd>) r1.zzb().zzg()), ((zzjv) zzbpVar).zza());
                return zza2;
            }
        }, zzjv.class, zzpc.class);
        zzf = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzld
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzjv zzd2;
                zzd2 = zzkz.zzd((zzpc) zzpjVar, zzcnVar);
                return zzd2;
            }
        }, zzb3, zzpc.class);
        zzg = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                return zzkz.zza((zzjs) zzbpVar, zzcnVar);
            }
        }, zzjs.class, zzpc.class);
        zzh = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzjs zzc2;
                zzc2 = zzkz.zzc((zzpc) zzpjVar, zzcnVar);
                return zzc2;
            }
        }, zzb2, zzpc.class);
        zzmp zza2 = zzmm.zza().zza(zzws.RAW, zzjp.zzd.zzc).zza(zzws.TINK, zzjp.zzd.zza);
        zzws zzwsVar = zzws.LEGACY;
        zzjp.zzd zzdVar = zzjp.zzd.zzb;
        zzi = zza2.zza(zzwsVar, zzdVar).zza(zzws.CRUNCHY, zzdVar).zza();
        zzj = zzmm.zza().zza(zzur.SHA1, zzjp.zzb.zza).zza(zzur.SHA224, zzjp.zzb.zzb).zza(zzur.SHA256, zzjp.zzb.zzc).zza(zzur.SHA384, zzjp.zzb.zzd).zza(zzur.SHA512, zzjp.zzb.zze).zza();
        zzk = zzmm.zza().zza(zzup.NIST_P256, zzjp.zzc.zza).zza(zzup.NIST_P384, zzjp.zzc.zzb).zza(zzup.NIST_P521, zzjp.zzc.zzc).zza(zzup.CURVE25519, zzjp.zzc.zzd).zza();
        zzl = zzmm.zza().zza(zztu.UNCOMPRESSED, zzjp.zze.zzb).zza(zztu.COMPRESSED, zzjp.zze.zza).zza(zztu.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzjp.zze.zzc).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjs zzc(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException(L.i("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", zzpcVar.zzf()));
        }
        try {
            zzug zza2 = zzug.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzuj zzd2 = zza2.zzd();
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjp zza3 = zza(zzpcVar.zzb(), zzd2.zzb());
            return zza3.zzd().equals(zzjp.zzc.zzd) ? zzjs.zza(zzjv.zza(zza3, zzzc.zza(zzd2.zzf().zzd()), zzpcVar.zze()), zzze.zza(zza2.zze().zzd(), zzcn.zza(zzcnVar))) : zzjs.zza(zzjv.zza(zza3, new ECPoint(zzmj.zza(zzd2.zzf().zzd()), zzmj.zza(zzd2.b_().zzd())), zzpcVar.zze()), zzzf.zza(zzmj.zza(zza2.zze().zzd()), zzcn.zza(zzcnVar)));
        } catch (zzakf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjv zzd(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException(L.i("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", zzpcVar.zzf()));
        }
        try {
            zzuj zza2 = zzuj.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjp zza3 = zza(zzpcVar.zzb(), zza2.zzb());
            if (!zza3.zzd().equals(zzjp.zzc.zzd)) {
                return zzjv.zza(zza3, new ECPoint(zzmj.zza(zza2.zzf().zzd()), zzmj.zza(zza2.b_().zzd())), zzpcVar.zze());
            }
            if (zza2.b_().zzb() == 0) {
                return zzjv.zza(zza3, zzzc.zza(zza2.zzf().zzd()), zzpcVar.zze());
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (zzakf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjp zzb(zzpf zzpfVar) {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException(L.i("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", zzpfVar.zza().zzf()));
        }
        try {
            return zza(zzpfVar.zza().zzd(), zzua.zza(zzpfVar.zza().zze(), zzajk.zza()).zzc());
        } catch (zzakf e7) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e7);
        }
    }

    private static int zza(zzjp.zzc zzcVar) {
        if (zzjp.zzc.zza.equals(zzcVar)) {
            return 33;
        }
        if (zzjp.zzc.zzb.equals(zzcVar)) {
            return 49;
        }
        if (zzjp.zzc.zzc.equals(zzcVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(zzcVar)));
    }

    private static zzjp zza(zzws zzwsVar, zzud zzudVar) {
        zzjp.zza zza2 = zzjp.zzc().zza(zzi.zza((zzmm<zzws, zzjp.zzd>) zzwsVar)).zza(zzk.zza((zzmm<zzup, zzjp.zzc>) zzudVar.zzf().zzd())).zza(zzj.zza((zzmm<zzur, zzjp.zzb>) zzudVar.zzf().zze())).zza(zzcp.zza(((zzvu) ((zzajy) zzvu.zza().zza(zzudVar.zzb().zzd().zzf()).zza(zzws.RAW).zza(zzudVar.zzb().zzd().zze()).zze())).zzk())).zza(zzzc.zza(zzudVar.zzf().zzf().zzd()));
        if (!zzudVar.zzf().zzd().equals(zzup.CURVE25519)) {
            zza2.zza(zzl.zza((zzmm<zztu, zzjp.zze>) zzudVar.zza()));
        } else if (!zzudVar.zza().equals(zztu.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zza2.zza();
    }

    private static zzud zzb(zzjp zzjpVar) {
        zzum.zza zza2 = zzum.zza().zza(zzk.zza((zzmm<zzup, zzjp.zzc>) zzjpVar.zzd())).zza(zzj.zza((zzmm<zzur, zzjp.zzb>) zzjpVar.zze()));
        if (zzjpVar.zzh() != null && zzjpVar.zzh().zza() > 0) {
            zza2.zza(zzaip.zza(zzjpVar.zzh().zzb()));
        }
        zzum zzumVar = (zzum) ((zzajy) zza2.zze());
        try {
            zzvu zza3 = zzvu.zza(zzcp.zza(zzjpVar.zzb()), zzajk.zza());
            zztx zztxVar = (zztx) ((zzajy) zztx.zza().zza((zzvu) ((zzajy) zzvu.zza().zza(zza3.zzf()).zza(zzws.TINK).zza(zza3.zze()).zze())).zze());
            zzjp.zze zzf2 = zzjpVar.zzf();
            if (zzf2 == null) {
                zzf2 = zzjp.zze.zza;
            }
            return (zzud) ((zzajy) zzud.zzc().zza(zzumVar).zza(zztxVar).zza(zzl.zza((zzmm<zztu, zzjp.zze>) zzf2)).zze());
        } catch (zzakf e7) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzpc zza(zzjs zzjsVar, zzcn zzcnVar) {
        zzug.zza zza2 = zzug.zzb().zza(0).zza(zza((zzjv) ((zzkr) zzjsVar.zzb())));
        if (zzjsVar.zzc().zzd().equals(zzjp.zzc.zzd)) {
            zza2.zza(zzaip.zza(zzjsVar.zzf().zza(zzcn.zza(zzcnVar))));
        } else {
            zza2.zza(zzaip.zza(zzmj.zza(zzjsVar.zze().zza(zzcn.zza(zzcnVar)), zza(zzjsVar.zzc().zzd()))));
        }
        return zzpc.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzug) ((zzajy) zza2.zze())).a_(), zzvq.zzb.ASYMMETRIC_PRIVATE, zzi.zza((zzmm<zzws, zzjp.zzd>) zzjsVar.zzc().zzg()), zzjsVar.zza());
    }

    private static zzuj zza(zzjv zzjvVar) {
        if (zzjvVar.zzb().zzd().equals(zzjp.zzc.zzd)) {
            return (zzuj) ((zzajy) zzuj.zzc().zza(0).zza(zzb(zzjvVar.zzb())).zza(zzaip.zza(zzjvVar.zzd().zzb())).zzb(zzaip.zza).zze());
        }
        int zza2 = zza(zzjvVar.zzb().zzd());
        ECPoint zze2 = zzjvVar.zze();
        if (zze2 != null) {
            return (zzuj) ((zzajy) zzuj.zzc().zza(0).zza(zzb(zzjvVar.zzb())).zza(zzaip.zza(zzmj.zza(zze2.getAffineX(), zza2))).zzb(zzaip.zza(zzmj.zza(zze2.getAffineY(), zza2))).zze());
        }
        throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
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
