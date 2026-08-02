package p4;

/* loaded from: classes.dex */
public abstract class K extends AbstractC2277q {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f18753p = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f18754m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18755n;

    /* renamed from: o, reason: collision with root package name */
    public X3.k f18756o;

    public final void H(boolean z3) {
        long j5 = this.f18754m - (z3 ? 4294967296L : 1L);
        this.f18754m = j5;
        if (j5 <= 0 && this.f18755n) {
            shutdown();
        }
    }

    public final void I(C c5) {
        X3.k kVar = this.f18756o;
        if (kVar == null) {
            kVar = new X3.k();
            this.f18756o = kVar;
        }
        kVar.addLast(c5);
    }

    public abstract Thread J();

    public final void K(boolean z3) {
        this.f18754m = (z3 ? 4294967296L : 1L) + this.f18754m;
        if (z3) {
            return;
        }
        this.f18755n = true;
    }

    public abstract long L();

    public final boolean M() {
        X3.k kVar = this.f18756o;
        if (kVar == null) {
            return false;
        }
        C c5 = (C) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (c5 == null) {
            return false;
        }
        c5.run();
        return true;
    }

    public void N(long j5, H h3) {
        RunnableC2283x.f18834t.S(j5, h3);
    }

    public abstract void shutdown();
}
