package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qq0 {

    /* JADX INFO: renamed from: a */
    public final rq0 f6561a;

    /* JADX INFO: renamed from: b */
    public final s90 f6562b;

    /* JADX INFO: renamed from: c */
    public final nj0 f6563c;

    /* JADX INFO: renamed from: d */
    public EnumC0474ml f6564d;

    /* JADX INFO: renamed from: e */
    public kj0 f6565e;

    /* JADX INFO: renamed from: f */
    public boolean f6566f = false;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ u31 f6567g;

    public qq0(u31 u31Var, rq0 rq0Var, xv0 xv0Var, qv0 qv0Var) {
        this.f6567g = u31Var;
        this.f6561a = rq0Var;
        this.f6563c = xv0Var;
        this.f6565e = qv0Var;
        s90 s90Var = new s90(new va0(1, this));
        this.f6562b = s90Var;
        this.f6564d = EnumC0474ml.f5071j;
        s90Var.m4508i(xv0Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.f6561a);
        sb.append(", state = ");
        sb.append(this.f6564d);
        sb.append(", picker type: ");
        sb.append(this.f6565e.getClass());
        sb.append(", lb: ");
        sb.append(this.f6562b.m4506g().getClass());
        sb.append(this.f6566f ? ", deactivated" : "");
        return sb.toString();
    }
}
