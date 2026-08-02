package J5;

import B4.V;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class p implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14058a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f14059b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14060c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f14061d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.d f14062e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14063f;

    public p(String str, boolean z11, Path.FillType fillType, I5.a aVar, I5.d dVar, boolean z12) {
        this.f14060c = str;
        this.f14058a = z11;
        this.f14059b = fillType;
        this.f14061d = aVar;
        this.f14062e = dVar;
        this.f14063f = z12;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.g(gVar, bVar, this);
    }

    public final I5.a b() {
        return this.f14061d;
    }

    public final Path.FillType c() {
        return this.f14059b;
    }

    public final String d() {
        return this.f14060c;
    }

    public final I5.d e() {
        return this.f14062e;
    }

    public final boolean f() {
        return this.f14063f;
    }

    public final String toString() {
        return V.d(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f14058a, '}');
    }
}
