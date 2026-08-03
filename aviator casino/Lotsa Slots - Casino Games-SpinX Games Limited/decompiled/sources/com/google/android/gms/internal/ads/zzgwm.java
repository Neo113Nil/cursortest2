package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgwm extends com.google.android.gms.internal.ads.zzgwi implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.ads.zzgzb zza = new com.google.android.gms.internal.ads.zzgwk(com.google.android.gms.internal.ads.zzgyh.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzgwm() {
    }

    public static com.google.android.gms.internal.ads.zzgwm zzi() {
        return com.google.android.gms.internal.ads.zzgyh.zza;
    }

    public static com.google.android.gms.internal.ads.zzgwm zzj(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        com.google.android.gms.internal.ads.zzgyf.zza(objArr, 1);
        return zzt(objArr, 1);
    }

    public static com.google.android.gms.internal.ads.zzgwm zzk(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        com.google.android.gms.internal.ads.zzgyf.zza(objArr, 2);
        return zzt(objArr, 2);
    }

    public static com.google.android.gms.internal.ads.zzgwm zzl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = {obj, obj2, obj3};
        com.google.android.gms.internal.ads.zzgyf.zza(objArr, 3);
        return zzt(objArr, 3);
    }

    public static com.google.android.gms.internal.ads.zzgwm zzm(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        com.google.android.gms.internal.ads.zzgyf.zza(objArr, 5);
        return zzt(objArr, 5);
    }

    public static com.google.android.gms.internal.ads.zzgwm zzn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        com.google.android.gms.internal.ads.zzgyf.zza(objArr, 6);
        return zzt(objArr, 6);
    }

    @java.lang.SafeVarargs
    public static com.google.android.gms.internal.ads.zzgwm zzo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        java.lang.Object[] objArr2 = new java.lang.Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        java.lang.System.arraycopy(objArr, 0, objArr2, 12, length);
        com.google.android.gms.internal.ads.zzgyf.zza(objArr2, i);
        return zzt(objArr2, i);
    }

    public static com.google.android.gms.internal.ads.zzgwm zzq(java.util.Collection collection) {
        if (!(collection instanceof com.google.android.gms.internal.ads.zzgwi)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.google.android.gms.internal.ads.zzgyf.zza(array, length);
            return zzt(array, length);
        }
        com.google.android.gms.internal.ads.zzgwm zze = ((com.google.android.gms.internal.ads.zzgwi) collection).zze();
        if (!zze.zzf()) {
            return zze;
        }
        java.lang.Object[] array2 = zze.toArray();
        return zzt(array2, array2.length);
    }

    public static com.google.android.gms.internal.ads.zzgwm zzr(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return com.google.android.gms.internal.ads.zzgyh.zza;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        int length = objArr2.length;
        com.google.android.gms.internal.ads.zzgyf.zza(objArr2, length);
        return zzt(objArr2, length);
    }

    public static com.google.android.gms.internal.ads.zzgwm zzs(java.util.Comparator comparator, java.lang.Iterable iterable) {
        java.lang.Object[] array = (iterable instanceof java.util.Collection ? (java.util.Collection) iterable : com.google.android.gms.internal.ads.zzgxm.zza(((com.google.android.gms.internal.ads.zzgwm) iterable).listIterator(0))).toArray();
        int length = array.length;
        com.google.android.gms.internal.ads.zzgyf.zza(array, length);
        java.util.Arrays.sort(array, comparator);
        return zzt(array, length);
    }

    static com.google.android.gms.internal.ads.zzgwm zzt(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.ads.zzgyh.zza : new com.google.android.gms.internal.ads.zzgyh(objArr, i);
    }

    public static com.google.android.gms.internal.ads.zzgwj zzv(int i) {
        com.google.android.gms.internal.ads.zzgvi.zzb(i, "expectedSize");
        return new com.google.android.gms.internal.ads.zzgwj(i);
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

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (java.util.Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !java.util.Objects.equals(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
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

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.ads.zzgwi
    /* renamed from: zza */
    public final com.google.android.gms.internal.ads.zzgza iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzgwm zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    int zzg(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.ads.zzgwm subList(int i, int i2) {
        com.google.android.gms.internal.ads.zzgtj.zzo(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? com.google.android.gms.internal.ads.zzgyh.zza : new com.google.android.gms.internal.ads.zzgwl(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgzb listIterator(int i) {
        com.google.android.gms.internal.ads.zzgtj.zzn(i, size(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new com.google.android.gms.internal.ads.zzgwk(this, i);
    }

    public static com.google.android.gms.internal.ads.zzgwm zzp(java.lang.Iterable iterable) {
        iterable.getClass();
        return zzq((java.util.Collection) iterable);
    }
}
