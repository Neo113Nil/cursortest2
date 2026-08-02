package J4;

import De.H;
import Sc.r;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10737n;
import xe.M;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f13934a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10737n f13935b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f13936c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<M, kotlin.coroutines.d<Object>, Object> f13937d;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", l = {103}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f13938d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f13939e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f13940f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C10737n f13941g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<M, kotlin.coroutines.d<Object>, Object> f13942h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, C10737n c10737n, Function2 function2, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f13940f = sVar;
            this.f13941g = c10737n;
            this.f13942h = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f13940f, this.f13941g, this.f13942h, dVar);
            aVar.f13939e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.d dVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f13938d;
            if (i11 == 0) {
                Sc.s.b(obj);
                CoroutineContext.Element element = ((M) this.f13939e).getCoroutineContext().get(kotlin.coroutines.e.INSTANCE);
                Intrinsics.f(element);
                kotlin.coroutines.e eVar = (kotlin.coroutines.e) element;
                B b11 = new B(eVar);
                CoroutineContext plus = eVar.plus(b11).plus(new H(Integer.valueOf(System.identityHashCode(b11)), this.f13940f.getSuspendingTransactionId()));
                r.Companion companion = Sc.r.INSTANCE;
                C10737n c10737n = this.f13941g;
                this.f13939e = c10737n;
                this.f13938d = 1;
                obj = C10727i.f(plus, this.f13942h, this);
                if (obj == aVar) {
                    return aVar;
                }
                dVar = c10737n;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (kotlin.coroutines.d) this.f13939e;
                Sc.s.b(obj);
            }
            r.Companion companion2 = Sc.r.INSTANCE;
            dVar.resumeWith(obj);
            return Unit.f71690a;
        }
    }

    t(CoroutineContext coroutineContext, C10737n c10737n, s sVar, Function2 function2) {
        this.f13934a = coroutineContext;
        this.f13935b = c10737n;
        this.f13936c = sVar;
        this.f13937d = function2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10737n c10737n = this.f13935b;
        try {
            C10727i.d(this.f13934a.minusKey(kotlin.coroutines.e.INSTANCE), new a(this.f13936c, c10737n, this.f13937d, null));
        } catch (Throwable th2) {
            c10737n.A(th2);
        }
    }
}
