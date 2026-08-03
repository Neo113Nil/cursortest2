package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: com.facebook.ads.redexgen.X.Ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0585Ax<E> extends com.facebook.ads.redexgen.core.AbstractC2217qh<E> {
    public final /* synthetic */ java.util.Set A00;
    public final /* synthetic */ java.util.Set A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0585Ax(final java.util.Set val$set1, final java.util.Set val$set2) {
        super(null);
        this.A00 = val$set1;
        this.A01 = val$set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C4C<E> iterator() {
        return new com.facebook.ads.redexgen.core.AbstractC0609Bv<E>() { // from class: com.facebook.ads.redexgen.X.28
            public final java.util.Iterator<? extends E> A00;
            public final java.util.Iterator<? extends E> A01;

            {
                this.A00 = com.facebook.ads.redexgen.core.C0585Ax.this.A00.iterator();
                this.A01 = com.facebook.ads.redexgen.core.C0585Ax.this.A01.iterator();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC0609Bv
            @javax.annotation.CheckForNull
            public final E A02() {
                if (this.A00.hasNext()) {
                    return this.A00.next();
                }
                while (this.A01.hasNext()) {
                    E next = this.A01.next();
                    if (!com.facebook.ads.redexgen.core.C0585Ax.this.A00.contains(next)) {
                        return next;
                    }
                }
                E e = A01();
                return e;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return this.A00.contains(object) || this.A01.contains(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty() && this.A01.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int size = this.A00.size();
        java.util.Iterator<E> it = this.A01.iterator();
        while (it.hasNext()) {
            if (!this.A00.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}
