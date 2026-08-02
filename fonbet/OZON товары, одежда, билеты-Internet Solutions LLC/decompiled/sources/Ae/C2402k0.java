package Ae;

import Ae.I0;
import Be.AbstractC2635g;
import De.C2857A;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10754w;
import xe.InterfaceC10750u;
import ze.EnumC11113a;
import ze.h;

/* renamed from: Ae.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C2402k0 {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r5 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> H0<T> a(InterfaceC2395h<? extends T> interfaceC2395h, int i11) {
        AbstractC2635g abstractC2635g;
        InterfaceC2395h<T> f7;
        ze.h.f108943q0.getClass();
        int a11 = h.a.a();
        if (i11 >= a11) {
            a11 = i11;
        }
        int i12 = a11 - i11;
        if (!(interfaceC2395h instanceof AbstractC2635g) || (f7 = (abstractC2635g = (AbstractC2635g) interfaceC2395h).f()) == null) {
            return new H0<>(i12, interfaceC2395h, kotlin.coroutines.g.f71771a, EnumC11113a.SUSPEND);
        }
        EnumC11113a enumC11113a = abstractC2635g.f3581c;
        int i13 = abstractC2635g.f3580b;
        if (i13 != -3 && i13 != -2 && i13 != 0) {
            i12 = i13;
        } else if (enumC11113a != EnumC11113a.SUSPEND) {
            if (i11 == 0) {
                i12 = 1;
            }
            i12 = 0;
        }
        return new H0<>(i12, f7, abstractC2635g.f3579a, enumC11113a);
    }

    @NotNull
    public static final <T> B0<T> b(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull xe.M m11, @NotNull I0 i02, int i11) {
        H0 a11 = a(interfaceC2395h, i11);
        C0 a12 = E0.a(i11, a11.f814b, a11.f815c);
        C2857A c2857a = E0.f797a;
        int i12 = I0.f818a;
        return new y0(a12, C10727i.b(m11, a11.f816d, i02.equals(I0.a.c()) ? xe.O.DEFAULT : xe.O.UNDISPATCHED, new C2398i0(i02, a11.f813a, a12, c2857a, null)));
    }

    @NotNull
    public static final <T> M0<T> c(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull xe.M m11, @NotNull I0 i02, T t2) {
        H0 a11 = a(interfaceC2395h, 1);
        x0 a12 = O0.a(t2);
        int i11 = I0.f818a;
        return new z0(a12, C10727i.b(m11, a11.f816d, i02.equals(I0.a.c()) ? xe.O.DEFAULT : xe.O.UNDISPATCHED, new C2398i0(i02, a11.f813a, a12, t2, null)));
    }

    public static final Object d(@NotNull InterfaceC2395h interfaceC2395h, @NotNull xe.M m11, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        H0 a11 = a(interfaceC2395h, 1);
        InterfaceC10750u a12 = C10754w.a();
        C10727i.c(m11, a11.f816d, null, new C2400j0(a11.f813a, a12, null), 2);
        return a12.s(jVar);
    }
}
