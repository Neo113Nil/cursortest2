package D4;

import B4.C2581j;
import B4.H;
import D4.C2829d;
import D4.C2830e;
import S0.InterfaceC3978p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class T extends AbstractC7737t implements Function1<l0.r<C2581j>, androidx.compose.animation.q> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2830e f5872b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.q> f5873c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.q> f5874d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f5875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(C2830e c2830e, Function1<l0.r<C2581j>, androidx.compose.animation.q> function1, Function1<l0.r<C2581j>, androidx.compose.animation.q> function12, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.f5872b = c2830e;
        this.f5873c = function1;
        this.f5874d = function12;
        this.f5875e = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final androidx.compose.animation.q invoke(l0.r<C2581j> rVar) {
        l0.r<C2581j> rVar2 = rVar;
        B4.H d11 = rVar2.b().d();
        Intrinsics.g(d11, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        C2830e.a aVar = (C2830e.a) d11;
        if (((Boolean) this.f5872b.getF5887c().getValue()).booleanValue() || X.d(this.f5875e)) {
            int i11 = B4.H.f2506k;
            for (B4.H h11 : H.a.b(aVar)) {
                if (h11 instanceof C2830e.a) {
                    ((C2830e.a) h11).getClass();
                } else if (h11 instanceof C2829d.a) {
                    ((C2829d.a) h11).getClass();
                }
            }
            return this.f5873c.invoke(rVar2);
        }
        int i12 = B4.H.f2506k;
        for (B4.H h12 : H.a.b(aVar)) {
            if (h12 instanceof C2830e.a) {
                ((C2830e.a) h12).getClass();
            } else if (h12 instanceof C2829d.a) {
                ((C2829d.a) h12).getClass();
            }
        }
        return this.f5874d.invoke(rVar2);
    }
}
