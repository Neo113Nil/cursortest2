package Ol0;

import W2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterStoreDataSource$saveMasterHost$2", f = "ArbiterStoreDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class j extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f20486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Za.a f20487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, Za.a aVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f20486e = iVar;
        this.f20487f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        j jVar = new j(this.f20486e, this.f20487f, dVar);
        jVar.f20485d = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        W2.b bVar = (W2.b) this.f20485d;
        i iVar = this.f20486e;
        f.a<String> aVar2 = iVar.f20482b;
        Za.a aVar3 = this.f20487f;
        bVar.i(aVar2, aVar3.a());
        bVar.i(iVar.f20483c, aVar3.b());
        return Unit.f71690a;
    }
}
