package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzei;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzeh {
    private static final zzor<zzee, zzbg> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeg
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzeh.zza((zzee) zzbpVar);
        }
    }, zzee.class, zzbg.class);
    private static final zznx<zzei> zzb = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzej
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzeh.zza((zzei) zzchVar, num);
        }
    };
    private static final zzbs<zzbg> zzc = zzna.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzbg.class, zzvq.zzb.SYMMETRIC, zzto.zze());

    public static /* synthetic */ zzbg zza(zzee zzeeVar) {
        return zzhc.zzb() ? zzhc.zza(zzeeVar) : zzxu.zza(zzeeVar);
    }

    public static zzee zza(zzei zzeiVar, Integer num) {
        return zzee.zza(zzeiVar.zzb(), zzze.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static void zza(boolean z4) {
        if (zzil.zza.zza.zza()) {
            zzhe.zza();
            zzoc.zza().zza(zza);
            zznv.zza().zza(zzb, zzei.class);
            zzod zza2 = zzod.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", zzei.zza(zzei.zza.zza));
            hashMap.put("CHACHA20_POLY1305_RAW", zzei.zza(zzei.zza.zzc));
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzmt.zza().zza((zzbs) zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
