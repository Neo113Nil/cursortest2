package J5;

import J5.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f14013a;

    /* renamed from: b, reason: collision with root package name */
    private final g f14014b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.c f14015c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.d f14016d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.f f14017e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.f f14018f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.b f14019g;

    /* renamed from: h, reason: collision with root package name */
    private final s.b f14020h;

    /* renamed from: i, reason: collision with root package name */
    private final s.c f14021i;

    /* renamed from: j, reason: collision with root package name */
    private final float f14022j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f14023k;

    /* renamed from: l, reason: collision with root package name */
    private final I5.b f14024l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f14025m;

    public f(String str, g gVar, I5.c cVar, I5.d dVar, I5.f fVar, I5.f fVar2, I5.b bVar, s.b bVar2, s.c cVar2, float f7, ArrayList arrayList, I5.b bVar3, boolean z11) {
        this.f14013a = str;
        this.f14014b = gVar;
        this.f14015c = cVar;
        this.f14016d = dVar;
        this.f14017e = fVar;
        this.f14018f = fVar2;
        this.f14019g = bVar;
        this.f14020h = bVar2;
        this.f14021i = cVar2;
        this.f14022j = f7;
        this.f14023k = arrayList;
        this.f14024l = bVar3;
        this.f14025m = z11;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.i(gVar, bVar, this);
    }

    public final s.b b() {
        return this.f14020h;
    }

    public final I5.b c() {
        return this.f14024l;
    }

    public final I5.f d() {
        return this.f14018f;
    }

    public final I5.c e() {
        return this.f14015c;
    }

    public final g f() {
        return this.f14014b;
    }

    public final s.c g() {
        return this.f14021i;
    }

    public final List<I5.b> h() {
        return this.f14023k;
    }

    public final float i() {
        return this.f14022j;
    }

    public final String j() {
        return this.f14013a;
    }

    public final I5.d k() {
        return this.f14016d;
    }

    public final I5.f l() {
        return this.f14017e;
    }

    public final I5.b m() {
        return this.f14019g;
    }

    public final boolean n() {
        return this.f14025m;
    }
}
