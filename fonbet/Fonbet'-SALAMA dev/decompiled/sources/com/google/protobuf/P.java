package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class P extends AbstractC0893b implements Q, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List f12146b;

    static {
        new P();
    }

    public P(ArrayList arrayList) {
        super(true);
        this.f12146b = arrayList;
    }

    @Override // com.google.protobuf.J
    public final J a(int i7) {
        List list = this.f12146b;
        if (i7 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(list);
        return new P(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        l();
        this.f12146b.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0893b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f12146b.size(), collection);
    }

    @Override // com.google.protobuf.Q
    public final List b() {
        return Collections.unmodifiableList(this.f12146b);
    }

    @Override // com.google.protobuf.Q
    public final Q c() {
        return this.f12176a ? new F0(this) : this;
    }

    @Override // com.google.protobuf.AbstractC0893b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        this.f12146b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Q
    public final Object d(int i7) {
        return this.f12146b.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        String str;
        List list = this.f12146b;
        Object obj = list.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0911k) {
            AbstractC0911k abstractC0911k = (AbstractC0911k) obj;
            abstractC0911k.getClass();
            str = abstractC0911k.size() == 0 ? "" : abstractC0911k.L(K.f12112a);
            if (abstractC0911k.F()) {
                list.set(i7, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, K.f12112a);
            w0 w0Var = N0.f12134a;
            if (N0.f12134a.U(0, bArr, 0, bArr.length) == 0) {
                list.set(i7, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.Q
    public final void h(AbstractC0911k abstractC0911k) {
        l();
        this.f12146b.add(abstractC0911k);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0893b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        l();
        Object remove = this.f12146b.remove(i7);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof AbstractC0911k)) {
            return new String((byte[]) remove, K.f12112a);
        }
        AbstractC0911k abstractC0911k = (AbstractC0911k) remove;
        abstractC0911k.getClass();
        return abstractC0911k.size() == 0 ? "" : abstractC0911k.L(K.f12112a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        l();
        Object obj2 = this.f12146b.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC0911k)) {
            return new String((byte[]) obj2, K.f12112a);
        }
        AbstractC0911k abstractC0911k = (AbstractC0911k) obj2;
        abstractC0911k.getClass();
        return abstractC0911k.size() == 0 ? "" : abstractC0911k.L(K.f12112a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12146b.size();
    }

    public P() {
        super(false);
        this.f12146b = Collections.emptyList();
    }

    @Override // com.google.protobuf.AbstractC0893b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        l();
        if (collection instanceof Q) {
            collection = ((Q) collection).b();
        }
        boolean addAll = this.f12146b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public P(int i7) {
        this(new ArrayList(i7));
    }
}
