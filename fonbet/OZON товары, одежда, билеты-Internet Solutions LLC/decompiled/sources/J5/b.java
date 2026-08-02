package J5;

import android.graphics.PointF;

/* loaded from: classes8.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f13998a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.m<PointF, PointF> f13999b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.f f14000c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14001d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14002e;

    public b(String str, I5.m<PointF, PointF> mVar, I5.f fVar, boolean z11, boolean z12) {
        this.f13998a = str;
        this.f13999b = mVar;
        this.f14000c = fVar;
        this.f14001d = z11;
        this.f14002e = z12;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.f(gVar, bVar, this);
    }

    public final String b() {
        return this.f13998a;
    }

    public final I5.m<PointF, PointF> c() {
        return this.f13999b;
    }

    public final I5.f d() {
        return this.f14000c;
    }

    public final boolean e() {
        return this.f14002e;
    }

    public final boolean f() {
        return this.f14001d;
    }
}
