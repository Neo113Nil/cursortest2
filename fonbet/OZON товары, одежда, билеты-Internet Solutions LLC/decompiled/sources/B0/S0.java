package B0;

import androidx.compose.foundation.gestures.C5177u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9140t;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class S0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super xe.B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f1513d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ x1.F f1514e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2477h1 f1515f;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {83}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1516d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x1.F f1517e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2477h1 f1518f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x1.F f7, InterfaceC2477h1 interfaceC2477h1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f1517e = f7;
            this.f1518f = interfaceC2477h1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f1517e, this.f1518f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1516d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f1516d = 1;
                Object b11 = C9140t.b(this.f1517e, new X0(this.f1518f, null), this);
                if (b11 != obj2) {
                    b11 = Unit.f71690a;
                }
                if (b11 == obj2) {
                    return obj2;
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {86}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1519d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x1.F f1520e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2477h1 f1521f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x1.F f7, InterfaceC2477h1 interfaceC2477h1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f1520e = f7;
            this.f1521f = interfaceC2477h1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f1520e, this.f1521f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1519d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f1519d = 1;
                InterfaceC2477h1 interfaceC2477h1 = this.f1521f;
                Object f7 = C5177u.f(this.f1520e, new T0(interfaceC2477h1), new U0(interfaceC2477h1), new V0(interfaceC2477h1), new W0(interfaceC2477h1), this);
                if (f7 != obj2) {
                    f7 = Unit.f71690a;
                }
                if (f7 == obj2) {
                    return obj2;
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
    S0(x1.F f7, InterfaceC2477h1 interfaceC2477h1, kotlin.coroutines.d<? super S0> dVar) {
        super(2, dVar);
        this.f1514e = f7;
        this.f1515f = interfaceC2477h1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        S0 s02 = new S0(this.f1514e, this.f1515f, dVar);
        s02.f1513d = obj;
        return s02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super xe.B0> dVar) {
        return ((S0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        xe.M m11 = (xe.M) this.f1513d;
        xe.O o11 = xe.O.UNDISPATCHED;
        x1.F f7 = this.f1514e;
        InterfaceC2477h1 interfaceC2477h1 = this.f1515f;
        C10727i.c(m11, null, o11, new a(f7, interfaceC2477h1, null), 1);
        return C10727i.c(m11, null, o11, new b(f7, interfaceC2477h1, null), 1);
    }
}
