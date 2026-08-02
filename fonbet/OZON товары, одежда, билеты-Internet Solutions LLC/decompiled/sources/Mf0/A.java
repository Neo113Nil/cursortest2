package Mf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class A extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f17944b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fd.p<String, Boolean, Boolean, Boolean, Integer, Unit> f17945c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f17946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    A(N n11, fd.p<? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Integer, Unit> pVar, int i11) {
        super(2);
        this.f17944b = n11;
        this.f17945c = pVar;
        this.f17946d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f17946d | 1);
        M.b(this.f17944b, this.f17945c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
