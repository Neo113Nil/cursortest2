package Mc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Jb0.C3385c;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.activity.AuthFlowActivity$observeViewModel$lambda$14$lambda$11$$inlined$collectFlow$1", f = "AuthFlowActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17844d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f17845e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AuthFlowActivity f17846f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3385c f17847g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AuthFlowActivity f17848a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3385c f17849b;

        public a(AuthFlowActivity authFlowActivity, C3385c c3385c) {
            this.f17848a = authFlowActivity;
            this.f17849b = c3385c;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            AuthFlowActivity.W(this.f17848a, this.f17849b, (ru.ozon.id.nativeauth.main.b) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, AuthFlowActivity authFlowActivity, C3385c c3385c) {
        super(2, dVar);
        this.f17845e = interfaceC2395h;
        this.f17846f = authFlowActivity;
        this.f17847g = c3385c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f17845e, dVar, this.f17846f, this.f17847g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17844d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f17846f, this.f17847g);
            this.f17844d = 1;
            if (this.f17845e.collect(aVar2, this) == aVar) {
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
