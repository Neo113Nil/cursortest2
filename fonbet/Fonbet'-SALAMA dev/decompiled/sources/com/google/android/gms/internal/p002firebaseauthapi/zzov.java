package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzov {
    private final Map<zzox, zzor<?, ?>> zza;
    private final Map<Class<?>, zzpd<?, ?>> zzb;

    public static zzou zza(zzov zzovVar) {
        return new zzou(zzovVar);
    }

    private zzov(zzou zzouVar) {
        this.zza = new HashMap(zzouVar.zza);
        this.zzb = new HashMap(zzouVar.zzb);
    }

    public final Class<?> zza(Class<?> cls) {
        if (this.zzb.containsKey(cls)) {
            return this.zzb.get(cls).zza();
        }
        throw new GeneralSecurityException(AbstractC0486a1.h("No input primitive class for ", String.valueOf(cls), " available"));
    }

    public final <KeyT extends zzbp, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        zzox zzoxVar = new zzox(keyt.getClass(), cls);
        if (this.zza.containsKey(zzoxVar)) {
            return (PrimitiveT) this.zza.get(zzoxVar).zza(keyt);
        }
        throw new GeneralSecurityException(AbstractC0486a1.h("No PrimitiveConstructor for ", String.valueOf(zzoxVar), " available"));
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzoz<InputPrimitiveT> zzozVar, Class<WrapperPrimitiveT> cls) {
        if (this.zzb.containsKey(cls)) {
            zzpd<?, ?> zzpdVar = this.zzb.get(cls);
            if (zzozVar.zzc().equals(zzpdVar.zza()) && zzpdVar.zza().equals(zzozVar.zzc())) {
                return (WrapperPrimitiveT) zzpdVar.zza(zzozVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls)));
    }
}
