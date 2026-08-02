package com.google.android.gms.internal.p002firebaseauthapi;

import android.support.v4.media.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzrh;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import defpackage.g;
import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public final class zzsj {
    private static final zzaaj zza;
    private static final zznl<zzxz, zzrh.zzc> zzb;
    private static final zznl<zzvy, zzrh.zza> zzc;
    private static final zzph<zzrh, zzqe> zzd;
    private static final zzpd<zzqe> zze;
    private static final zznx<zzra, zzqb> zzf;
    private static final zznt<zzqb> zzg;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzb2;
        zzb = zznl.zza().zza(zzxz.RAW, zzrh.zzc.zzd).zza(zzxz.TINK, zzrh.zzc.zza).zza(zzxz.LEGACY, zzrh.zzc.zzc).zza(zzxz.CRUNCHY, zzrh.zzc.zzb).zza();
        zzc = zznl.zza().zza(zzvy.SHA1, zzrh.zza.zza).zza(zzvy.SHA224, zzrh.zza.zzb).zza(zzvy.SHA256, zzrh.zza.zzc).zza(zzvy.SHA384, zzrh.zza.zzd).zza(zzvy.SHA512, zzrh.zza.zze).zza();
        zzd = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzqe zzb3;
                zzb3 = zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.HmacKey").zza(((zzwe) ((zzalf) zzwe.zzc().zza(zzsj.zzb(r1)).zza(r1.zzc()).zze())).zzj()).zza(zzsj.zzb.zza((zznl<zzxz, zzrh.zzc>) ((zzrh) zzcbVar).zzf())).zze()));
                return zzb3;
            }
        }, zzrh.class, zzqe.class);
        zze = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                zzrh zzb3;
                zzb3 = zzsj.zzb((zzqe) zzqfVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
        zzf = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzqb zza2;
                zza2 = zzqb.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzwb) ((zzalf) zzwb.zzb().zza(zzsj.zzb((zzrh) ((zzrn) r1.zza()))).zza(zzajv.zza(r1.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzsj.zzb.zza((zznl<zzxz, zzrh.zzc>) ((zzrh) ((zzrn) r1.zza())).zzf()), ((zzra) zzbiVar).zzb());
                return zza2;
            }
        }, zzra.class, zzqb.class);
        zzg = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzra zzb3;
                zzb3 = zzsj.zzb((zzqb) zzqfVar, zzchVar);
                return zzb3;
            }
        }, zzb2, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzra zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzwb zza2 = zzwb.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzra.zzc().zza(zzrh.zzd().zza(zza2.zzf().zzb()).zzb(zza2.zze().zza()).zza(zzc.zza((zznl<zzvy, zzrh.zza>) zza2.zze().zzb())).zza(zzb.zza((zznl<zzxz, zzrh.zzc>) zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zzf().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzrh zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzwe zza2 = zzwe.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zza2.zzb() == 0) {
                    return zzrh.zzd().zza(zza2.zza()).zzb(zza2.zzf().zza()).zza(zzc.zza((zznl<zzvy, zzrh.zza>) zza2.zzf().zzb())).zza(zzb.zza((zznl<zzxz, zzrh.zzc>) zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException(a.a(zza2.zzb(), "Parsing HmacParameters failed: unknown Version "));
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException(g.a("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", zzqeVar.zza().zzf()));
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
    }

    private static zzwh zzb(zzrh zzrhVar) throws GeneralSecurityException {
        return (zzwh) ((zzalf) zzwh.zzc().zza(zzrhVar.zzb()).zza(zzc.zza((zznl<zzvy, zzrh.zza>) zzrhVar.zze())).zze());
    }
}
