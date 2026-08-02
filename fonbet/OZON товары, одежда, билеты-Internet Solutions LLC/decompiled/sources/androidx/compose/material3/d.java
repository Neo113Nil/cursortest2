package androidx.compose.material3;

import O0.s;
import P0.C3722b1;
import S0.B1;
import S0.InterfaceC3967k;
import S0.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import n0.InterfaceC8367H;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final B1 f40168a = new B1(b.f40173b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final O f40169b = new O(a.f40172b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final e f40170c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final e f40171d;

    static final class a extends AbstractC7737t implements Function0<C3722b1> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40172b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C3722b1 invoke() {
            return new C3722b1();
        }
    }

    static final class b extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f40173b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        long j11;
        long j12;
        j11 = C7807Z.f72259m;
        f40170c = new e(true, Float.NaN, j11);
        j12 = C7807Z.f72259m;
        f40171d = new e(false, Float.NaN, j12);
    }

    @NotNull
    public static final O a() {
        return f40169b;
    }

    @NotNull
    public static final InterfaceC8369J b(boolean z11, float f7, long j11) {
        long j12;
        if (Z1.h.b(f7, Float.NaN)) {
            j12 = C7807Z.f72259m;
            if (C7807Z.p(j11, j12)) {
                return z11 ? f40170c : f40171d;
            }
        }
        return new e(z11, f7, j11);
    }

    public static InterfaceC8369J c(long j11) {
        return b(true, Float.NaN, j11);
    }

    @NotNull
    public static final InterfaceC8367H d(float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        long j11;
        InterfaceC3967k interfaceC3967k2;
        InterfaceC8367H b11;
        boolean z11 = (i12 & 1) != 0;
        if ((i12 & 2) != 0) {
            f7 = Float.NaN;
        }
        float f11 = f7;
        j11 = C7807Z.f72259m;
        interfaceC3967k.o(-1280632857);
        if (((Boolean) interfaceC3967k.m(f40168a)).booleanValue()) {
            interfaceC3967k2 = interfaceC3967k;
            b11 = s.c(z11, f11, j11, interfaceC3967k2, i11 & 1022);
        } else {
            interfaceC3967k2 = interfaceC3967k;
            b11 = b(z11, f11, j11);
        }
        interfaceC3967k2.k();
        return b11;
    }
}
