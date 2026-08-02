package B0;

import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
public final class K extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EnumC2468e1 f1414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(EnumC2468e1 enumC2468e1) {
        super(2);
        this.f1414b = enumC2468e1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-1451087197);
        String a11 = this.f1414b.a(interfaceC3967k2);
        interfaceC3967k2.k();
        return a11;
    }
}
