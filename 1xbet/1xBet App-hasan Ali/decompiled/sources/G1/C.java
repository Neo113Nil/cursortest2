package G1;

import java.util.ArrayList;
import o4.AbstractC2227e;
import r.S;

/* loaded from: classes.dex */
public final class C extends z {
    public final P f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1820g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P p5) {
        super(p5.b(AbstractC0136g.c(D.class)), null);
        kotlin.jvm.internal.l.f("provider", p5);
        this.f1821h = new ArrayList();
        this.f = p5;
        this.f1820g = "appR/navigator/home_portal";
    }

    public final B c() {
        int hashCode;
        B b3 = (B) super.a();
        ArrayList arrayList = this.f1821h;
        kotlin.jvm.internal.l.f("nodes", arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y yVar = (y) obj;
            if (yVar != null) {
                int i5 = yVar.f1969p;
                String str = yVar.f1970q;
                if (i5 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = b3.f1970q;
                if (str2 != null && kotlin.jvm.internal.l.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + yVar + " cannot have the same route as graph " + b3).toString());
                }
                if (i5 == b3.f1969p) {
                    throw new IllegalArgumentException(("Destination " + yVar + " cannot have the same id as graph " + b3).toString());
                }
                S s2 = b3.f1816t;
                y yVar2 = (y) s2.e(i5);
                if (yVar2 == yVar) {
                    continue;
                } else {
                    if (yVar.f1965l != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (yVar2 != null) {
                        yVar2.f1965l = null;
                    }
                    yVar.f1965l = b3;
                    s2.i(yVar.f1969p, yVar);
                }
            }
        }
        String str3 = this.f1820g;
        if (str3 == null) {
            if (this.f1973b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        if (str3 == null) {
            hashCode = 0;
        } else {
            if (str3.equals(b3.f1970q)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + b3).toString());
            }
            if (AbstractC2227e.H0(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            hashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        b3.f1817u = hashCode;
        b3.f1819w = str3;
        return b3;
    }
}
