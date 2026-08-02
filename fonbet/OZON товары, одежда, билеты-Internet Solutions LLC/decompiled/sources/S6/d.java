package S6;

import java.io.IOException;

/* loaded from: classes9.dex */
final class d implements r8.d<V6.d> {

    /* renamed from: a, reason: collision with root package name */
    static final d f25882a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final r8.c f25883b = HY.a.b(1, r8.c.a("logSource"));

    /* renamed from: c, reason: collision with root package name */
    private static final r8.c f25884c = HY.a.b(2, r8.c.a("logEventDropped"));

    @Override // r8.d
    public final void encode(Object obj, Object obj2) throws IOException {
        V6.d dVar = (V6.d) obj;
        r8.e eVar = (r8.e) obj2;
        eVar.add(f25883b, dVar.b());
        eVar.add(f25884c, dVar.a());
    }
}
