package Mf0;

import S0.InterfaceC3972m0;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class y extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fd.p<String, Boolean, Boolean, Boolean, Integer, Unit> f18060b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f18061c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f18062d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f18063e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f18064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    y(fd.p<? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Integer, Unit> pVar, InterfaceC3978p0<String> interfaceC3978p0, InterfaceC3978p0<Boolean> interfaceC3978p02, InterfaceC3978p0<Boolean> interfaceC3978p03, InterfaceC3972m0 interfaceC3972m0) {
        super(0);
        this.f18060b = pVar;
        this.f18061c = interfaceC3978p0;
        this.f18062d = interfaceC3978p02;
        this.f18063e = interfaceC3978p03;
        this.f18064f = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String value = this.f18061c.getValue();
        Boolean value2 = this.f18062d.getValue();
        value2.booleanValue();
        Boolean value3 = this.f18063e.getValue();
        value3.booleanValue();
        this.f18060b.invoke(value, value2, value3, Boolean.FALSE, Integer.valueOf(this.f18064f.getIntValue()));
        return Unit.f71690a;
    }
}
