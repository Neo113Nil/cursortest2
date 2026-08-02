package S0;

import ed.InterfaceC6346b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class F1<T> {

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function2<T, Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f25202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super T, Unit> function1) {
            super(2);
            this.f25202b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Object obj, Unit unit) {
            this.f25202b.invoke(obj);
            return Unit.f71690a;
        }
    }

    public static final void a(InterfaceC3967k interfaceC3967k, @NotNull Function1<? super T, Unit> function1) {
        if (interfaceC3967k.t()) {
            interfaceC3967k.c(Unit.f71690a, new a(function1));
        }
    }

    public static final <V> void b(InterfaceC3967k interfaceC3967k, V v11, @NotNull Function2<? super T, ? super V, Unit> function2) {
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), v11)) {
            interfaceC3967k.x(v11);
            interfaceC3967k.c(v11, function2);
        }
    }
}
