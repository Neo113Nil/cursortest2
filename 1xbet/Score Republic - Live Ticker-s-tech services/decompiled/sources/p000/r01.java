package p000;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r01 extends qc0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ s01 f6648l;

    public r01(s01 s01Var) {
        this.f6648l = s01Var;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        s01 s01Var = this.f6648l;
        a90.m124h(i, s01Var.f7006o);
        Object[] objArr = s01Var.f7005n;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6648l.f7006o;
    }
}
