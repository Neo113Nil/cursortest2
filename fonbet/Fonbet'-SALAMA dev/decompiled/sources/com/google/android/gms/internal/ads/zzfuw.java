package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class zzfuw implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfux zzc;

    public zzfuw(zzfux zzfuxVar, Iterator it) {
        this.zzc = zzfuxVar;
        this.zzb = zzfuxVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        this.zza.remove();
        zzfva zzfvaVar = this.zzc.zze;
        i7 = zzfvaVar.zzb;
        zzfvaVar.zzb = i7 - 1;
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzfuw(zzfux zzfuxVar) {
        this.zzc = zzfuxVar;
        Collection collection = zzfuxVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
