package P0;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$1$1", f = "ModalBottomSheet.kt", l = {415}, m = "invokeSuspend")
/* renamed from: P0.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3786x0 extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f21430d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f21431e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21432f;

    /* renamed from: P0.x0$a */
    static final class a extends AbstractC7737t implements Function1<C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f21433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.f21433b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7459e c7459e) {
            c7459e.n();
            this.f21433b.invoke();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3786x0(Function0<Unit> function0, kotlin.coroutines.d<? super C3786x0> dVar) {
        super(2, dVar);
        this.f21432f = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3786x0 c3786x0 = new C3786x0(this.f21432f, dVar);
        c3786x0.f21431e = obj;
        return c3786x0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3786x0) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f7;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f21430d;
        if (i11 == 0) {
            Sc.s.b(obj);
            x1.F f11 = (x1.F) this.f21431e;
            a aVar2 = new a(this.f21432f);
            this.f21430d = 1;
            f7 = C9115P.f(C9115P.f82441a, this, null, (r12 & 2) != 0 ? null : null, (r12 & 8) != 0 ? null : aVar2, f11);
            if (f7 == aVar) {
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
