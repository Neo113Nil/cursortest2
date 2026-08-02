package E2;

import X3.v;
import X3.z;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.L;
import e2.C1930k;
import java.util.LinkedHashMap;
import n.C2138i;
import o0.C2202f;
import p4.AbstractC2277q;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1422a;

    /* renamed from: b, reason: collision with root package name */
    public c f1423b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1424c;

    /* renamed from: d, reason: collision with root package name */
    public C2138i f1425d;

    /* renamed from: e, reason: collision with root package name */
    public F2.d f1426e;
    public final v f;

    /* renamed from: g, reason: collision with root package name */
    public G2.e f1427g;

    /* renamed from: h, reason: collision with root package name */
    public final C2202f f1428h;
    public final LinkedHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1429j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1430k;

    /* renamed from: l, reason: collision with root package name */
    public final C1930k f1431l;

    /* renamed from: m, reason: collision with root package name */
    public F2.i f1432m;

    /* renamed from: n, reason: collision with root package name */
    public F2.g f1433n;

    /* renamed from: o, reason: collision with root package name */
    public L f1434o;

    /* renamed from: p, reason: collision with root package name */
    public F2.i f1435p;

    /* renamed from: q, reason: collision with root package name */
    public F2.g f1436q;

    public h(Context context) {
        this.f1422a = context;
        this.f1423b = H2.d.f2283a;
        this.f1424c = null;
        this.f1425d = null;
        this.f1426e = null;
        this.f = v.f6090k;
        this.f1427g = null;
        this.f1428h = null;
        this.i = null;
        this.f1429j = true;
        this.f1430k = true;
        this.f1431l = null;
        this.f1432m = null;
        this.f1433n = null;
        this.f1434o = null;
        this.f1435p = null;
        this.f1436q = null;
    }

    public final i a() {
        L l5;
        F2.i iVar;
        L g5;
        Object obj = this.f1424c;
        if (obj == null) {
            obj = k.f1461a;
        }
        Object obj2 = obj;
        C2138i c2138i = this.f1425d;
        c cVar = this.f1423b;
        Bitmap.Config config = cVar.f1410g;
        F2.d dVar = this.f1426e;
        if (dVar == null) {
            dVar = cVar.f;
        }
        F2.d dVar2 = dVar;
        G2.e eVar = this.f1427g;
        if (eVar == null) {
            eVar = cVar.f1409e;
        }
        G2.e eVar2 = eVar;
        C2202f c2202f = this.f1428h;
        y4.m d5 = c2202f != null ? c2202f.d() : null;
        if (d5 == null) {
            d5 = H2.e.f2285b;
        } else {
            Bitmap.Config config2 = H2.e.f2284a;
        }
        y4.m mVar = d5;
        LinkedHashMap linkedHashMap = this.i;
        p pVar = linkedHashMap != null ? new p(G4.d.M(linkedHashMap)) : null;
        if (pVar == null) {
            pVar = p.f1483b;
        }
        p pVar2 = pVar;
        c cVar2 = this.f1423b;
        boolean z3 = cVar2.f1411h;
        cVar2.getClass();
        c cVar3 = this.f1423b;
        b bVar = cVar3.i;
        b bVar2 = cVar3.f1412j;
        b bVar3 = cVar3.f1413k;
        AbstractC2277q abstractC2277q = cVar3.f1405a;
        AbstractC2277q abstractC2277q2 = cVar3.f1406b;
        AbstractC2277q abstractC2277q3 = cVar3.f1407c;
        AbstractC2277q abstractC2277q4 = cVar3.f1408d;
        L l6 = this.f1434o;
        Context context = this.f1422a;
        if (l6 == null) {
            Object obj3 = context;
            while (true) {
                if (obj3 instanceof InterfaceC0491u) {
                    g5 = ((InterfaceC0491u) obj3).g();
                    break;
                }
                if (!(obj3 instanceof ContextWrapper)) {
                    g5 = null;
                    break;
                }
                obj3 = ((ContextWrapper) obj3).getBaseContext();
            }
            if (g5 == null) {
                g5 = g.f1421e;
            }
            l5 = g5;
        } else {
            l5 = l6;
        }
        F2.i iVar2 = this.f1432m;
        if (iVar2 == null) {
            F2.i iVar3 = this.f1435p;
            if (iVar3 == null) {
                iVar3 = new F2.c(context);
            }
            iVar = iVar3;
        } else {
            iVar = iVar2;
        }
        F2.g gVar = this.f1433n;
        if (gVar == null && (gVar = this.f1436q) == null) {
            if (iVar2 instanceof F2.f) {
            }
            gVar = F2.g.f1533l;
        }
        F2.g gVar2 = gVar;
        C1930k c1930k = this.f1431l;
        n nVar = c1930k != null ? new n(G4.d.M((LinkedHashMap) c1930k.f16910l)) : null;
        if (nVar == null) {
            nVar = n.f1475l;
        }
        return new i(this.f1422a, obj2, c2138i, config, dVar2, this.f, eVar2, mVar, pVar2, this.f1429j, z3, false, this.f1430k, bVar, bVar2, bVar3, abstractC2277q, abstractC2277q2, abstractC2277q3, abstractC2277q4, l5, iVar, gVar2, nVar, new d(this.f1432m, this.f1433n, this.f1427g, this.f1426e), this.f1423b);
    }

    public h(i iVar, Context context) {
        this.f1422a = context;
        this.f1423b = iVar.f1460z;
        this.f1424c = iVar.f1438b;
        this.f1425d = iVar.f1439c;
        d dVar = iVar.f1459y;
        this.f1426e = dVar.f1417d;
        this.f = iVar.f;
        this.f1427g = dVar.f1416c;
        this.f1428h = iVar.f1443h.f();
        this.i = z.U(iVar.i.f1484a);
        this.f1429j = iVar.f1444j;
        this.f1430k = iVar.f1447m;
        this.f1431l = new C1930k(iVar.f1458x);
        this.f1432m = dVar.f1414a;
        this.f1433n = dVar.f1415b;
        if (iVar.f1437a == context) {
            this.f1434o = iVar.f1455u;
            this.f1435p = iVar.f1456v;
            this.f1436q = iVar.f1457w;
        } else {
            this.f1434o = null;
            this.f1435p = null;
            this.f1436q = null;
        }
    }
}
