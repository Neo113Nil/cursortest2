package Nf0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v0.InterfaceC10165e;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f19506b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f19507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(f fVar, h hVar) {
        super(3);
        this.f19506b = fVar;
        this.f19507c = hVar;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC10165e item = interfaceC10165e;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            f.d(this.f19506b, this.f19507c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
