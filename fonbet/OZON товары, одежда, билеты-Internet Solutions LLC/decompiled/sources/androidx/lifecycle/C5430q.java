package androidx.lifecycle;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5430q extends kotlin.coroutines.jvm.internal.j implements Function2<Q<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f43377d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f43378e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f43379f;

    /* renamed from: androidx.lifecycle.q$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q<T> f43380a;

        a(Q<T> q11) {
            this.f43380a = q11;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object emit = this.f43380a.emit(t2, dVar);
            return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5430q(InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super C5430q> dVar) {
        super(2, dVar);
        this.f43379f = interfaceC2395h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C5430q c5430q = new C5430q(this.f43379f, dVar);
        c5430q.f43378e = obj;
        return c5430q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Q<Object> q11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5430q) create(q11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f43377d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a((Q) this.f43378e);
            this.f43377d = 1;
            if (this.f43379f.collect(aVar2, this) == aVar) {
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
