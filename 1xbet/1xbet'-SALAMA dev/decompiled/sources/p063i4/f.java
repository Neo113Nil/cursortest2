package p063i4;

import D3.j;
import com.google.android.gms.tasks.Task;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p028d6.k;
import p098n4.C0934g;
import p098n4.C0940m;
import p098n4.I;
import p115p6.a;
import p120q4.e;
import p120q4.l;
import p127r4.b;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends j {
    public final boolean equals(Object obj) {
        return (obj instanceof f) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String q() {
        C0934g c0934g = (C0934g) this.f1725d;
        if (c0934g.isEmpty()) {
            return null;
        }
        return c0934g.A().f17179a;
    }

    public final k r() {
        C0934g c0934g = (C0934g) this.f1725d;
        l.f(c0934g);
        k kVar = new k(5, false);
        kVar.f12447b = (C0940m) this.f1723b;
        kVar.f12448c = c0934g;
        return kVar;
    }

    public final Task s(Object obj, r rVar) {
        C0934g c0934g = (C0934g) this.f1725d;
        l.f(c0934g);
        new I(c0934g).g(obj);
        Object objA = b.a(obj);
        l.e(objA);
        r rVarA = a.a(objA, rVar);
        e eVarH = p120q4.k.h();
        ((C0940m) this.f1723b).q(new e(this, rVarA, eVarH, 0));
        return (Task) eVarH.f15863a;
    }

    @Override // D3.j
    public final String toString() {
        C0934g c0934gC = ((C0934g) this.f1725d).C();
        C0940m c0940m = (C0940m) this.f1723b;
        f fVar = c0934gC != null ? new f(c0940m, c0934gC) : null;
        if (fVar == null) {
            return c0940m.f15453a.toString();
        }
        try {
            return fVar.toString() + "/" + URLEncoder.encode(q(), "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e7) {
            throw new d("Failed to URLEncode key: " + q(), e7);
        }
    }
}
