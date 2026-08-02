package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpj;

/* loaded from: classes.dex */
public abstract class zzoj<SerializationT extends zzpj> {
    private final zzzc zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzpj> zzoj<SerializationT> zza(zzol<SerializationT> zzolVar, zzzc zzzcVar, Class<SerializationT> cls) {
        return new zzoi(zzzcVar, cls, zzolVar);
    }

    public abstract zzch zza(SerializationT serializationt);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzoj(zzzc zzzcVar, Class<SerializationT> cls) {
        this.zza = zzzcVar;
        this.zzb = cls;
    }

    public final zzzc zza() {
        return this.zza;
    }
}
