package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class zzfuz extends zzfux implements List {
    final /* synthetic */ zzfva zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuz(zzfva zzfvaVar, Object obj, List list, zzfux zzfuxVar) {
        super(zzfvaVar, obj, list, zzfuxVar);
        this.zzf = zzfvaVar;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i7, obj);
        this.zzf.zzb++;
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i7, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        this.zzf.zzb += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzb();
        return ((List) this.zzb).get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfuy(this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        zzb();
        Object objRemove = ((List) this.zzb).remove(i7);
        this.zzf.zzb--;
        zzc();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        zzb();
        return ((List) this.zzb).set(i7, obj);
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        zzb();
        List listSubList = ((List) this.zzb).subList(i7, i8);
        zzfux zzfuxVar = this.zzc;
        if (zzfuxVar == null) {
            zzfuxVar = this;
        }
        return this.zzf.zzh(this.zza, listSubList, zzfuxVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        zzb();
        return new zzfuy(this, i7);
    }
}
