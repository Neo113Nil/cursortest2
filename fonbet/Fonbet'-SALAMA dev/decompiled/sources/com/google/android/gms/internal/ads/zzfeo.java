package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfeo {
    public static final zzfeu zza(Callable callable, Object obj, zzfew zzfewVar) {
        zzgbn zzgbnVar;
        zzgbnVar = zzfewVar.zzb;
        return zzb(callable, zzgbnVar, obj, zzfewVar);
    }

    public static final zzfeu zzb(Callable callable, zzgbn zzgbnVar, Object obj, zzfew zzfewVar) {
        I3.b bVar;
        bVar = zzfew.zza;
        return new zzfeu(zzfewVar, obj, bVar, Collections.emptyList(), zzgbnVar.zzb(callable));
    }

    public static final zzfeu zzc(I3.b bVar, Object obj, zzfew zzfewVar) {
        I3.b bVar2;
        bVar2 = zzfew.zza;
        return new zzfeu(zzfewVar, obj, bVar2, Collections.emptyList(), bVar);
    }

    public static final zzfeu zzd(final zzfej zzfejVar, zzgbn zzgbnVar, Object obj, zzfew zzfewVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfen
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfej.this.zza();
                return null;
            }
        }, zzgbnVar, obj, zzfewVar);
    }
}
