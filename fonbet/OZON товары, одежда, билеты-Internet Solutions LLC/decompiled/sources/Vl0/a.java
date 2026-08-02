package Vl0;

import Ol0.q;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;

@e(c = "ru.rustore.sdk.pushclient.internal.domain.factory.MasterHostIPCClientsFactoryImpl$create$authIPCClient$1", f = "MasterHostIPCClientsFactoryImpl.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class a extends j implements Function1<d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f32822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f32823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q qVar, d dVar) {
        super(1, dVar);
        this.f32823e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new a(this.f32823e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super Unit> dVar) {
        return new a(this.f32823e, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32822d;
        if (i11 == 0) {
            s.b(obj);
            this.f32822d = 1;
            if (this.f32823e.invoke(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
