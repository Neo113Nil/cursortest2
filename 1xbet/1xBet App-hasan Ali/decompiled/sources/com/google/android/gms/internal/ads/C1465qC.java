package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.qC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465qC implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f15111k;

    /* renamed from: l, reason: collision with root package name */
    public C1733wB f15112l;

    public C1465qC(AbstractC1823yB abstractC1823yB) {
        if (!(abstractC1823yB instanceof C1509rC)) {
            this.f15111k = null;
            this.f15112l = (C1733wB) abstractC1823yB;
            return;
        }
        C1509rC c1509rC = (C1509rC) abstractC1823yB;
        ArrayDeque arrayDeque = new ArrayDeque(c1509rC.f15282q);
        this.f15111k = arrayDeque;
        arrayDeque.push(c1509rC);
        AbstractC1823yB abstractC1823yB2 = c1509rC.f15279n;
        while (abstractC1823yB2 instanceof C1509rC) {
            C1509rC c1509rC2 = (C1509rC) abstractC1823yB2;
            this.f15111k.push(c1509rC2);
            abstractC1823yB2 = c1509rC2.f15279n;
        }
        this.f15112l = (C1733wB) abstractC1823yB2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1733wB next() {
        C1733wB c1733wB;
        C1733wB c1733wB2 = this.f15112l;
        if (c1733wB2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f15111k;
            c1733wB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            AbstractC1823yB abstractC1823yB = ((C1509rC) arrayDeque.pop()).f15280o;
            while (abstractC1823yB instanceof C1509rC) {
                C1509rC c1509rC = (C1509rC) abstractC1823yB;
                arrayDeque.push(c1509rC);
                abstractC1823yB = c1509rC.f15279n;
            }
            c1733wB = (C1733wB) abstractC1823yB;
        } while (c1733wB.g() == 0);
        this.f15112l = c1733wB;
        return c1733wB2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15112l != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
