package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nq1 implements ht1 {

    /* JADX INFO: renamed from: j */
    public final ht1 f5502j;

    /* JADX INFO: renamed from: k */
    public final String f5503k;

    public nq1(String str) {
        this.f5502j = ht1.f3330b;
        this.f5503k = str;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: b */
    public final Iterator mo750b() {
        return null;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: e */
    public final Boolean mo752e() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nq1)) {
            return false;
        }
        nq1 nq1Var = (nq1) obj;
        return this.f5503k.equals(nq1Var.f5503k) && this.f5502j.equals(nq1Var.f5502j);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: f */
    public final String mo753f() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: g */
    public final ht1 mo754g(String str, f71 f71Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: h */
    public final Double mo755h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return this.f5502j.hashCode() + (this.f5503k.hashCode() * 31);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: p */
    public final ht1 mo758p() {
        return new nq1(this.f5503k, this.f5502j.mo758p());
    }

    public nq1(String str, ht1 ht1Var) {
        this.f5502j = ht1Var;
        this.f5503k = str;
    }
}
