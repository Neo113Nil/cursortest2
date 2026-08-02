package K20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class p extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f15152b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f15153c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f15154d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f15155e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f15156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    p(String str, Function1<? super String, Unit> function1, boolean z11, Function1<? super Boolean, Unit> function12, int i11) {
        super(2);
        this.f15152b = str;
        this.f15153c = function1;
        this.f15154d = z11;
        this.f15155e = function12;
        this.f15156f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f15156f | 1);
        boolean z11 = this.f15154d;
        Function1<Boolean, Unit> function1 = this.f15155e;
        e.c(this.f15152b, this.f15153c, z11, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
