package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s01 extends sc0 {

    /* JADX INFO: renamed from: m */
    public final transient v01 f7004m;

    /* JADX INFO: renamed from: n */
    public final transient Object[] f7005n;

    /* JADX INFO: renamed from: o */
    public final transient int f7006o;

    public s01(v01 v01Var, Object[] objArr, int i) {
        this.f7004m = v01Var;
        this.f7005n = objArr;
        this.f7006o = i;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: c */
    public final int mo3203c(int i, Object[] objArr) {
        return mo3202b().mo3203c(i, objArr);
    }

    @Override // p000.lc0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7004m.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return true;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: h */
    public final sf1 iterator() {
        return mo3202b().listIterator(0);
    }

    @Override // p000.sc0
    /* JADX INFO: renamed from: q */
    public final qc0 mo4467q() {
        return new r01(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7006o;
    }
}
