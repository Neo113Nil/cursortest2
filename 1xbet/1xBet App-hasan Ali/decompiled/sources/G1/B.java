package G1;

import X3.C0442b;
import java.util.ArrayList;
import java.util.Iterator;
import n4.C2189a;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import r.S;

/* loaded from: classes.dex */
public class B extends y implements Iterable, j4.a {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1815x = 0;

    /* renamed from: t, reason: collision with root package name */
    public final S f1816t;

    /* renamed from: u, reason: collision with root package name */
    public int f1817u;

    /* renamed from: v, reason: collision with root package name */
    public String f1818v;

    /* renamed from: w, reason: collision with root package name */
    public String f1819w;

    public B(D d5) {
        super(d5);
        this.f1816t = new S(0);
    }

    @Override // G1.y
    public final w d(v3.e eVar) {
        return h(eVar, false, this);
    }

    @Override // G1.y
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B) || !super.equals(obj)) {
            return false;
        }
        S s2 = this.f1816t;
        int j5 = s2.j();
        B b3 = (B) obj;
        S s5 = b3.f1816t;
        if (j5 != s5.j() || this.f1817u != b3.f1817u) {
            return false;
        }
        Iterator it = ((C2189a) n4.i.L(new C0442b(3, s2))).iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (!yVar.equals(s5.e(yVar.f1969p))) {
                return false;
            }
        }
        return true;
    }

    public final y f(String str, boolean z3) {
        Object obj;
        B b3;
        kotlin.jvm.internal.l.f("route", str);
        S s2 = this.f1816t;
        kotlin.jvm.internal.l.f("<this>", s2);
        Iterator it = ((C2189a) n4.i.L(new C0442b(3, s2))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            y yVar = (y) obj;
            if (AbstractC2234l.s0(yVar.f1970q, str, false) || yVar.e(str) != null) {
                break;
            }
        }
        y yVar2 = (y) obj;
        if (yVar2 != null) {
            return yVar2;
        }
        if (!z3 || (b3 = this.f1965l) == null || AbstractC2227e.H0(str)) {
            return null;
        }
        return b3.f(str, true);
    }

    public final y g(int i, B b3, boolean z3, y yVar) {
        S s2 = this.f1816t;
        y yVar2 = (y) s2.e(i);
        if (yVar != null) {
            if (kotlin.jvm.internal.l.a(yVar2, yVar) && kotlin.jvm.internal.l.a(yVar2.f1965l, yVar.f1965l)) {
                return yVar2;
            }
            yVar2 = null;
        } else if (yVar2 != null) {
            return yVar2;
        }
        if (z3) {
            Iterator it = ((C2189a) n4.i.L(new C0442b(3, s2))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    yVar2 = null;
                    break;
                }
                y yVar3 = (y) it.next();
                yVar2 = (!(yVar3 instanceof B) || kotlin.jvm.internal.l.a(yVar3, b3)) ? null : ((B) yVar3).g(i, this, true, yVar);
                if (yVar2 != null) {
                    break;
                }
            }
        }
        if (yVar2 != null) {
            return yVar2;
        }
        B b5 = this.f1965l;
        if (b5 == null || b5.equals(b3)) {
            return null;
        }
        B b6 = this.f1965l;
        kotlin.jvm.internal.l.c(b6);
        return b6.g(i, this, z3, yVar);
    }

    public final w h(v3.e eVar, boolean z3, B b3) {
        w wVar;
        w d5 = super.d(eVar);
        ArrayList arrayList = new ArrayList();
        A a5 = new A(this);
        while (true) {
            if (!a5.hasNext()) {
                break;
            }
            y yVar = (y) a5.next();
            wVar = kotlin.jvm.internal.l.a(yVar, b3) ? null : yVar.d(eVar);
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        w wVar2 = (w) X3.m.g0(arrayList);
        B b5 = this.f1965l;
        if (b5 != null && z3 && !b5.equals(b3)) {
            wVar = b5.h(eVar, true, this);
        }
        return (w) X3.m.g0(X3.l.E0(new w[]{d5, wVar2, wVar}));
    }

    @Override // G1.y
    public final int hashCode() {
        int i = this.f1817u;
        S s2 = this.f1816t;
        int j5 = s2.j();
        for (int i5 = 0; i5 < j5; i5++) {
            i = (((i * 31) + s2.g(i5)) * 31) + ((y) s2.k(i5)).hashCode();
        }
        return i;
    }

    public final w i(String str, boolean z3, B b3) {
        w wVar;
        kotlin.jvm.internal.l.f("route", str);
        w e3 = e(str);
        ArrayList arrayList = new ArrayList();
        A a5 = new A(this);
        while (true) {
            if (!a5.hasNext()) {
                break;
            }
            y yVar = (y) a5.next();
            wVar = kotlin.jvm.internal.l.a(yVar, b3) ? null : yVar instanceof B ? ((B) yVar).i(str, false, this) : yVar.e(str);
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        w wVar2 = (w) X3.m.g0(arrayList);
        B b5 = this.f1965l;
        if (b5 != null && z3 && !b5.equals(b3)) {
            wVar = b5.i(str, true, this);
        }
        return (w) X3.m.g0(X3.l.E0(new w[]{e3, wVar2, wVar}));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new A(this);
    }

    @Override // G1.y
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f1819w;
        y f = (str == null || AbstractC2227e.H0(str)) ? null : f(str, true);
        if (f == null) {
            f = g(this.f1817u, this, false, null);
        }
        sb.append(" startDestination=");
        if (f == null) {
            String str2 = this.f1819w;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f1818v;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f1817u));
                }
            }
        } else {
            sb.append("{");
            sb.append(f.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", sb2);
        return sb2;
    }
}
