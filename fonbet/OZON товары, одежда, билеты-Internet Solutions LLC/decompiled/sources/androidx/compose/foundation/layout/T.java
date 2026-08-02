package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C5242e1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;
import u0.InterfaceC9914x;

/* loaded from: classes.dex */
public final class T {

    static final class a extends AbstractC7737t implements Function1<C5242e1, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f39398b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f39399c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f39400d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f39401e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f7, float f11, float f12, float f13) {
            super(1);
            this.f39398b = f7;
            this.f39399c = f11;
            this.f39400d = f12;
            this.f39401e = f13;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C5242e1 c5242e1) {
            C5242e1 c5242e12 = c5242e1;
            c5242e12.getClass();
            c5242e12.a().b(Z1.h.a(this.f39398b), "start");
            c5242e12.a().b(Z1.h.a(this.f39399c), "top");
            c5242e12.a().b(Z1.h.a(this.f39400d), "end");
            c5242e12.a().b(Z1.h.a(this.f39401e), "bottom");
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<C5242e1, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f39402b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f39403c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f7, float f11) {
            super(1);
            this.f39402b = f7;
            this.f39403c = f11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C5242e1 c5242e1) {
            C5242e1 c5242e12 = c5242e1;
            c5242e12.getClass();
            c5242e12.a().b(Z1.h.a(this.f39402b), "horizontal");
            c5242e12.a().b(Z1.h.a(this.f39403c), "vertical");
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<C5242e1, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f39404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f7) {
            super(1);
            this.f39404b = f7;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C5242e1 c5242e1) {
            C5242e1 c5242e12 = c5242e1;
            c5242e12.getClass();
            c5242e12.b(Z1.h.a(this.f39404b));
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<C5242e1, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC9914x f39405b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC9914x interfaceC9914x) {
            super(1);
            this.f39405b = interfaceC9914x;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C5242e1 c5242e1) {
            C5242e1 c5242e12 = c5242e1;
            c5242e12.getClass();
            c5242e12.a().b(this.f39405b, "paddingValues");
            return Unit.f71690a;
        }
    }

    public static C9915y a(float f7, int i11, float f11) {
        if ((i11 & 1) != 0) {
            f7 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        return new C9915y(f7, f11, f7, f11);
    }

    public static C9915y b(float f7, float f11, float f12, float f13, int i11) {
        if ((i11 & 1) != 0) {
            f7 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        if ((i11 & 4) != 0) {
            f12 = 0;
        }
        if ((i11 & 8) != 0) {
            f13 = 0;
        }
        return new C9915y(f7, f11, f12, f13);
    }

    public static final float c(@NotNull InterfaceC9914x interfaceC9914x, @NotNull Z1.s sVar) {
        return sVar == Z1.s.Ltr ? interfaceC9914x.c(sVar) : interfaceC9914x.b(sVar);
    }

    public static final float d(@NotNull InterfaceC9914x interfaceC9914x, @NotNull Z1.s sVar) {
        return sVar == Z1.s.Ltr ? interfaceC9914x.b(sVar) : interfaceC9914x.c(sVar);
    }

    @NotNull
    public static final androidx.compose.ui.e e(@NotNull androidx.compose.ui.e eVar, @NotNull InterfaceC9914x interfaceC9914x) {
        return eVar.l0(new PaddingValuesElement(interfaceC9914x, new d(interfaceC9914x)));
    }

    @NotNull
    public static final androidx.compose.ui.e f(@NotNull androidx.compose.ui.e eVar, float f7) {
        return eVar.l0(new PaddingElement(f7, f7, f7, f7, new c(f7)));
    }

    @NotNull
    public static final androidx.compose.ui.e g(@NotNull androidx.compose.ui.e eVar, float f7, float f11) {
        return eVar.l0(new PaddingElement(f7, f11, f7, f11, new b(f7, f11)));
    }

    public static androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f7, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f7 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        return g(eVar, f7, f11);
    }

    @NotNull
    public static final androidx.compose.ui.e i(@NotNull androidx.compose.ui.e eVar, float f7, float f11, float f12, float f13) {
        return eVar.l0(new PaddingElement(f7, f11, f12, f13, new a(f7, f11, f12, f13)));
    }

    public static androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f7, float f11, float f12, float f13, int i11) {
        if ((i11 & 1) != 0) {
            f7 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        if ((i11 & 4) != 0) {
            f12 = 0;
        }
        if ((i11 & 8) != 0) {
            f13 = 0;
        }
        return i(eVar, f7, f11, f12, f13);
    }
}
