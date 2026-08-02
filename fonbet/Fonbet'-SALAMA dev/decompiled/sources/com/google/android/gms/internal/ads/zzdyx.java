package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzdyx {
    private final zzdyt zza;
    private final zzgbn zzb;

    public zzdyx(zzdyt zzdytVar, zzgbn zzgbnVar) {
        this.zza = zzdytVar;
        this.zzb = zzgbnVar;
    }

    public final void zza(zzfei zzfeiVar) {
        final zzdyt zzdytVar = this.zza;
        Objects.requireNonNull(zzdytVar);
        zzgbc.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdyt.this.getWritableDatabase();
            }
        }), new zzdyw(this, zzfeiVar), this.zzb);
    }
}
