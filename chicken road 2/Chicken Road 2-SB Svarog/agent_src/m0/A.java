package m0;

/* loaded from: classes.dex */
public final class A implements H {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f885b;

    public A(boolean z2) {
        this.f885b = z2;
    }

    @Override // m0.H
    public final boolean b() {
        return this.f885b;
    }

    @Override // m0.H
    public final U f() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f885b ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
