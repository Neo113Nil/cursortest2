package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzmp<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public final zzmp<E, O> zza(E e7, O o7) {
        this.zza.put(e7, o7);
        this.zzb.put(o7, e7);
        return this;
    }

    private zzmp() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmm<E, O> zza() {
        return new zzmm<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }
}
