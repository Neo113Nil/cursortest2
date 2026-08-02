package u;

import P.AbstractC0329z;
import P.C0305m0;
import P.d1;

/* renamed from: u.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2465l implements d1 {

    /* renamed from: k, reason: collision with root package name */
    public final A0 f19845k;

    /* renamed from: l, reason: collision with root package name */
    public final C0305m0 f19846l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC2470q f19847m;

    /* renamed from: n, reason: collision with root package name */
    public long f19848n;

    /* renamed from: o, reason: collision with root package name */
    public long f19849o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19850p;

    public /* synthetic */ C2465l(A0 a02, Object obj, AbstractC2470q abstractC2470q, int i) {
        this(a02, obj, (i & 4) != 0 ? null : abstractC2470q, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // P.d1
    public final Object getValue() {
        return this.f19846l.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f19846l.getValue() + ", velocity=" + this.f19845k.f19644b.c(this.f19847m) + ", isRunning=" + this.f19850p + ", lastFrameTimeNanos=" + this.f19848n + ", finishedTimeNanos=" + this.f19849o + ')';
    }

    public C2465l(A0 a02, Object obj, AbstractC2470q abstractC2470q, long j5, long j6, boolean z3) {
        AbstractC2470q abstractC2470q2;
        this.f19845k = a02;
        this.f19846l = AbstractC0329z.t(obj);
        if (abstractC2470q != null) {
            abstractC2470q2 = AbstractC2453d.g(abstractC2470q);
        } else {
            abstractC2470q2 = (AbstractC2470q) a02.f19643a.c(obj);
            abstractC2470q2.d();
        }
        this.f19847m = abstractC2470q2;
        this.f19848n = j5;
        this.f19849o = j6;
        this.f19850p = z3;
    }
}
