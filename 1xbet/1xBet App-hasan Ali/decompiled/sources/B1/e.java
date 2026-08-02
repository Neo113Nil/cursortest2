package B1;

import G1.C0140k;
import H1.o;
import P.J;
import Z.p;
import androidx.lifecycle.InterfaceC0491u;
import d.C1903c;
import java.util.Map;
import kotlin.jvm.internal.w;
import r.C2321G;
import t.C2400l;

/* loaded from: classes.dex */
public final class e implements J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f746c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f747d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f744a = i;
        this.f745b = obj;
        this.f746c = obj2;
        this.f747d = obj3;
    }

    @Override // P.J
    public final void a() {
        switch (this.f744a) {
            case 0:
                ((InterfaceC0491u) this.f745b).g().k((d) this.f746c);
                C1903c c1903c = (C1903c) ((w) this.f747d).f17624k;
                if (c1903c != null) {
                    c1903c.a();
                    break;
                }
                break;
            case 1:
                o oVar = (o) this.f745b;
                C0140k c0140k = (C0140k) this.f746c;
                oVar.b().b(c0140k);
                ((p) this.f747d).remove(c0140k);
                break;
            case 2:
                Y.d dVar = (Y.d) this.f745b;
                C2321G c2321g = dVar.f6108l;
                Object obj = this.f746c;
                Object k5 = c2321g.k(obj);
                Y.i iVar = (Y.i) this.f747d;
                if (k5 == iVar) {
                    Map d5 = iVar.d();
                    boolean isEmpty = d5.isEmpty();
                    Map map = dVar.f6107k;
                    if (!isEmpty) {
                        map.put(obj, d5);
                        break;
                    } else {
                        map.remove(obj);
                        break;
                    }
                }
                break;
            default:
                p pVar = (p) this.f745b;
                Object obj2 = this.f746c;
                pVar.remove(obj2);
                ((C2400l) this.f747d).f19388d.k(obj2);
                break;
        }
    }
}
