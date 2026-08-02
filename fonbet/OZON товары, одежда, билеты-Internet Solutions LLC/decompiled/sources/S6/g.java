package S6;

import java.io.IOException;

/* loaded from: classes9.dex */
final class g implements r8.d<V6.f> {

    /* renamed from: a, reason: collision with root package name */
    static final g f25890a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final r8.c f25891b = HY.a.b(1, r8.c.a("startMs"));

    /* renamed from: c, reason: collision with root package name */
    private static final r8.c f25892c = HY.a.b(2, r8.c.a("endMs"));

    @Override // r8.d
    public final void encode(Object obj, Object obj2) throws IOException {
        V6.f fVar = (V6.f) obj;
        r8.e eVar = (r8.e) obj2;
        eVar.add(f25891b, fVar.b());
        eVar.add(f25892c, fVar.a());
    }
}
