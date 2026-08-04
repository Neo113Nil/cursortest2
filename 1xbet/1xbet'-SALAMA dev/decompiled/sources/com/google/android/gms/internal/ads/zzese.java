package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzese implements zzesh {
    private final zzgbn zza;
    private final Context zzb;

    public zzese(zzgbn zzgbnVar, Context context) {
        this.zza = zzgbnVar;
        this.zzb = context;
    }

    public static zzesd zzc(zzese zzeseVar) {
        return new zzesd(Q0.a.g0(zzeseVar.zzb, (String) C0254t.f2723d.f2726c.zzb(zzbby.zzgc)));
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzese.zzc(this.zza);
            }
        });
    }
}
