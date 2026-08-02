package D4;

import B4.C2581j;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: D4.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2839n extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c1.u f5919b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Collection<C2581j> f5920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2839n(c1.u uVar, Collection collection, int i11) {
        super(2);
        this.f5919b = uVar;
        this.f5920c = collection;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        C2832g.b(this.f5919b, this.f5920c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
