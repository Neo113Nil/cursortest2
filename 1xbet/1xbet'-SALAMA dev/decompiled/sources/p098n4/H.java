package p098n4;

import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0934g f15376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f15377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0929b f15378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15379e;

    public H(long j, C0934g c0934g, r rVar, boolean z4) {
        this.f15375a = j;
        this.f15376b = c0934g;
        this.f15377c = rVar;
        this.f15378d = null;
        this.f15379e = z4;
    }

    public final C0929b a() {
        C0929b c0929b = this.f15378d;
        if (c0929b != null) {
            return c0929b;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public final r b() {
        r rVar = this.f15377c;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public final boolean c() {
        return this.f15377c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h6 = (H) obj;
        if (this.f15375a != h6.f15375a || !this.f15376b.equals(h6.f15376b) || this.f15379e != h6.f15379e) {
            return false;
        }
        r rVar = h6.f15377c;
        r rVar2 = this.f15377c;
        if (rVar2 == null ? rVar != null : !rVar2.equals(rVar)) {
            return false;
        }
        C0929b c0929b = h6.f15378d;
        C0929b c0929b2 = this.f15378d;
        return c0929b2 == null ? c0929b == null : c0929b2.equals(c0929b);
    }

    public final int hashCode() {
        int iHashCode = (this.f15376b.hashCode() + ((Boolean.valueOf(this.f15379e).hashCode() + (Long.valueOf(this.f15375a).hashCode() * 31)) * 31)) * 31;
        r rVar = this.f15377c;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        C0929b c0929b = this.f15378d;
        return iHashCode2 + (c0929b != null ? c0929b.hashCode() : 0);
    }

    public final String toString() {
        return "UserWriteRecord{id=" + this.f15375a + " path=" + this.f15376b + " visible=" + this.f15379e + " overwrite=" + this.f15377c + " merge=" + this.f15378d + "}";
    }

    public H(long j, C0929b c0929b, C0934g c0934g) {
        this.f15375a = j;
        this.f15376b = c0934g;
        this.f15377c = null;
        this.f15378d = c0929b;
        this.f15379e = true;
    }
}
