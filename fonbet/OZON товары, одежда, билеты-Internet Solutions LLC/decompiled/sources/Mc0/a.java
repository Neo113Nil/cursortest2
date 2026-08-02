package Mc0;

import Ae.InterfaceC2395h;
import Jb0.C3385c;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.activity.AuthFlowActivity$observeViewModel$$inlined$repeatOnStarted$1", f = "AuthFlowActivity.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17828d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AuthFlowActivity f17829e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AuthFlowActivity f17830f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3385c f17831g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.activity.AuthFlowActivity$observeViewModel$$inlined$repeatOnStarted$1$1", f = "AuthFlowActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Mc0.a$a, reason: collision with other inner class name */
    public static final class C0344a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f17832d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AuthFlowActivity f17833e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3385c f17834f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0344a(kotlin.coroutines.d dVar, AuthFlowActivity authFlowActivity, C3385c c3385c) {
            super(2, dVar);
            this.f17833e = authFlowActivity;
            this.f17834f = c3385c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C0344a c0344a = new C0344a(dVar, this.f17833e, this.f17834f);
            c0344a.f17832d = obj;
            return c0344a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0344a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            M m11 = (M) this.f17832d;
            AuthFlowActivity authFlowActivity = this.f17833e;
            Nc0.f i02 = authFlowActivity.Y().i0();
            InterfaceC2395h<ru.ozon.id.nativeauth.main.b> u11 = i02.u();
            C3385c c3385c = this.f17834f;
            C10727i.c(m11, null, null, new d(u11, null, authFlowActivity, c3385c), 3);
            C10727i.c(m11, null, null, new e(i02.k(), null, authFlowActivity, c3385c), 3);
            C10727i.c(m11, null, null, new f(i02.t(), null, authFlowActivity, c3385c), 3);
            C10727i.c(m11, null, null, new g(i02.c(), null, authFlowActivity, c3385c), 3);
            C10727i.c(m11, null, null, new h(i02.e(), null, authFlowActivity), 3);
            C10727i.c(m11, null, null, new b(authFlowActivity.Y().j0(), null, authFlowActivity, c3385c), 3);
            C10727i.c(m11, null, null, new c(authFlowActivity.Y().k0(), null, authFlowActivity), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AuthFlowActivity authFlowActivity, kotlin.coroutines.d dVar, AuthFlowActivity authFlowActivity2, C3385c c3385c) {
        super(2, dVar);
        this.f17829e = authFlowActivity;
        this.f17830f = authFlowActivity2;
        this.f17831g = c3385c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new a(this.f17829e, dVar, this.f17830f, this.f17831g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17828d;
        if (i11 == 0) {
            s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            C0344a c0344a = new C0344a(null, this.f17830f, this.f17831g);
            this.f17828d = 1;
            if (C5412d0.b(this.f17829e, bVar, c0344a, this) == aVar) {
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
