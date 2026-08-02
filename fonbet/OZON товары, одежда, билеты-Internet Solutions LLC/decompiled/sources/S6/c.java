package S6;

import java.io.IOException;

/* loaded from: classes9.dex */
final class c implements r8.d<V6.c> {

    /* renamed from: a, reason: collision with root package name */
    static final c f25879a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final r8.c f25880b = HY.a.b(1, r8.c.a("eventsDroppedCount"));

    /* renamed from: c, reason: collision with root package name */
    private static final r8.c f25881c = HY.a.b(3, r8.c.a("reason"));

    @Override // r8.d
    public final void encode(Object obj, Object obj2) throws IOException {
        V6.c cVar = (V6.c) obj;
        r8.e eVar = (r8.e) obj2;
        eVar.add(f25880b, cVar.a());
        eVar.add(f25881c, cVar.b());
    }
}
