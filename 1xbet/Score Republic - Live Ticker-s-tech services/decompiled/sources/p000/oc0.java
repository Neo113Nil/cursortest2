package p000;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class oc0 extends qc0 {

    /* JADX INFO: renamed from: l */
    public final transient qc0 f5699l;

    public oc0(qc0 qc0Var) {
        this.f5699l = qc0Var;
    }

    @Override // p000.qc0, p000.lc0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5699l.contains(obj);
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return this.f5699l.mo3207g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        qc0 qc0Var = this.f5699l;
        a90.m124h(i, qc0Var.size());
        return qc0Var.get((qc0Var.size() - 1) - i);
    }

    @Override // p000.qc0, java.util.List
    public final int indexOf(Object obj) {
        qc0 qc0Var = this.f5699l;
        int iLastIndexOf = qc0Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (qc0Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p000.qc0, p000.lc0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.qc0, java.util.List
    public final int lastIndexOf(Object obj) {
        qc0 qc0Var = this.f5699l;
        int iIndexOf = qc0Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (qc0Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // p000.qc0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p000.qc0
    /* JADX INFO: renamed from: s */
    public final qc0 mo3680s() {
        return this.f5699l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5699l.size();
    }

    @Override // p000.qc0, java.util.List
    /* JADX INFO: renamed from: t */
    public final qc0 subList(int i, int i2) {
        qc0 qc0Var = this.f5699l;
        a90.m130n(i, i2, qc0Var.size());
        return qc0Var.subList(qc0Var.size() - i2, qc0Var.size() - i).mo3680s();
    }

    @Override // p000.qc0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
