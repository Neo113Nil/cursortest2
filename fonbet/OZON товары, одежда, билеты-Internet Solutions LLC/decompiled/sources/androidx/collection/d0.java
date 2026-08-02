package androidx.collection;

import gd.InterfaceC6712a;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class d0 implements Iterator<Object>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private int f38695a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a0<Object> f38696b;

    d0(a0<Object> a0Var) {
        this.f38696b = a0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38695a < this.f38696b.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f38695a;
        this.f38695a = i11 + 1;
        return this.f38696b.f(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
