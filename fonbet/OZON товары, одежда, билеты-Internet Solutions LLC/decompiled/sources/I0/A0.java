package I0;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.C9140t;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = {746}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class A0 extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f11293d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f11294e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3215w0 f11295f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f11296g;

    static final class a extends AbstractC7737t implements Function1<C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f11297b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.f11297b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7459e c7459e) {
            c7459e.n();
            this.f11297b.invoke();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A0(C3215w0 c3215w0, Function0<Unit> function0, kotlin.coroutines.d<? super A0> dVar) {
        super(2, dVar);
        this.f11295f = c3215w0;
        this.f11296g = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        A0 a02 = new A0(this.f11295f, this.f11296g, dVar);
        a02.f11294e = obj;
        return a02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((A0) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f11293d;
        if (i11 == 0) {
            Sc.s.b(obj);
            x1.F f7 = (x1.F) this.f11294e;
            a aVar = new a(this.f11296g);
            this.f11293d = 1;
            this.f11295f.getClass();
            Object b11 = C9140t.b(f7, new C3217x0(aVar, null), this);
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
