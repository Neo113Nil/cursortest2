package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t01 extends sc0 {

    /* JADX INFO: renamed from: m */
    public final transient v01 f7248m;

    /* JADX INFO: renamed from: n */
    public final transient u01 f7249n;

    public t01(v01 v01Var, u01 u01Var) {
        this.f7248m = v01Var;
        this.f7249n = u01Var;
    }

    @Override // p000.sc0, p000.lc0
    /* JADX INFO: renamed from: b */
    public final qc0 mo3202b() {
        return this.f7249n;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: c */
    public final int mo3203c(int i, Object[] objArr) {
        return this.f7249n.mo3203c(i, objArr);
    }

    @Override // p000.lc0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7248m.get(obj) != null;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return true;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: h */
    public final sf1 iterator() {
        return this.f7249n.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7248m.f7991o;
    }
}
