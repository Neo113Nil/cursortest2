package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class k extends java.util.PriorityQueue {

    /* renamed from: a, reason: collision with root package name */
    public final int f3569a;

    public k(int i) {
        super(1, new com.fyber.inneractive.sdk.cache.session.l());
        this.f3569a = i;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(com.fyber.inneractive.sdk.cache.session.g gVar) {
        boolean add = super.add((com.fyber.inneractive.sdk.cache.session.k) gVar);
        if (super.size() > this.f3569a) {
            poll();
        }
        return add;
    }
}
