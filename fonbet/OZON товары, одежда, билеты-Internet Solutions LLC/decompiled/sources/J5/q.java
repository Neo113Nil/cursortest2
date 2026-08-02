package J5;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f14064a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f14065b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14066c;

    public q(String str, List<c> list, boolean z11) {
        this.f14064a = str;
        this.f14065b = list;
        this.f14066c = z11;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.d(gVar, bVar, this, gVar2);
    }

    public final List<c> b() {
        return this.f14065b;
    }

    public final String c() {
        return this.f14064a;
    }

    public final boolean d() {
        return this.f14066c;
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f14064a + "' Shapes: " + Arrays.toString(this.f14065b.toArray()) + '}';
    }
}
