package Hf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10934b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f10935c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f10936d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f10937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(String str, boolean z11, boolean z12, Function1 function1, int i11) {
        super(2);
        this.f10934b = str;
        this.f10935c = z11;
        this.f10936d = z12;
        this.f10937e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(7);
        b.a(this.f10934b, this.f10935c, this.f10936d, this.f10937e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
