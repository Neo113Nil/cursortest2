package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzec;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class zzdy {
    private static final zzor<zzdx, zzbg> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeb
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzik.zza((zzdx) zzbpVar);
        }
    }, zzdx.class, zzbg.class);
    private static final zznx<zzec> zzb = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzea
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            zzdx zza2;
            zza2 = zzdx.zzb().zza(r1).zza(num).zza(zzze.zza(((zzec) zzchVar).zzb())).zza();
            return zza2;
        }
    };
    private static final zznz<zzec> zzc = new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzed
    };
    private static final zzbs<zzbg> zzd = zzna.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzbg.class, zzvq.zzb.SYMMETRIC, zztc.zze());

    public static void zza(boolean z4) {
        if (zzil.zza.zza.zza()) {
            zzgw.zza();
            if (zza()) {
                zzoc.zza().zza(zza);
                zzod zza2 = zzod.zza();
                HashMap hashMap = new HashMap();
                zzec.zzb zza3 = zzec.zzc().zza(16);
                zzec.zza zzaVar = zzec.zza.zza;
                hashMap.put("AES128_GCM_SIV", zza3.zza(zzaVar).zza());
                zzec.zzb zza4 = zzec.zzc().zza(16);
                zzec.zza zzaVar2 = zzec.zza.zzc;
                hashMap.put("AES128_GCM_SIV_RAW", zza4.zza(zzaVar2).zza());
                hashMap.put("AES256_GCM_SIV", zzec.zzc().zza(32).zza(zzaVar).zza());
                hashMap.put("AES256_GCM_SIV_RAW", zzec.zzc().zza(32).zza(zzaVar2).zza());
                zza2.zza(Collections.unmodifiableMap(hashMap));
                zznw.zza().zza(zzc, zzec.class);
                zznv.zza().zza(zzb, zzec.class);
                zzmt.zza().zza((zzbs) zzd, true);
                return;
            }
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
    }

    private static boolean zza() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
