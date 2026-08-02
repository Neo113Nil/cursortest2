package androidx.compose.foundation;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;
import n0.d0;
import n0.e0;
import r0.EnumC9142v;

/* loaded from: classes8.dex */
final class y extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d0 f39871b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f39872c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f39873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(d0 d0Var, boolean z11, boolean z12) {
        super(3);
        this.f39871b = d0Var;
        this.f39872c = z11;
        this.f39873d = z12;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(1478351300);
        e.a aVar = androidx.compose.ui.e.f40358c0;
        d0 d0Var = this.f39871b;
        boolean z11 = this.f39872c;
        boolean z12 = this.f39873d;
        androidx.compose.ui.e l02 = e0.a(new ScrollSemanticsElement(d0Var, z11, z12), d0Var, z12 ? EnumC9142v.Vertical : EnumC9142v.Horizontal, true, this.f39872c, null, d0Var.k(), null, interfaceC3967k2, 64).l0(new ScrollingLayoutElement(d0Var, z11, z12));
        interfaceC3967k2.k();
        return l02;
    }
}
