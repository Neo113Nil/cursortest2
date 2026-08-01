package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public final class k extends PriorityQueue {

    /* renamed from: a, reason: collision with root package name */
    public final int f5220a;

    public k(int i) {
        super(1, new l());
        this.f5220a = i;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(g gVar) {
        boolean add = super.add((k) gVar);
        if (super.size() > this.f5220a) {
            poll();
        }
        return add;
    }
}
