package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zznv {
    private static final zznx<zzne> zza = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zznu
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zznv.zza((zzne) zzchVar, num);
        }
    };
    private static final zznv zzb = zzb();
    private final Map<Class<? extends zzch>, zznx<? extends zzch>> zzc = new HashMap();

    private final synchronized <ParametersT extends zzch> zzbp zzb(ParametersT parameterst, Integer num) {
        zznx<? extends zzch> zznxVar;
        zznxVar = this.zzc.get(parameterst.getClass());
        if (zznxVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(parameterst) + ": no key creator for this class was registered.");
        }
        return zznxVar.zza(parameterst, num);
    }

    public final zzbp zza(zzch zzchVar, Integer num) {
        return zzb(zzchVar, num);
    }

    public static /* synthetic */ zznc zza(zzne zzneVar, Integer num) {
        zzvu zza2 = zzneVar.zzb().zza();
        zzbs<?> zza3 = zzmt.zza().zza(zza2.zzf());
        if (!zzmt.zza().zzb(zza2.zzf())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzvq zza4 = zza3.zza(zza2.zze());
        return new zznc(zzpc.zza(zza4.zzf(), zza4.zze(), zza4.zzb(), zza2.zzd(), num), zzbq.zza());
    }

    private static zznv zzb() {
        zznv zznvVar = new zznv();
        try {
            zznvVar.zza(zza, zzne.class);
            return zznvVar;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException("unexpected error.", e7);
        }
    }

    public static zznv zza() {
        return zzb;
    }

    public final synchronized <ParametersT extends zzch> void zza(zznx<ParametersT> zznxVar, Class<ParametersT> cls) {
        try {
            zznx<? extends zzch> zznxVar2 = this.zzc.get(cls);
            if (zznxVar2 != null && !zznxVar2.equals(zznxVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.zzc.put(cls, zznxVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
