package If0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: If0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3249o extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f12452b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Lf0.a f12453c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<Integer, Unit> f12454d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f12455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3249o(String str, Lf0.a aVar, Function1<? super Integer, Unit> function1, int i11) {
        super(2);
        this.f12452b = str;
        this.f12453c = aVar;
        this.f12454d = function1;
        this.f12455e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12455e | 1);
        Lf0.a aVar = this.f12453c;
        Function1<Integer, Unit> function1 = this.f12454d;
        C3250p.f(this.f12452b, aVar, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
