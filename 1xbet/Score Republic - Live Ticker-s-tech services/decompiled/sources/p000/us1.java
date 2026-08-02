package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class us1 extends fr1 {

    /* JADX INFO: renamed from: n */
    public static final us1 f7902n = new us1(0, new Object[0]);

    /* JADX INFO: renamed from: l */
    public final transient Object[] f7903l;

    /* JADX INFO: renamed from: m */
    public final transient int f7904m;

    public us1(int i, Object[] objArr) {
        this.f7903l = objArr;
        this.f7904m = i;
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: b */
    public final Object[] mo730b() {
        return this.f7903l;
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: c */
    public final int mo731c() {
        return 0;
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: d */
    public final int mo732d() {
        return this.f7904m;
    }

    @Override // p000.fr1, p000.bo1
    /* JADX INFO: renamed from: e */
    public final int mo733e(Object[] objArr) {
        Object[] objArr2 = this.f7903l;
        int i = this.f7904m;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0959zp.m5975D(i, this.f7904m);
        Object obj = this.f7903l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7904m;
    }
}
