package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class uu0 implements xg0 {

    /* JADX INFO: renamed from: b */
    public final C0910yd f7909b = new C0910yd(0);

    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo1038b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0910yd c0910yd = this.f7909b;
            if (i >= c0910yd.f8453l) {
                return;
            }
            ru0 ru0Var = (ru0) c0910yd.m5299f(i);
            Object objM5303j = this.f7909b.m5303j(i);
            qu0 qu0Var = ru0Var.f6971b;
            if (ru0Var.f6973d == null) {
                ru0Var.f6973d = ru0Var.f6972c.getBytes(xg0.f8961a);
            }
            qu0Var.mo2594i(ru0Var.f6973d, objM5303j, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m4955c(ru0 ru0Var) {
        C0910yd c0910yd = this.f7909b;
        return c0910yd.containsKey(ru0Var) ? c0910yd.get(ru0Var) : ru0Var.f6970a;
    }

    @Override // p000.xg0
    public final boolean equals(Object obj) {
        if (obj instanceof uu0) {
            return this.f7909b.equals(((uu0) obj).f7909b);
        }
        return false;
    }

    @Override // p000.xg0
    public final int hashCode() {
        return this.f7909b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f7909b + '}';
    }
}
