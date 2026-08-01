package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzgxm extends zzgxi implements List, RandomAccess {
    private static final zzhab zza = new zzgxk(zzgzh.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzgxm() {
    }

    public static zzgxm zzi() {
        return zzgzh.zza;
    }

    public static zzgxm zzj(Object obj) {
        Object[] objArr = {obj};
        zzgzf.zza(objArr, 1);
        return zzt(objArr, 1);
    }

    public static zzgxm zzk(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgzf.zza(objArr, 2);
        return zzt(objArr, 2);
    }

    public static zzgxm zzl(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgzf.zza(objArr, 3);
        return zzt(objArr, 3);
    }

    public static zzgxm zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgzf.zza(objArr, 5);
        return zzt(objArr, 5);
    }

    public static zzgxm zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzgzf.zza(objArr, 6);
        return zzt(objArr, 6);
    }

    @SafeVarargs
    public static zzgxm zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
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
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgzf.zza(objArr2, i);
        return zzt(objArr2, i);
    }

    public static zzgxm zzq(Collection collection) {
        if (!(collection instanceof zzgxi)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgzf.zza(array, length);
            return zzt(array, length);
        }
        zzgxm zze = ((zzgxi) collection).zze();
        if (!zze.zzf()) {
            return zze;
        }
        Object[] array2 = zze.toArray();
        return zzt(array2, array2.length);
    }

    public static zzgxm zzr(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgzh.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgzf.zza(objArr2, length);
        return zzt(objArr2, length);
    }

    public static zzgxm zzs(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : zzgym.zza(((zzgxm) iterable).listIterator(0))).toArray();
        int length = array.length;
        zzgzf.zza(array, length);
        Arrays.sort(array, comparator);
        return zzt(array, length);
    }

    static zzgxm zzt(Object[] objArr, int i) {
        return i == 0 ? zzgzh.zza : new zzgzh(objArr, i);
    }

    public static zzgxj zzv(int i) {
        zzgwi.zzb(i, "expectedSize");
        return new zzgxj(i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
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
    public final int indexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    /* renamed from: zza */
    public final zzhaa iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    @Deprecated
    public final zzgxm zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    int zzg(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgxm subList(int i, int i2) {
        zzguk.zzo(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzgzh.zza : new zzgxl(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzhab listIterator(int i) {
        zzguk.zzn(i, size(), "index");
        return isEmpty() ? zza : new zzgxk(this, i);
    }

    public static zzgxm zzp(Iterable iterable) {
        iterable.getClass();
        return zzq((Collection) iterable);
    }
}
