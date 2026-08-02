package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
abstract class zzhec implements zzheg {
    private final Map zza;

    public zzhec(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    public final Map zza() {
        return this.zza;
    }
}
