package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpj;

/* loaded from: classes.dex */
public abstract class zzms<SerializationT extends zzpj> {
    private final zzzc zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzpj> zzms<SerializationT> zza(zzmu<SerializationT> zzmuVar, zzzc zzzcVar, Class<SerializationT> cls) {
        return new zzmv(zzzcVar, cls, zzmuVar);
    }

    public abstract zzbp zza(SerializationT serializationt, zzcn zzcnVar);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzms(zzzc zzzcVar, Class<SerializationT> cls) {
        this.zza = zzzcVar;
        this.zzb = cls;
    }

    public final zzzc zza() {
        return this.zza;
    }
}
