package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfeo {
    public static final zzfeu zza(Callable callable, Object obj, zzfew zzfewVar) {
        return zzb(callable, zzfewVar.zzb, obj, zzfewVar);
    }

    public static final zzfeu zzb(Callable callable, zzgbn zzgbnVar, Object obj, zzfew zzfewVar) {
        return new zzfeu(zzfewVar, obj, zzfew.zza, Collections.emptyList(), zzgbnVar.zzb(callable));
    }

    public static final zzfeu zzc(I3.b bVar, Object obj, zzfew zzfewVar) {
        return new zzfeu(zzfewVar, obj, zzfew.zza, Collections.emptyList(), bVar);
    }

    public static final zzfeu zzd(final zzfej zzfejVar, zzgbn zzgbnVar, Object obj, zzfew zzfewVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfen
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfejVar.zza();
                return null;
            }
        }, zzgbnVar, obj, zzfewVar);
    }
}
