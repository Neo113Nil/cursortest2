package i4;

import com.google.android.gms.tasks.Task;
import d6.C0977k;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import n4.C1473g;
import n4.C1479m;
import n4.I;
import p6.AbstractC1539a;
import r4.AbstractC1575b;
import v4.r;

/* renamed from: i4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1269f extends D3.j {
    public final boolean equals(Object obj) {
        return (obj instanceof C1269f) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String q() {
        C1473g c1473g = (C1473g) this.f1725d;
        if (c1473g.isEmpty()) {
            return null;
        }
        return c1473g.A().f17173a;
    }

    public final C0977k r() {
        C1473g c1473g = (C1473g) this.f1725d;
        q4.l.f(c1473g);
        C0977k c0977k = new C0977k(5, false);
        c0977k.f12441b = (C1479m) this.f1723b;
        c0977k.f12442c = c1473g;
        return c0977k;
    }

    public final Task s(Object obj, r rVar) {
        C1473g c1473g = (C1473g) this.f1725d;
        q4.l.f(c1473g);
        new I(c1473g).g(obj);
        Object a2 = AbstractC1575b.a(obj);
        q4.l.e(a2);
        r a4 = AbstractC1539a.a(a2, rVar);
        q4.e h6 = q4.k.h();
        ((C1479m) this.f1723b).q(new RunnableC1268e(this, a4, h6, 0));
        return (Task) h6.f15857a;
    }

    @Override // D3.j
    public final String toString() {
        C1473g C3 = ((C1473g) this.f1725d).C();
        C1479m c1479m = (C1479m) this.f1723b;
        C1269f c1269f = C3 != null ? new C1269f(c1479m, C3) : null;
        if (c1269f == null) {
            return c1479m.f15447a.toString();
        }
        try {
            return c1269f.toString() + "/" + URLEncoder.encode(q(), "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e7) {
            throw new C1267d("Failed to URLEncode key: " + q(), e7);
        }
    }
}
