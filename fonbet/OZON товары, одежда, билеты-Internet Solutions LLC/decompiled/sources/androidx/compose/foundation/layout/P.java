package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C5242e1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class P {

    static final class a extends AbstractC7737t implements Function1<C5242e1, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f39371b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f39372c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f7, float f11) {
            super(1);
            this.f39371b = f7;
            this.f39372c = f11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C5242e1 c5242e1) {
            C5242e1 c5242e12 = c5242e1;
            c5242e12.getClass();
            c5242e12.a().b(Z1.h.a(this.f39371b), "x");
            c5242e12.a().b(Z1.h.a(this.f39372c), "y");
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<C5242e1, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Z1.d, Z1.m> f39373b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Z1.d, Z1.m> function1) {
            super(1);
            this.f39373b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C5242e1 c5242e1) {
            C5242e1 c5242e12 = c5242e1;
            c5242e12.getClass();
            c5242e12.a().b(this.f39373b, "offset");
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super Z1.d, Z1.m> function1) {
        return eVar.l0(new OffsetPxElement(function1, new b(function1)));
    }

    @NotNull
    public static final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar, float f7, float f11) {
        return eVar.l0(new OffsetElement(f7, f11, new a(f7, f11)));
    }

    public static androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f7, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f7 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        return b(eVar, f7, f11);
    }
}
