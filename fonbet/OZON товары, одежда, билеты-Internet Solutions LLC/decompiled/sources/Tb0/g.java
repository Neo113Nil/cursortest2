package Tb0;

import Sc.s;
import android.webkit.CookieManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.limb.plugin.OzonIdPluginProvider$1", f = "OzonIdPluginProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class g extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    g() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(2, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        try {
            CookieManager.getInstance();
        } catch (Throwable unused) {
        }
        return Unit.f71690a;
    }
}
