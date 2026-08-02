package p000;

import java.io.InputStream;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0860x0 {

    /* JADX INFO: renamed from: j */
    public int f8727j;

    /* JADX INFO: renamed from: k */
    public int f8728k = 100;

    /* JADX INFO: renamed from: l */
    public Object f8729l;

    /* JADX INFO: renamed from: K */
    public static AbstractC0860x0 m5486K(InputStream inputStream, int i) {
        if (i <= 0) {
            C0270h1.m2190f("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new mo1(inputStream, i);
        }
        lo1 lo1Var = new lo1(ip1.f3634a);
        try {
            lo1Var.mo3240D(0);
            return lo1Var;
        } catch (mp1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: M */
    public static int m5487M(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: N */
    public static long m5488N(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: renamed from: d */
    public static C0019ai m5489d(byte[] bArr, int i, int i2, boolean z) {
        C0019ai c0019ai = new C0019ai(bArr, i, i2, z);
        try {
            c0019ai.mo220f(i2);
            return c0019ai;
        } catch (hf0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract long mo214A();

    /* JADX INFO: renamed from: B */
    public abstract boolean mo215B(int i);

    /* JADX INFO: renamed from: C */
    public void m5490C() throws hf0 {
        boolean zMo215B;
        do {
            int iMo243y = mo243y();
            if (iMo243y == 0) {
                return;
            }
            int i = this.f8727j;
            if (i >= this.f8728k) {
                throw new hf0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f8727j = i + 1;
            zMo215B = mo215B(iMo243y);
            this.f8727j--;
        } while (zMo215B);
    }

    /* JADX INFO: renamed from: D */
    public abstract int mo3240D(int i);

    /* JADX INFO: renamed from: E */
    public abstract void mo3241E(int i);

    /* JADX INFO: renamed from: F */
    public abstract int mo3242F();

    /* JADX INFO: renamed from: G */
    public abstract boolean mo3243G();

    /* JADX INFO: renamed from: H */
    public abstract int mo3244H();

    /* JADX INFO: renamed from: I */
    public abstract int mo3245I(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: J */
    public abstract void mo3246J(int i);

    /* JADX INFO: renamed from: L */
    public void m5491L() throws mp1 {
        boolean zMo3249Q;
        do {
            int iMo3247O = mo3247O();
            if (iMo3247O == 0) {
                return;
            }
            int i = this.f8727j;
            int i2 = this.f8728k;
            if (i + i2 >= 100) {
                re1.m4350e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.f8728k = i2 + 1;
                zMo3249Q = mo3249Q(iMo3247O);
                this.f8728k--;
            }
        } while (zMo3249Q);
    }

    /* JADX INFO: renamed from: O */
    public abstract int mo3247O();

    /* JADX INFO: renamed from: P */
    public abstract void mo3248P(int i);

    /* JADX INFO: renamed from: Q */
    public abstract boolean mo3249Q(int i);

    /* JADX INFO: renamed from: R */
    public abstract double mo3250R();

    /* JADX INFO: renamed from: S */
    public abstract float mo3251S();

    /* JADX INFO: renamed from: T */
    public abstract long mo3252T();

    /* JADX INFO: renamed from: U */
    public abstract long mo3253U();

    /* JADX INFO: renamed from: V */
    public abstract int mo3254V();

    /* JADX INFO: renamed from: W */
    public abstract long mo3255W();

    /* JADX INFO: renamed from: X */
    public abstract int mo3256X();

    /* JADX INFO: renamed from: Y */
    public abstract boolean mo3257Y();

    /* JADX INFO: renamed from: Z */
    public abstract String mo3258Z();

    /* JADX INFO: renamed from: a */
    public abstract void mo216a(int i);

    /* JADX INFO: renamed from: a0 */
    public abstract String mo3259a0();

    /* JADX INFO: renamed from: b */
    public abstract int mo217b();

    /* JADX INFO: renamed from: b0 */
    public abstract jo1 mo3260b0();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo218c();

    /* JADX INFO: renamed from: c0 */
    public abstract byte[] mo3261c0();

    /* JADX INFO: renamed from: d0 */
    public abstract int mo3262d0();

    /* JADX INFO: renamed from: e */
    public abstract void mo219e(int i);

    /* JADX INFO: renamed from: e0 */
    public abstract int mo3263e0();

    /* JADX INFO: renamed from: f */
    public abstract int mo220f(int i);

    /* JADX INFO: renamed from: f0 */
    public abstract int mo3264f0();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo221g();

    /* JADX INFO: renamed from: g0 */
    public abstract long mo3265g0();

    /* JADX INFO: renamed from: h0 */
    public abstract int mo3266h0();

    /* JADX INFO: renamed from: i */
    public abstract C0762ud mo222i();

    /* JADX INFO: renamed from: i0 */
    public abstract long mo3267i0();

    /* JADX INFO: renamed from: j0 */
    public abstract int mo3268j0();

    /* JADX INFO: renamed from: k */
    public abstract double mo223k();

    /* JADX INFO: renamed from: k0 */
    public abstract long mo3269k0();

    /* JADX INFO: renamed from: l */
    public abstract int mo224l();

    /* JADX INFO: renamed from: m */
    public abstract int mo226m();

    /* JADX INFO: renamed from: n */
    public abstract long mo228n();

    /* JADX INFO: renamed from: o */
    public abstract float mo230o();

    /* JADX INFO: renamed from: p */
    public abstract int mo232p();

    /* JADX INFO: renamed from: q */
    public abstract long mo234q();

    /* JADX INFO: renamed from: s */
    public abstract int mo237s();

    /* JADX INFO: renamed from: t */
    public abstract long mo238t();

    /* JADX INFO: renamed from: u */
    public abstract int mo239u();

    /* JADX INFO: renamed from: v */
    public abstract long mo240v();

    /* JADX INFO: renamed from: w */
    public abstract String mo241w();

    /* JADX INFO: renamed from: x */
    public abstract String mo242x();

    /* JADX INFO: renamed from: y */
    public abstract int mo243y();

    /* JADX INFO: renamed from: z */
    public abstract int mo244z();
}
