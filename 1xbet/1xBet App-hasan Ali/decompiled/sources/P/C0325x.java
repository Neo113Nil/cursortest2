package P;

/* renamed from: P.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325x {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0319u f4574a;

    public C0325x(InterfaceC0319u interfaceC0319u) {
        this.f4574a = interfaceC0319u;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0325x) {
            return kotlin.jvm.internal.l.a(this.f4574a, ((C0325x) obj).f4574a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4574a.hashCode() * 31;
    }
}
