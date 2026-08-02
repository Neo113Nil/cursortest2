package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzek {
    private static final zzor<zzes, zzbg> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzem
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            zzbg zza2;
            zza2 = zzhr.zza(zzcg.zza(r1.zzb().zzc()).zza(r1.zzb().zzc()), ((zzes) zzbpVar).zzc());
            return zza2;
        }
    }, zzes.class, zzbg.class);
    private static final zzbs<zzbg> zzb = zzna.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzbg.class, zzvq.zzb.REMOTE, zzwg.zze());
    private static final zznx<zzer> zzc = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzel
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            zzes zza2;
            zza2 = zzes.zza((zzer) zzchVar, num);
            return zza2;
        }
    };

    public static void zza(boolean z4) {
        if (zzil.zza.zza.zza()) {
            zzet.zza();
            zzoc.zza().zza(zza);
            zznv.zza().zza(zzc, zzer.class);
            zzmt.zza().zza((zzbs) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
