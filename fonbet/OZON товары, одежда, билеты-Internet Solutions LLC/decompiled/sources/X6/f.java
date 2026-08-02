package X6;

import Y6.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes9.dex */
public final class f implements U6.b<Y6.e> {
    @Override // Pc.a
    public final Object get() {
        a2.d dVar = new a2.d();
        e.a aVar = new e.a();
        Q6.e eVar = Q6.e.DEFAULT;
        e.b.a a11 = e.b.a();
        a11.b(30000L);
        a11.d();
        aVar.a(eVar, a11.a());
        Q6.e eVar2 = Q6.e.HIGHEST;
        e.b.a a12 = e.b.a();
        a12.b(1000L);
        a12.d();
        aVar.a(eVar2, a12.a());
        Q6.e eVar3 = Q6.e.VERY_LOW;
        e.b.a a13 = e.b.a();
        a13.b(86400000L);
        a13.d();
        a13.c(Collections.unmodifiableSet(new HashSet(Arrays.asList(e.c.DEVICE_IDLE))));
        aVar.a(eVar3, a13.a());
        aVar.c(dVar);
        return aVar.b();
    }
}
