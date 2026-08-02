package u;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2470q f19670a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2477y f19671b;

    public F0(AbstractC2470q abstractC2470q, InterfaceC2477y interfaceC2477y) {
        this.f19670a = abstractC2470q;
        this.f19671b = interfaceC2477y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return kotlin.jvm.internal.l.a(this.f19670a, f02.f19670a) && kotlin.jvm.internal.l.a(this.f19671b, f02.f19671b);
    }

    public final int hashCode() {
        return (this.f19671b.hashCode() + (this.f19670a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f19670a + ", easing=" + this.f19671b + ", arcMode=ArcMode(value=0))";
    }
}
