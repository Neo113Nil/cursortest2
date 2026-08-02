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
final class U extends AbstractC7737t implements Function1<l0.r<C2581j>, androidx.compose.animation.s> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2830e f5876b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.s> f5877c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.s> f5878d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f5879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(C2830e c2830e, Function1<l0.r<C2581j>, androidx.compose.animation.s> function1, Function1<l0.r<C2581j>, androidx.compose.animation.s> function12, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.f5876b = c2830e;
        this.f5877c = function1;
        this.f5878d = function12;
        this.f5879e = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final androidx.compose.animation.s invoke(l0.r<C2581j> rVar) {
        l0.r<C2581j> rVar2 = rVar;
        B4.H d11 = rVar2.c().d();
        Intrinsics.g(d11, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        C2830e.a aVar = (C2830e.a) d11;
        if (((Boolean) this.f5876b.getF5887c().getValue()).booleanValue() || X.d(this.f5879e)) {
            int i11 = B4.H.f2506k;
            for (B4.H h11 : H.a.b(aVar)) {
                if (h11 instanceof C2830e.a) {
                    ((C2830e.a) h11).getClass();
                } else if (h11 instanceof C2829d.a) {
                    ((C2829d.a) h11).getClass();
                }
            }
            return this.f5877c.invoke(rVar2);
        }
        int i12 = B4.H.f2506k;
        for (B4.H h12 : H.a.b(aVar)) {
            if (h12 instanceof C2830e.a) {
                ((C2830e.a) h12).getClass();
            } else if (h12 instanceof C2829d.a) {
                ((C2829d.a) h12).getClass();
            }
        }
        return this.f5878d.invoke(rVar2);
    }
}
