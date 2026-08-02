package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tp1 extends fr1 {

    /* JADX INFO: renamed from: l */
    public final transient fr1 f7560l;

    public tp1(fr1 fr1Var) {
        this.f7560l = fr1Var;
    }

    @Override // p000.fr1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f7560l.contains(obj);
    }

    @Override // p000.fr1
    /* JADX INFO: renamed from: f */
    public final fr1 mo1887f() {
        return this.f7560l;
    }

    @Override // p000.fr1, java.util.List
    /* JADX INFO: renamed from: g */
    public final fr1 subList(int i, int i2) {
        fr1 fr1Var = this.f7560l;
        AbstractC0959zp.m5976E(i, i2, fr1Var.size());
        return fr1Var.subList(fr1Var.size() - i2, fr1Var.size() - i).mo1887f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        fr1 fr1Var = this.f7560l;
        AbstractC0959zp.m5975D(i, fr1Var.size());
        return fr1Var.get((fr1Var.size() - 1) - i);
    }

    @Override // p000.fr1, java.util.List
    public final int indexOf(Object obj) {
        fr1 fr1Var = this.f7560l;
        int iLastIndexOf = fr1Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (fr1Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p000.fr1, java.util.List
    public final int lastIndexOf(Object obj) {
        fr1 fr1Var = this.f7560l;
        int iIndexOf = fr1Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (fr1Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7560l.size();
    }
}
