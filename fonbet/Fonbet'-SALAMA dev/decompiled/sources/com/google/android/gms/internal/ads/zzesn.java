package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzesn implements zzesh {
    private final Context zza;
    private final zzgbn zzb;

    public zzesn(Context context, zzgbn zzgbnVar) {
        this.zza = context;
        this.zzb = zzgbnVar;
    }

    public static /* synthetic */ zzeso zzc(zzesn zzesnVar) {
        Context context = zzesnVar.zza;
        return new zzeso(zzbbi.zzb(context), zzbbi.zza(context));
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return ((Boolean) zzbdq.zzb.zze()).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesn.zzc(zzesn.this);
            }
        }) : zzgbc.zzh(new zzeso(-1, -1));
    }
}
