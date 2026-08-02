package p000;

import com.google.firebase.inappmessaging.model.MessageType;

/* JADX INFO: renamed from: db */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0132db extends zc0 {

    /* JADX INFO: renamed from: c */
    public final xc1 f1604c;

    /* JADX INFO: renamed from: d */
    public final xc1 f1605d;

    /* JADX INFO: renamed from: e */
    public final cc0 f1606e;

    /* JADX INFO: renamed from: f */
    public final C0047b2 f1607f;

    /* JADX INFO: renamed from: g */
    public final String f1608g;

    public C0132db(m81 m81Var, xc1 xc1Var, xc1 xc1Var2, cc0 cc0Var, C0047b2 c0047b2, String str) {
        super(m81Var, MessageType.BANNER);
        this.f1604c = xc1Var;
        this.f1605d = xc1Var2;
        this.f1606e = cc0Var;
        this.f1607f = c0047b2;
        this.f1608g = str;
    }

    @Override // p000.zc0
    /* JADX INFO: renamed from: a */
    public final cc0 mo1147a() {
        return this.f1606e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0132db)) {
            return false;
        }
        C0132db c0132db = (C0132db) obj;
        C0047b2 c0047b2 = c0132db.f1607f;
        cc0 cc0Var = c0132db.f1606e;
        xc1 xc1Var = c0132db.f1605d;
        if (hashCode() != c0132db.hashCode()) {
            return false;
        }
        xc1 xc1Var2 = this.f1605d;
        if ((xc1Var2 == null && xc1Var != null) || (xc1Var2 != null && !xc1Var2.equals(xc1Var))) {
            return false;
        }
        cc0 cc0Var2 = this.f1606e;
        if ((cc0Var2 == null && cc0Var != null) || (cc0Var2 != null && !cc0Var2.equals(cc0Var))) {
            return false;
        }
        C0047b2 c0047b3 = this.f1607f;
        return (c0047b3 != null || c0047b2 == null) && (c0047b3 == null || c0047b3.equals(c0047b2)) && this.f1604c.equals(c0132db.f1604c) && this.f1608g.equals(c0132db.f1608g);
    }

    public final int hashCode() {
        xc1 xc1Var = this.f1605d;
        int iHashCode = xc1Var != null ? xc1Var.hashCode() : 0;
        cc0 cc0Var = this.f1606e;
        int iHashCode2 = cc0Var != null ? cc0Var.f1215a.hashCode() : 0;
        C0047b2 c0047b2 = this.f1607f;
        return this.f1608g.hashCode() + this.f1604c.hashCode() + iHashCode + iHashCode2 + (c0047b2 != null ? c0047b2.hashCode() : 0);
    }
}
