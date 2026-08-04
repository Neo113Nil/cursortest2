package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzgkw {
    private HashMap zza = new HashMap();

    public final zzgky zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgky zzgkyVar = new zzgky(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgkyVar;
    }
}
