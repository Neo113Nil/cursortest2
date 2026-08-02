package t;

import u.AbstractC2453d;
import u.C2467n;
import u.C2469p;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final t f19406m = new t(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final t f19407n = new t(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final t f19408o = new t(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final t f19409p = new t(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19410l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, int i5) {
        super(i);
        this.f19410l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f19410l) {
            case 0:
                long a5 = i0.p.a(((i0.p) obj).f17295a, j0.d.f17436x);
                return new C2469p(i0.p.d(a5), i0.p.h(a5), i0.p.g(a5), i0.p.e(a5));
            case 1:
                long j5 = ((i0.N) obj).f17265a;
                return new C2467n(i0.N.b(j5), i0.N.c(j5));
            case 2:
                C2467n c2467n = (C2467n) obj;
                float f = c2467n.f19881a;
                float f5 = c2467n.f19882b;
                return new i0.N((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
            default:
                return AbstractC2453d.l(7, null);
        }
    }
}
