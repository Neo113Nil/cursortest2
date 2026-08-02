package com.google.firebase.database.collection;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzg implements Iterator<zzh> {
    private int zzy;
    private final /* synthetic */ zzf zzz;

    zzg(zzf zzfVar) {
        int i;
        this.zzz = zzfVar;
        i = this.zzz.length;
        this.zzy = i - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzy >= 0;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzh next() {
        long j;
        j = this.zzz.value;
        long j2 = j & (1 << this.zzy);
        zzh zzhVar = new zzh();
        zzhVar.zzaa = j2 == 0;
        zzhVar.zzab = (int) Math.pow(2.0d, this.zzy);
        this.zzy--;
        return zzhVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
    }
}
