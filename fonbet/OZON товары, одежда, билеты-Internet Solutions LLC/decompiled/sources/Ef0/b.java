package Ef0;

import Cf0.J;
import J0.C3265a1;
import J0.C3343t;
import J0.R2;
import S0.B1;
import S0.C3996z;
import S0.InterfaceC3967k;
import S1.p;
import Sf0.k;
import a1.C4912a;
import ff0.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import pf0.m;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f7969a = new C4912a(false, 413789363, a.f7973b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f7970b = new C4912a(false, 797243379, C0177b.f7974b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static C4912a f7971c = new C4912a(false, 345504687, c.f7975b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static C4912a f7972d = new C4912a(false, -364033317, d.f7976b);

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7973b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                Ff0.d dVar = Ff0.d.f9455b;
                interfaceC3967k2.o(-1521123503);
                Object C11 = interfaceC3967k2.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = Ef0.a.f7968a;
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                h.a(dVar, null, null, null, null, null, (Function1) ((kotlin.reflect.h) C11), interfaceC3967k2, 1572870, 62);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: Ef0.b$b, reason: collision with other inner class name */
    static final class C0177b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0177b f7974b = new C0177b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                B1 a11 = k.a();
                J j11 = m.f80514a;
                if (j11 == null) {
                    throw new RuntimeException("NetworkDi must be initialized.");
                }
                C3996z.a(a11.c(j11.g()), b.f7969a, interfaceC3967k2, 56);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f7975b = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                R2.a(null, null, 0L, 0L, 0.0f, b.f7970b, interfaceC3967k2, 1572864, 63);
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f7976b = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                C3265a1.a(p.a(interfaceC3967k2) ? C3343t.c() : C3343t.e(), null, null, b.f7971c, interfaceC3967k2, 3072);
            }
            return Unit.f71690a;
        }
    }
}
