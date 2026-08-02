package androidx.compose.foundation.lazy.layout;

import A0.C0022e0;
import B.A;
import B.B;
import B.RunnableC0073b;
import B.q;
import B.t;
import G.v;
import P.C0302l;
import P.C0315s;
import P.I;
import P.InterfaceC0289e0;
import W3.o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.p;
import i4.e;
import i4.f;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import x0.f0;
import x0.i0;

/* loaded from: classes.dex */
public final class b extends m implements f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f6885l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f6886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f6887n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f6888o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(A a5, p pVar, e eVar, InterfaceC0289e0 interfaceC0289e0) {
        super(3);
        this.f6885l = a5;
        this.f6886m = pVar;
        this.f6887n = eVar;
        this.f6888o = interfaceC0289e0;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        p c5;
        int i = 2;
        Y.c cVar = (Y.c) obj;
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        Object M5 = c0315s.M();
        Object obj4 = C0302l.f4480a;
        if (M5 == obj4) {
            M5 = new q(cVar, new A.m(1, this.f6888o));
            c0315s.i0(M5);
        }
        q qVar = (q) M5;
        Object M6 = c0315s.M();
        if (M6 == obj4) {
            M6 = new i0(new v(qVar));
            c0315s.i0(M6);
        }
        i0 i0Var = (i0) M6;
        A a5 = this.f6885l;
        if (a5 != null) {
            c0315s.X(205264983);
            c0315s.X(6622915);
            View view = (View) c0315s.j(AndroidCompositionLocals_androidKt.f);
            boolean f = c0315s.f(view);
            Object M7 = c0315s.M();
            if (f || M7 == obj4) {
                M7 = new RunnableC0073b(view);
                c0315s.i0(M7);
            }
            Object obj5 = (RunnableC0073b) M7;
            c0315s.q(false);
            Object[] objArr = {a5, qVar, i0Var, obj5};
            boolean f5 = c0315s.f(a5) | c0315s.h(qVar) | c0315s.h(i0Var) | c0315s.h(obj5);
            Object M8 = c0315s.M();
            if (f5 || M8 == obj4) {
                M8 = new t(a5, qVar, i0Var, obj5, 0);
                c0315s.i0(M8);
            }
            i4.c cVar2 = (i4.c) M8;
            boolean z3 = false;
            for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                z3 |= c0315s.f(obj6);
            }
            Object M9 = c0315s.M();
            if (z3 || M9 == obj4) {
                c0315s.i0(new I(cVar2));
            }
            c0315s.q(false);
        } else {
            c0315s.X(205858881);
            c0315s.q(false);
        }
        int i5 = B.f610b;
        p pVar = this.f6886m;
        if (a5 != null && (c5 = pVar.c(new TraversablePrefetchStateModifierElement(a5))) != null) {
            pVar = c5;
        }
        boolean f6 = c0315s.f(qVar);
        Object obj7 = this.f6887n;
        boolean f7 = f6 | c0315s.f(obj7);
        Object M10 = c0315s.M();
        if (f7 || M10 == obj4) {
            M10 = new C0022e0(i, qVar, obj7);
            c0315s.i0(M10);
        }
        f0.b(i0Var, pVar, (e) M10, c0315s, 8);
        return o.f6046a;
    }
}
