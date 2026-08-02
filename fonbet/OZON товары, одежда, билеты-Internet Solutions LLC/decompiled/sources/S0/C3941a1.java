package S0;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: S0.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3941a1 implements InterfaceC3955f0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3941a1 f25337a = new C3941a1();

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: S0.a1$a */
    static final class a<R> extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f25338d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f25339e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Long, ? extends R> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f25339e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f25339e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, Object obj) {
            return ((a) create(m11, (kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f25338d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f25338d = 1;
                if (xe.Y.b(16L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return this.f25339e.invoke(new Long(System.nanoTime()));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(coroutineContext, this);
    }

    @Override // S0.InterfaceC3955f0
    public final <R> Object v(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(De.s.f6650a, new a(function1, null), dVar);
    }
}
