package M;

import P.C0315s;
import y.C2654j;

/* loaded from: classes.dex */
public final class O extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f3193l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2654j f3194m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q0 f3195n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.J f3196o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(boolean z3, C2654j c2654j, q0 q0Var, i0.J j5) {
        super(2);
        this.f3193l = z3;
        this.f3194m = c2654j;
        this.f3195n = q0Var;
        this.f3196o = j5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            N.f3188a.a(this.f3193l, this.f3194m, null, this.f3195n, this.f3196o, 0.0f, 0.0f, c0315s, 100663296, 200);
        }
        return W3.o.f6046a;
    }
}
