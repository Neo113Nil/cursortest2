package p000;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pc0 extends qc0 {

    /* JADX INFO: renamed from: l */
    public final transient int f6084l;

    /* JADX INFO: renamed from: m */
    public final transient int f6085m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ qc0 f6086n;

    public pc0(qc0 qc0Var, int i, int i2) {
        this.f6086n = qc0Var;
        this.f6084l = i;
        this.f6085m = i2;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: d */
    public final Object[] mo3204d() {
        return this.f6086n.mo3204d();
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: e */
    public final int mo3205e() {
        return this.f6086n.mo3206f() + this.f6084l + this.f6085m;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: f */
    public final int mo3206f() {
        return this.f6086n.mo3206f() + this.f6084l;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a90.m124h(i, this.f6085m);
        return this.f6086n.get(i + this.f6084l);
    }

    @Override // p000.qc0, p000.lc0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.qc0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6085m;
    }

    @Override // p000.qc0, java.util.List
    /* JADX INFO: renamed from: t */
    public final qc0 subList(int i, int i2) {
        a90.m130n(i, i2, this.f6085m);
        int i3 = this.f6084l;
        return this.f6086n.subList(i + i3, i2 + i3);
    }

    @Override // p000.qc0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
