package p000;

import com.google.firebase.inappmessaging.model.MessageType;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 extends zc0 {

    /* JADX INFO: renamed from: c */
    public final xc1 f1793c;

    /* JADX INFO: renamed from: d */
    public final xc1 f1794d;

    /* JADX INFO: renamed from: e */
    public final cc0 f1795e;

    /* JADX INFO: renamed from: f */
    public final C0047b2 f1796f;

    /* JADX INFO: renamed from: g */
    public final String f1797g;

    public dq0(m81 m81Var, xc1 xc1Var, xc1 xc1Var2, cc0 cc0Var, C0047b2 c0047b2, String str) {
        super(m81Var, MessageType.MODAL);
        this.f1793c = xc1Var;
        this.f1794d = xc1Var2;
        this.f1795e = cc0Var;
        this.f1796f = c0047b2;
        this.f1797g = str;
    }

    @Override // p000.zc0
    /* JADX INFO: renamed from: a */
    public final cc0 mo1147a() {
        return this.f1795e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dq0)) {
            return false;
        }
        dq0 dq0Var = (dq0) obj;
        cc0 cc0Var = dq0Var.f1795e;
        C0047b2 c0047b2 = dq0Var.f1796f;
        xc1 xc1Var = dq0Var.f1794d;
        if (hashCode() != dq0Var.hashCode()) {
            return false;
        }
        xc1 xc1Var2 = this.f1794d;
        if ((xc1Var2 == null && xc1Var != null) || (xc1Var2 != null && !xc1Var2.equals(xc1Var))) {
            return false;
        }
        C0047b2 c0047b3 = this.f1796f;
        if ((c0047b3 == null && c0047b2 != null) || (c0047b3 != null && !c0047b3.equals(c0047b2))) {
            return false;
        }
        cc0 cc0Var2 = this.f1795e;
        return (cc0Var2 != null || cc0Var == null) && (cc0Var2 == null || cc0Var2.equals(cc0Var)) && this.f1793c.equals(dq0Var.f1793c) && this.f1797g.equals(dq0Var.f1797g);
    }

    public final int hashCode() {
        xc1 xc1Var = this.f1794d;
        int iHashCode = xc1Var != null ? xc1Var.hashCode() : 0;
        C0047b2 c0047b2 = this.f1796f;
        int iHashCode2 = c0047b2 != null ? c0047b2.hashCode() : 0;
        cc0 cc0Var = this.f1795e;
        return this.f1797g.hashCode() + this.f1793c.hashCode() + iHashCode + iHashCode2 + (cc0Var != null ? cc0Var.f1215a.hashCode() : 0);
    }
}
