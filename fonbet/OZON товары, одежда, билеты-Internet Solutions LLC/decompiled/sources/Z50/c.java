package Z50;

import Sc.s;
import e40.C6293a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.CameraTakePhotoBridgeInterface$handlePendingCallback$1", f = "CameraTakePhotoBridgeInterface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f35589d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6293a f35590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, C6293a c6293a, kotlin.coroutines.d<? super c> dVar2) {
        super(2, dVar2);
        this.f35589d = dVar;
        this.f35590e = c6293a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f35589d, this.f35590e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        d.f(this.f35589d, this.f35590e);
        return Unit.f71690a;
    }
}
