package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzgmq {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgmq(zzgmn zzgmnVar, zzgmp zzgmpVar) {
        this.zza = new HashMap(zzgmnVar.zza);
        this.zzb = new HashMap(zzgmnVar.zzb);
    }

    public static zzgmn zza() {
        return new zzgmn(null);
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgmv) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(AbstractC0486a1.h("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzc(zzgcs zzgcsVar, Class cls) throws GeneralSecurityException {
        zzgmo zzgmoVar = new zzgmo(zzgcsVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgmoVar)) {
            return ((zzgmm) this.zza.get(zzgmoVar)).zza(zzgcsVar);
        }
        throw new GeneralSecurityException(AbstractC0486a1.h("No PrimitiveConstructor for ", zzgmoVar.toString(), " available"));
    }

    public final Object zzd(zzgmu zzgmuVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzgmv zzgmvVar = (zzgmv) this.zzb.get(cls);
        if (zzgmuVar.zzd().equals(zzgmvVar.zza()) && zzgmvVar.zza().equals(zzgmuVar.zzd())) {
            return zzgmvVar.zzc(zzgmuVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
