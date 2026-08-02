package com.google.firebase.database.collection;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;

@KeepForSdk
/* loaded from: classes.dex */
public class ImmutableSortedMapIterator<K, V> implements Iterator<Map.Entry<K, V>> {
    private final Stack<LLRBValueNode<K, V>> zzi = new Stack<>();
    private final boolean zzj;

    ImmutableSortedMapIterator(LLRBNode<K, V> lLRBNode, K k, Comparator<K> comparator, boolean z) {
        this.zzj = z;
        while (!lLRBNode.isEmpty()) {
            int compare = k != null ? z ? comparator.compare(k, lLRBNode.getKey()) : comparator.compare(lLRBNode.getKey(), k) : 1;
            if (compare < 0) {
                lLRBNode = !z ? lLRBNode.getRight() : lLRBNode.getLeft();
            } else if (compare == 0) {
                this.zzi.push((LLRBValueNode) lLRBNode);
                return;
            } else {
                this.zzi.push((LLRBValueNode) lLRBNode);
                if (z) {
                }
            }
        }
    }

    @Override // java.util.Iterator
    @KeepForSdk
    public boolean hasNext() {
        return this.zzi.size() > 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    @KeepForSdk
    public Map.Entry<K, V> next() {
        try {
            LLRBValueNode<K, V> pop = this.zzi.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.zzj) {
                for (LLRBNode<K, V> left = pop.getLeft(); !left.isEmpty(); left = left.getRight()) {
                    this.zzi.push((LLRBValueNode) left);
                }
            } else {
                for (LLRBNode<K, V> right = pop.getRight(); !right.isEmpty(); right = right.getLeft()) {
                    this.zzi.push((LLRBValueNode) right);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    @KeepForSdk
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
