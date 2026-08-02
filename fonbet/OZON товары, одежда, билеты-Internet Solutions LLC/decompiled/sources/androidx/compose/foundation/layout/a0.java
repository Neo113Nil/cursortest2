package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C5236c1;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9900i;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final FillElement f39437a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final FillElement f39438b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final FillElement f39439c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f39440d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f39441e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f39442f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f39443g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f39444h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f39445i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f39446j = 0;

    static {
        EnumC9900i enumC9900i = EnumC9900i.Horizontal;
        f39437a = new FillElement(enumC9900i, 1.0f);
        EnumC9900i enumC9900i2 = EnumC9900i.Vertical;
        f39438b = new FillElement(enumC9900i2, 1.0f);
        EnumC9900i enumC9900i3 = EnumC9900i.Both;
        f39439c = new FillElement(enumC9900i3, 1.0f);
        int i11 = WrapContentElement.f39422e;
        d.a g10 = InterfaceC6250b.a.g();
        f39440d = new WrapContentElement(enumC9900i, false, new g0(g10), g10);
        d.a k11 = InterfaceC6250b.a.k();
        f39441e = new WrapContentElement(enumC9900i, false, new g0(k11), k11);
        d.b i12 = InterfaceC6250b.a.i();
        f39442f = new WrapContentElement(enumC9900i2, false, new e0(i12), i12);
        d.b l11 = InterfaceC6250b.a.l();
        f39443g = new WrapContentElement(enumC9900i2, false, new e0(l11), l11);
        e1.d e11 = InterfaceC6250b.a.e();
        f39444h = new WrapContentElement(enumC9900i3, false, new f0(e11), e11);
        e1.d o11 = InterfaceC6250b.a.o();
        f39445i = new WrapContentElement(enumC9900i3, false, new f0(o11), o11);
    }

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, float f7, float f11) {
        return eVar.l0(new UnspecifiedConstraintsElement(f7, f11));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f7, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f7 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f11 = Float.NaN;
        }
        return a(eVar, f7, f11);
    }

    public static androidx.compose.ui.e c(androidx.compose.ui.e eVar) {
        return eVar.l0(f39438b);
    }

    public static androidx.compose.ui.e d(androidx.compose.ui.e eVar) {
        return eVar.l0(f39439c);
    }

    @NotNull
    public static final androidx.compose.ui.e e(@NotNull androidx.compose.ui.e eVar, float f7) {
        return eVar.l0(f7 == 1.0f ? f39437a : new FillElement(EnumC9900i.Horizontal, f7));
    }

    @NotNull
    public static final androidx.compose.ui.e f(@NotNull androidx.compose.ui.e eVar, float f7) {
        return eVar.l0(new SizeElement(0.0f, f7, 0.0f, f7, true, C5236c1.a(), 5));
    }

    @NotNull
    public static final androidx.compose.ui.e g(@NotNull androidx.compose.ui.e eVar, float f7, float f11) {
        return eVar.l0(new SizeElement(0.0f, f7, 0.0f, f11, true, C5236c1.a(), 5));
    }

    public static /* synthetic */ androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f7, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f7 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f11 = Float.NaN;
        }
        return g(eVar, f7, f11);
    }

    @NotNull
    public static final androidx.compose.ui.e i(@NotNull androidx.compose.ui.e eVar, float f7) {
        return eVar.l0(new SizeElement(0.0f, f7, 0.0f, f7, false, C5236c1.a(), 5));
    }

    @NotNull
    public static final androidx.compose.ui.e j(@NotNull androidx.compose.ui.e eVar, float f7) {
        return eVar.l0(new SizeElement(f7, f7, f7, f7, false, C5236c1.a()));
    }

    @NotNull
    public static final androidx.compose.ui.e k(@NotNull androidx.compose.ui.e eVar, float f7, float f11) {
        return eVar.l0(new SizeElement(f7, f11, f7, f11, false, C5236c1.a()));
    }

    public static androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f7, float f11, float f12, float f13, int i11) {
        return eVar.l0(new SizeElement(f7, (i11 & 2) != 0 ? Float.NaN : f11, (i11 & 4) != 0 ? Float.NaN : f12, (i11 & 8) != 0 ? Float.NaN : f13, false, C5236c1.a()));
    }

    @NotNull
    public static final androidx.compose.ui.e m(@NotNull androidx.compose.ui.e eVar, float f7) {
        return eVar.l0(new SizeElement(f7, 0.0f, f7, 0.0f, false, C5236c1.a(), 10));
    }

    @NotNull
    public static final androidx.compose.ui.e n(@NotNull androidx.compose.ui.e eVar, float f7) {
        return eVar.l0(new SizeElement(f7, f7, f7, f7, true, C5236c1.a()));
    }

    @NotNull
    public static final androidx.compose.ui.e o(@NotNull androidx.compose.ui.e eVar, float f7, float f11) {
        return eVar.l0(new SizeElement(f7, f11, f7, f11, true, C5236c1.a()));
    }

    @NotNull
    public static final androidx.compose.ui.e p(@NotNull androidx.compose.ui.e eVar, float f7, float f11, float f12, float f13) {
        return eVar.l0(new SizeElement(f7, f11, f12, f13, true, C5236c1.a()));
    }

    public static /* synthetic */ androidx.compose.ui.e q(androidx.compose.ui.e eVar, float f7, float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f7 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            f12 = Float.NaN;
        }
        return p(eVar, f7, f11, f12, Float.NaN);
    }

    @NotNull
    public static final androidx.compose.ui.e r(@NotNull androidx.compose.ui.e eVar, float f7) {
        return eVar.l0(new SizeElement(f7, 0.0f, f7, 0.0f, true, C5236c1.a(), 10));
    }

    @NotNull
    public static final androidx.compose.ui.e s(@NotNull androidx.compose.ui.e eVar, float f7, float f11) {
        return eVar.l0(new SizeElement(f7, 0.0f, f11, 0.0f, true, C5236c1.a(), 10));
    }

    public static /* synthetic */ androidx.compose.ui.e t(androidx.compose.ui.e eVar, float f7, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f7 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f11 = Float.NaN;
        }
        return s(eVar, f7, f11);
    }

    public static androidx.compose.ui.e u(androidx.compose.ui.e eVar, int i11) {
        d.b i12 = InterfaceC6250b.a.i();
        boolean z11 = (i11 & 2) == 0;
        return eVar.l0((!Intrinsics.d(i12, InterfaceC6250b.a.i()) || z11) ? (!Intrinsics.d(i12, InterfaceC6250b.a.l()) || z11) ? new WrapContentElement(EnumC9900i.Vertical, z11, new e0(i12), i12) : f39443g : f39442f);
    }

    public static androidx.compose.ui.e v(androidx.compose.ui.e eVar, e1.d dVar, int i11) {
        if ((i11 & 1) != 0) {
            dVar = InterfaceC6250b.a.e();
        }
        boolean z11 = (i11 & 2) == 0;
        return eVar.l0((!dVar.equals(InterfaceC6250b.a.e()) || z11) ? (!dVar.equals(InterfaceC6250b.a.o()) || z11) ? new WrapContentElement(EnumC9900i.Both, z11, new f0(dVar), dVar) : f39445i : f39444h);
    }

    @NotNull
    public static final androidx.compose.ui.e w(@NotNull androidx.compose.ui.e eVar, @NotNull InterfaceC6250b.InterfaceC0966b interfaceC0966b, boolean z11) {
        return eVar.l0((!Intrinsics.d(interfaceC0966b, InterfaceC6250b.a.g()) || z11) ? (!Intrinsics.d(interfaceC0966b, InterfaceC6250b.a.k()) || z11) ? new WrapContentElement(EnumC9900i.Horizontal, z11, new g0(interfaceC0966b), interfaceC0966b) : f39441e : f39440d);
    }

    public static /* synthetic */ androidx.compose.ui.e x(androidx.compose.ui.e eVar, d.a aVar, int i11) {
        if ((i11 & 1) != 0) {
            aVar = InterfaceC6250b.a.g();
        }
        return w(eVar, aVar, (i11 & 2) == 0);
    }
}
