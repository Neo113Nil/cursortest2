package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class up1 implements ht1 {

    /* JADX INFO: renamed from: j */
    public final boolean f7884j;

    public up1(Boolean bool) {
        this.f7884j = bool == null ? false : bool.booleanValue();
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: b */
    public final Iterator mo750b() {
        return null;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: e */
    public final Boolean mo752e() {
        return Boolean.valueOf(this.f7884j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up1) && this.f7884j == ((up1) obj).f7884j;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: f */
    public final String mo753f() {
        return Boolean.toString(this.f7884j);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: g */
    public final ht1 mo754g(String str, f71 f71Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f7884j;
        if (zEquals) {
            return new lt1(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: h */
    public final Double mo755h() {
        return Double.valueOf(true != this.f7884j ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f7884j).hashCode();
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: p */
    public final ht1 mo758p() {
        return new up1(Boolean.valueOf(this.f7884j));
    }

    public final String toString() {
        return String.valueOf(this.f7884j);
    }
}
