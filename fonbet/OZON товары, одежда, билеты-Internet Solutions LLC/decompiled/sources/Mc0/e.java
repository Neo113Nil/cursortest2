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

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.activity.AuthFlowActivity$observeViewModel$lambda$14$lambda$11$$inlined$collectFlow$2", f = "AuthFlowActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17850d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f17851e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AuthFlowActivity f17852f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3385c f17853g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AuthFlowActivity f17854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3385c f17855b;

        public a(AuthFlowActivity authFlowActivity, C3385c c3385c) {
            this.f17854a = authFlowActivity;
            this.f17855b = c3385c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            AuthFlowActivity.U(this.f17854a, this.f17855b, ((Boolean) t2).booleanValue());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, AuthFlowActivity authFlowActivity, C3385c c3385c) {
        super(2, dVar);
        this.f17851e = interfaceC2395h;
        this.f17852f = authFlowActivity;
        this.f17853g = c3385c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f17851e, dVar, this.f17852f, this.f17853g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17850d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f17852f, this.f17853g);
            this.f17850d = 1;
            if (this.f17851e.collect(aVar2, this) == aVar) {
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
