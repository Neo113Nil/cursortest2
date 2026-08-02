package p4;

/* loaded from: classes.dex */
public final class Y extends C2268h {

    /* renamed from: s, reason: collision with root package name */
    public final b0 f18769s;

    public Y(a4.c cVar, b0 b0Var) {
        super(1, cVar);
        this.f18769s = b0Var;
    }

    @Override // p4.C2268h
    public final Throwable p(b0 b0Var) {
        Throwable c5;
        b0 b0Var2 = this.f18769s;
        b0Var2.getClass();
        Object obj = b0.f18780k.get(b0Var2);
        return (!(obj instanceof a0) || (c5 = ((a0) obj).c()) == null) ? obj instanceof C2275o ? ((C2275o) obj).f18812a : b0Var.s() : c5;
    }

    @Override // p4.C2268h
    public final String y() {
        return "AwaitContinuation";
    }
}
