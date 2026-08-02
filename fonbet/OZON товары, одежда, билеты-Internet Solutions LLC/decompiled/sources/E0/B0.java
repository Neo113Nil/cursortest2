package E0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import D1.C2805i;
import S0.n1;
import androidx.compose.ui.platform.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", l = {563}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class B0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6942d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ D0 f6943e;

    static final class a extends AbstractC7737t implements Function0<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D0 f6944b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f6945c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0 d02, kotlin.jvm.internal.K k11) {
            super(0);
            this.f6944b = d02;
            this.f6945c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            c1 c1Var;
            D0 d02 = this.f6944b;
            c1Var = d02.f6960f;
            c1Var.j();
            int i11 = (d02.isAttached() && ((i2) C2805i.a(d02, androidx.compose.ui.platform.K0.s())).a()) ? 1 : 2;
            kotlin.jvm.internal.K k11 = this.f6945c;
            Integer valueOf = Integer.valueOf(i11 * k11.f71785a);
            k11.f71785a *= -1;
            return valueOf;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", l = {565}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<Integer, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f6946d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ int f6947e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D0 f6948f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D0 d02, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f6948f = d02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f6948f, dVar);
            bVar.f6947e = ((Number) obj).intValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            G g10;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f6946d;
            if (i11 == 0) {
                Sc.s.b(obj);
                if (Math.abs(this.f6947e) == 1) {
                    g10 = this.f6948f.f6966l;
                    this.f6946d = 1;
                    if (g10.e(this) == aVar) {
                        return aVar;
                    }
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
    B0(D0 d02, kotlin.coroutines.d<? super B0> dVar) {
        super(2, dVar);
        this.f6943e = d02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new B0(this.f6943e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((B0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6942d;
        if (i11 == 0) {
            Sc.s.b(obj);
            kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
            k11.f71785a = 1;
            D0 d02 = this.f6943e;
            InterfaceC2395h m11 = n1.m(new a(d02, k11));
            b bVar = new b(d02, null);
            this.f6942d = 1;
            if (C2399j.h(m11, bVar, this) == aVar) {
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
