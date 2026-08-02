package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzc<K, V> extends ImmutableSortedMap<K, V> {
    private Comparator<K> zzc;
    private LLRBNode<K, V> zzt;

    private zzc(LLRBNode<K, V> lLRBNode, Comparator<K> comparator) {
        this.zzt = lLRBNode;
        this.zzc = comparator;
    }

    public static <A, B> zzc<A, B> zzb(Map<A, B> map, Comparator<A> comparator) {
        return zze.zzb(new ArrayList(map.keySet()), map, ImmutableSortedMap.Builder.identityTranslator(), comparator);
    }

    private final LLRBNode<K, V> zzc(K k) {
        LLRBNode<K, V> lLRBNode = this.zzt;
        while (!lLRBNode.isEmpty()) {
            int compare = this.zzc.compare(k, lLRBNode.getKey());
            if (compare < 0) {
                lLRBNode = lLRBNode.getLeft();
            } else {
                if (compare == 0) {
                    return lLRBNode;
                }
                lLRBNode = lLRBNode.getRight();
            }
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean containsKey(K k) {
        return zzc(k) != null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final V get(K k) {
        LLRBNode<K, V> zzc = zzc(k);
        if (zzc != null) {
            return zzc.getValue();
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Comparator<K> getComparator() {
        return this.zzc;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final K getMaxKey() {
        return this.zzt.getMax().getKey();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final K getMinKey() {
        return this.zzt.getMin().getKey();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final K getPredecessorKey(K k) {
        LLRBNode<K, V> lLRBNode = this.zzt;
        LLRBNode<K, V> lLRBNode2 = null;
        while (!lLRBNode.isEmpty()) {
            int compare = this.zzc.compare(k, lLRBNode.getKey());
            if (compare == 0) {
                if (lLRBNode.getLeft().isEmpty()) {
                    if (lLRBNode2 != null) {
                        return lLRBNode2.getKey();
                    }
                    return null;
                }
                LLRBNode<K, V> left = lLRBNode.getLeft();
                while (!left.getRight().isEmpty()) {
                    left = left.getRight();
                }
                return left.getKey();
            }
            if (compare < 0) {
                lLRBNode = lLRBNode.getLeft();
            } else {
                lLRBNode2 = lLRBNode;
                lLRBNode = lLRBNode.getRight();
            }
        }
        String valueOf = String.valueOf(k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("Couldn't find predecessor key of non-present key: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final K getSuccessorKey(K k) {
        LLRBNode<K, V> lLRBNode = this.zzt;
        LLRBNode<K, V> lLRBNode2 = null;
        while (!lLRBNode.isEmpty()) {
            int compare = this.zzc.compare(lLRBNode.getKey(), k);
            if (compare == 0) {
                if (lLRBNode.getRight().isEmpty()) {
                    if (lLRBNode2 != null) {
                        return lLRBNode2.getKey();
                    }
                    return null;
                }
                LLRBNode<K, V> right = lLRBNode.getRight();
                while (!right.getLeft().isEmpty()) {
                    right = right.getLeft();
                }
                return right.getKey();
            }
            if (compare < 0) {
                lLRBNode = lLRBNode.getRight();
            } else {
                lLRBNode2 = lLRBNode;
                lLRBNode = lLRBNode.getLeft();
            }
        }
        String valueOf = String.valueOf(k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("Couldn't find successor key of non-present key: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        this.zzt.inOrderTraversal(nodeVisitor);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final int indexOf(K k) {
        LLRBNode<K, V> lLRBNode = this.zzt;
        int i = 0;
        while (!lLRBNode.isEmpty()) {
            int compare = this.zzc.compare(k, lLRBNode.getKey());
            if (compare == 0) {
                return i + lLRBNode.getLeft().size();
            }
            if (compare < 0) {
                lLRBNode = lLRBNode.getLeft();
            } else {
                i += lLRBNode.getLeft().size() + 1;
                lLRBNode = lLRBNode.getRight();
            }
        }
        return -1;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap<K, V> insert(K k, V v) {
        return new zzc(this.zzt.insert(k, v, this.zzc).copy(null, null, LLRBNode.Color.BLACK, null, null), this.zzc);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean isEmpty() {
        return this.zzt.isEmpty();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new ImmutableSortedMapIterator(this.zzt, null, this.zzc, false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator<Map.Entry<K, V>> iteratorFrom(K k) {
        return new ImmutableSortedMapIterator(this.zzt, k, this.zzc, false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap<K, V> remove(K k) {
        return !containsKey(k) ? this : new zzc(this.zzt.remove(k, this.zzc).copy(null, null, LLRBNode.Color.BLACK, null, null), this.zzc);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator<Map.Entry<K, V>> reverseIterator() {
        return new ImmutableSortedMapIterator(this.zzt, null, this.zzc, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k) {
        return new ImmutableSortedMapIterator(this.zzt, k, this.zzc, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final int size() {
        return this.zzt.size();
    }
}
