package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzgkb {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgkb() {
    }

    public final zzgkb zza(Enum r7, Object obj) {
        this.zza.put(r7, obj);
        this.zzb.put(obj, r7);
        return this;
    }

    public final zzgkd zzb() {
        return new zzgkd(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzgkb(zzgkc zzgkcVar) {
    }
}
