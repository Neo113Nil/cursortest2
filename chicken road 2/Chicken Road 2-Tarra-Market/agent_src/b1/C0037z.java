package b1;

/* renamed from: b1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037z implements G {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f695a;

    public C0037z(boolean z2) {
        this.f695a = z2;
    }

    @Override // b1.G
    public final boolean b() {
        return this.f695a;
    }

    @Override // b1.G
    public final T d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f695a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
