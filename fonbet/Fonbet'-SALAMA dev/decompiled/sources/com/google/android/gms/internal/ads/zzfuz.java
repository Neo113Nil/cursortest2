package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
class zzfuz extends zzfux implements List {
    final /* synthetic */ zzfva zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuz(zzfva zzfvaVar, Object obj, List list, zzfux zzfuxVar) {
        super(zzfvaVar, obj, list, zzfuxVar);
        this.zzf = zzfvaVar;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i7, obj);
        zzfva zzfvaVar = this.zzf;
        i8 = zzfvaVar.zzb;
        zzfvaVar.zzb = i8 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        int i8;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i7, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzfva zzfvaVar = this.zzf;
        i8 = zzfvaVar.zzb;
        zzfvaVar.zzb = i8 + (size2 - size);
        if (size != 0) {
            return addAll;
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
        int i8;
        zzb();
        Object remove = ((List) this.zzb).remove(i7);
        zzfva zzfvaVar = this.zzf;
        i8 = zzfvaVar.zzb;
        zzfvaVar.zzb = i8 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        zzb();
        return ((List) this.zzb).set(i7, obj);
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        zzb();
        List subList = ((List) this.zzb).subList(i7, i8);
        zzfux zzfuxVar = this.zzc;
        if (zzfuxVar == null) {
            zzfuxVar = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfuxVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        zzb();
        return new zzfuy(this, i7);
    }
}
