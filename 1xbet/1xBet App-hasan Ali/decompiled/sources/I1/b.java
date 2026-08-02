package I1;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2565a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2566b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2567c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2568d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2569e;

    public b(int i, float f, float f5, float f6, long j5) {
        this.f2565a = i;
        this.f2566b = f;
        this.f2567c = f5;
        this.f2568d = f6;
        this.f2569e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f2567c == bVar.f2567c && this.f2568d == bVar.f2568d && this.f2566b == bVar.f2566b && this.f2565a == bVar.f2565a && this.f2569e == bVar.f2569e;
        }
        return false;
    }

    public final int hashCode() {
        int n5 = (AbstractC2107A.n(this.f2566b, AbstractC2107A.n(this.f2568d, Float.floatToIntBits(this.f2567c) * 31, 31), 31) + this.f2565a) * 31;
        long j5 = this.f2569e;
        return n5 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f2567c + ", touchY=" + this.f2568d + ", progress=" + this.f2566b + ", swipeEdge=" + this.f2565a + ", frameTimeMillis=" + this.f2569e + ')';
    }
}
