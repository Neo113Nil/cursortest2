package D4;

import B4.C2581j;
import B4.H;
import D4.C2829d;
import D4.C2830e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.i0;

/* loaded from: classes8.dex */
final class V extends AbstractC7737t implements Function1<l0.r<C2581j>, i0> {
    @Override // kotlin.jvm.functions.Function1
    public final i0 invoke(l0.r<C2581j> rVar) {
        B4.H d11 = rVar.b().d();
        Intrinsics.g(d11, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        int i11 = B4.H.f2506k;
        for (B4.H h11 : H.a.b((C2830e.a) d11)) {
            if (h11 instanceof C2830e.a) {
                ((C2830e.a) h11).getClass();
            } else if (h11 instanceof C2829d.a) {
                ((C2829d.a) h11).getClass();
            }
        }
        return null;
    }
}
