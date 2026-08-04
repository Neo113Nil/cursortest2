package com.google.android.gms.internal.ads;

import E2.o;
import I2.C0306n;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzeph implements zzesh {
    private final zzgbn zza;

    public zzeph(zzgbn zzgbnVar) {
        this.zza = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                o oVar = o.f1952C;
                C0306n c0306n = oVar.f1967n;
                synchronized (c0306n.f3636f) {
                    str = c0306n.f3632b;
                }
                return new zzepi(str, oVar.f1967n.h());
            }
        });
    }
}
