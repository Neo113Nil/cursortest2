package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzhdw implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhdx zzb;

    public zzhdw(zzhdx zzhdxVar) {
        this.zzb = zzhdxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhdx zzhdxVar = this.zzb;
            zzhdxVar.zza.add(zzhdxVar.zzb.next());
            return next();
        }
        zzhdx zzhdxVar2 = this.zzb;
        int i7 = this.zza;
        this.zza = i7 + 1;
        return zzhdxVar2.zza.get(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
