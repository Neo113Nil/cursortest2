package p000;

import com.google.firebase.inappmessaging.model.MessageType;

/* JADX INFO: renamed from: gf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0247gf extends zc0 {

    /* JADX INFO: renamed from: c */
    public final xc1 f2713c;

    /* JADX INFO: renamed from: d */
    public final xc1 f2714d;

    /* JADX INFO: renamed from: e */
    public final String f2715e;

    /* JADX INFO: renamed from: f */
    public final C0047b2 f2716f;

    /* JADX INFO: renamed from: g */
    public final C0047b2 f2717g;

    /* JADX INFO: renamed from: h */
    public final cc0 f2718h;

    /* JADX INFO: renamed from: i */
    public final cc0 f2719i;

    public C0247gf(m81 m81Var, xc1 xc1Var, xc1 xc1Var2, cc0 cc0Var, cc0 cc0Var2, String str, C0047b2 c0047b2, C0047b2 c0047b3) {
        super(m81Var, MessageType.CARD);
        this.f2713c = xc1Var;
        this.f2714d = xc1Var2;
        this.f2718h = cc0Var;
        this.f2719i = cc0Var2;
        this.f2715e = str;
        this.f2716f = c0047b2;
        this.f2717g = c0047b3;
    }

    @Override // p000.zc0
    /* JADX INFO: renamed from: a */
    public final cc0 mo1147a() {
        return this.f2718h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0247gf)) {
            return false;
        }
        C0247gf c0247gf = (C0247gf) obj;
        cc0 cc0Var = c0247gf.f2719i;
        cc0 cc0Var2 = c0247gf.f2718h;
        C0047b2 c0047b2 = c0247gf.f2717g;
        xc1 xc1Var = c0247gf.f2714d;
        if (hashCode() != c0247gf.hashCode()) {
            return false;
        }
        xc1 xc1Var2 = this.f2714d;
        if ((xc1Var2 == null && xc1Var != null) || (xc1Var2 != null && !xc1Var2.equals(xc1Var))) {
            return false;
        }
        C0047b2 c0047b3 = this.f2717g;
        if ((c0047b3 == null && c0047b2 != null) || (c0047b3 != null && !c0047b3.equals(c0047b2))) {
            return false;
        }
        cc0 cc0Var3 = this.f2718h;
        if ((cc0Var3 == null && cc0Var2 != null) || (cc0Var3 != null && !cc0Var3.equals(cc0Var2))) {
            return false;
        }
        cc0 cc0Var4 = this.f2719i;
        return (cc0Var4 != null || cc0Var == null) && (cc0Var4 == null || cc0Var4.equals(cc0Var)) && this.f2713c.equals(c0247gf.f2713c) && this.f2716f.equals(c0247gf.f2716f) && this.f2715e.equals(c0247gf.f2715e);
    }

    public final int hashCode() {
        xc1 xc1Var = this.f2714d;
        int iHashCode = xc1Var != null ? xc1Var.hashCode() : 0;
        C0047b2 c0047b2 = this.f2717g;
        int iHashCode2 = c0047b2 != null ? c0047b2.hashCode() : 0;
        cc0 cc0Var = this.f2718h;
        int iHashCode3 = cc0Var != null ? cc0Var.f1215a.hashCode() : 0;
        cc0 cc0Var2 = this.f2719i;
        return this.f2716f.hashCode() + this.f2715e.hashCode() + this.f2713c.hashCode() + iHashCode + iHashCode2 + iHashCode3 + (cc0Var2 != null ? cc0Var2.f1215a.hashCode() : 0);
    }
}
