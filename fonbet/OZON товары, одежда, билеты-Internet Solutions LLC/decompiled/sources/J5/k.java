package J5;

import android.graphics.PointF;

/* loaded from: classes8.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f14033a;

    /* renamed from: b, reason: collision with root package name */
    private final a f14034b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.b f14035c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.m<PointF, PointF> f14036d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.b f14037e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.b f14038f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.b f14039g;

    /* renamed from: h, reason: collision with root package name */
    private final I5.b f14040h;

    /* renamed from: i, reason: collision with root package name */
    private final I5.b f14041i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f14042j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f14043k;

    public enum a {
        STAR(1),
        POLYGON(2);

        private final int value;

        a(int i11) {
            this.value = i11;
        }

        public static a a(int i11) {
            for (a aVar : values()) {
                if (aVar.value == i11) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, I5.b bVar, I5.m<PointF, PointF> mVar, I5.b bVar2, I5.b bVar3, I5.b bVar4, I5.b bVar5, I5.b bVar6, boolean z11, boolean z12) {
        this.f14033a = str;
        this.f14034b = aVar;
        this.f14035c = bVar;
        this.f14036d = mVar;
        this.f14037e = bVar2;
        this.f14038f = bVar3;
        this.f14039g = bVar4;
        this.f14040h = bVar5;
        this.f14041i = bVar6;
        this.f14042j = z11;
        this.f14043k = z12;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.n(gVar, bVar, this);
    }

    public final I5.b b() {
        return this.f14038f;
    }

    public final I5.b c() {
        return this.f14040h;
    }

    public final String d() {
        return this.f14033a;
    }

    public final I5.b e() {
        return this.f14039g;
    }

    public final I5.b f() {
        return this.f14041i;
    }

    public final I5.b g() {
        return this.f14035c;
    }

    public final I5.m<PointF, PointF> h() {
        return this.f14036d;
    }

    public final I5.b i() {
        return this.f14037e;
    }

    public final a j() {
        return this.f14034b;
    }

    public final boolean k() {
        return this.f14042j;
    }

    public final boolean l() {
        return this.f14043k;
    }
}
