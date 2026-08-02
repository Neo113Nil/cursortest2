package Eb;

import Sc.s;
import W2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.utils.DataStoreExtensionsKt$setValue$2", f = "DataStoreExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f7794d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f7795e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f.a<Object> f7796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Object obj, f.a<Object> aVar, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f7795e = obj;
        this.f7796f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        f fVar = new f(this.f7795e, this.f7796f, dVar);
        fVar.f7794d = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        W2.b bVar = (W2.b) this.f7794d;
        Object obj2 = this.f7795e;
        f.a<Object> aVar2 = this.f7796f;
        if (obj2 != null) {
            bVar.i(aVar2, obj2);
        } else {
            bVar.h(aVar2);
        }
        return Unit.f71690a;
    }
}
