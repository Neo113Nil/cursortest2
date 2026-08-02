package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cp1 extends sf1 implements ListIterator {

    /* JADX INFO: renamed from: k */
    public final int f1415k;

    /* JADX INFO: renamed from: l */
    public int f1416l;

    /* JADX INFO: renamed from: m */
    public final fr1 f1417m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp1(fr1 fr1Var, int i) {
        super(1);
        int size = fr1Var.size();
        if (i < 0 || i > size) {
            C0270h1.m2193i(AbstractC0959zp.m5977F(i, size, "index"));
            throw null;
        }
        this.f1415k = size;
        this.f1416l = i;
        this.f1417m = fr1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1030a(int i) {
        return this.f1417m.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f1416l < this.f1415k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1416l > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f1416l;
        this.f1416l = i + 1;
        return m1030a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1416l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f1416l - 1;
        this.f1416l = i;
        return m1030a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1416l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
