package Ie;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import xe.Y;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f12282a;

    public c(long j11) {
        this.f12282a = j11;
    }

    public static final void a(c cVar, j jVar) {
        long j11 = cVar.f12282a;
        if (j11 <= 0) {
            jVar.c(Unit.f71690a);
            return;
        }
        a aVar = new a(cVar, jVar);
        Intrinsics.g(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        h hVar = (h) jVar;
        CoroutineContext l11 = hVar.l();
        hVar.h(Y.d(l11).k(j11, aVar, l11));
    }
}
