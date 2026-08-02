package Mf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class J extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f17955b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f17956c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f17957d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f17958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(String str, float f7, Function0<Unit> function0, int i11) {
        super(2);
        this.f17955b = str;
        this.f17956c = f7;
        this.f17957d = function0;
        this.f17958e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f17958e | 1);
        float f7 = this.f17956c;
        Function0<Unit> function0 = this.f17957d;
        M.c(this.f17955b, f7, function0, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
