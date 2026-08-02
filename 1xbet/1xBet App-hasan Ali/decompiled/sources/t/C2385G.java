package t;

import u.z0;

/* renamed from: t.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2385G {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f19344a;

    public C2385G(z0 z0Var) {
        this.f19344a = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2385G)) {
            return false;
        }
        C2385G c2385g = (C2385G) obj;
        c2385g.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && this.f19344a.equals(c2385g.f19344a);
    }

    public final int hashCode() {
        return this.f19344a.hashCode() + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f19344a + ')';
    }
}
