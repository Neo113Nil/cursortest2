package androidx.compose.ui.platform;

import De.C2862e;
import S0.C3993x0;
import S0.InterfaceC3955f0;
import Sc.InterfaceC4008j;
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.platform.C5274p0;
import androidx.lifecycle.AbstractC5434v;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements l2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, androidx.compose.ui.platform.j1] */
    @Override // androidx.compose.ui.platform.l2
    public final S0.L0 a(View view) {
        C5274p0.b bVar;
        CoroutineContext coroutineContext;
        C3993x0 c3993x0;
        InterfaceC4008j interfaceC4008j;
        int i11 = r2.f41010b;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
        gVar.get(kotlin.coroutines.e.INSTANCE);
        int i12 = C5274p0.f40972n;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC4008j = C5274p0.f40970l;
            coroutineContext = (CoroutineContext) interfaceC4008j.getValue();
        } else {
            bVar = C5274p0.f40971m;
            coroutineContext = bVar.get();
            if (coroutineContext == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        CoroutineContext plus = coroutineContext.plus(gVar);
        InterfaceC3955f0 interfaceC3955f0 = (InterfaceC3955f0) plus.get(InterfaceC3955f0.f25402a0);
        if (interfaceC3955f0 != null) {
            C3993x0 c3993x02 = new C3993x0(interfaceC3955f0);
            c3993x02.a();
            c3993x0 = c3993x02;
        } else {
            c3993x0 = 0;
        }
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        e1.g gVar2 = (e1.g) plus.get(e1.g.f61781e0);
        e1.g gVar3 = gVar2;
        if (gVar2 == null) {
            ?? c5257j1 = new C5257j1();
            m11.f71787a = c5257j1;
            gVar3 = c5257j1;
        }
        if (c3993x0 != 0) {
            gVar = c3993x0;
        }
        CoroutineContext plus2 = plus.plus(gVar).plus(gVar3);
        S0.L0 l02 = new S0.L0(plus2);
        l02.b0();
        C2862e a11 = xe.N.a(plus2);
        androidx.lifecycle.J a12 = androidx.lifecycle.C0.a(view);
        AbstractC5434v lifecycle = a12 != null ? a12.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new n2(view, l02));
            lifecycle.a(new o2(a11, c3993x0, l02, m11, view));
            return l02;
        }
        A1.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw null;
    }
}
