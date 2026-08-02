package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class zzfbz {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgbn zzc;

    public zzfbz(Callable callable, zzgbn zzgbnVar) {
        this.zzb = callable;
        this.zzc = zzgbnVar;
    }

    public final synchronized I3.b zza() {
        zzc(1);
        return (I3.b) this.zza.poll();
    }

    public final synchronized void zzb(I3.b bVar) {
        this.zza.addFirst(bVar);
    }

    public final synchronized void zzc(int i7) {
        int size = i7 - this.zza.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
