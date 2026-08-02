package J5;

import android.graphics.Path;

/* loaded from: classes8.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final g f14005a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f14006b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.c f14007c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.d f14008d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.f f14009e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.f f14010f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14011g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f14012h;

    public e(String str, g gVar, Path.FillType fillType, I5.c cVar, I5.d dVar, I5.f fVar, I5.f fVar2, boolean z11) {
        this.f14005a = gVar;
        this.f14006b = fillType;
        this.f14007c = cVar;
        this.f14008d = dVar;
        this.f14009e = fVar;
        this.f14010f = fVar2;
        this.f14011g = str;
        this.f14012h = z11;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.h(gVar, gVar2, bVar, this);
    }

    public final I5.f b() {
        return this.f14010f;
    }

    public final Path.FillType c() {
        return this.f14006b;
    }

    public final I5.c d() {
        return this.f14007c;
    }

    public final g e() {
        return this.f14005a;
    }

    public final String f() {
        return this.f14011g;
    }

    public final I5.d g() {
        return this.f14008d;
    }

    public final I5.f h() {
        return this.f14009e;
    }

    public final boolean i() {
        return this.f14012h;
    }
}
