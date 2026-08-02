package p000;

/* JADX INFO: renamed from: ei */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0175ei {

    /* JADX INFO: renamed from: a */
    public int f2094a;

    /* JADX INFO: renamed from: b */
    public Object f2095b;

    public AbstractC0175ei(pb2 pb2Var, int i) {
        if (pb2Var == null) {
            C0270h1.m2190f("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            C0270h1.m2190f(j11.m2774i(new StringBuilder(String.valueOf(i).length() + 15), "invalid index: ", i));
            throw null;
        }
        this.f2094a = i;
        this.f2095b = pb2Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo676a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo677b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo678c();

    /* JADX INFO: renamed from: d */
    public abstract void mo679d(int i);

    /* JADX INFO: renamed from: e */
    public abstract int mo680e(int i);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo681f();

    /* JADX INFO: renamed from: g */
    public abstract C0799vd mo682g();

    /* JADX INFO: renamed from: h */
    public abstract double mo683h();

    /* JADX INFO: renamed from: i */
    public abstract int mo684i();

    /* JADX INFO: renamed from: j */
    public abstract int mo685j();

    /* JADX INFO: renamed from: k */
    public abstract long mo686k();

    /* JADX INFO: renamed from: l */
    public abstract float mo687l();

    /* JADX INFO: renamed from: m */
    public abstract int mo688m();

    /* JADX INFO: renamed from: n */
    public abstract long mo689n();

    /* JADX INFO: renamed from: o */
    public abstract int mo690o();

    /* JADX INFO: renamed from: p */
    public abstract long mo691p();

    /* JADX INFO: renamed from: q */
    public abstract int mo692q();

    /* JADX INFO: renamed from: r */
    public abstract long mo693r();

    /* JADX INFO: renamed from: s */
    public abstract String mo694s();

    /* JADX INFO: renamed from: t */
    public abstract String mo695t();

    /* JADX INFO: renamed from: u */
    public abstract int mo696u();

    /* JADX INFO: renamed from: v */
    public abstract int mo697v();

    /* JADX INFO: renamed from: w */
    public abstract long mo698w();

    /* JADX INFO: renamed from: x */
    public abstract boolean mo699x(int i);

    /* JADX INFO: renamed from: y */
    public void m1426y() throws if0 {
        boolean zMo699x;
        do {
            int iMo696u = mo696u();
            if (iMo696u == 0) {
                return;
            }
            int i = this.f2094a;
            if (i >= 100) {
                throw new if0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f2094a = i + 1;
            zMo699x = mo699x(iMo696u);
            this.f2094a--;
        } while (zMo699x);
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo1427z(C0928yv c0928yv, Object obj);
}
