package J00;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l20.C7854a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$fetch$response$1", f = "Middleware.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super P00.k<C7854a>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13577d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L00.c f13578e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ L00.i f13579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(b<C7854a> bVar, L00.c cVar, L00.i iVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f13577d = bVar;
        this.f13578e = cVar;
        this.f13579f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f13577d, this.f13578e, this.f13579f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super P00.k<C7854a>> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        K00.i iVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        iVar = ((b) this.f13577d).f13552b;
        return iVar.b(this.f13578e, this.f13579f);
    }
}
