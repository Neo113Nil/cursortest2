package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 implements ListIterator {

    /* JADX INFO: renamed from: j */
    public boolean f1668j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ListIterator f1669k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ej0 f1670l;

    public dj0(ej0 ej0Var, ListIterator listIterator) {
        this.f1670l = ej0Var;
        this.f1669k = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f1669k;
        listIterator.add(obj);
        listIterator.previous();
        this.f1668j = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1669k.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1669k.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f1669k;
        if (!listIterator.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f1668j = true;
        return listIterator.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1670l.m1430b(this.f1669k.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f1669k;
        if (!listIterator.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1668j = true;
        return listIterator.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a90.m132p("no calls to next() since the last call to remove()", this.f1668j);
        this.f1669k.remove();
        this.f1668j = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a90.m133q(this.f1668j);
        this.f1669k.set(obj);
    }
}
