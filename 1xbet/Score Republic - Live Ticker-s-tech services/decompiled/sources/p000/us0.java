package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 implements xg0 {

    /* JADX INFO: renamed from: b */
    public final Object f7901b;

    public us0(Object obj) {
        o80.m3647h(obj, "Argument must not be null");
        this.f7901b = obj;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo1038b(MessageDigest messageDigest) {
        messageDigest.update(this.f7901b.toString().getBytes(xg0.f8961a));
    }

    @Override // p000.xg0
    public final boolean equals(Object obj) {
        if (obj instanceof us0) {
            return this.f7901b.equals(((us0) obj).f7901b);
        }
        return false;
    }

    @Override // p000.xg0
    public final int hashCode() {
        return this.f7901b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f7901b + '}';
    }
}
