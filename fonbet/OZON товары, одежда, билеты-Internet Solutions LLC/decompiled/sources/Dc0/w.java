package Dc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraFragment$observeViewModel$lambda$20$$inlined$collectFlow$5", f = "FintechRecoveryCameraFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class w extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6549d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f6550e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f6551f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f6552a;

        public a(q qVar) {
            this.f6552a = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            Fc0.e eVar = (Fc0.e) t2;
            if (eVar != null) {
                q.J(this.f6552a, eVar);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, q qVar) {
        super(2, dVar);
        this.f6550e = interfaceC2395h;
        this.f6551f = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new w(this.f6550e, dVar, this.f6551f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((w) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6549d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f6551f);
            this.f6549d = 1;
            if (this.f6550e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
