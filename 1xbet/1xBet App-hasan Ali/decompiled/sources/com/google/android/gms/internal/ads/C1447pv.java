package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.pv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447pv extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractCollection f15061k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1311mu f15062l;

    /* JADX WARN: Multi-variable type inference failed */
    public C1447pv(List list, InterfaceC1311mu interfaceC1311mu) {
        list.getClass();
        this.f15061k = (AbstractCollection) list;
        this.f15062l = interfaceC1311mu;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f15062l.apply(this.f15061k.get(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f15061k.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C1357nv(this, this.f15061k.listIterator(i), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f15062l.apply(this.f15061k.remove(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        this.f15061k.subList(i, i5).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15061k.size();
    }
}
