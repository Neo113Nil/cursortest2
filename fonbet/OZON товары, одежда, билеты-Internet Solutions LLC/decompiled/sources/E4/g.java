package E4;

import B4.C2581j;
import E4.e;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class g extends AbstractC7737t implements Function1<J, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f7460b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC5392m f7461c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2581j f7462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, ComponentCallbacksC5392m componentCallbacksC5392m, C2581j c2581j) {
        super(1);
        this.f7460b = eVar;
        this.f7461c = componentCallbacksC5392m;
        this.f7462d = c2581j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(J j11) {
        Function1 function1;
        J j12 = j11;
        e eVar = this.f7460b;
        ArrayList f7445g = eVar.getF7445g();
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f7461c;
        boolean z11 = false;
        if (f7445g == null || !f7445g.isEmpty()) {
            Iterator it = f7445g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.d(((Pair) it.next()).e(), componentCallbacksC5392m.getTag())) {
                    z11 = true;
                    break;
                }
            }
        }
        if (j12 != null && !z11) {
            AbstractC5434v lifecycle = componentCallbacksC5392m.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.b().a(AbstractC5434v.b.CREATED)) {
                function1 = eVar.f7447i;
                lifecycle.a((I) ((e.C0167e) function1).invoke(this.f7462d));
            }
        }
        return Unit.f71690a;
    }
}
