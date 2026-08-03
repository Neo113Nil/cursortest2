package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class p1 extends com.fyber.inneractive.sdk.protobuf.c implements com.fyber.inneractive.sdk.protobuf.q1, java.util.RandomAccess {
    public final java.util.ArrayList b;

    static {
        new com.fyber.inneractive.sdk.protobuf.p1(10).f4180a = false;
    }

    public p1(int i) {
        this.b = new java.util.ArrayList(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final com.fyber.inneractive.sdk.protobuf.q1 a() {
        return this.f4180a ? new com.fyber.inneractive.sdk.protobuf.r3(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        c();
        this.b.add(i, (java.lang.String) obj);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        return addAll(this.b.size(), collection);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final com.fyber.inneractive.sdk.protobuf.k1 b(int i) {
        if (i < this.b.size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.b);
        return new com.fyber.inneractive.sdk.protobuf.p1(arrayList);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.b.clear();
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        java.lang.String a2;
        java.lang.Object obj = this.b.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.fyber.inneractive.sdk.protobuf.s) {
            com.fyber.inneractive.sdk.protobuf.s sVar = (com.fyber.inneractive.sdk.protobuf.s) obj;
            a2 = sVar.f();
            if (sVar.c()) {
                this.b.set(i, a2);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            a2 = com.fyber.inneractive.sdk.protobuf.l1.a(bArr);
            if (com.fyber.inneractive.sdk.protobuf.d4.f4185a.b(bArr, 0, bArr.length)) {
                this.b.set(i, a2);
            }
        }
        return a2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        c();
        java.lang.Object remove = this.b.remove(i);
        ((java.util.AbstractList) this).modCount++;
        return remove instanceof java.lang.String ? (java.lang.String) remove : remove instanceof com.fyber.inneractive.sdk.protobuf.s ? ((com.fyber.inneractive.sdk.protobuf.s) remove).f() : com.fyber.inneractive.sdk.protobuf.l1.a((byte[]) remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        c();
        java.lang.Object obj2 = this.b.set(i, (java.lang.String) obj);
        return obj2 instanceof java.lang.String ? (java.lang.String) obj2 : obj2 instanceof com.fyber.inneractive.sdk.protobuf.s ? ((com.fyber.inneractive.sdk.protobuf.s) obj2).f() : com.fyber.inneractive.sdk.protobuf.l1.a((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final void a(com.fyber.inneractive.sdk.protobuf.s sVar) {
        c();
        this.b.add(sVar);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        c();
        if (collection instanceof com.fyber.inneractive.sdk.protobuf.q1) {
            collection = ((com.fyber.inneractive.sdk.protobuf.q1) collection).b();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((java.util.AbstractList) this).modCount++;
        return addAll;
    }

    public p1(java.util.ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final java.lang.Object a(int i) {
        return this.b.get(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final java.util.List b() {
        return java.util.Collections.unmodifiableList(this.b);
    }
}
