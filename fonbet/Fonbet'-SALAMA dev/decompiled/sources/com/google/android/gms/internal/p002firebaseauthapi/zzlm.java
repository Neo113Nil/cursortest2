package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzlm {
    private static final zzor<zzjw, zzbo> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlp
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzlj.zza((zzjw) zzbpVar);
        }
    }, zzjw.class, zzbo.class);
    private static final zzor<zzke, zzbn> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzli.zza((zzke) zzbpVar);
        }
    }, zzke.class, zzbn.class);
    private static final zzcj<zzbo> zzc = zzna.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", zzbo.class, zzvk.zzf());
    private static final zzbs<zzbn> zzd = zzna.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzbn.class, zzvq.zzb.ASYMMETRIC_PUBLIC, zzvn.d_());
    private static final zznx<zzju> zze = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzlm.zza((zzju) zzchVar, num);
        }
    };

    public static /* synthetic */ zzjw zza(zzju zzjuVar, Integer num) {
        byte[] bArr;
        zzzc zza2;
        zzze zza3;
        if (zzjuVar.zze().equals(zzju.zzf.zzd)) {
            byte[] zza4 = zzpe.zza(32);
            zza4[0] = (byte) (zza4[0] | 7);
            byte b7 = (byte) (zza4[31] & 63);
            zza4[31] = b7;
            zza4[31] = (byte) (b7 | 128);
            zza3 = zzze.zza(zza4, zzbq.zza());
            zza2 = zzzc.zza(zzza.zza(zza4));
        } else {
            if (!zzjuVar.zze().equals(zzju.zzf.zza) && !zzjuVar.zze().equals(zzju.zzf.zzb) && !zzjuVar.zze().equals(zzju.zzf.zzc)) {
                throw new GeneralSecurityException("Unknown KEM ID");
            }
            zzya zzc2 = zzlq.zzc(zzjuVar.zze());
            KeyPair zza5 = zzyb.zza(zzyb.zza(zzc2));
            zzyd zzydVar = zzyd.UNCOMPRESSED;
            ECPoint w7 = ((ECPublicKey) zza5.getPublic()).getW();
            EllipticCurve curve = zzyb.zza(zzc2).getCurve();
            zzmk.zza(w7, curve);
            int zza6 = zzyb.zza(curve);
            int ordinal = zzydVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    int i7 = zza6 + 1;
                    bArr = new byte[i7];
                    byte[] zza7 = zzmj.zza(w7.getAffineX());
                    System.arraycopy(zza7, 0, bArr, i7 - zza7.length, zza7.length);
                    bArr[0] = (byte) (w7.getAffineY().testBit(0) ? 3 : 2);
                } else {
                    if (ordinal != 2) {
                        throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zzydVar)));
                    }
                    int i8 = zza6 * 2;
                    bArr = new byte[i8];
                    byte[] zza8 = zzmj.zza(w7.getAffineX());
                    if (zza8.length > zza6) {
                        zza8 = Arrays.copyOfRange(zza8, zza8.length - zza6, zza8.length);
                    }
                    byte[] zza9 = zzmj.zza(w7.getAffineY());
                    if (zza9.length > zza6) {
                        zza9 = Arrays.copyOfRange(zza9, zza9.length - zza6, zza9.length);
                    }
                    System.arraycopy(zza9, 0, bArr, i8 - zza9.length, zza9.length);
                    System.arraycopy(zza8, 0, bArr, zza6 - zza8.length, zza8.length);
                }
            } else {
                int i9 = (zza6 * 2) + 1;
                bArr = new byte[i9];
                byte[] zza10 = zzmj.zza(w7.getAffineX());
                byte[] zza11 = zzmj.zza(w7.getAffineY());
                System.arraycopy(zza11, 0, bArr, i9 - zza11.length, zza11.length);
                System.arraycopy(zza10, 0, bArr, (zza6 + 1) - zza10.length, zza10.length);
                bArr[0] = 4;
            }
            zza2 = zzzc.zza(bArr);
            zza3 = zzze.zza(zzmj.zza(((ECPrivateKey) zza5.getPrivate()).getS(), zzlq.zza(zzjuVar.zze())), zzbq.zza());
        }
        return zzjw.zza(zzke.zza(zzjuVar, zza2, num), zza3);
    }

    public static void zza(boolean z4) {
        if (zzil.zza.zza.zza()) {
            zzjz.zza();
            zzod zza2 = zzod.zza();
            HashMap hashMap = new HashMap();
            zzju.zzd zzc2 = zzju.zzc();
            zzju.zze zzeVar = zzju.zze.zza;
            zzju.zzd zza3 = zzc2.zza(zzeVar);
            zzju.zzf zzfVar = zzju.zzf.zzd;
            zzju.zzd zza4 = zza3.zza(zzfVar);
            zzju.zzc zzcVar = zzju.zzc.zza;
            zzju.zzd zza5 = zza4.zza(zzcVar);
            zzju.zzb zzbVar = zzju.zzb.zza;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza5.zza(zzbVar).zza());
            zzju.zzd zzc3 = zzju.zzc();
            zzju.zze zzeVar2 = zzju.zze.zzc;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzc3.zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar).zza());
            zzju.zzd zza6 = zzju.zzc().zza(zzeVar).zza(zzfVar).zza(zzcVar);
            zzju.zzb zzbVar2 = zzju.zzb.zzb;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zza6.zza(zzbVar2).zza());
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar2).zza());
            zzju.zzd zza7 = zzju.zzc().zza(zzeVar).zza(zzfVar).zza(zzcVar);
            zzju.zzb zzbVar3 = zzju.zzb.zzc;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zza7.zza(zzbVar3).zza());
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar3).zza());
            zzju.zzd zza8 = zzju.zzc().zza(zzeVar);
            zzju.zzf zzfVar2 = zzju.zzf.zza;
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza8.zza(zzfVar2).zza(zzcVar).zza(zzbVar).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar2).zza(zzcVar).zza(zzbVar).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzju.zzc().zza(zzeVar).zza(zzfVar2).zza(zzcVar).zza(zzbVar2).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar2).zza(zzcVar).zza(zzbVar2).zza());
            zzju.zzd zza9 = zzju.zzc().zza(zzeVar);
            zzju.zzf zzfVar3 = zzju.zzf.zzb;
            zzju.zzd zza10 = zza9.zza(zzfVar3);
            zzju.zzc zzcVar2 = zzju.zzc.zzb;
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zza10.zza(zzcVar2).zza(zzbVar).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar3).zza(zzcVar2).zza(zzbVar).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzju.zzc().zza(zzeVar).zza(zzfVar3).zza(zzcVar2).zza(zzbVar2).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar3).zza(zzcVar2).zza(zzbVar2).zza());
            zzju.zzd zza11 = zzju.zzc().zza(zzeVar);
            zzju.zzf zzfVar4 = zzju.zzf.zzc;
            zzju.zzd zza12 = zza11.zza(zzfVar4);
            zzju.zzc zzcVar3 = zzju.zzc.zzc;
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zza12.zza(zzcVar3).zza(zzbVar).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar4).zza(zzcVar3).zza(zzbVar).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzju.zzc().zza(zzeVar).zza(zzfVar4).zza(zzcVar3).zza(zzbVar2).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar4).zza(zzcVar3).zza(zzbVar2).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzoc.zza().zza(zza);
            zzoc.zza().zza(zzb);
            zznv.zza().zza(zze, zzju.class);
            zzmt.zza().zza((zzbs) zzc, true);
            zzmt.zza().zza((zzbs) zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
    }
}
