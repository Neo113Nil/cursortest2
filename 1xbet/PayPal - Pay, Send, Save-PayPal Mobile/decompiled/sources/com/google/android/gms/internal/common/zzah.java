package com.google.android.gms.internal.common;

/* loaded from: classes4.dex */
public abstract class zzah extends com.google.android.gms.internal.common.zzac implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.common.zzal zza = new com.google.android.gms.internal.common.zzae(com.google.android.gms.internal.common.zzaj.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzah() {
    }

    public static com.google.android.gms.internal.common.zzah zzj() {
        return com.google.android.gms.internal.common.zzaj.zza;
    }

    public static com.google.android.gms.internal.common.zzah zzk(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        com.google.android.gms.internal.common.zzai.zza(objArr, 1);
        return zzq(objArr, 1);
    }

    public static com.google.android.gms.internal.common.zzah zzl(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        com.google.android.gms.internal.common.zzai.zza(objArr, 2);
        return zzq(objArr, 2);
    }

    public static com.google.android.gms.internal.common.zzah zzm(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = {obj, obj2, obj3};
        com.google.android.gms.internal.common.zzai.zza(objArr, 3);
        return zzq(objArr, 3);
    }

    public static com.google.android.gms.internal.common.zzah zzn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        com.google.android.gms.internal.common.zzai.zza(objArr, 6);
        return zzq(objArr, 6);
    }

    public static com.google.android.gms.internal.common.zzah zzp(java.util.Collection collection) {
        if (!(collection instanceof com.google.android.gms.internal.common.zzac)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.google.android.gms.internal.common.zzai.zza(array, length);
            return zzq(array, length);
        }
        com.google.android.gms.internal.common.zzah zze = ((com.google.android.gms.internal.common.zzac) collection).zze();
        if (!zze.zzf()) {
            return zze;
        }
        java.lang.Object[] array2 = zze.toArray();
        return zzq(array2, array2.length);
    }

    static com.google.android.gms.internal.common.zzah zzq(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.common.zzaj.zza : new com.google.android.gms.internal.common.zzaj(objArr, i);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.List list = (java.util.List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof java.util.RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!java.util.Objects.equals(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        java.util.Iterator it = iterator();
        java.util.Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !java.util.Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: zza */
    public final com.google.android.gms.internal.common.zzak iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.common.zzac
    @java.lang.Deprecated
    public final com.google.android.gms.internal.common.zzah zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzac
    int zzg(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public com.google.android.gms.internal.common.zzah zzh() {
        return size() <= 1 ? this : new com.google.android.gms.internal.common.zzaf(this);
    }

    @Override // java.util.List
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.common.zzah subList(int i, int i2) {
        com.google.android.gms.internal.common.zzr.zzd(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? com.google.android.gms.internal.common.zzaj.zza : new com.google.android.gms.internal.common.zzag(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.common.zzal listIterator(int i) {
        com.google.android.gms.internal.common.zzr.zzc(i, size(), "index");
        return isEmpty() ? zza : new com.google.android.gms.internal.common.zzae(this, i);
    }

    public static com.google.android.gms.internal.common.zzah zzo(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return zzp((java.util.Collection) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return com.google.android.gms.internal.common.zzaj.zza;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return zzk(next);
        }
        com.google.android.gms.internal.common.zzad zzadVar = new com.google.android.gms.internal.common.zzad(4);
        zzadVar.zzb(next);
        zzadVar.zzc(it);
        return zzadVar.zzd();
    }
}
