package com.google.android.gms.internal.ads;

import E2.o;
import I2.M;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzenb implements zzesh {
    private final zzgbn zza;

    public zzenb(zzgbn zzgbnVar) {
        this.zza = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzena
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o oVar = o.f1952C;
                oVar.j.getClass();
                return new zzenc(System.currentTimeMillis() - ((M) oVar.f1961g.zzi()).n().zza());
            }
        });
    }
}
