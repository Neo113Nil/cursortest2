package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzeuh implements zzesh {
    final zzgbn zza;
    final List zzb;

    public zzeuh(zzbbh zzbbhVar, zzgbn zzgbnVar, List list) {
        this.zza = zzgbnVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeug
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeui(this.zza.zzb);
            }
        });
    }
}
