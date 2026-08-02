package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzetv implements zzesh {
    final zzgbn zza;

    public zzetv(zzbal zzbalVar, zzgbn zzgbnVar, Context context) {
        this.zza = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzetu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzetw(new JSONObject());
            }
        });
    }
}
