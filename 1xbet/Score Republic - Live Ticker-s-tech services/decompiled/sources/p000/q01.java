package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q01 extends qc0 {

    /* JADX INFO: renamed from: n */
    public static final q01 f6303n = new q01(0, new Object[0]);

    /* JADX INFO: renamed from: l */
    public final transient Object[] f6304l;

    /* JADX INFO: renamed from: m */
    public final transient int f6305m;

    public q01(int i, Object[] objArr) {
        this.f6304l = objArr;
        this.f6305m = i;
    }

    @Override // p000.qc0, p000.lc0
    /* JADX INFO: renamed from: c */
    public final int mo3203c(int i, Object[] objArr) {
        Object[] objArr2 = this.f6304l;
        int i2 = this.f6305m;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: d */
    public final Object[] mo3204d() {
        return this.f6304l;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: e */
    public final int mo3205e() {
        return this.f6305m;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: f */
    public final int mo3206f() {
        return 0;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a90.m124h(i, this.f6305m);
        Object obj = this.f6304l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6305m;
    }
}
