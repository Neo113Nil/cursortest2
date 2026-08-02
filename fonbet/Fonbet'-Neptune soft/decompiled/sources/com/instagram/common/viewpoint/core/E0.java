package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class E0 implements Comparable<E0> {
    public final boolean A00;
    public final boolean A01;

    public E0(C1830or c1830or, int i) {
        this.A00 = (c1830or.A0H & 1) != 0;
        this.A01 = AnonymousClass92.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(E0 e0) {
        return AbstractC1661m4.A01().A09(this.A01, e0.A01).A09(this.A00, e0.A00).A05();
    }
}
