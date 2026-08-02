package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zza<K, V> extends ImmutableSortedMap<K, V> {
    private final K[] zza;
    private final V[] zzb;
    private final Comparator<K> zzc;

    public zza(Comparator<K> comparator) {
        this.zza = (K[]) new Object[0];
        this.zzb = (V[]) new Object[0];
        this.zzc = comparator;
    }

    private zza(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.zza = kArr;
        this.zzb = vArr;
        this.zzc = comparator;
    }

    private final int zza(K k) {
        int i = 0;
        while (true) {
            K[] kArr = this.zza;
            if (i >= kArr.length || this.zzc.compare(kArr[i], k) >= 0) {
                break;
            }
            i++;
        }
        return i;
    }

    public static <A, B, C> zza<A, C> zza(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (A a : list) {
            objArr[i] = a;
            objArr2[i] = map.get(keyTranslator.translate(a));
            i++;
        }
        return new zza<>(comparator, objArr, objArr2);
    }

    public static <K, V> zza<K, V> zza(Map<K, V> map, Comparator<K> comparator) {
        return zza(new ArrayList(map.keySet()), map, ImmutableSortedMap.Builder.identityTranslator(), comparator);
    }

    private final Iterator<Map.Entry<K, V>> zza(int i, boolean z) {
        return new zzb(this, i, z);
    }

    private static <T> T[] zza(T[] tArr, int i) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        System.arraycopy(tArr, i + 1, tArr2, i, length - i);
        return tArr2;
    }

    private static <T> T[] zza(T[] tArr, int i, T t) {
        T[] tArr2 = (T[]) new Object[tArr.length + 1];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        tArr2[i] = t;
        System.arraycopy(tArr, i, tArr2, i + 1, (r0 - i) - 1);
        return tArr2;
    }

    private final int zzb(K k) {
        int i = 0;
        for (K k2 : this.zza) {
            if (this.zzc.compare(k, k2) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static <T> T[] zzb(T[] tArr, int i, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i] = t;
        return tArr2;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean containsKey(K k) {
        return zzb((zza<K, V>) k) != -1;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final V get(K k) {
        int zzb = zzb((zza<K, V>) k);
        if (zzb != -1) {
            return this.zzb[zzb];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Comparator<K> getComparator() {
        return this.zzc;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final K getMaxKey() {
        K[] kArr = this.zza;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final K getMinKey() {
        K[] kArr = this.zza;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final K getPredecessorKey(K k) {
        int zzb = zzb((zza<K, V>) k);
        if (zzb == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (zzb > 0) {
            return this.zza[zzb - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final K getSuccessorKey(K k) {
        int zzb = zzb((zza<K, V>) k);
        if (zzb == -1) {
            throw new IllegalArgumentException("Can't find successor of nonexistent key");
        }
        K[] kArr = this.zza;
        if (zzb < kArr.length - 1) {
            return kArr[zzb + 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        int i = 0;
        while (true) {
            K[] kArr = this.zza;
            if (i >= kArr.length) {
                return;
            }
            nodeVisitor.visitEntry(kArr[i], this.zzb[i]);
            i++;
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final int indexOf(K k) {
        return zzb((zza<K, V>) k);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap<K, V> insert(K k, V v) {
        int zzb = zzb((zza<K, V>) k);
        if (zzb != -1) {
            if (this.zza[zzb] == k && this.zzb[zzb] == v) {
                return this;
            }
            return new zza(this.zzc, zzb(this.zza, zzb, k), zzb(this.zzb, zzb, v));
        }
        K[] kArr = this.zza;
        if (kArr.length <= 25) {
            int zza = zza((zza<K, V>) k);
            return new zza(this.zzc, zza(this.zza, zza, k), zza(this.zzb, zza, v));
        }
        HashMap hashMap = new HashMap(kArr.length + 1);
        int i = 0;
        while (true) {
            K[] kArr2 = this.zza;
            if (i >= kArr2.length) {
                hashMap.put(k, v);
                return zzc.zzb(hashMap, this.zzc);
            }
            hashMap.put(kArr2[i], this.zzb[i]);
            i++;
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean isEmpty() {
        return this.zza.length == 0;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return zza(0, false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator<Map.Entry<K, V>> iteratorFrom(K k) {
        return zza(zza((zza<K, V>) k), false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap<K, V> remove(K k) {
        int zzb = zzb((zza<K, V>) k);
        if (zzb == -1) {
            return this;
        }
        return new zza(this.zzc, zza(this.zza, zzb), zza(this.zzb, zzb));
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator<Map.Entry<K, V>> reverseIterator() {
        return zza(this.zza.length - 1, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k) {
        int zza = zza((zza<K, V>) k);
        K[] kArr = this.zza;
        return (zza >= kArr.length || this.zzc.compare(kArr[zza], k) != 0) ? zza(zza - 1, true) : zza(zza, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final int size() {
        return this.zza.length;
    }
}
