package androidx.compose.foundation;

import S0.B1;
import androidx.compose.ui.platform.C5236c1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import n0.InterfaceC8367H;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final B1 f39781a = new B1(a.f39782b);

    static final class a extends AbstractC7737t implements Function0<InterfaceC8367H> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f39782b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ InterfaceC8367H invoke() {
            return o.f39713a;
        }
    }

    @NotNull
    public static final B1 a() {
        return f39781a;
    }

    @NotNull
    public static final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar, @NotNull t0.q qVar, InterfaceC8367H interfaceC8367H) {
        return interfaceC8367H == null ? eVar : interfaceC8367H instanceof InterfaceC8369J ? eVar.l0(new IndicationModifierElement(qVar, (InterfaceC8369J) interfaceC8367H)) : androidx.compose.ui.c.b(eVar, C5236c1.a(), new u(interfaceC8367H, qVar));
    }
}
