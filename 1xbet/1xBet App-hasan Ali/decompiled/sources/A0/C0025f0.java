package A0;

import G1.C0140k;
import P.InterfaceC0289e0;
import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.C0574Db;
import d.C1905e;
import e.C1919b;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import n1.AbstractC2181w;
import u.C2435F;
import u.C2438I;
import y.C2654j;
import y.C2655k;
import z.C2693Q;

/* renamed from: A0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025f0 implements P.J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f499c;

    public /* synthetic */ C0025f0(int i, Object obj, Object obj2) {
        this.f497a = i;
        this.f498b = obj;
        this.f499c = obj2;
    }

    @Override // P.J
    public final void a() {
        Object obj = this.f499c;
        Object obj2 = this.f498b;
        switch (this.f497a) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0031h0) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0034i0) obj);
                break;
            case 2:
                ((B.J) obj2).f635m.add(obj);
                break;
            case 3:
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) obj2;
                y.l lVar = (y.l) interfaceC0289e0.getValue();
                if (lVar != null) {
                    C2655k c2655k = new C2655k(lVar);
                    C2654j c2654j = (C2654j) obj;
                    if (c2654j != null) {
                        c2654j.b(c2655k);
                    }
                    interfaceC0289e0.setValue(null);
                    break;
                }
                break;
            case 4:
                ((C0140k) obj2).f1905r.k((H1.m) obj);
                break;
            case 5:
                Iterator it = ((List) ((P.d1) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((H1.i) obj).b().b((C0140k) it.next());
                }
                break;
            case 6:
                ((InterfaceC0289e0) obj).setValue(null);
                O3.j jVar = (O3.j) obj2;
                jVar.f4074c++;
                C0574Db c0574Db = jVar.f4073b;
                jVar.f4073b = null;
                if (c0574Db != null) {
                    c0574Db.g();
                    break;
                }
                break;
            case 7:
                ((C1919b) obj2).b((C1905e) obj);
                break;
            case 8:
                ((C1919b) obj2).b((d.i) obj);
                break;
            case 9:
                ((C2438I) obj2).f19679a.k((C2435F) obj);
                break;
            case 10:
                ((u.t0) obj2).f19944j.remove((u.t0) obj);
                break;
            case 11:
                u.t0 t0Var = (u.t0) obj2;
                t0Var.getClass();
                u.n0 n0Var = (u.n0) ((u.o0) obj).f19891b.getValue();
                if (n0Var != null) {
                    t0Var.i.remove(n0Var.f19883k);
                    break;
                }
                break;
            case 12:
                ((u.t0) obj2).i.remove((u.r0) obj);
                break;
            default:
                C2693Q c2693q = (C2693Q) obj2;
                int i = c2693q.f21513s - 1;
                c2693q.f21513s = i;
                if (i == 0) {
                    Field field = n1.C.f18360a;
                    View view = (View) obj;
                    AbstractC2181w.c(view, null);
                    n1.C.f(view, null);
                    view.removeOnAttachStateChangeListener(c2693q.f21514t);
                    break;
                }
                break;
        }
    }
}
