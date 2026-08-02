package B1;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<InterfaceC7825i0, Unit> f2133a = a.f2135b;

    /* renamed from: b, reason: collision with root package name */
    private static final long f2134b = Z1.c.b(0, 0, 15);

    static final class a extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f2135b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final m0.a a(@NotNull D1.V v11) {
        return new Q(v11);
    }

    @NotNull
    public static final m0.a b(@NotNull D1.x0 x0Var) {
        return new i0(x0Var);
    }
}
