package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzal<E> extends zzak<E> implements List<E>, RandomAccess {
    private static final zzbb<Object> zza = new zzan(zzat.zza, 0);

    public static <E> zzal<E> zzb(Object[] objArr, int i7) {
        return i7 == 0 ? (zzal<E>) zzat.zza : new zzat(objArr, i7);
    }

    public static <E> zzao<E> zzg() {
        return new zzao<>();
    }

    public static <E> zzal<E> zzh() {
        return (zzal<E>) zzat.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i7, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzy.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (zzr.zza(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i8 = 0;
                while (i8 < size2) {
                    if (it.hasNext()) {
                        E e7 = get(i8);
                        i8++;
                        if (zzr.zza(e7, it.next())) {
                        }
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~(get(i8).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
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

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
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
    public /* synthetic */ ListIterator listIterator() {
        return (zzbb) listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public int zza(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    @Deprecated
    public final zzal<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzbc<E> iterator() {
        return (zzbb) listIterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i7) {
        zzy.zzb(i7, size());
        return isEmpty() ? zza : new zzan(this, i7);
    }

    public static <E> zzal<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzal<E> zzb(Object... objArr) {
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(k.d(i7, "at index "));
            }
        }
        return zzb(objArr, objArr.length);
    }

    public static <E> zzal<E> zza(Collection<? extends E> collection) {
        if (collection instanceof zzak) {
            zzal<E> zzalVarZzc = ((zzak) collection).zzc();
            if (!zzalVarZzc.zze()) {
                return zzalVarZzc;
            }
            Object[] array = zzalVarZzc.toArray();
            return zzb(array, array.length);
        }
        return zzb(collection.toArray());
    }

    public static <E> zzal<E> zza(E e7, E e8, E e9, E e10, E e11, E e12, E e13, E e14) {
        return zzb(e7, e8, e9, e10, e11, e12, e13, e14);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzal<E> subList(int i7, int i8) {
        zzy.zza(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == size()) {
            return this;
        }
        if (i9 == 0) {
            return (zzal<E>) zzat.zza;
        }
        return new zzaq(this, i7, i9);
    }
}
