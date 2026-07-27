package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f5970a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5971b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5972c;

    public G(int i3, int i4, int i5) {
        this.f5970a = i3;
        this.f5971b = i4;
        this.f5972c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g3 = (G) obj;
        return this.f5970a == g3.f5970a && this.f5971b == g3.f5971b && this.f5972c == g3.f5972c;
    }

    public final int hashCode() {
        return Q7.a(this.f5972c) + ((Q7.a(this.f5971b) + (Q7.a(this.f5970a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f5970a) + ", canTrackHoaid=" + H.a(this.f5971b) + ", canTrackYandexAdvId=" + H.a(this.f5972c) + ')';
    }
}
