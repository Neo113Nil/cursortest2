package Pg0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class i extends AbstractC7737t implements Function0<Tg0.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f22545b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(b bVar) {
        super(0);
        this.f22545b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Tg0.e invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f22545b.f22530c;
        return new Tg0.e(interfaceC4008j);
    }
}
