package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class it1 implements ht1 {

    /* JADX INFO: renamed from: j */
    public final String f3658j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f3659k;

    public it1(String str, ArrayList arrayList) {
        this.f3658j = str;
        ArrayList arrayList2 = new ArrayList();
        this.f3659k = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: b */
    public final Iterator mo750b() {
        return null;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: e */
    public final Boolean mo752e() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it1)) {
            return false;
        }
        it1 it1Var = (it1) obj;
        String str = it1Var.f3658j;
        String str2 = this.f3658j;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f3659k.equals(it1Var.f3659k);
        }
        return false;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: f */
    public final String mo753f() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: g */
    public final ht1 mo754g(String str, f71 f71Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: h */
    public final Double mo755h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.f3658j;
        return this.f3659k.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: p */
    public final ht1 mo758p() {
        return this;
    }
}
