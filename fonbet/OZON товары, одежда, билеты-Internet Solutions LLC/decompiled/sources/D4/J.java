package D4;

import B4.C2581j;
import S0.A1;
import S0.InterfaceC3978p0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.C7770n;
import l0.i0;

/* loaded from: classes8.dex */
final class J extends AbstractC7737t implements Function1<l0.r<C2581j>, l0.N> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map<String, Float> f5820b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2830e f5821c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.q> f5822d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.s> f5823e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, i0> f5824f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ A1<List<C2581j>> f5825g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f5826h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    J(Map<String, Float> map, C2830e c2830e, Function1<? super l0.r<C2581j>, ? extends androidx.compose.animation.q> function1, Function1<? super l0.r<C2581j>, ? extends androidx.compose.animation.s> function12, Function1<? super l0.r<C2581j>, ? extends i0> function13, A1<? extends List<C2581j>> a12, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.f5820b = map;
        this.f5821c = c2830e;
        this.f5822d = function1;
        this.f5823e = function12;
        this.f5824f = function13;
        this.f5825g = a12;
        this.f5826h = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final l0.N invoke(l0.r<C2581j> rVar) {
        androidx.compose.animation.q qVar;
        androidx.compose.animation.s sVar;
        float f7;
        l0.r<C2581j> rVar2 = rVar;
        if (!this.f5825g.getValue().contains(rVar2.c())) {
            qVar = androidx.compose.animation.q.f38814a;
            sVar = androidx.compose.animation.s.f38816a;
            return C7770n.c(qVar, sVar);
        }
        String e11 = rVar2.c().e();
        Map<String, Float> map = this.f5820b;
        Float f11 = map.get(e11);
        if (f11 != null) {
            f7 = f11.floatValue();
        } else {
            map.put(rVar2.c().e(), Float.valueOf(0.0f));
            f7 = 0.0f;
        }
        if (!Intrinsics.d(rVar2.b().e(), rVar2.c().e())) {
            f7 = (((Boolean) this.f5821c.getF5887c().getValue()).booleanValue() || this.f5826h.getValue().booleanValue()) ? f7 - 1.0f : f7 + 1.0f;
        }
        map.put(rVar2.b().e(), Float.valueOf(f7));
        return new l0.N(this.f5822d.invoke(rVar2), this.f5823e.invoke(rVar2), f7, this.f5824f.invoke(rVar2));
    }
}
