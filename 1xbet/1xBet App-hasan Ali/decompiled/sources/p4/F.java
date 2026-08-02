package p4;

/* loaded from: classes.dex */
public final class F implements O {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f18744k;

    public F(boolean z3) {
        this.f18744k = z3;
    }

    @Override // p4.O
    public final boolean b() {
        return this.f18744k;
    }

    @Override // p4.O
    public final d0 d() {
        return null;
    }

    public final String toString() {
        return L1.a.p(new StringBuilder("Empty{"), this.f18744k ? "Active" : "New", '}');
    }
}
