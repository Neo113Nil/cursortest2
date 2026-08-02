package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzels implements zzesh {
    private final Executor zza;
    private final zzbyq zzb;

    public zzels(Executor executor, zzbyq zzbyqVar) {
        this.zza = executor;
        this.zzb = zzbyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdb)).booleanValue() ? zzgbc.zzh(new zzelt(null)) : zzgbc.zzm(this.zzb.zzk(), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzelr
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new zzelt(arrayList);
            }
        }, this.zza);
    }
}
