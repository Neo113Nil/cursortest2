package p4;

/* loaded from: classes.dex */
public final class T extends X {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18764o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f18765p;

    public /* synthetic */ T(int i, Object obj) {
        this.f18764o = i;
        this.f18765p = obj;
    }

    @Override // p4.X
    public final boolean k() {
        switch (this.f18764o) {
        }
        return false;
    }

    @Override // p4.X
    public final void l(Throwable th) {
        switch (this.f18764o) {
            case 0:
                ((i4.c) this.f18765p).c(th);
                break;
            default:
                Object obj = b0.f18780k.get(j());
                boolean z3 = obj instanceof C2275o;
                Y y5 = (Y) this.f18765p;
                if (!z3) {
                    y5.resumeWith(AbstractC2282w.u(obj));
                    break;
                } else {
                    y5.resumeWith(G4.l.p(((C2275o) obj).f18812a));
                    break;
                }
        }
    }
}
