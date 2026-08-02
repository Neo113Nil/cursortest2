package D6;

/* loaded from: classes2.dex */
public final class Q implements InterfaceC0112b0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1801a;

    public Q(boolean z4) {
        this.f1801a = z4;
    }

    @Override // D6.InterfaceC0112b0
    public final u0 c() {
        return null;
    }

    @Override // D6.InterfaceC0112b0
    public final boolean isActive() {
        return this.f1801a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f1801a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
