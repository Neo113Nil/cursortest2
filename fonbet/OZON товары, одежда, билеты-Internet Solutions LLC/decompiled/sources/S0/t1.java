package S0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {68, 69}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class t1 extends kotlin.coroutines.jvm.internal.j implements Function2<E0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f25524d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f25525e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f25526f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f25527g;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E0<Object> f25528a;

        a(E0<Object> e02) {
            this.f25528a = e02;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            this.f25528a.setValue(t2);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {70}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f25529d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<Object> f25530e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ E0<Object> f25531f;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E0<Object> f25532a;

            a(E0<Object> e02) {
                this.f25532a = e02;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                this.f25532a.setValue(t2);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2395h<Object> interfaceC2395h, E0<Object> e02, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f25530e = interfaceC2395h;
            this.f25531f = e02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f25530e, this.f25531f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f25529d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a(this.f25531f);
                this.f25529d = 1;
                if (this.f25530e.collect(aVar2, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t1(CoroutineContext coroutineContext, InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super t1> dVar) {
        super(2, dVar);
        this.f25526f = coroutineContext;
        this.f25527g = interfaceC2395h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        t1 t1Var = new t1(this.f25526f, this.f25527g, dVar);
        t1Var.f25525e = obj;
        return t1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E0<Object> e02, kotlin.coroutines.d<? super Unit> dVar) {
        return ((t1) create(e02, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r5.collect(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (xe.C10727i.f(r4, r1, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f25524d;
        if (i11 == 0) {
            Sc.s.b(obj);
            E0 e02 = (E0) this.f25525e;
            kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
            CoroutineContext coroutineContext = this.f25526f;
            boolean d11 = Intrinsics.d(coroutineContext, gVar);
            InterfaceC2395h<Object> interfaceC2395h = this.f25527g;
            if (d11) {
                a aVar2 = new a(e02);
                this.f25524d = 1;
            } else {
                b bVar = new b(interfaceC2395h, e02, null);
                this.f25524d = 2;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
