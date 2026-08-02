package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzbp;

/* loaded from: classes.dex */
public abstract class zzor<KeyT extends zzbp, PrimitiveT> {
    private final Class<KeyT> zza;
    private final Class<PrimitiveT> zzb;

    public static <KeyT extends zzbp, PrimitiveT> zzor<KeyT, PrimitiveT> zza(zzot<KeyT, PrimitiveT> zzotVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new zzoq(cls, cls2, zzotVar);
    }

    public abstract PrimitiveT zza(KeyT keyt);

    public final Class<PrimitiveT> zzb() {
        return this.zzb;
    }

    private zzor(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }
}
