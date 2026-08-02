package Jf0;

import Ae.C2399j;
import Ae.I0;
import Ae.M0;
import Jf0.a;
import Jf0.b;
import androidx.lifecycle.D;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes7.dex */
final class f extends AbstractC7737t implements Function0<M0<? extends Lf0.b>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f14734b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(b bVar) {
        super(0);
        this.f14734b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final M0<? extends Lf0.b> invoke() {
        J j11;
        b.a aVar;
        b bVar = this.f14734b;
        a.d d11 = bVar.f14716a.d();
        wf0.a b11 = wf0.c.b();
        wf0.b f7 = b11 != null ? b11.b().f() : null;
        e eVar = new e(d11, f7);
        j11 = bVar.f14717b;
        D a11 = K.a(j11);
        int i11 = I0.f818a;
        I0 c11 = I0.a.c();
        aVar = b.f14715g;
        return C2399j.M(eVar, a11, c11, b.a.a(aVar, (Lf0.f) C10727i.d(kotlin.coroutines.g.f71771a, new d(d11, null)), f7));
    }
}
