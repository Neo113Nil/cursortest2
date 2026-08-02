package p000;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vf1 extends AbstractList implements jh0, RandomAccess {

    /* JADX INFO: renamed from: j */
    public final ih0 f8194j;

    public vf1(ih0 ih0Var) {
        this.f8194j = ih0Var;
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: a */
    public final void mo2637a(C0762ud c0762ud) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f8194j.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        uf1 uf1Var = new uf1();
        uf1Var.f7817k = this.f8194j.iterator();
        return uf1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        tf1 tf1Var = new tf1();
        tf1Var.f7445j = this.f8194j.listIterator(i);
        return tf1Var;
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: n */
    public final Object mo2639n(int i) {
        return this.f8194j.f3569k.get(i);
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: o */
    public final List mo2640o() {
        return Collections.unmodifiableList(this.f8194j.f3569k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8194j.f3569k.size();
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: k */
    public final jh0 mo2638k() {
        return this;
    }
}
