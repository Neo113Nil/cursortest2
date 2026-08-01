package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class r3 extends AbstractList implements q1, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f5873a;

    public r3(q1 q1Var) {
        this.f5873a = q1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final q1 a() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final List b() {
        return this.f5873a.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f5873a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new q3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new p3(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5873a.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final Object a(int i) {
        return this.f5873a.a(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final void a(s sVar) {
        throw new UnsupportedOperationException();
    }
}
