package D6;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends C0130m {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s0 f1845z;

    public j0(s0 s0Var, p065i6.d dVar) {
        super(1, dVar);
        this.f1845z = s0Var;
    }

    @Override // D6.C0130m
    public final Throwable q(s0 s0Var) {
        Throwable thB;
        Object objX = this.f1845z.x();
        if (!(objX instanceof l0) || (thB = ((l0) objX).b()) == null) {
            return objX instanceof C0138v ? ((C0138v) objX).f1882a : s0Var.getCancellationException();
        }
        return thB;
    }

    @Override // D6.C0130m
    public final String y() {
        return "AwaitContinuation";
    }
}
