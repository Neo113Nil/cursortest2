package B0;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {357}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class M extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f1426d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ O0 f1427e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f1428f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q1.M f1429g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1430h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Q1.r f1431i;

    static final class a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f1432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f1432b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Boolean bool = (Boolean) this.f1432b.getValue();
            bool.booleanValue();
            return bool;
        }
    }

    static final class b<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O0 f1433a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q1.M f1434b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ I0.W0 f1435c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q1.r f1436d;

        b(O0 o02, Q1.M m11, I0.W0 w02, Q1.r rVar) {
            this.f1433a = o02;
            this.f1434b = m11;
            this.f1435c = w02;
            this.f1436d = rVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            O0 o02 = this.f1433a;
            if (booleanValue && o02.e()) {
                I0.W0 w02 = this.f1435c;
                C2514u0.h(this.f1434b, o02, w02.K(), this.f1436d, w02.F());
            } else {
                C2514u0.f(o02);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(O0 o02, InterfaceC3978p0 interfaceC3978p0, Q1.M m11, I0.W0 w02, Q1.r rVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f1427e = o02;
        this.f1428f = interfaceC3978p0;
        this.f1429g = m11;
        this.f1430h = w02;
        this.f1431i = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new M(this.f1427e, this.f1428f, this.f1429g, this.f1430h, this.f1431i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((M) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1426d;
        O0 o02 = this.f1427e;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC2395h m11 = S0.n1.m(new a(this.f1428f));
                b bVar = new b(o02, this.f1429g, this.f1430h, this.f1431i);
                this.f1426d = 1;
                if (((AbstractC2381a) m11).collect(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            C2514u0.f(o02);
            return Unit.f71690a;
        } catch (Throwable th2) {
            C2514u0.f(o02);
            throw th2;
        }
    }
}
