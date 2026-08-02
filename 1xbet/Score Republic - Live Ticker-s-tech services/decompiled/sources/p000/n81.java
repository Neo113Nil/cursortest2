package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n81 extends sc0 {

    /* JADX INFO: renamed from: m */
    public final transient Object f5334m;

    public n81(Object obj) {
        obj.getClass();
        this.f5334m = obj;
    }

    @Override // p000.sc0, p000.lc0
    /* JADX INFO: renamed from: b */
    public final qc0 mo3202b() {
        nc0 nc0Var = qc0.f6464k;
        Object[] objArr = {this.f5334m};
        oa2.m3655b(1, objArr);
        return qc0.m4055j(1, objArr);
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: c */
    public final int mo3203c(int i, Object[] objArr) {
        objArr[i] = this.f5334m;
        return i + 1;
    }

    @Override // p000.lc0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5334m.equals(obj);
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return false;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: h */
    public final sf1 iterator() {
        return new qf0(this.f5334m);
    }

    @Override // p000.sc0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5334m.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f5334m.toString() + ']';
    }
}
