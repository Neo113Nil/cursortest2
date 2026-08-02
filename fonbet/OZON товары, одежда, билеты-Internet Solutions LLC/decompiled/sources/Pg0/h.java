package Pg0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class h extends AbstractC7737t implements Function0<Tg0.d> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f22544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(b bVar) {
        super(0);
        this.f22544b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Tg0.d invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f22544b.f22529b;
        return new Tg0.d(interfaceC4008j);
    }
}
