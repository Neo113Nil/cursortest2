package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzou {
    private final Map<zzox, zzor<?, ?>> zza;
    private final Map<Class<?>, zzpd<?, ?>> zzb;

    public final <KeyT extends zzbp, PrimitiveT> zzou zza(zzor<KeyT, PrimitiveT> zzorVar) {
        if (zzorVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzox zzoxVar = new zzox(zzorVar.zza(), zzorVar.zzb());
        if (this.zza.containsKey(zzoxVar)) {
            zzor<?, ?> zzorVar2 = this.zza.get(zzoxVar);
            if (!zzorVar2.equals(zzorVar) || !zzorVar.equals(zzorVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(zzoxVar)));
            }
        } else {
            this.zza.put(zzoxVar, zzorVar);
        }
        return this;
    }

    private zzou() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzou(zzov zzovVar) {
        Map map;
        Map map2;
        map = zzovVar.zza;
        this.zza = new HashMap(map);
        map2 = zzovVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzou zza(zzpd<InputPrimitiveT, WrapperPrimitiveT> zzpdVar) {
        if (zzpdVar != null) {
            Class<WrapperPrimitiveT> zzb = zzpdVar.zzb();
            if (this.zzb.containsKey(zzb)) {
                zzpd<?, ?> zzpdVar2 = this.zzb.get(zzb);
                if (!zzpdVar2.equals(zzpdVar) || !zzpdVar.equals(zzpdVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(zzb)));
                }
            } else {
                this.zzb.put(zzb, zzpdVar);
            }
            return this;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    public final zzov zza() {
        return new zzov(this);
    }
}
