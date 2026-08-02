package ad0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import Jb0.q;
import Sc.s;
import bd0.C5654a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageNotification.presentation.PageNotificationFragment$observeViewModel$lambda$4$lambda$3$$inlined$collectFlow$1", f = "PageNotificationFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f36584d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2406m0 f36585e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f36586f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ q f36587g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f36588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f36589b;

        public a(e eVar, q qVar) {
            this.f36588a = eVar;
            this.f36589b = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            e.u(this.f36588a, this.f36589b, (C5654a) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C2406m0 c2406m0, kotlin.coroutines.d dVar, e eVar, q qVar) {
        super(2, dVar);
        this.f36585e = c2406m0;
        this.f36586f = eVar;
        this.f36587g = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f36585e, dVar, this.f36586f, this.f36587g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36584d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f36586f, this.f36587g);
            this.f36584d = 1;
            if (this.f36585e.collect(aVar2, this) == aVar) {
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
