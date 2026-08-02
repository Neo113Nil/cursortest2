package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzepp implements zzesh {
    private final zzgbn zza;
    private final zzfba zzb;

    public zzepp(zzgbn zzgbnVar, zzfba zzfbaVar) {
        this.zza = zzgbnVar;
        this.zzb = zzfbaVar;
    }

    public static /* synthetic */ zzepq zzc(zzepp zzeppVar) {
        return new zzepq("requester_type_2".equals(Q0.a.k0(zzeppVar.zzb.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepp.zzc(zzepp.this);
            }
        });
    }
}
