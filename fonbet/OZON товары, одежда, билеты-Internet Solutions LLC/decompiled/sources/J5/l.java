package J5;

import android.graphics.PointF;

/* loaded from: classes8.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f14044a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.m<PointF, PointF> f14045b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.f f14046c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.b f14047d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14048e;

    public l(String str, I5.m mVar, I5.f fVar, I5.b bVar, boolean z11) {
        this.f14044a = str;
        this.f14045b = mVar;
        this.f14046c = fVar;
        this.f14047d = bVar;
        this.f14048e = z11;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.o(gVar, bVar, this);
    }

    public final I5.b b() {
        return this.f14047d;
    }

    public final String c() {
        return this.f14044a;
    }

    public final I5.m<PointF, PointF> d() {
        return this.f14045b;
    }

    public final I5.m<PointF, PointF> e() {
        return this.f14046c;
    }

    public final boolean f() {
        return this.f14048e;
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f14045b + ", size=" + this.f14046c + '}';
    }
}
