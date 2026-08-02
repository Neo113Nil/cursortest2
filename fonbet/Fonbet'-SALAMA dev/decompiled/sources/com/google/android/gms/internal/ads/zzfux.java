package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class zzfux extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfux zzc;
    final Collection zzd;
    final /* synthetic */ zzfva zze;

    public zzfux(zzfva zzfvaVar, Object obj, Collection collection, zzfux zzfuxVar) {
        this.zze = zzfvaVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfuxVar;
        this.zzd = zzfuxVar == null ? null : zzfuxVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i7;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfva zzfvaVar = this.zze;
            i7 = zzfvaVar.zzb;
            zzfvaVar.zzb = i7 + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i7;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzfva zzfvaVar = this.zze;
        i7 = zzfvaVar.zzb;
        zzfvaVar.zzb = i7 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i7;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfva zzfvaVar = this.zze;
        i7 = zzfvaVar.zzb;
        zzfvaVar.zzb = i7 - size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfuw(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i7;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfva zzfvaVar = this.zze;
            i7 = zzfvaVar.zzb;
            zzfvaVar.zzb = i7 - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfva zzfvaVar = this.zze;
            int i8 = size2 - size;
            i7 = zzfvaVar.zzb;
            zzfvaVar.zzb = i7 + i8;
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7;
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfva zzfvaVar = this.zze;
            int i8 = size2 - size;
            i7 = zzfvaVar.zzb;
            zzfvaVar.zzb = i7 + i8;
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    public final void zza() {
        Map map;
        zzfux zzfuxVar = this.zzc;
        if (zzfuxVar != null) {
            zzfuxVar.zza();
            return;
        }
        zzfva zzfvaVar = this.zze;
        Object obj = this.zza;
        map = zzfvaVar.zza;
        map.put(obj, this.zzb);
    }

    public final void zzb() {
        Map map;
        zzfux zzfuxVar = this.zzc;
        if (zzfuxVar != null) {
            zzfuxVar.zzb();
            zzfux zzfuxVar2 = this.zzc;
            if (zzfuxVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzfva zzfvaVar = this.zze;
            Object obj = this.zza;
            map = zzfvaVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzc() {
        Map map;
        zzfux zzfuxVar = this.zzc;
        if (zzfuxVar != null) {
            zzfuxVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfva zzfvaVar = this.zze;
            Object obj = this.zza;
            map = zzfvaVar.zza;
            map.remove(obj);
        }
    }
}
