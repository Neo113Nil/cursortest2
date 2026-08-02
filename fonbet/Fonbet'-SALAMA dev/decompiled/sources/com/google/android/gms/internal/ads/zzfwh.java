package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zzfwh extends zzfwc implements List, RandomAccess {
    private static final zzfyo zza = new zzfwf(zzfxt.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzfwe zzi(int i7) {
        zzfve.zza(i7, "expectedSize");
        return new zzfwe(i7);
    }

    public static zzfwh zzj(Object[] objArr, int i7) {
        return i7 == 0 ? zzfxt.zza : new zzfxt(objArr, i7);
    }

    public static zzfwh zzk(Iterable iterable) {
        iterable.getClass();
        return zzl((Collection) iterable);
    }

    public static zzfwh zzl(Collection collection) {
        if (!(collection instanceof zzfwc)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzfxr.zzb(array, length);
            return zzj(array, length);
        }
        zzfwh zzd2 = ((zzfwc) collection).zzd();
        if (!zzd2.zzf()) {
            return zzd2;
        }
        Object[] array2 = zzd2.toArray();
        return zzj(array2, array2.length);
    }

    public static zzfwh zzm(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfxt.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfxr.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzfwh zzn() {
        return zzfxt.zza;
    }

    public static zzfwh zzo(Object obj) {
        Object[] objArr = {obj};
        zzfxr.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzfwh zzp(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfxr.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzfwh zzq(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfxr.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzfwh zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfxr.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzfwh zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfxr.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    @SafeVarargs
    public static zzfwh zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i7 = length + 12;
        Object[] objArr2 = new Object[i7];
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
        zzfxr.zzb(objArr2, i7);
        return zzj(objArr2, i7);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection
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
                    for (int i7 = 0; i7 < size; i7++) {
                        if (zzfte.zza(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfte.zza(it.next(), it2.next())) {
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
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = (i7 * 31) + get(i8).hashCode();
        }
        return i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public int zza(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    @Deprecated
    public final zzfwh zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    /* renamed from: zze */
    public final zzfyn iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfwh subList(int i7, int i8) {
        zzfth.zzk(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? zzfxt.zza : new zzfwg(this, i7, i9);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzfyo listIterator(int i7) {
        zzfth.zzb(i7, size(), "index");
        return isEmpty() ? zza : new zzfwf(this, i7);
    }
}
