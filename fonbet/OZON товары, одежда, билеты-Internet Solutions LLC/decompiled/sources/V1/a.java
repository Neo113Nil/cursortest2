package V1;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f27899a;

    /* renamed from: V1.a$a, reason: collision with other inner class name */
    public static final class C0569a {
    }

    private /* synthetic */ a(float f7) {
        this.f27899a = f7;
    }

    public static final /* synthetic */ a a(float f7) {
        return new a(f7);
    }

    public final /* synthetic */ float b() {
        return this.f27899a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f27899a, ((a) obj).f27899a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27899a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f27899a + ')';
    }
}
