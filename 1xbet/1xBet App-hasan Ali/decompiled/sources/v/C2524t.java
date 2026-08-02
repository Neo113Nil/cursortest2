package v;

import a3.AbstractC0467k;
import h0.C1991e;
import k0.C2022b;
import k0.C2023c;
import k0.C2028h;
import z0.C2733I;

/* renamed from: v.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2524t extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f20304l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.M f20305m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f20306n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f20307o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f20308p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f20309q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f20310r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2028h f20311s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2524t(boolean z3, i0.M m5, long j5, float f, float f5, long j6, long j7, C2028h c2028h) {
        super(1);
        this.f20304l = z3;
        this.f20305m = m5;
        this.f20306n = j5;
        this.f20307o = f;
        this.f20308p = f5;
        this.f20309q = j6;
        this.f20310r = j7;
        this.f20311s = c2028h;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        C2733I c2733i = (C2733I) obj;
        c2733i.a();
        if (this.f20304l) {
            AbstractC0467k.n(c2733i, this.f20305m, 0L, 0L, this.f20306n, null, 246);
        } else {
            long j5 = this.f20306n;
            float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
            float f = this.f20307o;
            if (intBitsToFloat < f) {
                float f5 = this.f20308p;
                C2022b c2022b = c2733i.f21647k;
                float d5 = C1991e.d(c2022b.f17540l.A());
                float f6 = this.f20308p;
                float f7 = d5 - f6;
                float b3 = C1991e.b(c2022b.f17540l.A()) - f6;
                i0.M m5 = this.f20305m;
                long j6 = this.f20306n;
                v3.e eVar = c2022b.f17540l;
                long A3 = eVar.A();
                eVar.v().k();
                try {
                    ((v3.e) ((C2023c) eVar.f20432l).f17544l).v().f(f5, f5, f7, b3, 0);
                    AbstractC0467k.n(c2733i, m5, 0L, 0L, j6, null, 246);
                } finally {
                    eVar.v().j();
                    eVar.P(A3);
                }
            } else {
                AbstractC0467k.n(c2733i, this.f20305m, this.f20309q, this.f20310r, r.e(f, j5), this.f20311s, 208);
            }
        }
        return W3.o.f6046a;
    }
}
