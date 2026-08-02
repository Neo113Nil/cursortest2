package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: ko */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0403ko implements xg0 {

    /* JADX INFO: renamed from: b */
    public final xg0 f4466b;

    /* JADX INFO: renamed from: c */
    public final xg0 f4467c;

    public C0403ko(xg0 xg0Var, xg0 xg0Var2) {
        this.f4466b = xg0Var;
        this.f4467c = xg0Var2;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo1038b(MessageDigest messageDigest) {
        this.f4466b.mo1038b(messageDigest);
        this.f4467c.mo1038b(messageDigest);
    }

    @Override // p000.xg0
    public final boolean equals(Object obj) {
        if (obj instanceof C0403ko) {
            C0403ko c0403ko = (C0403ko) obj;
            if (this.f4466b.equals(c0403ko.f4466b) && this.f4467c.equals(c0403ko.f4467c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.xg0
    public final int hashCode() {
        return this.f4467c.hashCode() + (this.f4466b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f4466b + ", signature=" + this.f4467c + '}';
    }
}
