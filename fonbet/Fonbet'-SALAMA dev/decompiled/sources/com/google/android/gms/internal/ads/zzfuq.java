package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class zzfuq extends zzfxb {
    final /* synthetic */ zzfva zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuq(zzfva zzfvaVar, Map map) {
        super(map);
        this.zza = zzfvaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzfwr.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfxb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfup(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfxb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzfva zzfvaVar = this.zza;
        i7 = zzfvaVar.zzb;
        zzfvaVar.zzb = i7 - size;
        return size > 0;
    }
}
