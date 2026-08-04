package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzajk {
    static final zzajk zza = new zzajk(true);
    private static volatile boolean zzb = false;
    private final Map<zzajn, zzajy.zzd<?, ?>> zzc;

    public zzajk() {
        this.zzc = new HashMap();
    }

    public static zzajk zza() {
        return zza;
    }

    public final <ContainingType extends zzalc> zzajy.zzd<ContainingType, ?> zza(ContainingType containingtype, int i7) {
        return (zzajy.zzd) this.zzc.get(new zzajn(containingtype, i7));
    }

    private zzajk(boolean z4) {
        this.zzc = Collections.emptyMap();
    }
}
