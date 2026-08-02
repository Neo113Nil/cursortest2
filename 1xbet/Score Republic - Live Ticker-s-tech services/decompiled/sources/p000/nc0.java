package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nc0 extends sf1 implements ListIterator {

    /* JADX INFO: renamed from: k */
    public final int f5369k;

    /* JADX INFO: renamed from: l */
    public int f5370l;

    /* JADX INFO: renamed from: m */
    public final qc0 f5371m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(qc0 qc0Var, int i) {
        super(0);
        int size = qc0Var.size();
        a90.m129m(i, size);
        this.f5369k = size;
        this.f5370l = i;
        this.f5371m = qc0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m3514a(int i) {
        return this.f5371m.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5370l < this.f5369k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5370l > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f5370l;
        this.f5370l = i + 1;
        return m3514a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5370l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5370l - 1;
        this.f5370l = i;
        return m3514a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5370l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
