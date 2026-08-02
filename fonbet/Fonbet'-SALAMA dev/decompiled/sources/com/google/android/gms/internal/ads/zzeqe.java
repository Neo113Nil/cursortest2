package com.google.android.gms.internal.ads;

import E2.o;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqe implements zzesh {
    private final zzgbn zza;

    public zzeqe(zzgbn zzgbnVar) {
        this.zza = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", o.f1952C.f1961g.zzb());
                return new zzeqf(bundle);
            }
        });
    }
}
