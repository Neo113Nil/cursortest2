package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0893b extends AbstractList implements J {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12176a;

    public AbstractC0893b(boolean z4) {
        this.f12176a = z4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        l();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        l();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        l();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!get(i7).equals(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = (i7 * 31) + get(i8).hashCode();
        }
        return i7;
    }

    public final void l() {
        if (!this.f12176a) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean m() {
        return this.f12176a;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i7);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        l();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        l();
        return super.addAll(i7, collection);
    }
}
