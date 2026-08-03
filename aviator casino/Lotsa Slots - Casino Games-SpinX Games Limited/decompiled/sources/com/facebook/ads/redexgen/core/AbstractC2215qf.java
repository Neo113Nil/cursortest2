package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.qf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2215qf<E> extends java.util.AbstractSet<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qf != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<?> c) {
        return com.facebook.ads.redexgen.core.AbstractC2219qj.A0A(this, c);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qf != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<?> c) {
        return super.retainAll((java.util.Collection) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(c));
    }
}
