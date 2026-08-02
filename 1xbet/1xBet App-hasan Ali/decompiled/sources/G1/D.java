package G1;

import A0.C0064w;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import r0.AbstractC2346c;

@N("navigation")
/* loaded from: classes.dex */
public class D extends O {

    /* renamed from: c, reason: collision with root package name */
    public final P f1822c;

    public D(P p5) {
        kotlin.jvm.internal.l.f("navigatorProvider", p5);
        this.f1822c = p5;
    }

    @Override // G1.O
    public final void d(List list, H h3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0140k c0140k = (C0140k) it.next();
            y yVar = c0140k.f1899l;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavGraph", yVar);
            B b3 = (B) yVar;
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            wVar.f17624k = c0140k.c();
            int i = b3.f1817u;
            String str = b3.f1819w;
            if (i == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i5 = b3.f1969p;
                sb.append(i5 != 0 ? String.valueOf(i5) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            y f = str != null ? b3.f(str, false) : (y) b3.f1816t.e(i);
            if (f == null) {
                if (b3.f1818v == null) {
                    String str2 = b3.f1819w;
                    if (str2 == null) {
                        str2 = String.valueOf(b3.f1817u);
                    }
                    b3.f1818v = str2;
                }
                String str3 = b3.f1818v;
                kotlin.jvm.internal.l.c(str3);
                throw new IllegalArgumentException(L1.a.n("navigation destination ", str3, " is not a direct child of this NavGraph"));
            }
            if (str != null) {
                if (!str.equals(f.f1970q)) {
                    w e3 = f.e(str);
                    Bundle bundle = e3 != null ? e3.f1957l : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) wVar.f17624k;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        wVar.f17624k = bundle2;
                    }
                }
                LinkedHashMap linkedHashMap = f.f1968o;
                if (X3.z.T(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList d5 = AbstractC0136g.d(X3.z.T(linkedHashMap), new C0064w(wVar, 2));
                    if (!d5.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + f + ". Missing required arguments [" + d5 + ']').toString());
                    }
                }
            }
            O b5 = this.f1822c.b(f.f1964k);
            C0143n b6 = b();
            Bundle c5 = f.c((Bundle) wVar.f17624k);
            E e5 = b6.f1922h;
            b5.d(AbstractC2346c.A(j3.i.l(e5.f1827a, f, c5, e5.h(), e5.f1840p)), h3);
        }
    }

    @Override // G1.O
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public B a() {
        return new B(this);
    }
}
