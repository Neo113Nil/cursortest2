package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzpx;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzpu {
    private static final zznx<zzpx> zza = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpt
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzpu.zza((zzpx) zzchVar, num);
        }
    };
    private static final zzor<zzpq, zzqa> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpw
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzpu.zzb((zzpq) zzbpVar);
        }
    }, zzpq.class, zzqa.class);
    private static final zzor<zzpq, zzci> zzc = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpv
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzpu.zza((zzpq) zzbpVar);
        }
    }, zzpq.class, zzci.class);
    private static final zzbs<zzci> zzd = zzna.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", zzci.class, zzvq.zzb.SYMMETRIC, zzrp.zzf());

    public static /* synthetic */ zzci zza(zzpq zzpqVar) {
        zza(zzpqVar.zzc());
        return zzyz.zza(zzpqVar);
    }

    public static /* synthetic */ zzqa zzb(zzpq zzpqVar) {
        zza(zzpqVar.zzc());
        return new zzrf(zzpqVar);
    }

    public static /* synthetic */ zzpq zza(zzpx zzpxVar, Integer num) {
        zza(zzpxVar);
        return zzpq.zzb().zza(zzpxVar).zza(zzze.zza(zzpxVar.zzc())).zza(num).zza();
    }

    public static void zza(boolean z4) {
        if (zzil.zza.zza.zza()) {
            zzra.zza();
            zznv.zza().zza(zza, zzpx.class);
            zzoc.zza().zza(zzb);
            zzoc.zza().zza(zzc);
            zzod zza2 = zzod.zza();
            HashMap hashMap = new HashMap();
            zzpx zzpxVar = zzqu.zzc;
            hashMap.put("AES_CMAC", zzpxVar);
            hashMap.put("AES256_CMAC", zzpxVar);
            hashMap.put("AES256_CMAC_RAW", zzpx.zzd().zza(32).zzb(16).zza(zzpx.zzb.zzd).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzmt.zza().zza((zzbs) zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    private static void zza(zzpx zzpxVar) {
        if (zzpxVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
