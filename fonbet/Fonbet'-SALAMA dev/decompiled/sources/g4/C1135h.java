package g4;

/* renamed from: g4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1135h {

    /* renamed from: a, reason: collision with root package name */
    public final C1144q f13204a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13205b;

    public C1135h(C1144q c1144q, boolean z4) {
        this.f13204a = c1144q;
        this.f13205b = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1135h)) {
            return false;
        }
        C1135h c1135h = (C1135h) obj;
        return c1135h.f13204a.equals(this.f13204a) && c1135h.f13205b == this.f13205b;
    }

    public final int hashCode() {
        return ((this.f13204a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f13205b).hashCode();
    }
}
