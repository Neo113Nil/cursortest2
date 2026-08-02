package androidx.compose.foundation;

import S0.InterfaceC3967k;
import androidx.compose.ui.platform.C5236c1;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import n0.InterfaceC8367H;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes8.dex */
    public static final class a extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8367H f39286b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39287c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f39288d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ I1.i f39289e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f39290f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC8367H interfaceC8367H, boolean z11, String str, I1.i iVar, Function0 function0) {
            super(3);
            this.f39286b = interfaceC8367H;
            this.f39287c = z11;
            this.f39288d = str;
            this.f39289e = iVar;
            this.f39290f = function0;
        }

        @Override // fd.InterfaceC6511n
        public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            num.intValue();
            interfaceC3967k2.o(-1525724089);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = t0.p.a();
                interfaceC3967k2.x(C11);
            }
            t0.q qVar = (t0.q) C11;
            androidx.compose.ui.e l02 = t.b(androidx.compose.ui.e.f40358c0, qVar, this.f39286b).l0(new ClickableElement(qVar, null, this.f39287c, this.f39288d, this.f39289e, this.f39290f));
            interfaceC3967k2.k();
            return l02;
        }
    }

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, t0.q qVar, InterfaceC8367H interfaceC8367H, boolean z11, String str, I1.i iVar, @NotNull Function0<Unit> function0) {
        return eVar.l0(interfaceC8367H instanceof InterfaceC8369J ? new ClickableElement(qVar, (InterfaceC8369J) interfaceC8367H, z11, str, iVar, function0) : interfaceC8367H == null ? new ClickableElement(qVar, null, z11, str, iVar, function0) : qVar != null ? t.b(androidx.compose.ui.e.f40358c0, qVar, interfaceC8367H).l0(new ClickableElement(qVar, null, z11, str, iVar, function0)) : androidx.compose.ui.c.b(androidx.compose.ui.e.f40358c0, C5236c1.a(), new a(interfaceC8367H, z11, str, iVar, function0)));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, t0.q qVar, InterfaceC8367H interfaceC8367H, boolean z11, String str, I1.i iVar, Function0 function0, int i11) {
        I1.i iVar2;
        androidx.compose.ui.e eVar2;
        t0.q qVar2;
        InterfaceC8367H interfaceC8367H2;
        Function0 function02;
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        String str2 = (i11 & 8) != 0 ? null : str;
        if ((i11 & 16) != 0) {
            iVar2 = null;
            qVar2 = qVar;
            interfaceC8367H2 = interfaceC8367H;
            function02 = function0;
            eVar2 = eVar;
        } else {
            iVar2 = iVar;
            eVar2 = eVar;
            qVar2 = qVar;
            interfaceC8367H2 = interfaceC8367H;
            function02 = function0;
        }
        return a(eVar2, qVar2, interfaceC8367H2, z12, str2, iVar2, function02);
    }

    public static androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z11, String str, I1.i iVar, Function0 function0, int i11) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            iVar = null;
        }
        return androidx.compose.ui.c.b(eVar, C5236c1.a(), new h(z11, str, iVar, function0));
    }

    public static androidx.compose.ui.e d(androidx.compose.ui.e eVar, t0.q qVar, boolean z11, Function0 function0, Function0 function02, int i11) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 64) != 0) {
            function0 = null;
        }
        return eVar.l0(new CombinedClickableElement(function02, function0, qVar, z11));
    }
}
