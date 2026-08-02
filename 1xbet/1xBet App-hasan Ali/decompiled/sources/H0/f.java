package H0;

import l4.C2059a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f2072b = new f(new C2059a(0.0f, 0.0f));

    /* renamed from: a, reason: collision with root package name */
    public final C2059a f2073a;

    public f(C2059a c2059a) {
        this.f2073a = c2059a;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final C2059a a() {
        return this.f2073a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        return this.f2073a.equals(fVar.f2073a);
    }

    public final int hashCode() {
        return (this.f2073a.hashCode() + (Float.floatToIntBits(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f2073a + ", steps=0)";
    }
}
