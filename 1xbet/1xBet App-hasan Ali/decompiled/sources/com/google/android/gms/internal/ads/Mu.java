package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class Mu extends Du implements ListIterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Nu f10742o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mu(Nu nu) {
        super(nu);
        this.f10742o = nu;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        Nu nu = this.f10742o;
        boolean isEmpty = nu.isEmpty();
        a();
        ((ListIterator) this.f8410l).add(obj);
        nu.f10868p.f15614o++;
        if (isEmpty) {
            nu.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f8410l).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f8410l).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f8410l).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f8410l).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f8410l).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mu(Nu nu, int i) {
        super(nu, ((List) nu.f10864l).listIterator(i));
        this.f10742o = nu;
    }
}
