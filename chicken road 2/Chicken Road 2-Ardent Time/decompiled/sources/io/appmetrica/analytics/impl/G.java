package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f4309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4311c;

    public G(int i2, int i3, int i4) {
        this.f4309a = i2;
        this.f4310b = i3;
        this.f4311c = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.impl.G.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        io.appmetrica.analytics.impl.G g2 = (io.appmetrica.analytics.impl.G) obj;
        return this.f4309a == g2.f4309a && this.f4310b == g2.f4310b && this.f4311c == g2.f4311c;
    }

    public final int hashCode() {
        return io.appmetrica.analytics.impl.K7.a(this.f4311c) + ((io.appmetrica.analytics.impl.K7.a(this.f4310b) + (io.appmetrica.analytics.impl.K7.a(this.f4309a) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + io.appmetrica.analytics.impl.H.a(this.f4309a) + ", canTrackHoaid=" + io.appmetrica.analytics.impl.H.a(this.f4310b) + ", canTrackYandexAdvId=" + io.appmetrica.analytics.impl.H.a(this.f4311c) + ')';
    }
}
