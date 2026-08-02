package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u01 extends qc0 {

    /* JADX INFO: renamed from: l */
    public final transient Object[] f7636l;

    /* JADX INFO: renamed from: m */
    public final transient int f7637m;

    /* JADX INFO: renamed from: n */
    public final transient int f7638n;

    public u01(int i, int i2, Object[] objArr) {
        this.f7636l = objArr;
        this.f7637m = i;
        this.f7638n = i2;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a90.m124h(i, this.f7638n);
        Object obj = this.f7636l[(i * 2) + this.f7637m];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7638n;
    }
}
