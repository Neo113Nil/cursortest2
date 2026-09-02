package z1;

/* loaded from: classes.dex */
public final class E implements z1.L {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8524a;

    public E(boolean z2) {
        this.f8524a = z2;
    }

    @Override // z1.L
    public final boolean b() {
        return this.f8524a;
    }

    @Override // z1.L
    public final z1.a0 d() {
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Empty{");
        sb.append(this.f8524a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
