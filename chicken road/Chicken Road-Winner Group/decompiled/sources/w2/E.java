package w2;

/* loaded from: classes.dex */
public final class E implements L {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10465a;

    public E(boolean z3) {
        this.f10465a = z3;
    }

    @Override // w2.L
    public final boolean a() {
        return this.f10465a;
    }

    @Override // w2.L
    public final a0 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f10465a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
