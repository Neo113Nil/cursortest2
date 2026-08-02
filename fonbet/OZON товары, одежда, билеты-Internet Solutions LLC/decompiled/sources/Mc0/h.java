package Mc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.activity.AuthFlowActivity$observeViewModel$lambda$14$lambda$11$$inlined$collectFlow$5", f = "AuthFlowActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class h extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17867d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f17868e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AuthFlowActivity f17869f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AuthFlowActivity f17870a;

        public a(AuthFlowActivity authFlowActivity) {
            this.f17870a = authFlowActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            AuthFlowActivity.X(this.f17870a, (Intent) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, AuthFlowActivity authFlowActivity) {
        super(2, dVar);
        this.f17868e = interfaceC2395h;
        this.f17869f = authFlowActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f17868e, dVar, this.f17869f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17867d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f17869f);
            this.f17867d = 1;
            if (this.f17868e.collect(aVar2, this) == aVar) {
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
