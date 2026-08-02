package androidx.compose.foundation.selection;

import S0.InterfaceC3967k;
import androidx.compose.foundation.t;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import n0.InterfaceC8367H;
import t0.p;
import t0.q;

/* loaded from: classes8.dex */
public final class b extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC8367H f39768b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f39769c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f39770d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I1.i f39771e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0 f39772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC8367H interfaceC8367H, boolean z11, boolean z12, I1.i iVar, Function0 function0) {
        super(3);
        this.f39768b = interfaceC8367H;
        this.f39769c = z11;
        this.f39770d = z12;
        this.f39771e = iVar;
        this.f39772f = function0;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-1525724089);
        Object C11 = interfaceC3967k2.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = p.a();
            interfaceC3967k2.x(C11);
        }
        q qVar = (q) C11;
        androidx.compose.ui.e l02 = t.b(androidx.compose.ui.e.f40358c0, qVar, this.f39768b).l0(new SelectableElement(this.f39769c, qVar, null, this.f39770d, this.f39771e, this.f39772f));
        interfaceC3967k2.k();
        return l02;
    }
}
