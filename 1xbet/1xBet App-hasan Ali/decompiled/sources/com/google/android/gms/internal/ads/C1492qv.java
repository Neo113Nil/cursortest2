package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.qv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492qv extends AbstractSequentialList implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractCollection f15185k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1311mu f15186l;

    /* JADX WARN: Multi-variable type inference failed */
    public C1492qv(List list, InterfaceC1311mu interfaceC1311mu) {
        list.getClass();
        this.f15185k = (AbstractCollection) list;
        this.f15186l = interfaceC1311mu;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f15185k.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C1357nv(this, this.f15185k.listIterator(i), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        this.f15185k.subList(i, i5).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15185k.size();
    }
}
