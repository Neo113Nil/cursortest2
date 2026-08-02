package M;

import z0.AbstractC2749f;

/* renamed from: M.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254z implements i0.q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3583k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3584l;

    public /* synthetic */ C0254z(int i, Object obj) {
        this.f3583k = i;
        this.f3584l = obj;
    }

    @Override // i0.q
    public final long a() {
        switch (this.f3583k) {
            case 0:
                B b3 = (B) this.f3584l;
                long a5 = b3.f3133D.a();
                if (a5 != 16) {
                    return a5;
                }
                f0 f0Var = (f0) AbstractC2749f.i(b3, h0.f3345b);
                if (f0Var != null) {
                    long j5 = f0Var.f3332a;
                    if (j5 != 16) {
                        return j5;
                    }
                }
                return ((i0.p) AbstractC2749f.i(b3, AbstractC0253y.f3582a)).f17295a;
            default:
                return ((i0) this.f3584l).f3357c;
        }
    }
}
