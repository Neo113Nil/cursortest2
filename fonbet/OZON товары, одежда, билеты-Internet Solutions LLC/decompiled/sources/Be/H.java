package Be;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class H<T> implements InterfaceC2397i<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f3560a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f3561b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<T, kotlin.coroutines.d<? super Unit>, Object> f3562c;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<T, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f3563d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3564e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<T> f3565f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2397i<? super T> interfaceC2397i, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f3565f = interfaceC2397i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f3565f, dVar);
            aVar.f3564e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f3563d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Object obj2 = this.f3564e;
                this.f3563d = 1;
                if (this.f3565f.emit(obj2, this) == aVar) {
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

    public H(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull CoroutineContext coroutineContext) {
        this.f3560a = coroutineContext;
        this.f3561b = De.G.b(coroutineContext);
        this.f3562c = new a(interfaceC2397i, null);
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object b11 = C2636h.b(this.f3560a, t2, this.f3561b, this.f3562c, dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }
}
