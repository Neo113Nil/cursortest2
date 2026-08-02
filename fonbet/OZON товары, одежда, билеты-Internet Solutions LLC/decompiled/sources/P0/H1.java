package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class H1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20647b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f20648c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC3793z1, InterfaceC3967k, Integer, Unit> f20649d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f20650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H1(InterfaceC3793z1 interfaceC3793z1, androidx.compose.ui.e eVar, InterfaceC6511n interfaceC6511n, int i11) {
        super(2);
        this.f20647b = interfaceC3793z1;
        this.f20648c = eVar;
        this.f20649d = interfaceC6511n;
        this.f20650e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f20650e | 1);
        InterfaceC6511n<InterfaceC3793z1, InterfaceC3967k, Integer, Unit> interfaceC6511n = this.f20649d;
        K1.a(this.f20647b, this.f20648c, interfaceC6511n, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
