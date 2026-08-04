package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzfew {
    private static final I3.b zza = zzgbc.zzh(null);
    private final zzgbn zzb;
    private final ScheduledExecutorService zzc;
    private final zzfex zzd;

    public zzfew(zzgbn zzgbnVar, ScheduledExecutorService scheduledExecutorService, zzfex zzfexVar) {
        this.zzb = zzgbnVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfexVar;
    }

    public final zzfem zza(Object obj, I3.b... bVarArr) {
        return new zzfem(this, obj, Arrays.asList(bVarArr), null);
    }

    public final zzfeu zzb(Object obj, I3.b bVar) {
        return new zzfeu(this, obj, bVar, Collections.singletonList(bVar), bVar);
    }

    public abstract String zzf(Object obj);
}
