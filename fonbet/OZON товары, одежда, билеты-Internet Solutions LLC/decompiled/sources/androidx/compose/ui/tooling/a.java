package androidx.compose.ui.tooling;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41121b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(String str, String str2) {
        super(2);
        this.f41121b = str;
        this.f41122c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            W1.a.c(this.f41121b, this.f41122c, interfaceC3967k2, new Object[0]);
        }
        return Unit.f71690a;
    }
}
