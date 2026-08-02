package S6;

import java.io.IOException;

/* loaded from: classes9.dex */
final class f implements r8.d<V6.e> {

    /* renamed from: a, reason: collision with root package name */
    static final f f25887a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final r8.c f25888b = HY.a.b(1, r8.c.a("currentCacheSizeBytes"));

    /* renamed from: c, reason: collision with root package name */
    private static final r8.c f25889c = HY.a.b(2, r8.c.a("maxCacheSizeBytes"));

    @Override // r8.d
    public final void encode(Object obj, Object obj2) throws IOException {
        V6.e eVar = (V6.e) obj;
        r8.e eVar2 = (r8.e) obj2;
        eVar2.add(f25888b, eVar.a());
        eVar2.add(f25889c, eVar.b());
    }
}
