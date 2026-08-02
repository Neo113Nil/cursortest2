package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
class zzfuo implements Iterator {
    final Iterator zza;
    Collection zzb;
    Iterator zzc;
    final /* synthetic */ zzfva zzd;

    public zzfuo(zzfva zzfvaVar) {
        Map map;
        this.zzd = zzfvaVar;
        map = zzfvaVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = zzfwp.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzb = collection;
            this.zzc = collection.iterator();
        }
        return this.zzc.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        this.zzc.remove();
        Collection collection = this.zzb;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzfva zzfvaVar = this.zzd;
        i7 = zzfvaVar.zzb;
        zzfvaVar.zzb = i7 - 1;
    }
}
