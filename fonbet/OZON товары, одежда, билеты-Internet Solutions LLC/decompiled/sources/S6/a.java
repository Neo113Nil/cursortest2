package S6;

import java.io.IOException;

/* loaded from: classes9.dex */
final class a implements r8.d<V6.a> {

    /* renamed from: a, reason: collision with root package name */
    static final a f25872a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final r8.c f25873b = HY.a.b(1, r8.c.a("window"));

    /* renamed from: c, reason: collision with root package name */
    private static final r8.c f25874c = HY.a.b(2, r8.c.a("logSourceMetrics"));

    /* renamed from: d, reason: collision with root package name */
    private static final r8.c f25875d = HY.a.b(3, r8.c.a("globalMetrics"));

    /* renamed from: e, reason: collision with root package name */
    private static final r8.c f25876e = HY.a.b(4, r8.c.a("appNamespace"));

    @Override // r8.d
    public final void encode(Object obj, Object obj2) throws IOException {
        V6.a aVar = (V6.a) obj;
        r8.e eVar = (r8.e) obj2;
        eVar.add(f25873b, aVar.d());
        eVar.add(f25874c, aVar.c());
        eVar.add(f25875d, aVar.b());
        eVar.add(f25876e, aVar.a());
    }
}
