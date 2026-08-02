package Mf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class L extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f17963b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f17964c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f17965d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f17966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i11) {
        super(2);
        this.f17963b = function0;
        this.f17964c = function02;
        this.f17965d = function03;
        this.f17966e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f17966e | 1);
        Function0<Unit> function0 = this.f17964c;
        Function0<Unit> function02 = this.f17965d;
        M.d(this.f17963b, function0, function02, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
